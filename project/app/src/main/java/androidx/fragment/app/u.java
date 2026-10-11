/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.fragment.app.w;
import ax.B.a;
import ax.v2.e;
import java.util.ArrayList;

class u {
    static final w a = new v();
    static final w b = u.b();

    static void a(Fragment fragment, Fragment fragment2, boolean bl, a<String, View> a8, boolean bl2) {
        if (bl) {
            fragment2.n0();
            return;
        }
        fragment.n0();
    }

    private static w b() {
        try {
            w w8 = (w)e.class.getDeclaredConstructor(null).newInstance(null);
            return w8;
        }
        catch (Exception exception) {
            return null;
        }
    }

    static void c(a<String, String> a8, a<String, View> a9) {
        for (int i8 = a8.size() - 1; i8 >= 0; --i8) {
            if (a9.containsKey((Object)((String)a8.k(i8)))) continue;
            a8.i(i8);
        }
    }

    static void d(ArrayList<View> arrayList, int n8) {
        if (arrayList != null) {
            for (int i8 = arrayList.size() - 1; i8 >= 0; --i8) {
                arrayList.get(i8).setVisibility(n8);
            }
        }
    }
}

