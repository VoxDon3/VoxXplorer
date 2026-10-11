package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
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
import java.util.Arrays;

/* loaded from: classes3.dex */
public class BaseMailFolder extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("displayName")
    public String f;

    @InterfaceC3059a
    @InterfaceC3061c("parentFolderId")
    public String g;

    @InterfaceC3059a
    @InterfaceC3061c("childFolderCount")
    public Integer h;

    @InterfaceC3059a
    @InterfaceC3061c("unreadItemCount")
    public Integer i;

    @InterfaceC3059a
    @InterfaceC3061c("totalItemCount")
    public Integer j;
    public transient MessageCollectionPage k;
    public transient MessageRuleCollectionPage l;
    public transient MailFolderCollectionPage m;
    public transient SingleValueLegacyExtendedPropertyCollectionPage n;
    public transient MultiValueLegacyExtendedPropertyCollectionPage o;
    private transient C3003l p;
    private transient e q;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.q = eVar;
        this.p = c3003l;
        if (c3003l.x("messages")) {
            BaseMessageCollectionResponse baseMessageCollectionResponse = new BaseMessageCollectionResponse();
            if (c3003l.x("messages@odata.nextLink")) {
                baseMessageCollectionResponse.b = c3003l.t("messages@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("messages").toString(), C3003l[].class);
            Message[] messageArr = new Message[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                Message message = (Message) eVar.b(c3003lArr[i].toString(), Message.class);
                messageArr[i] = message;
                message.d(eVar, c3003lArr[i]);
            }
            baseMessageCollectionResponse.a = Arrays.asList(messageArr);
            this.k = new MessageCollectionPage(baseMessageCollectionResponse, null);
        }
        if (c3003l.x("messageRules")) {
            BaseMessageRuleCollectionResponse baseMessageRuleCollectionResponse = new BaseMessageRuleCollectionResponse();
            if (c3003l.x("messageRules@odata.nextLink")) {
                baseMessageRuleCollectionResponse.b = c3003l.t("messageRules@odata.nextLink").k();
            }
            C3003l[] c3003lArr2 = (C3003l[]) eVar.b(c3003l.t("messageRules").toString(), C3003l[].class);
            MessageRule[] messageRuleArr = new MessageRule[c3003lArr2.length];
            for (int i2 = 0; i2 < c3003lArr2.length; i2++) {
                MessageRule messageRule = (MessageRule) eVar.b(c3003lArr2[i2].toString(), MessageRule.class);
                messageRuleArr[i2] = messageRule;
                messageRule.d(eVar, c3003lArr2[i2]);
            }
            baseMessageRuleCollectionResponse.a = Arrays.asList(messageRuleArr);
            this.l = new MessageRuleCollectionPage(baseMessageRuleCollectionResponse, null);
        }
        if (c3003l.x("childFolders")) {
            BaseMailFolderCollectionResponse baseMailFolderCollectionResponse = new BaseMailFolderCollectionResponse();
            if (c3003l.x("childFolders@odata.nextLink")) {
                baseMailFolderCollectionResponse.b = c3003l.t("childFolders@odata.nextLink").k();
            }
            C3003l[] c3003lArr3 = (C3003l[]) eVar.b(c3003l.t("childFolders").toString(), C3003l[].class);
            MailFolder[] mailFolderArr = new MailFolder[c3003lArr3.length];
            for (int i3 = 0; i3 < c3003lArr3.length; i3++) {
                MailFolder mailFolder = (MailFolder) eVar.b(c3003lArr3[i3].toString(), MailFolder.class);
                mailFolderArr[i3] = mailFolder;
                mailFolder.d(eVar, c3003lArr3[i3]);
            }
            baseMailFolderCollectionResponse.a = Arrays.asList(mailFolderArr);
            this.m = new MailFolderCollectionPage(baseMailFolderCollectionResponse, null);
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
            this.n = new SingleValueLegacyExtendedPropertyCollectionPage(baseSingleValueLegacyExtendedPropertyCollectionResponse, null);
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
            this.o = new MultiValueLegacyExtendedPropertyCollectionPage(baseMultiValueLegacyExtendedPropertyCollectionResponse, null);
        }
    }
}
