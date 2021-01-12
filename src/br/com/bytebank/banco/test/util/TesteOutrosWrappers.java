package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

        public static void main(String[] args) {

                Integer idadeRef = Integer.valueOf(29); //autoboxing
                System.out.println(idadeRef.intValue()); //unboxing
                
                Double dRef = Double.valueOf(3.2); //autoboxing
                //Internamente, o Java utiliza a classe wrapper Double, e o método valueOf()
                
                System.out.println(dRef.doubleValue()); //unboxing
                
                Boolean bRef = Boolean.FALSE; //constante são sempre escritas em letras maiúsculas
                System.out.println(bRef.booleanValue()); //unboxing
                
                Number refNumero = Integer.valueOf(29);
                //Number é a classe mãe. Integer extende Number
                
                //Lista que aceite qualquer tipo de valor numérico
                // não há necessidade de repetirmos a palavra Number no lado direito do construtor
                List<Number> lista = new ArrayList<>();
                
                lista.add(10);
                lista.add(32.6);
                lista.add(25.6f);
                
                for(Number n : lista) {
                	System.out.println(n);
                }
        }
}