package com.pcloud.sdk.internal;

import ax.la.InterfaceC2491a;
import j$.util.DesugarCollections;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
class x implements ax.la.k {
    private final InterfaceC2491a a;
    private final Date b;
    private final List<URL> c;

    x(InterfaceC2491a interfaceC2491a, Date date, List<URL> list) {
        this.a = interfaceC2491a;
        this.b = date;
        this.c = DesugarCollections.unmodifiableList(list);
    }

    @Override // ax.la.k
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
        return String.format(Locale.US, "%s | Valid until:%s", a(), b());
    }
}
