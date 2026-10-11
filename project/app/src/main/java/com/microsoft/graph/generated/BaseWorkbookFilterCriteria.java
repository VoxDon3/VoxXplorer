/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.i;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.WorkbookIcon;

public class BaseWorkbookFilterCriteria
implements d {
    @a
    @c(value="@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;
    @a
    @c(value="color")
    public String c;
    @a
    @c(value="criterion1")
    public String d;
    @a
    @c(value="criterion2")
    public String e;
    @a
    @c(value="dynamicCriteria")
    public String f;
    @a
    @c(value="filterOn")
    public String g;
    @a
    @c(value="icon")
    public WorkbookIcon h;
    @a
    @c(value="operator")
    public String i;
    @a
    @c(value="values")
    public i j;
    private transient l k;
    private transient e l;

    @Override
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override
    public void d(e e8, l l8) {
        this.l = e8;
        this.k = l8;
    }
}

