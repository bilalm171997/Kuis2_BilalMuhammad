/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainmatics.service;

import com.brainmatics.entity.Member;
import com.brainmatics.repo.MemberRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Hendro Steven
 */
@Service("memberService")
@Transactional
public class MemberService {

    @Autowired
    private MemberRepo repo;

    public Member insertOrUpdate(Member member) {
        return repo.save(member);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public List<Member> findAll() {
        return repo.findAllMember();
    }

    public List<Member> findByAdmin(Long adminId) {
        return repo.findByAdmin(adminId);
    }

    public List<Member> findByName(String name) {
        return repo.findByName("%" + name + "%");
    }
}
