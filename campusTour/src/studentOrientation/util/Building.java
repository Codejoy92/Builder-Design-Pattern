package studentOrientation.util;
import static java.lang.Math.pow;

public class Building extends Activities {
    int effort, duration = 30;
    double co2consumed = Math.round(30*pow(10,-4) * 10000d)/10000d;
    /**
     * Calculates the Carbon Footprint for the activity
     * @param activity
     */
    @Override
    public void carbonFootprintUsed(ActivitiesEnum activity) {
        if(ActivitiesEnum.WATSON_BUS == activity || ActivitiesEnum.WATSON_FOOT == activity)
            System.out.println("CarbonFootprint: \t"+co2consumed+" tonnes");
        else if(ActivitiesEnum.SOM_BUS == activity || ActivitiesEnum.SOM_FOOT == activity)
            System.out.println("CarbonFootprint: \t"+co2consumed+" tonnes");
    }

    /**
     * Calculates the cost associated with the activity
     * @param activity
     */
    @Override
    public void costIncurred(ActivitiesEnum activity) {
        System.out.print("Cost Associated:");
        if (ActivitiesEnum.WATSON_BUS == activity)
            System.out.print("\t$1");
        else if (ActivitiesEnum.WATSON_FOOT == activity)
            System.out.print("\t$0.5");
        else if (ActivitiesEnum.SOM_BUS == activity)
            System.out.print("\t$1");
        else if (ActivitiesEnum.SOM_FOOT == activity)
            System.out.print("\t$0.5");

    }

    /**
     * Calculates the time spent during the activity
     * @param activity
     */
    @Override
    public void durationSpent(ActivitiesEnum activity) {
        System.out.println();
        if(ActivitiesEnum.WATSON_BUS == activity || ActivitiesEnum.WATSON_FOOT == activity)
            System.out.println("Duration: \t\t\t"+duration+" mins");
        else if(ActivitiesEnum.SOM_BUS == activity || ActivitiesEnum.SOM_FOOT == activity)
            System.out.println("Duration: \t\t\t"+duration+" mins");
    }

    /**
     * Calculates the energy consumed during the activity
     * @param activity
     */
    @Override
    public void effortUtilized(ActivitiesEnum activity) {
        effort = duration * 1000;
        if(ActivitiesEnum.WATSON_BUS == activity || ActivitiesEnum.WATSON_FOOT == activity)
            System.out.println("Efforts: \t\t\t"+effort+" calories");
        else if(ActivitiesEnum.SOM_BUS == activity || ActivitiesEnum.SOM_FOOT == activity)
            System.out.println("Efforts: \t\t\t"+effort+" calories");
    }
}
