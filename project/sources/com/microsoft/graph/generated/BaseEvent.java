package com.microsoft.graph.generated;

import ax.N9.EnumC0876w;
import ax.N9.EnumC0882z;
import ax.N9.O0;
import ax.N9.Z0;
import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
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
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class BaseEvent extends OutlookItem implements d {

    @InterfaceC3059a
    @InterfaceC3061c("location")
    public Location A;

    @InterfaceC3059a
    @InterfaceC3061c("locations")
    public List<Location> B;

    @InterfaceC3059a
    @InterfaceC3061c("isAllDay")
    public Boolean C;

    @InterfaceC3059a
    @InterfaceC3061c("isCancelled")
    public Boolean D;

    @InterfaceC3059a
    @InterfaceC3061c("isOrganizer")
    public Boolean E;

    @InterfaceC3059a
    @InterfaceC3061c("recurrence")
    public PatternedRecurrence F;

    @InterfaceC3059a
    @InterfaceC3061c("responseRequested")
    public Boolean G;

    @InterfaceC3059a
    @InterfaceC3061c("seriesMasterId")
    public String H;

    @InterfaceC3059a
    @InterfaceC3061c("showAs")
    public EnumC0882z I;

    @InterfaceC3059a
    @InterfaceC3061c("type")
    public EnumC0876w J;

    @InterfaceC3059a
    @InterfaceC3061c("attendees")
    public List<Object> K;

    @InterfaceC3059a
    @InterfaceC3061c("organizer")
    public Recipient L;

    @InterfaceC3059a
    @InterfaceC3061c("webLink")
    public String M;

    @InterfaceC3059a
    @InterfaceC3061c("onlineMeetingUrl")
    public String N;

    @InterfaceC3059a
    @InterfaceC3061c("calendar")
    public Calendar O;
    public transient EventCollectionPage P;
    public transient ExtensionCollectionPage Q;
    public transient AttachmentCollectionPage R;
    public transient SingleValueLegacyExtendedPropertyCollectionPage S;
    public transient MultiValueLegacyExtendedPropertyCollectionPage T;
    private transient C3003l U;
    private transient e V;

    @InterfaceC3059a
    @InterfaceC3061c("originalStartTimeZone")
    public String l;

    @InterfaceC3059a
    @InterfaceC3061c("originalEndTimeZone")
    public String m;

    @InterfaceC3059a
    @InterfaceC3061c("responseStatus")
    public ResponseStatus n;

    @InterfaceC3059a
    @InterfaceC3061c("iCalUId")
    public String o;

    @InterfaceC3059a
    @InterfaceC3061c("reminderMinutesBeforeStart")
    public Integer p;

    @InterfaceC3059a
    @InterfaceC3061c("isReminderOn")
    public Boolean q;

    @InterfaceC3059a
    @InterfaceC3061c("hasAttachments")
    public Boolean r;

    @InterfaceC3059a
    @InterfaceC3061c("subject")
    public String s;

    @InterfaceC3059a
    @InterfaceC3061c("body")
    public ItemBody t;

    @InterfaceC3059a
    @InterfaceC3061c("bodyPreview")
    public String u;

    @InterfaceC3059a
    @InterfaceC3061c("importance")
    public O0 v;

    @InterfaceC3059a
    @InterfaceC3061c("sensitivity")
    public Z0 w;

    @InterfaceC3059a
    @InterfaceC3061c("start")
    public DateTimeTimeZone x;

    @InterfaceC3059a
    @InterfaceC3061c("originalStart")
    public java.util.Calendar y;

    @InterfaceC3059a
    @InterfaceC3061c("end")
    public DateTimeTimeZone z;

    @Override // com.microsoft.graph.generated.BaseOutlookItem, com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.V = eVar;
        this.U = c3003l;
        if (c3003l.x("instances")) {
            BaseEventCollectionResponse baseEventCollectionResponse = new BaseEventCollectionResponse();
            if (c3003l.x("instances@odata.nextLink")) {
                baseEventCollectionResponse.b = c3003l.t("instances@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("instances").toString(), C3003l[].class);
            Event[] eventArr = new Event[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                Event event = (Event) eVar.b(c3003lArr[i].toString(), Event.class);
                eventArr[i] = event;
                event.d(eVar, c3003lArr[i]);
            }
            baseEventCollectionResponse.a = Arrays.asList(eventArr);
            this.P = new EventCollectionPage(baseEventCollectionResponse, null);
        }
        if (c3003l.x("extensions")) {
            BaseExtensionCollectionResponse baseExtensionCollectionResponse = new BaseExtensionCollectionResponse();
            if (c3003l.x("extensions@odata.nextLink")) {
                baseExtensionCollectionResponse.b = c3003l.t("extensions@odata.nextLink").k();
            }
            C3003l[] c3003lArr2 = (C3003l[]) eVar.b(c3003l.t("extensions").toString(), C3003l[].class);
            Extension[] extensionArr = new Extension[c3003lArr2.length];
            for (int i2 = 0; i2 < c3003lArr2.length; i2++) {
                Extension extension = (Extension) eVar.b(c3003lArr2[i2].toString(), Extension.class);
                extensionArr[i2] = extension;
                extension.d(eVar, c3003lArr2[i2]);
            }
            baseExtensionCollectionResponse.a = Arrays.asList(extensionArr);
            this.Q = new ExtensionCollectionPage(baseExtensionCollectionResponse, null);
        }
        if (c3003l.x("attachments")) {
            BaseAttachmentCollectionResponse baseAttachmentCollectionResponse = new BaseAttachmentCollectionResponse();
            if (c3003l.x("attachments@odata.nextLink")) {
                baseAttachmentCollectionResponse.b = c3003l.t("attachments@odata.nextLink").k();
            }
            C3003l[] c3003lArr3 = (C3003l[]) eVar.b(c3003l.t("attachments").toString(), C3003l[].class);
            Attachment[] attachmentArr = new Attachment[c3003lArr3.length];
            for (int i3 = 0; i3 < c3003lArr3.length; i3++) {
                Attachment attachment = (Attachment) eVar.b(c3003lArr3[i3].toString(), Attachment.class);
                attachmentArr[i3] = attachment;
                attachment.d(eVar, c3003lArr3[i3]);
            }
            baseAttachmentCollectionResponse.a = Arrays.asList(attachmentArr);
            this.R = new AttachmentCollectionPage(baseAttachmentCollectionResponse, null);
        }
        if (c3003l.x("singleValueExtendedProperties")) {
            BaseSingleValueLegacyExtendedPropertyCollectionResponse baseSingleValueLegacyExtendedPropertyCollectionResponse = new BaseSingleValueLegacyExtendedPropertyCollectionResponse();
            if (c3003l.x("singleValueExtendedProperties@odata.nextLink")) {
                baseSingleValueLegacyExtendedPropertyCollectionResponse.b = c3003l.t("singleValueExtendedProperties@odata.nextLink").k();
            }
            C3003l[] c3003lArr4 = (C3003l[]) eVar.b(c3003l.t("singleValueExtendedProperties").toString(), C3003l[].class);
            SingleValueLegacyExtendedProperty[] singleValueLegacyExtendedPropertyArr = new SingleValueLegacyExtendedProperty[c3003lArr4.length];
            for (int i4 = 0; i4 < c3003lArr4.length; i4++) {
                SingleValueLegacyExtendedProperty singleValueLegacyExtendedProperty = (SingleValueLegacyExtendedProperty) eVar.b(c3003lArr4[i4].toString(), SingleValueLegacyExtendedProperty.class);
                singleValueLegacyExtendedPropertyArr[i4] = singleValueLegacyExtendedProperty;
                singleValueLegacyExtendedProperty.d(eVar, c3003lArr4[i4]);
            }
            baseSingleValueLegacyExtendedPropertyCollectionResponse.a = Arrays.asList(singleValueLegacyExtendedPropertyArr);
            this.S = new SingleValueLegacyExtendedPropertyCollectionPage(baseSingleValueLegacyExtendedPropertyCollectionResponse, null);
        }
        if (c3003l.x("multiValueExtendedProperties")) {
            BaseMultiValueLegacyExtendedPropertyCollectionResponse baseMultiValueLegacyExtendedPropertyCollectionResponse = new BaseMultiValueLegacyExtendedPropertyCollectionResponse();
            if (c3003l.x("multiValueExtendedProperties@odata.nextLink")) {
                baseMultiValueLegacyExtendedPropertyCollectionResponse.b = c3003l.t("multiValueExtendedProperties@odata.nextLink").k();
            }
            C3003l[] c3003lArr5 = (C3003l[]) eVar.b(c3003l.t("multiValueExtendedProperties").toString(), C3003l[].class);
            MultiValueLegacyExtendedProperty[] multiValueLegacyExtendedPropertyArr = new MultiValueLegacyExtendedProperty[c3003lArr5.length];
            for (int i5 = 0; i5 < c3003lArr5.length; i5++) {
                MultiValueLegacyExtendedProperty multiValueLegacyExtendedProperty = (MultiValueLegacyExtendedProperty) eVar.b(c3003lArr5[i5].toString(), MultiValueLegacyExtendedProperty.class);
                multiValueLegacyExtendedPropertyArr[i5] = multiValueLegacyExtendedProperty;
                multiValueLegacyExtendedProperty.d(eVar, c3003lArr5[i5]);
            }
            baseMultiValueLegacyExtendedPropertyCollectionResponse.a = Arrays.asList(multiValueLegacyExtendedPropertyArr);
            this.T = new MultiValueLegacyExtendedPropertyCollectionPage(baseMultiValueLegacyExtendedPropertyCollectionResponse, null);
        }
    }
}
