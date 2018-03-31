package studentOrientation.util;

import static java.lang.Math.ceil;
import static java.lang.Math.pow;

public class Cafeteria extends Activities {

    @Override
    public void carbonFootprintUsed(ActivitiesEnum activity) {
        if(ActivitiesEnum.CIW == activity)
            System.out.println("CarbonFootprint: \t"+ceil(30*pow(10,-5)));
        else if(ActivitiesEnum.MOUNTAINVIEW == activity)
            System.out.println("CarbonFootprint: \t"+ceil(45*pow(10,-5)));
    }

    @Override
    public void costIncurred(ActivitiesEnum activity) {
        if (ActivitiesEnum.CIW == activity) {
            System.out.print("Cost Associated:");
            System.out.print("\tBy Bus: $2");
            System.out.print("\tBy Foot: $1");
        } else if (ActivitiesEnum.MOUNTAINVIEW == activity) {
            System.out.print("Cost Associated:");
            System.out.print("\tBy Bus: $1");
            System.out.print("\tBy Foot: $0.5");
        }
    }

    @Override
    public void durationSpent(ActivitiesEnum activity) {
        System.out.println();
        if(ActivitiesEnum.CIW == activity)
            System.out.println("Duration: \t\t\t30 mins");
        else if(ActivitiesEnum.MOUNTAINVIEW == activity)
            System.out.println("Duration: \t\t\t45 mins");
    }

    @Override
    public void effortUtilized(ActivitiesEnum activity) {
        if(ActivitiesEnum.CIW == activity)
            System.out.println("Efforts: \t\t\t3000 calories");
        else if(ActivitiesEnum.MOUNTAINVIEW == activity)
            System.out.println("Efforts: \t\t\t4500 calories");
    }
}
