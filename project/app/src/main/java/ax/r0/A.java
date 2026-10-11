/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.S;
import ax.r0.t0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

public final class A {
    static final Charset a = Charset.forName("UTF-8");
    static final Charset b = Charset.forName("ISO-8859-1");
    public static final byte[] c;
    public static final ByteBuffer d;
    public static final ax.r0.i e;

    static {
        byte[] byArray = new byte[]{};
        c = byArray;
        d = ByteBuffer.wrap(byArray);
        e = ax.r0.i.h(byArray);
    }

    static <T> T a(T t8) {
        t8.getClass();
        return t8;
    }

    static <T> T b(T t8, String string) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(string);
    }

    public static int c(boolean bl) {
        if (bl) {
            return 1231;
        }
        return 1237;
    }

    public static int d(byte[] byArray) {
        return A.e(byArray, 0, byArray.length);
    }

    static int e(byte[] byArray, int n8, int n9) {
        n8 = n9 = A.i(n9, byArray, n8, n9);
        if (n9 == 0) {
            n8 = 1;
        }
        return n8;
    }

    public static int f(long l8) {
        return (int)(l8 ^ l8 >>> 32);
    }

    public static boolean g(byte[] byArray) {
        return t0.m(byArray);
    }

    static Object h(Object object, Object object2) {
        return ((S)object).d().o0((S)object2).u0();
    }

    static int i(int n8, byte[] byArray, int n9, int n10) {
        int n11 = n9;
        int n12 = n8;
        for (n8 = n11; n8 < n9 + n10; ++n8) {
            n12 = n12 * 31 + byArray[n8];
        }
        return n12;
    }

    public static String j(byte[] byArray) {
        return new String(byArray, a);
    }

    public static interface a
    extends i<Boolean> {
    }

    public static interface b
    extends i<Double> {
    }

    public static interface c {
        public int g();
    }

    public static interface d<T extends c> {
        public T a(int var1);
    }

    public static interface e {
        public boolean a(int var1);
    }

    public static interface f
    extends i<Float> {
    }

    public static interface g
    extends i<Integer> {
    }

    public static interface h
    extends i<Long> {
    }

    public static interface i<E>
    extends List<E>,
    RandomAccess {
        public void F();

        public boolean G0();

        public i<E> L(int var1);
    }
}

