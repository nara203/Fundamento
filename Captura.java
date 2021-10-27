public class Captura{
    public static Captura datos[]=new Captura[1];
    private String name;
    private String mail;
    private String password;
    private String sector;
    private String material;
    public Captura(){    
    }
    public Captura(String n,String m,String p,String s,String mat){
        Captura cAsignar=new Captura();
        cAsignar.setName(n);
        cAsignar.setMail(m);
        cAsignar.setPassword(p);
        cAsignar.setSector(s);
        cAsignar.setMaterial(mat);
        this.datos[0]=cAsignar;
    }
    public String getName(){
        return this.name;
    }
    public String getMail(){
        return this.mail;
    }
    public String getPassword(){
        return this.password;
    }
    public String getSector(){
        return this.sector;
    }
    public String getMaterial(){
        return this.material;
    }
    public void setName(String nam){
        this.name=nam;
    }
    public void setMail(String mail){
        this.mail=mail;
    }
    public void setPassword(String pas){
        this.password=pas;
    }
    public void setSector(String sec){
        this.sector=sec;
    }
    public void setMaterial(String mat){
        this.material=mat;
    }
    public static String material(){
        String mate=datos[0].getMaterial();
        return mate;
    }
}