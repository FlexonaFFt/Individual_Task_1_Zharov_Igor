fun main(args: Array<String>) {
    println("Введите любое трёхзначное число: ")
    println("Если в нём есть цифры 4 и 6, то программа выведет это число.")
    val numb = readLine().toString()
    val len = numb.toString().length
    val ch1 = "4"
    val ch2 = '6'

    if (len == 3) {
        if (ch1 in numb && ch2 in numb ) {
            println("Вы ввели число $numb и оно содержит цифры 4 и 6.")
        } else {
            println("В этом числе нет цифр 4 и 6.")
        }
    } else {
        println("Извините, вы ввели не трёхзначное число.")
    }
}