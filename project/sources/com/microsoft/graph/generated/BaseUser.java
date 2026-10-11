package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
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
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/* loaded from: classes3.dex */
public class BaseUser extends DirectoryObject implements d {

    @InterfaceC3059a
    @InterfaceC3061c("onPremisesSyncEnabled")
    public Boolean A;
    public transient UserActivityCollectionPage A0;

    @InterfaceC3059a
    @InterfaceC3061c("passwordPolicies")
    public String B;
    private transient C3003l B0;

    @InterfaceC3059a
    @InterfaceC3061c("passwordProfile")
    public PasswordProfile C;
    private transient e C0;

    @InterfaceC3059a
    @InterfaceC3061c("officeLocation")
    public String D;

    @InterfaceC3059a
    @InterfaceC3061c("postalCode")
    public String E;

    @InterfaceC3059a
    @InterfaceC3061c("preferredLanguage")
    public String F;

    @InterfaceC3059a
    @InterfaceC3061c("provisionedPlans")
    public List<Object> G;

    @InterfaceC3059a
    @InterfaceC3061c("proxyAddresses")
    public List<String> H;

    @InterfaceC3059a
    @InterfaceC3061c("state")
    public String I;

    @InterfaceC3059a
    @InterfaceC3061c("streetAddress")
    public String J;

    @InterfaceC3059a
    @InterfaceC3061c("surname")
    public String K;

    @InterfaceC3059a
    @InterfaceC3061c("usageLocation")
    public String L;

    @InterfaceC3059a
    @InterfaceC3061c("userPrincipalName")
    public String M;

    @InterfaceC3059a
    @InterfaceC3061c("userType")
    public String N;

    @InterfaceC3059a
    @InterfaceC3061c("mailboxSettings")
    public MailboxSettings O;

    @InterfaceC3059a
    @InterfaceC3061c("aboutMe")
    public String P;

    @InterfaceC3059a
    @InterfaceC3061c("birthday")
    public Calendar Q;

    @InterfaceC3059a
    @InterfaceC3061c("hireDate")
    public Calendar R;

    @InterfaceC3059a
    @InterfaceC3061c("interests")
    public List<String> S;

    @InterfaceC3059a
    @InterfaceC3061c("mySite")
    public String T;

    @InterfaceC3059a
    @InterfaceC3061c("pastProjects")
    public List<String> U;

    @InterfaceC3059a
    @InterfaceC3061c("preferredName")
    public String V;

    @InterfaceC3059a
    @InterfaceC3061c("responsibilities")
    public List<String> W;

    @InterfaceC3059a
    @InterfaceC3061c("schools")
    public List<String> X;

    @InterfaceC3059a
    @InterfaceC3061c("skills")
    public List<String> Y;
    public transient DirectoryObjectCollectionPage Z;
    public transient DirectoryObjectCollectionPage a0;

    @InterfaceC3059a
    @InterfaceC3061c("manager")
    public DirectoryObject b0;
    public transient DirectoryObjectCollectionPage c0;
    public transient DirectoryObjectCollectionPage d0;
    public transient DirectoryObjectCollectionPage e0;
    public transient DirectoryObjectCollectionPage f0;
    public transient LicenseDetailsCollectionPage g0;
    public transient ExtensionCollectionPage h0;

    @InterfaceC3059a
    @InterfaceC3061c("accountEnabled")
    public Boolean i;

    @InterfaceC3059a
    @InterfaceC3061c("outlook")
    public OutlookUser i0;

    @InterfaceC3059a
    @InterfaceC3061c("assignedLicenses")
    public List<Object> j;
    public transient MessageCollectionPage j0;

    @InterfaceC3059a
    @InterfaceC3061c("assignedPlans")
    public List<Object> k;
    public transient MailFolderCollectionPage k0;

    @InterfaceC3059a
    @InterfaceC3061c("businessPhones")
    public List<String> l;

    @InterfaceC3059a
    @InterfaceC3061c("calendar")
    public com.microsoft.graph.extensions.Calendar l0;

    @InterfaceC3059a
    @InterfaceC3061c("city")
    public String m;
    public transient CalendarCollectionPage m0;

    @InterfaceC3059a
    @InterfaceC3061c("companyName")
    public String n;
    public transient CalendarGroupCollectionPage n0;

    @InterfaceC3059a
    @InterfaceC3061c("country")
    public String o;
    public transient EventCollectionPage o0;

    @InterfaceC3059a
    @InterfaceC3061c("department")
    public String p;
    public transient EventCollectionPage p0;

    @InterfaceC3059a
    @InterfaceC3061c("displayName")
    public String q;
    public transient PersonCollectionPage q0;

    @InterfaceC3059a
    @InterfaceC3061c("givenName")
    public String r;
    public transient ContactCollectionPage r0;

    @InterfaceC3059a
    @InterfaceC3061c("imAddresses")
    public List<String> s;
    public transient ContactFolderCollectionPage s0;

    @InterfaceC3059a
    @InterfaceC3061c("jobTitle")
    public String t;

    @InterfaceC3059a
    @InterfaceC3061c("inferenceClassification")
    public InferenceClassification t0;

    @InterfaceC3059a
    @InterfaceC3061c("mail")
    public String u;

    @InterfaceC3059a
    @InterfaceC3061c("photo")
    public ProfilePhoto u0;

    @InterfaceC3059a
    @InterfaceC3061c("mailNickname")
    public String v;
    public transient ProfilePhotoCollectionPage v0;

    @InterfaceC3059a
    @InterfaceC3061c("mobilePhone")
    public String w;

    @InterfaceC3059a
    @InterfaceC3061c("drive")
    public Drive w0;

    @InterfaceC3059a
    @InterfaceC3061c("onPremisesImmutableId")
    public String x;
    public transient DriveCollectionPage x0;

    @InterfaceC3059a
    @InterfaceC3061c("onPremisesLastSyncDateTime")
    public Calendar y;

    @InterfaceC3059a
    @InterfaceC3061c("planner")
    public PlannerUser y0;

    @InterfaceC3059a
    @InterfaceC3061c("onPremisesSecurityIdentifier")
    public String z;

    @InterfaceC3059a
    @InterfaceC3061c("onenote")
    public Onenote z0;

    @Override // com.microsoft.graph.generated.BaseDirectoryObject, com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.C0 = eVar;
        this.B0 = c3003l;
        if (c3003l.x("ownedDevices")) {
            BaseDirectoryObjectCollectionResponse baseDirectoryObjectCollectionResponse = new BaseDirectoryObjectCollectionResponse();
            if (c3003l.x("ownedDevices@odata.nextLink")) {
                baseDirectoryObjectCollectionResponse.b = c3003l.t("ownedDevices@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("ownedDevices").toString(), C3003l[].class);
            DirectoryObject[] directoryObjectArr = new DirectoryObject[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                DirectoryObject directoryObject = (DirectoryObject) eVar.b(c3003lArr[i].toString(), DirectoryObject.class);
                directoryObjectArr[i] = directoryObject;
                directoryObject.d(eVar, c3003lArr[i]);
            }
            baseDirectoryObjectCollectionResponse.a = Arrays.asList(directoryObjectArr);
            this.Z = new DirectoryObjectCollectionPage(baseDirectoryObjectCollectionResponse, null);
        }
        if (c3003l.x("registeredDevices")) {
            BaseDirectoryObjectCollectionResponse baseDirectoryObjectCollectionResponse2 = new BaseDirectoryObjectCollectionResponse();
            if (c3003l.x("registeredDevices@odata.nextLink")) {
                baseDirectoryObjectCollectionResponse2.b = c3003l.t("registeredDevices@odata.nextLink").k();
            }
            C3003l[] c3003lArr2 = (C3003l[]) eVar.b(c3003l.t("registeredDevices").toString(), C3003l[].class);
            DirectoryObject[] directoryObjectArr2 = new DirectoryObject[c3003lArr2.length];
            for (int i2 = 0; i2 < c3003lArr2.length; i2++) {
                DirectoryObject directoryObject2 = (DirectoryObject) eVar.b(c3003lArr2[i2].toString(), DirectoryObject.class);
                directoryObjectArr2[i2] = directoryObject2;
                directoryObject2.d(eVar, c3003lArr2[i2]);
            }
            baseDirectoryObjectCollectionResponse2.a = Arrays.asList(directoryObjectArr2);
            this.a0 = new DirectoryObjectCollectionPage(baseDirectoryObjectCollectionResponse2, null);
        }
        if (c3003l.x("directReports")) {
            BaseDirectoryObjectCollectionResponse baseDirectoryObjectCollectionResponse3 = new BaseDirectoryObjectCollectionResponse();
            if (c3003l.x("directReports@odata.nextLink")) {
                baseDirectoryObjectCollectionResponse3.b = c3003l.t("directReports@odata.nextLink").k();
            }
            C3003l[] c3003lArr3 = (C3003l[]) eVar.b(c3003l.t("directReports").toString(), C3003l[].class);
            DirectoryObject[] directoryObjectArr3 = new DirectoryObject[c3003lArr3.length];
            for (int i3 = 0; i3 < c3003lArr3.length; i3++) {
                DirectoryObject directoryObject3 = (DirectoryObject) eVar.b(c3003lArr3[i3].toString(), DirectoryObject.class);
                directoryObjectArr3[i3] = directoryObject3;
                directoryObject3.d(eVar, c3003lArr3[i3]);
            }
            baseDirectoryObjectCollectionResponse3.a = Arrays.asList(directoryObjectArr3);
            this.c0 = new DirectoryObjectCollectionPage(baseDirectoryObjectCollectionResponse3, null);
        }
        if (c3003l.x("memberOf")) {
            BaseDirectoryObjectCollectionResponse baseDirectoryObjectCollectionResponse4 = new BaseDirectoryObjectCollectionResponse();
            if (c3003l.x("memberOf@odata.nextLink")) {
                baseDirectoryObjectCollectionResponse4.b = c3003l.t("memberOf@odata.nextLink").k();
            }
            C3003l[] c3003lArr4 = (C3003l[]) eVar.b(c3003l.t("memberOf").toString(), C3003l[].class);
            DirectoryObject[] directoryObjectArr4 = new DirectoryObject[c3003lArr4.length];
            for (int i4 = 0; i4 < c3003lArr4.length; i4++) {
                DirectoryObject directoryObject4 = (DirectoryObject) eVar.b(c3003lArr4[i4].toString(), DirectoryObject.class);
                directoryObjectArr4[i4] = directoryObject4;
                directoryObject4.d(eVar, c3003lArr4[i4]);
            }
            baseDirectoryObjectCollectionResponse4.a = Arrays.asList(directoryObjectArr4);
            this.d0 = new DirectoryObjectCollectionPage(baseDirectoryObjectCollectionResponse4, null);
        }
        if (c3003l.x("createdObjects")) {
            BaseDirectoryObjectCollectionResponse baseDirectoryObjectCollectionResponse5 = new BaseDirectoryObjectCollectionResponse();
            if (c3003l.x("createdObjects@odata.nextLink")) {
                baseDirectoryObjectCollectionResponse5.b = c3003l.t("createdObjects@odata.nextLink").k();
            }
            C3003l[] c3003lArr5 = (C3003l[]) eVar.b(c3003l.t("createdObjects").toString(), C3003l[].class);
            DirectoryObject[] directoryObjectArr5 = new DirectoryObject[c3003lArr5.length];
            for (int i5 = 0; i5 < c3003lArr5.length; i5++) {
                DirectoryObject directoryObject5 = (DirectoryObject) eVar.b(c3003lArr5[i5].toString(), DirectoryObject.class);
                directoryObjectArr5[i5] = directoryObject5;
                directoryObject5.d(eVar, c3003lArr5[i5]);
            }
            baseDirectoryObjectCollectionResponse5.a = Arrays.asList(directoryObjectArr5);
            this.e0 = new DirectoryObjectCollectionPage(baseDirectoryObjectCollectionResponse5, null);
        }
        if (c3003l.x("ownedObjects")) {
            BaseDirectoryObjectCollectionResponse baseDirectoryObjectCollectionResponse6 = new BaseDirectoryObjectCollectionResponse();
            if (c3003l.x("ownedObjects@odata.nextLink")) {
                baseDirectoryObjectCollectionResponse6.b = c3003l.t("ownedObjects@odata.nextLink").k();
            }
            C3003l[] c3003lArr6 = (C3003l[]) eVar.b(c3003l.t("ownedObjects").toString(), C3003l[].class);
            DirectoryObject[] directoryObjectArr6 = new DirectoryObject[c3003lArr6.length];
            for (int i6 = 0; i6 < c3003lArr6.length; i6++) {
                DirectoryObject directoryObject6 = (DirectoryObject) eVar.b(c3003lArr6[i6].toString(), DirectoryObject.class);
                directoryObjectArr6[i6] = directoryObject6;
                directoryObject6.d(eVar, c3003lArr6[i6]);
            }
            baseDirectoryObjectCollectionResponse6.a = Arrays.asList(directoryObjectArr6);
            this.f0 = new DirectoryObjectCollectionPage(baseDirectoryObjectCollectionResponse6, null);
        }
        if (c3003l.x("licenseDetails")) {
            BaseLicenseDetailsCollectionResponse baseLicenseDetailsCollectionResponse = new BaseLicenseDetailsCollectionResponse();
            if (c3003l.x("licenseDetails@odata.nextLink")) {
                baseLicenseDetailsCollectionResponse.b = c3003l.t("licenseDetails@odata.nextLink").k();
            }
            C3003l[] c3003lArr7 = (C3003l[]) eVar.b(c3003l.t("licenseDetails").toString(), C3003l[].class);
            LicenseDetails[] licenseDetailsArr = new LicenseDetails[c3003lArr7.length];
            for (int i7 = 0; i7 < c3003lArr7.length; i7++) {
                LicenseDetails licenseDetails = (LicenseDetails) eVar.b(c3003lArr7[i7].toString(), LicenseDetails.class);
                licenseDetailsArr[i7] = licenseDetails;
                licenseDetails.d(eVar, c3003lArr7[i7]);
            }
            baseLicenseDetailsCollectionResponse.a = Arrays.asList(licenseDetailsArr);
            this.g0 = new LicenseDetailsCollectionPage(baseLicenseDetailsCollectionResponse, null);
        }
        if (c3003l.x("extensions")) {
            BaseExtensionCollectionResponse baseExtensionCollectionResponse = new BaseExtensionCollectionResponse();
            if (c3003l.x("extensions@odata.nextLink")) {
                baseExtensionCollectionResponse.b = c3003l.t("extensions@odata.nextLink").k();
            }
            C3003l[] c3003lArr8 = (C3003l[]) eVar.b(c3003l.t("extensions").toString(), C3003l[].class);
            Extension[] extensionArr = new Extension[c3003lArr8.length];
            for (int i8 = 0; i8 < c3003lArr8.length; i8++) {
                Extension extension = (Extension) eVar.b(c3003lArr8[i8].toString(), Extension.class);
                extensionArr[i8] = extension;
                extension.d(eVar, c3003lArr8[i8]);
            }
            baseExtensionCollectionResponse.a = Arrays.asList(extensionArr);
            this.h0 = new ExtensionCollectionPage(baseExtensionCollectionResponse, null);
        }
        if (c3003l.x("messages")) {
            BaseMessageCollectionResponse baseMessageCollectionResponse = new BaseMessageCollectionResponse();
            if (c3003l.x("messages@odata.nextLink")) {
                baseMessageCollectionResponse.b = c3003l.t("messages@odata.nextLink").k();
            }
            C3003l[] c3003lArr9 = (C3003l[]) eVar.b(c3003l.t("messages").toString(), C3003l[].class);
            Message[] messageArr = new Message[c3003lArr9.length];
            for (int i9 = 0; i9 < c3003lArr9.length; i9++) {
                Message message = (Message) eVar.b(c3003lArr9[i9].toString(), Message.class);
                messageArr[i9] = message;
                message.d(eVar, c3003lArr9[i9]);
            }
            baseMessageCollectionResponse.a = Arrays.asList(messageArr);
            this.j0 = new MessageCollectionPage(baseMessageCollectionResponse, null);
        }
        if (c3003l.x("mailFolders")) {
            BaseMailFolderCollectionResponse baseMailFolderCollectionResponse = new BaseMailFolderCollectionResponse();
            if (c3003l.x("mailFolders@odata.nextLink")) {
                baseMailFolderCollectionResponse.b = c3003l.t("mailFolders@odata.nextLink").k();
            }
            C3003l[] c3003lArr10 = (C3003l[]) eVar.b(c3003l.t("mailFolders").toString(), C3003l[].class);
            MailFolder[] mailFolderArr = new MailFolder[c3003lArr10.length];
            for (int i10 = 0; i10 < c3003lArr10.length; i10++) {
                MailFolder mailFolder = (MailFolder) eVar.b(c3003lArr10[i10].toString(), MailFolder.class);
                mailFolderArr[i10] = mailFolder;
                mailFolder.d(eVar, c3003lArr10[i10]);
            }
            baseMailFolderCollectionResponse.a = Arrays.asList(mailFolderArr);
            this.k0 = new MailFolderCollectionPage(baseMailFolderCollectionResponse, null);
        }
        if (c3003l.x("calendars")) {
            BaseCalendarCollectionResponse baseCalendarCollectionResponse = new BaseCalendarCollectionResponse();
            if (c3003l.x("calendars@odata.nextLink")) {
                baseCalendarCollectionResponse.b = c3003l.t("calendars@odata.nextLink").k();
            }
            C3003l[] c3003lArr11 = (C3003l[]) eVar.b(c3003l.t("calendars").toString(), C3003l[].class);
            com.microsoft.graph.extensions.Calendar[] calendarArr = new com.microsoft.graph.extensions.Calendar[c3003lArr11.length];
            for (int i11 = 0; i11 < c3003lArr11.length; i11++) {
                com.microsoft.graph.extensions.Calendar calendar = (com.microsoft.graph.extensions.Calendar) eVar.b(c3003lArr11[i11].toString(), com.microsoft.graph.extensions.Calendar.class);
                calendarArr[i11] = calendar;
                calendar.d(eVar, c3003lArr11[i11]);
            }
            baseCalendarCollectionResponse.a = Arrays.asList(calendarArr);
            this.m0 = new CalendarCollectionPage(baseCalendarCollectionResponse, null);
        }
        if (c3003l.x("calendarGroups")) {
            BaseCalendarGroupCollectionResponse baseCalendarGroupCollectionResponse = new BaseCalendarGroupCollectionResponse();
            if (c3003l.x("calendarGroups@odata.nextLink")) {
                baseCalendarGroupCollectionResponse.b = c3003l.t("calendarGroups@odata.nextLink").k();
            }
            C3003l[] c3003lArr12 = (C3003l[]) eVar.b(c3003l.t("calendarGroups").toString(), C3003l[].class);
            CalendarGroup[] calendarGroupArr = new CalendarGroup[c3003lArr12.length];
            for (int i12 = 0; i12 < c3003lArr12.length; i12++) {
                CalendarGroup calendarGroup = (CalendarGroup) eVar.b(c3003lArr12[i12].toString(), CalendarGroup.class);
                calendarGroupArr[i12] = calendarGroup;
                calendarGroup.d(eVar, c3003lArr12[i12]);
            }
            baseCalendarGroupCollectionResponse.a = Arrays.asList(calendarGroupArr);
            this.n0 = new CalendarGroupCollectionPage(baseCalendarGroupCollectionResponse, null);
        }
        if (c3003l.x("calendarView")) {
            BaseEventCollectionResponse baseEventCollectionResponse = new BaseEventCollectionResponse();
            if (c3003l.x("calendarView@odata.nextLink")) {
                baseEventCollectionResponse.b = c3003l.t("calendarView@odata.nextLink").k();
            }
            C3003l[] c3003lArr13 = (C3003l[]) eVar.b(c3003l.t("calendarView").toString(), C3003l[].class);
            Event[] eventArr = new Event[c3003lArr13.length];
            for (int i13 = 0; i13 < c3003lArr13.length; i13++) {
                Event event = (Event) eVar.b(c3003lArr13[i13].toString(), Event.class);
                eventArr[i13] = event;
                event.d(eVar, c3003lArr13[i13]);
            }
            baseEventCollectionResponse.a = Arrays.asList(eventArr);
            this.o0 = new EventCollectionPage(baseEventCollectionResponse, null);
        }
        if (c3003l.x("events")) {
            BaseEventCollectionResponse baseEventCollectionResponse2 = new BaseEventCollectionResponse();
            if (c3003l.x("events@odata.nextLink")) {
                baseEventCollectionResponse2.b = c3003l.t("events@odata.nextLink").k();
            }
            C3003l[] c3003lArr14 = (C3003l[]) eVar.b(c3003l.t("events").toString(), C3003l[].class);
            Event[] eventArr2 = new Event[c3003lArr14.length];
            for (int i14 = 0; i14 < c3003lArr14.length; i14++) {
                Event event2 = (Event) eVar.b(c3003lArr14[i14].toString(), Event.class);
                eventArr2[i14] = event2;
                event2.d(eVar, c3003lArr14[i14]);
            }
            baseEventCollectionResponse2.a = Arrays.asList(eventArr2);
            this.p0 = new EventCollectionPage(baseEventCollectionResponse2, null);
        }
        if (c3003l.x("people")) {
            BasePersonCollectionResponse basePersonCollectionResponse = new BasePersonCollectionResponse();
            if (c3003l.x("people@odata.nextLink")) {
                basePersonCollectionResponse.b = c3003l.t("people@odata.nextLink").k();
            }
            C3003l[] c3003lArr15 = (C3003l[]) eVar.b(c3003l.t("people").toString(), C3003l[].class);
            Person[] personArr = new Person[c3003lArr15.length];
            for (int i15 = 0; i15 < c3003lArr15.length; i15++) {
                Person person = (Person) eVar.b(c3003lArr15[i15].toString(), Person.class);
                personArr[i15] = person;
                person.d(eVar, c3003lArr15[i15]);
            }
            basePersonCollectionResponse.a = Arrays.asList(personArr);
            this.q0 = new PersonCollectionPage(basePersonCollectionResponse, null);
        }
        if (c3003l.x("contacts")) {
            BaseContactCollectionResponse baseContactCollectionResponse = new BaseContactCollectionResponse();
            if (c3003l.x("contacts@odata.nextLink")) {
                baseContactCollectionResponse.b = c3003l.t("contacts@odata.nextLink").k();
            }
            C3003l[] c3003lArr16 = (C3003l[]) eVar.b(c3003l.t("contacts").toString(), C3003l[].class);
            Contact[] contactArr = new Contact[c3003lArr16.length];
            for (int i16 = 0; i16 < c3003lArr16.length; i16++) {
                Contact contact = (Contact) eVar.b(c3003lArr16[i16].toString(), Contact.class);
                contactArr[i16] = contact;
                contact.d(eVar, c3003lArr16[i16]);
            }
            baseContactCollectionResponse.a = Arrays.asList(contactArr);
            this.r0 = new ContactCollectionPage(baseContactCollectionResponse, null);
        }
        if (c3003l.x("contactFolders")) {
            BaseContactFolderCollectionResponse baseContactFolderCollectionResponse = new BaseContactFolderCollectionResponse();
            if (c3003l.x("contactFolders@odata.nextLink")) {
                baseContactFolderCollectionResponse.b = c3003l.t("contactFolders@odata.nextLink").k();
            }
            C3003l[] c3003lArr17 = (C3003l[]) eVar.b(c3003l.t("contactFolders").toString(), C3003l[].class);
            ContactFolder[] contactFolderArr = new ContactFolder[c3003lArr17.length];
            for (int i17 = 0; i17 < c3003lArr17.length; i17++) {
                ContactFolder contactFolder = (ContactFolder) eVar.b(c3003lArr17[i17].toString(), ContactFolder.class);
                contactFolderArr[i17] = contactFolder;
                contactFolder.d(eVar, c3003lArr17[i17]);
            }
            baseContactFolderCollectionResponse.a = Arrays.asList(contactFolderArr);
            this.s0 = new ContactFolderCollectionPage(baseContactFolderCollectionResponse, null);
        }
        if (c3003l.x("photos")) {
            BaseProfilePhotoCollectionResponse baseProfilePhotoCollectionResponse = new BaseProfilePhotoCollectionResponse();
            if (c3003l.x("photos@odata.nextLink")) {
                baseProfilePhotoCollectionResponse.b = c3003l.t("photos@odata.nextLink").k();
            }
            C3003l[] c3003lArr18 = (C3003l[]) eVar.b(c3003l.t("photos").toString(), C3003l[].class);
            ProfilePhoto[] profilePhotoArr = new ProfilePhoto[c3003lArr18.length];
            for (int i18 = 0; i18 < c3003lArr18.length; i18++) {
                ProfilePhoto profilePhoto = (ProfilePhoto) eVar.b(c3003lArr18[i18].toString(), ProfilePhoto.class);
                profilePhotoArr[i18] = profilePhoto;
                profilePhoto.d(eVar, c3003lArr18[i18]);
            }
            baseProfilePhotoCollectionResponse.a = Arrays.asList(profilePhotoArr);
            this.v0 = new ProfilePhotoCollectionPage(baseProfilePhotoCollectionResponse, null);
        }
        if (c3003l.x("drives")) {
            BaseDriveCollectionResponse baseDriveCollectionResponse = new BaseDriveCollectionResponse();
            if (c3003l.x("drives@odata.nextLink")) {
                baseDriveCollectionResponse.b = c3003l.t("drives@odata.nextLink").k();
            }
            C3003l[] c3003lArr19 = (C3003l[]) eVar.b(c3003l.t("drives").toString(), C3003l[].class);
            Drive[] driveArr = new Drive[c3003lArr19.length];
            for (int i19 = 0; i19 < c3003lArr19.length; i19++) {
                Drive drive = (Drive) eVar.b(c3003lArr19[i19].toString(), Drive.class);
                driveArr[i19] = drive;
                drive.d(eVar, c3003lArr19[i19]);
            }
            baseDriveCollectionResponse.a = Arrays.asList(driveArr);
            this.x0 = new DriveCollectionPage(baseDriveCollectionResponse, null);
        }
        if (c3003l.x("activities")) {
            BaseUserActivityCollectionResponse baseUserActivityCollectionResponse = new BaseUserActivityCollectionResponse();
            if (c3003l.x("activities@odata.nextLink")) {
                baseUserActivityCollectionResponse.b = c3003l.t("activities@odata.nextLink").k();
            }
            C3003l[] c3003lArr20 = (C3003l[]) eVar.b(c3003l.t("activities").toString(), C3003l[].class);
            UserActivity[] userActivityArr = new UserActivity[c3003lArr20.length];
            for (int i20 = 0; i20 < c3003lArr20.length; i20++) {
                UserActivity userActivity = (UserActivity) eVar.b(c3003lArr20[i20].toString(), UserActivity.class);
                userActivityArr[i20] = userActivity;
                userActivity.d(eVar, c3003lArr20[i20]);
            }
            baseUserActivityCollectionResponse.a = Arrays.asList(userActivityArr);
            this.A0 = new UserActivityCollectionPage(baseUserActivityCollectionResponse, null);
        }
    }
}
