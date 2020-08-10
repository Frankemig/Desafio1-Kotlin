package cl.sulcansystem.desafiounokotlin

fun main() {
    println("---------Item 3---------")
    // Item 3
    var nombre="Franklin Jiménez"
    println("Mi Nombre es: $nombre")
    println("---------Item 4---------")
    // Item 4
    var num_uno = 10
    var num_dos = 20
    var num_tres = 30
    println("Num_Uno = $num_uno \n Num_Dos = $num_dos \n Num_Tres = $num_tres")

    println("---------Item 5---------")

    var resultado = num_uno + num_dos + num_tres
    println("La Suma de $num_uno + $num_dos + $num_tres = $resultado ")

    println("---------Item 6---------")

    var cadena_uno: String
    var caracter: Char

    println("---------Item 7---------")

    cadena_uno = "Arataka Reigen"
    caracter = 'A'
    println("String: $cadena_uno \n Var: $caracter")

    println("---------Item 8---------")

    println(" El Número de Caracteres del String es Igual a: ${cadena_uno.length}")
    caracter = 'B'
    println(caracter)

    println("---------Item 9---------")

    var decima: Float

    println("---------Item 10---------")

    decima = 12.6f
println(decima)

    println("---------Item 11---------")
    var byte_maximo = Byte.MAX_VALUE
    var short_maximo = Short.MAX_VALUE
    println("El Valor Máximo de un Byte es Igual a: $byte_maximo \n El Valor Máximo de un Short es igual a: $short_maximo")

    println("---------Item 12---------")

    var int_maximo = Int.MAX_VALUE
    var long_maximo = Long.MAX_VALUE
    println("El Valor Máximo de un Int es Igual a: $int_maximo \n El Valor Máximo de un Long es Igual a: $long_maximo")

    println("---------Item 13---------")

    var boleano = true
    println(boleano)

    println("---------Item 14---------")
    imprimiendoParametros("Franklin", "Jiménez")

    println("---------Item 16---------")

iva(35)
}
fun imprimiendoParametros(param1:String, param2:String){

    println("La Cantidad de Caracteres de los Parámetros es Igual a: ${param1.length + param2.length}")

}

fun iva(valor:Int){
    println(valor/1.19*0.19)
}