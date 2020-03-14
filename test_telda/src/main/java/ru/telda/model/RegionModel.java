package ru.telda.model;


public class RegionModel {

    private int id;
    private String name;
    private String shortName;

    public RegionModel(int id,String name, String shortName) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Override
    public String toString() {
        return "RegionModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                '}';
    }
}
