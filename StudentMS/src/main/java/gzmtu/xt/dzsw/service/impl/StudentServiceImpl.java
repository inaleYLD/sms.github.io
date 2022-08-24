package gzmtu.xt.dzsw.service.impl;

import gzmtu.xt.dzsw.dao.StudentDAO;
import gzmtu.xt.dzsw.entity.Student;
import gzmtu.xt.dzsw.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDAO studentDAO;
    public List<Student> listStudent(int start,int pageSize){
        return studentDAO.select(start,pageSize);
    }
    public int insertStudent(Student student){
        return studentDAO.insert(student);
    }
    public int deleteStudentById(String sid){
        return studentDAO.delete(sid);
    }
    public int updateStudent(Student student){
        return studentDAO.update(student);
    }
    public int getCountStudent(){
        return studentDAO.getCount();
    }
}
