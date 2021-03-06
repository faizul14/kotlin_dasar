fun main() {
    //Kotlin tidak menerima data null untuk mengantisipasi error Nullable
    //tetapi kotlin juga megnatisipasi dengan bisa memaksa menerima data null karna kotlin bisa berdampingan
    //dengan bahasa JAVA ( yang bisa menerima data nul ) dalam satu projek .

    //dengan menambahkan tanda ? di belakang type data maka variabel tsb dapat menerima data null
    var data: String? = null
    println(data)

    //NOTE
    //type data null tidak di anjurkan di pakai di bahasa kotlin

}