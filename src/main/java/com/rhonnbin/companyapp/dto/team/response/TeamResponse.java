package com.rhonnbin.companyapp.dto.team.response;

public class TeamResponse {
    private Long id;
    private String name;
    private String manager;
    private int memberCount;

    public TeamResponse(Long id, String name, String manager, int memberCount) {
        this.id = id;
        this.name = name;
        this.manager = manager;
        this.memberCount = memberCount;
    }

    public Long getId() {
        return id;
    }

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
