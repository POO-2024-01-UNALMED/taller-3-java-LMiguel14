package taller3.televisores;

public class TV {
    private static int numTV;
    private Marca marca;
    public int canal = 1;
    private int precio= 500;
    public boolean estado;
    public int volumen= 1;
    private Control control;

    public TV (Marca marca, boolean estado) {
        this.marca = marca ;
        this.estado= estado;
        this.numTV ++;
    }

    public static int getNumTV(){
        return numTV;
    }
    public static void setNumTV(int num){
        numTV = num;
    }
    public boolean getEstado(){
        return this.estado;
    }

// get and set - marca, canal, precio volumen, control -----

    public Marca getMarca(){
        return marca;
    }
    public void setMarca(Marca nombre) {
        this.marca = nombre;
    }

    public int getCanal(){
        return this.canal;
    }
    public void setCanal(int canal){
        if (canal <= 120 && canal >= 1){
            this.canal= canal;
        }
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
        if (volumen  >= 0 && volumen <= 7 && this.estado){
            this.volumen= volumen;
        }
    }
    public Control getControl(){
        return control;    
    }
    public void setControl(Control tv) {         
        control= tv;   
    }

    // -----------------

    public void turnOn(){
        this.estado = true;
    }
    public void turnOff(){
        this.estado = false;
    }
    public void canalUp() {
        if (this.estado && this.getCanal() < 120) {
            this.canal += 1;
        }
    }
    public void canalDown() {
        if (this.estado && 1 < this.getCanal() && this.getCanal() <= 120) {
            this.canal -= 1;
        }
    }

    public void volumenUp(){
        if( this.getEstado() && this.volumen < 7) {
            this.volumen += 1;
        }
    }
    public void volumenDown(){
        if (this.getEstado() && this.volumen > 0 && this.volumen <= 7){
            this.volumen -=1;
        }
    }





