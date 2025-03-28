package unidad07_A05;
import java.util.Scanner;

public class main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime el nombre de tu gestor");
        String nombreGestor=sc.nextLine();
        System.out.println("Dime el telefono de tu gestor");
        String telefonoGestor=sc.nextLine();
        Gestor gestor=new Gestor(nombreGestor,telefonoGestor);
        
        System.out.println("Dime tu dni");
        String dni=sc.nextLine();
        System.out.println("Dime el nombre del titular de la cuenta");
        String nombreTitular=sc.nextLine();
        CuentaCorriente cCte=new CuentaCorriente(dni,nombreTitular,0.0,gestor);
        cCte.ingresar(500.0);
        boolean dinero=cCte.sacar(200.0);
        System.out.println(dinero);
        cCte.mostrar();
        System.out.println("Nombre del banco: " + CuentaCorriente.getBanco());
    }
}
