package lab1.team.eurekaclient.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yunfeisong
 */
@FeignClient("input-service")
public interface FeignClientService {
    @RequestMapping(value = "/initFile",method = RequestMethod.GET)
    String inputFile(@RequestParam("inputFile") String inputFile);
}
