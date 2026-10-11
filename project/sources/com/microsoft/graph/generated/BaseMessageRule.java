package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.MessageRuleActions;
import com.microsoft.graph.extensions.MessageRulePredicates;

/* loaded from: classes3.dex */
public class BaseMessageRule extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("displayName")
    public String f;

    @InterfaceC3059a
    @InterfaceC3061c("sequence")
    public Integer g;

    @InterfaceC3059a
    @InterfaceC3061c("conditions")
    public MessageRulePredicates h;

    @InterfaceC3059a
    @InterfaceC3061c("actions")
    public MessageRuleActions i;

    @InterfaceC3059a
    @InterfaceC3061c("exceptions")
    public MessageRulePredicates j;

    @InterfaceC3059a
    @InterfaceC3061c("isEnabled")
    public Boolean k;

    @InterfaceC3059a
    @InterfaceC3061c("hasError")
    public Boolean l;

    @InterfaceC3059a
    @InterfaceC3061c("isReadOnly")
    public Boolean m;
    private transient C3003l n;
    private transient e o;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.o = eVar;
        this.n = c3003l;
    }
}
