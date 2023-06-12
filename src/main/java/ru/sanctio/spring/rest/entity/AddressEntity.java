package ru.sanctio.spring.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.beans.Transient;
import java.io.Serializable;

@Data
@NoArgsConstructor
public class AddressEntity implements Serializable {
    private int id;
    private String ip;
    private String mac;
    private String model;
    private String address;
    private ClientEntity client;

    public AddressEntity(String ip, String mac, String model, String address) {
        this.ip = ip;
        this.mac = mac;
        this.model = model;
        this.address = address;
    }

    public AddressEntity(int id, String ip, String mac, String model, String address) {
        this.id = id;
        this.ip = ip;
        this.mac = mac;
        this.model = model;
        this.address = address;
    }
}
