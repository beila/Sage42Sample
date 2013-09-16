package com.sage42.sample.test;

import com.sage42.sample.lib.SampleActivity_;

public class SampleTest extends AUiDriver<SampleActivity_>
{
    public SampleTest()
    {
        super(SampleActivity_.class);
    }

    public void testA()
    {
        this.getSolo().assertCurrentActivity("Check current activity", SampleActivity_.class.getSimpleName());
    }

}
