/*
 * Decompiled with CFR 0.152.
 */
package ax.kb;

import ax.mb.a;
import ax.mb.b;
import ax.mb.d;

public class j
extends d {
    public int b;
    public short c;
    public short d;
    public byte e;
    public byte f;
    public byte[] g;

    @Override
    public void a(a a8) throws b {
        a8.b(4);
        this.b = a8.c();
        this.c = (short)a8.d();
        this.d = (short)a8.d();
        this.e = (byte)a8.e();
        this.f = (byte)a8.e();
        int n8 = a8.e;
        a8.a(6);
        if (this.g == null) {
            this.g = new byte[6];
        }
        a8 = a8.g(n8);
        for (n8 = 0; n8 < 6; ++n8) {
            this.g[n8] = (byte)a8.e();
        }
    }

    @Override
    public void b(a a8) throws b {
        a8.b(4);
        a8.h(this.b);
        a8.j(this.c);
        a8.j(this.d);
        a8.k(this.e);
        a8.k(this.f);
        int n8 = a8.e;
        a8.a(6);
        a8 = a8.g(n8);
        for (n8 = 0; n8 < 6; ++n8) {
            a8.k(this.g[n8]);
        }
    }
}

