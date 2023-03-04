fun main(args: Array<String>) {
    println("Введите сумму: ")
    val sum = readLine().toString().toInt()

    if (sum > 0 && sum < 1000000) {
        if (sum % 10 == 1) {
            println("Сумма заказа: $sum рубль.")
        } else if (sum % 10 in 2..4) {
            println("Сумма заказа: $sum рубля.")
        } else{
            println("Сумма заказа: $sum рублей.")
        }
    }
}