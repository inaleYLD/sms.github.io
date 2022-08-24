package gzmtu.xt.dzsw.dao;

import gzmtu.xt.dzsw.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDAO {
    public int insert(Student student);
    public int delete(String sid);
    public int update(Student student);
    public List<Student> select(@Param("start") int start,@Param("pageSize") int pageSize);
    public int getCount();
}
