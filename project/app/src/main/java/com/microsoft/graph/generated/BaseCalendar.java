/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.i;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.EmailAddress;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.Event;
import com.microsoft.graph.extensions.EventCollectionPage;
import com.microsoft.graph.extensions.MultiValueLegacyExtendedProperty;
import com.microsoft.graph.extensions.MultiValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.extensions.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.extensions.SingleValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.generated.BaseEvent;
import com.microsoft.graph.generated.BaseEventCollectionResponse;
import com.microsoft.graph.generated.BaseMultiValueLegacyExtendedProperty;
import com.microsoft.graph.generated.BaseMultiValueLegacyExtendedPropertyCollectionResponse;
import com.microsoft.graph.generated.BaseSingleValueLegacyExtendedProperty;
import com.microsoft.graph.generated.BaseSingleValueLegacyExtendedPropertyCollectionResponse;
import java.util.Arrays;

public class BaseCalendar
extends Entity
implements d {
    @a
    @c(value="name")
    public String f;
    @a
    @c(value="color")
    public ax.N9.c g;
    @a
    @c(value="changeKey")
    public String h;
    @a
    @c(value="canShare")
    public Boolean i;
    @a
    @c(value="canViewPrivateItems")
    public Boolean j;
    @a
    @c(value="canEdit")
    public Boolean k;
    @a
    @c(value="owner")
    public EmailAddress l;
    public transient EventCollectionPage m;
    public transient EventCollectionPage n;
    public transient SingleValueLegacyExtendedPropertyCollectionPage o;
    public transient MultiValueLegacyExtendedPropertyCollectionPage p;
    private transient l q;
    private transient e r;

    @Override
    public void d(e e8, l multiValueLegacyExtendedPropertyArray) {
        d d8;
        int n8;
        Object object;
        Object object2;
        Object[] objectArray;
        this.r = e8;
        this.q = multiValueLegacyExtendedPropertyArray;
        boolean bl = multiValueLegacyExtendedPropertyArray.x("events");
        int n9 = 0;
        if (bl) {
            objectArray = new BaseEventCollectionResponse();
            if (multiValueLegacyExtendedPropertyArray.x("events@odata.nextLink")) {
                objectArray.b = multiValueLegacyExtendedPropertyArray.t("events@odata.nextLink").k();
            }
            object2 = e8.b(multiValueLegacyExtendedPropertyArray.t("events").toString(), l[].class);
            object = new Event[((l[])object2).length];
            for (n8 = 0; n8 < ((l[])object2).length; ++n8) {
                d8 = e8.b(object2[n8].toString(), Event.class);
                object[n8] = d8;
                ((BaseEvent)d8).d(e8, object2[n8]);
            }
            objectArray.a = Arrays.asList(object);
            this.m = new EventCollectionPage((BaseEventCollectionResponse)objectArray, null);
        }
        if (multiValueLegacyExtendedPropertyArray.x("calendarView")) {
            d8 = new BaseEventCollectionResponse();
            if (multiValueLegacyExtendedPropertyArray.x("calendarView@odata.nextLink")) {
                ((BaseEventCollectionResponse)d8).b = multiValueLegacyExtendedPropertyArray.t("calendarView@odata.nextLink").k();
            }
            object2 = e8.b(multiValueLegacyExtendedPropertyArray.t("calendarView").toString(), l[].class);
            objectArray = new Event[((l[])object2).length];
            for (n8 = 0; n8 < ((l[])object2).length; ++n8) {
                object = e8.b(object2[n8].toString(), Event.class);
                objectArray[n8] = object;
                ((BaseEvent)object).d(e8, object2[n8]);
            }
            ((BaseEventCollectionResponse)d8).a = Arrays.asList(objectArray);
            this.n = new EventCollectionPage((BaseEventCollectionResponse)d8, null);
        }
        if (multiValueLegacyExtendedPropertyArray.x("singleValueExtendedProperties")) {
            d8 = new BaseSingleValueLegacyExtendedPropertyCollectionResponse();
            if (multiValueLegacyExtendedPropertyArray.x("singleValueExtendedProperties@odata.nextLink")) {
                ((BaseSingleValueLegacyExtendedPropertyCollectionResponse)d8).b = multiValueLegacyExtendedPropertyArray.t("singleValueExtendedProperties@odata.nextLink").k();
            }
            object2 = e8.b(multiValueLegacyExtendedPropertyArray.t("singleValueExtendedProperties").toString(), l[].class);
            objectArray = new SingleValueLegacyExtendedProperty[((l[])object2).length];
            for (n8 = 0; n8 < ((l[])object2).length; ++n8) {
                objectArray[n8] = object = e8.b(object2[n8].toString(), SingleValueLegacyExtendedProperty.class);
                ((BaseSingleValueLegacyExtendedProperty)object).d(e8, object2[n8]);
            }
            ((BaseSingleValueLegacyExtendedPropertyCollectionResponse)d8).a = Arrays.asList(objectArray);
            this.o = new SingleValueLegacyExtendedPropertyCollectionPage((BaseSingleValueLegacyExtendedPropertyCollectionResponse)d8, null);
        }
        if (multiValueLegacyExtendedPropertyArray.x("multiValueExtendedProperties")) {
            object = new BaseMultiValueLegacyExtendedPropertyCollectionResponse();
            if (multiValueLegacyExtendedPropertyArray.x("multiValueExtendedProperties@odata.nextLink")) {
                ((BaseMultiValueLegacyExtendedPropertyCollectionResponse)object).b = multiValueLegacyExtendedPropertyArray.t("multiValueExtendedProperties@odata.nextLink").k();
            }
            objectArray = e8.b(multiValueLegacyExtendedPropertyArray.t("multiValueExtendedProperties").toString(), l[].class);
            multiValueLegacyExtendedPropertyArray = new MultiValueLegacyExtendedProperty[objectArray.length];
            for (n8 = n9; n8 < objectArray.length; ++n8) {
                multiValueLegacyExtendedPropertyArray[n8] = object2 = e8.b(((i)objectArray[n8]).toString(), MultiValueLegacyExtendedProperty.class);
                ((BaseMultiValueLegacyExtendedProperty)object2).d(e8, (l)objectArray[n8]);
            }
            ((BaseMultiValueLegacyExtendedPropertyCollectionResponse)object).a = Arrays.asList(multiValueLegacyExtendedPropertyArray);
            this.p = new MultiValueLegacyExtendedPropertyCollectionPage((BaseMultiValueLegacyExtendedPropertyCollectionResponse)object, null);
        }
    }
}

