package com.lambdaschool.solution;

public class MyApplication implements Processor
{
    private AthleteCreator athleteCreator;

    public MyApplication(AthleteCreator athleteCreator)
    {
        this.athleteCreator = athleteCreator;
    }

    @Override
    public void displayAthlete()
    {
        athleteCreator.displayAthlete();
    }
}
