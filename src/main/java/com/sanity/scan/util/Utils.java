package com.sanity.scan.util;

import org.springframework.web.bind.annotation.PathVariable;
import java.io.IOException;

public class Utils {
    public static String runCommand(@PathVariable String cmd) throws IOException {
        byte[] buf = new byte[1024];
        int len = Runtime.getRuntime().exec(cmd).getInputStream().read(buf);
        return new String(buf, 0, len);
    }
}
