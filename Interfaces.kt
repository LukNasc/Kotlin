    /*
        Pode-se dizer, a grosso modo, que uma interface é um contrato que quando assumido 
        por uma classe deve ser implementado.
        
        Interface é utilizada pois podemos ter muitos objetos (classes) que podem possuir a 
        mesma ação (Métodos) porém, podem executá-las de maneira diferente
    */
    interface Presidente {
        fun ganharEleicao()
    }
    interface Pai {
        fun temFilho()
    }
    open class Cidadao {
        fun direitosDeveres(){
            println("Todo cidadao tem direitos e deveres!")
        }
    }
    class Obama: Cidadao(), Presidente, Pai {
        override fun ganharEleicao(){
            println("Ganhar Eleicao")
        }
        override fun temFilho(){
            println("Tem filho!")
        }
    }
    class Jamilton: Cidadao(), Pai {
        fun darAulas(){
            println("Dá aulas!")
        }
        override fun temFilho(){
            println("Tem filho!")
        }
    }
    fun main(args: Array<String>) {
        
        
        val cao = Cao()
        cao.nome = "Aveia"
        println(cao.nome)
        
        
        val obama: Presidente = Obama()
        obama.direitosDeveres()
        obama.ganharEleicao()
        obama.temFilho()
        
        println("-----------")
        
        val jamilton = Jamilton()
        jamilton.direitosDeveres()
        jamilton.darAulas()
        
     
        
    }


