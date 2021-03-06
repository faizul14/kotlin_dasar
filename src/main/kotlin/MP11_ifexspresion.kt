fun main() {
    //if exspresion yaitu jika dan hanya jika mempunyai satu kondisi saja
    val nilairata2: Int = 80
    if (nilairata2 >= 80){
       println("Selamat anda lulus ujian")
    }

    //else exspresion jika ada dua kondisi
    var katadoi: String = "iya"
    if (katadoi == "iya"){
        println("yuhu tidak jomblo lagi")
    }else{
        println("yah malah diem lagi, klok tidak suka ngomong dong -_")
    }

    //if else exspresion jika memiliki lebih dari dua kondisi
    katadoi = "saya masih trauma sama yang dulu"
    if (katadoi == "iya"){
        println("yuhuuuuuu ada pacar sekarang :)")
    }else if (katadoi == "tidak"){
        println("cinta di tolak, bajak sosmed bertindak. hehe ^-^")
    }else if (katadoi == "maaf ya kita temenan aja" || katadoi == "saya masih trauma sama yang dulu"){
        println("bulshit buaye betine -_ ")
        println("wkwkwk canda buaye")
    }else{
        println("bicara dalam hati : yah di tolak secara halus ini mah , dasar buaye betine")
    }
}