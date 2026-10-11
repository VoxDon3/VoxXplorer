package ax.B;

/* loaded from: classes.dex */
public final class m {
    private static final Object a = new Object();

    public static final <E> E c(l<E> lVar, int i) {
        E e;
        ax.Gb.l.f(lVar, "<this>");
        int a2 = ax.C.a.a(lVar.c0, lVar.e0, i);
        if (a2 < 0 || (e = (E) lVar.d0[a2]) == a) {
            return null;
        }
        return e;
    }

    public static final <E> E d(l<E> lVar, int i, E e) {
        E e2;
        ax.Gb.l.f(lVar, "<this>");
        int a2 = ax.C.a.a(lVar.c0, lVar.e0, i);
        return (a2 < 0 || (e2 = (E) lVar.d0[a2]) == a) ? e : e2;
    }

    public static final <E> void e(l<E> lVar, int i) {
        ax.Gb.l.f(lVar, "<this>");
        int a2 = ax.C.a.a(lVar.c0, lVar.e0, i);
        if (a2 >= 0) {
            Object[] objArr = lVar.d0;
            Object obj = objArr[a2];
            Object obj2 = a;
            if (obj != obj2) {
                objArr[a2] = obj2;
                lVar.q = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> void f(l<E> lVar) {
        int i = lVar.e0;
        int[] iArr = lVar.c0;
        Object[] objArr = lVar.d0;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        lVar.q = false;
        lVar.e0 = i2;
    }
}
