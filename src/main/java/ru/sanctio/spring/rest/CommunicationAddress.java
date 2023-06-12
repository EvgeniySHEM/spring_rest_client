package ru.sanctio.spring.rest;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ru.sanctio.spring.rest.entity.AddressEntity;
import ru.sanctio.spring.rest.entity.Employee;

import java.util.List;

@Component
public class CommunicationAddress {
    private final RestTemplate restTemplate;
    private final String URL = "http://localhost:8080/jakarta_laba_hib-1.0-SNAPSHOT/api/address";

    public CommunicationAddress(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<AddressEntity> getAllAddress() {
        ResponseEntity<List<AddressEntity>> responseEntity =
                restTemplate.exchange(URL, HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<AddressEntity>>() {
                        });
        List<AddressEntity> allAddress = responseEntity.getBody();
        return allAddress;
    }

    public AddressEntity getAddress(String id) {
        return restTemplate.getForObject(URL + "/" + id, AddressEntity.class);
    }

    public void addNewAddress(AddressEntity address, String clientId) {
            ResponseEntity<String> responseEntity =
                    restTemplate.postForEntity(URL + "/" + clientId, address, String.class);
            System.out.println("New address was added to DB");
    }

    public void updateAddress(AddressEntity address) {
        restTemplate.put(URL, address);
        System.out.println("Address with ID = " + address.getId() + " was updated");
    }

    public void deleteAddress(int id, int id2) {
        restTemplate.delete(URL + "/" + id + "/" + id2);
        System.out.println("Employee with ID = " + id + " was deleted from DB");
    }


}
