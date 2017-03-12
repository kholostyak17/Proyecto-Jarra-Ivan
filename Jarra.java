public class Jarra {
    int capacidad;
    int cantidad;
    Jarra (int c){                            
        this.capacidad = c;
    }
    int getCapacidad(){
        return this.capacidad;
    }
    int getCantidad(){
        return this.cantidad;
    }
    void setCantidad(int litros){
        this.cantidad = litros;
    }
    void vacia(){
        this.cantidad = 0;
    }
    void llena(){
        this.cantidad = this.capacidad;
    }
    void vuelcaEn(Jarra destino){
        int libres = destino.getCapacidad() - destino.getCantidad();
            if (libres > 0) {
                if (this.cantidad <= libres) {
                    destino.setCantidad(destino.getCantidad() + this.cantidad);
                    this.vacia();
                } else {
                    this.cantidad -= libres;
                    destino.llena();
                  }
            }
    }
    void muestra(){
        for (int nivel = this.capacidad; nivel > 0; nivel--) {
            if (this.cantidad >= nivel) {
                System.out.println("|xxxxxx|");
            } else {
                System.out.println("|      |");
            }
        }
        System.out.println("||||||||");
    }
    public String toString(){ //metodo toString¡¡¡¡¡¡¡¡¡¡¡¡
        String respuesta = "\nla jarra de "+capacidad+"l tiene "+cantidad+" litros:\n\n";
        return respuesta;
    }
   
    public static void main(String[] args) {
            Jarra jarra1 = new Jarra(5);
            Jarra jarra2 = new Jarra(7);
            System.out.println("\nhe utilizado metodo toString\n");
            System.out.println("\nJarra 1: \n");
            jarra1.muestra();
            System.out.println("\nJarra 2: \n");
            jarra2.muestra();
            System.out.println("\nLleno la jarra 5l: \n");
            jarra1.llena();
            jarra1.muestra();
            System.out.println("\nLa vierto en la jarra 7l: \n");
            jarra1.vuelcaEn(jarra2);
            System.out.print(jarra2);
            jarra2.muestra();
            System.out.println("\nLleno la jarra 5l otra vez: \n");
            jarra1.llena();
            jarra1.muestra();
            System.out.println("\nLa vierto en la jarra 7l otra vez: \n");
            jarra1.vuelcaEn(jarra2);
            System.out.print(jarra1);
            jarra1.muestra();
            System.out.print(jarra2);
            jarra2.muestra();
            System.out.println("\nvacio jarra 7L \n");
            jarra2.vacia();
            jarra2.muestra();
            System.out.println("\nlleno jarra 7l desde jarra 5l \n");
            jarra1.vuelcaEn(jarra2);
            System.out.print(jarra2);
            jarra2.muestra();
            System.out.println("\nlleno jarra 5l \n");
            jarra1.llena();
            jarra1.muestra();
            System.out.println("\nlleno jarra 7l desde jarra 5l \n");
            jarra1.vuelcaEn(jarra2);
            System.out.print(jarra2);
            jarra2.muestra();
            System.out.print(jarra1);
            jarra1.muestra();
            System.out.println("\n=)\n");
        }
}