package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();

        Livro livro1 = new Livro( "DAHMR", 300);

        System.out.println(livro1.nome);


/*        int a =5;
        int b = 3;

        System.out.println("Hello " + (a+b));*/
    }

    static class Livro {
        private String nome;
        private Integer numPag;

        public Livro(String nome, Integer numPag) {
            this.nome = nome;
            this.numPag = numPag;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNumPag() {
            return numPag;
        }

        public void setNumPag(Integer numPag) {
            this.numPag = numPag;
        }
    }

    @Override
    public String toString() {
        return "PrimeiroPrograma{}";
    }
}
