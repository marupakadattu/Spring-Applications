package com.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {
	@NotBlank(message = "Name is mandatory")
    @Size(min = 5,max=25)
    private String uname;

 

    @NotBlank(message = "Email is mandatory")
    private String email;

 

    @NotBlank(message = "password is mandatory")

 

    private String pass;

 

    @NotBlank(message = "password is mandatory")

 

    private String conpass;

 

    @Size(min = 1, max = 10, message = "required")

 

    private String phn;

 

    @NotBlank(message = "gender is mandatory")

 

    private String gender;

 

    @NotBlank(message = "address is mandatory")

 

    private String address;

 

    @NotBlank(message = "country is mandatory")

 

    private String country;

 

    public String getUname() {
        return uname;
    }

 

    public void setUname(String uname) {
        this.uname = uname;
    }

 

    public String getEmail() {
        return email;
    }

 

    public void setEmail(String email) {
        this.email = email;
    }

 

    public String getPass() {
        return pass;
    }

 

    public void setPass(String pass) {
        this.pass = pass;
    }

 

    public String getConpass() {
        return conpass;
    }

 

    public void setConpass(String conpass) {
        this.conpass = conpass;
    }

 

    public String getPhn() {
        return phn;
    }

 

    public void setPhn(String phn) {
        this.phn = phn;
    }

 

    public String getGender() {
        return gender;
    }

 

    public void setGender(String gender) {
        this.gender = gender;
    }

 

    public String getAddress() {
        return address;
    }

 

    public void setAddress(String address) {
        this.address = address;
    }

 

    public String getCountry() {
        return country;
    }

 

    public void setCountry(String country) {
        this.country = country;
    }
 

}
