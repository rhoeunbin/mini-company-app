package com.rhonnbin.companyapp.controller.member;

import com.rhonnbin.companyapp.domain.member.MemberRepository;
import com.rhonnbin.companyapp.dto.member.request.MemberCreateRequest;
import com.rhonnbin.companyapp.dto.member.response.MemberResponse;
import com.rhonnbin.companyapp.service.member.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // 멤버 저장
    @PostMapping("/member")
    public void saveMember(@RequestBody MemberCreateRequest request) {
        memberService.saveMember(request);
    }

    // 멤버 조회
    @GetMapping("/member")
    public List<MemberResponse> getMembers(){
        return memberService.getMembers();
    }
}
