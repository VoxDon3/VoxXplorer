/*
 * Decompiled with CFR 0.152.
 */
package ax.I2;

import android.content.Context;
import ax.G2.b;
import ax.Gb.g;
import ax.Gb.l;
import ax.I2.a;
import ax.I2.c;
import ax.I2.h;
import ax.I2.k;
import ax.I2.m;

public final class o {
    private final h<Boolean> a;
    private final c b;
    private final h<b> c;
    private final h<Boolean> d;

    public o(Context context, ax.N2.c c8) {
        l.f(context, "context");
        l.f(c8, "taskExecutor");
        this(context, c8, null, null, null, null, 60, null);
    }

    public o(Context context, ax.N2.c c8, h<Boolean> h8, c c9, h<b> h9, h<Boolean> h10) {
        l.f(context, "context");
        l.f(c8, "taskExecutor");
        l.f(h8, "batteryChargingTracker");
        l.f(c9, "batteryNotLowTracker");
        l.f(h9, "networkStateTracker");
        l.f(h10, "storageNotLowTracker");
        this.a = h8;
        this.b = c9;
        this.c = h9;
        this.d = h10;
    }

    public /* synthetic */ o(Context context, ax.N2.c c8, h h8, c c9, h h9, h h10, int n8, g g8) {
        if ((n8 & 4) != 0) {
            h8 = context.getApplicationContext();
            l.e(h8, "context.applicationContext");
            h8 = new a((Context)h8, c8);
        }
        if ((n8 & 8) != 0) {
            c9 = context.getApplicationContext();
            l.e(c9, "context.applicationContext");
            c9 = new c((Context)c9, c8);
        }
        if ((n8 & 0x10) != 0) {
            h9 = context.getApplicationContext();
            l.e(h9, "context.applicationContext");
            h9 = k.a((Context)h9, c8);
        }
        if ((n8 & 0x20) != 0) {
            h10 = context.getApplicationContext();
            l.e(h10, "context.applicationContext");
            h10 = new m((Context)h10, c8);
        }
        this(context, c8, h8, c9, h9, h10);
    }

    public final h<Boolean> a() {
        return this.a;
    }

    public final c b() {
        return this.b;
    }

    public final h<b> c() {
        return this.c;
    }

    public final h<Boolean> d() {
        return this.d;
    }
}

