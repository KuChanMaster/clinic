package com.swjd.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.swjd.exception.UserNotFoundException;
import com.swjd.mapper.StudentMapper;
import com.swjd.pojo.ResultPage;
import com.swjd.pojo.Student;
import com.swjd.pojo.StudentExample;
import com.swjd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper mapper;

    @Override
    public Student login(Integer id, String password) throws UserNotFoundException {
        StudentExample example=new StudentExample();
        StudentExample.Criteria criteria=example.createCriteria();

        criteria.andSnEqualTo(id);
        criteria.andPasswordEqualTo(password);

        List<Student> students=mapper.selectByExample(example);
        if(students==null||students.size()<=0){
              throw  new UserNotFoundException("id错误或用户你不存在");
        }
            return students.get(0);
    }

    @Override
    public ResultPage findAll(Integer currPage,Integer pageSize,Student student) {
        ResultPage page=new ResultPage();
        PageHelper.startPage(currPage,pageSize);
        StudentExample example=new StudentExample();
        StudentExample.Criteria criteria=example.createCriteria();
                if(student!=null){
                    if (student.getSn()!=null){
                        criteria.andSnEqualTo(student.getSn());
                    }
                    if(student.getSname()!=null&&student.getSname()!=""){
                        criteria.andSnameEqualTo("%"+student.getSname()+"%");
                    }
                    if(student.getCollege()!=null&&student.getCollege()!=""){
                        criteria.andCollegeEqualTo(student.getCollege());
                    }
                    if (student.getClassname()!=null&&student.getClassname()!=""){
                        criteria.andClassnameEqualTo(student.getClassname());
                    }
                }

        List<Student> students=mapper.selectByExample(example);
        PageInfo<Student> info=new PageInfo<Student>(students);

        page.setCurrPage(info.getPageNum());
        page.setPage(info.getPages());
        page.setPageList(info.getList());
        page.setPageSize(info.getPageSize());
        page.setTotal(info.getTotal());

        return page;
    }

    @Override
    public List<String> findCollege() {
        return mapper.selectCollege();
    }

    @Override
    public List<String> findClassName(String collegeName) {
        return mapper.selectClassName(collegeName);

    }

    @Override
    public void deleteStu(Integer id) {
        mapper.deleteByPrimaryKey(id);
    }

    @Override
    public void addStu(Student student) {
        mapper.insertSelective(student);
    }

    @Override
    public Student findById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateStu(Student student) {
        Student stu=findById(student.getSn());
        student.setPassword(stu.getPassword());
        mapper.updateByPrimaryKey(student);
    }
}
