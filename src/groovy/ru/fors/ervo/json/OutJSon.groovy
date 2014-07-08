package ru.fors.ervo.json

import groovy.json.JsonSlurper
import ru.fors.ervo.GroovyUtil

/**
 * Reads info from JSON-file
 * @author Ervo Victor
 * @since 08.07.2014
 */

String info = GroovyUtil.readText("users.txt")
new JsonSlurper().parseText(info).each {
    println "Person"
    println "\tName"
    println "\t\t${it.name}"
    println "\tCars"
    if (it.cars) {
        it.cars.each {
            println "\t\t${it.plate}"
            if (it.valid) {
                println "\t\t\t${it.type}"
                println "\t\t\t${it.region}"
            }
        }
    } else {
        println "\t\t---"
    }
}