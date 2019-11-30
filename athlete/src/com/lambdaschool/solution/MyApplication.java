package com.lambdaschool.solution;

public class MyApplication implements Processor
{
    private AthleteCreator athleteCreator;
    private CourtCreator courtCreator;

    public MyApplication(AthleteCreator athleteCreator)
    {
        this.athleteCreator = athleteCreator;
    }

    public MyApplication(CourtCreator courtCreator)
    {
        this.courtCreator = courtCreator;
    }

    @Override
    public void displayAthlete()
    {
        athleteCreator.displayAthlete();
    }

    @Override
    public void displayCourt()
    {
        courtCreator.displayCourt();
    }
}
