package com.microsoft.graph.generated;

import ax.N9.O0;
import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Recipient;
import java.util.List;

/* loaded from: classes3.dex */
public class BaseMessageRuleActions implements d {

    @InterfaceC3059a
    @InterfaceC3061c("@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;

    @InterfaceC3059a
    @InterfaceC3061c("moveToFolder")
    public String c;

    @InterfaceC3059a
    @InterfaceC3061c("copyToFolder")
    public String d;

    @InterfaceC3059a
    @InterfaceC3061c("delete")
    public Boolean e;

    @InterfaceC3059a
    @InterfaceC3061c("permanentDelete")
    public Boolean f;

    @InterfaceC3059a
    @InterfaceC3061c("markAsRead")
    public Boolean g;

    @InterfaceC3059a
    @InterfaceC3061c("markImportance")
    public O0 h;

    @InterfaceC3059a
    @InterfaceC3061c("forwardTo")
    public List<Recipient> i;

    @InterfaceC3059a
    @InterfaceC3061c("forwardAsAttachmentTo")
    public List<Recipient> j;

    @InterfaceC3059a
    @InterfaceC3061c("redirectTo")
    public List<Recipient> k;

    @InterfaceC3059a
    @InterfaceC3061c("assignCategories")
    public List<String> l;

    @InterfaceC3059a
    @InterfaceC3061c("stopProcessingRules")
    public Boolean m;
    private transient C3003l n;
    private transient e o;

    @Override // ax.T9.d
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override // ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.o = eVar;
        this.n = c3003l;
    }
}
