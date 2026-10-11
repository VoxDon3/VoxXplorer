/*
 * Decompiled with CFR 0.152.
 */
package ax.Sd;

import ax.Sd.b;
import ax.Td.a;
import ax.Wd.m;
import java.util.Arrays;

public class c
extends b {
    private static final m g = new ax.Wd.c();
    private ax.Wd.b b = new ax.Wd.b(g);
    private b.a c;
    private a d = new a();
    private ax.Ud.c e = new ax.Ud.c();
    private byte[] f = new byte[2];

    public c() {
        this.j();
    }

    @Override
    public String c() {
        return ax.Rd.b.i;
    }

    @Override
    public float d() {
        return Math.max(this.d.a(), this.e.a());
    }

    @Override
    public b.a e() {
        return this.c;
    }

    @Override
    public b.a f(byte[] byArray, int n8, int n9) {
        int n10 = n9 + n8;
        for (n9 = n8; n9 < n10; ++n9) {
            Object object;
            int n11 = this.b.c(byArray[n9]);
            if (n11 == 1) {
                this.c = b.a.d0;
                break;
            }
            if (n11 == 2) {
                this.c = b.a.c0;
                break;
            }
            if (n11 != 0) continue;
            n11 = this.b.b();
            if (n9 == n8) {
                object = this.f;
                object[1] = byArray[n8];
                this.d.d((byte[])object, 0, n11);
                this.e.d(this.f, 0, n11);
                continue;
            }
            object = this.d;
            int n12 = n9 - 1;
            ((ax.Td.b)object).d(byArray, n12, n11);
            this.e.d(byArray, n12, n11);
        }
        this.f[0] = byArray[n10 - 1];
        if (this.c == b.a.q && this.d.c() && this.d() > 0.95f) {
            this.c = b.a.c0;
        }
        return this.c;
    }

    @Override
    public final void j() {
        this.b.d();
        this.c = b.a.q;
        this.d.e();
        this.e.e();
        Arrays.fill(this.f, (byte)0);
    }
}

