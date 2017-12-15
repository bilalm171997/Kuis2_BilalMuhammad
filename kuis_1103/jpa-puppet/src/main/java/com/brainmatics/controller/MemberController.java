/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brainmatics.controller;

import com.brainmatics.entity.Member;
import com.brainmatics.service.MemberService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/member")
public class MemberController {
    
    @Autowired
    private MemberService memberService;
    
    @RequestMapping(method = RequestMethod.POST)
    public Member insertOrUpdate(@RequestBody Member member){
        return memberService.insertOrUpdate(member);
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Member> findAll(){
        return memberService.findAll();
    }
  
}
