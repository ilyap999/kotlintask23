fun main() {
    val amountOfPurchases = 1050000
    val musicLoverMan = true

    val constantDiscountStart = 100000
    val variableDiscountStart = 1000000
    val valueConstantDiscount = 10000
    val valueVariableDiscount = 5
    val valueMusicLoverDiscount = 1

    var resultDiscount = 0

    if (amountOfPurchases > variableDiscountStart) {
        resultDiscount = amountOfPurchases * valueVariableDiscount / 100
    } else if (amountOfPurchases > constantDiscountStart) {
        resultDiscount = valueConstantDiscount
    }

    if (musicLoverMan) {
        resultDiscount += (amountOfPurchases - resultDiscount) * valueMusicLoverDiscount / 100
    }

    println("Скидка: ${resultDiscount / 100} руб. ${resultDiscount % 100} коп.")
    println("Сумма со скидкой: ${(amountOfPurchases - resultDiscount) / 100} руб. ${(amountOfPurchases - resultDiscount) % 100} коп.")

}