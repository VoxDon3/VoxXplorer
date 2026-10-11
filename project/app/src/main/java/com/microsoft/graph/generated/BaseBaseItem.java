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
import com.microsoft.graph.extensions.IdentitySet;
import com.microsoft.graph.extensions.ItemReference;
import com.microsoft.graph.extensions.User;
import java.util.Calendar;

public class BaseBaseItem
extends Entity
implements d {
    @a
    @c(value="createdBy")
    public IdentitySet f;
    @a
    @c(value="createdDateTime")
    public Calendar g;
    @a
    @c(value="description")
    public String h;
    @a
    @c(value="eTag")
    public String i;
    @a
    @c(value="lastModifiedBy")
    public IdentitySet j;
    @a
    @c(value="lastModifiedDateTime")
    public Calendar k;
    @a
    @c(value="name")
    public String l;
    @a
    @c(value="parentReference")
    public ItemReference m;
    @a
    @c(value="webUrl")
    public String n;
    @a
    @c(value="createdByUser")
    public User o;
    @a
    @c(value="lastModifiedByUser")
    public User p;
    private transient l q;
    private transient e r;

    @Override
    public void d(e e8, l l8) {
        this.r = e8;
        this.q = l8;
    }
}

