package com.rhonnbin.companyapp.dto.member.request;

import java.time.LocalDate;

public class MemberCreateRequest {
    private String name;
    private String teamName;
    private boolean role;
    private LocalDate birthday;

    public String getName() {
        return name;
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean isRole() {
        return role;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
