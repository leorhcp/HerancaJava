public class CarroCombate extends Carro{
    private int municao = 100;
    private int atirar;


    public CarroCombate(String marca, String modelo){
        super(marca, modelo);
        setBlindado(true);
        setArmadura(100);
        setMotor(3.0f);
        setArma(true);
    }
    public int getMunicao(){
        return this.municao;
    }
    public void setMunicao(int municao){
        this.municao=municao;
    }
    public int getAtirar(){
        return this.atirar;
    }
    public void setAtirar(int atirar){
        this.municao--;
        this.atirar=atirar;
    }

    public void info(){
        super.info();
        System.out.println("Armadura: "+ getArmadura());
        System.out.println("Motor: " + getMotor());
        System.out.println("Arma: "+ getArma());

        
    }
    

}










