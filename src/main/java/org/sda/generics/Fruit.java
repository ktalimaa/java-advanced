package org.sda.generics;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Fruit class for Generic
 *
 * @author Kristel Talimaa
 */

@Data           // it's like getter and setter inside the class, lombok annotations
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Fruit implements Serializable {    // This class can be Serialized and Deserialized
    private String name;
    private String color;
    private BigDecimal price;

}
