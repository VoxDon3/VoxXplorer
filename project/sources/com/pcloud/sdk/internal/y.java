package com.pcloud.sdk.internal;

import ax.la.InterfaceC2491a;
import java.net.URL;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
class y extends x implements ax.la.p {
    private final String d;

    y(InterfaceC2491a interfaceC2491a, Date date, List<URL> list, String str) {
        super(interfaceC2491a, date, list);
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return b().equals(yVar.b()) && c().equals(yVar.c()) && this.d.equals(yVar.d);
    }

    public int hashCode() {
        return (((b().hashCode() * 31) + c().hashCode()) * 31) + this.d.hashCode();
    }
}
