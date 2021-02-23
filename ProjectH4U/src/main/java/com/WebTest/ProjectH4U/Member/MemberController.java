package com.WebTest.ProjectH4U.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/member")
public class MemberController {

    //MemberService memberService = new MemberService();
    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping
    public Member getMember(){
        return memberService.getMember();
    }

//    @RequestMapping(path = "/add")
//    public String add(){
//        System.out.println("Hello.....");
//        return "";
//    }
}
