package com.zhangwei.dongwu.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
	//static TencentDailyTask dt;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		FileLock lck;
		try {
			lck = new FileOutputStream("D:\\.sobulldog_test\\_lock").getChannel().tryLock();
			if (lck == null) {
				System.err
						.println("A previous instance is already running....");
				System.exit(1);
			}
			System.err.println("This is the first instance of this program...");
			// Do some work here.....
			if (dt == null || !dt.isAlive()) {
				dt = new TencentDailyTask(args[0]);
				dt.start();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//SinaStockHelper ssh = SinaStockHelper.getInstance();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//小写的mm表示的是分钟  
		String dstr="2010-10-10";  
		try {
			java.util.Date end_date=sdf.parse(dstr);
			//ssh.get_HistoryRecords_from_sina("300031", new Date(), end_date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		

	}

}
