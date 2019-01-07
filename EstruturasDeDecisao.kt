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
        fun main(args: Array<String>) {
     
        
        /*
     when( opcao ){
        1,2 -> { 
                println("Café puro")
                println("Leite separado")
            }
            3 -> println("Chocolate quente")
            else -> { 
                println("Nenhuma opção selecionada")
                println("Selecione uma opção!!")
            }
        } 
        */
        
        var opcao = 1
        var resultado = when( opcao ){
        1 -> "Café puro"
            2 -> "Chocolate quente"
            else -> "Nenhuma opção selecionada"
        }
        println( resultado )
        
    }
  }
