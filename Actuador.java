public class Actuador{
    public static String alerta(){
        String mensaje="";
        if(Procesamiento.comparar()==1){
            mensaje=mensaje+"ALERTA: El material es reciclable.";
        }else{
            mensaje=mensaje+"ALERTA: El material NO es reciclable.";
        }
        return mensaje;
    }
}