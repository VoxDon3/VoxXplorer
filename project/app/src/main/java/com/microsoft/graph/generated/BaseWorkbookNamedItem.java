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
import com.microsoft.graph.extensions.WorkbookWorksheet;

public class BaseWorkbookNamedItem
extends Entity
implements d {
    @a
    @c(value="comment")
    public String f;
    @a
    @c(value="name")
    public String g;
    @a
    @c(value="scope")
    public String h;
    @a
    @c(value="type")
    public String i;
    @a
    @c(value="value")
    public i j;
    @a
    @c(value="visible")
    public Boolean k;
    @a
    @c(value="worksheet")
    public WorkbookWorksheet l;
    private transient l m;
    private transient e n;

    @Override
    public void d(e e8, l l8) {
        this.n = e8;
        this.m = l8;
    }
}

