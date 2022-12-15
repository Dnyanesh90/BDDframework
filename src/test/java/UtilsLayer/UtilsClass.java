package UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClassDemo;

public class UtilsClass extends BaseClassDemo {

	public static void takeScreenshot() {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File f = ts.getScreenshotAs(OutputType.FILE);

		SimpleDateFormat date = new SimpleDateFormat("ddMMyyyy_HHmmss");

		String dateandTime = date.format(new Date(0));
		String dist = System.getProperty("user.dir") + "\\Screenshot\\" + dateandTime + ".png";

		try {
			FileUtils.copyFile(f, new File(dist));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
