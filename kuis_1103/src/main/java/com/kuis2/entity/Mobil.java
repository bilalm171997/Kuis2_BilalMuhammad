/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis2.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "mobil_1103")
public class Mobil implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noseri;
    @Column(length = 100, nullable = false, unique = true)
    private String nama;
    @Column(length = 100, nullable = true)
    private String merk;
    @Column(length = 100, nullable = true)
    private String tipe;
  
    @OneToMany
    @JoinColumn(name = "noseri")
    private Set<Aksesoris> aksesoris;
   
    public Long getNoseri() {
        return noseri;
    }

    public void setNoseri(Long noseri) {
        this.noseri = noseri;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    
}
