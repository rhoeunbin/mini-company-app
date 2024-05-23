package com.rhonnbin.companyapp.service.team;

import com.rhonnbin.companyapp.domain.member.Member;
import com.rhonnbin.companyapp.domain.member.MemberRepository;
import com.rhonnbin.companyapp.domain.team.Team;
import com.rhonnbin.companyapp.domain.team.TeamRepository;
import com.rhonnbin.companyapp.dto.team.request.TeamCreateRequest;
import com.rhonnbin.companyapp.dto.team.response.TeamResponse;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class TeamService {
    private TeamRepository teamRepository;
    private MemberRepository memberRepository;

    public TeamService(TeamRepository teamRepository, MemberRepository memberRepository) {
        this.teamRepository = teamRepository;
        this.memberRepository = memberRepository;
    }

    // 팀 저장
    @Transactional
    public void saveTeam(TeamCreateRequest request) {
        teamRepository.save(new Team(request));
    }
//
//    @Transactional
//    public void addMemberToTeam(Long teamId, Member member) {
//        Team team = teamRepository.findById(teamId).orElseThrow(EntityNotFoundException::new);
//        team.addMember(member);
//        memberRepository.save(member);
//    }

    // 팀 조회
    @Transactional
    public List<TeamResponse> getTeams(){
        return teamRepository.findAll().stream()
                .map(TeamResponse::new)
                .collect(Collectors.toList());
    }
}
