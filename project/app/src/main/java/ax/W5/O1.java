/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.l1;
import java.util.Arrays;

public final class O1 {
    private static final O1 e = new O1(0, new int[0], new Object[0], false);
    private int a;
    private int[] b;
    private Object[] c;
    private boolean d;

    private O1() {
        this(0, new int[8], new Object[8], true);
    }

    private O1(int n8, int[] nArray, Object[] objectArray, boolean bl) {
        this.a = n8;
        this.b = nArray;
        this.c = objectArray;
        this.d = bl;
    }

    public static O1 a() {
        return e;
    }

    static O1 c(O1 o12, O1 o13) {
        int n8 = o12.a + o13.a;
        int[] nArray = Arrays.copyOf(o12.b, n8);
        System.arraycopy(o13.b, 0, nArray, o12.a, o13.a);
        Object[] objectArray = Arrays.copyOf(o12.c, n8);
        System.arraycopy(o13.c, 0, objectArray, o12.a, o13.a);
        return new O1(n8, nArray, objectArray, true);
    }

    static O1 d() {
        return new O1(0, new int[8], new Object[8], true);
    }

    private final void i(int n8) {
        int[] nArray = this.b;
        if (n8 > nArray.length) {
            int n9 = this.a;
            int n10 = n9 + n9 / 2;
            n9 = n8;
            if (n10 >= n8) {
                n9 = n10;
            }
            n8 = n9;
            if (n9 < 8) {
                n8 = 8;
            }
            this.b = Arrays.copyOf(nArray, n8);
            this.c = Arrays.copyOf(this.c, n8);
        }
    }

    final O1 b(O1 o12) {
        if (o12.equals(e)) {
            return this;
        }
        this.e();
        int n8 = this.a + o12.a;
        this.i(n8);
        System.arraycopy(o12.b, 0, this.b, this.a, o12.a);
        System.arraycopy(o12.c, 0, this.c, this.a, o12.a);
        this.a = n8;
        return this;
    }

    final void e() {
        if (this.d) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object objectArray) {
        block8: {
            if (this == objectArray) {
                return true;
            }
            if (objectArray == null) {
                return false;
            }
            if (!(objectArray instanceof O1)) {
                return false;
            }
            objectArray = (O1)objectArray;
            int n8 = this.a;
            if (n8 == objectArray.a) {
                int n9;
                int[] nArray = this.b;
                Object[] objectArray2 = objectArray.b;
                for (n9 = 0; n9 < n8; ++n9) {
                    if (nArray[n9] == objectArray2[n9]) {
                        continue;
                    }
                    break block8;
                }
                objectArray2 = this.c;
                objectArray = objectArray.c;
                n8 = this.a;
                for (n9 = 0; n9 < n8; ++n9) {
                    if (objectArray2[n9].equals(objectArray[n9])) {
                        continue;
                    }
                    break block8;
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.d) {
            this.d = false;
        }
    }

    final void g(StringBuilder stringBuilder, int n8) {
        for (int i8 = 0; i8 < this.a; ++i8) {
            l1.b(stringBuilder, n8, String.valueOf(this.b[i8] >>> 3), this.c[i8]);
        }
    }

    final void h(int n8, Object object) {
        this.e();
        this.i(this.a + 1);
        int[] nArray = this.b;
        int n9 = this.a;
        nArray[n9] = n8;
        this.c[n9] = object;
        this.a = n9 + 1;
    }

    public final int hashCode() {
        int n8;
        int n9 = this.a;
        Object[] objectArray = this.b;
        int n10 = 0;
        int n11 = 17;
        int n12 = 17;
        for (n8 = 0; n8 < n9; ++n8) {
            n12 = n12 * 31 + objectArray[n8];
        }
        objectArray = this.c;
        int n13 = this.a;
        n8 = n11;
        while (n10 < n13) {
            n8 = n8 * 31 + objectArray[n10].hashCode();
            ++n10;
        }
        return ((n9 + 527) * 31 + n12) * 31 + n8;
    }
}

