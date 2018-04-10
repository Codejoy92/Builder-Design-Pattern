package studentOrientation.util;

import static java.lang.Math.pow;

import studentOrientation.driver.Driver;

public class Cafeteria extends Activities {
    double co2consumed = Math.round(30*pow(10,-4) * 10000d)/10000d;
    int effortCIW, effortMV, durationCIW = 30, durationMV = 45;
    double surcharge = 2 + 2*0.05;
    /**
     * Calculates the Carbon Footprint for the activity
     * @param activity
     */
    @Override
    public void carbonFootprintUsed(ActivitiesEnum activity) {
        if(ActivitiesEnum.CIW_BUS == activity || ActivitiesEnum.CIW_FOOT == activity)
            Driver.builder.append("CarbonFootprint: \t"+co2consumed+" tonnes\n");
        else if(ActivitiesEnum.MOUNTAINVIEW == activity)
            Driver.builder.append("CarbonFootprint: \t"+co2consumed+" tonnes\n");
    }
    /**
     * Calculates the cost associated with the activity
     * @param activity
     */
    @Override
    public void costIncurred(ActivitiesEnum activity) {
        Driver.builder.append("Cost Associated:");
        if (ActivitiesEnum.CIW_BUS == activity)
            Driver.builder.append("\t$2\n");
        else if (ActivitiesEnum.CIW_FOOT == activity)
            Driver.builder.append("\t$1\n");
        else if (ActivitiesEnum.MOUNTAINVIEW == activity)
            Driver.builder.append("\t$"+surcharge+"\n");
    }

    /**
     * Calculates the time spent during the activity
     * @param activity
     */
    @Override
    public void durationSpent(ActivitiesEnum activity) {
        if(ActivitiesEnum.CIW_BUS == activity || ActivitiesEnum.CIW_FOOT == activity)
            Driver.builder.append("Duration: \t\t"+durationCIW+ " mins\n");
        else if(ActivitiesEnum.MOUNTAINVIEW == activity)
            Driver.builder.append("Duration: \t\t"+durationMV+" mins\n");
    }

    /**
     * Calculates the energy consumed during the activity
     * @param activity
     */
    @Override
    public void effortUtilized(ActivitiesEnum activity) {
        effortCIW = durationCIW * 1000;
        effortMV = durationMV * 1000;
        if(ActivitiesEnum.CIW_BUS == activity || ActivitiesEnum.CIW_FOOT == activity)
            Driver.builder.append("Efforts: \t\t"+effortCIW+" calories\n");
        else if(ActivitiesEnum.MOUNTAINVIEW == activity)
            Driver.builder.append("Efforts: \t\t"+effortMV+" calories\n");
    }
}

