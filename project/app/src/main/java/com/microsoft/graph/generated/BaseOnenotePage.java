/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.Notebook;
import com.microsoft.graph.extensions.OnenoteEntitySchemaObjectModel;
import com.microsoft.graph.extensions.OnenoteSection;
import com.microsoft.graph.extensions.PageLinks;
import java.util.Calendar;
import java.util.List;

public class BaseOnenotePage
extends OnenoteEntitySchemaObjectModel
implements d {
    @a
    @c(value="title")
    public String l;
    @a
    @c(value="createdByAppId")
    public String m;
    @a
    @c(value="links")
    public PageLinks n;
    @a
    @c(value="contentUrl")
    public String o;
    @a
    @c(value="lastModifiedDateTime")
    public Calendar p;
    @a
    @c(value="level")
    public Integer q;
    @a
    @c(value="order")
    public Integer r;
    @a
    @c(value="userTags")
    public List<String> s;
    @a
    @c(value="parentSection")
    public OnenoteSection t;
    @a
    @c(value="parentNotebook")
    public Notebook u;
    private transient l v;
    private transient e w;

    @Override
    public void d(e e8, l l8) {
        this.w = e8;
        this.v = l8;
    }
}

