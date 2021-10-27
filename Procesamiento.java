public class Procesamiento{
    public static Captura datos[]=new Captura[1];
    public static int comparar(){
        int cambio=0;
        String reciclaje[]=new String[4];
        reciclaje[0]="plastico";
        reciclaje[1]="vidrio";
        reciclaje[2]="papel";
        reciclaje[3]="metal";
        for(int i=0;i<=3;i++){
            if(Captura.material().equals(reciclaje[i])){
                cambio=1;
                break;
            }
        }
        return cambio;
    }
    public void asignar(){
        
    }
}