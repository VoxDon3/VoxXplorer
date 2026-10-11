/*
 * Decompiled with CFR 0.152.
 */
package ax.Y;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;

public final class b {
    public static <T> T a(Bundle bundle, String string, Class<T> clazz) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(bundle, string, clazz);
        }
        if (clazz.isInstance(bundle = bundle.getParcelable(string))) {
            return (T)bundle;
        }
        return null;
    }

    static class a {
        static <T> T a(Bundle bundle, String string, Class<T> clazz) {
            return (T)bundle.getParcelable(string, clazz);
        }

        static <T> T[] b(Bundle bundle, String string, Class<T> clazz) {
            return bundle.getParcelableArray(string, clazz);
        }

        static <T> ArrayList<T> c(Bundle bundle, String string, Class<? extends T> clazz) {
            return bundle.getParcelableArrayList(string, clazz);
        }

        static <T extends Serializable> T d(Bundle bundle, String string, Class<T> clazz) {
            return (T)bundle.getSerializable(string, clazz);
        }

        static <T> SparseArray<T> e(Bundle bundle, String string, Class<? extends T> clazz) {
            return bundle.getSparseParcelableArray(string, clazz);
        }
    }
}

