/*
 * Decompiled with CFR 0.152.
 */
package ax.m7;

import ax.m7.v;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class C {
    private static Type a(Type type, Class<?> type2, int n8) {
        if ((type2 = C.h(type, type2)) == null) {
            return null;
        }
        if ((type2 = type2.getActualTypeArguments()[n8]) instanceof TypeVariable && (type = C.n(Arrays.asList(type), (TypeVariable)type2)) != null) {
            return type;
        }
        return type2;
    }

    public static Type b(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType)type).getGenericComponentType();
        }
        return ((Class)type).getComponentType();
    }

    public static Type c(WildcardType wildcardType) {
        Type[] typeArray = wildcardType.getLowerBounds();
        if (typeArray.length != 0) {
            return typeArray[0];
        }
        return wildcardType.getUpperBounds()[0];
    }

    public static Type d(Type type) {
        return C.a(type, Iterable.class, 0);
    }

    public static Type e(Type type) {
        return C.a(type, Map.class, 1);
    }

    public static Class<?> f(List<Type> list, Type type) {
        Type type2 = type;
        if (type instanceof TypeVariable) {
            type2 = C.n(list, (TypeVariable)type);
        }
        if (type2 instanceof GenericArrayType) {
            return Array.newInstance(C.f(list, C.b(type2)), 0).getClass();
        }
        if (type2 instanceof Class) {
            return (Class)type2;
        }
        if (type2 instanceof ParameterizedType) {
            return C.g((ParameterizedType)type2);
        }
        boolean bl = type2 == null;
        v.c(bl, "wildcard type is not supported: %s", type2);
        return Object.class;
    }

    public static Class<?> g(ParameterizedType parameterizedType) {
        return (Class)parameterizedType.getRawType();
    }

    public static ParameterizedType h(Type type, Class<?> clazz) {
        block10: {
            Type type2;
            block9: {
                type2 = type;
                if (type instanceof Class) break block9;
                if (!(type instanceof ParameterizedType)) break block10;
                type2 = type;
            }
            block0: while (type2 != null && type2 != Object.class) {
                if (type2 instanceof Class) {
                    type = (Class)type2;
                } else {
                    type = (ParameterizedType)type2;
                    if ((type2 = C.g((ParameterizedType)type)) == clazz) {
                        return type;
                    }
                    if (clazz.isInterface()) {
                        for (Type type3 : ((Class)type2).getGenericInterfaces()) {
                            type = type3 instanceof Class ? (Class<?>)type3 : C.g((ParameterizedType)type3);
                            if (!clazz.isAssignableFrom((Class<?>)type)) continue;
                            type2 = type3;
                            continue block0;
                        }
                    }
                    type = type2;
                }
                type2 = type.getGenericSuperclass();
            }
        }
        return null;
    }

    private static IllegalArgumentException i(Exception exception, Class<?> object) {
        StringBuilder stringBuilder = new StringBuilder("unable to create new instance of class ");
        stringBuilder.append(((Class)object).getName());
        ArrayList<String> arrayList = new ArrayList<String>();
        if (((Class)object).isArray()) {
            arrayList.add("because it is an array");
        } else if (((Class)object).isPrimitive()) {
            arrayList.add("because it is primitive");
        } else if (object == Void.class) {
            arrayList.add("because it is void");
        } else {
            if (Modifier.isInterface(((Class)object).getModifiers())) {
                arrayList.add("because it is an interface");
            } else if (Modifier.isAbstract(((Class)object).getModifiers())) {
                arrayList.add("because it is abstract");
            }
            if (((Class)object).getEnclosingClass() != null && !Modifier.isStatic(((Class)object).getModifiers())) {
                arrayList.add("because it is not static");
            }
            if (!Modifier.isPublic(((Class)object).getModifiers())) {
                arrayList.add("possibly because it is not public");
            } else {
                try {
                    ((Class)object).getConstructor(null);
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    arrayList.add("because it has no accessible default constructor");
                }
            }
        }
        int n8 = arrayList.size();
        boolean bl = false;
        int n9 = 0;
        while (n9 < n8) {
            object = arrayList.get(n9);
            ++n9;
            object = (String)object;
            if (bl) {
                stringBuilder.append(" and");
            } else {
                bl = true;
            }
            stringBuilder.append(" ");
            stringBuilder.append((String)object);
        }
        return new IllegalArgumentException(stringBuilder.toString(), exception);
    }

    public static boolean j(Type type) {
        return type instanceof GenericArrayType || type instanceof Class && ((Class)type).isArray();
        {
        }
    }

    public static boolean k(Class<?> clazz, Class<?> clazz2) {
        return clazz.isAssignableFrom(clazz2) || clazz2.isAssignableFrom(clazz);
        {
        }
    }

    public static <T> Iterable<T> l(Object object) {
        if (object instanceof Iterable) {
            return (Iterable)object;
        }
        Class<?> clazz = object.getClass();
        v.c(clazz.isArray(), "not an array or Iterable: %s", clazz);
        if (!clazz.getComponentType().isPrimitive()) {
            return Arrays.asList((Object[])object);
        }
        return new Iterable<T>(object){
            final Object q;
            {
                this.q = object;
            }

            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>(this){
                    int c0;
                    final a d0;
                    final int q;
                    {
                        this.d0 = a8;
                        this.q = Array.getLength(a8.q);
                        this.c0 = 0;
                    }

                    @Override
                    public boolean hasNext() {
                        return this.c0 < this.q;
                    }

                    @Override
                    public T next() {
                        if (this.hasNext()) {
                            Object object = this.d0.q;
                            int n8 = this.c0;
                            this.c0 = n8 + 1;
                            return Array.get(object, n8);
                        }
                        throw new NoSuchElementException();
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public static <T> T m(Class<T> clazz) {
        T t8;
        try {
            t8 = clazz.newInstance();
        }
        catch (InstantiationException instantiationException) {
            throw C.i(instantiationException, clazz);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw C.i(illegalAccessException, clazz);
        }
        return t8;
    }

    public static Type n(List<Type> object, TypeVariable<?> type) {
        Object object2 = type.getGenericDeclaration();
        if (object2 instanceof Class) {
            Class clazz = (Class)object2;
            int n8 = object.size();
            ParameterizedType parameterizedType = null;
            while (parameterizedType == null && --n8 >= 0) {
                parameterizedType = C.h(object.get(n8), clazz);
            }
            if (parameterizedType != null) {
                object2 = object2.getTypeParameters();
                for (n8 = 0; n8 < ((?)object2).length && !object2[n8].equals(type); ++n8) {
                }
                type = parameterizedType.getActualTypeArguments()[n8];
                if (type instanceof TypeVariable && (object = C.n(object, type)) != null) {
                    return object;
                }
                return type;
            }
        }
        return null;
    }

    public static Object o(Collection<?> object, Class<?> object2) {
        if (((Class)object2).isPrimitive()) {
            object2 = Array.newInstance(object2, object.size());
            object = object.iterator();
            int n8 = 0;
            while (object.hasNext()) {
                Array.set(object2, n8, object.next());
                ++n8;
            }
            return object2;
        }
        return object.toArray((Object[])Array.newInstance(object2, object.size()));
    }
}

