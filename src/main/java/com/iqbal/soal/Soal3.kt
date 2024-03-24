package com.iqbal.soal

fun main() {
    println("-------------------------------------------------------------")
    println("Faktorial Nilai (Tidak Menghitung Nilai Yang Habis Di Bagi 3)")
    println("-------------------------------------------------------------")
    print("Masukan Nilai: ")
    val inputNilai = readln().toIntOrNull()

    if (inputNilai != null && inputNilai >=0){
        val hasil = recursionTask(inputNilai)
        println("Faktorial dari $inputNilai adalah: $hasil")
        println("Ket: Tidak Menghitung Nilai Yang Habis Dibagi 3")
    } else {
        println("Nilai Yang Anda Inputkan Tidak Valid")
    }
}

fun recursionTask(nilai: Int): Int{
     if (nilai == 0){
        return 1
    } else if (nilai % 3 == 0){
        return recursionTask(nilai - 1)
    }else{
        return nilai * recursionTask(nilai - 1  )
     }
}