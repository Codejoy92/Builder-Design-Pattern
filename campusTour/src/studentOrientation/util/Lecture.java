package studentOrientation.util;

import studentOrientation.driver.Driver;

import static java.lang.Math.pow;

public class Lecture extends Activities {
    double co2consumed = Math.round(60*pow(10,-4) * 10000d)/10000d;
    int effort, duration=60;
    double surcharge = 2 + 2*0.1;
    /**
     * Calculates the Carbon Footprint for the activity
     * @param activity activity
     */
    @Override
    public void carbonFootprintUsed(ActivitiesEnum activity) {
        if(ActivitiesEnum.CS240_BUS == activity || ActivitiesEnum.CS240_FOOT == activity)
            Driver.builder.append("CarbonFootprint: \t"+co2consumed + " tonnes\n");
        else if(ActivitiesEnum.CS350 == activity)
            Driver.builder.append("CarbonFootprint: \t"+co2consumed + " tonnes\n");
    }

    /**
     * Calculates the cost associated with the lecture activity
     * @param activity activity
     */
    @Override
    public void costIncurred(ActivitiesEnum activity) {
        Driver.builder.append("Cost Associated:");
        if (ActivitiesEnum.CS240_BUS == activity)
            Driver.builder.append("\t$2\n");
        else if (ActivitiesEnum.CS240_FOOT == activity)
            Driver.builder.append("\t$1\n");
        else if (ActivitiesEnum.CS350 == activity)
            Driver.builder.append("\t$"+surcharge+"\n");
    }

    /**
     * Calculates the time spent during the activity
     * @param activity activity
     */
    @Override
    public void durationSpent(ActivitiesEnum activity) {
        if(ActivitiesEnum.CS240_BUS == activity || ActivitiesEnum.CS240_FOOT == activity)
            Driver.builder.append("Duration: \t\t"+duration+" mins\n");
        else if(ActivitiesEnum.CS350 == activity)
            Driver.builder.append("Duration: \t\t"+duration+" mins\n");
    }

    /**
     * Calculates the energy consumed during the activity
     * @param activity activity
     */
    @Override
    public void effortUtilized(ActivitiesEnum activity) {
        effort = duration * 1000;
        if(ActivitiesEnum.CS240_BUS == activity || ActivitiesEnum.CS240_FOOT == activity)
            Driver.builder.append("Efforts: \t\t"+effort+" calories\n\n");
        else if(ActivitiesEnum.CS350 == activity)
            Driver.builder.append("Efforts: \t\t"+effort+" calories\n\n");
    }
}
