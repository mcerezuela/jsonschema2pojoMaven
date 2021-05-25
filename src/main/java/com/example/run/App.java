package com.example.run;

import com.example.types.Car;
import com.example.types.Demo;
import com.example.yaml.common.Common;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class App {
    public static void main(String[] args){
        try{
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<Demo> ref = new TypeReference<>() {};
            InputStream in = new FileInputStream("src/main/resources/json/demo.json");
            Demo demo = mapper.readValue(in, ref);
            System.out.println( "Person name:"+demo.getPerson().getName() );
            List<Car> cars = demo.getPerson().getCars().getCar();
            for(Car c : cars) {
                System.out.println("Car brand is "+c.getBrand());
            }
            YAMLFactory yaml = new YAMLFactory();
            ObjectMapper mapper2 = new ObjectMapper(yaml);
            TypeReference<Common> ref2 = new TypeReference<>() {};
            InputStream in2 = new FileInputStream("src/main/resources/yaml/common.yaml");
            Common demo2 = mapper2.readValue(in2, ref2);
            System.out.println("Common: " + demo2.toString());
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
