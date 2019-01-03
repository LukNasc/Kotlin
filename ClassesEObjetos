/**
 * Classes e Objetos
 * play.kotlinlang.org 
 */

class Casa{
    //Atributos
	private var cor: String = ""
    
    //Métodos
    fun abrirJanela(qtdJanelas: Int){
        println("Abrir Janela, total: $qtdJanelas")
    }
    
    fun abrirPorta(){
        println("Abrir porta")
    }
    
    fun abrirCasa(qtd: Int){
        this.abrirJanela(qtd)
        this.abrirPorta()
    }
    
    //Métodos (Metodos de encapsulamento)
    fun setCor(cor: String){
		this.cor = cor
    }
    
    fun getCor(): String{
        return this.cor;
    }
}

fun main(args: Array<String>) {
	val casa = Casa()
    casa.setCor("Vermelha")
    casa.abrirCasa(2)
    
    /*val casa2 = Casa()
    casa2.setCor("Amarelo")*/
    
    println(casa.getCor())
    //println(casa2.getCor())
}
