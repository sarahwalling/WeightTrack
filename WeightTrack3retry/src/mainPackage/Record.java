package mainPackage;

import java.sql.Timestamp;

public class Record implements Comparable<Record> {
	int year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour;
	double userHeight, userWeight, userGoal;
	Timestamp timestamp;

	public Record(Timestamp timestamp, double userHeight, double userWeight, double userGoal) {
		this.timestamp = timestamp;
		this.userHeight = userHeight;
		this.userWeight = userWeight;
		this.userGoal = userGoal;
	}

	public Timestamp getTime() {
		return timestamp;
	}

	public String toString(){
		return timestamp + "";	
	}
	
	@Override
	//uses the Comparable interface to set up the logic to sort the Arraylist
	public int compareTo(Record o) {

        if (this.timestamp.toInstant().toEpochMilli() == ((Record) o).timestamp.toInstant().toEpochMilli())
            return 0;
        else if ((this.timestamp.toInstant().toEpochMilli()) > ((Record) o).timestamp.toInstant().toEpochMilli())
            return 1;
        else
            return -1;
	}

	
	
}
