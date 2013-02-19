/**
 * Calendar Intent Module
 * Copyright infiniteloop Co., Ltd.
 */
package com.ti.calendar.intent;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.titanium.util.TiActivitySupport;
import org.appcelerator.titanium.util.TiActivityResultHandler;

import android.app.Activity;
import android.content.Intent;

import java.util.HashMap;

@Kroll.module(name="CalendarIntent", id="com.ti.calendar.intent")
public class CalendarIntentModule extends KrollModule implements TiActivityResultHandler
{
	public CalendarIntentModule()
	{
		super();
	}
	
	@Kroll.constant
	public static final int AVAILABILITY_BUSY = 0;
	@Kroll.constant
	public static final int AVAILABILITY_FREE = 1;
	@Kroll.constant
	public static final int AVAILABILITY_TENTATIVE = 2;
	@Kroll.constant
	public static final int ACCESS_DEFAULT = 0;
	@Kroll.constant
	public static final int ACCESS_CONFIDENTIAL = 1;
	@Kroll.constant
	public static final int ACCESS_PRIVATE = 2;
	@Kroll.constant
	public static final int ACCESS_PUBLIC = 3;
	
	@Kroll.method
	public void create(HashMap args) {
		Activity activity = TiApplication.getAppCurrentActivity();
		TiActivitySupport activitySupport = (TiActivitySupport) activity;
		final int resultCode = activitySupport.getUniqueResultCode();
		
		Intent calendar = new Intent(Intent.ACTION_EDIT);
		calendar.setType("vnd.android.cursor.item/event");
		
		KrollDict options = new KrollDict(args);
		
		if (options.containsKey("title"))
			calendar.putExtra("title", options.getString("title"));
		
		if (options.containsKey("location"))
			calendar.putExtra("eventLocation", options.getString("location"));
		
		if (options.containsKey("description"))
			calendar.putExtra("description", options.getString("description"));
		
		if (options.containsKey("beginTime"))
			calendar.putExtra("beginTime", Long.valueOf(options.getString("beginTime")));
		
		if (options.containsKey("endTime"))
			calendar.putExtra("endTime", Long.valueOf(options.getString("endTime")));
		
		if (options.containsKey("allDay"))
			calendar.putExtra("allDay", options.getBoolean("allDay"));
		
		if (options.containsKey("email"))
			calendar.putExtra(Intent.EXTRA_EMAIL, options.getString("email"));
		
		if (options.containsKey("rrule"))
			calendar.putExtra("rrule", options.getString("rrule"));
		
		if (options.containsKey("accessLevel"))
			calendar.putExtra("accessLevel", options.getInt("accessLevel"));
		
		if (options.containsKey("availability"))
			calendar.putExtra("availability", options.getInt("availability"));
		
		activitySupport.launchActivityForResult(calendar, resultCode, this);
	}
	
	@Override
	public void onError(Activity activity, int requestCode, Exception e)
	{
	}
	
	@Override
	public void onResult(Activity activity, int requestCode, int resultCode, Intent data)
	{
	}
}
