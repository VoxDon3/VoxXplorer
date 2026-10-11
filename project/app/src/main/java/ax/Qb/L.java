/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Fb.p;
import ax.Wb.b;
import ax.sb.l;
import ax.wb.e;
import ax.wb.g;

public final class L
extends Enum<L> {
    public static final /* enum */ L c0;
    public static final /* enum */ L d0;
    public static final /* enum */ L e0;
    private static final L[] f0;
    public static final /* enum */ L q;

    static {
        q = new L();
        c0 = new L();
        d0 = new L();
        e0 = new L();
        f0 = L.d();
    }

    private static final /* synthetic */ L[] d() {
        return new L[]{q, c0, d0, e0};
    }

    public static L valueOf(String string) {
        return Enum.valueOf(L.class, string);
    }

    public static L[] values() {
        return (L[])f0.clone();
    }

    public final <R, T> void h(p<? super R, ? super e<? super T>, ? extends Object> p8, R r8, e<? super T> e8) {
        int n8 = a.a[this.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 == 4) {
                        return;
                    }
                    throw new l();
                }
                b.a(p8, r8, e8);
                return;
            }
            g.a(p8, r8, e8);
            return;
        }
        ax.Wb.a.d(p8, r8, e8, null, 4, null);
    }

    public final boolean j() {
        return this == c0;
    }

    public final class a {
        public static final int[] a;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        static {
            int[] nArray = new int[L.values().length];
            try {
                nArray[L.q.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[L.d0.ordinal()] = 2;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[L.e0.ordinal()] = 3;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[L.c0.ordinal()] = 4;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            a = nArray;
        }
    }
}

