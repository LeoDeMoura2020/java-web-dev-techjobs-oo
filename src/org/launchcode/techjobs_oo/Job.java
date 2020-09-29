package org.launchcode.techjobs_oo;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private String employer;
    private String location;
    private String positionType;
    private String coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location,
               PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    //if stat + output
    @Override
    public String toString() {

        String description =
                "\n ID: " + id + "\n Name: " + name + "\n Employer: " + employer + "\n Location: " + location +
                        "\n Position Type: " + positionType + "\n Core Competency: " + coreCompetency + "\n";

        if (name.equals("")) {
            name = "Data not available";
        }
        if (employer.equals("")) {
            employer = "Data not available";
        }
        if (location.equals("")) {
            location = "Data not available";
        }
        if (positionType.equals("")) {
            positionType = "Data not available";
        }
        if (coreCompetency.equals("")) {
            coreCompetency = "Data not available";
        }

        return description;


//        return "PositionType{" +
//                "value='" + value + '\'' +
//                '}';
//
//

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Job job = (Job) o;

        return id == job.id;
    }

    @Override
    public int hashCode() {
        return id;
    }



    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    //string.format
    //output all the ( iD , name etc)
    //blank first and last

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
