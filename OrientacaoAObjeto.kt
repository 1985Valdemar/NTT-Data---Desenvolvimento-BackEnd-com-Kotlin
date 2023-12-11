data class Pais(var habitantes: Double, val taxaCrescimento: Double) {

    fun crescerPopulacaoAnual(populacao: Double, taxa: Double): Double{
      return populacao*(1 + taxa/100)
    }
    
    fun crescerPopulacaoAnual() { 
      //  TODO("Criar a lógica de crescimento populacional, usando as propriedades do [Pais]")
      habitantes = habitantes*(1 + taxaCrescimento/100)
      }
}

fun main() {
   val habitantesPaisA = readLine()!!.toDouble();
   val habitantesPaisB = readLine()!!.toDouble();
   var paisA = Pais(habitantesPaisA, taxaCrescimento = 3.0)
   var paisB = Pais(habitantesPaisB, taxaCrescimento = 1.5)
   
   var quantidadeAnos = 0
   while (paisA.habitantes < paisB.habitantes) {
    //   TODO("Invocar a função que consolida o crescimento anual de cada [Pais]")
    paisA.crescerPopulacaoAnual()
    paisB.crescerPopulacaoAnual()
    quantidadeAnos++
    
    //  TODO("Garantir de a variável mutável $quantidadeAnos seja atualizada")
   }
   
   println("$quantidadeAnos anos")
}