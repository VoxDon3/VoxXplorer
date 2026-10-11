package ax.m7;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: ax.m7.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2532g {
    public static final Boolean a;
    public static final String b;
    public static final Character c;
    public static final Byte d;
    public static final Short e;
    public static final Integer f;
    public static final Float g;
    public static final Long h;
    public static final Double i;
    public static final BigInteger j;
    public static final BigDecimal k;
    public static final C2534i l;
    private static final ConcurrentHashMap<Class<?>, Object> m;

    static {
        Boolean bool = new Boolean(true);
        a = bool;
        String str = new String();
        b = str;
        Character ch = new Character((char) 0);
        c = ch;
        Byte b2 = new Byte((byte) 0);
        d = b2;
        Short sh = new Short((short) 0);
        e = sh;
        Integer num = new Integer(0);
        f = num;
        Float f2 = new Float(0.0f);
        g = f2;
        Long l2 = new Long(0L);
        h = l2;
        Double d2 = new Double(0.0d);
        i = d2;
        BigInteger bigInteger = new BigInteger("0");
        j = bigInteger;
        BigDecimal bigDecimal = new BigDecimal("0");
        k = bigDecimal;
        C2534i c2534i = new C2534i(0L);
        l = c2534i;
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = new ConcurrentHashMap<>();
        m = concurrentHashMap;
        concurrentHashMap.put(Boolean.class, bool);
        concurrentHashMap.put(String.class, str);
        concurrentHashMap.put(Character.class, ch);
        concurrentHashMap.put(Byte.class, b2);
        concurrentHashMap.put(Short.class, sh);
        concurrentHashMap.put(Integer.class, num);
        concurrentHashMap.put(Float.class, f2);
        concurrentHashMap.put(Long.class, l2);
        concurrentHashMap.put(Double.class, d2);
        concurrentHashMap.put(BigInteger.class, bigInteger);
        concurrentHashMap.put(BigDecimal.class, bigDecimal);
        concurrentHashMap.put(C2534i.class, c2534i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T a(T t) {
        T t2;
        if (t == 0 || e(t.getClass())) {
            return t;
        }
        if (t instanceof k) {
            return (T) ((k) t).clone();
        }
        Class<?> cls = t.getClass();
        if (cls.isArray()) {
            t2 = (T) Array.newInstance(cls.getComponentType(), Array.getLength(t));
        } else if (t instanceof C2526a) {
            t2 = (T) ((C2526a) t).clone();
        } else {
            if ("java.util.Arrays$ArrayList".equals(cls.getName())) {
                Object[] array = ((List) t).toArray();
                c(array, array);
                return (T) Arrays.asList(array);
            }
            t2 = (T) C2524C.m(cls);
        }
        c(t, t2);
        return t2;
    }

    private static Object b(Class<?> cls) {
        int i2 = 0;
        if (cls.isArray()) {
            do {
                cls = cls.getComponentType();
                i2++;
            } while (cls.isArray());
            return Array.newInstance(cls, new int[i2]);
        }
        if (!cls.isEnum()) {
            return C2524C.m(cls);
        }
        C2535j b2 = C2531f.e(cls).b(null);
        v.f(b2, "enum missing constant with @NullValue annotation: %s", cls);
        return b2.a();
    }

    public static void c(Object obj, Object obj2) {
        Class<?> cls = obj.getClass();
        int i2 = 0;
        v.a(cls == obj2.getClass());
        if (cls.isArray()) {
            v.a(Array.getLength(obj) == Array.getLength(obj2));
            Iterator it = C2524C.l(obj).iterator();
            while (it.hasNext()) {
                Array.set(obj2, i2, a(it.next()));
                i2++;
            }
            return;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            Collection collection = (Collection) obj;
            if (ArrayList.class.isAssignableFrom(cls)) {
                ((ArrayList) obj2).ensureCapacity(collection.size());
            }
            Collection collection2 = (Collection) obj2;
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                collection2.add(a(it2.next()));
            }
            return;
        }
        boolean isAssignableFrom = k.class.isAssignableFrom(cls);
        if (isAssignableFrom || !Map.class.isAssignableFrom(cls)) {
            C2531f e2 = isAssignableFrom ? ((k) obj).d0 : C2531f.e(cls);
            Iterator<String> it3 = e2.d.iterator();
            while (it3.hasNext()) {
                C2535j b2 = e2.b(it3.next());
                if (!b2.h() && (!isAssignableFrom || !b2.i())) {
                    Object g2 = b2.g(obj);
                    if (g2 != null) {
                        b2.m(obj2, a(g2));
                    }
                }
            }
            return;
        }
        if (!C2526a.class.isAssignableFrom(cls)) {
            Map map = (Map) obj2;
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                map.put(entry.getKey(), a(entry.getValue()));
            }
            return;
        }
        C2526a c2526a = (C2526a) obj2;
        C2526a c2526a2 = (C2526a) obj;
        int size = c2526a2.size();
        while (i2 < size) {
            c2526a.n(i2, a(c2526a2.k(i2)));
            i2++;
        }
    }

    public static boolean d(Object obj) {
        return obj != null && obj == m.get(obj.getClass());
    }

    public static boolean e(Type type) {
        if (type instanceof WildcardType) {
            type = C2524C.c((WildcardType) type);
        }
        if (!(type instanceof Class)) {
            return false;
        }
        Class cls = (Class) type;
        return cls.isPrimitive() || cls == Character.class || cls == String.class || cls == Integer.class || cls == Long.class || cls == Short.class || cls == Byte.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == C2534i.class || cls == Boolean.class;
    }

    public static boolean f(Object obj) {
        return obj == null || e(obj.getClass());
    }

    public static Map<String, Object> g(Object obj) {
        return (obj == null || d(obj)) ? Collections.EMPTY_MAP : obj instanceof Map ? (Map) obj : new C2533h(obj, false);
    }

    public static Collection<Object> h(Type type) {
        if (type instanceof WildcardType) {
            type = C2524C.c((WildcardType) type);
        }
        if (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getRawType();
        }
        Class cls = type instanceof Class ? (Class) type : null;
        if (type == null || (type instanceof GenericArrayType) || (cls != null && (cls.isArray() || cls.isAssignableFrom(ArrayList.class)))) {
            return new ArrayList();
        }
        if (cls != null) {
            return cls.isAssignableFrom(HashSet.class) ? new HashSet() : cls.isAssignableFrom(TreeSet.class) ? new TreeSet() : (Collection) C2524C.m(cls);
        }
        throw new IllegalArgumentException("unable to create new instance of type: " + type);
    }

    public static Map<String, Object> i(Class<?> cls) {
        return (cls == null || cls.isAssignableFrom(C2526a.class)) ? C2526a.c() : cls.isAssignableFrom(TreeMap.class) ? new TreeMap() : (Map) C2524C.m(cls);
    }

    public static <T> T j(Class<T> cls) {
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = m;
        T t = (T) concurrentHashMap.get(cls);
        if (t != null) {
            return t;
        }
        T t2 = (T) b(cls);
        T t3 = (T) concurrentHashMap.putIfAbsent(cls, t2);
        return t3 == null ? t2 : t3;
    }

    public static Object k(Type type, String str) {
        Class cls = type instanceof Class ? (Class) type : null;
        if (type == null || cls != null) {
            if (cls == Void.class) {
                return null;
            }
            if (str == null || cls == null || cls.isAssignableFrom(String.class)) {
                return str;
            }
            if (cls == Character.class || cls == Character.TYPE) {
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                throw new IllegalArgumentException("expected type Character/char but got " + cls);
            }
            if (cls == Boolean.class || cls == Boolean.TYPE) {
                return Boolean.valueOf(str);
            }
            if (cls == Byte.class || cls == Byte.TYPE) {
                return Byte.valueOf(str);
            }
            if (cls == Short.class || cls == Short.TYPE) {
                return Short.valueOf(str);
            }
            if (cls == Integer.class || cls == Integer.TYPE) {
                return Integer.valueOf(str);
            }
            if (cls == Long.class || cls == Long.TYPE) {
                return Long.valueOf(str);
            }
            if (cls == Float.class || cls == Float.TYPE) {
                return Float.valueOf(str);
            }
            if (cls == Double.class || cls == Double.TYPE) {
                return Double.valueOf(str);
            }
            if (cls == C2534i.class) {
                return C2534i.c(str);
            }
            if (cls == BigInteger.class) {
                return new BigInteger(str);
            }
            if (cls == BigDecimal.class) {
                return new BigDecimal(str);
            }
            if (cls.isEnum()) {
                if (C2531f.e(cls).d.contains(str)) {
                    return C2531f.e(cls).b(str).a();
                }
                throw new IllegalArgumentException(String.format("given enum name %s not part of enumeration", str));
            }
        }
        throw new IllegalArgumentException("expected primitive class, but got: " + type);
    }

    public static Type l(List<Type> list, Type type) {
        if (type instanceof WildcardType) {
            type = C2524C.c((WildcardType) type);
        }
        while (type instanceof TypeVariable) {
            Type n = C2524C.n(list, (TypeVariable) type);
            if (n != null) {
                type = n;
            }
            if (type instanceof TypeVariable) {
                type = ((TypeVariable) type).getBounds()[0];
            }
        }
        return type;
    }
}
