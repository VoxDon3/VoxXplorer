package ax.X1;

import ax.S0.d0;
import ax.X1.L;
import ax.q1.InterfaceC2859t;

/* loaded from: classes.dex */
public final class E implements L {
    private final D a;
    private final ax.S0.G b = new ax.S0.G(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public E(D d) {
        this.a = d;
    }

    @Override // ax.X1.L
    public void a(ax.S0.M m, InterfaceC2859t interfaceC2859t, L.d dVar) {
        this.a.a(m, interfaceC2859t, dVar);
        this.f = true;
    }

    @Override // ax.X1.L
    public void b() {
        this.f = true;
    }

    @Override // ax.X1.L
    public void c(ax.S0.G g, int i) {
        boolean z = (i & 1) != 0;
        int g2 = z ? g.g() + g.M() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            g.b0(g2);
            this.d = 0;
        }
        while (g.a() > 0) {
            int i2 = this.d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int M = g.M();
                    g.b0(g.g() - 1);
                    if (M == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(g.a(), 3 - this.d);
                g.q(this.b.f(), this.d, min);
                int i3 = this.d + min;
                this.d = i3;
                if (i3 == 3) {
                    this.b.b0(0);
                    this.b.a0(3);
                    this.b.c0(1);
                    int M2 = this.b.M();
                    int M3 = this.b.M();
                    this.e = (M2 & 128) != 0;
                    this.c = (((M2 & 15) << 8) | M3) + 3;
                    int b = this.b.b();
                    int i4 = this.c;
                    if (b < i4) {
                        this.b.d(Math.min(4098, Math.max(i4, this.b.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(g.a(), this.c - this.d);
                g.q(this.b.f(), this.d, min2);
                int i5 = this.d + min2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        this.b.a0(i6);
                    } else {
                        if (d0.x(this.b.f(), 0, this.c, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        this.b.a0(this.c - 4);
                    }
                    this.b.b0(0);
                    this.a.c(this.b);
                    this.d = 0;
                }
            }
        }
    }
}
