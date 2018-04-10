package studentOrientation.util;

import static java.lang.Math.pow;

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
            System.out.println("CarbonFootprint: \t"+co2consumed+" tonnes");
        else if(ActivitiesEnum.MOUNTAINVIEW == activity)
            System.out.println("CarbonFootprint: \t"+co2consumed+" tonnes");
    }
    /**
     * Calculates the cost associated with the activity
     * @param activity
     */
    @Override
    public void costIncurred(ActivitiesEnum activity) {
        System.out.print("Cost Associated:");
        if (ActivitiesEnum.CIW_BUS == activity)
            System.out.print("\t$2");
        else if (ActivitiesEnum.CIW_FOOT == activity)
            System.out.print("\t$1");
        else if (ActivitiesEnum.MOUNTAINVIEW == activity)
            System.out.print("\t"+surcharge);
    }

    /**
     * Calculates the time spent during the activity
     * @param activity
     */
    @Override
    public void durationSpent(ActivitiesEnum activity) {
        System.out.println();
        if(ActivitiesEnum.CIW_BUS == activity || ActivitiesEnum.CIW_FOOT == activity)
            System.out.println("Duration: \t\t\t"+durationCIW+ " mins");
        else if(ActivitiesEnum.MOUNTAINVIEW == activity)
            System.out.println("Duration: \t\t\t"+durationMV+" mins");
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
            System.out.println("Efforts: \t\t\t"+effortCIW+" calories");
        else if(ActivitiesEnum.MOUNTAINVIEW == activity)
            System.out.println("Efforts: \t\t\t"+effortMV+" calories");
    }
}
