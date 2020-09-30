package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.junit.Before;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;


public class JobTest {
    private Job test_job1;
    private Job test_job2;
    private Job constructor_job;
    private Job method_job1;
    private Job method_job2;
    private Job blank_line;
    private Job datanot_available;

    //variable + constructor

    @Before
    public void createJobObject () {
        test_job1 = new Job();
        test_job2 = new Job();
        constructor_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        method_job1 = new Job("Method 1" , new Employer ("LaunchCode"), new Location("Saint Louis"),new PositionType("Quality control"), new CoreCompetency("Persistence"));
        blank_line = new Job("Method 1" , new Employer ("LaunchCode"), new Location("Saint Louis"),new PositionType("Quality control"), new CoreCompetency("Persistence"));
        datanot_available = new Job("" , new Employer ("LaunchCode"), new Location("Saint Louis"),new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

    @Test
    public void testJobIdsAreNotEqual() {
        method_job2 = new Job("Method 1" , new Employer ("LaunchCode"), new Location("Saint Louis"),new PositionType("Quality control"), new CoreCompetency("Persistence"));
        int job1Id = test_job1.getId();
        int job2Id = test_job2.getId();

        assertFalse(job1Id == job2Id);

    }

    @Test
    public void testSettingJobId() {
        int job1Id = test_job1.getId();
        int job2Id = test_job2.getId();

        int difference = job2Id - job1Id;

        assertEquals( 1, difference, 1 );
    }


    @Test
    public void testJobConstructorSetsAllFields() {

        assertTrue(constructor_job instanceof Job);

        assertEquals(constructor_job.getName(), "Product tester");
        assertEquals(constructor_job.getEmployer().getValue(), "ACME");
        assertEquals(constructor_job.getLocation().getValue(), "Desert");
        assertEquals(constructor_job.getPositionType().getValue(), "Quality control");
        assertEquals(constructor_job.getCoreCompetency().getValue(), "Persistence");

        }

    @Test
    public void testJobsForEquality() {

        assertFalse(method_job1.equals(method_job2));

    }

    @Test
    public void containBlankLine() {

        char first = blank_line.toString().charAt(0);
        int lastNumber = (blank_line.toString().length()) -1;
        char last = blank_line.toString().charAt(lastNumber);


        assertEquals( "\n", Character.toString(first) );
        assertEquals( "\n", Character.toString(last) );

    }

    @Test
    public void dataNotAvailable() {


        String expected = "\n ID: " + "6" + "\n Name: Data not available"
                + "\n Employer: LaunchCode" + "\n Location: Saint Louis"
                + "\n Position Type: Quality control" + "\n Core Competency: Persistence" + "\n";

        assertEquals(expected, datanot_available.toString());

    }
}
