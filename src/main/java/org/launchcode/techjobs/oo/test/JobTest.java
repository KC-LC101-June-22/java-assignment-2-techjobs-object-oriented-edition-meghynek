package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;
import org.launchcode.techjobs.oo.Job;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", job3.getName());
        assertEquals("ACME", job3.getEmployer().getValue());
        assertEquals("Desert", job3.getLocation().getValue());
        assertEquals("Quality control", job3.getPositionType().getValue());
        assertEquals("Persistence", job3.getCoreCompetency().getValue());

        assertTrue(job3.getName().equals("Product tester"));
        assertTrue(job3.getEmployer().getValue().equals("ACME"));
        assertTrue(job3.getLocation().getValue().equals("Desert"));
        assertTrue(job3.getPositionType().getValue().equals("Quality control"));
        assertTrue(job3.getCoreCompetency().getValue().equals("Persistence"));
    }

    @Test
    public void testJobsForEquality(){
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    //System.out.println(job4.getId());
        Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       // System.out.println(job5.getId());
    assertFalse(job4.getId() == (job5.getId()));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String realOutput = job4.toString();
        String expectedOutput = "\n" +
                "ID: 1" + "\n" +
                "Name: Product tester" + "\n" +
                "Employer: ACME" + "\n" +
                "Location: Desert" + "\n" +
                "Position Type: Quality control" + "\n" +
                "Core Competency: Persistence" +
                "\n";
        assertEquals(expectedOutput, realOutput);
        assertEquals(realOutput.charAt(0), expectedOutput.charAt(0));
        assertEquals(realOutput.charAt(119), expectedOutput.charAt(119));

        assertTrue(realOutput.charAt(0) == (expectedOutput.charAt(0)));
        assertTrue(realOutput.charAt(119) == (expectedOutput.charAt(119)));

    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String realOutput = job4.toString();
        String expectedOutput = "\n" +
                "ID: 1" + "\n" +
                "Name: Product tester" + "\n" +
                "Employer: ACME" + "\n" +
                "Location: Desert" + "\n" +
                "Position Type: Quality control" + "\n" +
                "Core Competency: Persistence" +
                "\n";

        assertEquals(expectedOutput, realOutput);
        //System.out.println(job4.toString());
    }

    @Test
    public void testToStringHandlesEmptyField(){
       Job jobIncomplete = new Job("Web Developer", new Employer(""), new Location("StL"), new PositionType(""), new CoreCompetency("sup"));
       String realOutput = jobIncomplete.toString();
       String expectedOutput = "\n" +
                "ID: 1" + "\n" +
                "Name: Web Developer" + "\n" +
                "Employer: Data not available" + "\n" +
                "Location: StL" + "\n" +
                "Position Type: Data not available" + "\n" +
                "Core Competency: sup" +
                "\n";
       // System.out.println(realOutput);
       assertEquals(expectedOutput, realOutput);
    }
}
