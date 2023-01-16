import java.util.HashSet;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<Integer>();
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        Integer[] arr = new Integer[7];
        arr[0] = 41;
        arr[1] = 5336;
        arr[2] = 7665;
        arr[3] = 21;
        arr[4] = 944;
        arr[5] = 703456;
        arr[6] = 9662;

        double startzeit;
        double endzeit;


        Random rand = new Random();

        startzeit = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            hashSet.add(rand.nextInt(100000000) + 1);
        }
        endzeit = System.currentTimeMillis();
        System.out.println("HashSet benötigt " + (endzeit-startzeit) + " Millisekunden zum Befüllen und ");
        startzeit = System.currentTimeMillis();
        for (int wert : arr) {
            if (wert % 2 == 0) {
                hashSet.remove(wert);
            } else {
                hashSet.add(wert);
            }
        }
        endzeit = System.currentTimeMillis();
        System.out.println((endzeit-startzeit) + " Millisekunden für die Einfüge- und Löschoperationen.");


        startzeit = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            treeSet.add(rand.nextInt(100000000) + 1);
        }
        endzeit = System.currentTimeMillis();
        System.out.println("TreeSet benötigt " + (endzeit-startzeit) + " Millisekunden zum Befüllen und ");
        startzeit = System.currentTimeMillis();
        for (int wert : arr) {
            if (wert % 2 == 0) {
                treeSet.remove(wert);
            } else {
                treeSet.add(wert);
            }
        }
        endzeit = System.currentTimeMillis();
        System.out.println((endzeit-startzeit) + " Millisekunden für die Einfüge- und Löschoperationen.");

        startzeit = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(rand.nextInt(100000000) + 1);
        }
        endzeit = System.currentTimeMillis();
        System.out.println("ArrayList benötigt " + (endzeit-startzeit) + " Millisekunden zum Befüllen und ");
        startzeit = System.currentTimeMillis();
        for (int wert : arr) {
            if (wert % 2 == 0) {
                arrayList.remove((Integer) wert);
            } else {
                arrayList.add(wert);
            }
        }
        endzeit = System.currentTimeMillis();
        System.out.println((endzeit-startzeit) + " Millisekunden für die Einfüge- und Löschoperationen.");


        startzeit = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(rand.nextInt(100000000) + 1);
        }
        endzeit = System.currentTimeMillis();
        System.out.println("LinkedList benötigt " + (endzeit-startzeit) + " Millisekunden zum Befüllen und ");
        startzeit = System.currentTimeMillis();
        for (int wert : arr) {
            if (wert % 2 == 0) {
                linkedList.remove((Integer) wert);
            } else {
                linkedList.add(wert);
            }
        }
        endzeit = System.currentTimeMillis();
        System.out.println((endzeit-startzeit) + " Millisekunden für die Einfüge- und Löschoperationen.");

        Rechteck r1 = new Rechteck(2,1);
        Rechteck r2 = new Rechteck(2,2);
        Rechteck r3 = new Rechteck(2,1);
        HashSet<Rechteck> rechteckSet = new HashSet<Rechteck>();
        rechteckSet.add(r1);
        rechteckSet.add(r2);
        rechteckSet.add(r3);
        System.out.println("\n");
        System.out.println(rechteckSet);
    }
}