import java.util.Scanner;
public class PrincipalFundamentos{
    public static void main(String[] args){
        System.out.println("Ingresar datos en el siguiente orden: Nombre, correo, contraseña, lugar de residencia, material.");
        Scanner scan = new Scanner(System.in);
        String n=scan.next();
        String m=scan.next();
        String p=scan.next();
        String s=scan.next();
        String mat=scan.next();
        Captura asig=new Captura(n,m,p,s,mat);
        System.out.println(Actuador.alerta());
        if(Captura.material().equals("plastico")){
            Visualizacion.plastico();
        }else if(Captura.material().equals("papel")){
            Visualizacion.papel();
        }else if(Captura.material().equals("vidrio")){
            Visualizacion.vidrio();
        }else if(Captura.material().equals("metal")){
            Visualizacion.metal();
        }
    }
}