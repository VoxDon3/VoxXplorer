package ax.I1;

import ax.P0.E;
import ax.S0.C0968a;
import ax.q1.InterfaceC2858s;
import java.io.IOException;
import java.util.ArrayDeque;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
final class a implements c {
    private final byte[] a = new byte[8];
    private final ArrayDeque<b> b = new ArrayDeque<>();
    private final g c = new g();
    private ax.I1.b d;
    private int e;
    private int f;
    private long g;

    private static final class b {
        private final int a;
        private final long b;

        private b(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    private long d(InterfaceC2858s interfaceC2858s) throws IOException {
        interfaceC2858s.m();
        while (true) {
            interfaceC2858s.p(this.a, 0, 4);
            int c = g.c(this.a[0]);
            if (c != -1 && c <= 4) {
                int a = (int) g.a(this.a, c, false);
                if (this.d.c(a)) {
                    interfaceC2858s.n(c);
                    return a;
                }
            }
            interfaceC2858s.n(1);
        }
    }

    private double e(InterfaceC2858s interfaceC2858s, int i) throws IOException {
        return i == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(f(interfaceC2858s, i));
    }

    private long f(InterfaceC2858s interfaceC2858s, int i) throws IOException {
        interfaceC2858s.readFully(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.a[i2] & 255);
        }
        return j;
    }

    private static String g(InterfaceC2858s interfaceC2858s, int i) throws IOException {
        if (i == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        byte[] bArr = new byte[i];
        interfaceC2858s.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override // ax.I1.c
    public void a() {
        this.e = 0;
        this.b.clear();
        this.c.e();
    }

    @Override // ax.I1.c
    public boolean b(InterfaceC2858s interfaceC2858s) throws IOException {
        C0968a.i(this.d);
        while (true) {
            b peek = this.b.peek();
            if (peek != null && interfaceC2858s.getPosition() >= peek.b) {
                this.d.a(this.b.pop().a);
                return true;
            }
            if (this.e == 0) {
                long d = this.c.d(interfaceC2858s, true, false, 4);
                if (d == -2) {
                    d = d(interfaceC2858s);
                }
                if (d == -1) {
                    return false;
                }
                this.f = (int) d;
                this.e = 1;
            }
            if (this.e == 1) {
                this.g = this.c.d(interfaceC2858s, false, true, 8);
                this.e = 2;
            }
            int b2 = this.d.b(this.f);
            if (b2 != 0) {
                if (b2 == 1) {
                    long position = interfaceC2858s.getPosition();
                    this.b.push(new b(this.f, this.g + position));
                    this.d.g(this.f, position, this.g);
                    this.e = 0;
                    return true;
                }
                if (b2 == 2) {
                    long j = this.g;
                    if (j <= 8) {
                        this.d.h(this.f, f(interfaceC2858s, (int) j));
                        this.e = 0;
                        return true;
                    }
                    throw E.a("Invalid integer size: " + this.g, null);
                }
                if (b2 == 3) {
                    long j2 = this.g;
                    if (j2 <= 2147483647L) {
                        this.d.d(this.f, g(interfaceC2858s, (int) j2));
                        this.e = 0;
                        return true;
                    }
                    throw E.a("String element size: " + this.g, null);
                }
                if (b2 == 4) {
                    this.d.f(this.f, (int) this.g, interfaceC2858s);
                    this.e = 0;
                    return true;
                }
                if (b2 != 5) {
                    throw E.a("Invalid element type " + b2, null);
                }
                long j3 = this.g;
                if (j3 == 4 || j3 == 8) {
                    this.d.e(this.f, e(interfaceC2858s, (int) j3));
                    this.e = 0;
                    return true;
                }
                throw E.a("Invalid float size: " + this.g, null);
            }
            interfaceC2858s.n((int) this.g);
            this.e = 0;
        }
    }

    @Override // ax.I1.c
    public void c(ax.I1.b bVar) {
        this.d = bVar;
    }
}
