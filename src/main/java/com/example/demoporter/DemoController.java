package com.example.demoporter;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * @author sa
 * @date 29.11.2021
 * @time 17:07
 */
@RestController
public class DemoController
{
    @GetMapping("api/test")
    public ResponseEntity<?> test()
    {
        return ResponseEntity.ok("it is working...");
    }

    @GetMapping("api/ip")
    public ResponseEntity<?> ip() throws Exception
    {
        URL whatismyip = new URL("http://checkip.amazonaws.com");
        BufferedReader in = new BufferedReader(new InputStreamReader(
                whatismyip.openStream()));

        String ip = in.readLine(); //you get the IP as a String

        return ResponseEntity.ok(ip);
    }
}
