package activities;

import hero.Action;
import hero.Level;

public class Work extends Action {
    private int time;
    private int xp;
    private Level level;
    private int hunger;
    private int rest;
    private int excitement;
    private int appeal;
    private int money;
    private float studyingProcess;
    private float fitness;

    public Work() {
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public int getXp() {
        return xp;
    }

    @Override
    public void setXp(int xp) {
        this.xp = xp;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public int getHunger() {
        return hunger;
    }

    @Override
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    @Override
    public int getRest() {
        return rest;
    }

    @Override
    public void setRest(int rest) {
        this.rest = rest;
    }

    @Override
    public int getExcitement() {
        return excitement;
    }

    @Override
    public void setExcitement(int excitement) {
        this.excitement = excitement;
    }

    @Override
    public int getAppeal() {
        return appeal;
    }

    @Override
    public void setAppeal(int appeal) {
        this.appeal = appeal;
    }

    @Override
    public int getMoney() {
        return money;
    }

    @Override
    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public float getStudyingProcess() {
        return studyingProcess;
    }

    @Override
    public void setStudyingProcess(float studyingProcess) {
        this.studyingProcess = studyingProcess;
    }

    @Override
    public float getFitness() {
        return fitness;
    }

    @Override
    public void setFitness(float fitness) {
        this.fitness = fitness;
    }
}