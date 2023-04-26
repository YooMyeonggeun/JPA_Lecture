package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable // 어딘가에 내장이 될수 있다
@Getter
//@NoArgsConstructor
public class Address {

    private String city;
    private String street;
    private String zipcode;

    protected Address(){
        
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
