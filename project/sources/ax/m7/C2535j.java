package ax.m7;

import ax.q7.C2876c;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: ax.m7.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2535j {
    private static final Map<Field, C2535j> e = new WeakHashMap();
    private final boolean a;
    private final Field b;
    private final Method[] c;
    private final String d;

    C2535j(Field field, String str) {
        this.b = field;
        this.d = str == null ? null : str.intern();
        this.a = C2532g.e(f());
        this.c = n(field);
    }

    public static Object c(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static C2535j j(Enum<?> r5) {
        try {
            C2535j k = k(r5.getClass().getField(r5.name()));
            v.c(k != null, "enum constant missing @Value or @NullValue annotation: %s", r5);
            return k;
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static C2535j k(Field field) {
        String str = null;
        if (field == null) {
            return null;
        }
        Map<Field, C2535j> map = e;
        synchronized (map) {
            try {
                C2535j c2535j = map.get(field);
                boolean isEnumConstant = field.isEnumConstant();
                if (c2535j == null) {
                    if (!isEnumConstant) {
                        if (!Modifier.isStatic(field.getModifiers())) {
                        }
                    }
                    if (isEnumConstant) {
                        InterfaceC2525D interfaceC2525D = (InterfaceC2525D) field.getAnnotation(InterfaceC2525D.class);
                        if (interfaceC2525D != null) {
                            str = interfaceC2525D.value();
                        } else if (((s) field.getAnnotation(s.class)) == null) {
                            return null;
                        }
                    } else {
                        n nVar = (n) field.getAnnotation(n.class);
                        if (nVar == null) {
                            return null;
                        }
                        str = nVar.value();
                        field.setAccessible(true);
                    }
                    if ("##default".equals(str)) {
                        str = field.getName();
                    }
                    c2535j = new C2535j(field, str);
                    map.put(field, c2535j);
                }
                return c2535j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void l(Field field, Object obj, Object obj2) {
        if (!Modifier.isFinal(field.getModifiers())) {
            try {
                field.set(obj, obj2);
                return;
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException(e2);
            } catch (SecurityException e3) {
                throw new IllegalArgumentException(e3);
            }
        }
        Object c = c(field, obj);
        if (obj2 == null) {
            if (c == null) {
                return;
            }
        } else if (obj2.equals(c)) {
            return;
        }
        throw new IllegalArgumentException("expected final value <" + c + "> but was <" + obj2 + "> on " + field.getName() + " field in " + obj.getClass().getName());
    }

    private Method[] n(Field field) {
        ArrayList arrayList = new ArrayList();
        for (Method method : field.getDeclaringClass().getDeclaredMethods()) {
            if (C2876c.e(method.getName()).equals("set" + C2876c.e(field.getName())) && method.getParameterTypes().length == 1) {
                arrayList.add(method);
            }
        }
        return (Method[]) arrayList.toArray(new Method[0]);
    }

    public <T extends Enum<T>> T a() {
        return (T) Enum.valueOf(this.b.getDeclaringClass(), this.b.getName());
    }

    public Field b() {
        return this.b;
    }

    public Type d() {
        return this.b.getGenericType();
    }

    public String e() {
        return this.d;
    }

    public Class<?> f() {
        return this.b.getType();
    }

    public Object g(Object obj) {
        return c(this.b, obj);
    }

    public boolean h() {
        return Modifier.isFinal(this.b.getModifiers());
    }

    public boolean i() {
        return this.a;
    }

    public void m(Object obj, Object obj2) {
        Method[] methodArr = this.c;
        if (methodArr.length > 0) {
            for (Method method : methodArr) {
                if (obj2 == null || method.getParameterTypes()[0].isAssignableFrom(obj2.getClass())) {
                    try {
                        method.invoke(obj, obj2);
                        return;
                    } catch (IllegalAccessException | InvocationTargetException unused) {
                        continue;
                    }
                }
            }
        }
        l(this.b, obj, obj2);
    }
}
