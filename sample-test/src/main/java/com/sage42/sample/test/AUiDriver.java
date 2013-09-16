package com.sage42.sample.test;

import android.app.Activity;

public abstract class AUiDriver<ActivityUnderTest extends Activity> extends ARobotiumBase<ActivityUnderTest>
{
    public AUiDriver(final Class<ActivityUnderTest> activityClass)
    {
        super(activityClass);
    }

}
