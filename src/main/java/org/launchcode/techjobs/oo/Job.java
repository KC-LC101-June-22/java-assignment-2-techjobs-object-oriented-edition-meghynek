package org.launchcode.techjobs.oo;

import java.util.ArrayList;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

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
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

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

    public String toString(){
        ArrayList<String> jobStuff = new ArrayList<>();

        jobStuff.add(String.valueOf(id));
        jobStuff.add(name);
        jobStuff.add(String.valueOf(employer));
        jobStuff.add(String.valueOf(location));
        jobStuff.add(String.valueOf(positionType));
        jobStuff.add(String.valueOf(coreCompetency));

        for (int i = 0; i < jobStuff.size(); i++){
            if (jobStuff.get(i) == ""){
                jobStuff.set(i, "Data not available");
            }
        }

        return '\n' +
                "ID: " +  jobStuff.get(0) + "\n" +
                "Name: " + jobStuff.get(1) + "\n" +
                "Employer: " + jobStuff.get(2) + "\n" +
                "Location: " + jobStuff.get(3) + "\n" +
                "Position Type: " + jobStuff.get(4) + "\n" +
                "Core Competency: " + jobStuff.get(5) +
                '\n';
        }
    }



// make array of the shit we need
// see if an empty thing gives us a null or something to catch in looping
// return "\n" + jobStuff;
//                "ID: " + getId() + "\n" +
//                "Name: " + getName() + "\n" +
//                "Employer: " + getEmployer() + "\n" +
//                "Location: " + getLocation() + "\n" +
//                "Position Type: " + getPositionType() + "\n" +
//                "Core Competency: " + getCoreCompetency() + "\n";


