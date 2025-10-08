package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Kate";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "katelarrick";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f25-00");
        team.addMember("Divyani");
        team.addMember("Kate");
        team.addMember("Daniel");
        team.addMember("Derek");
        team.addMember("Sanjay");
        team.addMember("Samuel");
        team.addMember("Phill");
        return team;
    }
}
