package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Contact;
import com.microsoft.graph.extensions.ContactCollectionPage;
import com.microsoft.graph.extensions.ContactFolder;
import com.microsoft.graph.extensions.ContactFolderCollectionPage;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.MultiValueLegacyExtendedProperty;
import com.microsoft.graph.extensions.MultiValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.extensions.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.extensions.SingleValueLegacyExtendedPropertyCollectionPage;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class BaseContactFolder extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("parentFolderId")
    public String f;

    @InterfaceC3059a
    @InterfaceC3061c("displayName")
    public String g;
    public transient ContactCollectionPage h;
    public transient ContactFolderCollectionPage i;
    public transient SingleValueLegacyExtendedPropertyCollectionPage j;
    public transient MultiValueLegacyExtendedPropertyCollectionPage k;
    private transient C3003l l;
    private transient e m;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.m = eVar;
        this.l = c3003l;
        if (c3003l.x("contacts")) {
            BaseContactCollectionResponse baseContactCollectionResponse = new BaseContactCollectionResponse();
            if (c3003l.x("contacts@odata.nextLink")) {
                baseContactCollectionResponse.b = c3003l.t("contacts@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("contacts").toString(), C3003l[].class);
            Contact[] contactArr = new Contact[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                Contact contact = (Contact) eVar.b(c3003lArr[i].toString(), Contact.class);
                contactArr[i] = contact;
                contact.d(eVar, c3003lArr[i]);
            }
            baseContactCollectionResponse.a = Arrays.asList(contactArr);
            this.h = new ContactCollectionPage(baseContactCollectionResponse, null);
        }
        if (c3003l.x("childFolders")) {
            BaseContactFolderCollectionResponse baseContactFolderCollectionResponse = new BaseContactFolderCollectionResponse();
            if (c3003l.x("childFolders@odata.nextLink")) {
                baseContactFolderCollectionResponse.b = c3003l.t("childFolders@odata.nextLink").k();
            }
            C3003l[] c3003lArr2 = (C3003l[]) eVar.b(c3003l.t("childFolders").toString(), C3003l[].class);
            ContactFolder[] contactFolderArr = new ContactFolder[c3003lArr2.length];
            for (int i2 = 0; i2 < c3003lArr2.length; i2++) {
                ContactFolder contactFolder = (ContactFolder) eVar.b(c3003lArr2[i2].toString(), ContactFolder.class);
                contactFolderArr[i2] = contactFolder;
                contactFolder.d(eVar, c3003lArr2[i2]);
            }
            baseContactFolderCollectionResponse.a = Arrays.asList(contactFolderArr);
            this.i = new ContactFolderCollectionPage(baseContactFolderCollectionResponse, null);
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
            this.j = new SingleValueLegacyExtendedPropertyCollectionPage(baseSingleValueLegacyExtendedPropertyCollectionResponse, null);
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
            this.k = new MultiValueLegacyExtendedPropertyCollectionPage(baseMultiValueLegacyExtendedPropertyCollectionResponse, null);
        }
    }
}
