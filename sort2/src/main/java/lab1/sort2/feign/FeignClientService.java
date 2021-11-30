package lab1.sort2.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yunfeisong
 */
@FeignClient("output-service")
public interface FeignClientService {
    @RequestMapping(value = "/outputFile",method = RequestMethod.GET)
    String outputFile(@RequestParam("inputFile") String inputFile);
}
