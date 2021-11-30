package lab1.sort1.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author yunfeisong
 */
@Service
public class SortService {
    public String sort(String input){
        List<String> lines = Arrays.asList(input.split(","));
        Collections.sort(lines);
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < lines.size();i++){
            sb.append(lines.get(i)).append(",");
        }

        sb.deleteCharAt(sb.length()-1);

        return sb.toString();
    }
}
