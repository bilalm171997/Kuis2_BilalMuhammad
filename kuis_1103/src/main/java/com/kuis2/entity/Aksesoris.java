/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis2.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "aksesoris_1103")
public class Aksesoris implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noseri_aksesoris;
    @Column(length = 100, nullable = false, unique = true)
    private String nama;
    @Column(length = 100, nullable = true)
    private String merk;
    @Column(length = 100, nullable = true)
    private String tipe;
    @Column
    private Long noseri;

   
    public Long getNoseriAksesoris() {
        return noseri_aksesoris;
    }

      public void setNoseriAksesoris(Long noseri_aksesoris) {
        this.noseri_aksesoris = noseri_aksesoris;
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

    
    public Long getNoseri() {
        return noseri;
    }

    public void setNoseri(Long noseri) {
        this.noseri = noseri;
    }
    
    
}
