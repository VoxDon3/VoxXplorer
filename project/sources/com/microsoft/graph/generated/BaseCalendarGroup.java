package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Calendar;
import com.microsoft.graph.extensions.CalendarCollectionPage;
import com.microsoft.graph.extensions.Entity;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes3.dex */
public class BaseCalendarGroup extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("name")
    public String f;

    @InterfaceC3059a
    @InterfaceC3061c("classId")
    public UUID g;

    @InterfaceC3059a
    @InterfaceC3061c("changeKey")
    public String h;
    public transient CalendarCollectionPage i;
    private transient C3003l j;
    private transient e k;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.k = eVar;
        this.j = c3003l;
        if (c3003l.x("calendars")) {
            BaseCalendarCollectionResponse baseCalendarCollectionResponse = new BaseCalendarCollectionResponse();
            if (c3003l.x("calendars@odata.nextLink")) {
                baseCalendarCollectionResponse.b = c3003l.t("calendars@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("calendars").toString(), C3003l[].class);
            Calendar[] calendarArr = new Calendar[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                Calendar calendar = (Calendar) eVar.b(c3003lArr[i].toString(), Calendar.class);
                calendarArr[i] = calendar;
                calendar.d(eVar, c3003lArr[i]);
            }
            baseCalendarCollectionResponse.a = Arrays.asList(calendarArr);
            this.i = new CalendarCollectionPage(baseCalendarCollectionResponse, null);
        }
    }
}
