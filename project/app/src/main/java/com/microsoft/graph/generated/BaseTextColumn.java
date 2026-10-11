/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;

public class BaseTextColumn
implements d {
    @a
    @c(value="@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;
    @a
    @c(value="allowMultipleLines")
    public Boolean c;
    @a
    @c(value="appendChangesToExistingText")
    public Boolean d;
    @a
    @c(value="linesForEditing")
    public Integer e;
    @a
    @c(value="maxLength")
    public Integer f;
    @a
    @c(value="textType")
    public String g;
    private transient l h;
    private transient e i;

    @Override
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override
    public void d(e e8, l l8) {
        this.i = e8;
        this.h = l8;
    }
}

