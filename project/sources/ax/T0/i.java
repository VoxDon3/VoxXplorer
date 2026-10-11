package ax.T0;

import ax.S0.C0968a;
import ax.S0.F;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    public static final class b {
        private final boolean a;

        private b(e eVar, d dVar) throws c {
            int i = dVar.a;
            C0968a.a(i == 6 || i == 3);
            byte[] bArr = new byte[Math.min(4, dVar.b.remaining())];
            dVar.b.asReadOnlyBuffer().get(bArr);
            F f = new F(bArr);
            i.f(eVar.a);
            if (f.g()) {
                this.a = false;
                return;
            }
            int h = f.h(2);
            boolean g = f.g();
            i.f(eVar.b);
            if (!g) {
                this.a = true;
                return;
            }
            boolean g2 = (h == 3 || h == 0) ? true : f.g();
            f.q();
            i.f(!eVar.d);
            if (f.g()) {
                i.f(!eVar.e);
                f.q();
            }
            i.f(eVar.c);
            if (h != 3) {
                f.q();
            }
            f.r(eVar.f);
            if (h != 2 && h != 0 && !g2) {
                f.r(3);
            }
            this.a = ((h == 3 || h == 0) ? 255 : f.h(8)) != 0;
        }

        public static b b(e eVar, d dVar) {
            try {
                return new b(eVar, dVar);
            } catch (c unused) {
                return null;
            }
        }

        public boolean a() {
            return this.a;
        }
    }

    private static class c extends Exception {
        private c() {
        }
    }

    public static final class d {
        public final int a;
        public final ByteBuffer b;

        private d(int i, ByteBuffer byteBuffer) {
            this.a = i;
            this.b = byteBuffer;
        }
    }

    public static final class e {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final boolean j;
        public final int k;
        public final boolean l;
        public final boolean m;
        public final boolean n;
        public final boolean o;
        public final boolean p;
        public final int q;
        public final byte r;
        public final byte s;
        public final byte t;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v4, types: [int] */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6 */
        private e(d dVar) throws c {
            int i;
            int i2;
            boolean z;
            ?? r8;
            C0968a.a(dVar.a == 1);
            byte[] bArr = new byte[dVar.b.remaining()];
            dVar.b.asReadOnlyBuffer().get(bArr);
            F f = new F(bArr);
            this.g = f.h(3);
            f.q();
            boolean g = f.g();
            this.a = g;
            if (g) {
                i2 = f.h(5);
                this.b = false;
                this.j = false;
                r8 = 0;
                i = 0;
            } else {
                if (f.g()) {
                    b(f);
                    boolean g2 = f.g();
                    this.b = g2;
                    if (g2) {
                        f.r(47);
                    }
                } else {
                    this.b = false;
                }
                this.j = f.g();
                int h = f.h(5);
                int i3 = 0;
                int i4 = 0;
                boolean z2 = false;
                i = 0;
                while (i4 <= h) {
                    f.r(12);
                    if (i4 == 0) {
                        i3 = f.h(5);
                        z = z2;
                        if (i3 > 7) {
                            z = f.g();
                        }
                    } else {
                        z = z2;
                        if (f.h(5) > 7) {
                            f.q();
                            z = z2;
                        }
                    }
                    if (this.b) {
                        f.q();
                    }
                    if (this.j && f.g()) {
                        if (i4 == 0) {
                            i = f.h(4);
                        } else {
                            f.r(4);
                        }
                    }
                    i4++;
                    z2 = z;
                }
                i2 = i3;
                r8 = z2;
            }
            int h2 = f.h(4);
            int h3 = f.h(4);
            f.r(h2 + 1);
            f.r(h3 + 1);
            if (this.a) {
                this.c = false;
            } else {
                this.c = f.g();
            }
            if (this.c) {
                f.r(4);
                f.r(3);
            }
            f.r(3);
            if (this.a) {
                this.e = true;
                this.d = true;
                this.f = 0;
            } else {
                f.r(4);
                boolean g3 = f.g();
                if (g3) {
                    f.r(2);
                }
                if (f.g()) {
                    this.d = true;
                } else {
                    this.d = f.g();
                }
                if (!this.d) {
                    this.e = true;
                } else if (f.g()) {
                    this.e = true;
                } else {
                    this.e = f.g();
                }
                if (g3) {
                    this.f = f.h(3) + 1;
                } else {
                    this.f = 0;
                }
            }
            this.h = i2;
            this.i = r8;
            this.k = i;
            f.r(3);
            boolean g4 = f.g();
            this.l = g4;
            if (this.g == 2 && g4) {
                this.m = f.g();
            } else {
                this.m = false;
            }
            if (this.g != 1) {
                this.n = f.g();
            } else {
                this.n = false;
            }
            if (f.g()) {
                this.r = (byte) f.h(8);
                this.s = (byte) f.h(8);
                this.t = (byte) f.h(8);
            } else {
                this.r = (byte) 0;
                this.s = (byte) 0;
                this.t = (byte) 0;
            }
            if (this.n) {
                f.q();
                this.o = false;
                this.p = false;
                this.q = 0;
            } else if (this.r == 1 && this.s == 13 && this.t == 0) {
                this.o = false;
                this.p = false;
                this.q = 0;
            } else {
                f.q();
                int i5 = this.g;
                if (i5 == 0) {
                    this.o = true;
                    this.p = true;
                } else if (i5 == 1) {
                    this.o = false;
                    this.p = false;
                } else if (this.m) {
                    boolean g5 = f.g();
                    this.o = g5;
                    if (g5) {
                        this.p = f.g();
                    } else {
                        this.p = false;
                    }
                } else {
                    this.o = true;
                    this.p = false;
                }
                if (this.o && this.p) {
                    this.q = f.h(2);
                } else {
                    this.q = 0;
                }
            }
            f.q();
        }

        public static e a(d dVar) {
            try {
                return new e(dVar);
            } catch (c unused) {
                return null;
            }
        }

        private static void b(F f) {
            f.r(64);
            if (f.g()) {
                i.d(f);
            }
        }
    }

    private static int c(ByteBuffer byteBuffer) {
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            byte b2 = byteBuffer.get();
            i |= (b2 & Byte.MAX_VALUE) << (i2 * 7);
            if ((b2 & 128) == 0) {
                return i;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(F f) {
        int i = 0;
        while (!f.g()) {
            i++;
        }
        if (i < 32) {
            f.r(i);
        }
    }

    public static List<d> e(ByteBuffer byteBuffer) {
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            byte b2 = asReadOnlyBuffer.get();
            int i = (b2 >> 3) & 15;
            if (((b2 >> 2) & 1) != 0) {
                asReadOnlyBuffer.get();
            }
            int c2 = ((b2 >> 1) & 1) != 0 ? c(asReadOnlyBuffer) : asReadOnlyBuffer.remaining();
            ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
            duplicate.limit(asReadOnlyBuffer.position() + c2);
            arrayList.add(new d(i, duplicate));
            asReadOnlyBuffer.position(asReadOnlyBuffer.position() + c2);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(boolean z) throws c {
        if (z) {
            throw new c();
        }
    }
}
