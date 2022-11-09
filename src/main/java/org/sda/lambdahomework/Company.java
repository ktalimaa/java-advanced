package org.sda.lambdahomework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * List containing elements for type String.
 *
 * @author Kristel Talimaa
 */

@AllArgsConstructor
@Getter
@ToString
public class Company {
    private String companyName;
    private String field;
    private int numberOfWorkforce;

    public Company() {

    }

    public boolean isBigCompany() {
        return numberOfWorkforce >= 250;
    }
}
