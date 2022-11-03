package org.sda.generics.generichomework;

public class GenericExtendPerson <T extends Length> {

    private final T info;

    public GenericExtendPerson(T info) {
        this.info = info;
    }


    // getLength should be here

}
