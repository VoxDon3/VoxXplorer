/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.MessageRuleActions;
import com.microsoft.graph.extensions.MessageRulePredicates;

public class BaseMessageRule
extends Entity
implements d {
    @a
    @c(value="displayName")
    public String f;
    @a
    @c(value="sequence")
    public Integer g;
    @a
    @c(value="conditions")
    public MessageRulePredicates h;
    @a
    @c(value="actions")
    public MessageRuleActions i;
    @a
    @c(value="exceptions")
    public MessageRulePredicates j;
    @a
    @c(value="isEnabled")
    public Boolean k;
    @a
    @c(value="hasError")
    public Boolean l;
    @a
    @c(value="isReadOnly")
    public Boolean m;
    private transient l n;
    private transient e o;

    @Override
    public void d(e e8, l l8) {
        this.o = e8;
        this.n = l8;
    }
}

