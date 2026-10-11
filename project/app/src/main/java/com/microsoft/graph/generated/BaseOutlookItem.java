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
import java.util.List;

public class BaseOutlookItem
extends Entity
implements d {
    @a
    @c(value="createdDateTime")
    public Calendar f;
    @a
    @c(value="lastModifiedDateTime")
    public Calendar g;
    @a
    @c(value="changeKey")
    public String h;
    @a
    @c(value="categories")
    public List<String> i;
    private transient l j;
    private transient e k;

    @Override
    public void d(e e8, l l8) {
        this.k = e8;
        this.j = l8;
    }
}

