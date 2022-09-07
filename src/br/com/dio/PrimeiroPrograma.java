package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.setName("Mylin");
        gato.setCor("Rajado");
        gato.setIdade(2);
        System.out.println(gato);
        /*int a = 5;
        int b = 8;
        int soma = a + b;
        System.out.println("Hello World! "+ soma);*/
    }
}
