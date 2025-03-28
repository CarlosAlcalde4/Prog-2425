package unidad07_A01;
import java.util.Scanner;


    public class cuentaCorriente {
        private double saldo;
        String DNI;
        public String nombre;
        private static String banco="Santander";
        
        cuentaCorriente(String dni, String nombre){
            this(dni,nombre,0);
        }
        
        cuentaCorriente(String dni,double saldo){
            this(dni,"Sin asignar",saldo);
                    
        }
        
        cuentaCorriente(){
            this.saldo=0.0;
            this.DNI=" ";
            this.nombre=" ";
        }
        
        cuentaCorriente(String dni, String nombre, double saldo){
            this.DNI=dni;
            this.nombre=nombre;
            this.saldo=saldo;
        }
 
        boolean sacar(double saldo){
            if(saldo<this.saldo){
                this.saldo=this.saldo-saldo;
                return true;
            }else{
                return false;
            }
        }
        double ingresar(double saldo){
            this.saldo+=saldo;
            return saldo;
        }
        void mostrar(){
            System.out.println(this.nombre);
            System.out.println(this.DNI);
            System.out.println(this.saldo);
            System.out.println(banco);
           } 
        public static String getBanco() {
            return banco;
            }

        public static void setBanco(String bancoDos) {
            banco = bancoDos;
            }
                   
        }
    
