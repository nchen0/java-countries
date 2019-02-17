package com.lambda.countries;

public class Country {
    private String name;
    private int population;
    private int land_size;
    private int median_age;

    public Country(String name, int population, int land_size, int median_age) {
        this.name = name;
        this.population = population;
        this.land_size = land_size;
        this.median_age = median_age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getLand_size() {
        return land_size;
    }

    public void setLand_size(int land_size) {
        this.land_size = land_size;
    }

    public int getMedian_age() {
        return median_age;
    }

    public void setMedian_age(int median_age) {
        this.median_age = median_age;
    }
}
