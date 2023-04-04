package com.example.BootcampMsMobileApp.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("yanki")
public class Yanki{

	@Id
    String id;
    String documentNumber;
    String phoneNumber;
    String phoneIMEI;
    String email;
    String cardNumber;
    Double balance;

}
