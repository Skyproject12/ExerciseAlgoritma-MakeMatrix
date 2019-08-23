import java.util.*

fun main (args : Array<String>){
    var r1=100
    var r2=100
    arrayDimensi(r1,r2)
}

fun arrayDimensi (r1:Int , r2:Int) {
    var scan = Scanner(System.`in`)
    var perulanganBaris = Array(r1) {
        IntArray(r2)
    }
    println("Masukkan Baris")
    var baris=scan.nextInt()
    println("Masukkan Kolon")
    var kolom=scan.nextInt()
    for(b in 1..baris){
        for(g in 1..kolom){
            print(perulanganBaris[b][g])
        }
        println()
    }
}