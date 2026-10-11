/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.OnenoteEntityBaseModel;
import java.util.Calendar;

public class BaseOnenoteEntitySchemaObjectModel
extends OnenoteEntityBaseModel
implements d {
    @a
    @c(value="createdDateTime")
    public Calendar i;
    private transient l j;
    private transient e k;

    @Override
    public void d(e e8, l l8) {
        this.k = e8;
        this.j = l8;
    }
}

