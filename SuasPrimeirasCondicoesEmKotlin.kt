fun main() {
    val media = readLine()!!.toDouble();
    
    when {
        media > 7 -> println("APR")
        media >= 5 -> println("REC")
        media < 5 -> println("REP");
        else -> TODO("Criar demais condições para a resolução deste desafio.")
    }
 }