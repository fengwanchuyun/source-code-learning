package util;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Input1 {

    public static void main(String[] args)throws IOException
    {
        Scanner sf = new Scanner(new File("/Users/zenmen/Documents/media_source.txt"));
        int maxInd = -1;
        String text[] =new String[20];

        while(sf.hasNext())
        {
            maxInd++;
            text[maxInd] = sf.nextLine();

        }
        sf.close();
        for(int j = 0; j<=maxInd;j++)
        {
            System.out.println((text[j].toLowerCase()));
        }
        List<String> list = new List<>();

        for (String str: Arrays.asList(text)) {
            list.InsertAfter(str);
        }

        System.out.println(list.toString());
        LinkedList<String> strings = new LinkedList<>();
        strings.get(1);
    }
}