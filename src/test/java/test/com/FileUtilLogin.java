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
public class FileUtilLogin {
    
    public static LoginVO getLogin(){  
    LoginVO login=null; 
   try {
            System.out.println("START");
            //WRITE FILE 

            FileWriter fw = new FileWriter("c:\\DATA\\testdata2.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("sija_r@yahoo.co.in");
            bw.write(" ; ");
            bw.write("Engineer1");
            bw.close();
            fw.close();

            //READ FILE
            FileReader fr = new FileReader("c:\\DATA\\testdata2.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            String data[] = line.split(" ; ");
            System.out.println(data[0]);
            System.out.println(data[1]);
            login = new LoginVO();
            login.setUsername(data[0]);
            login.setPassword(data[1]);

            System.out.println(login);
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
   return login;
  }


}
