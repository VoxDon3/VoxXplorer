/*
 * Decompiled with CFR 0.152.
 */
package ax.Sd;

import ax.Sd.b;
import ax.Wd.m;
import java.util.Arrays;

public class e
extends b {
    private static final m f = new ax.Wd.e();
    private ax.Wd.b b = new ax.Wd.b(f);
    private b.a c;
    private ax.Ud.e d = new ax.Ud.e();
    private byte[] e = new byte[2];

    public e() {
        this.j();
    }

    @Override
    public String c() {
        return ax.Rd.b.k;
    }

    @Override
    public float d() {
        return this.d.a();
    }

    @Override
    public b.a e() {
        return this.c;
    }

    @Override
    public b.a f(byte[] byArray, int n8, int n9) {
        int n10 = n9 + n8;
        for (n9 = n8; n9 < n10; ++n9) {
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
                byte[] byArray2 = this.e;
                byArray2[1] = byArray[n8];
                this.d.d(byArray2, 0, n11);
                continue;
            }
            this.d.d(byArray, n9 - 1, n11);
        }
        this.e[0] = byArray[n10 - 1];
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
        Arrays.fill(this.e, (byte)0);
    }
}

