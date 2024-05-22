package com.rhonnbin.companyapp.service.team;

import com.rhonnbin.companyapp.domain.team.Team;
import com.rhonnbin.companyapp.domain.team.TeamRepository;
import com.rhonnbin.companyapp.dto.team.request.TeamCreateRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TeamService {
    private TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    // 팀 저장
    @Transactional
    public void saveTeam(TeamCreateRequest request) {
        teamRepository.save(new Team(request));
    }
}
