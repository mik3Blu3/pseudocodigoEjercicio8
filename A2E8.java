import java.util.Scanner;
import java.util.Random;
public class A2E8 {
    static Scanner entrada =  new Scanner(System.in);
    static Random ran = new Random();
    public static void main(String args[])
    {
        int aux = 0;
        int numMultiplo = 0;
        int opcionNumero = 0;
        int cont = 0; 
        int alaux =0;
        System.out.println("Bienvenido mostraremos multiplos de 5 hasta que ingrese la letra s");
        do
        {
            while( cont == 0){
                alaux = ran.nextInt(1000-5)+5;
                aux = alaux % 5;
                numMultiplo = alaux /5;
                if((aux == 0) && (numMultiplo != 0)){
                    System.out.println("Encontre un numero multiplo");
                    cont++;
                }else{
                    cont =0;
                }
            }
            if(aux == 0)
            {
                System.out.println("Multiplo de 5 #"+numMultiplo);
                System.out.println("El multiplo es: "+alaux);
            }
            System.out.println("Ingrese la letra s si desea salir");
            String opcion = entrada.nextLine();
            if(opcion.equalsIgnoreCase("s"))
            {
                opcionNumero++;
            }else if(!opcion.equalsIgnoreCase("s"))
            {
                opcionNumero = 0;
            }
        }while(opcionNumero != 1 );
    }
}
