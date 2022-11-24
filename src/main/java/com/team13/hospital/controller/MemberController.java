package com.team13.hospital.controller;

import com.team13.hospital.domain.dto.MemberRequest;
import com.team13.hospital.domain.dto.MemberResponse;
import com.team13.hospital.domain.entity.Member;
import com.team13.hospital.service.MemberService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/members")
public class MemberController {
    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/{id}")
    public MemberResponse get(@PathVariable("id") Long id) {
        return memberService.findById(id);
    }

    @PostMapping("")
    // @RequestBody 어노테이션을 사용하면 form 태그가 사용이 안된다.
    public MemberResponse creat(@RequestBody MemberRequest memberRequest) {
        return memberService.creat(memberRequest);
    }
}
