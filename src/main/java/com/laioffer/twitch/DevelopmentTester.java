package com.laioffer.twitch;

import com.laioffer.twitch.external.TwitchService;
import com.laioffer.twitch.external.model.Clip;
import com.laioffer.twitch.external.model.Game;
import com.laioffer.twitch.external.model.Stream;
import com.laioffer.twitch.external.model.Video;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DevelopmentTester implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(DevelopmentTester.class);

    public DevelopmentTester() {

    }
    @Override
    public void run(ApplicationArguments args){

    }
}
