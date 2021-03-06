package ru.job4j.pojo;

import java.util.Date;
import java.util.Objects;

public class License {
    private String owner;
    private String model;
    private String code;
    private Date created;
    private int group;
    private String name, date;

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof License)) return false;
        License license = (License) o;
        return getGroup() == license.getGroup() &&
                Objects.equals(getOwner(), license.getOwner()) &&
                Objects.equals(getModel(), license.getModel()) &&
                Objects.equals(getCode(), license.getCode()) &&
                Objects.equals(getCreated(), license.getCreated()) &&
                Objects.equals(getName(), license.getName()) &&
                Objects.equals(getDate(), license.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOwner(), getModel(), getCode(), getCreated(), getGroup(), getName(), getDate());
    }
}
