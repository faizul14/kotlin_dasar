fun main() {
    //type data string mempunyai dua type yaitu dengan petik dua ( "" )
    var firstname: String = "faezol"
    var lastname: String = "padli"

    println(firstname)
    println(lastname)

    //type yang kedua yaitu dengan tiga petik ( """ """ ) . untuk bisa lebih dari satu baris
    var adress: String = """
        Jln.Qosim Hamdan RT 01 RW 00,
        Desa Senyiur,
        Kecmatan Keruak, Lombok Timur
        Nusa Tenggara Barat.
        """
    println(adress)

    var alamat: String = """
        >Jln.Qosim Hamdan RT 01 RW 00,
        >Desa Senyiur,
        >Kecmatan Keruak, Lombok Timur
        >Nusa Tenggara Barat.
        """.trimMargin(">") //function trimMargin() berfungsi untuk merapikan line seperti output pada                                        umumnya dan tanda > merupakan penanda awal line yang di rapikan dan                                             penanda awal ini bebas denga karakter apapun dan default penanda dari                                           function trimMargin() yaitu |
    println("======== ini pakek function trimMargin ==============")
    println(alamat)

    //Penggabungan dua type data string dalam satu line menggunakan string template
    //$ merupakan tanda yang di gunakan untuk template ekspresi sederhana, seperti mengakses variabel lain
    //${isi ekspresi} tanda yang di gunakan untuk template ekspresi yang kompleks

    var fulname: String = "Nama Lengkap saya:$firstname $lastname"
    println(fulname)
    fulname = "$firstname panjangnya:${firstname.length}"
    println(fulname)

}