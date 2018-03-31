package studentOrientation.util;

import studentOrientation.activityInterfaces.ScheduleI;

public class Schedule implements ScheduleI {

	private ActivitiesEnum cafeteria;
	private ActivitiesEnum lecture;
	private ActivitiesEnum gift;
	private ActivitiesEnum building;
	private ActivitiesEnum order1;
	private ActivitiesEnum order2;
	private ActivitiesEnum order3;
	private ActivitiesEnum order4;

	public Schedule(ActivitiesEnum value1, ActivitiesEnum value2, ActivitiesEnum value3, ActivitiesEnum value4) {

		// Checking for value1
		if (value1 == ActivitiesEnum.CIW || value1 == ActivitiesEnum.MOUNTAINVIEW) {
			setCafeteria(value1);
			order1 = ActivitiesEnum.CAFETERIA;
		} else if (value1 == ActivitiesEnum.UNIVERSITYUNION || value1 == ActivitiesEnum.EVENTCENTER) {
			setGift(value1);
			order1 = ActivitiesEnum.GIFT;
		} else if (value1 == ActivitiesEnum.SOM || value1 == ActivitiesEnum.WATSON) {
			setBuilding(value1);
			order1 = ActivitiesEnum.BUILDING;
		} else if (value1 == ActivitiesEnum.CS240 || value1 == ActivitiesEnum.CS350) {
			setLecture(value1);
			order1 = ActivitiesEnum.LECTURE;
		}

		// checking for value2
		if (value2 == ActivitiesEnum.CIW || value2 == ActivitiesEnum.MOUNTAINVIEW) {
			setCafeteria(value2);
			order1 = ActivitiesEnum.CAFETERIA;
		} else if (value2 == ActivitiesEnum.UNIVERSITYUNION || value2 == ActivitiesEnum.EVENTCENTER) {
			setGift(value2);
			order1 = ActivitiesEnum.GIFT;
		} else if (value2 == ActivitiesEnum.SOM || value2 == ActivitiesEnum.WATSON) {
			setBuilding(value2);
			order1 = ActivitiesEnum.BUILDING;
		} else if (value2 == ActivitiesEnum.CS240 || value2 == ActivitiesEnum.CS350) {
			setLecture(value2);
			order1 = ActivitiesEnum.LECTURE;
		}

		// checking for value3
		if (value3 == ActivitiesEnum.CIW || value3 == ActivitiesEnum.MOUNTAINVIEW) {
			setCafeteria(value3);
			order1 = ActivitiesEnum.CAFETERIA;
		} else if (value3 == ActivitiesEnum.UNIVERSITYUNION || value3 == ActivitiesEnum.EVENTCENTER) {
			setGift(value3);
			order1 = ActivitiesEnum.GIFT;
		} else if (value3 == ActivitiesEnum.SOM || value3 == ActivitiesEnum.WATSON) {
			setBuilding(value3);
			order1 = ActivitiesEnum.BUILDING;
		} else if (value3 == ActivitiesEnum.CS240 || value3 == ActivitiesEnum.CS350) {
			setLecture(value3);
			order1 = ActivitiesEnum.LECTURE;
		}

		// checking for value4
		if (value4 == ActivitiesEnum.CIW || value4 == ActivitiesEnum.MOUNTAINVIEW) {
			setCafeteria(value4);
			order1 = ActivitiesEnum.CAFETERIA;
		} else if (value4 == ActivitiesEnum.UNIVERSITYUNION || value4 == ActivitiesEnum.EVENTCENTER) {
			setGift(value4);
			order1 = ActivitiesEnum.GIFT;
		} else if (value4 == ActivitiesEnum.SOM || value4 == ActivitiesEnum.WATSON) {
			setBuilding(value4);
			order1 = ActivitiesEnum.BUILDING;
		} else if (value4 == ActivitiesEnum.CS240 || value4 == ActivitiesEnum.CS350) {
			setLecture(value4);
			order1 = ActivitiesEnum.LECTURE;
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

}