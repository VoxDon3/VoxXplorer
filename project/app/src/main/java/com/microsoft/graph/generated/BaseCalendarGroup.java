/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.Calendar;
import com.microsoft.graph.extensions.CalendarCollectionPage;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.generated.BaseCalendarCollectionResponse;
import java.util.Arrays;
import java.util.UUID;

public class BaseCalendarGroup
extends Entity
implements d {
    @a
    @c(value="name")
    public String f;
    @a
    @c(value="classId")
    public UUID g;
    @a
    @c(value="changeKey")
    public String h;
    public transient CalendarCollectionPage i;
    private transient l j;
    private transient e k;

    @Override
    public void d(e e8, l lArray) {
        this.k = e8;
        this.j = lArray;
        if (lArray.x("calendars")) {
            BaseCalendarCollectionResponse baseCalendarCollectionResponse = new BaseCalendarCollectionResponse();
            if (lArray.x("calendars@odata.nextLink")) {
                baseCalendarCollectionResponse.b = lArray.t("calendars@odata.nextLink").k();
            }
            lArray = e8.b(lArray.t("calendars").toString(), l[].class);
            Calendar[] calendarArray = new Calendar[lArray.length];
            for (int i8 = 0; i8 < lArray.length; ++i8) {
                Calendar calendar;
                calendarArray[i8] = calendar = e8.b(lArray[i8].toString(), Calendar.class);
                calendar.d(e8, lArray[i8]);
            }
            baseCalendarCollectionResponse.a = Arrays.asList(calendarArray);
            this.i = new CalendarCollectionPage(baseCalendarCollectionResponse, null);
        }
    }
}

