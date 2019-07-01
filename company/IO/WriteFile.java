package com.company.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public void WriteFile(){

        try {
            File f = new File("/Users/mirannaalina/IdeaProjects/HeadFirst/practice/src/com/company/IO");

            f.createNewFile();

            FileWriter fw = new FileWriter(f);

            fw.write("test");
            fw.flush();
            fw.close();
        }catch(IOException ee){
            System.out.println("I didn't found the file");
        }


    }
}
