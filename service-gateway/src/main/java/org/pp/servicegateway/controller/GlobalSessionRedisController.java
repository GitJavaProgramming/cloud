package org.pp.servicegateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController("session")
public class GlobalSessionRedisController {

    @PutMapping("put")
    public Map<String, Object> putSession(HttpSession session, @RequestParam("key") String key
            , @RequestParam("value") String value) {
        Map<String, Object> map = new HashMap<>();
        session.setAttribute(key, value);
        map.put("id", session.getId());
        map.put("session", value);
        return map;
    }

    @GetMapping("get")
    public Map<String, Object> getSession(HttpSession session, @RequestParam("key") String key) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", session.getId());
        map.put("session", session.getAttribute(key));
        return map;
    }

}
