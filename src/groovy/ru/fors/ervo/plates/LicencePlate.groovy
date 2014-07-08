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
    final String plate

    /**
     * Type of vehicle
     */
    final Types type

    /**
     * Region of registration
     */
    final int region

    /**
     * Valid sign
     */
    final boolean valid

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
        def (rvalid, rregion, rtype) = [false, 0, null]
        for (def type : Types.values()) {
            def regexp = type.regex
            def (valid, region) = [false, 0]
            plate.find(regexp) { match, _region ->
                valid = match
                region = Integer.parseInt(_region)
            }
            if (valid) {
                rvalid = valid
                rregion = region
                rtype = type
            }
        }
        this.valid = rvalid
        this.region = rregion
        this.type = rtype
    }
}
