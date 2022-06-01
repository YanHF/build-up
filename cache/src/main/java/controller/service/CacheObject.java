package controller.service;

import org.springframework.stereotype.Service;

@Service
public class CacheObject {

   public String get(String key){
        return String.valueOf(System.currentTimeMillis());
    }
}
