package exrepetição2;
    import java.util.Scanner;
public class ExRepetição2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double f,num, i;
        System.out.println("Digite o grau em Celsius:");
        num=entrada.nextDouble();
        i=1;
        while(i<10)
        {
            f=(9*i/5)+32;
            System.out.println("nº"+f);
            i=i+1;
        }
    }    
}
