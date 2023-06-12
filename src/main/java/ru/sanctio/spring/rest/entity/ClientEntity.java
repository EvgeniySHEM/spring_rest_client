package ru.sanctio.spring.rest.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

@Data
//@XmlRootElement
public class ClientEntity implements Serializable {
    private int clientid;
    private String clientName;
    private String type;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date added;
    private List<AddressEntity> addresses = new ArrayList<>();
}
