/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.OnenoteOperationError;
import com.microsoft.graph.extensions.Operation;

public class BaseOnenoteOperation
extends Operation
implements d {
    @a
    @c(value="resourceLocation")
    public String k;
    @a
    @c(value="resourceId")
    public String l;
    @a
    @c(value="error")
    public OnenoteOperationError m;
    @a
    @c(value="percentComplete")
    public String n;
    private transient l o;
    private transient e p;

    @Override
    public void d(e e8, l l8) {
        this.p = e8;
        this.o = l8;
    }
}

