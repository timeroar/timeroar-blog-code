package com.timeroar.blog.design.prototype;

import java.io.*;
import java.util.List;

/**
 * <p>OldDomain</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/12/23 23:34
 */
public class NewDomain implements Cloneable,Serializable {

    /** 名字 */
    private String name;

    /** 年龄 */
    private String age;

    /** 地址 */
    private String address;

    /** 电话 */
    private String phone;

    /** 身份证 */
    private String idCard;

    /** 车 */
    private List<String> cars;

    @Override
    protected NewDomain clone() throws CloneNotSupportedException {
        return (NewDomain) super.clone();
    }

    public NewDomain deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return (NewDomain) objectInputStream.readObject();
    }

    public List<String> getCars() {
        return cars;
    }

    public void setCars(List<String> cars) {
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "NewDomain{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", idCard='" + idCard + '\'' +
                ", cars=" + cars +
                '}';
    }
}
