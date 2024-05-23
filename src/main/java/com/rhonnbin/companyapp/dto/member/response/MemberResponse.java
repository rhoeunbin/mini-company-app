package com.rhonnbin.companyapp.dto.member.response;

import com.rhonnbin.companyapp.domain.member.Member;

import java.time.LocalDate;

public class MemberResponse {
    private long id;
    private String name;
    private String teamName;
    private boolean role;
    private LocalDate birthday;
    private LocalDate workStartDate;

    public MemberResponse(long id, String name, String teamName, boolean role, LocalDate birthday, LocalDate workStartDate) {
        this.id = id;
        this.name = name;
        this.teamName = teamName;
        this.role = role;
        this.birthday = birthday;
        this.workStartDate = workStartDate;
    }

    public MemberResponse(Member member) {
        this.id = member.getId();
        this.name = member.getName();
        this.teamName = getTeamName();
        this.role = true;
        this.birthday = member.getBirthday();
        this.workStartDate = member.getWorkStartDate();
    }

    public long getId() {
        return id;
    }

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

    public LocalDate getWorkStartDate() {
        return workStartDate;
    }
}

