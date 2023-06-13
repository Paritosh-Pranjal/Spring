package com.code.springdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrackCoach implements Coach {
    static final Logger logger = LoggerFactory.getLogger(TrackCoach.class);
    private  FortuneService fortuneService;

    public TrackCoach() {

    }

    public TrackCoach(FortuneService fortuneService)
    {
        this.fortuneService  = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: "+fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStuff(){
        logger.info("TrackCoach: inside method doMyStartupStuff");
    }

    // add a destory method
    public void doMyCleanupStuff(){
        logger.info("TrackCoach: inside method doMyCleanupStuff");
    }


}
