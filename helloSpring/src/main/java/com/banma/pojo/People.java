package com.banma.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class People {
    @Autowired(required = false)//说明这个对象可以为null
    private Cat cat;
    @Autowired
    private Dog dog;
    private String name;


    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
