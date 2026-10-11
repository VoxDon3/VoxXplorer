package com.microsoft.graph.generated;

import ax.N9.EnumC0837c;
import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.EmailAddress;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.Event;
import com.microsoft.graph.extensions.EventCollectionPage;
import com.microsoft.graph.extensions.MultiValueLegacyExtendedProperty;
import com.microsoft.graph.extensions.MultiValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.extensions.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.extensions.SingleValueLegacyExtendedPropertyCollectionPage;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class BaseCalendar extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("name")
    public String f;

    @InterfaceC3059a
    @InterfaceC3061c("color")
    public EnumC0837c g;

    @InterfaceC3059a
    @InterfaceC3061c("changeKey")
    public String h;

    @InterfaceC3059a
    @InterfaceC3061c("canShare")
    public Boolean i;

    @InterfaceC3059a
    @InterfaceC3061c("canViewPrivateItems")
    public Boolean j;

    @InterfaceC3059a
    @InterfaceC3061c("canEdit")
    public Boolean k;

    @InterfaceC3059a
    @InterfaceC3061c("owner")
    public EmailAddress l;
    public transient EventCollectionPage m;
    public transient EventCollectionPage n;
    public transient SingleValueLegacyExtendedPropertyCollectionPage o;
    public transient MultiValueLegacyExtendedPropertyCollectionPage p;
    private transient C3003l q;
    private transient e r;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.r = eVar;
        this.q = c3003l;
        if (c3003l.x("events")) {
            BaseEventCollectionResponse baseEventCollectionResponse = new BaseEventCollectionResponse();
            if (c3003l.x("events@odata.nextLink")) {
                baseEventCollectionResponse.b = c3003l.t("events@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("events").toString(), C3003l[].class);
            Event[] eventArr = new Event[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                Event event = (Event) eVar.b(c3003lArr[i].toString(), Event.class);
                eventArr[i] = event;
                event.d(eVar, c3003lArr[i]);
            }
            baseEventCollectionResponse.a = Arrays.asList(eventArr);
            this.m = new EventCollectionPage(baseEventCollectionResponse, null);
        }
        if (c3003l.x("calendarView")) {
            BaseEventCollectionResponse baseEventCollectionResponse2 = new BaseEventCollectionResponse();
            if (c3003l.x("calendarView@odata.nextLink")) {
                baseEventCollectionResponse2.b = c3003l.t("calendarView@odata.nextLink").k();
            }
            C3003l[] c3003lArr2 = (C3003l[]) eVar.b(c3003l.t("calendarView").toString(), C3003l[].class);
            Event[] eventArr2 = new Event[c3003lArr2.length];
            for (int i2 = 0; i2 < c3003lArr2.length; i2++) {
                Event event2 = (Event) eVar.b(c3003lArr2[i2].toString(), Event.class);
                eventArr2[i2] = event2;
                event2.d(eVar, c3003lArr2[i2]);
            }
            baseEventCollectionResponse2.a = Arrays.asList(eventArr2);
            this.n = new EventCollectionPage(baseEventCollectionResponse2, null);
        }
        if (c3003l.x("singleValueExtendedProperties")) {
            BaseSingleValueLegacyExtendedPropertyCollectionResponse baseSingleValueLegacyExtendedPropertyCollectionResponse = new BaseSingleValueLegacyExtendedPropertyCollectionResponse();
            if (c3003l.x("singleValueExtendedProperties@odata.nextLink")) {
                baseSingleValueLegacyExtendedPropertyCollectionResponse.b = c3003l.t("singleValueExtendedProperties@odata.nextLink").k();
            }
            C3003l[] c3003lArr3 = (C3003l[]) eVar.b(c3003l.t("singleValueExtendedProperties").toString(), C3003l[].class);
            SingleValueLegacyExtendedProperty[] singleValueLegacyExtendedPropertyArr = new SingleValueLegacyExtendedProperty[c3003lArr3.length];
            for (int i3 = 0; i3 < c3003lArr3.length; i3++) {
                SingleValueLegacyExtendedProperty singleValueLegacyExtendedProperty = (SingleValueLegacyExtendedProperty) eVar.b(c3003lArr3[i3].toString(), SingleValueLegacyExtendedProperty.class);
                singleValueLegacyExtendedPropertyArr[i3] = singleValueLegacyExtendedProperty;
                singleValueLegacyExtendedProperty.d(eVar, c3003lArr3[i3]);
            }
            baseSingleValueLegacyExtendedPropertyCollectionResponse.a = Arrays.asList(singleValueLegacyExtendedPropertyArr);
            this.o = new SingleValueLegacyExtendedPropertyCollectionPage(baseSingleValueLegacyExtendedPropertyCollectionResponse, null);
        }
        if (c3003l.x("multiValueExtendedProperties")) {
            BaseMultiValueLegacyExtendedPropertyCollectionResponse baseMultiValueLegacyExtendedPropertyCollectionResponse = new BaseMultiValueLegacyExtendedPropertyCollectionResponse();
            if (c3003l.x("multiValueExtendedProperties@odata.nextLink")) {
                baseMultiValueLegacyExtendedPropertyCollectionResponse.b = c3003l.t("multiValueExtendedProperties@odata.nextLink").k();
            }
            C3003l[] c3003lArr4 = (C3003l[]) eVar.b(c3003l.t("multiValueExtendedProperties").toString(), C3003l[].class);
            MultiValueLegacyExtendedProperty[] multiValueLegacyExtendedPropertyArr = new MultiValueLegacyExtendedProperty[c3003lArr4.length];
            for (int i4 = 0; i4 < c3003lArr4.length; i4++) {
                MultiValueLegacyExtendedProperty multiValueLegacyExtendedProperty = (MultiValueLegacyExtendedProperty) eVar.b(c3003lArr4[i4].toString(), MultiValueLegacyExtendedProperty.class);
                multiValueLegacyExtendedPropertyArr[i4] = multiValueLegacyExtendedProperty;
                multiValueLegacyExtendedProperty.d(eVar, c3003lArr4[i4]);
            }
            baseMultiValueLegacyExtendedPropertyCollectionResponse.a = Arrays.asList(multiValueLegacyExtendedPropertyArr);
            this.p = new MultiValueLegacyExtendedPropertyCollectionPage(baseMultiValueLegacyExtendedPropertyCollectionResponse, null);
        }
    }
}
