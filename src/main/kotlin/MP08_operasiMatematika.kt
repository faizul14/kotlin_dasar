fun main() {
    //operasi matematika
    // +
    // -
    // *
    // /
    // % sisa bagi

    val nilaiujian: Int = 90
    val nilaikehadiran: Int = 95

    val hasil: Int = nilaikehadiran * nilaiujian / 2
    println(hasil)

    //Operasi Augmented Assigment
    // a = a + 10 dalam augmented assigment a += 10
    //seperti itu juga dengan tanda operasi ( - , *, /, % )
    var nilai = 10

    nilai = nilai + 10 //dalam operasi matematika biasa
    println(nilai)
    nilai += 10 //dalam operasi augmented assigment
    println(nilai)

    //unary operator
    // a = a + 1 dalam unary operator a++ atau biasa di sebut increment
    // a = a - 1 dalam uanry operator a-- atau biasa di sebut decrment
    var a = 10
    a++
    println(a)
}