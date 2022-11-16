package org.sda.adapter;

import java.util.Collection;

public class PupilAdapter implements Student {      // pupil adapter has to implement Student interface
    private Pupil pupil;        // object
    // constructor
    public PupilAdapter(Pupil pupil) {
        this.pupil = pupil;
    }

    // implementing methods manually, Student -> Pupil
    @Override
    public String getFullName() {
        return pupil.getFirstName() + " " + pupil.getLastName();
    }

    @Override
    public String getContactDetails() {
        return pupil.getEmail();
    }

    @Override
    public boolean isAdult() {
        return pupil.getAge() >= 18;     // when naming methods, use verb to start the method
    }

    @Override
    public Collection<Integer> getResults(){
        return pupil.getGrades();
    }



}
