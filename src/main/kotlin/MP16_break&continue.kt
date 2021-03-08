fun main() {
    val data = arrayOf("faezol","padli","anis","obay","sandika","galih")
    for (cek in data){
        if (cek.equals("anis")){
            println("data di temukan. selesaikan systemnya!")
            break
        }else{
            println("pencarian.. .")
        }
    }

    var i = 1
    while (i <=50){
        if (i%2 == 0){
            continue
        }
        println("data ke $i")
        i++
    }
}