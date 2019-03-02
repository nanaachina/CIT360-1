/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QCJSONattempt;

import java.io.Serializable;
import java.util.Objects;

public class Guest implements Serializable {

    private String firstName;
    private String lastName;
    private int guestid;
    private int age;

    public Guest() {
    }

    public Guest(String firstName, String lastName, int guestId, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.guestid = guestId;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getguestId() {
        return guestid;
    }

    public void setguestId(int guestId) {
        this.guestid = guestId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.firstName);
        hash = 61 * hash + Objects.hashCode(this.lastName);
        hash = 61 * hash + this.guestid;
        hash = 61 * hash + this.age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Guest other = (Guest) obj;
        if (this.guestid != other.guestid) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Guest{" + "firstName=" + firstName + ", lastName=" + lastName + ", guestId=" + guestid + ", age=" + age + '}';
    }

}
