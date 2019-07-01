package com.example.demo.repository;

import com.example.demo.domain.PlayerData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerDataRepository extends JpaRepository<PlayerData, Long> {
    PlayerData findByName(String Name);
}
