import java.io.FileWriter;
import java.io.PrintWriter;
public class Persistencia{
    public static Captura datos[]=new Captura[1];
    public void alamacenar(){
        FileWriter fichero = null;
        PrintWriter pw = null;
        if(Procesamiento.comparar()==1){
            String name=datos[0].getName();
            String mail=datos[0].getMail();
            String pass=datos[0].getPassword();
            String sect=datos[0].getSector();
            String mate=datos[0].getMaterial();
            try{
                fichero = new FileWriter("./prueba.txt");
                pw = new PrintWriter(fichero);
                pw.println("Nombre: "+name);
                pw.println("Correo: "+mail);
                pw.println("Contraseña: "+pass);
                pw.println("Sector en que vive: "+sect);
                pw.println("Material a reciclar: "+mate);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (null != fichero)
                        fichero.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}