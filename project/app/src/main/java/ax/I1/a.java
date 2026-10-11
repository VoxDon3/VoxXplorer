/*
 * Decompiled with CFR 0.152.
 */
package ax.I1;

import ax.I1.c;
import ax.I1.g;
import ax.P0.E;
import ax.q1.s;
import java.io.IOException;
import java.util.ArrayDeque;

final class a
implements c {
    private final byte[] a = new byte[8];
    private final ArrayDeque<b> b = new ArrayDeque();
    private final g c = new g();
    private ax.I1.b d;
    private int e;
    private int f;
    private long g;

    private long d(s s8) throws IOException {
        s8.m();
        while (true) {
            int n8;
            s8.p(this.a, 0, 4);
            int n9 = ax.I1.g.c(this.a[0]);
            if (n9 != -1 && n9 <= 4 && this.d.c(n8 = (int)ax.I1.g.a(this.a, n9, false))) {
                s8.n(n9);
                return n8;
            }
            s8.n(1);
        }
    }

    private double e(s s8, int n8) throws IOException {
        long l8 = this.f(s8, n8);
        if (n8 == 4) {
            return Float.intBitsToFloat((int)l8);
        }
        return Double.longBitsToDouble(l8);
    }

    private long f(s s8, int n8) throws IOException {
        byte[] byArray = this.a;
        s8.readFully(byArray, 0, n8);
        long l8 = 0L;
        for (int i8 = 0; i8 < n8; ++i8) {
            l8 = l8 << 8 | (long)(this.a[i8] & 0xFF);
        }
        return l8;
    }

    private static String g(s s8, int n8) throws IOException {
        if (n8 == 0) {
            return "";
        }
        byte[] byArray = new byte[n8];
        s8.readFully(byArray, 0, n8);
        while (n8 > 0 && byArray[n8 - 1] == 0) {
            --n8;
        }
        return new String(byArray, 0, n8);
    }

    @Override
    public void a() {
        this.e = 0;
        this.b.clear();
        this.c.e();
    }

    @Override
    public boolean b(s object) throws IOException {
        ax.S0.a.i(this.d);
        while (true) {
            int n8;
            long l8;
            long l9;
            b b8;
            if ((b8 = this.b.peek()) != null && object.getPosition() >= b8.b) {
                this.d.a(this.b.pop().a);
                return true;
            }
            if (this.e == 0) {
                l8 = l9 = this.c.d((s)object, true, false, 4);
                if (l9 == -2L) {
                    l8 = this.d((s)object);
                }
                if (l8 == -1L) {
                    return false;
                }
                this.f = (int)l8;
                this.e = 1;
            }
            if (this.e == 1) {
                this.g = this.c.d((s)object, false, true, 8);
                this.e = 2;
            }
            if ((n8 = this.d.b(this.f)) != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) {
                            if (n8 != 4) {
                                if (n8 == 5) {
                                    l8 = this.g;
                                    if (l8 != 4L && l8 != 8L) {
                                        object = new StringBuilder();
                                        ((StringBuilder)object).append("Invalid float size: ");
                                        ((StringBuilder)object).append(this.g);
                                        throw E.a(((StringBuilder)object).toString(), null);
                                    }
                                    this.d.e(this.f, this.e((s)object, (int)l8));
                                    this.e = 0;
                                    return true;
                                }
                                object = new StringBuilder();
                                ((StringBuilder)object).append("Invalid element type ");
                                ((StringBuilder)object).append(n8);
                                throw E.a(((StringBuilder)object).toString(), null);
                            }
                            this.d.f(this.f, (int)this.g, (s)object);
                            this.e = 0;
                            return true;
                        }
                        l8 = this.g;
                        if (l8 <= Integer.MAX_VALUE) {
                            this.d.d(this.f, ax.I1.a.g((s)object, (int)l8));
                            this.e = 0;
                            return true;
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append("String element size: ");
                        ((StringBuilder)object).append(this.g);
                        throw E.a(((StringBuilder)object).toString(), null);
                    }
                    l8 = this.g;
                    if (l8 <= 8L) {
                        this.d.h(this.f, this.f((s)object, (int)l8));
                        this.e = 0;
                        return true;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Invalid integer size: ");
                    ((StringBuilder)object).append(this.g);
                    throw E.a(((StringBuilder)object).toString(), null);
                }
                l8 = object.getPosition();
                l9 = this.g;
                this.b.push(new b(this.f, l9 + l8));
                this.d.g(this.f, l8, this.g);
                this.e = 0;
                return true;
            }
            object.n((int)this.g);
            this.e = 0;
        }
    }

    @Override
    public void c(ax.I1.b b8) {
        this.d = b8;
    }

    private static final class b {
        private final int a;
        private final long b;

        private b(int n8, long l8) {
            this.a = n8;
            this.b = l8;
        }
    }
}

