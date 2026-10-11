package ax.r0;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: ax.r0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2904A {
    static final Charset a = Charset.forName("UTF-8");
    static final Charset b = Charset.forName("ISO-8859-1");
    public static final byte[] c;
    public static final ByteBuffer d;
    public static final AbstractC2922i e;

    /* renamed from: ax.r0.A$a */
    public interface a extends i<Boolean> {
    }

    /* renamed from: ax.r0.A$b */
    public interface b extends i<Double> {
    }

    /* renamed from: ax.r0.A$c */
    public interface c {
        int g();
    }

    /* renamed from: ax.r0.A$d */
    public interface d<T extends c> {
        T a(int i);
    }

    /* renamed from: ax.r0.A$e */
    public interface e {
        boolean a(int i);
    }

    /* renamed from: ax.r0.A$f */
    public interface f extends i<Float> {
    }

    /* renamed from: ax.r0.A$g */
    public interface g extends i<Integer> {
    }

    /* renamed from: ax.r0.A$h */
    public interface h extends i<Long> {
    }

    /* renamed from: ax.r0.A$i */
    public interface i<E> extends List<E>, RandomAccess {
        void F();

        boolean G0();

        i<E> L(int i);
    }

    static {
        byte[] bArr = new byte[0];
        c = bArr;
        d = ByteBuffer.wrap(bArr);
        e = AbstractC2922i.h(bArr);
    }

    static <T> T a(T t) {
        t.getClass();
        return t;
    }

    static <T> T b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i2, int i3) {
        int i4 = i(i3, bArr, i2, i3);
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public static int f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return t0.m(bArr);
    }

    static Object h(Object obj, Object obj2) {
        return ((S) obj).d().o0((S) obj2).u0();
    }

    static int i(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, a);
    }
}
