
package pertemuan2;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Pertemuan2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukan nama ");
        String nama = keyboard.next();
        
        System.out.print("Masukan hobi ");
        String hobi = keyboard.next();
        
        System.out.print("Masukan asal daerah ");
        String asalDaerah = keyboard.next();
        
        System.out.print("Halo nama saya " + nama +"!");
        System.out.print(" Hobi saya " + hobi);
        System.out.println(" Saya berasal dari " + asalDaerah);
    }
    
}
