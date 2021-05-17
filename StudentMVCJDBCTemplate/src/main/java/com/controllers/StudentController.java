package com.controllers;   
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Student;
import com.dao.StudentDao;  
@Controller  
public class StudentController {  
    @Autowired  
    StudentDao dao;//will inject dao from xml file  
      
    /*It displays a form to input data, here "command" is a reserved request attribute 
     *which is used to display object data into form 
     */  
    @RequestMapping("/studentform")  
    public String showform(Model m){  
    	m.addAttribute("command", new Student());
    	return "studentform"; 
    }  
    /*It saves object into database. The @ModelAttribute puts request data 
     *  into model object. You need to mention RequestMethod.POST method  
     *  because default request is GET*/  
    @RequestMapping(value="/save",method = RequestMethod.POST)  
    public String save(@ModelAttribute("student") Student student){  
        dao.save(student);  
        return "redirect:/viewstudent";//will redirect to viewemp request mapping  
    }  
    /* It provides list of employees in model object */  
    @RequestMapping("/viewstudent")  
    public String viewemp(Model m){  
        List<Student> list=dao.getStudents();  
        m.addAttribute("list",list);
        return "viewstudent";  
    }  
    /* It displays object data into form for the given id.  
     * The @PathVariable puts URL data into variable.*/  
    @RequestMapping(value="/editstudent/{sid}")  
    public String edit(@PathVariable int sid, Model m){  
    	Student student=dao.getEmpById(sid);  
        m.addAttribute("command",student);
        return "empeditform";  
    }  
    /* It updates model object. */  
    @RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public String editsave(@ModelAttribute("student") Student student){  
        dao.update(student);  
        return "redirect:/viewstudent";  
    }  
    /* It deletes record for the given id in URL and redirects to /viewemp */  
    @RequestMapping(value="/deleteemp/{sid}",method = RequestMethod.GET)  
    public String delete(@PathVariable int sid){  
        dao.delete(sid);  
        return "redirect:/viewstudent";  
    }   
}  