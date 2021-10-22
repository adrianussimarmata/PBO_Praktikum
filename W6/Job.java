package com.tugas;

public class Job {

	private String jobName;
	private String place;
	
	Job (String jobName, String place) {
		this.jobName = jobName;
		this.place = place;
	}
	
	public String getJobName() {
		return jobName;
	}
	
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	
	public String getPlace() {
		return place;
	}
	
	public void setPlace(String place) {
		this.place = place;
	}
	
	public String toString() {
		return this.jobName + " at " + this.place;
	}
}
