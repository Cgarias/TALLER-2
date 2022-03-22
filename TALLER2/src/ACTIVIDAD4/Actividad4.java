
package ACTIVIDAD4;
public class Actividad4 {
    public static void main(String[] args) {
        int NumD = 5;
        double KmD = 45;
        double CosLiGa = 7.700;
        double KmLi=15;
        double PagE = 15000;
        double PagP = 12600;
        
        double GastoGasolina = (KmD / KmLi)* CosLiGa;
        double GastoViaje = (GastoGasolina + PagE + PagP) * NumD;
        
        System.out.println("Número de días del viaje: " + NumD);
        System.out.println("Total de kilómetros conducidos por día: " + KmD);
        System.out.println("Costo por litro de gasolina: " + CosLiGa);
        System.out.println("Promedio de kilometro por litro de gasolina: " + KmLi);
        System.out.println("Pago por estacionamiento por día: " + PagE);
        System.out.println("Pago de peajes por día: " + PagP);
        System.out.println("------------------------");
        System.out.println("Costo total del viaje: " + GastoViaje);
        
    }
}
