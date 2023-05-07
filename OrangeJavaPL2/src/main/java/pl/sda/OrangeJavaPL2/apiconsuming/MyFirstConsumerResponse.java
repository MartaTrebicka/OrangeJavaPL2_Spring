package pl.sda.OrangeJavaPL2.apiconsuming;

//    {
//        "activity": "Take a caffeine nap",
//            "type": "relaxation",
//            "participants": 1,
//            "price": 0.1,
//            "link": "",
//            "key": "5092652",
//            "accessibility": 0.08

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MyFirstConsumerResponse {

   private String activity;
   private String type;
   private Integer participants;
   private Double price;
   private String link;
   private String key;
   private Double accessibility;


    }












