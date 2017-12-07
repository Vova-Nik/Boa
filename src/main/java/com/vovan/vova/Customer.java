package com.vovan.vova;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="vtitle")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    //@Column
    private Long id;

    @Column
    private String title;

    @Column
    private String surename;

    @Column
    private String mail;

    @Column
    private String password;

    @Column
    private int price;

    protected Customer() {}

    public Customer(String t, int p) {
        this.title = t;
        this.price = p;
    }
    public Customer(String t, String p, String sn, String m, String pw) {
        this.title = t;
        this.price = Integer.parseInt(p);
        this.surename = sn;
        this.mail = m;
        this.password = pw;
    }
    public Customer(String t, String p, String sn) {
        this.title = t;
        this.price = Integer.parseInt(p);
        this.surename = sn;
    }

    public Customer(String t, String p) {
        this.title = t;
        this.price = Integer.parseInt(p);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", surename='" + surename + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", price=" + price +
                '}';
    }
}