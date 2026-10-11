package com.microsoft.graph.generated;

import ax.N9.O0;
import ax.N9.S0;
import ax.N9.Z0;
import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Recipient;
import com.microsoft.graph.extensions.SizeRange;
import java.util.List;

/* loaded from: classes3.dex */
public class BaseMessageRulePredicates implements d {

    @InterfaceC3059a
    @InterfaceC3061c("isNonDeliveryReport")
    public Boolean A;

    @InterfaceC3059a
    @InterfaceC3061c("isPermissionControlled")
    public Boolean B;

    @InterfaceC3059a
    @InterfaceC3061c("isReadReceipt")
    public Boolean C;

    @InterfaceC3059a
    @InterfaceC3061c("isSigned")
    public Boolean D;

    @InterfaceC3059a
    @InterfaceC3061c("isVoicemail")
    public Boolean E;

    @InterfaceC3059a
    @InterfaceC3061c("withinSizeRange")
    public SizeRange F;
    private transient C3003l G;
    private transient e H;

    @InterfaceC3059a
    @InterfaceC3061c("@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;

    @InterfaceC3059a
    @InterfaceC3061c("categories")
    public List<String> c;

    @InterfaceC3059a
    @InterfaceC3061c("subjectContains")
    public List<String> d;

    @InterfaceC3059a
    @InterfaceC3061c("bodyContains")
    public List<String> e;

    @InterfaceC3059a
    @InterfaceC3061c("bodyOrSubjectContains")
    public List<String> f;

    @InterfaceC3059a
    @InterfaceC3061c("senderContains")
    public List<String> g;

    @InterfaceC3059a
    @InterfaceC3061c("recipientContains")
    public List<String> h;

    @InterfaceC3059a
    @InterfaceC3061c("headerContains")
    public List<String> i;

    @InterfaceC3059a
    @InterfaceC3061c("messageActionFlag")
    public S0 j;

    @InterfaceC3059a
    @InterfaceC3061c("importance")
    public O0 k;

    @InterfaceC3059a
    @InterfaceC3061c("sensitivity")
    public Z0 l;

    @InterfaceC3059a
    @InterfaceC3061c("fromAddresses")
    public List<Recipient> m;

    @InterfaceC3059a
    @InterfaceC3061c("sentToAddresses")
    public List<Recipient> n;

    @InterfaceC3059a
    @InterfaceC3061c("sentToMe")
    public Boolean o;

    @InterfaceC3059a
    @InterfaceC3061c("sentOnlyToMe")
    public Boolean p;

    @InterfaceC3059a
    @InterfaceC3061c("sentCcMe")
    public Boolean q;

    @InterfaceC3059a
    @InterfaceC3061c("sentToOrCcMe")
    public Boolean r;

    @InterfaceC3059a
    @InterfaceC3061c("notSentToMe")
    public Boolean s;

    @InterfaceC3059a
    @InterfaceC3061c("hasAttachments")
    public Boolean t;

    @InterfaceC3059a
    @InterfaceC3061c("isApprovalRequest")
    public Boolean u;

    @InterfaceC3059a
    @InterfaceC3061c("isAutomaticForward")
    public Boolean v;

    @InterfaceC3059a
    @InterfaceC3061c("isAutomaticReply")
    public Boolean w;

    @InterfaceC3059a
    @InterfaceC3061c("isEncrypted")
    public Boolean x;

    @InterfaceC3059a
    @InterfaceC3061c("isMeetingRequest")
    public Boolean y;

    @InterfaceC3059a
    @InterfaceC3061c("isMeetingResponse")
    public Boolean z;

    @Override // ax.T9.d
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override // ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.H = eVar;
        this.G = c3003l;
    }
}
