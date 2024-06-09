package com.model;

import javax.persistence.*;

@Entity
@Table(name = "foods")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "food_id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "carbohydrates")
    private double carbohydrates; // en grammes

    @Column(name = "proteins")
    private double proteins; // en grammes

    @Column(name = "serving_size")
    private int servingSize; // taille de la portion en grammes

    @Column(name = "blood_glucose_level")
    private double bloodGlucoseLevel; // glucose sanguin après avoir consommé ce repas

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Constructeurs, getters et setters
    public Food() {
    }

    public Food(String name, double carbohydrates, double proteins, int servingSize, double bloodGlucoseLevel) {
        this.name = name;
        this.carbohydrates = carbohydrates;
        this.proteins = proteins;
        this.servingSize = servingSize;
        this.bloodGlucoseLevel = bloodGlucoseLevel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getProteins() {
        return proteins;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    public int getServingSize() {
        return servingSize;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public double getBloodGlucoseLevel() {
        return bloodGlucoseLevel;
    }

    public void setBloodGlucoseLevel(double bloodGlucoseLevel) {
        this.bloodGlucoseLevel = bloodGlucoseLevel;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", carbohydrates=" + carbohydrates +
                ", proteins=" + proteins +
                ", servingSize=" + servingSize +
                ", bloodGlucoseLevel=" + bloodGlucoseLevel +
                '}';
    }
}
