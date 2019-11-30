package com.lambdaschool.solution;

public class BaseballCourtCreationInjector implements AthleteCreationInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new BaseballCourtCreationImp());
    }
}
