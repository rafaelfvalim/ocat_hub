package br.com.octa.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {

	public static Date toDate(String date) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		try {
			return (Date) formatter.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
