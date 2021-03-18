package br.com.leonardo.myapplication.model;

import java.util.List;

public class Pokemon {

    private int id;
    private String num;
    private String name;
    private String img;
    private List<String> type;
    private String height;
    private String weight;
    private String candy;
    private int candyCount;
    private String egg;
    private Double spawnChance;
    private Double avgSpawns;
    private String spawnTime;
    private List<Double> multipliers;
    private List<String> weaknesses;
    private List<NextEvolution> nextEvolution;
    private List<PreEvolution> preEvolution;

    public Pokemon() {

    }

    public Pokemon(int id, String num, String name, String img, List<String> type, String height, String weight, String candy, int candyCount, String egg, Double spawnChance, Double avgSpawns, String spawnTime, List<Double> multipliers, List<String> weaknesses, List<NextEvolution> nextEvolution, List<PreEvolution> preEvolution) {
        this.id = id;
        this.num = num;
        this.name = name;
        this.img = img;
        this.type = type;
        this.height = height;
        this.weight = weight;
        this.candy = candy;
        this.candyCount = candyCount;
        this.egg = egg;
        this.spawnChance = spawnChance;
        this.avgSpawns = avgSpawns;
        this.spawnTime = spawnTime;
        this.multipliers = multipliers;
        this.weaknesses = weaknesses;
        this.nextEvolution = nextEvolution;
        this.preEvolution = preEvolution;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCandy() {
        return candy;
    }

    public void setCandy(String candy) {
        this.candy = candy;
    }

    public int getCandyCount() {
        return candyCount;
    }

    public void setCandyCount(int candyCount) {
        this.candyCount = candyCount;
    }

    public String getEgg() {
        return egg;
    }

    public void setEgg(String egg) {
        this.egg = egg;
    }

    public Double getSpawnChance() {
        return spawnChance;
    }

    public void setSpawnChance(Double spawnChance) {
        this.spawnChance = spawnChance;
    }

    public Double getAvgSpawns() {
        return avgSpawns;
    }

    public void setAvgSpawns(Double avgSpawns) {
        this.avgSpawns = avgSpawns;
    }

    public String getSpawnTime() {
        return spawnTime;
    }

    public void setSpawnTime(String spawnTime) {
        this.spawnTime = spawnTime;
    }

    public List<Double> getMultipliers() {
        return multipliers;
    }

    public void setMultipliers(List<Double> multipliers) {
        this.multipliers = multipliers;
    }

    public List<String> getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(List<String> weaknesses) {
        this.weaknesses = weaknesses;
    }

    public List<NextEvolution> getNextEvolution() {
        return nextEvolution;
    }

    public void setNextEvolution(List<NextEvolution> nextEvolution) {
        this.nextEvolution = nextEvolution;
    }

    public List<PreEvolution> getPreEvolution() {
        return preEvolution;
    }

    public void setPreEvolution(List<PreEvolution> preEvolution) {
        this.preEvolution = preEvolution;
    }
}
