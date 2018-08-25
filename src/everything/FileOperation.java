package everything;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileOperation {

    public static void main(String[] args) {

        FileReader fr = null;
        BufferedReader br = null;
        String path = "/Users/mdtaque/eclipse-workspace/file.txt";

        try{
            fr = new FileReader(path);
        }catch (Exception e){
            System.out.println("File is not found");
        }

        try{
            br = new BufferedReader(fr);
            String data = "";
            while((data=br.readLine())!= null){
                System.out.println(data);
            }
        }catch(Exception e){
            System.out.println("File is not readable");
        }
    }
}
