/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author dellpc
 */
public class FilePROIFILEutil {

    public static PROFILEVO getprofile() {
        PROFILEVO profile = null;
        try {
            System.out.println("START");
            //WRITE FILE 

            FileWriter fw = new FileWriter("c:\\DATA\\testdata1.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hari");
            bw.write(" ; ");
            bw.write("Patel");
            bw.write(" ; ");
            bw.write("haripatel@gmail.com");
            bw.write(" ; ");
            bw.write("847-878-4489");
            bw.write(" ; ");
            bw.write("Engineer1");
            bw.write(" ; ");
            bw.write("11");
            bw.write(" ; ");
            bw.write("31");
            bw.write(" ; ");
            bw.write("USA");
            bw.write(" ; ");
            bw.write("123,main Street");
            bw.write(" ; ");
            bw.write("abcd");
            bw.write(" ; ");
            bw.write("103");
            bw.write(" ; ");
            bw.write("Schamburg");
            bw.write(" ; ");
            bw.write("IL");
            bw.write(" ; ");
            bw.write("60173");
            bw.close();
            fw.close();

            //READ FILE
            FileReader fr = new FileReader("c:\\DATA\\testdata1.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            String data[] = line.split(" ; ");
            System.out.println(data[0]);
            System.out.println(data[1]);
            System.out.println(data[2]);
            System.out.println(data[3]);
            System.out.println(data[4]);
            System.out.println(data[5]);
            System.out.println(data[6]);
            System.out.println(data[7]);
            System.out.println(data[8]);
            System.out.println(data[9]);
            System.out.println(data[10]);
            System.out.println(data[11]);
            System.out.println(data[12]);
            System.out.println(data[13]);
            
            profile = new PROFILEVO();
            profile.setFirstname(data[0]);
            profile.setLastname(data[1]);
            profile.setEmail(data[2]);
            profile.setPhonenumber(data[3]);
            profile.setPwd(data[4]);
            profile.setMonth(data[5]);
            profile.setDay(data[6]);
            profile.setCountry(data[7]);
            profile.setAdd(data[8]);
            profile.setStreetadd(data[9]);
            profile.setAppt(data[10]);
            profile.setCity(data[11]);
            profile.setState(data[12]);
            profile.setZipcode(data[13]);

            System.out.println(profile);
            System.out.println(line);
            br.close();
            fr.close();

            System.out.println("File Created");
        } catch (IOException e) {
            System.out.println("Exception");
            e.printStackTrace();

        } finally {
            System.out.println("FINAllY");
        }
        return profile;
    }

}
