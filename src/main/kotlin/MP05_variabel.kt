const val BAHASA: String = "KOTLIN"

fun main() {
    //varibel di bagi menjadi dua jenis yaitu
    //yang mutabel ( bisa di ubah isinya ) dan imutable ( yang isinya tidak bisa di ubah ) udah constan

    //var -> ini variable mutable
    var faezol: String = "nama"
    println(faezol)
    faezol = "nama lengkap" // bisa di ubah isinya

    //val -> ini variable imutable
    val umur: Int = 20
    // umur = 89 //ini tidak bisa di ubah nilainya karan imutable. cek dengan hapus tanda comenan di belakang umur

    //DAN TYPE VARIABLE CONSTANT
    //di tulis di luar function atau menjadi variable global
    //const val bahasa: String = "KOTLIN" //ini akan error karna di dalam function
    //lihat line 1 : tidak eror karna di luar function atau menjadi variabel global

    println(faezol)
    println(umur)
    println(BAHASA)
}