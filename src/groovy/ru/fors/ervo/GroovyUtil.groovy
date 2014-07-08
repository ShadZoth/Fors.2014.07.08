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
     * @return Text from file in one line
     */
    static String readAllLinesToOneLine(String path) {
        def file = new File(path)
        def fin = new FileInputStream(file)
        def sin = new Scanner(fin)
        def res = ""
        while (sin.hasNext()) {
            res = res + sin.nextLine()
        }
        sin.close()
        fin.close()
        res
    }
}