/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.O0;
import ax.N9.S0;
import ax.N9.Z0;
import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.Recipient;
import com.microsoft.graph.extensions.SizeRange;
import java.util.List;

public class BaseMessageRulePredicates
implements d {
    @a
    @c(value="isNonDeliveryReport")
    public Boolean A;
    @a
    @c(value="isPermissionControlled")
    public Boolean B;
    @a
    @c(value="isReadReceipt")
    public Boolean C;
    @a
    @c(value="isSigned")
    public Boolean D;
    @a
    @c(value="isVoicemail")
    public Boolean E;
    @a
    @c(value="withinSizeRange")
    public SizeRange F;
    private transient l G;
    private transient e H;
    @a
    @c(value="@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;
    @a
    @c(value="categories")
    public List<String> c;
    @a
    @c(value="subjectContains")
    public List<String> d;
    @a
    @c(value="bodyContains")
    public List<String> e;
    @a
    @c(value="bodyOrSubjectContains")
    public List<String> f;
    @a
    @c(value="senderContains")
    public List<String> g;
    @a
    @c(value="recipientContains")
    public List<String> h;
    @a
    @c(value="headerContains")
    public List<String> i;
    @a
    @c(value="messageActionFlag")
    public S0 j;
    @a
    @c(value="importance")
    public O0 k;
    @a
    @c(value="sensitivity")
    public Z0 l;
    @a
    @c(value="fromAddresses")
    public List<Recipient> m;
    @a
    @c(value="sentToAddresses")
    public List<Recipient> n;
    @a
    @c(value="sentToMe")
    public Boolean o;
    @a
    @c(value="sentOnlyToMe")
    public Boolean p;
    @a
    @c(value="sentCcMe")
    public Boolean q;
    @a
    @c(value="sentToOrCcMe")
    public Boolean r;
    @a
    @c(value="notSentToMe")
    public Boolean s;
    @a
    @c(value="hasAttachments")
    public Boolean t;
    @a
    @c(value="isApprovalRequest")
    public Boolean u;
    @a
    @c(value="isAutomaticForward")
    public Boolean v;
    @a
    @c(value="isAutomaticReply")
    public Boolean w;
    @a
    @c(value="isEncrypted")
    public Boolean x;
    @a
    @c(value="isMeetingRequest")
    public Boolean y;
    @a
    @c(value="isMeetingResponse")
    public Boolean z;

    @Override
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override
    public void d(e e8, l l8) {
        this.H = e8;
        this.G = l8;
    }
}

