fun main() {
    //array adalah type yang bisa menampung banyak data
    //array hanya bisa menampung satu type data saja

    val datanilai: Array<Int> = arrayOf(70,80,90)
    val datanama: Array<String> = arrayOf("faezol", "ezon", "padli", "iskandar")

    //NOTE operasi array
    //size = untuk mendapat panjang array
    //get(index) = mengambil data di posisi index tertentu
    //[index] = mengambil data di posisi index tertentu
    //set(index, value) = mengubah data di posisi index
    //[index]=value = mengubah data di posisi index

    println(datanilai.size)

    println(datanama.get(1))
    println(datanama[1])

    datanama.set(3, "Buairy")
    println(datanama.get(3))
    datanilai[1]= 50
    println(datanilai[1])

    //Array NULL
    //aray yang bisa menampung nilai null
    //dan tanpa harus di isi dulu nilainya
    val members: Array<String?> = arrayOfNulls(size = 10)
    println(members.get(3)) // ini akan bernilai null karna belum diisi
    members.set(3, "Husnul Buairy")
    println(members.get(3))



}