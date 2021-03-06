package com.rafi.LearnSpringBootWeb.services;

import java.util.List;

import com.rafi.LearnSpringBootWeb.model.Mahasiswa;

public interface MahasiswaService {
    List <Mahasiswa> listMahasiswa();
    Mahasiswa saveOrUpdate(Mahasiswa mahasiswa);
    Mahasiswa getIdMahasiswa(Integer id);
    void hapus(Integer id);
}