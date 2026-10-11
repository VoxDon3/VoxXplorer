/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.N;
import ax.Dc.W;
import ax.Dc.Z;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipException;

public abstract class n
implements N {
    private byte[] c0;
    private byte[] d0;
    private final W q;

    protected n(W w8) {
        this.q = w8;
    }

    protected final void a(int n8, int n9) throws ZipException {
        if (n9 >= n8) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getName());
        stringBuilder.append(" is too short, only ");
        stringBuilder.append(n9);
        stringBuilder.append(" bytes, expected at least ");
        stringBuilder.append(n8);
        throw new ZipException(stringBuilder.toString());
    }

    @Override
    public W b() {
        return this.q;
    }

    @Override
    public W c() {
        byte[] byArray = this.c0;
        int n8 = byArray != null ? byArray.length : 0;
        return new W(n8);
    }

    @Override
    public void d(byte[] byArray, int n8, int n9) throws ZipException {
        this.g(Arrays.copyOfRange(byArray, n8, n9 + n8));
    }

    public void e(byte[] byArray) {
        this.d0 = Z.c(byArray);
    }

    @Override
    public byte[] f() {
        return Z.c(this.c0);
    }

    public void g(byte[] byArray) {
        this.c0 = Z.c(byArray);
    }

    @Override
    public byte[] h() {
        byte[] byArray = this.d0;
        if (byArray != null) {
            return Z.c(byArray);
        }
        return this.f();
    }

    @Override
    public W i() {
        if (this.d0 != null) {
            return new W(this.d0.length);
        }
        return this.c();
    }

    @Override
    public void j(byte[] byArray, int n8, int n9) throws ZipException {
        byArray = Arrays.copyOfRange(byArray, n8, n9 + n8);
        this.e(byArray);
        if (this.c0 == null) {
            this.g(byArray);
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        public static final /* enum */ a e0;
        public static final /* enum */ a f0;
        public static final /* enum */ a g0;
        public static final /* enum */ a h0;
        public static final /* enum */ a i0;
        public static final /* enum */ a j0;
        public static final /* enum */ a k0;
        public static final /* enum */ a l0;
        private static final Map<Integer, a> m0;
        private static final a[] n0;
        private final int q;

        static {
            a a8;
            a a9;
            a a102;
            a a11;
            a a12;
            a a13;
            a a14;
            a a15;
            a[] aArray = new a(26113);
            c0 = aArray;
            d0 = a15 = new a(26114);
            e0 = a14 = new a(26115);
            f0 = a13 = new a(26121);
            g0 = a12 = new a(26126);
            Object object = new a(26127);
            h0 = object;
            i0 = a11 = new a(26128);
            j0 = a102 = new a(26370);
            k0 = a9 = new a(26625);
            l0 = a8 = new a(65535);
            n0 = new a[]{aArray, a15, a14, a13, a12, object, a11, a102, a9, a8};
            object = new HashMap();
            for (a a102 : a.values()) {
                object.put(a102.h(), a102);
            }
            m0 = java.util.DesugarCollections.unmodifiableMap((Map)object);
        }

        private a(int n9) {
            this.q = n9;
        }

        public static a d(int n8) {
            return m0.get(n8);
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])n0.clone();
        }

        public int h() {
            return this.q;
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        public static final /* enum */ b d0;
        public static final /* enum */ b e0;
        public static final /* enum */ b f0;
        public static final /* enum */ b g0;
        public static final /* enum */ b h0;
        public static final /* enum */ b i0;
        public static final /* enum */ b j0;
        private static final Map<Integer, b> k0;
        private static final b[] l0;
        private final int q;

        static {
            b b82;
            b b9;
            b b10;
            b b11;
            b b12;
            b b13;
            Object object = new b(0);
            c0 = object;
            d0 = b13 = new b(1);
            e0 = b12 = new b(32771);
            f0 = b11 = new b(32772);
            g0 = b10 = new b(32775);
            b[] bArray = new b(32780);
            h0 = bArray;
            i0 = b9 = new b(32781);
            j0 = b82 = new b(32782);
            l0 = new b[]{object, b13, b12, b11, b10, bArray, b9, b82};
            object = new HashMap();
            for (b b82 : b.values()) {
                object.put(b82.h(), b82);
            }
            k0 = java.util.DesugarCollections.unmodifiableMap((Map)object);
        }

        private b(int n9) {
            this.q = n9;
        }

        public static b d(int n8) {
            return k0.get(n8);
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])l0.clone();
        }

        public int h() {
            return this.q;
        }
    }
}

