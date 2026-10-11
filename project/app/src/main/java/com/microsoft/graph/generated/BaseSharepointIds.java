/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;

public class BaseSharepointIds
implements d {
    @a
    @c(value="@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;
    @a
    @c(value="listId")
    public String c;
    @a
    @c(value="listItemId")
    public String d;
    @a
    @c(value="listItemUniqueId")
    public String e;
    @a
    @c(value="siteId")
    public String f;
    @a
    @c(value="siteUrl")
    public String g;
    @a
    @c(value="webId")
    public String h;
    private transient l i;
    private transient e j;

    @Override
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override
    public void d(e e8, l l8) {
        this.j = e8;
        this.i = l8;
    }
}

