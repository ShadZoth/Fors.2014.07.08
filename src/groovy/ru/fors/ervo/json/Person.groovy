package ru.fors.ervo.json

import groovy.transform.Immutable
import ru.fors.ervo.plates.LicencePlate

/**
 * Person with cars
 * @author Ervo Victor
 * @since 08.07.2014
 */
@Immutable
class Person {
    /**
     * Name of person
     */
    String name

    /**
     * Plates of cars of person
     */
    List<LicencePlate> cars
}
