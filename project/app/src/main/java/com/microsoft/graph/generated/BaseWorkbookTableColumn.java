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
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.WorkbookFilter;

public class BaseWorkbookTableColumn
extends Entity
implements d {
    @a
    @c(value="index")
    public Integer f;
    @a
    @c(value="name")
    public String g;
    @a
    @c(value="values")
    public i h;
    @a
    @c(value="filter")
    public WorkbookFilter i;
    private transient l j;
    private transient e k;

    @Override
    public void d(e e8, l l8) {
        this.k = e8;
        this.j = l8;
    }
}

