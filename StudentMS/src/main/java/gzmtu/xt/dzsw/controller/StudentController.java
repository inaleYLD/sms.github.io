package gzmtu.xt.dzsw.controller;

import gzmtu.xt.dzsw.entity.*;
import gzmtu.xt.dzsw.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;
    private static String[] reqCache = new String[100];
    private static Integer reqCacheCounter = 0;

    @RequestMapping("/home.do")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home");
        return mav;
    }
    @RequestMapping("/listStudent.do")
    public ModelAndView listStudent(@RequestParam("page")int page){
        List<Student> students=studentService.listStudent(page*9,9);
        int pages = (studentService.getCountStudent())/9;
        int a=studentService.getCountStudent()%9==0?pages:pages++;
        ModelAndView mav=new ModelAndView();
        mav.addObject("students",students);
        mav.addObject("page",page+1);
        mav.addObject("pages",pages);
        mav.setViewName("studentlist");
        return mav;
    }
    @RequestMapping("/insertStudent.do")
    public void insertStudent(@RequestBody Student student, HttpServletResponse response){
        synchronized (this.getClass()) {
            if (!(Arrays.asList(reqCache).contains(student.getSid()))) {
                studentService.insertStudent(student);
            }
            if (reqCacheCounter >= reqCache.length)
                reqCacheCounter = 0;
            reqCache[reqCacheCounter] = student.getSid();
            reqCacheCounter++;
        }
    }
    @RequestMapping("/deleteStudentById.do")
    public void deleteStudentById(@RequestParam("sid") String sid, HttpServletResponse response){
        studentService.deleteStudentById(sid);
    }
    @RequestMapping("/updateStudent.do")
    public void updateStudent(@RequestBody Student student, HttpServletResponse response){
        studentService.updateStudent(student);
    }
}
