package com.rhonnbin.companyapp.domain.team;

import com.rhonnbin.companyapp.domain.member.Member;
import com.rhonnbin.companyapp.dto.team.request.TeamCreateRequest;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Member> members = new ArrayList<>();

    private String teamName;

    private String manager;

    @Column(nullable = false, columnDefinition = "int default 0")
    private int memberCount;

    protected Team() {}

    public Team(String teamName, String manager, int memberCount) {
        this.teamName = manager;
        this.manager = manager;
        this.memberCount = memberCount;
    }

    public Team(TeamCreateRequest request) {
        this.teamName = request.getTeamName();
        this.manager = request.getManager();
        this.memberCount = request.getMemberCount();
    }

    public Long getId() {
        return id;
    }

    public String getTeamName() {
        return teamName;
    }

    public List<Member> getMembers() {
        return members;
    }

    public String getManager() {
        return manager;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public void addMember(Member member) {
        members.add(member);
        member.setTeam(this);
        memberCount++;
        updateManagerStatus();
    }

    public void setManager(String manager) {
        this.manager = manager;
        updateManagerStatus();
    }

    public void updateManagerStatus() {
        for (Member member : members) {
            if (member.getName().equals(this.manager)) {
                member.setRole(true);
            } else {
                member.setRole(false);
            }
        }
    }
}
