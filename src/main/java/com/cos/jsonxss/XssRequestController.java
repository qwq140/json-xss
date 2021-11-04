package com.cos.jsonxss;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class XssRequestController {

    @PostMapping("/xss")
    public @ResponseBody RequestDto xss (@RequestBody RequestDto requestDto){
      log.info("requestDto={}", requestDto.getRequestDate());
      return requestDto;
    }

}
