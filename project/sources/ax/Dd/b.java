package ax.Dd;

import ax.vd.EnumC3319p;
import ax.vd.InterfaceC3306c;

/* loaded from: classes3.dex */
public class b {
    private final byte[] a;
    private final byte[] b;
    private final byte[] c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final InterfaceC3306c i;

    /* renamed from: ax.Dd.b$b, reason: collision with other inner class name */
    public static class C0072b {
        private byte[] a;
        private byte[] b;
        private byte[] c;
        private final int h;
        private InterfaceC3306c i = EnumC3319p.c0;
        private int f = 1;
        private int e = 4096;
        private int d = 3;
        private int g = 19;

        public C0072b(int i) {
            this.h = i;
        }

        public b a() {
            return new b(this.h, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.i);
        }

        public C0072b b(byte[] bArr) {
            this.c = ax.Nd.a.d(bArr);
            return this;
        }

        public C0072b c(int i) {
            this.d = i;
            return this;
        }

        public C0072b d(int i) {
            this.e = i;
            return this;
        }

        public C0072b e(int i) {
            this.f = i;
            return this;
        }

        public C0072b f(byte[] bArr) {
            this.a = ax.Nd.a.d(bArr);
            return this;
        }

        public C0072b g(byte[] bArr) {
            this.b = ax.Nd.a.d(bArr);
            return this;
        }

        public C0072b h(int i) {
            this.g = i;
            return this;
        }
    }

    private b(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, int i3, int i4, int i5, InterfaceC3306c interfaceC3306c) {
        this.a = ax.Nd.a.d(bArr);
        this.b = ax.Nd.a.d(bArr2);
        this.c = ax.Nd.a.d(bArr3);
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i;
        this.i = interfaceC3306c;
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
}
