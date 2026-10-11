/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.P0;
import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.EmailAddress;
import com.microsoft.graph.extensions.Entity;

public class BaseInferenceClassificationOverride
extends Entity
implements d {
    @a
    @c(value="classifyAs")
    public P0 f;
    @a
    @c(value="senderEmailAddress")
    public EmailAddress g;
    private transient l h;
    private transient e i;

    @Override
    public void d(e e8, l l8) {
        this.i = e8;
        this.h = l8;
    }
}

