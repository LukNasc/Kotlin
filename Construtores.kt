/**
 * Classes e Objetos
 * play.kotlinlang.org 
 */

//Construtor

//Um modo de definir attr da classe direto no construtor
//class Casa(var cor: String, var vagasNaGaragem: Int)
class Casa ( cor:String, vagasNaGaragem: Int ){
    //Atributos
	var cor: String 
    var vagasNaGaragem: Int
    
    //Inicializa os atributos da classe
     init{
        this.cor = cor
        this.vagasNaGaragem = vagasNaGaragem
     }
    
    //Outra naneira de definir um construtor
    
    /*constructor(cor: String, vagasNaGaragem: Int){
     this.cor = cor
     this.vagasNaGaragem = vagasNaGaragem
    }*/
    
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
    
    fun detalhesDaCasa(){
        println("A casa tem a cor $cor, vagas: $vagasNaGaragem")
    }
}

fun main(args: Array<String>) {
	val casa = Casa("Rosa",3)
    
   casa.detalhesDaCasa()
    
}
