/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainmatics.service;

import com.brainmatics.entity.Admin;
import com.brainmatics.repo.AdminRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Hendro Steven
 */
@Service("adminService")
@Transactional
public class AdminService {

    @Autowired
    private AdminRepo repo;

    public Admin insert(Admin admin) {
        return repo.save(admin);
    }
    
    public Admin update(Admin admin) {
        return repo.save(admin);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Admin getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Admin> getAll(){
        return repo.findAllAdmin();
    }
}
