package ru.fors.ervo.plates

import ru.fors.ervo.GroovyUtil

import java.util.regex.Pattern
/**
 * Types of cars
 * @author Ervo Victor
 * @since 08.07.2014
 */
public enum Types {
    NORMAL(~/$GroovyUtil.LETTERS{1}\d{3}$GroovyUtil.LETTERS{2}\|(\d{2,3})/),
    TAXI(~/$GroovyUtil.LETTERS{2}\d{3}\|(\d{2,3})/),
    TRAILER(~/$GroovyUtil.LETTERS{2}\d{4}\|(\d{2,3})/),
    MOTO(~/\d{4}\|${GroovyUtil.LETTERS}{2}\|(\d{2,3})/),
    AGRO(~/\d{4}${GroovyUtil.LETTERS}{2}\|(\d{2,3})/)

    /**
     * Pattern for license plates
     */
    Pattern regex

    Types(def r) {
        regex = r
    }
}