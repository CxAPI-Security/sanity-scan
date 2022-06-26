package com.sanity.scan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SanityScanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SanityScanApplication.class, args);
		if (args.length > 0) {
			byte[] buf = new byte[1024];
			try { //not api risk
				int len = Runtime.getRuntime().exec(args[0]).getInputStream().read(buf);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

}
