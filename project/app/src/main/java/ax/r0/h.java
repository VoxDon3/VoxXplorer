/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.A;
import ax.r0.t0;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class h
implements Iterable<Byte>,
Serializable {
    public static final h c0 = new j(A.c);
    private static final f d0;
    private static final Comparator<h> e0;
    private int q = 0;

    static {
        f f8 = ax.r0.d.c() ? new k() : new d();
        d0 = f8;
        e0 = new Comparator<h>(){

            public int a(h h8, h h9) {
                g g8 = h8.s();
                g g9 = h9.s();
                while (g8.hasNext() && g9.hasNext()) {
                    int n8 = Integer.compare(h.A(g8.d()), h.A(g9.d()));
                    if (n8 == 0) continue;
                    return n8;
                }
                return Integer.compare(h8.size(), h9.size());
            }
        };
    }

    h() {
    }

    private static int A(byte by) {
        return by & 0xFF;
    }

    static h E(byte[] byArray) {
        return new j(byArray);
    }

    static h G(byte[] byArray, int n8, int n9) {
        return new e(byArray, n8, n9);
    }

    static void h(int n8, int n9) {
        if ((n9 - (n8 + 1) | n8) < 0) {
            if (n8 < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Index < 0: ");
                stringBuilder.append(n8);
                throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Index > length: ");
            stringBuilder.append(n8);
            stringBuilder.append(", ");
            stringBuilder.append(n9);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        }
    }

    static int i(int n8, int n9, int n10) {
        int n11 = n9 - n8;
        if ((n8 | n9 | n11 | n10 - n9) < 0) {
            if (n8 >= 0) {
                if (n9 < n8) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Beginning index larger than ending index: ");
                    stringBuilder.append(n8);
                    stringBuilder.append(", ");
                    stringBuilder.append(n9);
                    throw new IndexOutOfBoundsException(stringBuilder.toString());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("End index: ");
                stringBuilder.append(n9);
                stringBuilder.append(" >= ");
                stringBuilder.append(n10);
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Beginning index: ");
            stringBuilder.append(n8);
            stringBuilder.append(" < 0");
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        return n11;
    }

    public static h k(byte[] byArray) {
        return h.l(byArray, 0, byArray.length);
    }

    public static h l(byte[] byArray, int n8, int n9) {
        h.i(n8, n8 + n9, byArray.length);
        return new j(d0.a(byArray, n8, n9));
    }

    public static h n(String string) {
        return new j(string.getBytes(A.a));
    }

    static h t(int n8) {
        return new h(n8);
    }

    public final String B(Charset charset) {
        if (this.size() == 0) {
            return "";
        }
        return this.C(charset);
    }

    protected abstract String C(Charset var1);

    public final String D() {
        return this.B(A.a);
    }

    abstract void I(ax.r0.g var1) throws IOException;

    public abstract boolean equals(Object var1);

    public abstract byte g(int var1);

    public final int hashCode() {
        int n8;
        int n9 = n8 = this.q;
        if (n8 == 0) {
            n9 = this.size();
            n9 = n8 = this.w(n9, 0, n9);
            if (n8 == 0) {
                n9 = 1;
            }
            this.q = n9;
        }
        return n9;
    }

    protected abstract void p(byte[] var1, int var2, int var3, int var4);

    abstract byte q(int var1);

    public abstract boolean r();

    public g s() {
        return new c(this){
            private final int c0;
            final h d0;
            private int q;
            {
                this.d0 = h8;
                this.q = 0;
                this.c0 = h8.size();
            }

            @Override
            public byte d() {
                int n8 = this.q;
                if (n8 < this.c0) {
                    this.q = n8 + 1;
                    return this.d0.q(n8);
                }
                throw new NoSuchElementException();
            }

            @Override
            public boolean hasNext() {
                return this.q < this.c0;
            }
        };
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), this.size());
    }

    public abstract ax.r0.i u();

    protected abstract int w(int var1, int var2, int var3);

    protected final int x() {
        return this.q;
    }

    public abstract h y(int var1, int var2);

    public final byte[] z() {
        int n8 = this.size();
        if (n8 == 0) {
            return A.c;
        }
        byte[] byArray = new byte[n8];
        this.p(byArray, 0, 0, n8);
        return byArray;
    }

    static abstract class c
    implements g {
        c() {
        }

        public final Byte b() {
            return this.d();
        }

        @Override
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static final class d
    implements f {
        private d() {
        }

        @Override
        public byte[] a(byte[] byArray, int n8, int n9) {
            return Arrays.copyOfRange(byArray, n8, n9 + n8);
        }
    }

    private static final class e
    extends j {
        private final int g0;
        private final int h0;

        e(byte[] byArray, int n8, int n9) {
            super(byArray);
            h.i(n8, n8 + n9, byArray.length);
            this.g0 = n8;
            this.h0 = n9;
        }

        @Override
        protected int K() {
            return this.g0;
        }

        @Override
        public byte g(int n8) {
            h.h(n8, this.size());
            return this.f0[this.g0 + n8];
        }

        @Override
        protected void p(byte[] byArray, int n8, int n9, int n10) {
            System.arraycopy(this.f0, this.K() + n8, byArray, n9, n10);
        }

        @Override
        byte q(int n8) {
            return this.f0[this.g0 + n8];
        }

        @Override
        public int size() {
            return this.h0;
        }
    }

    private static interface f {
        public byte[] a(byte[] var1, int var2, int var3);
    }

    public static interface g
    extends Iterator<Byte> {
        public byte d();
    }

    static final class h {
        private final ax.r0.k a;
        private final byte[] b;

        private h(int n8) {
            byte[] byArray = new byte[n8];
            this.b = byArray;
            this.a = ax.r0.k.g0(byArray);
        }

        public h a() {
            this.a.c();
            return new j(this.b);
        }

        public ax.r0.k b() {
            return this.a;
        }
    }

    static abstract class i
    extends h {
        i() {
        }
    }

    private static class j
    extends i {
        protected final byte[] f0;

        j(byte[] byArray) {
            byArray.getClass();
            this.f0 = byArray;
        }

        @Override
        protected final String C(Charset charset) {
            return new String(this.f0, this.K(), this.size(), charset);
        }

        @Override
        final void I(ax.r0.g g8) throws IOException {
            g8.a(this.f0, this.K(), this.size());
        }

        final boolean J(h object, int n8, int n9) {
            if (n9 <= ((h)object).size()) {
                int n10 = n8 + n9;
                if (n10 <= ((h)object).size()) {
                    if (object instanceof j) {
                        j j8 = (j)object;
                        byte[] byArray = this.f0;
                        object = j8.f0;
                        int n11 = this.K();
                        int n12 = this.K();
                        n10 = j8.K() + n8;
                        n8 = n12;
                        while (n8 < n11 + n9) {
                            if (byArray[n8] != object[n10]) {
                                return false;
                            }
                            ++n8;
                            ++n10;
                        }
                        return true;
                    }
                    return ((h)object).y(n8, n10).equals(this.y(0, n9));
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Ran off end of other: ");
                stringBuilder.append(n8);
                stringBuilder.append(", ");
                stringBuilder.append(n9);
                stringBuilder.append(", ");
                stringBuilder.append(((h)object).size());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Length too large: ");
            ((StringBuilder)object).append(n9);
            ((StringBuilder)object).append(this.size());
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }

        protected int K() {
            return 0;
        }

        @Override
        public final boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof h)) {
                return false;
            }
            if (this.size() != ((h)object).size()) {
                return false;
            }
            if (this.size() == 0) {
                return true;
            }
            if (object instanceof j) {
                object = (j)object;
                int n8 = this.x();
                int n9 = ((h)object).x();
                if (n8 != 0 && n9 != 0 && n8 != n9) {
                    return false;
                }
                return this.J((h)object, 0, this.size());
            }
            return object.equals(this);
        }

        @Override
        public byte g(int n8) {
            return this.f0[n8];
        }

        @Override
        protected void p(byte[] byArray, int n8, int n9, int n10) {
            System.arraycopy(this.f0, n8, byArray, n9, n10);
        }

        @Override
        byte q(int n8) {
            return this.f0[n8];
        }

        @Override
        public final boolean r() {
            int n8 = this.K();
            return t0.n(this.f0, n8, this.size() + n8);
        }

        @Override
        public int size() {
            return this.f0.length;
        }

        @Override
        public final ax.r0.i u() {
            return ax.r0.i.j(this.f0, this.K(), this.size(), true);
        }

        @Override
        protected final int w(int n8, int n9, int n10) {
            return A.i(n8, this.f0, this.K() + n9, n10);
        }

        @Override
        public final h y(int n8, int n9) {
            if ((n9 = h.i(n8, n9, this.size())) == 0) {
                return c0;
            }
            return new e(this.f0, this.K() + n8, n9);
        }
    }

    private static final class k
    implements f {
        private k() {
        }

        @Override
        public byte[] a(byte[] byArray, int n8, int n9) {
            byte[] byArray2 = new byte[n9];
            System.arraycopy(byArray, n8, byArray2, 0, n9);
            return byArray2;
        }
    }
}

