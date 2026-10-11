/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.O0;
import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.Recipient;
import java.util.List;

public class BaseMessageRuleActions
implements d {
    @a
    @c(value="@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;
    @a
    @c(value="moveToFolder")
    public String c;
    @a
    @c(value="copyToFolder")
    public String d;
    @a
    @c(value="delete")
    public Boolean e;
    @a
    @c(value="permanentDelete")
    public Boolean f;
    @a
    @c(value="markAsRead")
    public Boolean g;
    @a
    @c(value="markImportance")
    public O0 h;
    @a
    @c(value="forwardTo")
    public List<Recipient> i;
    @a
    @c(value="forwardAsAttachmentTo")
    public List<Recipient> j;
    @a
    @c(value="redirectTo")
    public List<Recipient> k;
    @a
    @c(value="assignCategories")
    public List<String> l;
    @a
    @c(value="stopProcessingRules")
    public Boolean m;
    private transient l n;
    private transient e o;

    @Override
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override
    public void d(e e8, l l8) {
        this.o = e8;
        this.n = l8;
    }
}

