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
import com.microsoft.graph.extensions.SharingInvitation;
import com.microsoft.graph.extensions.SharingLink;
import java.util.List;

public class BasePermission
extends Entity
implements d {
    @a
    @c(value="grantedTo")
    public IdentitySet f;
    @a
    @c(value="inheritedFrom")
    public ItemReference g;
    @a
    @c(value="invitation")
    public SharingInvitation h;
    @a
    @c(value="link")
    public SharingLink i;
    @a
    @c(value="roles")
    public List<String> j;
    @a
    @c(value="shareId")
    public String k;
    private transient l l;
    private transient e m;

    @Override
    public void d(e e8, l l8) {
        this.m = e8;
        this.l = l8;
    }
}

