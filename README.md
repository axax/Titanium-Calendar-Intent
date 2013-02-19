Titanium Calendar Intent
========================

It creates Intent for Android default calendar.

Usage
-----

```js
var calendar = require('com.ti.calendar.intent');

var time = new Date().getTime();

calendar.addEvent({
  title: "Event Title",
  location: "Event Location",
  description: "Event Description",
  beginTime: String(time),
  endTime: String(time + 3600 * 1000),
  allDay: false,
  email: "guest@example.com,guest@example.net",
  rrule: "FREQ=WEEKLY;COUNT=10;WKST=SU",
  accessLevel: calendar.ACCESS_DEFAULT,
  availability: calendar.AVAILABILITY_TENTATIVE
});
```

Refer to the
[Calendar Intents](http://developer.android.com/intl/ja/guide/topics/providers/calendar-provider.html#intents).

License
-------

The MIT License

Copyright
---------

Copyright (c) 2013 infiniteloop Co., Ltd.
