package com.wangz.eurekaconsumer.fall;

import com.wangz.eurekaconsumer.service.TestService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class SysTestServerFallback implements FallbackFactory<TestService> {
    @Override
    public TestService create(Throwable throwable) {
        return new TestService() {
            @Override
            public String get(int id) {
                return throwable.getMessage();
            }
        };
    }
}
