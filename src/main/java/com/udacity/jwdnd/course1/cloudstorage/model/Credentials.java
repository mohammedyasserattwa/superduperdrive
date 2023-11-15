package com.udacity.jwdnd.course1.cloudstorage.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Credentials {
    private int credentialid;
    private String url;
    private String username;
    private String key;
    private String password;

    public int getCredentialid() {
        return this.credentialid;
    }

    public String getUrl(){
        return this.url;
    }

    public String key(){
        return this.key;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String s) {
        this.password = s;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return this.key;
    }
}