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
		if (value1 == ActivitiesEnum.CIW_BUS || value1 == ActivitiesEnum.CIW_FOOT || value1 == ActivitiesEnum.MOUNTAINVIEW_BUS || value1 == ActivitiesEnum.MOUNTAINVIEW_FOOT) {
			setCafeteria(value1);
		} else if (value1 == ActivitiesEnum.UNIVERSITYUNION_BUS || value1 == ActivitiesEnum.UNIVERSITYUNION_FOOT || value1 == ActivitiesEnum.EVENTCENTER_BUS || value1 == ActivitiesEnum.EVENTCENTER_FOOT) {
			setGift(value1);
		} else if (value1 == ActivitiesEnum.SOM_BUS || value1 == ActivitiesEnum.SOM_FOOT || value1 == ActivitiesEnum.WATSON_BUS || value1 == ActivitiesEnum.WATSON_FOOT) {
			setBuilding(value1);
		} else if (value1 == ActivitiesEnum.CS240_BUS || value1 == ActivitiesEnum.CS240_FOOT || value1 == ActivitiesEnum.CS350_BUS || value1 == ActivitiesEnum.CS350_FOOT) {
			setLecture(value1);
		} else {
			System.out.println("invalid arugument 1");
			System.exit(0);
		}

		// checking for value2
		if (value2 == ActivitiesEnum.CIW_BUS || value2 == ActivitiesEnum.CIW_FOOT || value2 == ActivitiesEnum.MOUNTAINVIEW_BUS || value2 == ActivitiesEnum.MOUNTAINVIEW_FOOT) {
			setCafeteria(value2);
		} else if (value2 == ActivitiesEnum.UNIVERSITYUNION_BUS || value2 == ActivitiesEnum.UNIVERSITYUNION_FOOT || value2 == ActivitiesEnum.EVENTCENTER_BUS || value2 == ActivitiesEnum.EVENTCENTER_FOOT) {
			setGift(value2);
		} else if (value2 == ActivitiesEnum.SOM_BUS || value2 == ActivitiesEnum.SOM_FOOT || value2 == ActivitiesEnum.WATSON_BUS || value2 == ActivitiesEnum.WATSON_FOOT) {
			setBuilding(value2);
		} else if (value2 == ActivitiesEnum.CS240_BUS || value2 == ActivitiesEnum.CS240_FOOT || value2 == ActivitiesEnum.CS350_BUS || value2 == ActivitiesEnum.CS350_FOOT) {
			setLecture(value2);
		} else {
			System.out.println("invalid arugument 1");
			System.exit(0);
		}

		// checking for value3
		if (value3 == ActivitiesEnum.CIW_BUS || value3 == ActivitiesEnum.CIW_FOOT || value3 == ActivitiesEnum.MOUNTAINVIEW_BUS || value3 == ActivitiesEnum.MOUNTAINVIEW_FOOT) {
			setCafeteria(value3);
		} else if (value3 == ActivitiesEnum.UNIVERSITYUNION_BUS || value3 == ActivitiesEnum.UNIVERSITYUNION_FOOT || value3 == ActivitiesEnum.EVENTCENTER_BUS || value3 == ActivitiesEnum.EVENTCENTER_FOOT) {
			setGift(value3);
		} else if (value3 == ActivitiesEnum.SOM_BUS || value3 == ActivitiesEnum.SOM_FOOT || value3 == ActivitiesEnum.WATSON_BUS || value3 == ActivitiesEnum.WATSON_FOOT) {
			setBuilding(value3);
		} else if (value3 == ActivitiesEnum.CS240_BUS || value3 == ActivitiesEnum.CS240_FOOT || value3 == ActivitiesEnum.CS350_BUS || value3 == ActivitiesEnum.CS350_FOOT) {
			setLecture(value3);
		} else {
			System.out.println("invalid arugument 1");
			System.exit(0);
		}

		// checking for value4
		if (value4 == ActivitiesEnum.CIW_BUS || value4 == ActivitiesEnum.CIW_FOOT || value4 == ActivitiesEnum.MOUNTAINVIEW_BUS || value4 == ActivitiesEnum.MOUNTAINVIEW_FOOT) {
			setCafeteria(value4);
		} else if (value4 == ActivitiesEnum.UNIVERSITYUNION_BUS || value4 == ActivitiesEnum.UNIVERSITYUNION_FOOT || value4 == ActivitiesEnum.EVENTCENTER_BUS || value4 == ActivitiesEnum.EVENTCENTER_FOOT) {
			setGift(value4);
		} else if (value4 == ActivitiesEnum.SOM_BUS || value4 == ActivitiesEnum.SOM_FOOT || value4 == ActivitiesEnum.WATSON_BUS || value4 == ActivitiesEnum.WATSON_FOOT) {
			setBuilding(value4);
		} else if (value4 == ActivitiesEnum.CS240_BUS || value4 == ActivitiesEnum.CS240_FOOT || value4 == ActivitiesEnum.CS350_BUS || value4 == ActivitiesEnum.CS350_FOOT) {
			setLecture(value4);
		} else {
			System.out.println("invalid arugument 1");
			System.exit(0);
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
		System.out.println("Building: " + building);
		build.carbonFootprintUsed(building);
		build.costIncurred(building);
		build.durationSpent(building);
		build.effortUtilized(building);

	}

	@Override
	public void createGift() {
		System.out.println();
		Gift g = new Gift();
		System.out.println("Gift: " + gift);
		g.carbonFootprintUsed(gift);
		g.costIncurred(gift);
		g.durationSpent(gift);
		g.effortUtilized(gift);

	}

	@Override
	public void createLecture() {
		System.out.println();
		Lecture lect = new Lecture();
		System.out.println("Lecture: " + lecture);
		lect.carbonFootprintUsed(lecture);
		lect.costIncurred(lecture);
		lect.durationSpent(lecture);
		lect.effortUtilized(lecture);
	}

	@Override
	public void createCafeteria() {
		System.out.println();
		Cafeteria cafe = new Cafeteria();
		System.out.println("Cafeteria: " + cafeteria);
		cafe.carbonFootprintUsed(cafeteria);
		cafe.costIncurred(cafeteria);
		cafe.durationSpent(cafeteria);
		cafe.effortUtilized(cafeteria);
	}

}