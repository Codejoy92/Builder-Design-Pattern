package studentOrientation.util;

import studentOrientation.driver.Driver;

import static java.lang.Math.pow;

public class Gift extends Activities {
    int effort, duration = 15;
    double co2consumed = Math.round(15*pow(10,-4) * 10000d)/10000d;
    /**
     * Calculates the Carbon Footprint for the activity
     * @param activity activity
     */
    @Override
    public void carbonFootprintUsed(ActivitiesEnum activity) {
        if(ActivitiesEnum.UNIVERSITYUNION_BUS == activity || ActivitiesEnum.UNIVERSITYUNION_FOOT == activity)
            Driver.builder.append("CarbonFootprint: \t"+co2consumed+" tonnes\n");
        else if(ActivitiesEnum.EVENTCENTER_BUS == activity || ActivitiesEnum.EVENTCENTER_FOOT == activity)
            Driver.builder.append("CarbonFootprint: \t"+co2consumed+" tonnes\n");
    }

    /**
     * Calculates the cost associated with the activity
     * @param activity activity
     */
    @Override
    public void costIncurred(ActivitiesEnum activity) {
        Driver.builder.append("Cost Associated:");
        if (ActivitiesEnum.UNIVERSITYUNION_BUS == activity)
            Driver.builder.append("\t$1\n");
        else if (ActivitiesEnum.UNIVERSITYUNION_FOOT == activity)
            Driver.builder.append("\t$0.5\n");
        else if (ActivitiesEnum.EVENTCENTER_BUS == activity)
            Driver.builder.append("\t$2\n");
        else if (ActivitiesEnum.EVENTCENTER_FOOT == activity)
            Driver.builder.append("\t$1\n");

    }

    /**
     * Calculates the time spent during the activity
     * @param activity activity
     */
    @Override
    public void durationSpent(ActivitiesEnum activity) {
        if(ActivitiesEnum.UNIVERSITYUNION_BUS == activity || ActivitiesEnum.UNIVERSITYUNION_FOOT == activity)
            Driver.builder.append("Duration: \t\t"+duration+" mins\n");
        else if(ActivitiesEnum.EVENTCENTER_BUS == activity || ActivitiesEnum.EVENTCENTER_FOOT == activity)
            Driver.builder.append("Duration: \t\t"+duration+" mins\n");
    }

    /**
     * Calculates the energy consumed during the activity
     * @param activity activity
     */
    @Override
    public void effortUtilized(ActivitiesEnum activity) {
        effort = duration * 1000;
        if(ActivitiesEnum.UNIVERSITYUNION_BUS == activity || ActivitiesEnum.UNIVERSITYUNION_FOOT == activity)
            Driver.builder.append("Efforts: \t\t"+effort+" calories\n\n");
        else if(ActivitiesEnum.EVENTCENTER_BUS == activity || ActivitiesEnum.EVENTCENTER_FOOT == activity)
            Driver.builder.append("Efforts: \t\t"+effort+" calories\n\n");
    }
}
