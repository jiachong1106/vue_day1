package com.jc.vue_day1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/city")
public class CityController {
    @RequestMapping("/find")
    public Map<String,String> findWeatherByCity(String name){
        Map<String, String> map = new HashMap<>();
        String weather = getWeather(name);
        map.put("message",weather);
        return map;
    }
    public String getWeather(String name){
        Map<String, String> weather = new HashMap<>();
        weather.put("北京","晴转多云，空气清新");
        weather.put("上海","多云转晴，空气质量不错");
        weather.put("深圳","中到暴雨，空气很好新");
        weather.put("广州","大风，空气还行");
        weather.put("天津","跟北京差不多");
        return weather.get(name);
    }
}