package com.tr.demo.controller;

import com.tr.demo.dto.ResultDTO;
import com.tr.demo.service.IProcessService;
import com.tr.demo.util.ApplicationContextProvider;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/process")
public class ProcessController {

    @PostMapping
    public ResultDTO process(@RequestBody String process) {
        IProcessService processService = (IProcessService) ApplicationContextProvider.getBean(process);
        processService.process();
        return ResultDTO.success(true);
    }
}
