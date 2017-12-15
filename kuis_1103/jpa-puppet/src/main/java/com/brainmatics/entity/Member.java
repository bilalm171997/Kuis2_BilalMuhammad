/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainmatics.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "tbl_member")
public class Member implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 150, nullable = false)
    private String name;
    private String password;
    @Column(length = 255, nullable = true)
    private String nohp;
    @ManyToOne
    private Admin admin;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the price to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the description
     */
    public String getNohp() {
        return nohp;
    }

    /**
     * @param nohp the description to set
     */
    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    /**
     * @return the category
     */
    public Admin getAdmin() {
        return admin;
    }

    /**
     * @param admin the category to set
     */
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    
    
}
