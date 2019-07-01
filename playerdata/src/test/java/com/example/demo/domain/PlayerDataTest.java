package com.example.demo.domain;

import com.example.demo.repository.PlayerDataRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PlayerDataTest {

    @Autowired
    private PlayerDataRepository playerDataRepository;

    @Test
    public void test01(){
        playerDataRepository.save(PlayerData.builder().name("주드래곤").money(10000L).level(32).job("광부").experience(0d).build());
        assertThat(playerDataRepository.findByName("주드래곤").getName()).isEqualTo("주드래곤");
    }
}