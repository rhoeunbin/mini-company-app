package com.rhonnbin.companyapp.domain.member;

import com.rhonnbin.companyapp.dto.member.request.MemberCreateRequest;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    @Column(nullable = false)
    private String name;
    private String teamName;
    private boolean role;
    private LocalDate birthday;
    private LocalDate workStartDate;

    protected Member() {
    }

    public Member(MemberCreateRequest request) {
        this.name = request.getName();
        this.teamName = request.getTeamName();
        this.role = request.isRole();
        this.birthday = request.getBirthday();
        this.workStartDate = request.getWorkStartDate();
    }

    public Long getId() {
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
