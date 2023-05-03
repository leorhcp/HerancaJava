public class Carro{
    private String marca;
    private String modelo;
    private float motor;
    private int valor;
    private boolean blindado;
    private boolean arma;
    private int armadura;


    public Carro(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
        this.blindado=false;
        this.arma=false;
        this.armadura=0;
    }

    public void info(){
        System.out.println("-----------------------------------");
        System.out.println("Carro: " + this.marca + " "+this.modelo);
        System.out.println("Motor: "+ this.motor);
        System.out.println("Valor do carro: R$"+ this.valor);
        System.out.printf("Blindado? %s%n",this.blindado  ? "Sim" : "Não");

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
    public boolean getBlindado(){
        return this.blindado;
    }
    public void setBlindado(boolean blindado){
        this.blindado=blindado;
    }
    public boolean getArma(){
        return this.arma;
    }
    public void setArma(boolean arma){
        this.arma=arma;
    }
    public int getArmadura(){
        return this.armadura;
    }
    public void setArmadura(int armadura){
        this.armadura=armadura;
    }


}