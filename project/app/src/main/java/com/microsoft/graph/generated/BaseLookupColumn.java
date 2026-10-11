/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;

public class BaseLookupColumn
implements d {
    @a
    @c(value="@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;
    @a
    @c(value="allowMultipleValues")
    public Boolean c;
    @a
    @c(value="allowUnlimitedLength")
    public Boolean d;
    @a
    @c(value="columnName")
    public String e;
    @a
    @c(value="listId")
    public String f;
    @a
    @c(value="primaryLookupColumnId")
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

