package unidad07_A01;
import java.util.Scanner;

public class Main {
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        cuentaCorriente.setBanco("Santander");
        System.out.println("Dime tu dni");
        String dni=sc.nextLine();
        System.out.println("Dime el nombre del titular de la cuenta");
        String nombreTitular=sc.nextLine();
        cuentaCorriente cCte=new cuentaCorriente(dni,nombreTitular);
        cCte.ingresar(500.0);
        boolean dinero=cCte.sacar(200.0);
        System.out.println(dinero);
        cCte.mostrar();
        System.out.println("Nombre del banco: " + cuentaCorriente.getBanco());
    }
}
