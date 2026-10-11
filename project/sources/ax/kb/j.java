package ax.kb;

import ax.mb.AbstractC2550d;
import ax.mb.C2547a;
import ax.mb.C2548b;

/* loaded from: classes3.dex */
public class j extends AbstractC2550d {
    public int b;
    public short c;
    public short d;
    public byte e;
    public byte f;
    public byte[] g;

    @Override // ax.mb.AbstractC2550d
    public void a(C2547a c2547a) throws C2548b {
        c2547a.b(4);
        this.b = c2547a.c();
        this.c = (short) c2547a.d();
        this.d = (short) c2547a.d();
        this.e = (byte) c2547a.e();
        this.f = (byte) c2547a.e();
        int i = c2547a.e;
        c2547a.a(6);
        if (this.g == null) {
            this.g = new byte[6];
        }
        C2547a g = c2547a.g(i);
        for (int i2 = 0; i2 < 6; i2++) {
            this.g[i2] = (byte) g.e();
        }
    }

    @Override // ax.mb.AbstractC2550d
    public void b(C2547a c2547a) throws C2548b {
        c2547a.b(4);
        c2547a.h(this.b);
        c2547a.j(this.c);
        c2547a.j(this.d);
        c2547a.k(this.e);
        c2547a.k(this.f);
        int i = c2547a.e;
        c2547a.a(6);
        C2547a g = c2547a.g(i);
        for (int i2 = 0; i2 < 6; i2++) {
            g.k(this.g[i2]);
        }
    }
}
