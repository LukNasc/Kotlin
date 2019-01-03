/**
 * Funções
 * play.kotlinlang.org 
 */

fun main(args: Array<String>) {
    //Funçoes são blocos de cod que exec uma ação
	exibirMensagem("Alerta, você não preencheu todos os dados")
   
    //Exibindo o retorno
    print(somar(10,2))
}

//dentro dos parenteses passa as informações
//Função sem retorno
fun exibirMensagem(msg: String){
    //Bloco de códigos 
    println(msg)

}

//Função com retorno
//Coloca ":" depois dos parenteses e o tipo a ser retornado
fun somar(numero1: Int, numero2: Int) : Int{
    var total = numero1 + numero2
    
    return total
}
