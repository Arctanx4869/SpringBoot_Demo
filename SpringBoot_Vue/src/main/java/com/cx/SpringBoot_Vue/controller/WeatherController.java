package com.cx.SpringBoot_Vue.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("city")
public class WeatherController {

    @GetMapping("find")
    @CrossOrigin
    public Map<String,String> findWeatherByCity(String name){
        Map<String,String> map =new HashMap<>();
        String weather = getWeahters(name);
        map.put("msg",weather);
        return map;
    }

    public String getWeahters(String name){
        Map<String,String> weathers = new HashMap<>();
        weathers.put("北京","晴天");
        weathers.put("上海","阴天");
        weathers.put("深圳","雨天");
        weathers.put("广州","多云");
        weathers.put("天津","小雪");
        return weathers.get(name);
    }
}
