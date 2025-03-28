package unidad07_A05;


public class CuentaCorriente {
    private double saldo;
        String DNI;
        public String nombre;
        private static String banco="Santander";
        Gestor gestor;
        
        CuentaCorriente(String dni, String nombre){
            this(dni,nombre);
            this.gestor=gestor;
        }
        
        CuentaCorriente(String dni,double saldo){
            this(dni,"Sin asignar",saldo);
                    
        }
        
        CuentaCorriente(){
            this.saldo=0.0;
            this.DNI=" ";
            this.nombre=" ";
            this.gestor=null;
        }
        
        CuentaCorriente(String dni, String nombre, double saldo,Gestor gestor){
            this.DNI=dni;
            this.nombre=nombre;
            this.saldo=saldo;
            this.gestor=gestor;
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
            System.out.println("Gestor: "+gestor.nombre+" Telefono: "+gestor.getTelefono());
            
           } 
        public static String getBanco() {
            return banco;
            }

        public static void setBanco(String bancoDos) {
            banco = bancoDos;
            }
                   
        }
    
    

