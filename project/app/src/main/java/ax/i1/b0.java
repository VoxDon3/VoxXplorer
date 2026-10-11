/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import ax.P0.k;
import ax.S0.G;
import ax.S0.d0;
import ax.V0.c;
import ax.V0.i;
import ax.i1.d0;
import ax.m1.b;
import ax.q1.U;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

class b0 {
    private final b a;
    private final int b;
    private final G c;
    private a d;
    private a e;
    private a f;
    private long g;

    public b0(b object) {
        int n8;
        this.a = object;
        this.b = n8 = object.e();
        this.c = new G(32);
        this.d = object = new a(0L, n8);
        this.e = object;
        this.f = object;
    }

    private void a(a a8) {
        if (a8.c == null) {
            return;
        }
        this.a.d(a8);
        a8.b();
    }

    private static a d(a a8, long l8) {
        while (l8 >= a8.b) {
            a8 = a8.d;
        }
        return a8;
    }

    private void g(int n8) {
        long l8;
        this.g = l8 = this.g + (long)n8;
        a a8 = this.f;
        if (l8 == a8.b) {
            this.f = a8.d;
        }
    }

    private int h(int n8) {
        a a8 = this.f;
        if (a8.c == null) {
            a8.c(this.a.b(), new a(this.f.b, this.b));
        }
        return Math.min(n8, (int)(this.f.b - this.g));
    }

    private static a i(a a8, long l8, ByteBuffer byteBuffer, int n8) {
        a8 = b0.d(a8, l8);
        while (n8 > 0) {
            long l9;
            int n9 = Math.min(n8, (int)(a8.b - l8));
            byteBuffer.put(a8.c.a, a8.e(l8), n9);
            int n10 = n8 - n9;
            l8 = l9 = l8 + (long)n9;
            n8 = n10;
            if (l9 != a8.b) continue;
            a8 = a8.d;
            l8 = l9;
            n8 = n10;
        }
        return a8;
    }

    private static a j(a a8, long l8, byte[] byArray, int n8) {
        a8 = b0.d(a8, l8);
        int n9 = n8;
        while (n9 > 0) {
            int n10 = Math.min(n9, (int)(a8.b - l8));
            System.arraycopy(a8.c.a, a8.e(l8), byArray, n8 - n9, n10);
            int n11 = n9 - n10;
            long l9 = l8 + (long)n10;
            n9 = n11;
            l8 = l9;
            if (l9 != a8.b) continue;
            a8 = a8.d;
            n9 = n11;
            l8 = l9;
        }
        return a8;
    }

    private static a k(a object, i object2, d0.b b8, G object3) {
        long l8;
        Object object4;
        c c8;
        int n8;
        int n9;
        int n10;
        Object[] objectArray;
        long l9;
        block19: {
            block18: {
                block17: {
                    block16: {
                        l9 = b8.b;
                        ((G)object3).X(1);
                        object = b0.j((a)object, l9, ((G)object3).f(), 1);
                        ++l9;
                        objectArray = ((G)object3).f();
                        n10 = 0;
                        n9 = objectArray[0];
                        n8 = (n9 & 0x80) != 0 ? 1 : 0;
                        n9 &= 0x7F;
                        c8 = ((i)object2).d0;
                        object2 = c8.a;
                        if (object2 == null) {
                            c8.a = new byte[16];
                        } else {
                            Arrays.fill((byte[])object2, (byte)0);
                        }
                        object = b0.j((a)object, l9, c8.a, n9);
                        l9 += (long)n9;
                        if (n8 != 0) {
                            ((G)object3).X(2);
                            object = b0.j((a)object, l9, ((G)object3).f(), 2);
                            l9 += 2L;
                            n9 = ((G)object3).U();
                        } else {
                            n9 = 1;
                        }
                        objectArray = c8.d;
                        if (objectArray == null) break block16;
                        object2 = objectArray;
                        if (objectArray.length >= n9) break block17;
                    }
                    object2 = new int[n9];
                }
                object4 = c8.e;
                if (object4 == null) break block18;
                objectArray = (Object[])object4;
                if (((int[])object4).length >= n9) break block19;
            }
            objectArray = new int[n9];
        }
        if (n8 != 0) {
            n8 = n9 * 6;
            ((G)object3).X(n8);
            object4 = b0.j((a)object, l9, ((G)object3).f(), n8);
            l8 = l9 + (long)n8;
            ((G)object3).b0(0);
            n8 = n10;
            while (true) {
                l9 = l8;
                object = object4;
                if (n8 < n9) {
                    object2[n8] = ((G)object3).U();
                    objectArray[n8] = ((G)object3).Q();
                    ++n8;
                    continue;
                }
                break;
            }
        } else {
            object2[0] = false;
            objectArray[0] = b8.a - (int)(l9 - b8.b);
        }
        object3 = d0.i(b8.c);
        c8.c(n9, (int[])object2, (int[])objectArray, ((U.a)object3).b, c8.a, ((U.a)object3).a, ((U.a)object3).c, ((U.a)object3).d);
        l8 = b8.b;
        n8 = (int)(l9 - l8);
        b8.b = l8 + (long)n8;
        b8.a -= n8;
        return object;
    }

    private static a l(a a8, i i8, d0.b b8, G g8) {
        a a9 = a8;
        if (i8.E()) {
            a9 = b0.k(a8, i8, b8, g8);
        }
        if (i8.r()) {
            g8.X(4);
            a8 = b0.j(a9, b8.b, g8.f(), 4);
            int n8 = g8.Q();
            b8.b += 4L;
            b8.a -= 4;
            i8.C(n8);
            a8 = b0.i(a8, b8.b, i8.e0, n8);
            b8.b += (long)n8;
            b8.a = n8 = b8.a - n8;
            i8.G(n8);
            return b0.i(a8, b8.b, i8.h0, b8.a);
        }
        i8.C(b8.a);
        return b0.i(a9, b8.b, i8.e0, b8.a);
    }

    public void b(long l8) {
        if (l8 != -1L) {
            a a8;
            while (true) {
                a8 = this.d;
                if (l8 < a8.b) break;
                this.a.a(a8.c);
                this.d = this.d.b();
            }
            if (this.e.a < a8.a) {
                this.e = a8;
            }
        }
    }

    public void c(long l8) {
        a a8;
        boolean bl = l8 <= this.g;
        ax.S0.a.a(bl);
        this.g = l8;
        if (l8 != 0L) {
            a a9;
            a8 = a9 = this.d;
            if (l8 != a9.a) {
                a a10;
                while (this.g > a8.b) {
                    a8 = a8.d;
                }
                a a11 = ax.S0.a.e(a8.d);
                this.a(a11);
                a8.d = a10 = new a(a8.b, this.b);
                a9 = a8;
                if (this.g == a8.b) {
                    a9 = a10;
                }
                this.f = a9;
                if (this.e == a11) {
                    this.e = a10;
                }
                return;
            }
        }
        this.a(this.d);
        this.d = a8 = new a(this.g, this.b);
        this.e = a8;
        this.f = a8;
    }

    public long e() {
        return this.g;
    }

    public void f(i i8, d0.b b8) {
        b0.l(this.e, i8, b8, this.c);
    }

    public void m(i i8, d0.b b8) {
        this.e = b0.l(this.e, i8, b8, this.c);
    }

    public void n() {
        a a8;
        this.a(this.d);
        this.d.d(0L, this.b);
        this.e = a8 = this.d;
        this.f = a8;
        this.g = 0L;
        this.a.c();
    }

    public void o() {
        this.e = this.d;
    }

    public int p(k k8, int n8, boolean bl) throws IOException {
        n8 = this.h(n8);
        a a8 = this.f;
        n8 = k8.c(a8.c.a, a8.e(this.g), n8);
        if (n8 == -1) {
            if (bl) {
                return -1;
            }
            throw new EOFException();
        }
        this.g(n8);
        return n8;
    }

    public void q(G g8, int n8) {
        while (n8 > 0) {
            int n9 = this.h(n8);
            a a8 = this.f;
            g8.q(a8.c.a, a8.e(this.g), n9);
            n8 -= n9;
            this.g(n9);
        }
    }

    private static final class a
    implements b.a {
        public long a;
        public long b;
        public ax.m1.a c;
        public a d;

        public a(long l8, int n8) {
            this.d(l8, n8);
        }

        @Override
        public ax.m1.a a() {
            return ax.S0.a.e(this.c);
        }

        public a b() {
            this.c = null;
            a a8 = this.d;
            this.d = null;
            return a8;
        }

        public void c(ax.m1.a a8, a a9) {
            this.c = a8;
            this.d = a9;
        }

        public void d(long l8, int n8) {
            boolean bl = this.c == null;
            ax.S0.a.g(bl);
            this.a = l8;
            this.b = l8 + (long)n8;
        }

        public int e(long l8) {
            return (int)(l8 - this.a) + this.c.b;
        }

        @Override
        public b.a next() {
            a a8 = this.d;
            if (a8 != null && a8.c != null) {
                return a8;
            }
            return null;
        }
    }
}

