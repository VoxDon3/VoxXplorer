/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Ac.a;
import ax.Dc.N;
import ax.Dc.W;
import ax.Dc.h;
import ax.Dc.i;
import ax.Dc.j;
import ax.Dc.s;
import ax.Dc.t;
import ax.Dc.u;
import ax.Kc.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

public class I
extends ZipEntry
implements a {
    static final I[] v0 = new I[0];
    private long c0 = -1L;
    private int d0;
    private int e0;
    private int f0;
    private int g0 = 0;
    private int h0;
    private long i0;
    private int j0;
    private N[] k0;
    private t l0;
    private String m0;
    private byte[] n0;
    private j o0 = new j();
    private long p0 = -1L;
    private int q = -1;
    private long q0 = -1L;
    private boolean r0;
    private d s0 = d.q;
    private b t0 = b.q;
    private long u0;

    protected I() {
        this("");
    }

    public I(String string) {
        super(string);
        this.L(string);
    }

    private N[] f(N[] nArray, int n8) {
        N[] nArray2 = new N[n8];
        System.arraycopy(nArray, 0, nArray2, 0, Math.min(nArray.length, n8));
        return nArray2;
    }

    private N[] i() {
        N[] nArray = this.k0;
        if (nArray == null) {
            return this.x();
        }
        if (this.l0 != null) {
            nArray = this.v();
        }
        return nArray;
    }

    private N[] v() {
        N[] nArray = this.k0;
        nArray = this.f(nArray, nArray.length + 1);
        nArray[this.k0.length] = this.l0;
        return nArray;
    }

    private N[] x() {
        t t8 = this.l0;
        if (t8 == null) {
            return i.b;
        }
        return new N[]{t8};
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void y(N[] nArray, boolean bl) {
        if (this.k0 == null) {
            this.H(nArray);
            return;
        }
        int n8 = nArray.length;
        int n9 = 0;
        while (true) {
            block10: {
                N n10;
                Object object;
                block11: {
                    if (n9 >= n8) {
                        this.G();
                        return;
                    }
                    object = nArray[n9];
                    n10 = object instanceof t ? this.l0 : this.n(object.b());
                    if (n10 == null) {
                        this.d((N)object);
                    } else {
                        object = bl ? (Object)object.f() : (Object)object.h();
                        if (bl) {
                            try {
                                n10.d((byte[])object, 0, ((Object)object).length);
                                break block10;
                            }
                            catch (ZipException zipException) {
                                break block11;
                            }
                        }
                        n10.j((byte[])object, 0, ((Object)object).length);
                    }
                    break block10;
                }
                u u8 = new u();
                u8.e(n10.b());
                if (bl) {
                    u8.g((byte[])object);
                    u8.a(n10.h());
                } else {
                    u8.g(n10.f());
                    u8.a((byte[])object);
                }
                this.z(n10.b());
                this.d(u8);
            }
            ++n9;
        }
    }

    public void B(byte[] byArray) {
        try {
            this.y(i.f(byArray, false, c.c0), false);
            return;
        }
        catch (ZipException zipException) {
            throw new RuntimeException(zipException.getMessage(), zipException);
        }
    }

    public void C(b b8) {
        this.t0 = b8;
    }

    protected void D(long l8) {
        this.q0 = l8;
    }

    public void E(long l8) {
        this.u0 = l8;
    }

    public void F(long l8) {
        this.i0 = l8;
    }

    protected void G() {
        super.setExtra(i.e(this.i()));
    }

    public void H(N[] nArray) {
        this.l0 = null;
        ArrayList<N> arrayList = new ArrayList<N>();
        if (nArray != null) {
            for (N n8 : nArray) {
                if (n8 instanceof t) {
                    this.l0 = (t)n8;
                    continue;
                }
                arrayList.add(n8);
            }
        }
        this.k0 = arrayList.toArray(i.b);
        this.G();
    }

    public void I(j j8) {
        this.o0 = j8;
    }

    public void J(int n8) {
        this.d0 = n8;
    }

    protected void K(long l8) {
        this.p0 = l8;
    }

    protected void L(String string) {
        String string2 = string;
        if (string != null) {
            string2 = string;
            if (this.w() == 0) {
                string2 = string;
                if (!string.contains("/")) {
                    string2 = string.replace('\\', '/');
                }
            }
        }
        this.m0 = string2;
    }

    protected void M(String string, byte[] byArray) {
        this.L(string);
        this.n0 = byArray;
    }

    public void N(d d8) {
        this.s0 = d8;
    }

    protected void O(int n8) {
        this.g0 = n8;
    }

    public void P(int n8) {
        this.h0 = n8;
    }

    protected void Q(boolean bl) {
        this.r0 = bl;
    }

    public void R(int n8) {
        this.f0 = n8;
    }

    public void S(int n8) {
        this.e0 = n8;
    }

    @Override
    public Date b() {
        return new Date(this.getTime());
    }

    public void c(N n8) {
        if (n8 instanceof t) {
            this.l0 = (t)n8;
        } else {
            N[] nArray;
            if (this.n(n8.b()) != null) {
                this.z(n8.b());
            }
            int n9 = (nArray = this.k0) != null ? nArray.length + 1 : 1;
            N[] nArray2 = new N[n9];
            this.k0 = nArray2;
            nArray2[0] = n8;
            if (nArray != null) {
                System.arraycopy(nArray, 0, nArray2, 1, nArray2.length - 1);
            }
        }
        this.G();
    }

    @Override
    public Object clone() {
        I i8 = (I)super.clone();
        i8.J(this.r());
        i8.F(this.m());
        i8.H(this.i());
        return i8;
    }

    public void d(N n8) {
        if (n8 instanceof t) {
            this.l0 = (t)n8;
        } else if (this.k0 == null) {
            this.k0 = new N[]{n8};
        } else {
            if (this.n(n8.b()) != null) {
                this.z(n8.b());
            }
            N[] nArray = this.k0;
            nArray = this.f(nArray, nArray.length + 1);
            nArray[nArray.length - 1] = n8;
            this.k0 = nArray;
        }
        this.G();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            I i8 = (I)object;
            if (!j.Objects.equals((Object)this.getName(), (Object)i8.getName())) {
                return false;
            }
            String string = this.getComment();
            String string2 = i8.getComment();
            object = string;
            if (string == null) {
                object = "";
            }
            string = string2;
            if (string2 == null) {
                string = "";
            }
            if (this.getTime() == i8.getTime() && ((String)object).equals(string) && this.r() == i8.r() && this.w() == i8.w() && this.m() == i8.m() && this.getMethod() == i8.getMethod() && this.getSize() == i8.getSize() && this.getCrc() == i8.getCrc() && this.getCompressedSize() == i8.getCompressedSize() && Arrays.equals(this.j(), i8.j()) && Arrays.equals(this.s(), i8.s()) && this.p0 == i8.p0 && this.q0 == i8.q0 && this.o0.equals(i8.o0)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int getMethod() {
        return this.q;
    }

    @Override
    public String getName() {
        String string;
        String string2 = string = this.m0;
        if (string == null) {
            string2 = super.getName();
        }
        return string2;
    }

    @Override
    public long getSize() {
        return this.c0;
    }

    protected int h() {
        return this.j0;
    }

    @Override
    public int hashCode() {
        String string;
        String string2 = string = this.getName();
        if (string == null) {
            string2 = "";
        }
        return string2.hashCode();
    }

    @Override
    public boolean isDirectory() {
        String string = this.getName();
        return string != null && string.endsWith("/");
    }

    public byte[] j() {
        return i.d(this.i());
    }

    public long k() {
        return this.q0;
    }

    public long l() {
        return this.u0;
    }

    public long m() {
        return this.i0;
    }

    public N n(W w8) {
        N[] nArray = this.k0;
        if (nArray != null) {
            for (N n8 : nArray) {
                if (!w8.equals(n8.b())) continue;
                return n8;
            }
        }
        return null;
    }

    public j o() {
        return this.o0;
    }

    public int r() {
        return this.d0;
    }

    public byte[] s() {
        byte[] byArray = this.getExtra();
        if (byArray != null) {
            return byArray;
        }
        return f.a;
    }

    @Override
    public void setExtra(byte[] byArray) throws RuntimeException {
        try {
            this.y(i.f(byArray, true, c.c0), true);
            return;
        }
        catch (ZipException zipException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error parsing extra fields for entry: ");
            stringBuilder.append(this.getName());
            stringBuilder.append(" - ");
            stringBuilder.append(zipException.getMessage());
            throw new RuntimeException(stringBuilder.toString(), zipException);
        }
    }

    @Override
    public void setMethod(int n8) {
        if (n8 >= 0) {
            this.q = n8;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ZIP compression method can not be negative: ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    public void setSize(long l8) {
        if (l8 >= 0L) {
            this.c0 = l8;
            return;
        }
        throw new IllegalArgumentException("Invalid entry size");
    }

    protected long t() {
        return this.p0;
    }

    public int w() {
        return this.g0;
    }

    public void z(W w8) {
        if (this.k0 != null) {
            ArrayList<N> arrayList = new ArrayList<N>();
            for (N n8 : this.k0) {
                if (w8.equals(n8.b())) continue;
                arrayList.add(n8);
            }
            if (this.k0.length != arrayList.size()) {
                this.k0 = arrayList.toArray(i.b);
                this.G();
                return;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        private static final b[] d0;
        public static final /* enum */ b q;

        static {
            b b8;
            b b9;
            q = b9 = new b();
            c0 = b8 = new b();
            d0 = new b[]{b9, b8};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])d0.clone();
        }
    }

    public static class c
    extends Enum<c>
    implements h {
        public static final /* enum */ c c0;
        public static final /* enum */ c d0;
        public static final /* enum */ c e0;
        public static final /* enum */ c f0;
        public static final /* enum */ c g0;
        private static final c[] h0;
        private final i.a q;

        static {
            c c8;
            c c9;
            c c10;
            s s8 = i.a.e0;
            c0 = c10 = new c((i.a)s8){

                @Override
                public N j(N n8, byte[] byArray, int n9, int n10, boolean bl) {
                    return c.n(n8, byArray, n9, n10, bl);
                }
            };
            d0 = c9 = new c((i.a)s8);
            s s9 = i.a.d0;
            s8 = new c((i.a)s9){

                @Override
                public N j(N n8, byte[] byArray, int n9, int n10, boolean bl) {
                    return c.n(n8, byArray, n9, n10, bl);
                }
            };
            e0 = s8;
            s9 = new c((i.a)s9);
            f0 = s9;
            g0 = c8 = new c(i.a.c0);
            h0 = new c[]{c10, c9, s8, s9, c8};
        }

        private c(i.a a8) {
            this.q = a8;
        }

        private static N n(N n8, byte[] byArray, int n9, int n10, boolean bl) {
            try {
                N n11 = i.c(n8, byArray, n9, n10, bl);
                return n11;
            }
            catch (ZipException zipException) {
                u u8 = new u();
                u8.e(n8.b());
                if (bl) {
                    u8.g(Arrays.copyOfRange(byArray, n9, n10 + n9));
                } else {
                    u8.a(Arrays.copyOfRange(byArray, n9, n10 + n9));
                }
                return u8;
            }
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])h0.clone();
        }

        @Override
        public N d(byte[] byArray, int n8, int n9, boolean bl, int n10) throws ZipException {
            return this.q.d(byArray, n8, n9, bl, n10);
        }

        @Override
        public N h(W w8) throws ZipException, InstantiationException, IllegalAccessException {
            return i.a(w8);
        }

        @Override
        public N j(N n8, byte[] byArray, int n9, int n10, boolean bl) throws ZipException {
            return i.c(n8, byArray, n9, n10, bl);
        }
    }

    public static final class d
    extends Enum<d> {
        public static final /* enum */ d c0;
        public static final /* enum */ d d0;
        private static final d[] e0;
        public static final /* enum */ d q;

        static {
            d d8;
            d d9;
            d d10;
            q = d10 = new d();
            c0 = d9 = new d();
            d0 = d8 = new d();
            e0 = new d[]{d10, d9, d8};
        }

        public static d valueOf(String string) {
            return Enum.valueOf(d.class, string);
        }

        public static d[] values() {
            return (d[])e0.clone();
        }
    }
}

