public class Carro{
    private String marca;
    private String modelo;
    private boolean ligado;
    private boolean destruido;
    private float motor;
    private int valor;
    private boolean armamento;
    private int blindagem;


    public Carro(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
        this.destruido=false;
        this.blindagem=0;
    }

    
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }

    public boolean getLigado(){
        return this.ligado;
    }

    public void setLigado(boolean ligado){
        this.ligado=ligado;
    }

    public boolean getDestruido(){
        return this.destruido;
    }
    
    public void setDestruido(boolean destruido){
        this.destruido=destruido;
    }

    public boolean getArmamento(){
        return this.armamento;
    }

    public void setArmamento(boolean armamento){
        this.armamento=armamento;
    }

    public float getMotor(){
        return this.motor;
    }
    public void setMotor(float motor){
        this.motor=motor;
    }
    public int getValor(){
        return this.valor;
    }
    public void setValor(int valor){
        this.valor=valor;
    }

    public int getBlindagem(){
        if(blindagem <= 0){
            System.out.println("O carro foi destruído");
        }
        return this.blindagem;
    }
    public void setBlindagem(int blindagem){
        this.blindagem=blindagem;
    }


    public void sofrerDano(int dano){
        this.blindagem=dano;
        if (this.blindagem<=0){
            this.blindagem=0;
            this.ligado=false;
            this.destruido=true;
        }
    }

    public void info(){
        System.out.println("-----------------------------------");
        System.out.printf("Marca: %s%n", this.marca);
        System.out.printf("Modelo: %s%n", this.modelo);
        System.out.printf("Ligado: %s%n",this.ligado ? "Sim" : "Não");
        System.out.printf("Destruído: ",this.destruido ? "Sim" : "Não");
        System.out.printf("Blindagem: %d%n ", this.blindagem);
        System.out.printf("Armamento: %s%n",this.armamento ? "Sim" : "Não");
        System.out.println("Motor: "+ this.motor);
        System.out.println("Valor do carro: R$"+ this.valor);


    }


}