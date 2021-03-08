fun main() {
    // perulangan for pada array
    val names: Array<String> = arrayOf("faezol","padli","anis","obay","sandika","galih")
    var nilai = 0
    for (name in names){
        println("nama mahasiswa $name")
        nilai++
    }
    println("jumlah mahasiswa $nilai")

    //perulangang pada range
    for (data in 1..100){
        println("data ke $data")
    }
    for (data in 100 downTo 1){
        println("data ke $data")
    }

    //coba-coba
    var ukuranarray = names.size -1
    var i: Int = 0
    for (data in ukuranarray downTo 0){
        println("pada index ke $i = ${names.get(i)}")
        i++
    }

}