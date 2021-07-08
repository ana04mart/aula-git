package classes;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String telefone;

    public Pessoa (){

    }
    
    public Pessoa (String nome, String sobrenome, String telefone){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;

    } 
    public String getNome(){
            return nome; 
    }
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

   public void setNome (String nome){
    this.nome = nome;
}

   public String getSobrenome(){
    return sobrenome;
}
    public void setSobrenome(String sobrenome){
    this.sobrenome = sobrenome;
}
  



}
