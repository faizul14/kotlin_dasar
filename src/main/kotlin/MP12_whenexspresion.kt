fun main() {

    val data = "A"
    when(data){
        "A" -> println("Amazing")
        "B" ->{
            println("good")
        }
        "C" ->{
            println("not bad")
        }
        else ->{
            println("coba lagi minggu depan")
        }
    }

    //when exspression group
    when(data){
        "A","B","C" -> {
            println("selamat anda lulus")
        }
        else -> {
            println("anda tidak lulus")
        }
    }

    // when exspression in
    //intuk mengecek data di dalam array,range atau sejenisnya
    var nilaisaya = 90
    val nilai: Array<Int> = arrayOf(70,75,80,85,90)
    when (nilaisaya){
        in nilai -> {
            println("selamat anda lulus")
        }
        !in nilai ->{
            println("anda tidak lulus")
        }
    }

    //when exspression is
    //untuk menegecek type data
    val nama: String = "faezol padli"
    when(nama){
        is String -> println("type datanya string")
        !is String -> println("type datanya bukan string")
    }

    //when exspression kompleks atau bisa seperti if exspression
    nilaisaya = 87
    when{
        nilaisaya >=90 && nilaisaya <= 100 -> println("Grade A")
        nilaisaya >=80 && nilaisaya < 90 -> println("Grade B")
        nilaisaya >=70 && nilaisaya < 80 -> println("Grade C")
        else -> {
            println("Grade D")
            println("anda tidak lulus -_")
        }
    }

}