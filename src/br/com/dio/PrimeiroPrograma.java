package br.com.dio;

import br.com.dio.model.Gato;

import java.util.Objects;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.setName("Mylin");
        gato.setCor("Rajado");
        gato.setIdade(2);
        Livro livro = new Livro("Lord of the rings", 500);
        System.out.println(livro);
        System.out.println(gato);
        /*int a = 5;
        int b = 8;
        int soma = a + b;
        System.out.println("Hello World! "+ soma);*/
    }
}

class Livro {
    private String name;
    private Integer pages;

    public  Livro(String name, Integer pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(name, livro.name) && Objects.equals(pages, livro.pages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pages);
    }

    @Override
    public String toString() {
        return "livro{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}
