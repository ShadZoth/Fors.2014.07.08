package ru.fors.ervo.plates

import groovy.json.JsonSlurper
import ru.fors.ervo.GroovyUtil
/**
 * Parses region names from file
 * @author Ervo Victor
 * @since 08.07.2014
 */
@Singleton
class Regions {
    /**
     * List of possible regions
     */
    def regions

    /**
     * Creates singleton instance
     */
    private Regions() {
        regions = new JsonSlurper().parseText(GroovyUtil
                .readText("json.txt"))
    }

    /**
     * Gets region name by its code
     *
     * @param n Code of region
     */
    String getNameOfRegion(int n) {
        for (def r : regions) {
            if (r.code == n) {
                return r.name
            }
        }
        return "Регион №$n"
    }
}
