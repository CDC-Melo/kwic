package lab1.shuffle1.service;

import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author yunfeisong
 */
@Service
public class ShuffleService {
    public String shuffleFile(String input) {
        StringBuilder res = new StringBuilder();
        input = input.substring(0, input.length() - 1);
        String[] lines = input.split(",");
        //{"I love America","How much is it"}
        for (String line : lines) {
            line = line.trim();
            List<String> words = Arrays.asList(line.split("\\s+"));
            //{'I','love','America'}
            String reverse = getReverse(words);
            res.append(reverse);
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }

    public String getReverse(List<String> words) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            StringBuilder curLine = new StringBuilder();
            for (int index = i; index < words.size(); index++) {
                curLine.append(words.get(index)).append(" ");
            }

            for (int j = 0; j < i; j++) {
                curLine.append(words.get(j)).append(" ");
            }

            curLine.deleteCharAt(curLine.length() - 1);

            sb.append(curLine).append(",");
        }

        return sb.toString();
    }
}
