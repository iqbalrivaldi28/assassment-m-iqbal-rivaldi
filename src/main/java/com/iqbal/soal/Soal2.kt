package com.iqbal.soal

fun main() {
    print("Masukan Nilai Siswa: ")
    val inputNilai = readln().toIntOrNull()

    if (inputNilai != null){
        val statusSiswa = nilaiSiswa(inputNilai)
        println(statusSiswa)
    }else{
        println("Inputan Anda Salah")
    }
}


fun nilaiSiswa(nilai: Int): String {
    return if (nilai in 0..50){
        "Tidak Naik Kelas"
    } else if (nilai in 51..100){
        "Naik Kelas"
    } else{
        "Nilai Yang Angka inputkan Tidak Valid (0-100)"
    }
}