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
import com.microsoft.graph.extensions.Contact;
import com.microsoft.graph.extensions.ContactCollectionPage;
import com.microsoft.graph.extensions.ContactFolder;
import com.microsoft.graph.extensions.ContactFolderCollectionPage;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.MultiValueLegacyExtendedProperty;
import com.microsoft.graph.extensions.MultiValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.extensions.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.extensions.SingleValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.generated.BaseContact;
import com.microsoft.graph.generated.BaseContactCollectionResponse;
import com.microsoft.graph.generated.BaseContactFolderCollectionResponse;
import com.microsoft.graph.generated.BaseMultiValueLegacyExtendedProperty;
import com.microsoft.graph.generated.BaseMultiValueLegacyExtendedPropertyCollectionResponse;
import com.microsoft.graph.generated.BaseSingleValueLegacyExtendedProperty;
import com.microsoft.graph.generated.BaseSingleValueLegacyExtendedPropertyCollectionResponse;
import java.util.Arrays;

public class BaseContactFolder
extends Entity
implements d {
    @a
    @c(value="parentFolderId")
    public String f;
    @a
    @c(value="displayName")
    public String g;
    public transient ContactCollectionPage h;
    public transient ContactFolderCollectionPage i;
    public transient SingleValueLegacyExtendedPropertyCollectionPage j;
    public transient MultiValueLegacyExtendedPropertyCollectionPage k;
    private transient l l;
    private transient e m;

    @Override
    public void d(e e8, l multiValueLegacyExtendedPropertyArray) {
        Object object;
        int n8;
        Object[] objectArray;
        Object object2;
        Entity[] entityArray;
        this.m = e8;
        this.l = multiValueLegacyExtendedPropertyArray;
        boolean bl = multiValueLegacyExtendedPropertyArray.x("contacts");
        int n9 = 0;
        if (bl) {
            entityArray = new BaseContactCollectionResponse();
            if (multiValueLegacyExtendedPropertyArray.x("contacts@odata.nextLink")) {
                entityArray.b = multiValueLegacyExtendedPropertyArray.t("contacts@odata.nextLink").k();
            }
            object2 = e8.b(multiValueLegacyExtendedPropertyArray.t("contacts").toString(), l[].class);
            objectArray = new Contact[((l[])object2).length];
            for (n8 = 0; n8 < ((l[])object2).length; ++n8) {
                objectArray[n8] = object = e8.b(object2[n8].toString(), Contact.class);
                ((BaseContact)object).d(e8, object2[n8]);
            }
            entityArray.a = Arrays.asList(objectArray);
            this.h = new ContactCollectionPage((BaseContactCollectionResponse)entityArray, null);
        }
        if (multiValueLegacyExtendedPropertyArray.x("childFolders")) {
            objectArray = new BaseContactFolderCollectionResponse();
            if (multiValueLegacyExtendedPropertyArray.x("childFolders@odata.nextLink")) {
                objectArray.b = multiValueLegacyExtendedPropertyArray.t("childFolders@odata.nextLink").k();
            }
            object = e8.b(multiValueLegacyExtendedPropertyArray.t("childFolders").toString(), l[].class);
            entityArray = new ContactFolder[((l[])object).length];
            for (n8 = 0; n8 < ((l[])object).length; ++n8) {
                object2 = e8.b(object[n8].toString(), ContactFolder.class);
                entityArray[n8] = object2;
                ((BaseContactFolder)object2).d(e8, (l)object[n8]);
            }
            objectArray.a = Arrays.asList(entityArray);
            this.i = new ContactFolderCollectionPage((BaseContactFolderCollectionResponse)objectArray, null);
        }
        if (multiValueLegacyExtendedPropertyArray.x("singleValueExtendedProperties")) {
            object = new BaseSingleValueLegacyExtendedPropertyCollectionResponse();
            if (multiValueLegacyExtendedPropertyArray.x("singleValueExtendedProperties@odata.nextLink")) {
                ((BaseSingleValueLegacyExtendedPropertyCollectionResponse)object).b = multiValueLegacyExtendedPropertyArray.t("singleValueExtendedProperties@odata.nextLink").k();
            }
            objectArray = e8.b(multiValueLegacyExtendedPropertyArray.t("singleValueExtendedProperties").toString(), l[].class);
            entityArray = new SingleValueLegacyExtendedProperty[objectArray.length];
            for (n8 = 0; n8 < objectArray.length; ++n8) {
                entityArray[n8] = object2 = e8.b(((i)objectArray[n8]).toString(), SingleValueLegacyExtendedProperty.class);
                ((BaseSingleValueLegacyExtendedProperty)object2).d(e8, (l)objectArray[n8]);
            }
            ((BaseSingleValueLegacyExtendedPropertyCollectionResponse)object).a = Arrays.asList(entityArray);
            this.j = new SingleValueLegacyExtendedPropertyCollectionPage((BaseSingleValueLegacyExtendedPropertyCollectionResponse)object, null);
        }
        if (multiValueLegacyExtendedPropertyArray.x("multiValueExtendedProperties")) {
            object2 = new BaseMultiValueLegacyExtendedPropertyCollectionResponse();
            if (multiValueLegacyExtendedPropertyArray.x("multiValueExtendedProperties@odata.nextLink")) {
                ((BaseMultiValueLegacyExtendedPropertyCollectionResponse)object2).b = multiValueLegacyExtendedPropertyArray.t("multiValueExtendedProperties@odata.nextLink").k();
            }
            objectArray = e8.b(multiValueLegacyExtendedPropertyArray.t("multiValueExtendedProperties").toString(), l[].class);
            multiValueLegacyExtendedPropertyArray = new MultiValueLegacyExtendedProperty[objectArray.length];
            for (n8 = n9; n8 < objectArray.length; ++n8) {
                multiValueLegacyExtendedPropertyArray[n8] = object = e8.b(((i)objectArray[n8]).toString(), MultiValueLegacyExtendedProperty.class);
                ((BaseMultiValueLegacyExtendedProperty)object).d(e8, (l)objectArray[n8]);
            }
            ((BaseMultiValueLegacyExtendedPropertyCollectionResponse)object2).a = Arrays.asList(multiValueLegacyExtendedPropertyArray);
            this.k = new MultiValueLegacyExtendedPropertyCollectionPage((BaseMultiValueLegacyExtendedPropertyCollectionResponse)object2, null);
        }
    }
}

