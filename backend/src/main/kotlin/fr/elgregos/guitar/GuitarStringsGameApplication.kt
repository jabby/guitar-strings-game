package fr.elgregos.guitar

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class GuitarStringsGameApplication

fun main(args: Array<String>) {
    SpringApplication.run(GuitarStringsGameApplication::class.java, *args)
}
