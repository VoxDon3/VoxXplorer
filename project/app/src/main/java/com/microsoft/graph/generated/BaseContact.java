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
import com.microsoft.graph.extensions.Extension;
import com.microsoft.graph.extensions.ExtensionCollectionPage;
import com.microsoft.graph.extensions.MultiValueLegacyExtendedProperty;
import com.microsoft.graph.extensions.MultiValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.extensions.OutlookItem;
import com.microsoft.graph.extensions.PhysicalAddress;
import com.microsoft.graph.extensions.ProfilePhoto;
import com.microsoft.graph.extensions.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.extensions.SingleValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.generated.BaseExtension;
import com.microsoft.graph.generated.BaseExtensionCollectionResponse;
import com.microsoft.graph.generated.BaseMultiValueLegacyExtendedProperty;
import com.microsoft.graph.generated.BaseMultiValueLegacyExtendedPropertyCollectionResponse;
import com.microsoft.graph.generated.BaseSingleValueLegacyExtendedProperty;
import com.microsoft.graph.generated.BaseSingleValueLegacyExtendedPropertyCollectionResponse;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class BaseContact
extends OutlookItem
implements d {
    @a
    @c(value="imAddresses")
    public List<String> A;
    @a
    @c(value="jobTitle")
    public String B;
    @a
    @c(value="companyName")
    public String C;
    @a
    @c(value="department")
    public String D;
    @a
    @c(value="officeLocation")
    public String E;
    @a
    @c(value="profession")
    public String F;
    @a
    @c(value="businessHomePage")
    public String G;
    @a
    @c(value="assistantName")
    public String H;
    @a
    @c(value="manager")
    public String I;
    @a
    @c(value="homePhones")
    public List<String> J;
    @a
    @c(value="mobilePhone")
    public String K;
    @a
    @c(value="businessPhones")
    public List<String> L;
    @a
    @c(value="homeAddress")
    public PhysicalAddress M;
    @a
    @c(value="businessAddress")
    public PhysicalAddress N;
    @a
    @c(value="otherAddress")
    public PhysicalAddress O;
    @a
    @c(value="spouseName")
    public String P;
    @a
    @c(value="personalNotes")
    public String Q;
    @a
    @c(value="children")
    public List<String> R;
    public transient ExtensionCollectionPage S;
    public transient SingleValueLegacyExtendedPropertyCollectionPage T;
    public transient MultiValueLegacyExtendedPropertyCollectionPage U;
    @a
    @c(value="photo")
    public ProfilePhoto V;
    private transient l W;
    private transient e X;
    @a
    @c(value="parentFolderId")
    public String l;
    @a
    @c(value="birthday")
    public Calendar m;
    @a
    @c(value="fileAs")
    public String n;
    @a
    @c(value="displayName")
    public String o;
    @a
    @c(value="givenName")
    public String p;
    @a
    @c(value="initials")
    public String q;
    @a
    @c(value="middleName")
    public String r;
    @a
    @c(value="nickName")
    public String s;
    @a
    @c(value="surname")
    public String t;
    @a
    @c(value="title")
    public String u;
    @a
    @c(value="yomiGivenName")
    public String v;
    @a
    @c(value="yomiSurname")
    public String w;
    @a
    @c(value="yomiCompanyName")
    public String x;
    @a
    @c(value="generation")
    public String y;
    @a
    @c(value="emailAddresses")
    public List<EmailAddress> z;

    @Override
    public void d(e e8, l lArray) {
        Entity entity;
        int n8;
        Object object;
        Object[] objectArray;
        SingleValueLegacyExtendedProperty[] singleValueLegacyExtendedPropertyArray;
        this.X = e8;
        this.W = lArray;
        boolean bl = lArray.x("extensions");
        int n9 = 0;
        if (bl) {
            singleValueLegacyExtendedPropertyArray = new BaseExtensionCollectionResponse();
            if (lArray.x("extensions@odata.nextLink")) {
                singleValueLegacyExtendedPropertyArray.b = lArray.t("extensions@odata.nextLink").k();
            }
            objectArray = e8.b(lArray.t("extensions").toString(), l[].class);
            object = new Extension[objectArray.length];
            for (n8 = 0; n8 < objectArray.length; ++n8) {
                entity = e8.b(objectArray[n8].toString(), Extension.class);
                object[n8] = entity;
                ((BaseExtension)entity).d(e8, (l)objectArray[n8]);
            }
            singleValueLegacyExtendedPropertyArray.a = Arrays.asList(object);
            this.S = new ExtensionCollectionPage((BaseExtensionCollectionResponse)singleValueLegacyExtendedPropertyArray, null);
        }
        if (lArray.x("singleValueExtendedProperties")) {
            objectArray = new BaseSingleValueLegacyExtendedPropertyCollectionResponse();
            if (lArray.x("singleValueExtendedProperties@odata.nextLink")) {
                objectArray.b = lArray.t("singleValueExtendedProperties@odata.nextLink").k();
            }
            object = e8.b(lArray.t("singleValueExtendedProperties").toString(), l[].class);
            singleValueLegacyExtendedPropertyArray = new SingleValueLegacyExtendedProperty[((Object[])object).length];
            for (n8 = 0; n8 < ((Object[])object).length; ++n8) {
                entity = e8.b(((i)object[n8]).toString(), SingleValueLegacyExtendedProperty.class);
                singleValueLegacyExtendedPropertyArray[n8] = entity;
                ((BaseSingleValueLegacyExtendedProperty)entity).d(e8, (l)object[n8]);
            }
            objectArray.a = Arrays.asList(singleValueLegacyExtendedPropertyArray);
            this.T = new SingleValueLegacyExtendedPropertyCollectionPage((BaseSingleValueLegacyExtendedPropertyCollectionResponse)objectArray, null);
        }
        if (lArray.x("multiValueExtendedProperties")) {
            singleValueLegacyExtendedPropertyArray = new BaseMultiValueLegacyExtendedPropertyCollectionResponse();
            if (lArray.x("multiValueExtendedProperties@odata.nextLink")) {
                singleValueLegacyExtendedPropertyArray.b = lArray.t("multiValueExtendedProperties@odata.nextLink").k();
            }
            lArray = e8.b(lArray.t("multiValueExtendedProperties").toString(), l[].class);
            objectArray = new MultiValueLegacyExtendedProperty[lArray.length];
            for (n8 = n9; n8 < lArray.length; ++n8) {
                objectArray[n8] = object = e8.b(lArray[n8].toString(), MultiValueLegacyExtendedProperty.class);
                ((BaseMultiValueLegacyExtendedProperty)object).d(e8, lArray[n8]);
            }
            singleValueLegacyExtendedPropertyArray.a = Arrays.asList(objectArray);
            this.U = new MultiValueLegacyExtendedPropertyCollectionPage((BaseMultiValueLegacyExtendedPropertyCollectionResponse)singleValueLegacyExtendedPropertyArray, null);
        }
    }
}

