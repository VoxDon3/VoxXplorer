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
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.MailFolder;
import com.microsoft.graph.extensions.MailFolderCollectionPage;
import com.microsoft.graph.extensions.Message;
import com.microsoft.graph.extensions.MessageCollectionPage;
import com.microsoft.graph.extensions.MessageRule;
import com.microsoft.graph.extensions.MessageRuleCollectionPage;
import com.microsoft.graph.extensions.MultiValueLegacyExtendedProperty;
import com.microsoft.graph.extensions.MultiValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.extensions.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.extensions.SingleValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.generated.BaseMailFolderCollectionResponse;
import com.microsoft.graph.generated.BaseMessage;
import com.microsoft.graph.generated.BaseMessageCollectionResponse;
import com.microsoft.graph.generated.BaseMessageRule;
import com.microsoft.graph.generated.BaseMessageRuleCollectionResponse;
import com.microsoft.graph.generated.BaseMultiValueLegacyExtendedProperty;
import com.microsoft.graph.generated.BaseMultiValueLegacyExtendedPropertyCollectionResponse;
import com.microsoft.graph.generated.BaseSingleValueLegacyExtendedProperty;
import com.microsoft.graph.generated.BaseSingleValueLegacyExtendedPropertyCollectionResponse;
import java.util.Arrays;

public class BaseMailFolder
extends Entity
implements d {
    @a
    @c(value="displayName")
    public String f;
    @a
    @c(value="parentFolderId")
    public String g;
    @a
    @c(value="childFolderCount")
    public Integer h;
    @a
    @c(value="unreadItemCount")
    public Integer i;
    @a
    @c(value="totalItemCount")
    public Integer j;
    public transient MessageCollectionPage k;
    public transient MessageRuleCollectionPage l;
    public transient MailFolderCollectionPage m;
    public transient SingleValueLegacyExtendedPropertyCollectionPage n;
    public transient MultiValueLegacyExtendedPropertyCollectionPage o;
    private transient l p;
    private transient e q;

    @Override
    public void d(e e8, l object) {
        Object object2;
        int n8;
        Object object3;
        Object object4;
        Object object5;
        this.q = e8;
        this.p = object;
        boolean bl = ((l)object).x("messages");
        int n9 = 0;
        if (bl) {
            object5 = new BaseMessageCollectionResponse();
            if (((l)object).x("messages@odata.nextLink")) {
                ((BaseMessageCollectionResponse)object5).b = ((l)object).t("messages@odata.nextLink").k();
            }
            object4 = e8.b(((l)object).t("messages").toString(), l[].class);
            object3 = new Message[((l[])object4).length];
            for (n8 = 0; n8 < ((l[])object4).length; ++n8) {
                object3[n8] = object2 = e8.b(object4[n8].toString(), Message.class);
                ((BaseMessage)object2).d(e8, object4[n8]);
            }
            ((BaseMessageCollectionResponse)object5).a = Arrays.asList(object3);
            this.k = new MessageCollectionPage((BaseMessageCollectionResponse)object5, null);
        }
        if (((l)object).x("messageRules")) {
            object4 = new BaseMessageRuleCollectionResponse();
            if (((l)object).x("messageRules@odata.nextLink")) {
                object4.b = ((l)object).t("messageRules@odata.nextLink").k();
            }
            object2 = e8.b(((l)object).t("messageRules").toString(), l[].class);
            object5 = new MessageRule[((l[])object2).length];
            for (n8 = 0; n8 < ((l[])object2).length; ++n8) {
                object3 = e8.b(((i)object2[n8]).toString(), MessageRule.class);
                object5[n8] = object3;
                ((BaseMessageRule)object3).d(e8, (l)object2[n8]);
            }
            object4.a = Arrays.asList(object5);
            this.l = new MessageRuleCollectionPage((BaseMessageRuleCollectionResponse)object4, null);
        }
        if (((l)object).x("childFolders")) {
            object5 = new BaseMailFolderCollectionResponse();
            if (((l)object).x("childFolders@odata.nextLink")) {
                ((BaseMailFolderCollectionResponse)object5).b = ((l)object).t("childFolders@odata.nextLink").k();
            }
            object4 = e8.b(((l)object).t("childFolders").toString(), l[].class);
            object2 = new MailFolder[((l[])object4).length];
            for (n8 = 0; n8 < ((l[])object4).length; ++n8) {
                object2[n8] = object3 = e8.b(object4[n8].toString(), MailFolder.class);
                ((BaseMailFolder)object3).d(e8, object4[n8]);
            }
            ((BaseMailFolderCollectionResponse)object5).a = Arrays.asList(object2);
            this.m = new MailFolderCollectionPage((BaseMailFolderCollectionResponse)object5, null);
        }
        if (((l)object).x("singleValueExtendedProperties")) {
            object2 = new BaseSingleValueLegacyExtendedPropertyCollectionResponse();
            if (((l)object).x("singleValueExtendedProperties@odata.nextLink")) {
                ((BaseSingleValueLegacyExtendedPropertyCollectionResponse)object2).b = ((l)object).t("singleValueExtendedProperties@odata.nextLink").k();
            }
            object4 = e8.b(((l)object).t("singleValueExtendedProperties").toString(), l[].class);
            object3 = new SingleValueLegacyExtendedProperty[((l[])object4).length];
            for (n8 = 0; n8 < ((l[])object4).length; ++n8) {
                object3[n8] = object5 = e8.b(object4[n8].toString(), SingleValueLegacyExtendedProperty.class);
                ((BaseSingleValueLegacyExtendedProperty)object5).d(e8, object4[n8]);
            }
            ((BaseSingleValueLegacyExtendedPropertyCollectionResponse)object2).a = Arrays.asList(object3);
            this.n = new SingleValueLegacyExtendedPropertyCollectionPage((BaseSingleValueLegacyExtendedPropertyCollectionResponse)object2, null);
        }
        if (((l)object).x("multiValueExtendedProperties")) {
            object4 = new BaseMultiValueLegacyExtendedPropertyCollectionResponse();
            if (((l)object).x("multiValueExtendedProperties@odata.nextLink")) {
                object4.b = ((l)object).t("multiValueExtendedProperties@odata.nextLink").k();
            }
            object2 = e8.b(((l)object).t("multiValueExtendedProperties").toString(), l[].class);
            object5 = new MultiValueLegacyExtendedProperty[((Object[])object2).length];
            for (n8 = n9; n8 < ((Object[])object2).length; ++n8) {
                object5[n8] = object = e8.b(((i)object2[n8]).toString(), MultiValueLegacyExtendedProperty.class);
                ((BaseMultiValueLegacyExtendedProperty)object).d(e8, (l)object2[n8]);
            }
            object4.a = Arrays.asList(object5);
            this.o = new MultiValueLegacyExtendedPropertyCollectionPage((BaseMultiValueLegacyExtendedPropertyCollectionResponse)object4, null);
        }
    }
}

