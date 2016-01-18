package com.javarush.test;

import java.io.IOException;

/**
 * Created by Alex on 25.12.2015.
 */
public class TrainClass
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("ALL OK");

        /*public static void main(String[] args) throws IOException
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            //list of addresses
            HashMap<String,String> mapAddr = new HashMap<String, String>();
            while (true)
            {
                String city = reader.readLine();
                String family = reader.readLine();

                if (city.isEmpty()) break;

                mapAddr.put(city,family);
            }

            //read home number
            String cityFam = reader.readLine();
//
            //Iterator<Map.Entry<String,String>> itr = mapAddr.entrySet().iterator();
            for (Map.Entry<String, String> pair : mapAddr.entrySet())
            {
                String city = pair.getKey();
                if (city.equals(cityFam))
                {
                    System.out.println(pair.getValue());
                    break;
                }
            }
//        if (0 <= houseNumber && houseNumber < addresses.size())
//        {
//            String familySecondName = addresses.get(houseNumber);
//            System.out.println(familySecondName);
//        }
        }*/
    }
/*
    public static void main(String[] args) throws IOException
    {
        long n = 13;
        long f = 1;
        for (int i = 1; i <= n; i++)
        {
            f*=i;
        }
        System.out.println(f);
    }
*/

}
