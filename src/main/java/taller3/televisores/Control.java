package taller3.televisores;
public class Control {
    TV tv;
    
    public TV getTv(){
        return tv;
        
    }
    public void setTv (TV tv){
        this.tv = tv;
    }

    public void enlazar(TV tele){
        tv = tele;
    }
    public void turnOn(){
        tv.estado = true;
    }
    public void turnOff(){
        tv.estado = false;
    }
    public void canalUp() {
        if (tv.estado && tv.getCanal() < 120) {
            tv.canal += 1;
        }
    }
    public void canalDown() {
        if (tv.estado && 1 < tv.getCanal() && tv.getCanal() <= 120) {
            tv.canal -= 1;
        }
    }

    public void volumenUp(){
        if( tv.getEstado() && tv.volumen < 7) {
            tv.volumen += 1;
        }
    }
    public void volumenDown(){
        if (tv.getEstado() && tv.volumen > 0 && tv.volumen <= 7){
            tv.volumen -=1;
        }
    }


}
