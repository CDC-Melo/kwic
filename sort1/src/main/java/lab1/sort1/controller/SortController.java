package lab1.sort1.controller;

import lab1.sort1.feign.FeignClientService;
import lab1.sort1.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yunfeisong
 */
@RestController
public class SortController {
    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    SortService sortService;

    @Autowired
    FeignClientService feignClientService;

    @RequestMapping(value = "sortFile", method = RequestMethod.GET)
    public String service(@RequestParam("inputFile") String input) {
        String sortString = sortService.sort(input);
        String res = feignClientService.outputFile(sortString);
        return "sort2:" + sortService.sort(input) + "res2:" + res;
    }
}
