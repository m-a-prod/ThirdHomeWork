package com.example.botanicalbook;

public class Plant {
    private String name;
    private String plantDescription;
    private int plantResource;
    private String populationSize;

    public String getPlantDescription() {
        return plantDescription;
    }

    public void setPlantDescription(String plantDescription) {
        this.plantDescription = plantDescription;
    }

    public int getPlantResource() {
        return plantResource;
    }

    public void setPlantResource(int plantResource) {
        this.plantResource = plantResource;
    }
    public Plant(String name, String plantDescription, int plantResource, String populationSize) {
        this.name = name;
        this.plantDescription = plantDescription;
        this.plantResource = plantResource;
        this.populationSize = populationSize;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getPopulationSize() {
        return populationSize;
    }

    public void setPopulationSize(String populationSize) {
        this.populationSize = populationSize;
    }
}
