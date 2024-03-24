package com.iqbal.soal

fun main() {

    val himpunanA = setOf(2, 3, 4, 5, 7, 8)
    val himpunanB = setOf(1, 6, 8, 9, 10)

    // A n B
    val irisanHimpunan = himpunanA.intersect(himpunanB)
    println(himpunanA)
    println(himpunanB)
    println("Irisan A n B adalah: $irisanHimpunan")

    println()

    // A u B
    val unionHimpunan = himpunanA.union(himpunanB)
    println(himpunanA)
    println(himpunanB)
    println("Union A u B: ${unionHimpunan.sorted()}")

    println()

    // A To List
    val listHimpunanA = himpunanA.toList()
    println("List of Himpunan A : $listHimpunanA")

    println()

    // B To Array
    val arrayHimpunanB = himpunanB.toTypedArray()
    println("Array of Himpunan B: ${arrayHimpunanB.contentToString()}")

    println()

    // Map Of A to B
    val mapAandB = himpunanA.zip(himpunanB).toMap()
    println("Map of A to B: $mapAandB")
}

