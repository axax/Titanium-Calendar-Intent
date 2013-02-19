# Calendar Intent Module

## Description

It creates Intent for Android default calendar.

## Accessing the Calendar Intent Module

To access this module from JavaScript, you would do the following:

	var calendar = require("com.ti.calendar.intent");

The calendar variable is a reference to the Module object.

## Reference

### calendar.addEvent(object)

#### object
##### (String) title

Event title.

##### (String) location

Event location.

##### (String) description

Event description.

##### (String) beginTime

Event begin time. (UTC millisec)

##### (String) endTime

Event end time. (UTC millisec)

##### (Boolean) allDay

All day event.

##### (String) email

Email string. (comma separated)

##### (String) rrule

[RFC5545 3.8.5.3. Recurrence Rule](http://tools.ietf.org/html/rfc5545#section-3.8.5.3)

##### (Number) accessLevel

`calendar.ACCESS_DEFAULT` or `calendar.ACCESS_CONFIDENTIAL` or `calendar.ACCESS_PRIVATE` or `calendar.ACCESS_PUBLIC`

##### (Number) availability

`calendar.AVAILABILITY_BUSY` or `calendar.AVAILABILITY_FREE` or `calendar.AVAILABILITY_TENTATIVE`

--------------------------------

### calendar.AVAILABILITY_BUSY

Constant value: `0`

### calendar.AVAILABILITY_FREE

Constant value: `1`

### calendar.AVAILABILITY_TENTATIVE

Constant value: `2`

### calendar.ACCESS_DEFAULT

Constant value: `0`

### calendar.ACCESS_CONFIDENTIAL

Constant value: `1`

### calendar.ACCESS_PRIVATE

Constant value: `2`

### calendar.ACCESS_PUBLIC

Constant value: `3`

Refer to the
[Calendar Intents](http://developer.android.com/intl/ja/guide/topics/providers/calendar-provider.html#intents)
and
[Constants](http://developer.android.com/intl/ja/reference/android/provider/CalendarContract.EventsColumns.html#ACCESS_CONFIDENTIAL).

## Usage

Refer to the `example/app.js`

## Author

infiniteloop Co., Ltd.

## License

The MIT License
