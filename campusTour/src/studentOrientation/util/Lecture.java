package studentOrientation.util;

import static java.lang.Math.ceil;
import static java.lang.Math.pow;

public class Lecture extends Activities {

    @Override
    public void carbonFootprintUsed(ActivitiesEnum activity) {
        if(ActivitiesEnum.CS240 == activity)
            System.out.println("CarbonFootprint: \t"+ceil(60*pow(10,-5)));
        else if(ActivitiesEnum.CS350 == activity)
            System.out.println("CarbonFootprint: \t"+ceil(60*pow(10,-5)));
    }

    @Override
    public void costIncurred(ActivitiesEnum activity) {
        if (ActivitiesEnum.CS240 == activity) {
            System.out.print("Cost Associated:");
            System.out.print("\tBy Bus: $2");
            System.out.print("\tBy Foot: $1");
        } else if (ActivitiesEnum.CS350 == activity) {
            System.out.print("Cost Associated:");
            System.out.print("\tBy Bus: $to be decided");
        }
    }

    @Override
    public void durationSpent(ActivitiesEnum activity) {
        System.out.println();
        if(ActivitiesEnum.CS240 == activity)
            System.out.println("Duration: \t\t\t60 mins");
        else if(ActivitiesEnum.CS350 == activity)
            System.out.println("Duration: \t\t\t60 mins");
    }

    @Override
    public void effortUtilized(ActivitiesEnum activity) {
        if(ActivitiesEnum.CS240 == activity)
            System.out.println("Efforts: \t\t\t6000 calories");
        else if(ActivitiesEnum.CS350 == activity)
            System.out.println("Efforts: \t\t\t6000 calories");
    }
}
