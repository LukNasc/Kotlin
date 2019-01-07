/**
 * Null Safe
 * play.kotlinlang.org 
 */

fun main(args: Array<String>) {
     var nome: String? = null
     println(nome?.length)
  
  	var resultado = when(nome?.length){
        null->{
            "a variável está nula"
        }
        1,2,3,4,5,6,7,8,9->{
            "A variável está com o tamnho entre 1 e 9"
        }
        else->{
            "Nenhuma das anteriores"
        }
    }
    
    println(resultado)
  }
