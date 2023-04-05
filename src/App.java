import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //10- faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit. f = x * 1.8 + 32
    
    //Entrada
    Double c, f;
    Scanner teclado;

    System.out.println("Por favor, digite uma temperatura em Celsius ");
    teclado = new Scanner(System.in);
    c = teclado.nextDouble();
    teclado.close();

    //Processamento
    f = (c * 1.8) + 32;

    //Saída
    System.out.println("A temperatura digitada, em Fahrenheit, equivale a: " + f);

    }
}


