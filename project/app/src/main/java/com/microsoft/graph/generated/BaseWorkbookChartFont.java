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

public class BaseWorkbookChartFont
extends Entity
implements d {
    @a
    @c(value="bold")
    public Boolean f;
    @a
    @c(value="color")
    public String g;
    @a
    @c(value="italic")
    public Boolean h;
    @a
    @c(value="name")
    public String i;
    @a
    @c(value="size")
    public Double j;
    @a
    @c(value="underline")
    public String k;
    private transient l l;
    private transient e m;

    @Override
    public void d(e e8, l l8) {
        this.m = e8;
        this.l = l8;
    }
}

