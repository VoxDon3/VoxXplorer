/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.O0;
import ax.N9.Z0;
import ax.N9.w;
import ax.N9.z;
import ax.T9.d;
import ax.T9.e;
import ax.r8.i;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.Attachment;
import com.microsoft.graph.extensions.AttachmentCollectionPage;
import com.microsoft.graph.extensions.Calendar;
import com.microsoft.graph.extensions.DateTimeTimeZone;
import com.microsoft.graph.extensions.Event;
import com.microsoft.graph.extensions.EventCollectionPage;
import com.microsoft.graph.extensions.Extension;
import com.microsoft.graph.extensions.ExtensionCollectionPage;
import com.microsoft.graph.extensions.ItemBody;
import com.microsoft.graph.extensions.Location;
import com.microsoft.graph.extensions.MultiValueLegacyExtendedProperty;
import com.microsoft.graph.extensions.MultiValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.extensions.OutlookItem;
import com.microsoft.graph.extensions.PatternedRecurrence;
import com.microsoft.graph.extensions.Recipient;
import com.microsoft.graph.extensions.ResponseStatus;
import com.microsoft.graph.extensions.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.extensions.SingleValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.generated.BaseAttachment;
import com.microsoft.graph.generated.BaseAttachmentCollectionResponse;
import com.microsoft.graph.generated.BaseEventCollectionResponse;
import com.microsoft.graph.generated.BaseExtension;
import com.microsoft.graph.generated.BaseExtensionCollectionResponse;
import com.microsoft.graph.generated.BaseMultiValueLegacyExtendedProperty;
import com.microsoft.graph.generated.BaseMultiValueLegacyExtendedPropertyCollectionResponse;
import com.microsoft.graph.generated.BaseSingleValueLegacyExtendedProperty;
import com.microsoft.graph.generated.BaseSingleValueLegacyExtendedPropertyCollectionResponse;
import java.util.Arrays;
import java.util.List;

public class BaseEvent
extends OutlookItem
implements d {
    @a
    @c(value="location")
    public Location A;
    @a
    @c(value="locations")
    public List<Location> B;
    @a
    @c(value="isAllDay")
    public Boolean C;
    @a
    @c(value="isCancelled")
    public Boolean D;
    @a
    @c(value="isOrganizer")
    public Boolean E;
    @a
    @c(value="recurrence")
    public PatternedRecurrence F;
    @a
    @c(value="responseRequested")
    public Boolean G;
    @a
    @c(value="seriesMasterId")
    public String H;
    @a
    @c(value="showAs")
    public z I;
    @a
    @c(value="type")
    public w J;
    @a
    @c(value="attendees")
    public List<Object> K;
    @a
    @c(value="organizer")
    public Recipient L;
    @a
    @c(value="webLink")
    public String M;
    @a
    @c(value="onlineMeetingUrl")
    public String N;
    @a
    @c(value="calendar")
    public Calendar O;
    public transient EventCollectionPage P;
    public transient ExtensionCollectionPage Q;
    public transient AttachmentCollectionPage R;
    public transient SingleValueLegacyExtendedPropertyCollectionPage S;
    public transient MultiValueLegacyExtendedPropertyCollectionPage T;
    private transient l U;
    private transient e V;
    @a
    @c(value="originalStartTimeZone")
    public String l;
    @a
    @c(value="originalEndTimeZone")
    public String m;
    @a
    @c(value="responseStatus")
    public ResponseStatus n;
    @a
    @c(value="iCalUId")
    public String o;
    @a
    @c(value="reminderMinutesBeforeStart")
    public Integer p;
    @a
    @c(value="isReminderOn")
    public Boolean q;
    @a
    @c(value="hasAttachments")
    public Boolean r;
    @a
    @c(value="subject")
    public String s;
    @a
    @c(value="body")
    public ItemBody t;
    @a
    @c(value="bodyPreview")
    public String u;
    @a
    @c(value="importance")
    public O0 v;
    @a
    @c(value="sensitivity")
    public Z0 w;
    @a
    @c(value="start")
    public DateTimeTimeZone x;
    @a
    @c(value="originalStart")
    public java.util.Calendar y;
    @a
    @c(value="end")
    public DateTimeTimeZone z;

    @Override
    public void d(e e8, l object) {
        Object object2;
        int n8;
        Object object3;
        Object object4;
        Object object5;
        this.V = e8;
        this.U = object;
        boolean bl = ((l)object).x("instances");
        int n9 = 0;
        if (bl) {
            object5 = new BaseEventCollectionResponse();
            if (((l)object).x("instances@odata.nextLink")) {
                ((BaseEventCollectionResponse)object5).b = ((l)object).t("instances@odata.nextLink").k();
            }
            object4 = e8.b(((l)object).t("instances").toString(), l[].class);
            object3 = new Event[((l[])object4).length];
            for (n8 = 0; n8 < ((l[])object4).length; ++n8) {
                object3[n8] = object2 = e8.b(object4[n8].toString(), Event.class);
                ((BaseEvent)object2).d(e8, object4[n8]);
            }
            ((BaseEventCollectionResponse)object5).a = Arrays.asList(object3);
            this.P = new EventCollectionPage((BaseEventCollectionResponse)object5, null);
        }
        if (((l)object).x("extensions")) {
            object5 = new BaseExtensionCollectionResponse();
            if (((l)object).x("extensions@odata.nextLink")) {
                ((BaseExtensionCollectionResponse)object5).b = ((l)object).t("extensions@odata.nextLink").k();
            }
            object4 = e8.b(((l)object).t("extensions").toString(), l[].class);
            object2 = new Extension[((l[])object4).length];
            for (n8 = 0; n8 < ((l[])object4).length; ++n8) {
                object2[n8] = object3 = e8.b(object4[n8].toString(), Extension.class);
                ((BaseExtension)object3).d(e8, object4[n8]);
            }
            ((BaseExtensionCollectionResponse)object5).a = Arrays.asList(object2);
            this.Q = new ExtensionCollectionPage((BaseExtensionCollectionResponse)object5, null);
        }
        if (((l)object).x("attachments")) {
            object5 = new BaseAttachmentCollectionResponse();
            if (((l)object).x("attachments@odata.nextLink")) {
                ((BaseAttachmentCollectionResponse)object5).b = ((l)object).t("attachments@odata.nextLink").k();
            }
            object3 = e8.b(((l)object).t("attachments").toString(), l[].class);
            object2 = new Attachment[((Object[])object3).length];
            for (n8 = 0; n8 < ((Object[])object3).length; ++n8) {
                object2[n8] = object4 = e8.b(((i)object3[n8]).toString(), Attachment.class);
                ((BaseAttachment)object4).d(e8, (l)object3[n8]);
            }
            ((BaseAttachmentCollectionResponse)object5).a = Arrays.asList(object2);
            this.R = new AttachmentCollectionPage((BaseAttachmentCollectionResponse)object5, null);
        }
        if (((l)object).x("singleValueExtendedProperties")) {
            object4 = new BaseSingleValueLegacyExtendedPropertyCollectionResponse();
            if (((l)object).x("singleValueExtendedProperties@odata.nextLink")) {
                ((BaseSingleValueLegacyExtendedPropertyCollectionResponse)object4).b = ((l)object).t("singleValueExtendedProperties@odata.nextLink").k();
            }
            object3 = e8.b(((l)object).t("singleValueExtendedProperties").toString(), l[].class);
            object2 = new SingleValueLegacyExtendedProperty[((Object[])object3).length];
            for (n8 = 0; n8 < ((Object[])object3).length; ++n8) {
                object2[n8] = object5 = e8.b(((i)object3[n8]).toString(), SingleValueLegacyExtendedProperty.class);
                ((BaseSingleValueLegacyExtendedProperty)object5).d(e8, (l)object3[n8]);
            }
            ((BaseSingleValueLegacyExtendedPropertyCollectionResponse)object4).a = Arrays.asList(object2);
            this.S = new SingleValueLegacyExtendedPropertyCollectionPage((BaseSingleValueLegacyExtendedPropertyCollectionResponse)object4, null);
        }
        if (((l)object).x("multiValueExtendedProperties")) {
            object4 = new BaseMultiValueLegacyExtendedPropertyCollectionResponse();
            if (((l)object).x("multiValueExtendedProperties@odata.nextLink")) {
                ((BaseMultiValueLegacyExtendedPropertyCollectionResponse)object4).b = ((l)object).t("multiValueExtendedProperties@odata.nextLink").k();
            }
            object2 = e8.b(((l)object).t("multiValueExtendedProperties").toString(), l[].class);
            object5 = new MultiValueLegacyExtendedProperty[((Object[])object2).length];
            for (n8 = n9; n8 < ((Object[])object2).length; ++n8) {
                object5[n8] = object = e8.b(((i)object2[n8]).toString(), MultiValueLegacyExtendedProperty.class);
                ((BaseMultiValueLegacyExtendedProperty)object).d(e8, (l)object2[n8]);
            }
            ((BaseMultiValueLegacyExtendedPropertyCollectionResponse)object4).a = Arrays.asList(object5);
            this.T = new MultiValueLegacyExtendedPropertyCollectionPage((BaseMultiValueLegacyExtendedPropertyCollectionResponse)object4, null);
        }
    }
}

