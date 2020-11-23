package com.rafi.LearnSpringBootWeb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.rafi.LearnSpringBootWeb.model.Mahasiswa;
import com.rafi.LearnSpringBootWeb.services.MahasiswaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MahasiswaDao implements MahasiswaService{
    private EntityManagerFactory emf;

    @Autowired
    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<Mahasiswa> listMahasiswa() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("from Mahasiswa", Mahasiswa.class).getResultList();
    }
}
