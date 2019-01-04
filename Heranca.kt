/**
 * Herança
 * play.kotlinlang.org 
 */

//Por padrão as classes (e métodos) no Kotlin não podem ser herdadas (São final),
//para ter uma herança precisa colocar o 'open'
open class Animal{
    open fun dormir() : String{
        return "Dormir"
    }
    
    open fun correr() : String{
        return "Correndo"
    }
}


//Adiciona o 'override' na frente do método
//caso o método seja sobrescrita de um outro método
class Cao : Animal(){
   override fun dormir() : String{
       return super.dormir()+" como um cão"
   }
   
   override fun correr() : String{
       return super.correr()+" como um cão"
   }
   
   fun latir(){
       println("Latir")
   }
}

class Passaro : Animal(){
	override fun dormir() : String{
        return super.dormir()+" como um pássaro"
    }
    
    
   override fun correr() : String{
       return super.correr()+" como um pássaro"
   }
   
   fun voar(){
       println("Voar")
   }
}

fun main(args: Array<String>) {
	val passaro = Passaro()
    val cao = Cao()
    
    println(cao.dormir())
    println(passaro.dormir())
    
    
     
}
