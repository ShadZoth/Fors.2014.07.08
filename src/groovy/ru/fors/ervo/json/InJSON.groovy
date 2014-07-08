package ru.fors.ervo.json

import groovy.json.JsonBuilder
import ru.fors.ervo.plates.LicencePlate
/**
 * Writes info in JSON-file
 * @author Ervo Victor
 * @since 08.07.2014
 */

def users = [new Person("Ivanov",
        [new LicencePlate("c065mk|78"), new LicencePlate("ao365|78")]),
             new Person("Petrov",
                     [new LicencePlate("ah7331|47"),
                      new LicencePlate("8776|ae|64")]),
             new Person("Sidorov",
                     [new LicencePlate("3733mm|55")]),
             new Person("Ololloev",
                     [])]

JsonBuilder jsonBuilder = new JsonBuilder(users)

def out = new FileOutputStream("users.txt")
def writer = new PrintWriter(out)
jsonBuilder.writeTo(writer)
writer.close()
out.close()