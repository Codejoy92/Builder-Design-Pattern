package studentOrientation.util;

import studentOrientation.activityInterfaces.ScheduleI;

public class Schedule implements ScheduleI {

	private ActivitiesEnum cafeteria;
	private ActivitiesEnum lecture;
	private ActivitiesEnum gift;
	private ActivitiesEnum building;
	public Schedule() {
	}

	public ActivitiesEnum getCafeteria() {
		return cafeteria;
	}

	public ActivitiesEnum getLecture() {
		return lecture;
	}

	public ActivitiesEnum getGift() {
		return gift;
	}

	public ActivitiesEnum getBuilding() {
		return building;
	}

	public Schedule(ActivitiesEnum value1, ActivitiesEnum value2, ActivitiesEnum value3, ActivitiesEnum value4) {

		// Checking for value1
		if (value1 == ActivitiesEnum.CIW || value1 == ActivitiesEnum.MOUNTAINVIEW) {
			setCafeteria(value1);
		} else if (value1 == ActivitiesEnum.UNIVERSITYUNION || value1 == ActivitiesEnum.EVENTCENTER) {
			setGift(value1);
		} else if (value1 == ActivitiesEnum.SOM || value1 == ActivitiesEnum.WATSON) {
			setBuilding(value1);
		} else if (value1 == ActivitiesEnum.CS240 || value1 == ActivitiesEnum.CS350) {
			setLecture(value1);
		}

		// checking for value2
		if (value2 == ActivitiesEnum.CIW || value2 == ActivitiesEnum.MOUNTAINVIEW) {
			setCafeteria(value2);
		} else if (value2 == ActivitiesEnum.UNIVERSITYUNION || value2 == ActivitiesEnum.EVENTCENTER) {
			setGift(value2);
		} else if (value2 == ActivitiesEnum.SOM || value2 == ActivitiesEnum.WATSON) {
			setBuilding(value2);
		} else if (value2 == ActivitiesEnum.CS240 || value2 == ActivitiesEnum.CS350) {
			setLecture(value2);
		}

		// checking for value3
		if (value3 == ActivitiesEnum.CIW || value3 == ActivitiesEnum.MOUNTAINVIEW) {
			setCafeteria(value3);
		} else if (value3 == ActivitiesEnum.UNIVERSITYUNION || value3 == ActivitiesEnum.EVENTCENTER) {
			setGift(value3);
		} else if (value3 == ActivitiesEnum.SOM || value3 == ActivitiesEnum.WATSON) {
			setBuilding(value3);
		} else if (value3 == ActivitiesEnum.CS240 || value3 == ActivitiesEnum.CS350) {
			setLecture(value3);
		}

		// checking for value4
		if (value4 == ActivitiesEnum.CIW || value4 == ActivitiesEnum.MOUNTAINVIEW) {
			setCafeteria(value4);
		} else if (value4 == ActivitiesEnum.UNIVERSITYUNION || value4 == ActivitiesEnum.EVENTCENTER) {
			setGift(value4);
		} else if (value4 == ActivitiesEnum.SOM || value4 == ActivitiesEnum.WATSON) {
			setBuilding(value4);
		} else if (value4 == ActivitiesEnum.CS240 || value4 == ActivitiesEnum.CS350) {
			setLecture(value4);
		}

	}

	@Override
	public void setCafeteria(ActivitiesEnum cafeteriaValue) {
		cafeteria = cafeteriaValue;
	}

	@Override
	public void setLecture(ActivitiesEnum lectureValue) {
		lecture = lectureValue;
	}

	@Override
	public void setGift(ActivitiesEnum giftValue) {
		gift = giftValue;
	}

	@Override
	public void setBuilding(ActivitiesEnum buildingValue) {
		building = buildingValue;
	}

	@Override
	public void createBuilding() {
		Building build = new Building();
        System.out.println("Building: "+building);
		build.carbonFootprintUsed(building);
		build.costIncurred(building);
		build.durationSpent(building);
		build.effortUtilized(building);

	}

	@Override
	public void createGift() {
        System.out.println();
		Gift g = new Gift();
        System.out.println("Gift: "+gift);
        g.carbonFootprintUsed(gift);
        g.costIncurred(gift);
        g.durationSpent(gift);
        g.effortUtilized(gift);

	}

	@Override
	public void createLecture() {
        System.out.println();
        Lecture lect = new Lecture();
        System.out.println("Lecture: "+lecture);
        lect.carbonFootprintUsed(lecture);
        lect.costIncurred(lecture);
        lect.durationSpent(lecture);
        lect.effortUtilized(lecture);
	}

	@Override
	public void createCafeteria() {
        System.out.println();
		Cafeteria cafe = new Cafeteria();
        System.out.println("Cafeteria: "+cafeteria);
        cafe.carbonFootprintUsed(cafeteria);
        cafe.costIncurred(cafeteria);
        cafe.durationSpent(cafeteria);
        cafe.effortUtilized(cafeteria);
	}

}