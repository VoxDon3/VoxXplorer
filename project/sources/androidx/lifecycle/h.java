package androidx.lifecycle;

import ax.tb.C3139o;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class h {
    public static final h a = new h();
    private static final Map<Class<?>, Integer> b = new HashMap();
    private static final Map<Class<?>, List<Constructor<? extends b>>> c = new HashMap();

    private h() {
    }

    private final b a(Constructor<? extends b> constructor, Object obj) {
        try {
            b newInstance = constructor.newInstance(obj);
            ax.Gb.l.e(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return newInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private final Constructor<? extends b> b(Class<?> cls) {
        try {
            Package r1 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r1 != null ? r1.getName() : HttpUrl.FRAGMENT_ENCODE_SET;
            ax.Gb.l.e(name, "fullPackage");
            if (name.length() != 0) {
                ax.Gb.l.e(canonicalName, "name");
                canonicalName = canonicalName.substring(name.length() + 1);
                ax.Gb.l.e(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            ax.Gb.l.e(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c2 = c(canonicalName);
            if (name.length() != 0) {
                c2 = name + '.' + c2;
            }
            Class<?> cls2 = Class.forName(c2);
            ax.Gb.l.d(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public static final String c(String str) {
        ax.Gb.l.f(str, "className");
        return ax.Ob.h.D(str, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    private final int d(Class<?> cls) {
        Map<Class<?>, Integer> map = b;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g = g(cls);
        map.put(cls, Integer.valueOf(g));
        return g;
    }

    private final boolean e(Class<?> cls) {
        return cls != null && ax.G0.g.class.isAssignableFrom(cls);
    }

    public static final f f(Object obj) {
        ax.Gb.l.f(obj, "object");
        boolean z = obj instanceof f;
        boolean z2 = obj instanceof ax.G0.c;
        if (z && z2) {
            return new DefaultLifecycleObserverAdapter((ax.G0.c) obj, (f) obj);
        }
        if (z2) {
            return new DefaultLifecycleObserverAdapter((ax.G0.c) obj, null);
        }
        if (z) {
            return (f) obj;
        }
        Class<?> cls = obj.getClass();
        h hVar = a;
        if (hVar.d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends b>> list = c.get(cls);
        ax.Gb.l.c(list);
        List<Constructor<? extends b>> list2 = list;
        if (list2.size() == 1) {
            return new SingleGeneratedAdapterObserver(hVar.a(list2.get(0), obj));
        }
        int size = list2.size();
        b[] bVarArr = new b[size];
        for (int i = 0; i < size; i++) {
            bVarArr[i] = a.a(list2.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(bVarArr);
    }

    private final int g(Class<?> cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends b> b2 = b(cls);
        if (b2 != null) {
            c.put(cls, C3139o.d(b2));
            return 2;
        }
        if (a.c.d(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (e(superclass)) {
            ax.Gb.l.e(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends b>> list = c.get(superclass);
            ax.Gb.l.c(list);
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        ax.Gb.l.e(interfaces, "klass.interfaces");
        for (Class<?> cls2 : interfaces) {
            if (e(cls2)) {
                ax.Gb.l.e(cls2, "intrface");
                if (d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends b>> list2 = c.get(cls2);
                ax.Gb.l.c(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        c.put(cls, arrayList);
        return 2;
    }
}
