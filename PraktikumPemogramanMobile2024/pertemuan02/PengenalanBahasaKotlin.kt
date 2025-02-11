latihan 1 Membuat out put Hello Word
fun main () {
    println ("Hello word")
}

latihan 2 Fungsi Main
fun main (args: Array<String>) {
    println(args.contentToString())
}

latihan 3 Tipe Data dan Variabel
fun main () {
    var nama = "adan ahmad erlangga"
    println(nama)
}

fun main () {
    var nama: String ="Adan ahmad erlangga ganteng"
    println(nama)
}

fun main () {
    var Umur: Int = 25
    println(Umur)
}

Latihan 4 Peng-kondisian

fun main () {
    var umur : Int = 10
    if (umur >= 18) {
        println("Anda Sudah dewasa")
    } else {
        println("Hei kamu masih bocil")
    }
}


fun main () {
    var umur: Int = 10
    when (umur) {
        in 0..17 -> println("Anda masih bocil")
        else -> println("Anda sudah memasuki tahap dewasa")
    }
}

Latihan 5 Looping

fun main () {
    for (i in 1..10) {
        println(i)
    }
}


fun main () {
    //loop while
    var i = 1
    while (i <= 5) {
        println(i)
        i++
    }
}


fun main () {
    //loop do-while
    var i=0
    do {
        println (i)
        i++
    } while (i <= 5)
}

latihan 6 fungsi

fun main () {
    greeting("adan ahmad erlangga")
}

fun greeting(name: String) {
    println("Hello $name")
}

latihan 7 Lambada = Memungkinkan fungsi untuk diperlakukan sebagai variabel

fun main () {
    val greet = {name: String -> greeting(name) }
    greet("Adan Ahmad Erlangga ganteng sedunia")
}


fun greeting(name: String) {
    println("Hello $name")
}


















