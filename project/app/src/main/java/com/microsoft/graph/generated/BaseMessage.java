/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.O0;
import ax.N9.P0;
import ax.T9.d;
import ax.T9.e;
import ax.r8.i;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.Attachment;
import com.microsoft.graph.extensions.AttachmentCollectionPage;
import com.microsoft.graph.extensions.Extension;
import com.microsoft.graph.extensions.ExtensionCollectionPage;
import com.microsoft.graph.extensions.FollowupFlag;
import com.microsoft.graph.extensions.ItemBody;
import com.microsoft.graph.extensions.MultiValueLegacyExtendedProperty;
import com.microsoft.graph.extensions.MultiValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.extensions.OutlookItem;
import com.microsoft.graph.extensions.Recipient;
import com.microsoft.graph.extensions.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.extensions.SingleValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.generated.BaseAttachment;
import com.microsoft.graph.generated.BaseAttachmentCollectionResponse;
import com.microsoft.graph.generated.BaseExtension;
import com.microsoft.graph.generated.BaseExtensionCollectionResponse;
import com.microsoft.graph.generated.BaseMultiValueLegacyExtendedProperty;
import com.microsoft.graph.generated.BaseMultiValueLegacyExtendedPropertyCollectionResponse;
import com.microsoft.graph.generated.BaseSingleValueLegacyExtendedProperty;
import com.microsoft.graph.generated.BaseSingleValueLegacyExtendedPropertyCollectionResponse;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class BaseMessage
extends OutlookItem
implements d {
    @a
    @c(value="replyTo")
    public List<Recipient> A;
    @a
    @c(value="conversationId")
    public String B;
    @a
    @c(value="uniqueBody")
    public ItemBody C;
    @a
    @c(value="isDeliveryReceiptRequested")
    public Boolean D;
    @a
    @c(value="isReadReceiptRequested")
    public Boolean E;
    @a
    @c(value="isRead")
    public Boolean F;
    @a
    @c(value="isDraft")
    public Boolean G;
    @a
    @c(value="webLink")
    public String H;
    @a
    @c(value="inferenceClassification")
    public P0 I;
    @a
    @c(value="flag")
    public FollowupFlag J;
    public transient AttachmentCollectionPage K;
    public transient ExtensionCollectionPage L;
    public transient SingleValueLegacyExtendedPropertyCollectionPage M;
    public transient MultiValueLegacyExtendedPropertyCollectionPage N;
    private transient l O;
    private transient e P;
    @a
    @c(value="receivedDateTime")
    public Calendar l;
    @a
    @c(value="sentDateTime")
    public Calendar m;
    @a
    @c(value="hasAttachments")
    public Boolean n;
    @a
    @c(value="internetMessageId")
    public String o;
    @a
    @c(value="internetMessageHeaders")
    public List<Object> p;
    @a
    @c(value="subject")
    public String q;
    @a
    @c(value="body")
    public ItemBody r;
    @a
    @c(value="bodyPreview")
    public String s;
    @a
    @c(value="importance")
    public O0 t;
    @a
    @c(value="parentFolderId")
    public String u;
    @a
    @c(value="sender")
    public Recipient v;
    @a
    @c(value="from")
    public Recipient w;
    @a
    @c(value="toRecipients")
    public List<Recipient> x;
    @a
    @c(value="ccRecipients")
    public List<Recipient> y;
    @a
    @c(value="bccRecipients")
    public List<Recipient> z;

    @Override
    public void d(e e8, l lArray) {
        Object object;
        int n8;
        Object object2;
        Object object3;
        Object[] objectArray;
        this.P = e8;
        this.O = lArray;
        boolean bl = lArray.x("attachments");
        int n9 = 0;
        if (bl) {
            objectArray = new BaseAttachmentCollectionResponse();
            if (lArray.x("attachments@odata.nextLink")) {
                objectArray.b = lArray.t("attachments@odata.nextLink").k();
            }
            object3 = e8.b(lArray.t("attachments").toString(), l[].class);
            object2 = new Attachment[((l[])object3).length];
            for (n8 = 0; n8 < ((l[])object3).length; ++n8) {
                object2[n8] = object = e8.b(object3[n8].toString(), Attachment.class);
                ((BaseAttachment)object).d(e8, object3[n8]);
            }
            objectArray.a = Arrays.asList(object2);
            this.K = new AttachmentCollectionPage((BaseAttachmentCollectionResponse)objectArray, null);
        }
        if (lArray.x("extensions")) {
            object = new BaseExtensionCollectionResponse();
            if (lArray.x("extensions@odata.nextLink")) {
                ((BaseExtensionCollectionResponse)object).b = lArray.t("extensions@odata.nextLink").k();
            }
            objectArray = e8.b(lArray.t("extensions").toString(), l[].class);
            object2 = new Extension[objectArray.length];
            for (n8 = 0; n8 < objectArray.length; ++n8) {
                object2[n8] = object3 = e8.b(((i)objectArray[n8]).toString(), Extension.class);
                ((BaseExtension)object3).d(e8, (l)objectArray[n8]);
            }
            ((BaseExtensionCollectionResponse)object).a = Arrays.asList(object2);
            this.L = new ExtensionCollectionPage((BaseExtensionCollectionResponse)object, null);
        }
        if (lArray.x("singleValueExtendedProperties")) {
            object3 = new BaseSingleValueLegacyExtendedPropertyCollectionResponse();
            if (lArray.x("singleValueExtendedProperties@odata.nextLink")) {
                ((BaseSingleValueLegacyExtendedPropertyCollectionResponse)object3).b = lArray.t("singleValueExtendedProperties@odata.nextLink").k();
            }
            object = e8.b(lArray.t("singleValueExtendedProperties").toString(), l[].class);
            objectArray = new SingleValueLegacyExtendedProperty[((l[])object).length];
            for (n8 = 0; n8 < ((l[])object).length; ++n8) {
                objectArray[n8] = object2 = e8.b(object[n8].toString(), SingleValueLegacyExtendedProperty.class);
                ((BaseSingleValueLegacyExtendedProperty)object2).d(e8, (l)object[n8]);
            }
            ((BaseSingleValueLegacyExtendedPropertyCollectionResponse)object3).a = Arrays.asList(objectArray);
            this.M = new SingleValueLegacyExtendedPropertyCollectionPage((BaseSingleValueLegacyExtendedPropertyCollectionResponse)object3, null);
        }
        if (lArray.x("multiValueExtendedProperties")) {
            objectArray = new BaseMultiValueLegacyExtendedPropertyCollectionResponse();
            if (lArray.x("multiValueExtendedProperties@odata.nextLink")) {
                objectArray.b = lArray.t("multiValueExtendedProperties@odata.nextLink").k();
            }
            lArray = e8.b(lArray.t("multiValueExtendedProperties").toString(), l[].class);
            object2 = new MultiValueLegacyExtendedProperty[lArray.length];
            for (n8 = n9; n8 < lArray.length; ++n8) {
                object2[n8] = object3 = e8.b(lArray[n8].toString(), MultiValueLegacyExtendedProperty.class);
                ((BaseMultiValueLegacyExtendedProperty)object3).d(e8, lArray[n8]);
            }
            objectArray.a = Arrays.asList(object2);
            this.N = new MultiValueLegacyExtendedPropertyCollectionPage((BaseMultiValueLegacyExtendedPropertyCollectionResponse)objectArray, null);
        }
    }
}

