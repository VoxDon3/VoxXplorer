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
import java.util.List;

public class BaseWorkbookTableSort
extends Entity
implements d {
    @a
    @c(value="fields")
    public List<Object> f;
    @a
    @c(value="matchCase")
    public Boolean g;
    @a
    @c(value="method")
    public String h;
    private transient l i;
    private transient e j;

    @Override
    public void d(e e8, l l8) {
        this.j = e8;
        this.i = l8;
    }
}

