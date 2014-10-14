/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author catherinehuh
 */
public class Account {

    private int id;
    private String accountName;
    private String landlordName;
    private String tenantName;
    private String propertyAddress;
    private String apartmentNumber;
    private String city;
    private String state;
    private String username;
    private String password;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getLandlordName() {
        return landlordName;
    }

    public void setLandlordName(String landlordName) {
        this.landlordName = landlordName;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean validate() {
        if (landlordName == null || landlordName.equals("")) {
            return false;
        }
        if (tenantName == null || tenantName.equals("")) {
            return false;
        }
        if (propertyAddress == null || propertyAddress.equals("")) {
            return false;
        }
        if (apartmentNumber == null || apartmentNumber.equals("")) {
            return false;
        }
        if (city == null || city.equals("")) {
            return false;
        }
        if (state == null || state.equals("")) {
            return false;
        }
        if (username == null || username.equals("")) {
            return false;
        }
        if (password == null || password.equals("")) {
            return false;
        }
        if (email == null || email.equals("")) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this != obj) {
            return false;
        }
        if (!(obj instanceof Account)) {
            return false;
        }
        Account account = (Account) obj;
        if (!this.accountName.equals(account.accountName)) {
            return false;
        }
        return false;
    }

}
