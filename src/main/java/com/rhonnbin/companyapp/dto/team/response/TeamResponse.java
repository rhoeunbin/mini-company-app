package com.rhonnbin.companyapp.dto.team.response;

import com.rhonnbin.companyapp.domain.team.Team;

public class TeamResponse {
    private Long id;
    private String teamName;
    private String manager;
    private int memberCount;

    public TeamResponse(Long id, String teamName, String manager, int memberCount) {
        this.id = id;
        this.teamName = teamName;
        this.manager = null;
        this.memberCount = memberCount;
    }

    public TeamResponse(Team team) {
        this.id = team.getId();
        this.teamName = team.getTeamName();
        this.manager = team.getManager();
        this.memberCount = team.getMemberCount();
    }

    public Long getId() {
        return id;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getManager() {
        return manager;
    }

    public int getMemberCount() {
        return memberCount;
    }
}
