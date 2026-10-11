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
import com.microsoft.graph.extensions.Calendar;
import com.microsoft.graph.extensions.CalendarCollectionPage;
import com.microsoft.graph.extensions.CalendarGroup;
import com.microsoft.graph.extensions.CalendarGroupCollectionPage;
import com.microsoft.graph.extensions.Contact;
import com.microsoft.graph.extensions.ContactCollectionPage;
import com.microsoft.graph.extensions.ContactFolder;
import com.microsoft.graph.extensions.ContactFolderCollectionPage;
import com.microsoft.graph.extensions.DirectoryObject;
import com.microsoft.graph.extensions.DirectoryObjectCollectionPage;
import com.microsoft.graph.extensions.Drive;
import com.microsoft.graph.extensions.DriveCollectionPage;
import com.microsoft.graph.extensions.Event;
import com.microsoft.graph.extensions.EventCollectionPage;
import com.microsoft.graph.extensions.Extension;
import com.microsoft.graph.extensions.ExtensionCollectionPage;
import com.microsoft.graph.extensions.InferenceClassification;
import com.microsoft.graph.extensions.LicenseDetails;
import com.microsoft.graph.extensions.LicenseDetailsCollectionPage;
import com.microsoft.graph.extensions.MailFolder;
import com.microsoft.graph.extensions.MailFolderCollectionPage;
import com.microsoft.graph.extensions.MailboxSettings;
import com.microsoft.graph.extensions.Message;
import com.microsoft.graph.extensions.MessageCollectionPage;
import com.microsoft.graph.extensions.Onenote;
import com.microsoft.graph.extensions.OutlookUser;
import com.microsoft.graph.extensions.PasswordProfile;
import com.microsoft.graph.extensions.Person;
import com.microsoft.graph.extensions.PersonCollectionPage;
import com.microsoft.graph.extensions.PlannerUser;
import com.microsoft.graph.extensions.ProfilePhoto;
import com.microsoft.graph.extensions.ProfilePhotoCollectionPage;
import com.microsoft.graph.extensions.UserActivity;
import com.microsoft.graph.extensions.UserActivityCollectionPage;
import com.microsoft.graph.generated.BaseCalendar;
import com.microsoft.graph.generated.BaseCalendarCollectionResponse;
import com.microsoft.graph.generated.BaseCalendarGroup;
import com.microsoft.graph.generated.BaseCalendarGroupCollectionResponse;
import com.microsoft.graph.generated.BaseContact;
import com.microsoft.graph.generated.BaseContactCollectionResponse;
import com.microsoft.graph.generated.BaseContactFolder;
import com.microsoft.graph.generated.BaseContactFolderCollectionResponse;
import com.microsoft.graph.generated.BaseDirectoryObject;
import com.microsoft.graph.generated.BaseDirectoryObjectCollectionResponse;
import com.microsoft.graph.generated.BaseDrive;
import com.microsoft.graph.generated.BaseDriveCollectionResponse;
import com.microsoft.graph.generated.BaseEvent;
import com.microsoft.graph.generated.BaseEventCollectionResponse;
import com.microsoft.graph.generated.BaseExtension;
import com.microsoft.graph.generated.BaseExtensionCollectionResponse;
import com.microsoft.graph.generated.BaseLicenseDetails;
import com.microsoft.graph.generated.BaseLicenseDetailsCollectionResponse;
import com.microsoft.graph.generated.BaseMailFolder;
import com.microsoft.graph.generated.BaseMailFolderCollectionResponse;
import com.microsoft.graph.generated.BaseMessage;
import com.microsoft.graph.generated.BaseMessageCollectionResponse;
import com.microsoft.graph.generated.BasePerson;
import com.microsoft.graph.generated.BasePersonCollectionResponse;
import com.microsoft.graph.generated.BaseProfilePhoto;
import com.microsoft.graph.generated.BaseProfilePhotoCollectionResponse;
import com.microsoft.graph.generated.BaseUserActivity;
import com.microsoft.graph.generated.BaseUserActivityCollectionResponse;
import java.util.Arrays;
import java.util.List;

public class BaseUser
extends DirectoryObject
implements d {
    @a
    @c(value="onPremisesSyncEnabled")
    public Boolean A;
    public transient UserActivityCollectionPage A0;
    @a
    @c(value="passwordPolicies")
    public String B;
    private transient l B0;
    @a
    @c(value="passwordProfile")
    public PasswordProfile C;
    private transient e C0;
    @a
    @c(value="officeLocation")
    public String D;
    @a
    @c(value="postalCode")
    public String E;
    @a
    @c(value="preferredLanguage")
    public String F;
    @a
    @c(value="provisionedPlans")
    public List<Object> G;
    @a
    @c(value="proxyAddresses")
    public List<String> H;
    @a
    @c(value="state")
    public String I;
    @a
    @c(value="streetAddress")
    public String J;
    @a
    @c(value="surname")
    public String K;
    @a
    @c(value="usageLocation")
    public String L;
    @a
    @c(value="userPrincipalName")
    public String M;
    @a
    @c(value="userType")
    public String N;
    @a
    @c(value="mailboxSettings")
    public MailboxSettings O;
    @a
    @c(value="aboutMe")
    public String P;
    @a
    @c(value="birthday")
    public java.util.Calendar Q;
    @a
    @c(value="hireDate")
    public java.util.Calendar R;
    @a
    @c(value="interests")
    public List<String> S;
    @a
    @c(value="mySite")
    public String T;
    @a
    @c(value="pastProjects")
    public List<String> U;
    @a
    @c(value="preferredName")
    public String V;
    @a
    @c(value="responsibilities")
    public List<String> W;
    @a
    @c(value="schools")
    public List<String> X;
    @a
    @c(value="skills")
    public List<String> Y;
    public transient DirectoryObjectCollectionPage Z;
    public transient DirectoryObjectCollectionPage a0;
    @a
    @c(value="manager")
    public DirectoryObject b0;
    public transient DirectoryObjectCollectionPage c0;
    public transient DirectoryObjectCollectionPage d0;
    public transient DirectoryObjectCollectionPage e0;
    public transient DirectoryObjectCollectionPage f0;
    public transient LicenseDetailsCollectionPage g0;
    public transient ExtensionCollectionPage h0;
    @a
    @c(value="accountEnabled")
    public Boolean i;
    @a
    @c(value="outlook")
    public OutlookUser i0;
    @a
    @c(value="assignedLicenses")
    public List<Object> j;
    public transient MessageCollectionPage j0;
    @a
    @c(value="assignedPlans")
    public List<Object> k;
    public transient MailFolderCollectionPage k0;
    @a
    @c(value="businessPhones")
    public List<String> l;
    @a
    @c(value="calendar")
    public Calendar l0;
    @a
    @c(value="city")
    public String m;
    public transient CalendarCollectionPage m0;
    @a
    @c(value="companyName")
    public String n;
    public transient CalendarGroupCollectionPage n0;
    @a
    @c(value="country")
    public String o;
    public transient EventCollectionPage o0;
    @a
    @c(value="department")
    public String p;
    public transient EventCollectionPage p0;
    @a
    @c(value="displayName")
    public String q;
    public transient PersonCollectionPage q0;
    @a
    @c(value="givenName")
    public String r;
    public transient ContactCollectionPage r0;
    @a
    @c(value="imAddresses")
    public List<String> s;
    public transient ContactFolderCollectionPage s0;
    @a
    @c(value="jobTitle")
    public String t;
    @a
    @c(value="inferenceClassification")
    public InferenceClassification t0;
    @a
    @c(value="mail")
    public String u;
    @a
    @c(value="photo")
    public ProfilePhoto u0;
    @a
    @c(value="mailNickname")
    public String v;
    public transient ProfilePhotoCollectionPage v0;
    @a
    @c(value="mobilePhone")
    public String w;
    @a
    @c(value="drive")
    public Drive w0;
    @a
    @c(value="onPremisesImmutableId")
    public String x;
    public transient DriveCollectionPage x0;
    @a
    @c(value="onPremisesLastSyncDateTime")
    public java.util.Calendar y;
    @a
    @c(value="planner")
    public PlannerUser y0;
    @a
    @c(value="onPremisesSecurityIdentifier")
    public String z;
    @a
    @c(value="onenote")
    public Onenote z0;

    @Override
    public void d(e e8, l lArray) {
        Object object;
        int n8;
        Object object2;
        Object object3;
        Object object4;
        this.C0 = e8;
        this.B0 = lArray;
        boolean bl = lArray.x("ownedDevices");
        int n9 = 0;
        if (bl) {
            object4 = new BaseDirectoryObjectCollectionResponse();
            if (lArray.x("ownedDevices@odata.nextLink")) {
                ((BaseDirectoryObjectCollectionResponse)object4).b = lArray.t("ownedDevices@odata.nextLink").k();
            }
            object3 = e8.b(lArray.t("ownedDevices").toString(), l[].class);
            object2 = new DirectoryObject[((l[])object3).length];
            for (n8 = 0; n8 < ((l[])object3).length; ++n8) {
                object = e8.b(object3[n8].toString(), DirectoryObject.class);
                object2[n8] = object;
                ((BaseDirectoryObject)object).d(e8, (l)object3[n8]);
            }
            ((BaseDirectoryObjectCollectionResponse)object4).a = Arrays.asList(object2);
            this.Z = new DirectoryObjectCollectionPage((BaseDirectoryObjectCollectionResponse)object4, null);
        }
        if (lArray.x("registeredDevices")) {
            object2 = new BaseDirectoryObjectCollectionResponse();
            if (lArray.x("registeredDevices@odata.nextLink")) {
                ((BaseDirectoryObjectCollectionResponse)object2).b = lArray.t("registeredDevices@odata.nextLink").k();
            }
            object3 = e8.b(lArray.t("registeredDevices").toString(), l[].class);
            object4 = new DirectoryObject[((l[])object3).length];
            for (n8 = 0; n8 < ((l[])object3).length; ++n8) {
                object4[n8] = object = e8.b(object3[n8].toString(), DirectoryObject.class);
                ((BaseDirectoryObject)object).d(e8, (l)object3[n8]);
            }
            ((BaseDirectoryObjectCollectionResponse)object2).a = Arrays.asList(object4);
            this.a0 = new DirectoryObjectCollectionPage((BaseDirectoryObjectCollectionResponse)object2, null);
        }
        if (lArray.x("directReports")) {
            object3 = new BaseDirectoryObjectCollectionResponse();
            if (lArray.x("directReports@odata.nextLink")) {
                ((BaseDirectoryObjectCollectionResponse)object3).b = lArray.t("directReports@odata.nextLink").k();
            }
            object4 = e8.b(lArray.t("directReports").toString(), l[].class);
            object = new DirectoryObject[((Object[])object4).length];
            for (n8 = 0; n8 < ((Object[])object4).length; ++n8) {
                object2 = e8.b(((i)object4[n8]).toString(), DirectoryObject.class);
                object[n8] = object2;
                ((BaseDirectoryObject)object2).d(e8, (l)object4[n8]);
            }
            ((BaseDirectoryObjectCollectionResponse)object3).a = Arrays.asList(object);
            this.c0 = new DirectoryObjectCollectionPage((BaseDirectoryObjectCollectionResponse)object3, null);
        }
        if (lArray.x("memberOf")) {
            object = new BaseDirectoryObjectCollectionResponse();
            if (lArray.x("memberOf@odata.nextLink")) {
                ((BaseDirectoryObjectCollectionResponse)object).b = lArray.t("memberOf@odata.nextLink").k();
            }
            object2 = e8.b(lArray.t("memberOf").toString(), l[].class);
            object3 = new DirectoryObject[((DirectoryObject[])object2).length];
            for (n8 = 0; n8 < ((DirectoryObject[])object2).length; ++n8) {
                object3[n8] = object4 = e8.b(((i)((Object)object2[n8])).toString(), DirectoryObject.class);
                ((BaseDirectoryObject)object4).d(e8, (l)((Object)object2[n8]));
            }
            ((BaseDirectoryObjectCollectionResponse)object).a = Arrays.asList(object3);
            this.d0 = new DirectoryObjectCollectionPage((BaseDirectoryObjectCollectionResponse)object, null);
        }
        if (lArray.x("createdObjects")) {
            object = new BaseDirectoryObjectCollectionResponse();
            if (lArray.x("createdObjects@odata.nextLink")) {
                ((BaseDirectoryObjectCollectionResponse)object).b = lArray.t("createdObjects@odata.nextLink").k();
            }
            object3 = e8.b(lArray.t("createdObjects").toString(), l[].class);
            object4 = new DirectoryObject[((Object[])object3).length];
            for (n8 = 0; n8 < ((Object[])object3).length; ++n8) {
                object4[n8] = object2 = e8.b(((i)object3[n8]).toString(), DirectoryObject.class);
                ((BaseDirectoryObject)object2).d(e8, (l)object3[n8]);
            }
            ((BaseDirectoryObjectCollectionResponse)object).a = Arrays.asList(object4);
            this.e0 = new DirectoryObjectCollectionPage((BaseDirectoryObjectCollectionResponse)object, null);
        }
        if (lArray.x("ownedObjects")) {
            object2 = new BaseDirectoryObjectCollectionResponse();
            if (lArray.x("ownedObjects@odata.nextLink")) {
                ((BaseDirectoryObjectCollectionResponse)object2).b = lArray.t("ownedObjects@odata.nextLink").k();
            }
            object4 = e8.b(lArray.t("ownedObjects").toString(), l[].class);
            object3 = new DirectoryObject[((Object[])object4).length];
            for (n8 = 0; n8 < ((Object[])object4).length; ++n8) {
                object3[n8] = object = e8.b(((i)object4[n8]).toString(), DirectoryObject.class);
                ((BaseDirectoryObject)object).d(e8, (l)object4[n8]);
            }
            ((BaseDirectoryObjectCollectionResponse)object2).a = Arrays.asList(object3);
            this.f0 = new DirectoryObjectCollectionPage((BaseDirectoryObjectCollectionResponse)object2, null);
        }
        if (lArray.x("licenseDetails")) {
            object = new BaseLicenseDetailsCollectionResponse();
            if (lArray.x("licenseDetails@odata.nextLink")) {
                ((BaseLicenseDetailsCollectionResponse)object).b = lArray.t("licenseDetails@odata.nextLink").k();
            }
            object3 = e8.b(lArray.t("licenseDetails").toString(), l[].class);
            object4 = new LicenseDetails[((Object[])object3).length];
            for (n8 = 0; n8 < ((Object[])object3).length; ++n8) {
                object4[n8] = object2 = e8.b(((i)object3[n8]).toString(), LicenseDetails.class);
                ((BaseLicenseDetails)object2).d(e8, (l)object3[n8]);
            }
            ((BaseLicenseDetailsCollectionResponse)object).a = Arrays.asList(object4);
            this.g0 = new LicenseDetailsCollectionPage((BaseLicenseDetailsCollectionResponse)object, null);
        }
        if (lArray.x("extensions")) {
            object = new BaseExtensionCollectionResponse();
            if (lArray.x("extensions@odata.nextLink")) {
                ((BaseExtensionCollectionResponse)object).b = lArray.t("extensions@odata.nextLink").k();
            }
            object3 = e8.b(lArray.t("extensions").toString(), l[].class);
            object2 = new Extension[((Object[])object3).length];
            for (n8 = 0; n8 < ((Object[])object3).length; ++n8) {
                object2[n8] = object4 = e8.b(((i)object3[n8]).toString(), Extension.class);
                ((BaseExtension)object4).d(e8, (l)object3[n8]);
            }
            ((BaseExtensionCollectionResponse)object).a = Arrays.asList(object2);
            this.h0 = new ExtensionCollectionPage((BaseExtensionCollectionResponse)object, null);
        }
        if (lArray.x("messages")) {
            object = new BaseMessageCollectionResponse();
            if (lArray.x("messages@odata.nextLink")) {
                ((BaseMessageCollectionResponse)object).b = lArray.t("messages@odata.nextLink").k();
            }
            object2 = e8.b(lArray.t("messages").toString(), l[].class);
            object4 = new Message[((DirectoryObject[])object2).length];
            for (n8 = 0; n8 < ((DirectoryObject[])object2).length; ++n8) {
                object3 = e8.b(((i)((Object)object2[n8])).toString(), Message.class);
                object4[n8] = object3;
                ((BaseMessage)object3).d(e8, (l)((Object)object2[n8]));
            }
            ((BaseMessageCollectionResponse)object).a = Arrays.asList(object4);
            this.j0 = new MessageCollectionPage((BaseMessageCollectionResponse)object, null);
        }
        if (lArray.x("mailFolders")) {
            object4 = new BaseMailFolderCollectionResponse();
            if (lArray.x("mailFolders@odata.nextLink")) {
                ((BaseMailFolderCollectionResponse)object4).b = lArray.t("mailFolders@odata.nextLink").k();
            }
            object = e8.b(lArray.t("mailFolders").toString(), l[].class);
            object2 = new MailFolder[((Object)object).length];
            for (n8 = 0; n8 < ((Object)object).length; ++n8) {
                object2[n8] = object3 = e8.b(((i)object[n8]).toString(), MailFolder.class);
                ((BaseMailFolder)object3).d(e8, (l)object[n8]);
            }
            ((BaseMailFolderCollectionResponse)object4).a = Arrays.asList(object2);
            this.k0 = new MailFolderCollectionPage((BaseMailFolderCollectionResponse)object4, null);
        }
        if (lArray.x("calendars")) {
            object2 = new BaseCalendarCollectionResponse();
            if (lArray.x("calendars@odata.nextLink")) {
                ((BaseCalendarCollectionResponse)object2).b = lArray.t("calendars@odata.nextLink").k();
            }
            object4 = e8.b(lArray.t("calendars").toString(), l[].class);
            object = new Calendar[((Object)object4).length];
            for (n8 = 0; n8 < ((Object)object4).length; ++n8) {
                object[n8] = object3 = e8.b(((i)object4[n8]).toString(), Calendar.class);
                ((BaseCalendar)object3).d(e8, (l)object4[n8]);
            }
            ((BaseCalendarCollectionResponse)object2).a = Arrays.asList(object);
            this.m0 = new CalendarCollectionPage((BaseCalendarCollectionResponse)object2, null);
        }
        if (lArray.x("calendarGroups")) {
            object2 = new BaseCalendarGroupCollectionResponse();
            if (lArray.x("calendarGroups@odata.nextLink")) {
                ((BaseCalendarGroupCollectionResponse)object2).b = lArray.t("calendarGroups@odata.nextLink").k();
            }
            object4 = e8.b(lArray.t("calendarGroups").toString(), l[].class);
            object3 = new CalendarGroup[((Object)object4).length];
            for (n8 = 0; n8 < ((Object)object4).length; ++n8) {
                object3[n8] = object = e8.b(((i)object4[n8]).toString(), CalendarGroup.class);
                ((BaseCalendarGroup)object).d(e8, (l)object4[n8]);
            }
            ((BaseCalendarGroupCollectionResponse)object2).a = Arrays.asList(object3);
            this.n0 = new CalendarGroupCollectionPage((BaseCalendarGroupCollectionResponse)object2, null);
        }
        if (lArray.x("calendarView")) {
            object3 = new BaseEventCollectionResponse();
            if (lArray.x("calendarView@odata.nextLink")) {
                ((BaseEventCollectionResponse)object3).b = lArray.t("calendarView@odata.nextLink").k();
            }
            object2 = e8.b(lArray.t("calendarView").toString(), l[].class);
            object4 = new Event[((DirectoryObject[])object2).length];
            for (n8 = 0; n8 < ((DirectoryObject[])object2).length; ++n8) {
                object4[n8] = object = e8.b(((i)((Object)object2[n8])).toString(), Event.class);
                ((BaseEvent)object).d(e8, (l)((Object)object2[n8]));
            }
            ((BaseEventCollectionResponse)object3).a = Arrays.asList(object4);
            this.o0 = new EventCollectionPage((BaseEventCollectionResponse)object3, null);
        }
        if (lArray.x("events")) {
            object = new BaseEventCollectionResponse();
            if (lArray.x("events@odata.nextLink")) {
                ((BaseEventCollectionResponse)object).b = lArray.t("events@odata.nextLink").k();
            }
            object4 = e8.b(lArray.t("events").toString(), l[].class);
            object3 = new Event[((Object)object4).length];
            for (n8 = 0; n8 < ((Object)object4).length; ++n8) {
                object2 = e8.b(((i)object4[n8]).toString(), Event.class);
                object3[n8] = object2;
                ((BaseEvent)object2).d(e8, (l)object4[n8]);
            }
            ((BaseEventCollectionResponse)object).a = Arrays.asList(object3);
            this.p0 = new EventCollectionPage((BaseEventCollectionResponse)object, null);
        }
        if (lArray.x("people")) {
            object3 = new BasePersonCollectionResponse();
            if (lArray.x("people@odata.nextLink")) {
                ((BasePersonCollectionResponse)object3).b = lArray.t("people@odata.nextLink").k();
            }
            object = e8.b(lArray.t("people").toString(), l[].class);
            object4 = new Person[((Object)object).length];
            for (n8 = 0; n8 < ((Object)object).length; ++n8) {
                object4[n8] = object2 = e8.b(((i)object[n8]).toString(), Person.class);
                ((BasePerson)object2).d(e8, (l)object[n8]);
            }
            ((BasePersonCollectionResponse)object3).a = Arrays.asList(object4);
            this.q0 = new PersonCollectionPage((BasePersonCollectionResponse)object3, null);
        }
        if (lArray.x("contacts")) {
            object3 = new BaseContactCollectionResponse();
            if (lArray.x("contacts@odata.nextLink")) {
                ((BaseContactCollectionResponse)object3).b = lArray.t("contacts@odata.nextLink").k();
            }
            object4 = e8.b(lArray.t("contacts").toString(), l[].class);
            object2 = new Contact[((Object)object4).length];
            for (n8 = 0; n8 < ((Object)object4).length; ++n8) {
                object2[n8] = object = e8.b(((i)object4[n8]).toString(), Contact.class);
                ((BaseContact)object).d(e8, (l)object4[n8]);
            }
            ((BaseContactCollectionResponse)object3).a = Arrays.asList(object2);
            this.r0 = new ContactCollectionPage((BaseContactCollectionResponse)object3, null);
        }
        if (lArray.x("contactFolders")) {
            object3 = new BaseContactFolderCollectionResponse();
            if (lArray.x("contactFolders@odata.nextLink")) {
                ((BaseContactFolderCollectionResponse)object3).b = lArray.t("contactFolders@odata.nextLink").k();
            }
            object4 = e8.b(lArray.t("contactFolders").toString(), l[].class);
            object = new ContactFolder[((Object)object4).length];
            for (n8 = 0; n8 < ((Object)object4).length; ++n8) {
                object[n8] = object2 = e8.b(((i)object4[n8]).toString(), ContactFolder.class);
                ((BaseContactFolder)object2).d(e8, (l)object4[n8]);
            }
            ((BaseContactFolderCollectionResponse)object3).a = Arrays.asList(object);
            this.s0 = new ContactFolderCollectionPage((BaseContactFolderCollectionResponse)object3, null);
        }
        if (lArray.x("photos")) {
            object4 = new BaseProfilePhotoCollectionResponse();
            if (lArray.x("photos@odata.nextLink")) {
                ((BaseProfilePhotoCollectionResponse)object4).b = lArray.t("photos@odata.nextLink").k();
            }
            object3 = e8.b(lArray.t("photos").toString(), l[].class);
            object = new ProfilePhoto[((Object)object3).length];
            for (n8 = 0; n8 < ((Object)object3).length; ++n8) {
                object[n8] = object2 = e8.b(((i)object3[n8]).toString(), ProfilePhoto.class);
                ((BaseProfilePhoto)object2).d(e8, (l)object3[n8]);
            }
            ((BaseProfilePhotoCollectionResponse)object4).a = Arrays.asList(object);
            this.v0 = new ProfilePhotoCollectionPage((BaseProfilePhotoCollectionResponse)object4, null);
        }
        if (lArray.x("drives")) {
            object = new BaseDriveCollectionResponse();
            if (lArray.x("drives@odata.nextLink")) {
                ((BaseDriveCollectionResponse)object).b = lArray.t("drives@odata.nextLink").k();
            }
            object4 = e8.b(lArray.t("drives").toString(), l[].class);
            object3 = new Drive[((Object)object4).length];
            for (n8 = 0; n8 < ((Object)object4).length; ++n8) {
                object3[n8] = object2 = e8.b(((i)object4[n8]).toString(), Drive.class);
                ((BaseDrive)object2).d(e8, (l)object4[n8]);
            }
            ((BaseDriveCollectionResponse)object).a = Arrays.asList(object3);
            this.x0 = new DriveCollectionPage((BaseDriveCollectionResponse)object, null);
        }
        if (lArray.x("activities")) {
            object4 = new BaseUserActivityCollectionResponse();
            if (lArray.x("activities@odata.nextLink")) {
                ((BaseUserActivityCollectionResponse)object4).b = lArray.t("activities@odata.nextLink").k();
            }
            lArray = e8.b(lArray.t("activities").toString(), l[].class);
            object = new UserActivity[lArray.length];
            for (n8 = n9; n8 < lArray.length; ++n8) {
                object[n8] = object3 = e8.b(lArray[n8].toString(), UserActivity.class);
                ((BaseUserActivity)object3).d(e8, lArray[n8]);
            }
            ((BaseUserActivityCollectionResponse)object4).a = Arrays.asList(object);
            this.A0 = new UserActivityCollectionPage((BaseUserActivityCollectionResponse)object4, null);
        }
    }
}

