package ru.fors.ervo

/**
 * Useful things for groovy
 * @author Ervo Victor
 * @since 08.07.2014
 */
class GroovyUtil {
    /**
     * Stub
     */
    private GroovyUtil() { }

    /**
     * Letters that are acceptable in license plate
     */
    static final def LETTERS = "[ABEKMHOPCTYXАВЕКМНОРСТУХ]"

    /**
     * Reads text from the file
     * @param path Path to file
     * @return Text from file
     */
    static String readText(String path) {
        new FileReader(path).withReader { it.text }
    }
}