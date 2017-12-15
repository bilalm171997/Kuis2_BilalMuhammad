/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis2.service;

import com.kuis2.entity.Mobil;
import com.kuis2.repo.MobilRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author Hendro Steven
 */
@Service("mobilService")
@Transactional
public class MobilService {

    @Autowired
    private MobilRepo repo;

    public Mobil insert(Mobil mobil) {
        return repo.save(mobil);
    }
    
    public Mobil update(Mobil mobil) {
        return repo.save(mobil);
    }
    
    public boolean delete(Long noseri){
        repo.delete(noseri);
        return true;
    }
    
    public Mobil getByNoseri(Long noseri){
        return repo.findOne(noseri);
    }
    
    public List<Mobil> getAll(){
        return repo.findAllMobil();
    }
}
