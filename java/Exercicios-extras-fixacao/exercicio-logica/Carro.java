public class Carro{
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private int velocidadeAtual;

    //Meu construtor
    public Carro(String marca, String modelo, int ano, String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidadeAtual = 0; // Velocidade inicial é 0
    }

    //Getters
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAno(){
        return ano;
    }
    public String getCor(){
        return cor;
    }
    public int getVelocidadeAtual(){
        return velocidadeAtual;
    }

    //Métodos
    public void acelerar(int incremento){
        if(incremento > 0 && velocidadeAtual + incremento <=180){
            velocidadeAtual += incremento;
            System.out.println("Acelerando... Velocidade atual: " + velocidadeAtual + " km/h");
        } else if(incremento + velocidadeAtual > 180){
            velocidadeAtual = 180;
            System.out.println("Velocidade máxima atingida: " + velocidadeAtual + " km/h");
        } else{
            System.out.println("Manteu a mesma velocidade: " + velocidadeAtual + " km/h");
        }
    }

    public void frear(int decremento){
        if(decremento > 0 && velocidadeAtual - decremento > 0){
            velocidadeAtual -= decremento;
            System.out.println("Freiando... Velocidade atual: " + velocidadeAtual + " km/h");
        } else if(decremento == velocidadeAtual){
            velocidadeAtual = 0;
            System.out.println("Carro parado. Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("Manteu a mesma velocidade: " + velocidadeAtual + " km/h");
        }
    }

    public void exibirInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }
}