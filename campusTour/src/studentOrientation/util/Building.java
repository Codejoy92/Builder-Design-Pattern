package studentOrientation.util;

import static java.lang.Math.ceil;
import static java.lang.Math.pow;

public class Building extends Activities {
    @Override
    public void carbonFootprintUsed(ActivitiesEnum activity) {

        if(ActivitiesEnum.WATSON == activity)
            System.out.println("CarbonFootprint: \t"+ceil(30*pow(10,-5)));
        else if(ActivitiesEnum.SOM == activity)
            System.out.println("CarbonFootprint: \t"+ceil(30*pow(10,-5)));
    }

    @Override
    public void costIncurred(ActivitiesEnum activity) {

        if (ActivitiesEnum.WATSON == activity) {
            System.out.print("Cost Associated:");
            System.out.print("\tBy Bus: $1");
            System.out.print("\tBy Foot: $0.5");
        } else if (ActivitiesEnum.SOM == activity) {
            System.out.print("Cost Associated:");
            System.out.print("\tBy Bus: $1");
            System.out.print("\tBy Foot: $0.5");
        }
    }

    @Override
    public void durationSpent(ActivitiesEnum activity) {
        System.out.println();
        if(ActivitiesEnum.WATSON == activity)
            System.out.println("Duration: \t\t\t30 mins");
        else if(ActivitiesEnum.SOM == activity)
            System.out.println("Duration: \t\t\t30 mins");
    }

    @Override
    public void effortUtilized(ActivitiesEnum activity) {
        if(ActivitiesEnum.WATSON == activity)
            System.out.println("Efforts: \t\t\t3000 calories");
        else if(ActivitiesEnum.SOM == activity)
            System.out.println("Efforts: \t\t\t3000 calories");
    }
}
