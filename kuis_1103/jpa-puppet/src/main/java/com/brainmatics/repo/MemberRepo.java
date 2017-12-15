/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainmatics.repo;

import com.brainmatics.entity.Member;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


/**
 *
 * @author Hendro Steven
 */
public interface MemberRepo extends CrudRepository<Member, Long>{
    
    @Query("select m from Member m")
    public List<Member> findAllMember();
    
    @Query("select m from Member m where m.admin.id= :id")
    public List<Member> findByAdmin(@Param("id") Long id);
    
    @Query("select m from Member m where LOWER(m.name) LIKE LOWER(:name)")
    public List<Member> findByName(@Param("name") String name);
}
