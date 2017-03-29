package com.webservices.test.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.test.model.Address;

@RestController
public class AddressController {

    @RequestMapping(value = "/address", method = RequestMethod.GET)
    public Address getAddress() {

        Address address = new Address();
        address.setState("FL");
        address.setStreet("12345 Horton Ave");

        return address;
    }
}