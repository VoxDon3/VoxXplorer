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

public class BaseProfilePhoto
extends Entity
implements d {
    @a
    @c(value="height")
    public Integer f;
    @a
    @c(value="width")
    public Integer g;
    private transient l h;
    private transient e i;

    @Override
    public void d(e e8, l l8) {
        this.i = e8;
        this.h = l8;
    }
}

