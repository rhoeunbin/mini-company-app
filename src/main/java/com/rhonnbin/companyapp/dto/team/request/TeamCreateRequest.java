package com.rhonnbin.companyapp.dto.team.request;

import java.time.LocalDate;

public class TeamCreateRequest {
    private String teamName;
    private String manager;
    private int memberCount;

    public String getManager() {
        return manager;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public void setMemberCount(int memberCount) {
        this.memberCount = memberCount;
    }
}
