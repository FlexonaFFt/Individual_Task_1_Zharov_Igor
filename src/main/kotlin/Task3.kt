fun main(args: Array<String>) {
    println("Введите диапазон:")
    println("Число a: ")
    val a = readLine().toString().toInt()
    println("Число b: ")
    val b = readLine().toString().toInt()
    println("Введите число, для которое необходимо проверить: ")
    val numb = readLine().toString().toInt()

    if (numb !in a..b) {
        println("Число $numb не входит в диапазон чисел от $a до $b")
    } else {
        println("Число $numb входит в диапазон чисел от $a до $b")
    }
}