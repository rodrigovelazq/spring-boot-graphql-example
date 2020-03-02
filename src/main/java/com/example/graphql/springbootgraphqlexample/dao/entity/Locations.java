package com.example.graphql.springbootgraphqlexample.dao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@Entity
public class Locations implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "code", nullable = false)
    private String code;
    
    @Column(name = "latitude")
    private String latitude;
    
    @Column(name = "longitude")
    private String longitude;

}
