package ultraemojicombat;

public class Lutador {
    //Atributos
    private  String nome, nacionalidade, categoria;
    private int idade;
    private float peso, altura;
    private int vitorias, derrotas, empates;
    //Métodos Públicos
    public void apresentar(){
        System.out.println("______________________________" + "\nCHEGOU A HORA! Apresentamos o lutador " + this.getNome() + "\nDiretamente de " + this.getNacionalidade() + "\n com " + this.getIdade() + " anos e " + this.getAltura() + "\nPesando " + this.getPeso() + this.getPeso() + "Kg\n" + this.getVitorias() + " Vitorias\n" + this.getDerrotas() + " Derrotas\n" + this.getEmpates() + " Empates!");
    }
    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria() + "\nGanhou " + this.getVitorias() + " vezes \n" + "Perdeu " + this.getDerrotas() + " vezes\n" + "Empatou " + this.getEmpates() + " vezes");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    //Métodos Especiais
    public Lutador(String na, String no, int de, int em, int vi, float al, float pe, int id) {
        this.nacionalidade = na;
        this.nome = no;
        this.derrotas = de;
        this.empates = em;
        this.vitorias = vi;
        this.altura = al;
        this.setPeso(pe);
        this.idade = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2){
            this.categoria = "Inválido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if (this.peso <= 83.9){
            this.categoria = "Médio";
        }else if (this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
