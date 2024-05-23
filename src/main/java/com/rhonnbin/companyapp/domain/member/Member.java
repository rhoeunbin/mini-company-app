package com.rhonnbin.companyapp.domain.member;

import com.rhonnbin.companyapp.domain.team.Team;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private Team team;
    // private String teamName;

    private boolean role;
    private LocalDate birthday;
    private LocalDate workStartDate;

    protected Member() {
    }

    public Member(Team team, String name, boolean role, LocalDate birthday, LocalDate workStartDate) {
        this.name = name;
        this.team = team;
        this.role = role;
        this.birthday = birthday;
        this.workStartDate = workStartDate;
    }

    public Member(MemberCreateRequest request) {
        this.name = request.getName();
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

    public Team getTeam() {
        return team;
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

    public void setTeam(Team team) {
        this.team = team;
    }

    public void setRole(boolean role) {
        this.role = role;
    }

    public String getTeamName() {
        return team != null ? team.getTeamName() : null;
    }
}
