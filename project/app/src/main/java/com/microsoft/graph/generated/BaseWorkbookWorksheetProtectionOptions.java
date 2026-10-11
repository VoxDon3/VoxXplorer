/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;

public class BaseWorkbookWorksheetProtectionOptions
implements d {
    @a
    @c(value="@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;
    @a
    @c(value="allowAutoFilter")
    public Boolean c;
    @a
    @c(value="allowDeleteColumns")
    public Boolean d;
    @a
    @c(value="allowDeleteRows")
    public Boolean e;
    @a
    @c(value="allowFormatCells")
    public Boolean f;
    @a
    @c(value="allowFormatColumns")
    public Boolean g;
    @a
    @c(value="allowFormatRows")
    public Boolean h;
    @a
    @c(value="allowInsertColumns")
    public Boolean i;
    @a
    @c(value="allowInsertHyperlinks")
    public Boolean j;
    @a
    @c(value="allowInsertRows")
    public Boolean k;
    @a
    @c(value="allowPivotTables")
    public Boolean l;
    @a
    @c(value="allowSort")
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

