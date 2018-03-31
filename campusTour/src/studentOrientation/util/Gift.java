package studentOrientation.util;

import static java.lang.Math.ceil;
import static java.lang.Math.pow;

public class Gift extends Activities {

    @Override
    public void carbonFootprintUsed(ActivitiesEnum activity) {
        if(ActivitiesEnum.UNIVERSITYUNION == activity)
            System.out.println("CarbonFootprint: \t"+ceil(15*pow(10,-5)));
        else if(ActivitiesEnum.EVENTCENTER == activity)
            System.out.println("CarbonFootprint: \t"+ceil(15*pow(10,-5)));
    }

    @Override
    public void costIncurred(ActivitiesEnum activity) {
        if (ActivitiesEnum.UNIVERSITYUNION == activity) {
            System.out.print("Cost Associated:");
            System.out.print("\tBy Bus: $1");
            System.out.print("\tBy Foot: $0.5");
        } else if (ActivitiesEnum.EVENTCENTER == activity) {
            System.out.print("Cost Associated:");
            System.out.print("\tBy Bus: $2");
            System.out.print("\tBy Foot: $1");
        }
    }

    @Override
    public void durationSpent(ActivitiesEnum activity) {
        System.out.println();
        if(ActivitiesEnum.UNIVERSITYUNION == activity)
            System.out.println("Duration: \t\t\t15 mins");
        else if(ActivitiesEnum.EVENTCENTER == activity)
            System.out.println("Duration: \t\t\t15 mins");
    }

    @Override
    public void effortUtilized(ActivitiesEnum activity) {
        if(ActivitiesEnum.UNIVERSITYUNION == activity)
            System.out.println("Efforts: \t\t\t1500 calories");
        else if(ActivitiesEnum.EVENTCENTER == activity)
            System.out.println("Efforts: \t\t\t1500 calories");
    }
}
