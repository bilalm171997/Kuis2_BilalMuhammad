/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis2.service;

import com.kuis2.entity.Aksesoris;
import com.kuis2.repo.AksesorisRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author Hendro Steven
 */
@Service("aksesorisService")
@Transactional
public class AksesorisService {

    @Autowired
    private AksesorisRepo repo;

    public Aksesoris insertOrUpdate(Aksesoris aksesoris) {
        return repo.save(aksesoris);
    }

    public boolean delete(Long noseri) {
        repo.delete(noseri);
        return true;
    }

    public List<Aksesoris> findAll() {
        return repo.findAllAksesoris();
    }

    public List<Aksesoris> findByMobil(Long mobilNoseri) {
        return repo.findByMobil(mobilNoseri);
    }

    public List<Aksesoris> findByNama(String nama) {
        return repo.findByNama("%" + nama + "%");
    }
}
