package com.wadpam.ricotta.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.google.appengine.api.datastore.Key;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"token", "language", "country", "version"})})
public class Translation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Key    key;

    String local;

    // ManyToOne
    @Basic
    Key    token;

    // ManyToOne
    @Basic
    Key    language;

    // ManyToOne
    @Basic
    Key    country;

    // ManyToOne
    @Basic
    Key    version;

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Key getToken() {
        return token;
    }

    public void setToken(Key token) {
        this.token = token;
    }

    public Key getLanguage() {
        return language;
    }

    public void setLanguage(Key language) {
        this.language = language;
    }

    public Key getCountry() {
        return country;
    }

    public void setCountry(Key country) {
        this.country = country;
    }

    public Key getVersion() {
        return version;
    }

    public void setVersion(Key version) {
        this.version = version;
    }

}
