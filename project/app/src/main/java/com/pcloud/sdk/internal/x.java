/*
 * Decompiled with CFR 0.152.
 */
package com.pcloud.sdk.internal;

import ax.la.a;
import ax.la.k;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Locale;

class x
implements k {
    private final a a;
    private final Date b;
    private final List<URL> c;

    x(a a8, Date date, List<URL> list) {
        this.a = a8;
        this.b = date;
        this.c = java.util.DesugarCollections.unmodifiableList(list);
    }

    @Override
    public URL a() {
        return this.c.get(0);
    }

    public Date b() {
        return this.b;
    }

    public List<URL> c() {
        return this.c;
    }

    public String toString() {
        return String.format(Locale.US, "%s | Valid until:%s", this.a(), this.b());
    }
}

