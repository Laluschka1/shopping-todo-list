package de.main;

import java.util.Scanner;

public class Abfrage {
    public static Liste myList = new Liste("MyList");

    public static void abfrage(){
        System.out.println("hinzutun (1), Liste entfernen (2)");

        Scanner scan = new Scanner(System.in);

        String scan_ergebniss;
        scan_ergebniss = scan.nextLine();

        switch (scan_ergebniss){
            case "1":
                onClear();
                System.out.println("Was wollen sie kaufen?");
                String objekt;
                objekt = scan.nextLine();
                if(objekt != null){
                    myList.add(objekt);
                    onClear();
                    myList.print();
                    System.out.println("  ");
                    abfrage();
                }
                break;
            case "2":
                onClear();
                myList.delete();
                abfrage();
                break;
        }

    }
    public static void onClear(){
        for (int i = 0; i < 250; i++){
            System.out.println("  ");
        }
    }


}
