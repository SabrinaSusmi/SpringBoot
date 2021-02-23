package com.WebTest.ProjectH4U.Member;

import org.springframework.stereotype.Service;

@Service
public class MemberService {

    public Member getMember(){
        return new Member("Susmi","s@gmail",23);
    }

}
