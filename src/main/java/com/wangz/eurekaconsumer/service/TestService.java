package com.wangz.eurekaconsumer.service;

import com.wangz.eurekaconsumer.fall.SysTestServerFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "eureka-provider", fallback = SysTestServerFallback.class)
public interface TestService {
    @GetMapping(value = "/test/{id}" )
    String get(@PathVariable(name = "id") int id);
}
