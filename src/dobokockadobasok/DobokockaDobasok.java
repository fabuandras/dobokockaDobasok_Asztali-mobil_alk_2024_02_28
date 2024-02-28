package dobokockadobasok;

import java.util.Random;
import java.util.Scanner;

public class DobokockaDobasok {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        *** 1. feladat: ***
        Kérjük be, hányszor akar dobni a felhasználó egy hatoldalú dobókockával!
        Csak pozitív számot fogadjunk el, majd jelenítsük meg a statisztikát,
        melyikből mennyit dobtunk! Pl. 600 dobás esetén egy lehetséges kimenet:
        
        6 volt 105 db
        5 volt 	93 db
        4 volt 	99 db
        3 volt 102 db
        2 volt 	99 db
        1 volt 101 db
        */
      
        System.out.println("1. feladat:");
        Random random = new Random();
        System.out.print("\n\tHányszor szeretne dobni, írja meg: ");
        int dobasokSzama = sc.nextInt();
        
        
        
        while (dobasokSzama <= 0) {
            System.out.print("Kérem, adjon meg egy pozitív számot: ");
            dobasokSzama = sc.nextInt();
            if (dobasokSzama <= 0) {
                System.out.print("Hiba: Nem pozitív számot adott meg!");
            }
        }
        
        
        
        int[] statisztika = new int[6];
        for (int i = 0; i < dobasokSzama; i++) {
            int dobasEredmeny = random.nextInt(6) + 1;
            statisztika[dobasEredmeny - 1]++;
        }
        //megjelenítés
        for (int i = 0; i < statisztika.length; i++) {
            System.out.println("\n\t" + (i + 1) + " volt " + statisztika[i] + " db");
        }
        
        
        
        /*
        *** 2. feladat: ***
        A felhasználó adja meg, hogy mennyit akar dobni kettő darab hatoldalú dobókockával!
	Az dobások statisztikáját jelenítsük meg vízszintes oszlopdiagrammal!
	A diagram csillagokból álljon!
	Egy lehetséges kimenet 9 dobás esetén:
	2 ******** (4 db)
	3 **** (2 db)
	8 ****** (3 db)
	Lehet minden értéket is megjeleníteni, de gondold át, mi legyen pl. 500 dobásnál?
        */
        
        System.out.println("\n2. feladat:");
        System.out.print("Hányszor szeretne dobni kettő darab hatoldalú dobókockával, írja meg: ");
        int dobásokSzáma = sc.nextInt();

        while (dobásokSzáma <= 0) {
            System.out.print("Pozitív számot adjon meg: ");
            dobásokSzáma = sc.nextInt();
        }
    }
    
}