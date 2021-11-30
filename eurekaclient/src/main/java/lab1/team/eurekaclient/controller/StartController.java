package lab1.team.eurekaclient.controller;

import lab1.team.eurekaclient.feign.FeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yunfeisong
 */
@RestController
public class StartController {
    @Autowired
    FeignClientService feignClientService;

    @RequestMapping(value = "start", method = RequestMethod.GET)
    public String start(@RequestParam("path") String path) {
        System.out.println("Eureka Client正在工作,向input service发送文件路径:" + path);
        return feignClientService.inputFile(path);
    }
}
