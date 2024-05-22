package com.rhonnbin.companyapp.controller.team;

import com.rhonnbin.companyapp.dto.team.request.TeamCreateRequest;
import com.rhonnbin.companyapp.dto.team.response.TeamResponse;
import com.rhonnbin.companyapp.service.team.TeamService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    // 팀 저장
    @PostMapping("/team")
    public void saveTeam(@RequestBody TeamCreateRequest request) {
        teamService.saveTeam(request);
    }

    // 팀 조회
    @GetMapping("/team")
    public List<TeamResponse> getTeams() {
        return teamService.getTeams();
    }
}
