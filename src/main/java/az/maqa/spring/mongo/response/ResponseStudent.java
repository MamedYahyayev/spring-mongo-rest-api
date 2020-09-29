package az.maqa.spring.mongo.response;

import java.util.HashMap;

public class ResponseStudent {

    private String id;

    private String name;

    private String surname;

    private Integer age;

    private String email;

    private HashMap features;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public HashMap getFeatures() {
        return features;
    }

    public void setFeatures(HashMap features) {
        this.features = features;
    }
}
