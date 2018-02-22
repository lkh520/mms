/**
 * project : mms-web
 * package : com.mms.contrl.internal
 * fileName: HelloWorldController.java
 * createAt:2018年2月9日 上午1:41:16
 * createBy:lkh
 */
package com.mms.Controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lkh
 *
 */
@RestController
public class GreetingController {
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
	@RequestMapping("/test")
	public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
		return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
	}
}
