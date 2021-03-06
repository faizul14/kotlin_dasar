fun main() {
    //type type data number di kontlin
    var typeinteger: Int = 4 //type data yang sering di gunakan
    var typeByte: Byte = 12
    var typeshort: Short = 345
    var typelong: Long = 1_000_000L //jika memakai long dan nilainya kurang dari 2M maka akan di baca Integer maka dari itu kita tambahkan huruf L di ahir angkanya untuk memaksanya bertype long.
    println(typeinteger)
    println(typelong)

    //type data number Float dan double
    var typefloat: Float = 10.11F // di tambahkan huruf F di akhir angkanya
    var typedouble: Double = 874847.90884

    println(typefloat)
    println(typedouble)


    //literal
    var decimalLiteral: Int = 40
    var hexadecimalLiteral: Int = 0xFF // kalau hexadecimal di awali dengan 0x
    var binaryLiteral: Int = 0b0001  //kalau binary di awali dengan 0b
    println(hexadecimalLiteral)
    println(binaryLiteral)

    //underscore
    //berfungsi sebagai separator atau untuk memudahkan untuk membaca angka yang banyak
    //contoh
    var price: Long = 9_000_000_000
    println(price)

    //cara konversi type data ke type data tertentu
    typefloat = typeinteger.toFloat()
    println(typefloat)


}