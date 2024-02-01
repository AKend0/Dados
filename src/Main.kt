import kotlin.random.Random

fun main() {
    println("¡Bienvenido al juego de dados!")

    var continuarJuego = true

    while (continuarJuego) {
        println("Presiona 1 para lanzar los dados o 0 para salir:")
        val opcion = readLine()

        when (opcion) {
            "0" -> {
                println("¡Juego terminado!")
                continuarJuego = false
            }
            "1" -> {
                val resultadoDado = lanzarDado()
                println("El resultado del dado es: $resultadoDado")
            }
            else -> {
                println("Opción no válida. Por favor, selecciona 0 para salir o 1 para lanzar los dados.")
            }
        }
    }
}

fun lanzarDado(): Int {
    println("¡Los dados están girando!")
    // Simulamos el lanzamiento de un dado generando un número aleatorio del 1 al 6
    return Random.nextInt(1, 7)
}
