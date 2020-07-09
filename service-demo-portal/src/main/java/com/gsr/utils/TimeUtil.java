package com.gsr.utils;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class TimeUtil {
	
	public List<LocalDate> getDay(int month,int year) {
		YearMonth monthYear=YearMonth.of(year, month) ;
		LocalDate firstday=monthYear.atDay(1);
		LocalDate lastday=monthYear.atEndOfMonth();
		List<LocalDate> date=new ArrayList<LocalDate>();
		date.add(1, firstday);
		date.add(1, lastday);
		return date;
	}

	public List<Object> getDateDetails(String date ){
		LocalDate ldate=LocalDate.parse(date);
		List<Object> output=new ArrayList<Object>();
		output.add(0, ldate.getMonthValue());
		output.add(1, ldate.getMonth());
		output.add(2, ldate.getYear());
		return output;
	}
}
