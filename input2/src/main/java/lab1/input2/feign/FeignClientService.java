package lab1.input2.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yunfeisong
 */
@FeignClient("shuffle-service")
public interface FeignClientService {
    @RequestMapping(value = "/shuffleFile",method = RequestMethod.GET)
    String shuffleFile(@RequestParam("inputFile") String inputFile);
}
