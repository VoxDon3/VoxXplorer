/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.AutomaticRepliesSetting;
import com.microsoft.graph.extensions.LocaleInfo;
import com.microsoft.graph.extensions.WorkingHours;

public class BaseMailboxSettings
implements d {
    @a
    @c(value="@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;
    @a
    @c(value="automaticRepliesSetting")
    public AutomaticRepliesSetting c;
    @a
    @c(value="archiveFolder")
    public String d;
    @a
    @c(value="timeZone")
    public String e;
    @a
    @c(value="language")
    public LocaleInfo f;
    @a
    @c(value="workingHours")
    public WorkingHours g;
    private transient l h;
    private transient e i;

    @Override
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override
    public void d(e e8, l l8) {
        this.i = e8;
        this.h = l8;
    }
}

