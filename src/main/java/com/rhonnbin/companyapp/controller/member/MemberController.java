package com.rhonnbin.companyapp.controller.member;

import com.rhonnbin.companyapp.domain.member.Member;
import com.rhonnbin.companyapp.domain.member.MemberRepository;
import com.rhonnbin.companyapp.dto.member.request.MemberCreateRequest;
import com.rhonnbin.companyapp.dto.member.response.MemberResponse;
import com.rhonnbin.companyapp.service.member.MemberService;
import org.springframework.web.bind.annotation.*;

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

    // 멤버를 특정 팀에 추가
    @PostMapping("/member/{teamId}")
    public void addMemberToTeam(@PathVariable Long teamId, @RequestBody Member member) {
        memberService.addMemberToTeam(teamId, member);
    }

    // 멤버 조회
    @GetMapping("/member")
    public List<MemberResponse> getMembers(){
        return memberService.getMembers();
    }
}
