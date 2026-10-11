/*
 * Decompiled with CFR 0.152.
 */
package com.pcloud.sdk.internal;

import ax.la.a;
import ax.la.p;
import com.pcloud.sdk.internal.x;
import java.net.URL;
import java.util.Date;
import java.util.List;

class y
extends x
implements p {
    private final String d;

    y(a a8, Date date, List<URL> list, String string) {
        super(a8, date, list);
        this.d = string;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof y)) {
            return false;
        }
        object = (y)object;
        return this.b().equals(((x)object).b()) && this.c().equals(((x)object).c()) && this.d.equals(((y)object).d);
    }

    public int hashCode() {
        return (this.b().hashCode() * 31 + this.c().hashCode()) * 31 + this.d.hashCode();
    }
}

