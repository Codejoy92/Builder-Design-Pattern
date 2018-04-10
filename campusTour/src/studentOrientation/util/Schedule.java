package studentOrientation.util;

import studentOrientation.activityInterfaces.ScheduleI;
import studentOrientation.driver.Driver;

public class Schedule implements ScheduleI {

	private ActivitiesEnum cafeteria;
	private ActivitiesEnum lecture;
	private ActivitiesEnum gift;
	private ActivitiesEnum building;

	/**
	 * This is default constructor
	 */
	public Schedule() {
	}

	/**
	 * This method is paramterized constructor and is used to filter out the
	 * arguments for each activity and assign them to the global variables
	 *
	 * @param value1 value1
	 * @param value2 value2
	 * @param value3 value3
	 * @param value4 value4
	 *
	 */
	public Schedule(ActivitiesEnum value1, ActivitiesEnum value2, ActivitiesEnum value3, ActivitiesEnum value4) {

		// Checking for value1
		if (value1 == ActivitiesEnum.CIW_BUS || value1 == ActivitiesEnum.CIW_FOOT
				|| value1 == ActivitiesEnum.MOUNTAINVIEW) {
			setCafeteria(value1);
		} else if (value1 == ActivitiesEnum.UNIVERSITYUNION_BUS || value1 == ActivitiesEnum.UNIVERSITYUNION_FOOT
				|| value1 == ActivitiesEnum.EVENTCENTER_BUS || value1 == ActivitiesEnum.EVENTCENTER_FOOT) {
			setGift(value1);
		} else if (value1 == ActivitiesEnum.SOM_BUS || value1 == ActivitiesEnum.SOM_FOOT
				|| value1 == ActivitiesEnum.WATSON_BUS || value1 == ActivitiesEnum.WATSON_FOOT) {
			setBuilding(value1);
		} else if (value1 == ActivitiesEnum.CS240_BUS || value1 == ActivitiesEnum.CS240_FOOT
				|| value1 == ActivitiesEnum.CS350) {
			setLecture(value1);
		} else {
			System.out.println("invalid arugument 1");
			System.exit(0);
		}

		// checking for value2
		if (value2 == ActivitiesEnum.CIW_BUS || value2 == ActivitiesEnum.CIW_FOOT
				|| value2 == ActivitiesEnum.MOUNTAINVIEW) {
			setCafeteria(value2);
		} else if (value2 == ActivitiesEnum.UNIVERSITYUNION_BUS || value2 == ActivitiesEnum.UNIVERSITYUNION_FOOT
				|| value2 == ActivitiesEnum.EVENTCENTER_BUS || value2 == ActivitiesEnum.EVENTCENTER_FOOT) {
			setGift(value2);
		} else if (value2 == ActivitiesEnum.SOM_BUS || value2 == ActivitiesEnum.SOM_FOOT
				|| value2 == ActivitiesEnum.WATSON_BUS || value2 == ActivitiesEnum.WATSON_FOOT) {
			setBuilding(value2);
		} else if (value2 == ActivitiesEnum.CS240_BUS || value2 == ActivitiesEnum.CS240_FOOT
				|| value2 == ActivitiesEnum.CS350) {
			setLecture(value2);
		} else {
			System.out.println("invalid arugument 1");
			System.exit(0);
		}

		// checking for value3
		if (value3 == ActivitiesEnum.CIW_BUS || value3 == ActivitiesEnum.CIW_FOOT
				|| value3 == ActivitiesEnum.MOUNTAINVIEW) {
			setCafeteria(value3);
		} else if (value3 == ActivitiesEnum.UNIVERSITYUNION_BUS || value3 == ActivitiesEnum.UNIVERSITYUNION_FOOT
				|| value3 == ActivitiesEnum.EVENTCENTER_BUS || value3 == ActivitiesEnum.EVENTCENTER_FOOT) {
			setGift(value3);
		} else if (value3 == ActivitiesEnum.SOM_BUS || value3 == ActivitiesEnum.SOM_FOOT
				|| value3 == ActivitiesEnum.WATSON_BUS || value3 == ActivitiesEnum.WATSON_FOOT) {
			setBuilding(value3);
		} else if (value3 == ActivitiesEnum.CS240_BUS || value3 == ActivitiesEnum.CS240_FOOT
				|| value3 == ActivitiesEnum.CS350) {
			setLecture(value3);
		} else {
			System.out.println("invalid arugument 1");
			System.exit(0);
		}

		// checking for value4
		if (value4 == ActivitiesEnum.CIW_BUS || value4 == ActivitiesEnum.CIW_FOOT
				|| value4 == ActivitiesEnum.MOUNTAINVIEW) {
			setCafeteria(value4);
		} else if (value4 == ActivitiesEnum.UNIVERSITYUNION_BUS || value4 == ActivitiesEnum.UNIVERSITYUNION_FOOT
				|| value4 == ActivitiesEnum.EVENTCENTER_BUS || value4 == ActivitiesEnum.EVENTCENTER_FOOT) {
			setGift(value4);
		} else if (value4 == ActivitiesEnum.SOM_BUS || value4 == ActivitiesEnum.SOM_FOOT
				|| value4 == ActivitiesEnum.WATSON_BUS || value4 == ActivitiesEnum.WATSON_FOOT) {
			setBuilding(value4);
		} else if (value4 == ActivitiesEnum.CS240_BUS || value4 == ActivitiesEnum.CS240_FOOT
				|| value4 == ActivitiesEnum.CS350) {
			setLecture(value4);
		} else {
			System.out.println("invalid arugument 1");
			System.exit(0);
		}

	}

	/**
	 * This method sets Cafeteria value
	 */
	@Override
	public void setCafeteria(ActivitiesEnum cafeteriaValue) {
		cafeteria = cafeteriaValue;
	}

	/**
	 * This method sets Lecture value
	 */
	@Override
	public void setLecture(ActivitiesEnum lectureValue) {
		lecture = lectureValue;
	}

	/**
	 * This method sets Gift Shop value
	 */
	@Override
	public void setGift(ActivitiesEnum giftValue) {
		gift = giftValue;
	}

	/**
	 * This method sets Building value
	 */
	@Override
	public void setBuilding(ActivitiesEnum buildingValue) {
		building = buildingValue;
	}

	/**
	 * This method is used to get Cafeteria value
	 * @return cafeteria
	 */
	public ActivitiesEnum getCafeteria() {
		return cafeteria;
	}

	/**
	 * This method is used to get Lecture value
	 * @return lecture
	 */
	public ActivitiesEnum getLecture() {
		return lecture;
	}

	/**
	 * This method is used to get Gift Shop value
	 * @return gift
	 */
	public ActivitiesEnum getGift() {
		return gift;
	}

	/**
	 * This method is used to get Building value
	 * @return building
	 */
	public ActivitiesEnum getBuilding() {
		return building;
	}

	/**
	 * This method is used for calculating activity details related to Building
	 */
	@Override
	public void createBuilding() {
		Driver.builder.append("Building: ");
		if (ActivitiesEnum.WATSON_BUS == building)
			Driver.builder.append("WATSON (BY BUS)\n");
		if (ActivitiesEnum.WATSON_FOOT == building)
			Driver.builder.append("WATSON (BY FOOT)\n");
		if (ActivitiesEnum.SOM_BUS == building)
			Driver.builder.append("SOM (BY BUS)\n");
		if (ActivitiesEnum.SOM_FOOT == building)
			Driver.builder.append("SOM (BY FOOT)\n");
		Building build = new Building();
		build.carbonFootprintUsed(building);
		build.costIncurred(building);
		build.durationSpent(building);
		build.effortUtilized(building);

	}

	/**
	 * This method is used for calculating activity details related to Gift Shop
	 */
	@Override
	public void createGift() {
		Gift g = new Gift();
		Driver.builder.append("Gift: ");
		if (ActivitiesEnum.EVENTCENTER_BUS == gift)
			Driver.builder.append("EVENT CENTER (BY BUS)\n");
		if (ActivitiesEnum.EVENTCENTER_FOOT == gift)
			Driver.builder.append("EVENT CENTER (BY FOOT)\n");
		if (ActivitiesEnum.UNIVERSITYUNION_FOOT == gift)
			Driver.builder.append("UNIVERSITY UNION (BY FOOT)\n");
		if (ActivitiesEnum.UNIVERSITYUNION_BUS == gift)
			Driver.builder.append("UNIVERSITY UNION (BY BUS)\n");
		g.carbonFootprintUsed(gift);
		g.costIncurred(gift);
		g.durationSpent(gift);
		g.effortUtilized(gift);

	}

	/**
	 * This method is used for calculating activity details related to Lecture
	 */
	@Override
	public void createLecture() {
		Driver.builder.append("Lecture: ");
		Lecture lect = new Lecture();
		if (ActivitiesEnum.CS240_BUS == lecture)
			Driver.builder.append("CS240 (BY BUS)\n");
		if (ActivitiesEnum.CS240_FOOT == lecture)
			Driver.builder.append("CS240 (BY FOOT)\n");
		if (ActivitiesEnum.CS350 == lecture)
			Driver.builder.append("CS350 (ONLINE)\n");
		lect.carbonFootprintUsed(lecture);
		lect.costIncurred(lecture);
		lect.durationSpent(lecture);
		lect.effortUtilized(lecture);
	}

	/**
	 * This method is used for calculating activity details related to Cafeteria
	 */
	@Override
	public void createCafeteria() {
		Driver.builder.append("Cafeteria: ");
		if (ActivitiesEnum.CIW_BUS == cafeteria)
			Driver.builder.append("CIW (BY BUS)\n");
		else if (ActivitiesEnum.CIW_FOOT == cafeteria)
			Driver.builder.append("CIW (BY FOOT)\n");
		else if (ActivitiesEnum.MOUNTAINVIEW == cafeteria)
			Driver.builder.append("MOUNTAIN VIEW\n");
		Cafeteria cafe = new Cafeteria();
		cafe.carbonFootprintUsed(cafeteria);
		cafe.costIncurred(cafeteria);
		cafe.durationSpent(cafeteria);
		cafe.effortUtilized(cafeteria);
	}

}