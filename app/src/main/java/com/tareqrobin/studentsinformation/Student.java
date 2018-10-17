package com.tareqrobin.studentsinformation;



public class Student {
    String name;
    int roll;
    String section;
    int image;

    public Student(String name, int roll, String section, int image) {
        this.name = name;
        this.roll = roll;
        this.section = section;
        this.image=image;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public String getSection() {
        return section;
    }
}
