package com.microsoft.graph.generated;

import ax.N9.O0;
import ax.N9.P0;
import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
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
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/* loaded from: classes3.dex */
public class BaseMessage extends OutlookItem implements d {

    @InterfaceC3059a
    @InterfaceC3061c("replyTo")
    public List<Recipient> A;

    @InterfaceC3059a
    @InterfaceC3061c("conversationId")
    public String B;

    @InterfaceC3059a
    @InterfaceC3061c("uniqueBody")
    public ItemBody C;

    @InterfaceC3059a
    @InterfaceC3061c("isDeliveryReceiptRequested")
    public Boolean D;

    @InterfaceC3059a
    @InterfaceC3061c("isReadReceiptRequested")
    public Boolean E;

    @InterfaceC3059a
    @InterfaceC3061c("isRead")
    public Boolean F;

    @InterfaceC3059a
    @InterfaceC3061c("isDraft")
    public Boolean G;

    @InterfaceC3059a
    @InterfaceC3061c("webLink")
    public String H;

    @InterfaceC3059a
    @InterfaceC3061c("inferenceClassification")
    public P0 I;

    @InterfaceC3059a
    @InterfaceC3061c("flag")
    public FollowupFlag J;
    public transient AttachmentCollectionPage K;
    public transient ExtensionCollectionPage L;
    public transient SingleValueLegacyExtendedPropertyCollectionPage M;
    public transient MultiValueLegacyExtendedPropertyCollectionPage N;
    private transient C3003l O;
    private transient e P;

    @InterfaceC3059a
    @InterfaceC3061c("receivedDateTime")
    public Calendar l;

    @InterfaceC3059a
    @InterfaceC3061c("sentDateTime")
    public Calendar m;

    @InterfaceC3059a
    @InterfaceC3061c("hasAttachments")
    public Boolean n;

    @InterfaceC3059a
    @InterfaceC3061c("internetMessageId")
    public String o;

    @InterfaceC3059a
    @InterfaceC3061c("internetMessageHeaders")
    public List<Object> p;

    @InterfaceC3059a
    @InterfaceC3061c("subject")
    public String q;

    @InterfaceC3059a
    @InterfaceC3061c("body")
    public ItemBody r;

    @InterfaceC3059a
    @InterfaceC3061c("bodyPreview")
    public String s;

    @InterfaceC3059a
    @InterfaceC3061c("importance")
    public O0 t;

    @InterfaceC3059a
    @InterfaceC3061c("parentFolderId")
    public String u;

    @InterfaceC3059a
    @InterfaceC3061c("sender")
    public Recipient v;

    @InterfaceC3059a
    @InterfaceC3061c("from")
    public Recipient w;

    @InterfaceC3059a
    @InterfaceC3061c("toRecipients")
    public List<Recipient> x;

    @InterfaceC3059a
    @InterfaceC3061c("ccRecipients")
    public List<Recipient> y;

    @InterfaceC3059a
    @InterfaceC3061c("bccRecipients")
    public List<Recipient> z;

    @Override // com.microsoft.graph.generated.BaseOutlookItem, com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.P = eVar;
        this.O = c3003l;
        if (c3003l.x("attachments")) {
            BaseAttachmentCollectionResponse baseAttachmentCollectionResponse = new BaseAttachmentCollectionResponse();
            if (c3003l.x("attachments@odata.nextLink")) {
                baseAttachmentCollectionResponse.b = c3003l.t("attachments@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("attachments").toString(), C3003l[].class);
            Attachment[] attachmentArr = new Attachment[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                Attachment attachment = (Attachment) eVar.b(c3003lArr[i].toString(), Attachment.class);
                attachmentArr[i] = attachment;
                attachment.d(eVar, c3003lArr[i]);
            }
            baseAttachmentCollectionResponse.a = Arrays.asList(attachmentArr);
            this.K = new AttachmentCollectionPage(baseAttachmentCollectionResponse, null);
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
            this.L = new ExtensionCollectionPage(baseExtensionCollectionResponse, null);
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
            this.M = new SingleValueLegacyExtendedPropertyCollectionPage(baseSingleValueLegacyExtendedPropertyCollectionResponse, null);
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
            this.N = new MultiValueLegacyExtendedPropertyCollectionPage(baseMultiValueLegacyExtendedPropertyCollectionResponse, null);
        }
    }
}
