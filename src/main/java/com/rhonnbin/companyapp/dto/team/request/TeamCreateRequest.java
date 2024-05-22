package com.rhonnbin.companyapp.dto.team.request;

import java.time.LocalDate;

public class TeamCreateRequest {
    private String name;
    private String manager;
    private int memberCount;

    public String getName() {
        return name;
    }

    public String getManager() {
        return manager;
    }

    public int getMemberCount() {
        return memberCount;
    }
}
