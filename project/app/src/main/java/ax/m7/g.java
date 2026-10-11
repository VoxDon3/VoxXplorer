/*
 * Decompiled with CFR 0.152.
 */
package ax.m7;

import ax.m7.C;
import ax.m7.a;
import ax.m7.f;
import ax.m7.h;
import ax.m7.i;
import ax.m7.j;
import ax.m7.k;
import ax.m7.v;
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
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class g {
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
    public static final i l;
    private static final j.ConcurrentHashMap<Class<?>, Object> m;

    static {
        j.ConcurrentHashMap concurrentHashMap;
        i i8;
        BigDecimal bigDecimal;
        BigInteger bigInteger;
        Double d8;
        Long l8;
        Float f8;
        Integer n8;
        Short s8;
        Byte by;
        Character c8;
        String string;
        Boolean bl;
        a = bl = new Boolean(true);
        b = string = new String();
        c = c8 = new Character('\u0000');
        d = by = new Byte(0);
        e = s8 = new Short(0);
        f = n8 = new Integer(0);
        g = f8 = new Float(0.0f);
        h = l8 = new Long(0L);
        i = d8 = new Double(0.0);
        j = bigInteger = new BigInteger("0");
        k = bigDecimal = new BigDecimal("0");
        l = i8 = new i(0L);
        m = concurrentHashMap = new j.ConcurrentHashMap();
        concurrentHashMap.put(Boolean.class, (Object)bl);
        concurrentHashMap.put(String.class, (Object)string);
        concurrentHashMap.put(Character.class, (Object)c8);
        concurrentHashMap.put(Byte.class, (Object)by);
        concurrentHashMap.put(Short.class, (Object)s8);
        concurrentHashMap.put(Integer.class, (Object)n8);
        concurrentHashMap.put(Float.class, (Object)f8);
        concurrentHashMap.put(Long.class, (Object)l8);
        concurrentHashMap.put(Double.class, (Object)d8);
        concurrentHashMap.put(BigInteger.class, (Object)bigInteger);
        concurrentHashMap.put(BigDecimal.class, (Object)bigDecimal);
        concurrentHashMap.put(i.class, (Object)i8);
    }

    public static <T> T a(T object) {
        if (object != null && !ax.m7.g.e(object.getClass())) {
            if (object instanceof k) {
                return (T)((k)object).b();
            }
            Object object2 = object.getClass();
            if (((Class)object2).isArray()) {
                object2 = Array.newInstance(((Class)object2).getComponentType(), Array.getLength(object));
            } else if (object instanceof a) {
                object2 = ((a)object).b();
            } else {
                if ("java.util.Arrays$ArrayList".equals(((Class)object2).getName())) {
                    object = ((List)object).toArray();
                    ax.m7.g.c(object, object);
                    return (T)Arrays.asList(object);
                }
                object2 = C.m(object2);
            }
            ax.m7.g.c(object, object2);
            return (T)object2;
        }
        return object;
    }

    private static Object b(Class<?> clazz) {
        int n8 = 0;
        if (clazz.isArray()) {
            int n9;
            Class<?> clazz2;
            do {
                clazz2 = clazz.getComponentType();
                n8 = n9 = n8 + 1;
                clazz = clazz2;
            } while (clazz2.isArray());
            return Array.newInstance(clazz2, new int[n9]);
        }
        if (clazz.isEnum()) {
            j j8 = ax.m7.f.e(clazz).b(null);
            v.f(j8, "enum missing constant with @NullValue annotation: %s", clazz);
            return j8.a();
        }
        return C.m(clazz);
    }

    /*
     * WARNING - void declaration
     */
    public static void c(Object iterator, Object object) {
        int n8;
        Class<?> object22 = iterator.getClass();
        Object object2 = object.getClass();
        int n9 = 0;
        boolean bl = true;
        boolean bl2 = object22 == object2;
        v.a(bl2);
        if (object22.isArray()) {
            bl2 = Array.getLength(iterator) == Array.getLength(object) ? bl : false;
            v.a(bl2);
            iterator = C.l(iterator).iterator();
            n8 = n9;
            while (iterator.hasNext()) {
                Array.set(object, n8, ax.m7.g.a(iterator.next()));
                ++n8;
            }
        } else if (Collection.class.isAssignableFrom(object22)) {
            iterator = (Collection)((Object)iterator);
            if (ArrayList.class.isAssignableFrom(object22)) {
                ((ArrayList)object).ensureCapacity(iterator.size());
            }
            object = (Collection)object;
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                object.add(ax.m7.g.a(iterator.next()));
            }
        } else {
            bl2 = k.class.isAssignableFrom(object22);
            if (!bl2 && Map.class.isAssignableFrom(object22)) {
                if (a.class.isAssignableFrom(object22)) {
                    object = (a)object;
                    iterator = (a)((Object)iterator);
                    n9 = ((a)((Object)iterator)).size();
                    for (n8 = 0; n8 < n9; ++n8) {
                        ((a)object).n(n8, ax.m7.g.a(((a)((Object)iterator)).k(n8)));
                    }
                } else {
                    object = (Map)object;
                    for (Map.Entry entry : ((Map)((Object)iterator)).entrySet()) {
                        object.put(entry.getKey(), ax.m7.g.a(entry.getValue()));
                    }
                }
            } else {
                Object var6_7;
                if (bl2) {
                    f f8 = ((k)((Object)iterator)).d0;
                } else {
                    f f9 = ax.m7.f.e(object22);
                }
                object2 = var6_7.d.iterator();
                while (object2.hasNext()) {
                    Object object3;
                    j j8 = var6_7.b((String)object2.next());
                    if (j8.h() || bl2 && j8.i() || (object3 = j8.g(iterator)) == null) continue;
                    j8.m(object, ax.m7.g.a(object3));
                }
            }
        }
    }

    public static boolean d(Object object) {
        return object != null && object == m.get(object.getClass());
    }

    public static boolean e(Type type) {
        Type type2 = type;
        if (type instanceof WildcardType) {
            type2 = C.c((WildcardType)type);
        }
        if (!(type2 instanceof Class)) {
            return false;
        }
        type = (Class)type2;
        return ((Class)type).isPrimitive() || type == Character.class || type == String.class || type == Integer.class || type == Long.class || type == Short.class || type == Byte.class || type == Float.class || type == Double.class || type == BigInteger.class || type == BigDecimal.class || type == i.class || type == Boolean.class;
        {
        }
    }

    public static boolean f(Object object) {
        return object == null || ax.m7.g.e(object.getClass());
        {
        }
    }

    public static Map<String, Object> g(Object object) {
        if (object != null && !ax.m7.g.d(object)) {
            if (object instanceof Map) {
                return (Map)object;
            }
            return new h(object, false);
        }
        return Collections.EMPTY_MAP;
    }

    public static Collection<Object> h(Type type) {
        Class clazz = type;
        if (type instanceof WildcardType) {
            clazz = C.c((WildcardType)type);
        }
        type = clazz;
        if (clazz instanceof ParameterizedType) {
            type = ((ParameterizedType)((Object)clazz)).getRawType();
        }
        clazz = type instanceof Class ? (Class)type : null;
        if (!(type == null || type instanceof GenericArrayType || clazz != null && (clazz.isArray() || clazz.isAssignableFrom(ArrayList.class)))) {
            if (clazz != null) {
                if (clazz.isAssignableFrom(HashSet.class)) {
                    return new HashSet<Object>();
                }
                if (clazz.isAssignableFrom(TreeSet.class)) {
                    return new TreeSet<Object>();
                }
                return (Collection)C.m(clazz);
            }
            clazz = new StringBuilder();
            ((StringBuilder)((Object)clazz)).append("unable to create new instance of type: ");
            ((StringBuilder)((Object)clazz)).append(type);
            throw new IllegalArgumentException(((StringBuilder)((Object)clazz)).toString());
        }
        return new ArrayList<Object>();
    }

    public static Map<String, Object> i(Class<?> clazz) {
        if (clazz != null && !clazz.isAssignableFrom(a.class)) {
            if (clazz.isAssignableFrom(TreeMap.class)) {
                return new TreeMap<String, Object>();
            }
            return (Map)C.m(clazz);
        }
        return ax.m7.a.c();
    }

    public static <T> T j(Class<T> object) {
        j.ConcurrentHashMap<Class<?>, Object> concurrentHashMap = m;
        Object object2 = concurrentHashMap.get(object);
        if (object2 == null) {
            object2 = ax.m7.g.b(object);
            if ((object = concurrentHashMap.putIfAbsent(object, object2)) == null) {
                return (T)object2;
            }
            return (T)object;
        }
        return (T)object2;
    }

    /*
     * Unable to fully structure code
     */
    public static Object k(Type var0, String var1_1) {
        block9: {
            block10: {
                block11: {
                    block12: {
                        block13: {
                            block14: {
                                block15: {
                                    block16: {
                                        block17: {
                                            block8: {
                                                var2_2 = var0 instanceof Class != false ? (Class)var0 : null;
                                                if (var0 != null && var2_2 == null) break block8;
                                                if (var2_2 == Void.class) {
                                                    return null;
                                                }
                                                if (var1_1 == null || var2_2 == null || var2_2.isAssignableFrom(String.class)) break block9;
                                                if (var2_2 == Character.class || var2_2 == Character.TYPE) break block10;
                                                if (var2_2 == Boolean.class || var2_2 == Boolean.TYPE) break block11;
                                                if (var2_2 == Byte.class || var2_2 == Byte.TYPE) break block12;
                                                if (var2_2 == Short.class || var2_2 == Short.TYPE) break block13;
                                                if (var2_2 == Integer.class || var2_2 == Integer.TYPE) break block14;
                                                if (var2_2 == Long.class || var2_2 == Long.TYPE) break block15;
                                                if (var2_2 == Float.class || var2_2 == Float.TYPE) break block16;
                                                if (var2_2 != Double.class && var2_2 != Double.TYPE) {
                                                    if (var2_2 == i.class) {
                                                        return ax.m7.i.c((String)var1_1);
                                                    }
                                                    if (var2_2 == BigInteger.class) {
                                                        return new BigInteger((String)var1_1);
                                                    }
                                                    if (var2_2 == BigDecimal.class) {
                                                        return new BigDecimal((String)var1_1);
                                                    }
                                                    if (var2_2.isEnum()) {
                                                        if (ax.m7.f.e(var2_2).d.contains(var1_1)) {
                                                            return ax.m7.f.e(var2_2).b((String)var1_1).a();
                                                        }
                                                        throw new IllegalArgumentException(String.format("given enum name %s not part of enumeration", new Object[]{var1_1}));
                                                    } else {
                                                        ** GOTO lbl25
                                                    }
                                                }
                                                break block17;
                                            }
                                            var1_1 = new StringBuilder();
                                            var1_1.append("expected primitive class, but got: ");
                                            var1_1.append(var0);
                                            throw new IllegalArgumentException(var1_1.toString());
                                        }
                                        return Double.valueOf((String)var1_1);
                                    }
                                    return Float.valueOf((String)var1_1);
                                }
                                return Long.valueOf((String)var1_1);
                            }
                            return Integer.valueOf((String)var1_1);
                        }
                        return Short.valueOf((String)var1_1);
                    }
                    return Byte.valueOf((String)var1_1);
                }
                return Boolean.valueOf((String)var1_1);
            }
            if (var1_1.length() == 1) {
                return Character.valueOf(var1_1.charAt(0));
            }
            var0 = new StringBuilder();
            var0.append("expected type Character/char but got ");
            var0.append(var2_2);
            throw new IllegalArgumentException(var0.toString());
        }
        return var1_1;
    }

    public static Type l(List<Type> list, Type type) {
        Type type2 = type;
        if (type instanceof WildcardType) {
            type2 = C.c((WildcardType)type);
        }
        while (type2 instanceof TypeVariable) {
            Type type3 = C.n(list, (TypeVariable)type2);
            type = type2;
            if (type3 != null) {
                type = type3;
            }
            type2 = type;
            if (!(type instanceof TypeVariable)) continue;
            type2 = ((TypeVariable)type).getBounds()[0];
        }
        return type2;
    }
}

