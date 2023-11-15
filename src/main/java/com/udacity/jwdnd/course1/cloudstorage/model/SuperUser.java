package com.udacity.jwdnd.course1.cloudstorage.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SuperUser implements UserDetails {
    private int userid;
    private String username;
    private String salt = "";
    private String password;
    private String firstname;
    private String lastname;
    private Boolean enabled = true;
    private String role = "USER";

    @Override
    public Collection<GrantedAuthority> getAuthorities(){
        List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
        grantedAuthorities.add(new SimpleGrantedAuthority(role));
        return grantedAuthorities;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired(){
        return enabled;
    }

    @Override
    public boolean isAccountNonLocked(){
        return enabled;
    }

    @Override
    public boolean isCredentialsNonExpired(){
        return enabled;
    }

    @Override
    public boolean isEnabled(){
        return enabled;
    }

    public void setPassword(String encodedPassword) {
        this.password = encodedPassword;
    }

    public int getUserid() {
        return this.userid;
    }

    public void setEnabled(boolean b) {
        this.enabled = enabled;
    }

    public void setRole(String user) {
        this.role = user;
    }
}
