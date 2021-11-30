package lab1.shuffle2.controller;

import lab1.shuffle2.feign.FeignClientService;
import lab1.shuffle2.service.ShuffleService;
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
public class ShuffleController {
    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    ShuffleService shuffleService;

    @Autowired
    FeignClientService feignClientService;

    @RequestMapping(value = "shuffleFile", method = RequestMethod.GET)
    public String service(@RequestParam("inputFile") String input) {
        String shuffleString2 = shuffleService.shuffleFile(input);
        return "shuffle2:" + feignClientService.sortFile(shuffleString2);
    }
}
