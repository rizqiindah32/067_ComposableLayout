package com.example.tutmasakmie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

fun main(){
    println("----Tutorial Memasak Mie----")
    Thread.sleep(3000)
    println("--------------------------")
    println("Persiapkan alat dan bahan")
    println("Ambil alat panci, piring, garpu, gunting, dan sendok")
    println("Siapkan mie")
    println("Isi panci dengan air")
    println("Letakkan panci di atas kompor")
    println("Nyalakan kompornya")
    println("Tunggu hingga air mendidih")
    println("Buka bungkus mie dengan gunting")
    println("Keluarkan mie, bumbu, lalu masukkan mie ke dalam panci")
    print("Apakah ingin memakai telor ? Y/N = ")
    val telor = readLine()
    if (telor == "Y" || telor == "y") {
        println("Ambil telor")
        println("Pecahkan telor lalu masukkan ke dalam panci")
    }
    println("Buka bumbunya dan tuangkan ke dalam piring")
    println("Tunggu sampai matang")
    Thread.sleep(3000)
    println("Angkat mie dan telor, kemudian tiriskan")
    println("Tuangkan mie dan telor ke dalam piring")
    println("Aduk hingga merata")
    println("--------------------------")
    println("MIE SUDAH SIAP DISAJIKAN :)")
}
