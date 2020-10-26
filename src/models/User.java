package models;

public class User {

    private int id;
    private String name;
    private String phone;

    public User()
    {
        this.id = 0;
        this.name = "Unknown";
        this.phone = "Unknown";
    }

    public User(int id, String name, String phone){
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
}
