package ax.L1;

import ax.S0.C0968a;
import ax.S0.G;
import ax.q1.C2860u;
import ax.q1.InterfaceC2858s;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class e {
    private final f a = new f();
    private final G b = new G(new byte[65025], 0);
    private int c = -1;
    private int d;
    private boolean e;

    e() {
    }

    private int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            f fVar = this.a;
            if (i5 >= fVar.g) {
                break;
            }
            int[] iArr = fVar.j;
            this.d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public f b() {
        return this.a;
    }

    public G c() {
        return this.b;
    }

    public boolean d(InterfaceC2858s interfaceC2858s) throws IOException {
        int i;
        C0968a.g(interfaceC2858s != null);
        if (this.e) {
            this.e = false;
            this.b.X(0);
        }
        while (!this.e) {
            if (this.c < 0) {
                if (!this.a.c(interfaceC2858s) || !this.a.a(interfaceC2858s, true)) {
                    return false;
                }
                f fVar = this.a;
                int i2 = fVar.h;
                if ((fVar.b & 1) == 1 && this.b.j() == 0) {
                    i2 += a(0);
                    i = this.d;
                } else {
                    i = 0;
                }
                if (!C2860u.f(interfaceC2858s, i2)) {
                    return false;
                }
                this.c = i;
            }
            int a = a(this.c);
            int i3 = this.c + this.d;
            if (a > 0) {
                G g = this.b;
                g.d(g.j() + a);
                if (!C2860u.e(interfaceC2858s, this.b.f(), this.b.j(), a)) {
                    return false;
                }
                G g2 = this.b;
                g2.a0(g2.j() + a);
                this.e = this.a.j[i3 + (-1)] != 255;
            }
            if (i3 == this.a.g) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }

    public void e() {
        this.a.b();
        this.b.X(0);
        this.c = -1;
        this.e = false;
    }

    public void f() {
        if (this.b.f().length == 65025) {
            return;
        }
        G g = this.b;
        g.Z(Arrays.copyOf(g.f(), Math.max(65025, this.b.j())), this.b.j());
    }
}
