/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis2.repo;

import com.kuis2.entity.Aksesoris;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


/**
 *
 * @author Hendro Steven
 */
public interface AksesorisRepo extends CrudRepository<Aksesoris, Long>{
    
    @Query("select a from Aksesoris a")
    public List<Aksesoris> findAllAksesoris();
    
    @Query("select a from Aksesoris a where a.mobil.noseri= :noseri")
    public List<Aksesoris> findByMobil(@Param("noseri") Long noseri);
    
    @Query("select a from Aksesoris a where LOWER(a.nama) LIKE LOWER(:nama)")
    public List<Aksesoris> findByNama(@Param("nama") String nama);
}
