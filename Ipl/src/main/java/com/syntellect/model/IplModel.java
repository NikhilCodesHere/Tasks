package com.syntellect.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ipl")
public class IplModel {

	@Id
	@Column(name = "match_no")
	private String matchNO;
	@Column(name = "day_")
	private String day;
	@Column(name = "date_")
	private String date;
	@Column(name = "match_")
	private String match;
	@Column(name = "time_")
	private String time;
	@Column(name = "venue")
	private String venue;
	public String getMatchNO() {
		return matchNO;
	}
	public void setMatchNO(String matchNO) {
		this.matchNO = matchNO;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMatch() {
		return match;
	}
	public void setMatch(String match) {
		this.match = match;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public IplModel(String matchNO, String day, String date, String match, String time, String venue) {
		
		this.matchNO = matchNO;
		this.day = day;
		this.date = date;
		this.match = match;
		this.time = time;
		this.venue = venue;
	}
	public IplModel() {
	
	}
	
	
}
