/**
 * Estruturas de Condição
 * play.kotlinlang.org 
 */

fun main(args: Array<String>) {
     
	//IF ELSE
	if(true){
        var teste: String = "Verdadeiro"
    }else{
        var teste: String = "Falso"
    }
    
    
    //WHEN
     val x = true
    when(x){
        true -> println("Verdadeiro")
    	false -> println("Falso")
        else -> println("Nenhuma das opções")
    }
  }
