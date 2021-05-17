package com.dao;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;

import com.bean.Student;
 
  
public class StudentDao {  
JdbcTemplate template;  
  
public void setTemplate(JdbcTemplate template) {  
    this.template = template;  
}  
public int save(Student p){  
    String sql="insert into student(sname,subject1,subject2,subject3,subject4,total,grade) values('"+p.getSname()+"','"+p.getSubject1()+"','"+p.getSubject2()+"','"+p.getSubject3()+"','"+p.getSubject4()+"','"+p.getTotal()+"', '"+p.getGrade()+"')";  
    return template.update(sql);  
}  
public int update(Student p){  
    String sql="update student set name='"+p.getSname()+"', Maths="+p.getSubject1()+", Physics ='"+p.getSubject2()+", Chemistry='"+p.getSubject3()+", English='"+p.getSubject4()+", Total='"+p.getTotal()+", Grade='"+p.getGrade()+"' where id="+p.getSid()+"";  
    return template.update(sql);  
}  
public int delete(int sid){  
    String sql="delete from student where sid="+sid+"";  
    return template.update(sql);  
}  
public Student getEmpById(int sid){  
    String sql="select * from student where sid=?";  
    return template.queryForObject(sql, new Object[]{sid},new BeanPropertyRowMapper<Student>(Student.class));  
}  
public List<Student> getStudents(){  
    return template.query("select * from student",new RowMapper<Student>(){  
        public Student mapRow(ResultSet rs, int row) throws SQLException {  
        	Student e=new Student();  
            e.setSid(rs.getInt(1));  
            e.setSname(rs.getString(2));  
            e.setSubject1(rs.getInt(3));  
            e.setSubject2(rs.getInt(4));
            e.setSubject3(rs.getInt(5));
            e.setSubject4(rs.getInt(6));
            e.setTotal(rs.getFloat(7));
            e.setGrade(rs.getString(8));
           
            
            return e;  
        }  
    });  
}  
}  