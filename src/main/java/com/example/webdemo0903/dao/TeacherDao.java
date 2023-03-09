package com.example.webdemo0903.dao;

import com.example.webdemo0903.entities.Teacher;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Stateless
public class TeacherDao {
    @PersistenceContext
    private EntityManager em;

    public List<Teacher> findAll() {
        return em.createNamedQuery("Teacher.findAll", Teacher.class).getResultList();
    }
}
