/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.d;
import androidx.lifecycle.i;
import ax.G0.h;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
final class a {
    static a c = new a();
    private final Map<Class<?>, a> a = new HashMap();
    private final Map<Class<?>, Boolean> b = new HashMap();

    a() {
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private a a(Class<?> clazz, Method[] object) {
        Object var2_4;
        int n8;
        a a8;
        Class<?> clazz2 = clazz.getSuperclass();
        HashMap<b, d.a> hashMap = new HashMap<b, d.a>();
        if (clazz2 != null && (a8 = this.c(clazz2)) != null) {
            hashMap.putAll(a8.b);
        }
        Class<?>[] classArray = clazz.getInterfaces();
        int n9 = classArray.length;
        for (n8 = 0; n8 < n9; ++n8) {
            for (Map.Entry<b, d.a> entry : this.c(classArray[n8]).b.entrySet()) {
                this.e(hashMap, entry.getKey(), entry.getValue(), clazz);
            }
        }
        if (object == null) {
            Method[] methodArray = this.b(clazz);
        }
        int n10 = ((void)var2_4).length;
        boolean bl = false;
        for (n9 = 0; n9 < n10; ++n9) {
            void var8_12 = var2_4[n9];
            i i8 = var8_12.getAnnotation(i.class);
            if (i8 == null) continue;
            Class<?>[] classArray2 = var8_12.getParameterTypes();
            if (classArray2.length > 0) {
                if (!h.class.isAssignableFrom(classArray2[0])) throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                n8 = 1;
            } else {
                n8 = 0;
            }
            d.a a9 = i8.value();
            if (classArray2.length > 1) {
                if (!d.a.class.isAssignableFrom(classArray2[1])) throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                if (a9 != d.a.ON_ANY) throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                n8 = 2;
            }
            if (classArray2.length > 2) throw new IllegalArgumentException("cannot have more than 2 params");
            this.e(hashMap, new b(n8, (Method)var8_12), a9, clazz);
            bl = true;
        }
        a a10 = new a(hashMap);
        this.a.put(clazz, a10);
        this.b.put(clazz, bl);
        return a10;
    }

    private Method[] b(Class<?> methodArray) {
        try {
            methodArray = methodArray.getDeclaredMethods();
            return methodArray;
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", noClassDefFoundError);
        }
    }

    private void e(Map<b, d.a> object, b object2, d.a a8, Class<?> clazz) {
        d.a a9 = object.get(object2);
        if (a9 != null && a8 != a9) {
            object2 = ((b)object2).b;
            object = new StringBuilder();
            ((StringBuilder)object).append("Method ");
            ((StringBuilder)object).append(((Method)object2).getName());
            ((StringBuilder)object).append(" in ");
            ((StringBuilder)object).append(clazz.getName());
            ((StringBuilder)object).append(" already declared with different @OnLifecycleEvent value: previous value ");
            ((StringBuilder)object).append((Object)a9);
            ((StringBuilder)object).append(", new value ");
            ((StringBuilder)object).append((Object)a8);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        if (a9 == null) {
            object.put((b)object2, (d.a)a8);
        }
    }

    a c(Class<?> clazz) {
        a a8 = this.a.get(clazz);
        if (a8 != null) {
            return a8;
        }
        return this.a(clazz, null);
    }

    boolean d(Class<?> clazz) {
        Method[] methodArray = this.b.get(clazz);
        if (methodArray != null) {
            return methodArray.booleanValue();
        }
        methodArray = this.b(clazz);
        int n8 = methodArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (methodArray[i8].getAnnotation(i.class) == null) continue;
            this.a(clazz, methodArray);
            return true;
        }
        this.b.put(clazz, Boolean.FALSE);
        return false;
    }

    @Deprecated
    static class a {
        final Map<d.a, List<b>> a;
        final Map<b, d.a> b;

        a(Map<b, d.a> arrayList) {
            this.b = arrayList;
            this.a = new HashMap<d.a, List<b>>();
            for (Map.Entry<b, d.a> entry : arrayList.entrySet()) {
                d.a a8 = entry.getValue();
                List<b> list = this.a.get((Object)a8);
                arrayList = list;
                if (list == null) {
                    arrayList = new ArrayList<b>();
                    this.a.put(a8, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        private static void b(List<b> list, h h8, d.a a8, Object object) {
            if (list != null) {
                for (int i8 = list.size() - 1; i8 >= 0; --i8) {
                    list.get(i8).a(h8, a8, object);
                }
            }
        }

        void a(h h8, d.a a8, Object object) {
            androidx.lifecycle.a$a.b(this.a.get((Object)a8), h8, a8, object);
            androidx.lifecycle.a$a.b(this.a.get((Object)d.a.ON_ANY), h8, a8, object);
        }
    }

    @Deprecated
    static final class b {
        final int a;
        final Method b;

        b(int n8, Method method) {
            this.a = n8;
            this.b = method;
            ((AccessibleObject)method).setAccessible(true);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        void a(h h8, d.a a8, Object object) {
            try {
                int n8 = this.a;
                if (n8 == 0) {
                    this.b.invoke(object, null);
                    return;
                }
                if (n8 == 1) {
                    this.b.invoke(object, h8);
                    return;
                }
                if (n8 != 2) {
                    return;
                }
                this.b.invoke(object, new Object[]{h8, a8});
                return;
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new RuntimeException(illegalAccessException);
            }
            catch (InvocationTargetException invocationTargetException) {
                throw new RuntimeException("Failed to call observer method", invocationTargetException.getCause());
            }
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof b)) {
                return false;
            }
            object = (b)object;
            return this.a == ((b)object).a && this.b.getName().equals(((b)object).b.getName());
        }

        public int hashCode() {
            return this.a * 31 + this.b.getName().hashCode();
        }
    }
}

