package com.upadhyde.android.utils;

import android.os.Environment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderUtils {

    private final static int HEADER_TEXT_FILE = 223;
    private final static String TEXT_FILE_ROW_SEPERATER = "!";


    public static String[] readFile(String fileName) {
        File sdcard = Environment.getExternalStorageDirectory();
        File file = new File(sdcard, fileName);
        StringBuilder text = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                text.append(line);
                text.append('!');
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return text.toString().substring(HEADER_TEXT_FILE).split(TEXT_FILE_ROW_SEPERATER);

    }
}
