/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.V0;
import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.PlannerChecklistItems;
import com.microsoft.graph.extensions.PlannerExternalReferences;

public class BasePlannerTaskDetails
extends Entity
implements d {
    @a
    @c(value="description")
    public String f;
    @a
    @c(value="previewType")
    public V0 g;
    @a
    @c(value="references")
    public PlannerExternalReferences h;
    @a
    @c(value="checklist")
    public PlannerChecklistItems i;
    private transient l j;
    private transient e k;

    @Override
    public void d(e e8, l l8) {
        this.k = e8;
        this.j = l8;
    }
}

