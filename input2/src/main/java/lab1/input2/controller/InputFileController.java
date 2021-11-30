package lab1.input2.controller;

import lab1.input2.feign.FeignClientService;
import lab1.input2.service.InputService;
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
public class InputFileController {
    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    InputService inputService;

    @Autowired
    FeignClientService feignClientService;

    @RequestMapping(value = "initFile", method = RequestMethod.GET)
    public String service(@RequestParam("inputFile") String input) {
        String data = inputService.readTxtFile(input);
        String shuffleString = feignClientService.shuffleFile(data);
        return "input2处理了这个请求, shuffle后的文件为:" + shuffleString;
    }
}
