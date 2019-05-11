package com.datawisher.highlight.springmvc5.web;

import com.datawisher.highlight.springmvc5.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConverterController {

    @RequestMapping(value = "/convert", produces = { "application/x-wisely" })
    @ResponseBody
    public DemoObj convert(@RequestBody DemoObj demoObj) {
        return demoObj;
    }
}
