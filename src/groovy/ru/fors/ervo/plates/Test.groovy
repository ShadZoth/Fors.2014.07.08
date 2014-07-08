package ru.fors.ervo.plates
/**
 * Test of some things
 * @author Ervo Victor
 * @since 08.07.2014
 */

assert !new LicencePlate("lol")
def normalPlate = new LicencePlate("c065mk|78")
println normalPlate
assert normalPlate
println normalPlate.region
assert normalPlate.region == Regions.instance.getNameOfRegion(78)
def regions = Regions.instance.regions
println regions
println regions[0].code
def taxiPlate = new LicencePlate("ao365|78")
assert taxiPlate
assert taxiPlate.region == Regions.instance.getNameOfRegion(78)
assert taxiPlate.type == Types.TAXI
def trailerPlate = new LicencePlate("ah7331|47")
assert trailerPlate
assert trailerPlate.region == Regions.instance.getNameOfRegion(47)
assert trailerPlate.type == Types.TRAILER
def motoPlate = new LicencePlate("8776|ae|64")
assert motoPlate
assert motoPlate.region == Regions.instance.getNameOfRegion(64)
assert motoPlate.type == Types.MOTO
def agroPlate = new LicencePlate("3733mm|55")
assert agroPlate
assert agroPlate.region == Regions.instance.getNameOfRegion(55)
assert agroPlate.type == Types.AGRO
println new LicencePlate("ao365|01").region