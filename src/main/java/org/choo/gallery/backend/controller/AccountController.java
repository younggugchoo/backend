package org.choo.gallery.backend.controller;

import org.choo.gallery.backend.entity.Item;
import org.choo.gallery.backend.entity.Member;
import org.choo.gallery.backend.repostory.ItemRepository;
import org.choo.gallery.backend.repostory.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class AccountController {
    @Autowired
    MemberRepository memberRepository;

    @PostMapping("/api/account/login")
    public int login(@RequestBody Map<String, String> params){
        Member member = memberRepository.findByEmailAndPassword(params.get("email"), params.get("password"));
        if (member !=null )
        return member.getId();

        return 0;
    }

}
