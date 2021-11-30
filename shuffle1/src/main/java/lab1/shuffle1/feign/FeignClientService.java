package lab1.shuffle1.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yunfeisong
 */
@FeignClient("sort-service")
public interface FeignClientService {
    @RequestMapping(value = "/sortFile",method = RequestMethod.GET)
    String sortFile(@RequestParam("inputFile") String inputFile);
}
