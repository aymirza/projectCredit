package com.example.ServiceFirst;

import javax.persistence.*;

@Entity
@Table(name = "usercredit3")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "pasportsn")
    private String pasportSn;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "zarpplata")
    private Integer zarpPlata;
    @Column(name = "creditsummasi")
    private Integer creditSummasi;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public String getPasportSn() {
        return pasportSn;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getZarpPlata() {
        return zarpPlata;
    }

    public Integer getCreditSummasi() {
        return creditSummasi;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPasportSn(String pasportSn) {
        this.pasportSn = pasportSn;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setZarpPlata(Integer zarpPlata) {
        this.zarpPlata = zarpPlata;
    }

    public void setCreditSummasi(Integer creditSummasi) {
        this.creditSummasi = creditSummasi;
    }
}
