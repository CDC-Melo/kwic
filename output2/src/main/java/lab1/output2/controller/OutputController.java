package lab1.output2.controller;

import lab1.output2.service.OutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author yunfeisong
 */
@RestController
public class OutputController {
    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    OutputService outputService;

    @RequestMapping(value = "outputFile", method = RequestMethod.GET)
    public String service(@RequestParam("inputFile") String input) throws IOException {
        outputService.outputFile(input);
        return "output2\t" + input;
    }
}
