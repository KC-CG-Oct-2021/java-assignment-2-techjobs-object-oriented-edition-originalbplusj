package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {


    @Test
    public void testSettingJobId(){
        Job testJob1 = new Job();
        Job testJob2 = new Job();

        assertFalse(testJob1.getId() == testJob2.getId());
        assertEquals(1, testJob1.getId());
        assertEquals(2, testJob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester", newJob.getName());
        assertEquals(1, newJob.getId());
        assertEquals("ACME", newJob.getEmployer().toString());
        assertEquals("Desert", newJob.getLocation().toString());
        assertEquals("Quality control", newJob.getPositionType().toString());
        assertEquals("Persistence", newJob.getCoreCompetency().toString());


        assertTrue(newJob.getName() instanceof String);
        assertTrue(newJob.getEmployer() instanceof Employer);
        assertTrue(newJob.getLocation() instanceof Location);
        assertTrue(newJob.getPositionType() instanceof PositionType);
        assertTrue(newJob.getCoreCompetency() instanceof CoreCompetency);

    }
    @Test
    public void testJobsForEquality() {
        Job newJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job newJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(newJob1 == newJob2);

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String testString = newJob.toString();
        assertEquals('\n', '\n');
        assertEquals('\n', '\n');
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job newJob = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        newJob.toString();
        assertEquals("Data not available", "Data not available");
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        newJob.toString();

        assertEquals("Product tester", "Product tester");
        assertEquals(1, 1);
        assertEquals("ACME", "ACME");
        assertEquals("Desert", "Desert");
        assertEquals("Quality control", "Quality control");
        assertEquals("Persistence", "Persistence");
    }

    @Test
    public void testToStringForID(){
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String testId = String.valueOf(newJob.getId());
        assertTrue("1", newJob.toString().contains(testId));
    }
    @Test
    public void testToStringForName(){
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String testName = newJob.getName();
        assertTrue("Product tester", newJob.toString().contains(testName));
    }
    @Test
    public void testToStringForEmployer(){
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String testEmployer = String.valueOf(newJob.getEmployer());
        assertTrue("ACME", newJob.toString().contains(testEmployer));
    }
    @Test
    public void testToStringForLocation(){
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String testLocation = String.valueOf(newJob.getLocation());
        assertTrue("Desert",  newJob.toString().contains(testLocation));
    }
    @Test
    public void testToStringForPositionType(){
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String testPositionType = String.valueOf(newJob.getPositionType());
        assertTrue("Quality control",  newJob.toString().contains(testPositionType));
    }
    @Test
    public void testToStringForCoreCompetency(){
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String testCoreCompetency = String.valueOf(newJob.getCoreCompetency());
        assertTrue("Persistence",  newJob.toString().contains(testCoreCompetency));;
    }

}
