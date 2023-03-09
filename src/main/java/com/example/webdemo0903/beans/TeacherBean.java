package com.example.webdemo0903.beans;

import com.example.webdemo0903.dao.TeacherDao;
import com.example.webdemo0903.entities.Teacher;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class TeacherBean implements Serializable {

    @EJB
    private TeacherDao teacherDao;

    public List<Teacher> getTeachers() {
        return teacherDao.findAll();
    }
}
