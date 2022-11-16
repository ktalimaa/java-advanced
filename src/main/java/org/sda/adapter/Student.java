package org.sda.adapter;

import java.util.Collection;
import java.util.Collections;

public interface Student {
    String getFullName();
    String getContactDetails();
    boolean isAdult();
    Collection<Integer> getResults();


}
