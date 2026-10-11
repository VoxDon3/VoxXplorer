/*
 * Decompiled with CFR 0.152.
 */
package ax.Dd;

import ax.Nd.a;
import ax.vd.c;
import ax.vd.p;

public class b {
    private final byte[] a;
    private final byte[] b;
    private final byte[] c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final c i;

    private b(int n8, byte[] byArray, byte[] byArray2, byte[] byArray3, int n9, int n10, int n11, int n12, c c8) {
        this.a = ax.Nd.a.d(byArray);
        this.b = ax.Nd.a.d(byArray2);
        this.c = ax.Nd.a.d(byArray3);
        this.d = n9;
        this.e = n10;
        this.f = n11;
        this.g = n12;
        this.h = n8;
        this.i = c8;
    }

    public byte[] a() {
        return ax.Nd.a.d(this.c);
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.e;
    }

    public byte[] e() {
        return ax.Nd.a.d(this.a);
    }

    public byte[] f() {
        return ax.Nd.a.d(this.b);
    }

    public int g() {
        return this.h;
    }

    public int h() {
        return this.g;
    }

    public static class b {
        private byte[] a;
        private byte[] b;
        private byte[] c;
        private int d;
        private int e;
        private int f;
        private int g;
        private final int h;
        private c i = p.c0;

        public b(int n8) {
            this.h = n8;
            this.f = 1;
            this.e = 4096;
            this.d = 3;
            this.g = 19;
        }

        public b a() {
            return new b(this.h, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.i);
        }

        public b b(byte[] byArray) {
            this.c = ax.Nd.a.d(byArray);
            return this;
        }

        public b c(int n8) {
            this.d = n8;
            return this;
        }

        public b d(int n8) {
            this.e = n8;
            return this;
        }

        public b e(int n8) {
            this.f = n8;
            return this;
        }

        public b f(byte[] byArray) {
            this.a = ax.Nd.a.d(byArray);
            return this;
        }

        public b g(byte[] byArray) {
            this.b = ax.Nd.a.d(byArray);
            return this;
        }

        public b h(int n8) {
            this.g = n8;
            return this;
        }
    }
}

