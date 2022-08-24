package gzmtu.xt.dzsw.service;

import gzmtu.xt.dzsw.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> listStudent(int start,int pageSize);
    int insertStudent(Student student);
    int deleteStudentById(String sid);
    int updateStudent(Student student);
    int getCountStudent();
}
