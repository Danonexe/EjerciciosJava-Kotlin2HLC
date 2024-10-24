import kotlin.math.pow
import kotlin.random.Random

fun main() {
    var Ejercicio: Int
    do {
        println("Escribe el número de ejercicio que quieres ver, escribe 0 si quieres salir")
        Ejercicio = readLine()!!.toInt()

        // Ejercicio1
        if (Ejercicio == 1) {
            println("Escribe tu nombre")
            val nombre = readLine()!!
            println("Hola $nombre")
        }

        // Ejercicio2
        if (Ejercicio == 2) {
            println("Escribe un número")
            val numero = readLine()!!.toInt()
            if (numero % 2 == 0) {
                println("Es un número par")
            } else {
                println("Es un número impar")
            }
        }

        // Ejercicio3
        if (Ejercicio == 3) {
            println("Escribe el RADIO de un círculo")
            val radio = readLine()!!.toDouble()
            println("El área del círculo es ${Math.PI * radio.pow(2)}")
        }

        // Ejercicio4
        if (Ejercicio == 4) {
            val numeroAleatorio = Random.nextInt(1, 101)
            var numeroIntento: Int
            var intento = 0
            do {
                intento++
                println("Intenta adivinar el número")
                numeroIntento = readLine()!!.toInt()
                when {
                    numeroIntento < numeroAleatorio -> println("El número es mayor")
                    numeroIntento > numeroAleatorio -> println("El número es menor")
                    else -> println("Lo adivinaste, solo te ha costado $intento intentos")
                }
            } while (numeroIntento != numeroAleatorio)
        }

        // Ejercicio5
        if (Ejercicio == 5) {
            println("Escribe un número para ver su tabla de multiplicar")
            val numeroMultiplicar = readLine()!!.toInt()
            for (i in 1..10) {
                println("$numeroMultiplicar * $i = ${numeroMultiplicar * i}")
            }
        }

        // Ejercicio6
        if (Ejercicio == 6) {
            println("Todos los números sumados del 1 al 100")
            var resultado = 0
            for (i in 1..100) {
                resultado += i
            }
            println("El resultado es $resultado")
        }

        // Ejercicio7
        if (Ejercicio == 7) {
            println("Escribe algo")
            val cadena = readLine()!!
            val invertida = cadena.reversed()
            println("Al revés es: $invertida")
        }

        // Ejercicio8
        if (Ejercicio == 8) {
            println("Escribe algo")
            val cadenaAEIOU = readLine()!!.lowercase()
            val cuenta = cadenaAEIOU.count { it in "aeiou" }
            println("Tiene $cuenta vocales")
        }

        // Ejercicio9
        if (Ejercicio == 9) {
            println("Escribe un número")
            val numeroPrimo = readLine()!!.toInt()
            val divisores = (1..numeroPrimo).count { numeroPrimo % it == 0 }
            if (divisores == 2) {
                println("Es primo")
            } else println("No es primo")
        }

        // Ejercicio10
        if (Ejercicio == 10) {
            println("Escribe una temperatura")
            val numeroTemperatura = readLine()!!.toInt()
            println("Si fuesen grados Celsius, serían ${(numeroTemperatura * 9 / 5 + 32)} Fahrenheit")
            println("Si fuesen grados Fahrenheit, serían ${((numeroTemperatura - 32) * 5 / 9)} Celsius")
        }

        // Ejercicio11
        if (Ejercicio == 11) {
            println("Escribe los números que quieras ver de la secuencia de Fibonacci")
            val numeroFibonacci = readLine()!!.toInt()
            var Fibonacci1 = 1
            var Fibonacci2 = 1
            println(1)
            println(1)
            for (i in 3..numeroFibonacci) {
                val siguienteFibonacci = Fibonacci1 + Fibonacci2
                println(siguienteFibonacci)
                Fibonacci1 = Fibonacci2
                Fibonacci2 = siguienteFibonacci
            }
        }

        // Ejercicio12
        if (Ejercicio == 12) {
            println("Escribe un número")
            val cadena = readLine()!!
            val invertida = cadena.reversed()
            println("Al revés es: $invertida")
        }

        // Ejercicio13
        if (Ejercicio == 13) {
            val anime = Anime("Dragon Ball Z", 120, "Peleas")
            println(anime)
        }

        // Ejercicio14
        if (Ejercicio == 14) {
            var MenuInventario: Int
            val inventario = ArrayList<Videojuego>()
            do {
                println("Escribe qué quieres hacer en tu inventario")
                println("1 Crear videojuego")
                println("2 Borrar videojuego")
                println("3 Ver inventario de videojuegos")
                println("0 Salir del Menú")
                MenuInventario = readLine()!!.toInt()

                if (MenuInventario == 1) {
                    println("Escribe el título")
                    val titulo = readLine()!!
                    println("Escribe la plataforma")
                    val plataforma = readLine()!!
                    println("Escribe las horas jugadas")
                    val horasJugadas = readLine()!!.toInt()
                    val videojuego = Videojuego(titulo, plataforma, horasJugadas)
                    inventario.add(videojuego)
                }

                if (MenuInventario == 2) {
                    if (inventario.isEmpty()) {
                        println("El inventario está vacío.")
                    } else {
                        println("Inventario de videojuegos:")
                        for ((indice, vj) in inventario.withIndex()) {
                            println("${indice + 1} $vj")
                        }
                        println("¿Cuál quieres borrar?")
                        val index = readLine()!!.toInt()
                        inventario.removeAt(index - 1)
                    }
                }

                if (MenuInventario == 3) {
                    if (inventario.isEmpty()) {
                        println("El inventario está vacío.")
                    } else {
                        println("Inventario de videojuegos:")
                        for ((indice, vj) in inventario.withIndex()) {
                            println("${indice + 1} $vj")
                        }
                    }
                }
            } while (MenuInventario != 0)
        }

    } while (Ejercicio != 0)
    println("Ejercicio realizado por Daniel Hernández Gómez")
}
