/*
 * Decompiled with CFR 0.152.
 */
package ax.T0;

import ax.S0.F;
import ax.S0.a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class i {
    private static int c(ByteBuffer byteBuffer) {
        int n8 = 0;
        for (int i8 = 0; i8 < 8; ++i8) {
            byte by = byteBuffer.get();
            n8 |= (by & 0x7F) << i8 * 7;
            if ((by & 0x80) != 0) continue;
            return n8;
        }
        return n8;
    }

    private static void d(F f8) {
        int n8 = 0;
        while (true) {
            if (f8.g()) {
                if (n8 < 32) {
                    f8.r(n8);
                }
                return;
            }
            ++n8;
        }
    }

    public static List<d> e(ByteBuffer object) {
        ByteBuffer byteBuffer = ((ByteBuffer)object).asReadOnlyBuffer();
        object = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            byte by = byteBuffer.get();
            if ((by >> 2 & 1) != 0) {
                byteBuffer.get();
            }
            int n8 = (by >> 1 & 1) != 0 ? i.c(byteBuffer) : byteBuffer.remaining();
            ByteBuffer byteBuffer2 = byteBuffer.duplicate();
            byteBuffer2.limit(byteBuffer.position() + n8);
            object.add(new d(by >> 3 & 0xF, byteBuffer2));
            byteBuffer.position(byteBuffer.position() + n8);
        }
        return object;
    }

    private static void f(boolean bl) throws c {
        if (!bl) {
            return;
        }
        throw new c();
    }

    public static final class b {
        private final boolean a;

        private b(e e8, d object) throws c {
            int n8 = ((d)object).a;
            boolean bl = false;
            boolean bl2 = n8 == 6 || n8 == 3;
            ax.S0.a.a(bl2);
            byte[] byArray = new byte[Math.min(4, ((d)object).b.remaining())];
            ((d)object).b.asReadOnlyBuffer().get(byArray);
            object = new F(byArray);
            i.f(e8.a);
            if (((F)object).g()) {
                this.a = false;
                return;
            }
            n8 = ((F)object).h(2);
            bl2 = ((F)object).g();
            i.f(e8.b);
            if (!bl2) {
                this.a = true;
                return;
            }
            bl2 = n8 != 3 && n8 != 0 ? ((F)object).g() : true;
            ((F)object).q();
            i.f(e8.d ^ true);
            if (((F)object).g()) {
                i.f(e8.e ^ true);
                ((F)object).q();
            }
            i.f(e8.c);
            if (n8 != 3) {
                ((F)object).q();
            }
            ((F)object).r(e8.f);
            if (n8 != 2 && n8 != 0 && !bl2) {
                ((F)object).r(3);
            }
            n8 = n8 != 3 && n8 != 0 ? ((F)object).h(8) : 255;
            bl2 = bl;
            if (n8 != 0) {
                bl2 = true;
            }
            this.a = bl2;
        }

        public static b b(e object, d d8) {
            try {
                object = new b((e)object, d8);
                return object;
            }
            catch (c c8) {
                return null;
            }
        }

        public boolean a() {
            return this.a;
        }
    }

    private static class c
    extends Exception {
        private c() {
        }
    }

    public static final class d {
        public final int a;
        public final ByteBuffer b;

        private d(int n8, ByteBuffer byteBuffer) {
            this.a = n8;
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

        private e(d object) throws c {
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            boolean bl = ((d)object).a == 1;
            ax.S0.a.a(bl);
            byte[] byArray = new byte[((d)object).b.remaining()];
            ((d)object).b.asReadOnlyBuffer().get(byArray);
            object = new F(byArray);
            this.g = ((F)object).h(3);
            ((F)object).q();
            this.a = bl = ((F)object).g();
            if (bl) {
                n12 = ((F)object).h(5);
                this.b = false;
                this.j = false;
                n11 = 0;
                n10 = 0;
            } else {
                if (((F)object).g()) {
                    ax.T0.i$e.b((F)object);
                    this.b = bl = ((F)object).g();
                    if (bl) {
                        ((F)object).r(47);
                    }
                } else {
                    this.b = false;
                }
                this.j = ((F)object).g();
                int n13 = ((F)object).h(5);
                n11 = 0;
                n12 = 0;
                n10 = 0;
                for (n9 = 0; n9 <= n13; ++n9) {
                    int n14;
                    ((F)object).r(12);
                    if (n9 == 0) {
                        n8 = n11 = ((F)object).h(5);
                        n14 = n12;
                        if (n11 > 7) {
                            n14 = ((F)object).g() ? 1 : 0;
                            n8 = n11;
                        }
                    } else {
                        n8 = n11;
                        n14 = n12;
                        if (((F)object).h(5) > 7) {
                            ((F)object).q();
                            n14 = n12;
                            n8 = n11;
                        }
                    }
                    if (this.b) {
                        ((F)object).q();
                    }
                    int n15 = n10;
                    if (this.j) {
                        n15 = n10;
                        if (((F)object).g()) {
                            if (n9 == 0) {
                                n15 = ((F)object).h(4);
                            } else {
                                ((F)object).r(4);
                                n15 = n10;
                            }
                        }
                    }
                    n11 = n8;
                    n12 = n14;
                    n10 = n15;
                }
                n8 = n11;
                n11 = n12;
                n12 = n8;
            }
            n9 = ((F)object).h(4);
            n8 = ((F)object).h(4);
            ((F)object).r(n9 + 1);
            ((F)object).r(n8 + 1);
            this.c = !this.a ? ((F)object).g() : false;
            if (this.c) {
                ((F)object).r(4);
                ((F)object).r(3);
            }
            ((F)object).r(3);
            if (this.a) {
                this.e = true;
                this.d = true;
                this.f = 0;
            } else {
                ((F)object).r(4);
                bl = ((F)object).g();
                if (bl) {
                    ((F)object).r(2);
                }
                this.d = ((F)object).g() ? true : ((F)object).g();
                this.e = this.d ? (((F)object).g() ? true : ((F)object).g()) : true;
                this.f = bl ? ((F)object).h(3) + 1 : 0;
            }
            this.h = n12;
            this.i = n11;
            this.k = n10;
            ((F)object).r(3);
            this.l = bl = ((F)object).g();
            this.m = this.g == 2 && bl ? ((F)object).g() : false;
            this.n = this.g != 1 ? ((F)object).g() : false;
            if (((F)object).g()) {
                this.r = (byte)((F)object).h(8);
                this.s = (byte)((F)object).h(8);
                this.t = (byte)((F)object).h(8);
            } else {
                this.r = 0;
                this.s = 0;
                this.t = 0;
            }
            if (this.n) {
                ((F)object).q();
                this.o = false;
                this.p = false;
                this.q = 0;
            } else if (this.r == 1 && this.s == 13 && this.t == 0) {
                this.o = false;
                this.p = false;
                this.q = 0;
            } else {
                ((F)object).q();
                n10 = this.g;
                if (n10 == 0) {
                    this.o = true;
                    this.p = true;
                } else if (n10 == 1) {
                    this.o = false;
                    this.p = false;
                } else if (this.m) {
                    this.o = bl = ((F)object).g();
                    this.p = bl ? ((F)object).g() : false;
                } else {
                    this.o = true;
                    this.p = false;
                }
                this.q = this.o && this.p ? ((F)object).h(2) : 0;
            }
            ((F)object).q();
        }

        public static e a(d object) {
            try {
                object = new e((d)object);
                return object;
            }
            catch (c c8) {
                return null;
            }
        }

        private static void b(F f8) {
            f8.r(64);
            if (f8.g()) {
                ax.T0.i.d(f8);
            }
        }
    }
}

