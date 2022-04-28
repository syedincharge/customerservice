package com.rizvi.spring.entity;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import java.io.Serializable;
import java.math.BigInteger;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@IdClass(CustomerId.class)
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Customer implements Serializable {


        @Id
        private Long customerId; // (PK)
       // @Id
        private Long bookId;  // (FK)
        private String customerName;

//        @JsonCreator
//        public Customer( @JsonProperty("customerId")  Long customerId,  @JsonProperty("bookId") Long  bookId,  @JsonProperty("customerName")  String customerName) {
//                this.customerId = customerId;
//                this.bookId = bookId;
//                this.customerName = customerName;
//        }
}
