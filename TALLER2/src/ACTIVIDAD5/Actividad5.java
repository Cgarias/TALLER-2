
package ACTIVIDAD5;
public class Actividad5 {
    public static void main(String[] args) {
        int CalM = 52;
        int CalP = 55;
        int CalPe = 55;
        int CalN = 45;
        int CalF = 32;
        int CalMe = 54;
        
        int NumM = 2;
        int NumP = 0;
        int NumPe = 3;
        int NumN = 1;
        int NumF = 0;
        int NumMe = 1;
                
        int CalCon =((NumM * CalM) + (NumP * CalP) + (NumPe * CalPe) + (NumN * CalN) + (NumF * CalF) + (NumMe * CalMe));
        
        System.out.println("# Manzanas: " + NumM);
        System.out.println("# Piñas: " + NumP);
        System.out.println("# Peras: " + NumPe);
        System.out.println("# Naranjas: " + NumN);
        System.out.println("# Fresas: " + NumF);
        System.out.println("# Melon: " + NumMe);
        System.out.println("--------------");
        System.out.println("CALORIAS CONSUMIDAS: " + CalCon + " Kcal");
        
    }
}
