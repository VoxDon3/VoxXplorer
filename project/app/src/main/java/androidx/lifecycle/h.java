/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.DefaultLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import androidx.lifecycle.a;
import androidx.lifecycle.b;
import androidx.lifecycle.f;
import ax.G0.c;
import ax.G0.g;
import ax.Gb.l;
import ax.tb.o;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class h {
    public static final h a = new h();
    private static final Map<Class<?>, Integer> b = new HashMap();
    private static final Map<Class<?>, List<Constructor<? extends b>>> c = new HashMap();

    private h() {
    }

    private final b a(Constructor<? extends b> object, Object object2) {
        IllegalAccessException illegalAccessException2;
        block5: {
            InstantiationException instantiationException2;
            block4: {
                try {
                    object = ((Constructor)object).newInstance(object2);
                    l.e(object, "{\n            constructo\u2026tance(`object`)\n        }");
                    object = (b)object;
                    return object;
                }
                catch (InvocationTargetException invocationTargetException) {
                }
                catch (InstantiationException instantiationException2) {
                    break block4;
                }
                catch (IllegalAccessException illegalAccessException2) {
                    break block5;
                }
                throw new RuntimeException(invocationTargetException);
            }
            throw new RuntimeException(instantiationException2);
        }
        throw new RuntimeException(illegalAccessException2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Constructor<? extends b> b(Class<?> genericDeclaration) {
        try {
            Object object = ((Class)genericDeclaration).getPackage();
            String string = ((Class)genericDeclaration).getCanonicalName();
            object = object != null ? ((Package)object).getName() : "";
            l.e(object, "fullPackage");
            if (object.length() != 0) {
                l.e(string, "name");
                string = string.substring(((String)object).length() + 1);
                l.e(string, "this as java.lang.String).substring(startIndex)");
            }
            l.e(string, "if (fullPackage.isEmpty(\u2026g(fullPackage.length + 1)");
            string = h.c(string);
            if (object.length() == 0) {
                object = string;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)object);
                stringBuilder.append('.');
                stringBuilder.append(string);
                object = stringBuilder.toString();
            }
            object = Class.forName((String)object);
            l.d(object, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            genericDeclaration = ((Class)object).getDeclaredConstructor(new Class[]{genericDeclaration});
            if (((AccessibleObject)((Object)genericDeclaration)).isAccessible()) return genericDeclaration;
            ((AccessibleObject)((Object)genericDeclaration)).setAccessible(true);
            return genericDeclaration;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new RuntimeException(noSuchMethodException);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }

    public static final String c(String string) {
        l.f(string, "className");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ax.Ob.h.D(string, ".", "_", false, 4, null));
        stringBuilder.append("_LifecycleAdapter");
        return stringBuilder.toString();
    }

    private final int d(Class<?> clazz) {
        Map<Class<?>, Integer> map = b;
        Integer n8 = map.get(clazz);
        if (n8 != null) {
            return n8;
        }
        int n9 = this.g(clazz);
        map.put(clazz, n9);
        return n9;
    }

    private final boolean e(Class<?> clazz) {
        return clazz != null && g.class.isAssignableFrom(clazz);
    }

    public static final f f(Object object) {
        l.f(object, "object");
        boolean bl = object instanceof f;
        boolean bl2 = object instanceof c;
        if (bl && bl2) {
            return new DefaultLifecycleObserverAdapter((c)object, (f)object);
        }
        if (bl2) {
            return new DefaultLifecycleObserverAdapter((c)object, null);
        }
        if (bl) {
            return (f)object;
        }
        b[] bArray = a;
        Class<?> clazz = object.getClass();
        if (bArray.d(clazz) == 2) {
            clazz = c.get(clazz);
            l.c(clazz);
            clazz = (List)((Object)clazz);
            int n8 = clazz.size();
            if (n8 == 1) {
                return new SingleGeneratedAdapterObserver(super.a((Constructor)clazz.get(0), object));
            }
            n8 = clazz.size();
            bArray = new b[n8];
            for (int i8 = 0; i8 < n8; ++i8) {
                bArray[i8] = a.a((Constructor)clazz.get(i8), object);
            }
            return new CompositeGeneratedAdaptersObserver(bArray);
        }
        return new ReflectiveGenericLifecycleObserver(object);
    }

    private final int g(Class<?> clazz) {
        List<Object> list;
        if (clazz.getCanonicalName() == null) {
            return 1;
        }
        Class<?> clazz2 = this.b(clazz);
        if (clazz2 != null) {
            c.put(clazz, o.d(clazz2));
            return 2;
        }
        if (androidx.lifecycle.a.c.d(clazz)) {
            return 1;
        }
        clazz2 = clazz.getSuperclass();
        if (this.e(clazz2)) {
            l.e(clazz2, "superclass");
            if (this.d(clazz2) == 1) {
                return 1;
            }
            clazz2 = c.get(clazz2);
            l.c(clazz2);
            list = new ArrayList((Collection)((Object)clazz2));
        } else {
            list = null;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        l.e(classArray, "klass.interfaces");
        for (Class<?> clazz3 : classArray) {
            if (!this.e(clazz3)) {
                clazz2 = list;
            } else {
                l.e(clazz3, "intrface");
                if (this.d(clazz3) == 1) {
                    return 1;
                }
                clazz2 = list;
                if (list == null) {
                    clazz2 = new ArrayList();
                }
                list = c.get(clazz3);
                l.c(list);
                clazz2.addAll(list);
            }
            list = clazz2;
        }
        if (list != null) {
            c.put(clazz, list);
            return 2;
        }
        return 1;
    }
}

