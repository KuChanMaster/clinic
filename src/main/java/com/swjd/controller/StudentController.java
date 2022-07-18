package com.swjd.controller;
import com.swjd.pojo.ResultPage;
import com.swjd.pojo.Student;
import com.swjd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/findAll/{currPage}")
    @ResponseBody
    public ResultPage getStudentAll(@PathVariable("currPage") Integer currPage, Student student) {
        ResultPage page = studentService.findAll(currPage, 5, student);
        return page;
    }

    @RequestMapping("/college")
    @ResponseBody
    public List<String> getCollege() {
        return studentService.findCollege();
    }

    @RequestMapping("/classname/{collegeName}")
    @ResponseBody
    public List<String> getClassname(@PathVariable("collegeName") String collegeName) {

        return studentService.findClassName(collegeName);
    }

    @RequestMapping("/delete/{id}")
    @ResponseBody
    public String deleteStu(@PathVariable("id") Integer id) {
        try {
            studentService.deleteStu(id);
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
        return "ok";
    }

    @RequestMapping("/add")
    @ResponseBody
    public String addStu(Student student) {
//  System.out.println(student.getClassname() + " " + student.getCollege() + " " + student.getSname());
        try {
            student.setPassword("000000");
            studentService.addStu(student);
        } catch (Exception e) {
            return "fail";
        }
        return "ok";
    }
    @RequestMapping("/find/{id}")
    @ResponseBody
    public Student findStuById(@PathVariable("id")Integer id) {

        return studentService.findById(id);
    }
    @RequestMapping("/update")
    @ResponseBody
    public String updateStu(Student student){
        try {
            studentService.updateStu(student);
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
            return "ok";
    }
}