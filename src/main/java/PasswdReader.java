import org.javatuples.Septet;
import org.javatuples.Sextet;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PasswdReader {


    public void getUsers(String passwdPath){
        File file = new File(passwdPath);
        List<Sextet> users = new ArrayList<>();
        Scanner sc;
        try {
            sc = new Scanner(file);
            Septet<String,String,Integer,Integer,String,String,String> septet;
            sc.useDelimiter(":");
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }

        } catch (Exception e){
            System.out.println(e.getStackTrace());
        }

    }

    public static void main(String[] args){
        PasswdReader pr = new PasswdReader();
        pr.getUsers("C:/Users/grecinto/Desktop/test");
    }


}
