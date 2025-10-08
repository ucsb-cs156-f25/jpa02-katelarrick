package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;
    Team t1;
    Team t2;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    // same object
    @Test
    void equals_sameObject_isTrue() {
        team = new Team("Test");
        assertTrue(team.equals(team));
    }

    // different class
    @Test
    void equals_differentClass_isFalse() {
        team = new Team("Test");
        Object o = "not a team";
        assertFalse(team.equals(o));
    }

    // T: name = T, members = T
    @Test
    void equals_sameName_sameMembers_isTrue() {
        t1 = new Team("Test");
        t2 = new Team("Test");
        t1.addMember("Kate");
        t2.addMember("Kate");
        assertTrue(t1.equals(t2));
        // symmetry
        assertTrue(t2.equals(t1));
    }

    // F: name = T, members = F
    @Test
    void equals_sameName_diffMembers_isFalse() {
        Team t1 = new Team("Test");
        t1.addMember("Kate");
        Team t2 = new Team("Test");
        t2.addMember("Divy");
        assertFalse(t1.equals(t2));
        assertFalse(t2.equals(t1));
    }

    // F: name = F, members = T
    @Test
    void equals_diffName_sameMembers_isFalse() {
        Team t1 = new Team("Test1");
        t1.addMember("Kate");
        Team t2 = new Team("Test2");
        t2.addMember("Kate");
        assertFalse(t1.equals(t2));
        assertFalse(t2.equals(t1));
    }

    // F: name = F, members = F
    @Test
    void equals_diffName_diffMembers_isFalse() {
        Team t1 = new Team("Test1");
        t1.addMember("Kate");
        Team t2 = new Team("Test2");
        t2.addMember("Divy");
        assertFalse(t1.equals(t2));
        assertFalse(t2.equals(t1));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    void testhash() {
        int result = team.hashCode();
        int expectedResult = -1226298695;
        assertEquals(expectedResult, result);
    }

}