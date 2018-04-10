Assuming you are in the directory containing this README:

## To clean:
ant -buildfile src/build.xml clean

-----------------------------------------------------------------------
## To compile: 
ant -buildfile src/build.xml all

-----------------------------------------------------------------------
## To run by specifying arguments from command line 
## We will use this to run your code
ant -buildfile src/build.xml run

-----------------------------------------------------------------------

## To create tarball for submission
ant -buildfile src/build.xml tarzip
or
tar -cvf sujoy_das_assign_3.tar sujoy_das_assign_3/
gzip sujoy_das_assign_3.tar

## To create javadocs
1. make sure you are inside src folder
2. run following command "ant javadocs"
3. Destination: inside campusTour
-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense.

[Date: 04-10-2018] 

-----------------------------------------------------------------------
Assumptions:
1. All arguments belong to separate activities(Activities won't be repeated) in driver.
2. Although it can be in any order.
3. Cost and duration for completion of each activity is assumed.
4. Effort is calculated as, Effort = Duration * 1000 Calories.
5. Carbon Footprint is calculated as, Carbon Footprint = Duration * 10^-4 Tonnes

Assumption Chart:
Activity		Effort		Cost		Duration	CarbonFootprint
CIW BUS			3000		2		30		30*10^-4
CIW FOOT		3000		1		30		30*10^-4
MV			4500		2.1		45		45*10^-4
EVNTCENT BUS		1500		2		15		15*10^-4
EVNTCENT FOOT		1500		1		15		15*10^-4
UNVERSTYUNION BUS	1500		1		15		15*10^-4
UNVERSTYUNION FOOT	1500		0.5		15		15*10^-4
SOM BUS			3000		1		30		30*10^-4
SOM FOOT		3000		0.5		30		30*10^-4
WATSON BUS		3000		1		30		30*10^-4
WATSON FOOT		3000		0.5		30		30*10^-4
CS240 BUS		6000		2		60		60*10^-4
CS240 FOOT		6000		1		60		60*10^-4
CS350 			6000		2.2		60		60*10^-4






