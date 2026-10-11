/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import ax.M5.p;
import com.google.android.gms.measurement.internal.A0;
import com.google.android.gms.measurement.internal.B5;
import com.google.android.gms.measurement.internal.C1;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.a;
import com.google.android.gms.measurement.internal.d4;
import com.google.android.gms.measurement.internal.f3;
import java.util.Map;

public final class z
extends C1 {
    private final Map<String, Long> b;
    private final Map<String, Integer> c = new ax.B.a<String, Integer>();
    private long d;

    public z(E2 e22) {
        super(e22);
        this.b = new ax.B.a<String, Long>();
    }

    private final void A(String string, long l8, d4 d42) {
        if (d42 == null) {
            ((f3)this).k().K().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (l8 < 1000L) {
            ((f3)this).k().K().b("Not logging ad unit exposure. Less than 1000 ms. exposure", l8);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", string);
        bundle.putLong("_xt", l8);
        B5.X(d42, bundle, true);
        ((C1)this).r().Y0("am", "_xu", bundle);
    }

    private final void B(long l8) {
        for (String string : this.b.keySet()) {
            this.b.put(string, l8);
        }
        if (!this.b.isEmpty()) {
            this.d = l8;
        }
    }

    static /* synthetic */ void C(z z8, String string, long l8) {
        ((f3)z8).n();
        p.f(string);
        Number number = z8.c.get(string);
        if (number != null) {
            d4 d42 = ((C1)z8).s().C(false);
            int n8 = (Integer)number - 1;
            if (n8 == 0) {
                long l9;
                z8.c.remove(string);
                number = z8.b.get(string);
                if (number == null) {
                    ((f3)z8).k().G().a("First ad unit exposure time was never set");
                } else {
                    l9 = (Long)number;
                    z8.b.remove(string);
                    z8.A(string, l8 - l9, d42);
                }
                if (z8.c.isEmpty()) {
                    l9 = z8.d;
                    if (l9 == 0L) {
                        ((f3)z8).k().G().a("First ad exposure time was never set");
                        return;
                    }
                    z8.w(l8 - l9, d42);
                    z8.d = 0L;
                }
                return;
            }
            z8.c.put(string, n8);
            return;
        }
        ((f3)z8).k().G().b("Call to endAdUnitExposure for unknown ad unit id", string);
    }

    private final void w(long l8, d4 d42) {
        if (d42 == null) {
            ((f3)this).k().K().a("Not logging ad exposure. No active activity");
            return;
        }
        if (l8 < 1000L) {
            ((f3)this).k().K().b("Not logging ad exposure. Less than 1000 ms. exposure", l8);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", l8);
        B5.X(d42, bundle, true);
        ((C1)this).r().Y0("am", "_xa", bundle);
    }

    static /* synthetic */ void x(z z8, long l8) {
        z8.B(l8);
    }

    static /* synthetic */ void y(z z8, String string, long l8) {
        Integer n8;
        ((f3)z8).n();
        p.f(string);
        if (z8.c.isEmpty()) {
            z8.d = l8;
        }
        if ((n8 = z8.c.get(string)) != null) {
            z8.c.put(string, n8 + 1);
            return;
        }
        if (z8.c.size() >= 100) {
            ((f3)z8).k().L().a("Too many ads visible");
            return;
        }
        z8.c.put(string, 1);
        z8.b.put(string, l8);
    }

    public final void D(String string, long l8) {
        if (string != null && string.length() != 0) {
            ((f3)this).l().D(new A0(this, string, l8));
            return;
        }
        ((f3)this).k().G().a("Ad unit id must be a non-empty string");
    }

    public final void v(long l8) {
        d4 d42 = ((C1)this).s().C(false);
        for (String string : this.b.keySet()) {
            this.A(string, l8 - this.b.get(string), d42);
        }
        if (!this.b.isEmpty()) {
            this.w(l8 - this.d, d42);
        }
        this.B(l8);
    }

    public final void z(String string, long l8) {
        if (string != null && string.length() != 0) {
            ((f3)this).l().D(new a(this, string, l8));
            return;
        }
        ((f3)this).k().G().a("Ad unit id must be a non-empty string");
    }
}

