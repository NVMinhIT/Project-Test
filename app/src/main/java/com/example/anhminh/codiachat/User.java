package com.example.anhminh.codiachat;

public class User {

    public String Username;
    public String Password;
    public String Display;

   public User(){

   }
    public User(String Username,String Password, String Display) {
       this.Username=Username;
       this.Password=Password;
       this.Display=Display;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getDisplay() {
        return Display;
    }

    public void setDisplay(String display) {
        Display = display;
    }

}