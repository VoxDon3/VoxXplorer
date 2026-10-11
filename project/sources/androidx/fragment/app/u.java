package androidx.fragment.app;

import android.view.View;
import ax.v2.C3262e;
import java.util.ArrayList;

/* loaded from: classes.dex */
class u {
    static final w a = new v();
    static final w b = b();

    static void a(Fragment fragment, Fragment fragment2, boolean z, ax.B.a<String, View> aVar, boolean z2) {
        if (z) {
            fragment2.n0();
        } else {
            fragment.n0();
        }
    }

    private static w b() {
        try {
            return (w) C3262e.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static void c(ax.B.a<String, String> aVar, ax.B.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.k(size))) {
                aVar.i(size);
            }
        }
    }

    static void d(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }
}
