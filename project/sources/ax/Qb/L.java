package ax.Qb;

import ax.sb.C3080l;

/* loaded from: classes3.dex */
public enum L {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[L.values().length];
            try {
                iArr[L.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[L.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[L.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[L.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public final <R, T> void h(ax.Fb.p<? super R, ? super ax.wb.e<? super T>, ? extends Object> pVar, R r, ax.wb.e<? super T> eVar) {
        int i = a.a[ordinal()];
        if (i == 1) {
            ax.Wb.a.d(pVar, r, eVar, null, 4, null);
            return;
        }
        if (i == 2) {
            ax.wb.g.a(pVar, r, eVar);
        } else if (i == 3) {
            ax.Wb.b.a(pVar, r, eVar);
        } else if (i != 4) {
            throw new C3080l();
        }
    }

    public final boolean j() {
        return this == LAZY;
    }
}
