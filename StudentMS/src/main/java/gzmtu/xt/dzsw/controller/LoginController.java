package gzmtu.xt.dzsw.controller;

import gzmtu.xt.dzsw.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/student")
public class LoginController {
    @RequestMapping("/login.do")
    public ModelAndView login() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        return mav;
    }
    @RequestMapping("/logining.do")
    public ModelAndView logining(@RequestBody User user, HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (user.login()){
            session.setAttribute("USER_IN_SESSION",user);
            mav.setViewName("redirect:/student/home.do");
        }
        else {
            mav.addObject("statys","密码错误");
            mav.setViewName("login");
        }
        return mav;
    }
    @RequestMapping("/quit.do")
    public void quit(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        session.removeAttribute("USER_IN_SESSION");
    }
}
