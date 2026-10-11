/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import ax.B.k;

public class i {
    private static final k<ClassLoader, k<String, Class<?>>> a = new k();

    static boolean b(ClassLoader classLoader, String string) {
        try {
            boolean bl = Fragment.class.isAssignableFrom(i.c(classLoader, string));
            return bl;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }

    private static Class<?> c(ClassLoader object, String string) throws ClassNotFoundException {
        k<ClassLoader, k<String, Class<?>>> k8 = a;
        Object object2 = k8.get((ClassLoader)object);
        k<String, Class<Object>> k9 = object2;
        if (object2 == null) {
            k9 = new k();
            k8.put((ClassLoader)object, k9);
        }
        if ((object2 = k9.get(string)) == null) {
            object = Class.forName(string, false, (ClassLoader)object);
            k9.put(string, (Class<Object>)object);
            return object;
        }
        return object2;
    }

    public static Class<? extends Fragment> d(ClassLoader object, String string) {
        try {
            object = i.c((ClassLoader)object, string);
            return object;
        }
        catch (ClassCastException classCastException) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Unable to instantiate fragment ");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(": make sure class is a valid subclass of Fragment");
            throw new Fragment.h(((StringBuilder)object).toString(), classCastException);
        }
        catch (ClassNotFoundException classNotFoundException) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Unable to instantiate fragment ");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(": make sure class name exists");
            throw new Fragment.h(((StringBuilder)object).toString(), classNotFoundException);
        }
    }

    public Fragment a(ClassLoader classLoader, String string) {
        throw null;
    }
}

