package com.rhonnbin.companyapp.service.member;

import com.rhonnbin.companyapp.domain.member.Member;
import com.rhonnbin.companyapp.domain.member.MemberRepository;
import com.rhonnbin.companyapp.dto.member.request.MemberCreateRequest;
import com.rhonnbin.companyapp.dto.member.response.MemberResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // 멤버 저장
    @Transactional
    public void saveMember(MemberCreateRequest request){
        memberRepository.save(new Member(request));
    }
}
