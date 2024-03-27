//package dev.waiyanhtet.mongocrud.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@Document(value = "address")
//public class Address {
//
//    @Id
//    private String id;
//    private String building;
//    private String street;
//    private String state;
//    private String city;
//
//    public static Address getAddress() {
//        return Address.builder().build();
//    }
//
//    public static Address getAddress(String building) {
//        return Address.builder().building(building).build();
//    }
//
//}
