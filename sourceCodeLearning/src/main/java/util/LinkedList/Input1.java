package util.LinkedList;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Input1 {

    public static void main(String[] args)throws IOException
    {
        Scanner sf = new Scanner(new File("/Users/zenmen/Documents/media_source.txt"));
//        int maxInd = -1;
//        String text[] =new String[2000];
        String text = "";
        while(sf.hasNext())
        {
//            maxInd++;
//            text[maxInd] = sf.nextLine().toLowerCase();
            text = text+sf.nextLine().toLowerCase();

        }
        sf.close();
//        for(int j = 0; j<=maxInd;j++)
//        {
            System.out.println((text));
//        }

        List<Character> list = new List<>();

        for (Character i : text.toCharArray()){
            list.InsertAfter(i);
            System.out.print(i);
        }



//        for (String str: Arrays.asList(text)) {
//            list.InsertAfter(str);
//        }
//        for (char i : list.toString().toCharArray()){
//            System.out.print(i);
//        }
        Scanner rbReader = new Scanner(System.in);
        System.out.println("Please enter in a pattern: ");
        String inputString = rbReader.next();

        List<Character> pat = new List<>();
        for (Character str: inputString.toCharArray()) {
            pat.InsertAfter(str);
        }


        //Brute force
        System.out.println("pattern searching in Brute force:");
        long startTime = System.nanoTime();

        boolean found = false;
        for (int i = 0; i < list.GetSize() - pat.GetSize(); i++) {
            int j = 0;
            while ((j < pat.GetSize()) && (list.get(i+j).equals(pat.get(j)))) {
                j++;
            }
            if (j == pat.GetSize()) {
                System.out.println("\nMatch found at index " + i);
                found = true;
            }
        }
        if (found == false) {
            System.out.println("String not found");
        }
        long endTime = System.nanoTime();

        System.out.println("Total execution time for algorithm 1: " + (endTime - startTime) + " ns");


    }
}