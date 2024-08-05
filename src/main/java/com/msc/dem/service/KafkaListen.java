package com.msc.dem.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListen {

    @KafkaListener(topics="EmployeeLocation", groupId="group1")
    public String consume(String location){
        System.out.println("Location received: "+location);
        return "Location received"+location;
    }
}
