package com.example.purduehealthhub;

import java.util.Arrays;
import java.util.List;

public class KeywordChecker {
    private String careList;
    private String capsList;
    private String pushList;
    private String emergencyList;
    private List<String> careKeywords;
    private List<String> capsKeywords;
    private List<String> pushKeywords;
    private List<String> emergencyKeywords;
    public KeywordChecker() {
        careList = "care,confidential,anonymous,survival,survivor,support,report,sexual,dating,violence,harassment,consent,bystander,intervention,stalking,advocacy";
        capsList = "caps,counseling,psychological,services,wellness,therapy,therapist";
        pushList = "push,covid,covid-19,symptoms,vaccine,vaccinations,shot,flu,hospital";
        emergencyList = "emergency,911,overdose,fire";
    }
    public String findKeyword(String userInput) {
        careKeywords = Arrays.asList(careList.split(","));
        capsKeywords = Arrays.asList(capsList.split(","));
        pushKeywords = Arrays.asList(pushList.split(","));
        emergencyKeywords = Arrays.asList(emergencyList.split(","));
        if (careKeywords.contains(userInput)) {
            return "care";
        }
        else if (capsKeywords.contains(userInput)) {
            return "caps";
        }
        else if (pushKeywords.contains(userInput)) {
            return "push";
        }
        else if (emergencyKeywords.contains(userInput)) {
            return "emergency";
        }
        else {
            return "error";
        }
    }
}
