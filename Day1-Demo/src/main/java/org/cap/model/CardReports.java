package org.cap.model;

public class CardReports {
	
	public int carId;
	public int ReportId;
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public int getReportId() {
		return ReportId;
	}
	public void setReportId(int reportId) {
		ReportId = reportId;
		
	}
	public CardReports(int carId, int reportId) {
		super();
		this.carId = carId;
		ReportId = reportId;
	}
	

}
