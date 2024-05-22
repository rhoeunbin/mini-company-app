package com.rhonnbin.companyapp.controller.team;

import com.rhonnbin.companyapp.dto.team.request.TeamCreateRequest;
import com.rhonnbin.companyapp.service.team.TeamService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
