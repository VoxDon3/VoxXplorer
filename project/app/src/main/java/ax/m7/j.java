/*
 * Decompiled with CFR 0.152.
 */
package ax.m7;

import ax.m7.D;
import ax.m7.g;
import ax.m7.n;
import ax.m7.s;
import ax.m7.v;
import ax.q7.c;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

public class j {
    private static final Map<Field, j> e = new WeakHashMap<Field, j>();
    private final boolean a;
    private final Field b;
    private final Method[] c;
    private final String d;

    j(Field field, String string) {
        this.b = field;
        string = string == null ? null : string.intern();
        this.d = string;
        this.a = g.e(this.f());
        this.c = this.n(field);
    }

    public static Object c(Field object, Object object2) {
        try {
            object = ((Field)object).get(object2);
            return object;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new IllegalArgumentException(illegalAccessException);
        }
    }

    public static j j(Enum<?> enum_) {
        boolean bl;
        j j8;
        try {
            j8 = j.k(enum_.getClass().getField(enum_.name()));
            bl = j8 != null;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            throw new RuntimeException(noSuchFieldException);
        }
        v.c(bl, "enum constant missing @Value or @NullValue annotation: %s", enum_);
        return j8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static j k(Field field) {
        Object object = null;
        if (field == null) {
            return null;
        }
        Map<Field, j> map = e;
        synchronized (map) {
            Throwable throwable2;
            block13: {
                Object object2;
                block11: {
                    boolean bl;
                    block12: {
                        try {
                            j j8 = map.get(field);
                            bl = field.isEnumConstant();
                            object2 = j8;
                            if (j8 != null) break block11;
                            if (bl) break block12;
                            object2 = j8;
                            if (Modifier.isStatic(field.getModifiers())) break block11;
                        }
                        catch (Throwable throwable2) {
                            break block13;
                        }
                    }
                    if (bl) {
                        object2 = field.getAnnotation(D.class);
                        if (object2 != null) {
                            object2 = object2.value();
                        } else {
                            if (field.getAnnotation(s.class) == null) {
                                return null;
                            }
                            object2 = object;
                        }
                    } else {
                        object2 = field.getAnnotation(n.class);
                        if (object2 == null) {
                            return null;
                        }
                        object2 = object2.value();
                        ((AccessibleObject)field).setAccessible(true);
                    }
                    object = object2;
                    if ("##default".equals(object2)) {
                        object = field.getName();
                    }
                    object2 = new j(field, (String)object);
                    map.put(field, (j)object2);
                }
                return object2;
            }
            throw throwable2;
        }
    }

    public static void l(Field field, Object object, Object object2) {
        if (Modifier.isFinal(field.getModifiers())) {
            Object object3 = j.c(field, object);
            if (object2 == null ? object3 == null : object2.equals(object3)) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("expected final value <");
            stringBuilder.append(object3);
            stringBuilder.append("> but was <");
            stringBuilder.append(object2);
            stringBuilder.append("> on ");
            stringBuilder.append(field.getName());
            stringBuilder.append(" field in ");
            stringBuilder.append(object.getClass().getName());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        try {
            field.set(object, object2);
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new IllegalArgumentException(illegalAccessException);
        }
        catch (SecurityException securityException) {
            throw new IllegalArgumentException(securityException);
        }
    }

    private Method[] n(Field field) {
        ArrayList<Method> arrayList = new ArrayList<Method>();
        for (Method method : field.getDeclaringClass().getDeclaredMethods()) {
            String string = ax.q7.c.e(method.getName());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("set");
            stringBuilder.append(ax.q7.c.e(field.getName()));
            if (!string.equals(stringBuilder.toString()) || method.getParameterTypes().length != 1) continue;
            arrayList.add(method);
        }
        return arrayList.toArray(new Method[0]);
    }

    public <T extends Enum<T>> T a() {
        return (T)Enum.valueOf(this.b.getDeclaringClass(), this.b.getName());
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

    public Object g(Object object) {
        return j.c(this.b, object);
    }

    public boolean h() {
        return Modifier.isFinal(this.b.getModifiers());
    }

    public boolean i() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void m(Object object, Object object2) {
        Method[] methodArray = this.c;
        if (methodArray.length > 0) {
            for (Method method : methodArray) {
                if (object2 != null && !method.getParameterTypes()[0].isAssignableFrom(object2.getClass())) continue;
                try {
                    method.invoke(object, object2);
                    return;
                }
                catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {}
            }
        }
        j.l(this.b, object, object2);
    }
}

