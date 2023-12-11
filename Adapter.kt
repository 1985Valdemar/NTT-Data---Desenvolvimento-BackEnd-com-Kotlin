// Antiga classe de conversão que só suporta a conversão de USD para GBP
class OldCurrencyConverter {
  fun convertUSDtoGBP(amount: Double): Double {
    return amount * 0.80 // 80% do valor em USD
  }
}
class CurrencyAdapter(private val oldConverter: OldCurrencyConverter) {
    // Taxa de conversão de GBP para EUR
    private val gbpToEurRate: Double = 1.0625

    // Função para converter USD para EUR usando a antiga conversão e a taxa adicional
    fun convertUSDtoEUR(amount: Double): Double {
        // Converter USD para GBP usando a antiga conversão
        val amountInGBP = oldConverter.convertUSDtoGBP(amount)
        
        // Converter GBP para EUR aplicando a taxa adicional
        val amountInEUR = amountInGBP * gbpToEurRate
        
        return amountInEUR
    }
}

fun main() {
    val input = readLine()?.toDoubleOrNull() ?: return
    val oldConverter = OldCurrencyConverter()
    val adapter = CurrencyAdapter(oldConverter)

    val amountInEUR = adapter.convertUSDtoEUR(input)

    println("USD: $input")
    println("EUR: $amountInEUR")
}