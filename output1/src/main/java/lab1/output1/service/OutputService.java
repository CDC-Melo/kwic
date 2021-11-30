package lab1.output1.service;

import org.springframework.stereotype.Service;

import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 * @author yunfeisong
 */
@Service
public class OutputService {
    public String outputFile(String input) throws IOException {
        input = input.replace(",", "\n");
        String path = "/Users/yunfeisong/Desktop/res1.txt";
        File file = new File(path);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        file.createNewFile();
        // write 解决中文乱码问题
        // FileWriter fw = new FileWriter(file, true);
        OutputStreamWriter fw = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(input);
        bw.flush();
        bw.close();
        fw.close();

        return "output1成功生成文件";
    }
}
