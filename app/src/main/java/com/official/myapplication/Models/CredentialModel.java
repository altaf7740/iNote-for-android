package com.official.myapplication.Models;

public class CredentialModel {
    String username, website;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public CredentialModel(String username, String website) {
        this.username = username;
        this.website = website;
    }
}
