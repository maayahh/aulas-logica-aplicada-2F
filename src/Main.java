public class Main {
    public static void main(String[] args) {
        // Aula de orientaçao a objetos
        // Declarar objetos
        Pessoa adao;
        // instanciar objetos
        adao = new Pessoa();
        Pessoa eva = new Pessoa();
        // Definiçao do formato
        adao.nome = "adao";
        adao.sobrenome = "silva";
        eva.nome = "Eva";
        eva.sobrenome = "silva";
        // Acionar comportamento
        adao.falar();
        eva.falar();
    }
}