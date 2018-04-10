package studentOrientation.util;

import static java.lang.Math.pow;

public class Lecture extends Activities {
    double co2consumed = Math.round(60*pow(10,-4) * 10000d)/10000d;
    int effort, duration;
    double surcharge = 2 + 2*0.1;
    /**
     * Calculates the Carbon Footprint for the activity
     * @param activity
     */
    @Override
    public void carbonFootprintUsed(ActivitiesEnum activity) {
        if(ActivitiesEnum.CS240_BUS == activity || ActivitiesEnum.CS240_FOOT == activity)
            System.out.println("CarbonFootprint: \t"+co2consumed + " tonnes");
        else if(ActivitiesEnum.CS350 == activity)
            System.out.println("CarbonFootprint: \t"+co2consumed + " tonnes");
    }

    /**
     * Calculates the cost associated with the lecture activity
     * @param activity
     */
    @Override
    public void costIncurred(ActivitiesEnum activity) {
        System.out.print("Cost Associated:");
        if (ActivitiesEnum.CS240_BUS == activity)
            System.out.print("\t$2");
        else if (ActivitiesEnum.CS240_FOOT == activity)
            System.out.print("\t$1");
        else if (ActivitiesEnum.CS350 == activity)
            System.out.print("\t"+surcharge);
    }

    /**
     * Calculates the time spent during the activity
     * @param activity
     */
    @Override
    public void durationSpent(ActivitiesEnum activity) {
        System.out.println();
        if(ActivitiesEnum.CS240_BUS == activity || ActivitiesEnum.CS240_FOOT == activity)
            System.out.println("Duration: \t\t\t"+duration+" mins");
        else if(ActivitiesEnum.CS350 == activity)
            System.out.println("Duration: \t\t\t"+duration+" mins");
    }

    /**
     * Calculates the energy consumed during the activity
     * @param activity
     */
    @Override
    public void effortUtilized(ActivitiesEnum activity) {
        effort = duration * 1000;
        if(ActivitiesEnum.CS240_BUS == activity || ActivitiesEnum.CS240_FOOT == activity)
            System.out.println("Efforts: \t\t\t"+effort+" calories");
        else if(ActivitiesEnum.CS350 == activity)
            System.out.println("Efforts: \t\t\t"+effort+" calories");
    }
}
