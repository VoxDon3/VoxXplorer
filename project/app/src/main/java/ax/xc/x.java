/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.Gb.g;
import ax.Gb.l;
import ax.tb.i;
import ax.xc.y;
import java.util.Arrays;

public final class x {
    public static final a h = new a(null);
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public x f;
    public x g;

    public x() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public x(byte[] byArray, int n8, int n9, boolean bl, boolean bl2) {
        l.f(byArray, "data");
        this.a = byArray;
        this.b = n8;
        this.c = n9;
        this.d = bl;
        this.e = bl2;
    }

    public final void a() {
        block5: {
            int n8;
            x x8;
            block7: {
                block6: {
                    int n9;
                    x8 = this.g;
                    if (x8 == this) break block5;
                    l.c(x8);
                    if (!x8.e) break block6;
                    n8 = this.c - this.b;
                    x8 = this.g;
                    l.c(x8);
                    int n10 = x8.c;
                    x8 = this.g;
                    l.c(x8);
                    if (x8.d) {
                        n9 = 0;
                    } else {
                        x8 = this.g;
                        l.c(x8);
                        n9 = x8.b;
                    }
                    if (n8 <= 8192 - n10 + n9) break block7;
                }
                return;
            }
            x8 = this.g;
            l.c(x8);
            this.g(x8, n8);
            this.b();
            y.b(this);
            return;
        }
        throw new IllegalStateException("cannot compact");
    }

    public final x b() {
        x x8 = this.f;
        if (x8 == this) {
            x8 = null;
        }
        x x9 = this.g;
        l.c(x9);
        x9.f = this.f;
        x9 = this.f;
        l.c(x9);
        x9.g = this.g;
        this.f = null;
        this.g = null;
        return x8;
    }

    public final x c(x x8) {
        l.f(x8, "segment");
        x8.g = this;
        x8.f = this.f;
        x x9 = this.f;
        l.c(x9);
        x9.g = x8;
        this.f = x8;
        return x8;
    }

    public final x d() {
        this.d = true;
        return new x(this.a, this.b, this.c, true, false);
    }

    public final x e(int n8) {
        if (n8 > 0 && n8 <= this.c - this.b) {
            Object object;
            x x8;
            if (n8 >= 1024) {
                x8 = this.d();
            } else {
                x8 = y.c();
                byte[] byArray = this.a;
                object = x8.a;
                int n9 = this.b;
                i.h(byArray, (byte[])object, 0, n9, n9 + n8, 2, null);
            }
            x8.c = x8.b + n8;
            this.b += n8;
            object = this.g;
            l.c(object);
            ((x)object).c(x8);
            return x8;
        }
        throw new IllegalArgumentException("byteCount out of range");
    }

    public final x f() {
        byte[] byArray = this.a;
        byArray = Arrays.copyOf(byArray, byArray.length);
        l.e(byArray, "copyOf(this, size)");
        return new x(byArray, this.b, this.c, false, true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void g(x x8, int n8) {
        byte[] byArray;
        int n9;
        l.f(x8, "sink");
        if (!x8.e) throw new IllegalStateException("only owner can write");
        int n10 = x8.c;
        if (n10 + n8 > 8192) {
            if (x8.d) throw new IllegalArgumentException();
            n9 = x8.b;
            if (n10 + n8 - n9 > 8192) throw new IllegalArgumentException();
            byArray = x8.a;
            i.h(byArray, byArray, 0, n9, n10, 2, null);
            x8.c -= x8.b;
            x8.b = 0;
        }
        byArray = this.a;
        byte[] byArray2 = x8.a;
        n10 = x8.c;
        n9 = this.b;
        i.d(byArray, byArray2, n10, n9, n9 + n8);
        x8.c += n8;
        this.b += n8;
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }
}

