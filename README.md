<p align="center">
    <a href="https://kotlinlang.org" target="_blank">
        <img src="https://upload.wikimedia.org/wikipedia/commons/7/74/Kotlin_Icon.png" width="300" alt="Kotlin Logo">
    </a>
</p>

---
# PraktikumPemogramanMobile2024
Ini adalah Repositori Mata Kuliah Praktikum Pemograman Mobile, pada kasus kali ini bahasa yang digunakan adalah Kotlin

---
PENJELASAN SINGKAT TENTANG BAHASA KOTLIN
Kotlin adalah bahasa pemrograman modern yang dikembangkan oleh JetBrains dan pertama kali dirilis pada tahun 2011. Kotlin dirancang untuk berjalan di atas Java Virtual Machine (JVM), sehingga bisa digunakan secara bersamaan dengan Java dalam satu proyek.
Kotlin semakin populer karena fleksibilitasnya dan kompatibilitasnya dengan ekosistem Java. Cocok untuk pemula maupun developer berpengalaman yang ingin beralih dari Java ke bahasa yang lebih modern. 🚀

---
Dalam Kotlin, terdapat dua cara untuk mendeklarasikan variabel, yaitu menggunakan val dan var.
- VAL Adalah : Variabel yang dideklarasikan dengan val tidak dapat diubah setelah nilai awalnya diberikan. Ini seperti final variable di Java.
    - contoh : fun main () {
  val nama: String = "Adan"
  nama = "Budi"
  Println(nama)

---
penjelasan : Output yang dihasilkan akan Eror mengapa? Karena val tidak bisa menerima nilai ketika nilai awalnya sudah ditentukan. maka kode yang benar adalah :

---
- VAR Adalah :Variabel yang dideklarasikan dengan var bisa diubah nilainya setelah deklarasi.
  - contoh : fun main () {
  var nama: String = "Adan"
  nama = "Budi"
  Println(nama)
    }

---
penjelasan : dari kode diatas bisa disimpulkan bahwa variabel nama bisa diubah karena menggunakan var, maka hasil output yang keluar dalah Budi.
