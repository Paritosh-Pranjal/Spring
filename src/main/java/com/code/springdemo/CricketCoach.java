package com.code.springdemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class CricketCoach implements Coach{
    static final Logger logger = LoggerFactory.getLogger(CricketCoach.class);
    private FortuneService fortuneService;

    // add new fields for emailAddress and team
    private String emailAddress;
    private String team;

    // getter and setter methods
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
       logger.info("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        logger.info("CricketCoach: inside setter method - setTeam");
        this.team = team;
    }

    // create no-arg constructor
    public CricketCoach(){
        logger.info("CricketCoach: inside no-arg constructor");
    }

    // our setter method
    public void setFortuneService(FortuneService fortuneService) {
        logger.info("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bollowing for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
