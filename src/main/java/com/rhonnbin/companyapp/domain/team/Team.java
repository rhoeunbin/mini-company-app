package com.rhonnbin.companyapp.domain.team;

import com.rhonnbin.companyapp.dto.team.request.TeamCreateRequest;
import jakarta.persistence.*;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String menager;

    private int memberCount;

    protected Team() {}

    public Team(TeamCreateRequest request) {
        this.name = request.getName();
        this.menager = request.getManager();
        this.memberCount = request.getMemberCount();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMenager() {
        return menager;
    }

    public int getMemberCount() {
        return memberCount;
    }
}
