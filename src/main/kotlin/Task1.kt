fun main(args: Array<String>) {
    println("Введите любое двузначное число: ")
    println("Если в нём есть цифра 7, то программа выведет это число.")
    val numb = readLine().toString()
    val len = numb.toString().length
    val ch = "7"

    if (len == 2) {
        if (ch in numb) {
            println("Вы ввели число $numb и оно содержит цифру 7.")
        } else {
            println("В этом числе нет цифры 7.")
        }
    } else {
        println("Извините, вы ввели не двузначное число.")
    }
}