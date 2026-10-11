/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import android.os.Bundle;
import android.util.SparseArray;
import ax.S0.a;
import ax.S0.d0;
import ax.q7.f;
import ax.r7.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class g {
    private g() {
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(d0.i(g.class.getClassLoader()));
        }
    }

    public static <T> z<T> b(f<Bundle, T> f8, List<Bundle> list) {
        z.a<T> a8 = z.r();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            a8.h(f8.apply(a.e(list.get(i8))));
        }
        return a8.k();
    }

    public static <T> SparseArray<T> c(f<Bundle, T> f8, SparseArray<Bundle> sparseArray) {
        SparseArray sparseArray2 = new SparseArray(sparseArray.size());
        for (int i8 = 0; i8 < sparseArray.size(); ++i8) {
            sparseArray2.put(sparseArray.keyAt(i8), f8.apply((Bundle)sparseArray.valueAt(i8)));
        }
        return sparseArray2;
    }

    public static <T> ArrayList<Bundle> d(Collection<T> object, f<T, Bundle> f8) {
        ArrayList<Bundle> arrayList = new ArrayList<Bundle>(object.size());
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add(f8.apply(object.next()));
        }
        return arrayList;
    }

    public static <T> SparseArray<Bundle> e(SparseArray<T> sparseArray, f<T, Bundle> f8) {
        SparseArray sparseArray2 = new SparseArray(sparseArray.size());
        for (int i8 = 0; i8 < sparseArray.size(); ++i8) {
            sparseArray2.put(sparseArray.keyAt(i8), (Object)f8.apply(sparseArray.valueAt(i8)));
        }
        return sparseArray2;
    }
}

