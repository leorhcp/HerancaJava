public class Carro{
    private String marca;
    private String modelo;
    private float motor;
    private int valor;
    private boolean blindado;
        private int armadura;


    public Carro(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
        this.blindado=false;
        this.armadura=0;
    }

    public void sofrerDano(){
        this.armadura-=50;
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

    public int getArmadura(){
        if(armadura <= 0){
            System.out.println("O carro foi destruído");
        }
        return this.armadura;
    }
    public void setArmadura(int armadura){
        this.armadura=armadura;
    }


}