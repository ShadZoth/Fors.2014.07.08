package ru.fors.ervo.plates

import groovy.transform.ToString

/**
 * License plate of a car.
 * @author Ervo Victor
 * @since 08.07.2014
 */
@ToString
class LicencePlate {
    /**
     * Text on the plate
     */
    String plate

    /**
     * Type of vehicle
     */
    Types type

    /**
     * Region of registration
     */
    int region

    /**
     * Valid sign
     */
    boolean valid

    /**
     * Stub
     * @param plate
     */
    void setPlate(String plate) {
        def name = "Plate"
        throw new IllegalAccessException("$name is immutable")
    }

    /**
     * Stub
     * @param transit
     */
    void setTransit(boolean transit) {
        def name = "Transit"
        throw new IllegalAccessException("$name is immutable")
    }

    /**
     * Stub
     * @param region
     */
    void setRegion(int region) {
        def name = "Region"
        throw new IllegalAccessException("$name is immutable")
    }

    /**
     * Stub
     * @param valid
     */
    void setValid(boolean valid) {
        def name = "Valid"
        throw new IllegalAccessException("$name is immutable")
    }

    /**
     * Gets region
     * @return Text representation of a region
     */
    String getRegion() {
        return Regions.instance.getNameOfRegion(region)
    }

    boolean asBoolean() {
        return valid
    }

    /**
     * Creates a plate from its text
     * @param plate Text on the plate
     */
    LicencePlate(String plate) {
        plate = plate.toUpperCase()
        this.plate = plate
        for (def type : Types.values()) {
            def regexp = type.regex
            def (valid, region) = [false, 0]
            plate.find(regexp) { match, _region ->
                valid = match
                region = Integer.parseInt(_region)
            }
            if (valid) {
                this.valid = valid
                this.region = region
                this.type = type
            }
        }
    }
}
