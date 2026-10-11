package ax.q1;

import ax.S0.C0968a;
import ax.q1.U;
import java.io.IOException;

/* loaded from: classes.dex */
public final class V {
    private final byte[] a = new byte[10];
    private boolean b;
    private int c;
    private long d;
    private int e;
    private int f;
    private int g;

    public void a(U u, U.a aVar) {
        if (this.c > 0) {
            u.f(this.d, this.e, this.f, this.g, aVar);
            this.c = 0;
        }
    }

    public void b() {
        this.b = false;
        this.c = 0;
    }

    public void c(U u, long j, int i, int i2, int i3, U.a aVar) {
        C0968a.h(this.g <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(u, aVar);
            }
        }
    }

    public void d(InterfaceC2858s interfaceC2858s) throws IOException {
        if (this.b) {
            return;
        }
        interfaceC2858s.p(this.a, 0, 10);
        interfaceC2858s.m();
        if (C2842b.j(this.a) == 0) {
            return;
        }
        this.b = true;
    }
}
