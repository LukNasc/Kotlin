/**
 * Tipos de variáveis
 * play.kotlinlang.org 
 */

fun main(args: Array<String>) {
     //o tipo default de uma variável no Kotlin
     //quando o valor for com "." é Double
     //
     //===Números===
     //Double -> Muita precisão decimal
     //Float  -> Menor precisão que o Double (Precisa colocar um "f" ao final do valor)
     //Long   -> Precisa colocar um "L" ao final do valor para indentificar
     //int    -> Valor inteiro
     //
     //===Outros===
     //String -> Caracteres
     //Boolean -> Verdadeiro ou Falso (True or False)
     
    //Variável Double
    var numero = 3.5
    var numero_1: Double = 3.5 //Outra forma de definir uma variável
	println(numero)	
    
    //Variável String
    var string1 = "Lucas"
    var string1_1: String = "Lucas" //Outra forma de definir uma variável
	println(string1)	
    
    //Variável Float
    var numero2 = 3.2f
    var numer2_1: Float = 3.2f //Outra forma de definir uma variável
    println(numero2)
    
    //Variável int
    var numero_inteiro = 10
    var numero_inteiro_1: Int = 10 //Outra forma de definir a variável
    
    //Variável Long
    var numero_long = 1000L
    var numero_long_1:Long = 1000L //Outra forma de definir a variá
    var numero_long_2:Long = 1000 //Não necessariamente é preciso do "L" no final do valor long
    
    //Variável Boolean
    var resultado = true;
    var resultado_1: Boolean = false; //Outra forma de definir a variável
