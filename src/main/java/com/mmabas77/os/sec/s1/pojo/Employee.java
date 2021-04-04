package com.mmabas77.os.sec.s1.pojo;

public class Employee {

    private String name;
    private int age;
    private int hoursADay;
    private int days;
    private float hourPrice;

    public Employee(String name, int age, int hoursADay, int days, float hourPrice) {
        this.name = name;
        this.age = age;
        this.hoursADay = hoursADay;
        this.days = days;
        this.hourPrice = hourPrice;
    }

    public float getPayment() {
        int doubledHours = 0;
        if (hoursADay > 8)
            doubledHours += hoursADay - 8;
        int mainHours = hoursADay - doubledHours;

        return ((mainHours * hourPrice) + (2 * doubledHours * hourPrice)) * days;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHoursADay(int hoursADay) {
        this.hoursADay = hoursADay;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setHourPrice(float hourPrice) {
        this.hourPrice = hourPrice;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHoursADay() {
        return hoursADay;
    }

    public int getDays() {
        return days;
    }

    public float getHourPrice() {
        return hourPrice;
    }
}
