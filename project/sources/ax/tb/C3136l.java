package ax.tb;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ax.tb.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3136l extends C3135k {
    public static final <T> List<T> c(T[] tArr) {
        ax.Gb.l.f(tArr, "<this>");
        List<T> a = C3138n.a(tArr);
        ax.Gb.l.e(a, "asList(...)");
        return a;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        ax.Gb.l.f(bArr, "<this>");
        ax.Gb.l.f(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    public static int[] e(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        ax.Gb.l.f(iArr, "<this>");
        ax.Gb.l.f(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
        return iArr2;
    }

    public static long[] f(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        ax.Gb.l.f(jArr, "<this>");
        ax.Gb.l.f(jArr2, "destination");
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
        return jArr2;
    }

    public static <T> T[] g(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        ax.Gb.l.f(tArr, "<this>");
        ax.Gb.l.f(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    public static /* synthetic */ byte[] h(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        return d(bArr, bArr2, i, i2, i3);
    }

    public static /* synthetic */ int[] i(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        return e(iArr, iArr2, i, i2, i3);
    }

    public static /* synthetic */ Object[] j(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return g(objArr, objArr2, i, i2, i3);
    }

    public static byte[] k(byte[] bArr, int i, int i2) {
        ax.Gb.l.f(bArr, "<this>");
        C3134j.b(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        ax.Gb.l.e(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static <T> T[] l(T[] tArr, int i, int i2) {
        ax.Gb.l.f(tArr, "<this>");
        C3134j.b(i2, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i, i2);
        ax.Gb.l.e(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    public static final void m(int[] iArr, int i, int i2, int i3) {
        ax.Gb.l.f(iArr, "<this>");
        Arrays.fill(iArr, i2, i3, i);
    }

    public static <T> void n(T[] tArr, T t, int i, int i2) {
        ax.Gb.l.f(tArr, "<this>");
        Arrays.fill(tArr, i, i2, t);
    }

    public static /* synthetic */ void o(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        m(iArr, i, i2, i3);
    }

    public static /* synthetic */ void p(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        n(objArr, obj, i, i2);
    }

    public static final <T> void q(T[] tArr) {
        ax.Gb.l.f(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void r(T[] tArr, Comparator<? super T> comparator) {
        ax.Gb.l.f(tArr, "<this>");
        ax.Gb.l.f(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
