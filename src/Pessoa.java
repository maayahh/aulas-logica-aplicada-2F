import javax.xml.transform.stream.StreamSource;

public class Pessoa extends Animal{
    // Atributos da classe
    String sobrenome;
    // Método da classe
    public void falar (){
        System.out.println("falei");
    }
    public String falar(String volume){
        return "falei " +volume;
    }
    // sobrescrita do metodo
    public void comer(){
        System.out.println("pessoa comeu");
    }
}
