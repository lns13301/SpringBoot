package com.example.demo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@NoArgsConstructor
@Table @Entity
public class PlayerData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long Id;

    @Column
    private String name;

    @Column
    private Integer level;

    @Column
    private Double experience;

    @Column
    private String job;

    @Column
    private Long money;

    @Builder

    public PlayerData(String name, Integer level, Double experience, String job, Long money) {
        this.name = name;
        this.level = level;
        this.experience = experience;
        this.job = job;
        this.money = money;
    }
}
