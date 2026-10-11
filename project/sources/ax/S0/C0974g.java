package ax.S0;

import android.os.Bundle;
import android.util.SparseArray;
import ax.q7.InterfaceC2879f;
import ax.r7.AbstractC2991z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: ax.S0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0974g {
    private C0974g() {
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) d0.i(C0974g.class.getClassLoader()));
        }
    }

    public static <T> AbstractC2991z<T> b(InterfaceC2879f<Bundle, T> interfaceC2879f, List<Bundle> list) {
        AbstractC2991z.a r = AbstractC2991z.r();
        for (int i = 0; i < list.size(); i++) {
            r.a(interfaceC2879f.apply((Bundle) C0968a.e(list.get(i))));
        }
        return r.k();
    }

    public static <T> SparseArray<T> c(InterfaceC2879f<Bundle, T> interfaceC2879f, SparseArray<Bundle> sparseArray) {
        SparseArray<T> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), interfaceC2879f.apply(sparseArray.valueAt(i)));
        }
        return sparseArray2;
    }

    public static <T> ArrayList<Bundle> d(Collection<T> collection, InterfaceC2879f<T, Bundle> interfaceC2879f) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(interfaceC2879f.apply(it.next()));
        }
        return arrayList;
    }

    public static <T> SparseArray<Bundle> e(SparseArray<T> sparseArray, InterfaceC2879f<T, Bundle> interfaceC2879f) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), interfaceC2879f.apply(sparseArray.valueAt(i)));
        }
        return sparseArray2;
    }
}
