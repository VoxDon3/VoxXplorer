package ax.W5;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class O1 {
    private static final O1 e = new O1(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private boolean d;

    private O1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.d = z;
    }

    public static O1 a() {
        return e;
    }

    static O1 c(O1 o1, O1 o12) {
        int i = o1.a + o12.a;
        int[] copyOf = Arrays.copyOf(o1.b, i);
        System.arraycopy(o12.b, 0, copyOf, o1.a, o12.a);
        Object[] copyOf2 = Arrays.copyOf(o1.c, i);
        System.arraycopy(o12.c, 0, copyOf2, o1.a, o12.a);
        return new O1(i, copyOf, copyOf2, true);
    }

    static O1 d() {
        return new O1(0, new int[8], new Object[8], true);
    }

    private final void i(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    final O1 b(O1 o1) {
        if (o1.equals(e)) {
            return this;
        }
        e();
        int i = this.a + o1.a;
        i(i);
        System.arraycopy(o1.b, 0, this.b, this.a, o1.a);
        System.arraycopy(o1.c, 0, this.c, this.a, o1.a);
        this.a = i;
        return this;
    }

    final void e() {
        if (!this.d) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof O1)) {
            return false;
        }
        O1 o1 = (O1) obj;
        int i = this.a;
        if (i == o1.a) {
            int[] iArr = this.b;
            int[] iArr2 = o1.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = o1.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final void f() {
        if (this.d) {
            this.d = false;
        }
    }

    final void g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            C1047l1.b(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    final void h(int i, Object obj) {
        e();
        i(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 * 31) + i4;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return (i6 * 31) + i3;
    }

    private O1() {
        this(0, new int[8], new Object[8], true);
    }
}
