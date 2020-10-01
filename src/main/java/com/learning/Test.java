package com.learning;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;

public class Test {

	public static final SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy :E hh:mm:ssss"); 
	
	public static void main(String[] args) {

//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//		ctx.register(AppConfig.class);
//		ctx.refresh();
//
//		ThreadPoolTaskScheduler scheduler = ctx.getBean(ThreadPoolTaskScheduler.class);
//
//		CronTrigger cronTrigger = new CronTrigger("1 * * * * ?");
//
//		scheduler.schedule(new Runnable() {
//
//			
//			
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("------");
//				System.out.printf(" %s %n ", sdf.format(new Date(System.currentTimeMillis())));
//			}
//
//		}, cronTrigger);

		
		Calendar today = Calendar.getInstance();
		today.set(Calendar.HOUR_OF_DAY, 22);
		today.set(Calendar.MINUTE, 26);
		today.set(Calendar.SECOND, 0);

		// every night at 2am you run your task
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("---Timer---");
				System.out.printf(" %s %n ", sdf.format(new Date(System.currentTimeMillis())));
			}

		}, today.getTime(), TimeUnit.MILLISECONDS.convert(1, TimeUnit.MINUTES)); //Perios every 1 minute
		
//		timer.schedule(new TimerTask() {
//			
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("---Timer---");
//				System.out.printf(" %s %n ", sdf.format(new Date(System.currentTimeMillis())));
//			}
//
//		}, today.getTime(), TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS)); // period: 1 day
	}

}
