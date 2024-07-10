package ultraemojicombat;

import java.util.Random;

public class luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    private String sexo;
    //Métodos Púbçicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != (l2) && l1.getSexo().equals(l2.getSexo())) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else if(l1.getSexo().equals(l2.getSexo())){
            System.out.println("A luta não pode acontecer porque os competidores possuem sexos distintos");
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
    if (this.aprovada){
        System.out.println("### DESAFIADO ###");
        this.desafiado.apresentar();
        System.out.println("### DESAFIANTE ###");
        this.desafiante.apresentar();

        Random aleatorio = new Random();
        int vencedor = aleatorio.nextInt(3);
        System.out.println("========= RESULTADO DA LUTA =========");
        switch (vencedor){
            case 0:
                System.out.println("Empatou!");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;
            case 1:
                System.out.println(this.desafiado.getNome()  + " Venceu a luta!");
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;
            case 2:
                System.out.println(this.desafiante.getNome() + " Venceu a luta!");
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                break;
            default:
        }
        System.out.println("===========================");
    }else{
            System.out.println("A luta não pode acontecer!");
        }
    }
    //Métodos Especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    public String getSexo(){
        return sexo;
    }
    public void setSexo(){
        if (this.sexo.equals("Masculino") && this.sexo.equals("Feminino")){
            System.out.println("Não podem lutar pessoas de categorias diferente");
        }else if(this.sexo.equals("Masculino") && this.sexo.equals("Masculino")){
            System.out.println("Luta Masculina");
        }else if(this.sexo.equals("Feminino") && this.sexo.equals("Feminino")) {
            System.out.println("Luta feminina");
        }
    }
}
