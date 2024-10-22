// package com.demo_thymeleaf.pj_thymeleaf.models;

// import jakarta.persistence.*;
// import jakarta.validation.constraints.Size;
// import lombok.AllArgsConstructor;
// import lombok.Data;
// import lombok.NoArgsConstructor;

// @Entity
// @Table( name = "CUSTOMER" )
// @AllArgsConstructor
// @NoArgsConstructor
// @Data
// public class ModelCustomer {

//     @Id
//     @GeneratedValue( strategy = GenerationType.AUTO )
//     @Column( name = "CUS_ID" )
//     private Long customerId;

//     @Column( name = "CUS_DNI" )
//     @Size( min = 7 )
//     private String customerDNI;

//     @Column( name = "CUS_NAME" )
//     @Size( min = 5, message = "El nombre debe tener al menos 5 caracteres" )
//     private String customerName;

//     @Column( name = "CUS_LAST_NAME" )
//     private String customerLastName;

//     @Column( name = "CUS_PHONE" )
//     @Size( min = 9, message = "El telefono debe ser valido" )
//     private String customerPhone;
// }
