package ACTIVIDAD3;
public class Actividad3 {
    public static void main(String[] args) {
        double CostoF, Iva, PorU;
        CostoF = 24300;
        Iva = 0.19;
        PorU=15;
        
        double PrecioU = ((CostoF * PorU)/100);
        double PrecioI = ((CostoF * Iva)/100);
        double PrecioF = (PrecioU + PrecioI + CostoF);
        
        System.out.println("PORCENTAJES");
        System.out.println("% de Utilidad: " + PorU + "%");
        System.out.println("% Iva: " + Iva + "%");
        System.out.println(" ");
        System.out.println("-----PRECIO ARTICULO-----");
        System.out.println("Costo fijo: $ " + CostoF);
        System.out.println("Utilidad: $ " + PrecioU );
        System.out.println("Iva: $ " + PrecioI);
        System.out.println("Precio Final: $ " + (int)PrecioF);
    }
 
}
