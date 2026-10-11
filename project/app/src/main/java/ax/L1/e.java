/*
 * Decompiled with CFR 0.152.
 */
package ax.L1;

import ax.L1.f;
import ax.S0.G;
import ax.S0.a;
import ax.q1.s;
import ax.q1.u;
import java.io.IOException;
import java.util.Arrays;

final class e {
    private final f a = new f();
    private final G b = new G(new byte[65025], 0);
    private int c = -1;
    private int d;
    private boolean e;

    e() {
    }

    private int a(int n8) {
        int n9;
        Object object;
        int n10 = 0;
        this.d = 0;
        do {
            object = this.d;
            Object object2 = this.a;
            n9 = n10;
            if (n8 + object >= ((f)object2).g) break;
            object2 = ((f)object2).j;
            this.d = object + 1;
            object = object2[object + n8];
            n10 = n9 = n10 + object;
        } while (object == 255);
        return n9;
    }

    public f b() {
        return this.a;
    }

    public G c() {
        return this.b;
    }

    public boolean d(s s8) throws IOException {
        boolean bl = s8 != null;
        ax.S0.a.g(bl);
        if (this.e) {
            this.e = false;
            this.b.X(0);
        }
        while (!this.e) {
            int n8;
            int n9;
            Object object;
            if (this.c < 0) {
                if (this.a.c(s8) && this.a.a(s8, true)) {
                    object = this.a;
                    n9 = ((f)object).h;
                    if ((((f)object).b & 1) == 1 && this.b.j() == 0) {
                        n9 += this.a(0);
                        n8 = this.d;
                    } else {
                        n8 = 0;
                    }
                    if (!u.f(s8, n9)) {
                        return false;
                    }
                    this.c = n8;
                } else {
                    return false;
                }
            }
            n9 = this.a(this.c);
            n8 = this.c + this.d;
            if (n9 > 0) {
                object = this.b;
                ((G)object).d(((G)object).j() + n9);
                if (!u.e(s8, this.b.f(), this.b.j(), n9)) {
                    return false;
                }
                object = this.b;
                ((G)object).a0(((G)object).j() + n9);
                bl = this.a.j[n8 - 1] != 255;
                this.e = bl;
            }
            n9 = n8;
            if (n8 == this.a.g) {
                n9 = -1;
            }
            this.c = n9;
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
        G g8 = this.b;
        g8.Z(Arrays.copyOf(g8.f(), Math.max(65025, this.b.j())), this.b.j());
    }
}

