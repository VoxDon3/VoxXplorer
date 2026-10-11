/*
 * Decompiled with CFR 0.152.
 */
package ax.o5;

import android.util.SparseArray;

public final class x
extends Enum<x> {
    public static final /* enum */ x c0;
    public static final /* enum */ x d0;
    public static final /* enum */ x e0;
    public static final /* enum */ x f0;
    public static final /* enum */ x g0;
    public static final /* enum */ x h0;
    private static final SparseArray<x> i0;
    private static final x[] j0;
    private final int q;

    static {
        SparseArray sparseArray;
        x x8;
        x x9;
        x x10;
        x x11;
        x x12;
        x x13;
        c0 = x13 = new x(0);
        d0 = x12 = new x(1);
        e0 = x11 = new x(2);
        f0 = x10 = new x(3);
        g0 = x9 = new x(4);
        h0 = x8 = new x(-1);
        j0 = new x[]{x13, x12, x11, x10, x9, x8};
        i0 = sparseArray = new SparseArray();
        sparseArray.put(0, (Object)x13);
        sparseArray.put(1, (Object)x12);
        sparseArray.put(2, (Object)x11);
        sparseArray.put(3, (Object)x10);
        sparseArray.put(4, (Object)x9);
        sparseArray.put(-1, (Object)x8);
    }

    private x(int n9) {
        this.q = n9;
    }

    public static x valueOf(String string) {
        return Enum.valueOf(x.class, string);
    }

    public static x[] values() {
        return (x[])j0.clone();
    }
}

