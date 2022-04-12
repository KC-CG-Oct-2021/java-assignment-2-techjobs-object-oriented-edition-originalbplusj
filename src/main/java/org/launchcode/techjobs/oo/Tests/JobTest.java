package org.launchcode.techjobs.oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

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

        assertEquals("ACME", newJob.getEmployer().toString());
        assertEquals("Desert", newJob.getLocation().toString());
        assertEquals("Quality control", newJob.getPositionType().toString());
        assertEquals("Persistence", newJob.getCoreCompetency().toString());

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
}