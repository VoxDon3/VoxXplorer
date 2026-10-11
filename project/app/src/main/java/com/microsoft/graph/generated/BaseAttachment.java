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
import java.util.Calendar;

public class BaseAttachment
extends Entity
implements d {
    @a
    @c(value="lastModifiedDateTime")
    public Calendar f;
    @a
    @c(value="name")
    public String g;
    @a
    @c(value="contentType")
    public String h;
    @a
    @c(value="size")
    public Integer i;
    @a
    @c(value="isInline")
    public Boolean j;
    private transient l k;
    private transient e l;

    @Override
    public void d(e e8, l l8) {
        this.l = e8;
        this.k = l8;
    }
}

