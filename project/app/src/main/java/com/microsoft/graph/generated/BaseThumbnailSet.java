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
import com.microsoft.graph.extensions.Thumbnail;

public class BaseThumbnailSet
extends Entity
implements d {
    @a
    @c(value="large")
    public Thumbnail f;
    @a
    @c(value="medium")
    public Thumbnail g;
    @a
    @c(value="small")
    public Thumbnail h;
    @a
    @c(value="source")
    public Thumbnail i;
    private transient l j;
    private transient e k;

    @Override
    public void d(e e8, l l8) {
        this.k = e8;
        this.j = l8;
    }
}

