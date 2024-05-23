package com.rhonnbin.companyapp.service.member;

import com.rhonnbin.companyapp.domain.member.Member;
import com.rhonnbin.companyapp.domain.member.MemberRepository;
import com.rhonnbin.companyapp.domain.team.Team;
import com.rhonnbin.companyapp.domain.team.TeamRepository;
import com.rhonnbin.companyapp.dto.member.request.MemberCreateRequest;
import com.rhonnbin.companyapp.dto.member.response.MemberResponse;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemberService {
    private final MemberRepository memberRepository;
    private final TeamRepository teamRepository;

    public MemberService(MemberRepository memberRepository, TeamRepository teamRepository) {
        this.memberRepository = memberRepository;
        this.teamRepository = teamRepository;
    }

    // 멤버 저장
    @Transactional
    public void saveMember(MemberCreateRequest request){
        memberRepository.save(new Member(request));
    }

    @Transactional
    public void addMemberToTeam(Long teamId, Member member) {
        Team team = teamRepository.findById(teamId).orElseThrow(EntityNotFoundException::new);
        team.addMember(member);
        member.setTeam(team);
        memberRepository.save(member);
    }

    // 멤버 조회
    @Transactional
    public List<MemberResponse> getMembers(){
        return memberRepository.findAll().stream()
                .map(MemberResponse::new)
                .collect(Collectors.toList());
    }
}
