package taller3.televisores;

public class TV {
    private static int numTV;
    private Marca marca;
    private int canal = 1;
    private int precio= 500;
    private boolean estado;
    private int volumen= 1;
    private Control control;

    public TV (String marca, boolean estado) {
        this.marca = new Marca(marca) ;
        this.estado= estado;
    }


// get and set ------
    public static int getNumTV(){
        return numTV;
    }
    public static void setNumTV(int num){
        numTV = num;
    }
    
    public String getMarca(){
        return marca.nombre;
    }
    public void setMarca(String newNombre) {
        marca.nombre = newNombre;
    }

    public int getCanal(){
        return this.canal;
    }
    public void setCanala(int canal) {
        this.canal= canal;
    }

    public int getPrecio(){
        return this.precio;
    }
    public void setPrecio( int precio) {
        this.precio= precio;
    }

    public int getVolumen(){
        return this.volumen;
    }
    public void setVolumen(int volumen) {
        this.volumen= volumen;
    }

    public TV getControl(){
        return control.tv;    
    }
    public void setControl(TV tv) {
     control.tv= tv;   
    }

    public void turnOn(){
        this.estado = true;
    }
    public void turnOff(){
        this.estado = false;
    }
    public boolean getEstado(){
        return this.estado;
    }
// --------------------------------------

    public void canalUp(){
        this.canal ++ ;
    }
    public void canalDown(){
        this.canal ++;
    }
    public void volumeUp(){
        this.volumen ++;
    }
    public void volumenDown(){
        this.volumen --;
    }
       
//    public static void main(String[] args) {
//        TV televisoR = new TV("lg", false);
//        System.out.println(televisoR.marca.nombre.getClass());  
//
//    }








}
