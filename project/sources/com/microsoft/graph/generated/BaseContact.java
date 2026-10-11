package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.EmailAddress;
import com.microsoft.graph.extensions.Extension;
import com.microsoft.graph.extensions.ExtensionCollectionPage;
import com.microsoft.graph.extensions.MultiValueLegacyExtendedProperty;
import com.microsoft.graph.extensions.MultiValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.extensions.OutlookItem;
import com.microsoft.graph.extensions.PhysicalAddress;
import com.microsoft.graph.extensions.ProfilePhoto;
import com.microsoft.graph.extensions.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.extensions.SingleValueLegacyExtendedPropertyCollectionPage;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/* loaded from: classes3.dex */
public class BaseContact extends OutlookItem implements d {

    @InterfaceC3059a
    @InterfaceC3061c("imAddresses")
    public List<String> A;

    @InterfaceC3059a
    @InterfaceC3061c("jobTitle")
    public String B;

    @InterfaceC3059a
    @InterfaceC3061c("companyName")
    public String C;

    @InterfaceC3059a
    @InterfaceC3061c("department")
    public String D;

    @InterfaceC3059a
    @InterfaceC3061c("officeLocation")
    public String E;

    @InterfaceC3059a
    @InterfaceC3061c("profession")
    public String F;

    @InterfaceC3059a
    @InterfaceC3061c("businessHomePage")
    public String G;

    @InterfaceC3059a
    @InterfaceC3061c("assistantName")
    public String H;

    @InterfaceC3059a
    @InterfaceC3061c("manager")
    public String I;

    @InterfaceC3059a
    @InterfaceC3061c("homePhones")
    public List<String> J;

    @InterfaceC3059a
    @InterfaceC3061c("mobilePhone")
    public String K;

    @InterfaceC3059a
    @InterfaceC3061c("businessPhones")
    public List<String> L;

    @InterfaceC3059a
    @InterfaceC3061c("homeAddress")
    public PhysicalAddress M;

    @InterfaceC3059a
    @InterfaceC3061c("businessAddress")
    public PhysicalAddress N;

    @InterfaceC3059a
    @InterfaceC3061c("otherAddress")
    public PhysicalAddress O;

    @InterfaceC3059a
    @InterfaceC3061c("spouseName")
    public String P;

    @InterfaceC3059a
    @InterfaceC3061c("personalNotes")
    public String Q;

    @InterfaceC3059a
    @InterfaceC3061c("children")
    public List<String> R;
    public transient ExtensionCollectionPage S;
    public transient SingleValueLegacyExtendedPropertyCollectionPage T;
    public transient MultiValueLegacyExtendedPropertyCollectionPage U;

    @InterfaceC3059a
    @InterfaceC3061c("photo")
    public ProfilePhoto V;
    private transient C3003l W;
    private transient e X;

    @InterfaceC3059a
    @InterfaceC3061c("parentFolderId")
    public String l;

    @InterfaceC3059a
    @InterfaceC3061c("birthday")
    public Calendar m;

    @InterfaceC3059a
    @InterfaceC3061c("fileAs")
    public String n;

    @InterfaceC3059a
    @InterfaceC3061c("displayName")
    public String o;

    @InterfaceC3059a
    @InterfaceC3061c("givenName")
    public String p;

    @InterfaceC3059a
    @InterfaceC3061c("initials")
    public String q;

    @InterfaceC3059a
    @InterfaceC3061c("middleName")
    public String r;

    @InterfaceC3059a
    @InterfaceC3061c("nickName")
    public String s;

    @InterfaceC3059a
    @InterfaceC3061c("surname")
    public String t;

    @InterfaceC3059a
    @InterfaceC3061c("title")
    public String u;

    @InterfaceC3059a
    @InterfaceC3061c("yomiGivenName")
    public String v;

    @InterfaceC3059a
    @InterfaceC3061c("yomiSurname")
    public String w;

    @InterfaceC3059a
    @InterfaceC3061c("yomiCompanyName")
    public String x;

    @InterfaceC3059a
    @InterfaceC3061c("generation")
    public String y;

    @InterfaceC3059a
    @InterfaceC3061c("emailAddresses")
    public List<EmailAddress> z;

    @Override // com.microsoft.graph.generated.BaseOutlookItem, com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.X = eVar;
        this.W = c3003l;
        if (c3003l.x("extensions")) {
            BaseExtensionCollectionResponse baseExtensionCollectionResponse = new BaseExtensionCollectionResponse();
            if (c3003l.x("extensions@odata.nextLink")) {
                baseExtensionCollectionResponse.b = c3003l.t("extensions@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("extensions").toString(), C3003l[].class);
            Extension[] extensionArr = new Extension[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                Extension extension = (Extension) eVar.b(c3003lArr[i].toString(), Extension.class);
                extensionArr[i] = extension;
                extension.d(eVar, c3003lArr[i]);
            }
            baseExtensionCollectionResponse.a = Arrays.asList(extensionArr);
            this.S = new ExtensionCollectionPage(baseExtensionCollectionResponse, null);
        }
        if (c3003l.x("singleValueExtendedProperties")) {
            BaseSingleValueLegacyExtendedPropertyCollectionResponse baseSingleValueLegacyExtendedPropertyCollectionResponse = new BaseSingleValueLegacyExtendedPropertyCollectionResponse();
            if (c3003l.x("singleValueExtendedProperties@odata.nextLink")) {
                baseSingleValueLegacyExtendedPropertyCollectionResponse.b = c3003l.t("singleValueExtendedProperties@odata.nextLink").k();
            }
            C3003l[] c3003lArr2 = (C3003l[]) eVar.b(c3003l.t("singleValueExtendedProperties").toString(), C3003l[].class);
            SingleValueLegacyExtendedProperty[] singleValueLegacyExtendedPropertyArr = new SingleValueLegacyExtendedProperty[c3003lArr2.length];
            for (int i2 = 0; i2 < c3003lArr2.length; i2++) {
                SingleValueLegacyExtendedProperty singleValueLegacyExtendedProperty = (SingleValueLegacyExtendedProperty) eVar.b(c3003lArr2[i2].toString(), SingleValueLegacyExtendedProperty.class);
                singleValueLegacyExtendedPropertyArr[i2] = singleValueLegacyExtendedProperty;
                singleValueLegacyExtendedProperty.d(eVar, c3003lArr2[i2]);
            }
            baseSingleValueLegacyExtendedPropertyCollectionResponse.a = Arrays.asList(singleValueLegacyExtendedPropertyArr);
            this.T = new SingleValueLegacyExtendedPropertyCollectionPage(baseSingleValueLegacyExtendedPropertyCollectionResponse, null);
        }
        if (c3003l.x("multiValueExtendedProperties")) {
            BaseMultiValueLegacyExtendedPropertyCollectionResponse baseMultiValueLegacyExtendedPropertyCollectionResponse = new BaseMultiValueLegacyExtendedPropertyCollectionResponse();
            if (c3003l.x("multiValueExtendedProperties@odata.nextLink")) {
                baseMultiValueLegacyExtendedPropertyCollectionResponse.b = c3003l.t("multiValueExtendedProperties@odata.nextLink").k();
            }
            C3003l[] c3003lArr3 = (C3003l[]) eVar.b(c3003l.t("multiValueExtendedProperties").toString(), C3003l[].class);
            MultiValueLegacyExtendedProperty[] multiValueLegacyExtendedPropertyArr = new MultiValueLegacyExtendedProperty[c3003lArr3.length];
            for (int i3 = 0; i3 < c3003lArr3.length; i3++) {
                MultiValueLegacyExtendedProperty multiValueLegacyExtendedProperty = (MultiValueLegacyExtendedProperty) eVar.b(c3003lArr3[i3].toString(), MultiValueLegacyExtendedProperty.class);
                multiValueLegacyExtendedPropertyArr[i3] = multiValueLegacyExtendedProperty;
                multiValueLegacyExtendedProperty.d(eVar, c3003lArr3[i3]);
            }
            baseMultiValueLegacyExtendedPropertyCollectionResponse.a = Arrays.asList(multiValueLegacyExtendedPropertyArr);
            this.U = new MultiValueLegacyExtendedPropertyCollectionPage(baseMultiValueLegacyExtendedPropertyCollectionResponse, null);
        }
    }
}
