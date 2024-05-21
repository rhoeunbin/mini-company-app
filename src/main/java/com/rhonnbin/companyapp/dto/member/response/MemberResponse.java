package com.rhonnbin.companyapp.dto.member.response;

import com.rhonnbin.companyapp.domain.member.Member;

import java.time.LocalDate;

public class MemberResponse {
    private long id;
    private String name;
    private boolean role;
    private LocalDate birthday;

    public MemberResponse(long id, String name, boolean role, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.birthday = birthday;
    }

    public MemberResponse(Member member) {
        this.id = member.getId();
        this.name = member.getName();
        this.role = member.isRole();
        this.birthday = member.getBirthday();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isRole() {
        return role;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
