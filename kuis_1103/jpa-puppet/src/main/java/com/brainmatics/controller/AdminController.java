/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainmatics.controller;

import com.brainmatics.entity.Admin;
import com.brainmatics.service.AdminService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(method = RequestMethod.POST)
    public Admin insert(@RequestBody Admin admin) {
        return adminService.insert(admin);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Admin update(@RequestBody Admin admin) {
        return adminService.update(admin);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return adminService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Admin getById(@PathVariable("id") Long id){
        return adminService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Admin> getAll(){
        return adminService.getAll();
    }
}
