package org.dani.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("registry-eureka-client2")
public interface Service2Client {
    @GetMapping(value = "/hello")
    String hello();
}
