package ax.m7;

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

/* renamed from: ax.m7.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2524C {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: ax.m7.C$a */
    static class a<T> implements Iterable<T> {
        final /* synthetic */ Object q;

        /* renamed from: ax.m7.C$a$a, reason: collision with other inner class name */
        class C0373a implements Iterator<T> {
            int c0 = 0;
            final int q;

            C0373a() {
                this.q = Array.getLength(a.this.q);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.c0 < this.q;
            }

            @Override // java.util.Iterator
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = a.this.q;
                int i = this.c0;
                this.c0 = i + 1;
                return (T) Array.get(obj, i);
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        a(Object obj) {
            this.q = obj;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new C0373a();
        }
    }

    private static Type a(Type type, Class<?> cls, int i) {
        Type n;
        ParameterizedType h = h(type, cls);
        if (h == null) {
            return null;
        }
        Type type2 = h.getActualTypeArguments()[i];
        return (!(type2 instanceof TypeVariable) || (n = n(Arrays.asList(type), (TypeVariable) type2)) == null) ? type2 : n;
    }

    public static Type b(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static Type c(WildcardType wildcardType) {
        Type[] lowerBounds = wildcardType.getLowerBounds();
        return lowerBounds.length != 0 ? lowerBounds[0] : wildcardType.getUpperBounds()[0];
    }

    public static Type d(Type type) {
        return a(type, Iterable.class, 0);
    }

    public static Type e(Type type) {
        return a(type, Map.class, 1);
    }

    public static Class<?> f(List<Type> list, Type type) {
        if (type instanceof TypeVariable) {
            type = n(list, (TypeVariable) type);
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(f(list, b(type)), 0).getClass();
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return g((ParameterizedType) type);
        }
        v.c(type == null, "wildcard type is not supported: %s", type);
        return Object.class;
    }

    public static Class<?> g(ParameterizedType parameterizedType) {
        return (Class) parameterizedType.getRawType();
    }

    public static ParameterizedType h(Type type, Class<?> cls) {
        Class<?> cls2;
        if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
            return null;
        }
        while (type != null && type != Object.class) {
            if (type instanceof Class) {
                cls2 = (Class) type;
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class<?> g = g(parameterizedType);
                if (g == cls) {
                    return parameterizedType;
                }
                if (cls.isInterface()) {
                    for (Type type2 : g.getGenericInterfaces()) {
                        if (cls.isAssignableFrom(type2 instanceof Class ? (Class) type2 : g((ParameterizedType) type2))) {
                            type = type2;
                            break;
                        }
                    }
                }
                cls2 = g;
            }
            type = cls2.getGenericSuperclass();
        }
        return null;
    }

    private static IllegalArgumentException i(Exception exc, Class<?> cls) {
        StringBuilder sb = new StringBuilder("unable to create new instance of class ");
        sb.append(cls.getName());
        ArrayList arrayList = new ArrayList();
        if (cls.isArray()) {
            arrayList.add("because it is an array");
        } else if (cls.isPrimitive()) {
            arrayList.add("because it is primitive");
        } else if (cls == Void.class) {
            arrayList.add("because it is void");
        } else {
            if (Modifier.isInterface(cls.getModifiers())) {
                arrayList.add("because it is an interface");
            } else if (Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add("because it is abstract");
            }
            if (cls.getEnclosingClass() != null && !Modifier.isStatic(cls.getModifiers())) {
                arrayList.add("because it is not static");
            }
            if (Modifier.isPublic(cls.getModifiers())) {
                try {
                    cls.getConstructor(null);
                } catch (NoSuchMethodException unused) {
                    arrayList.add("because it has no accessible default constructor");
                }
            } else {
                arrayList.add("possibly because it is not public");
            }
        }
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            if (z) {
                sb.append(" and");
            } else {
                z = true;
            }
            sb.append(" ");
            sb.append(str);
        }
        return new IllegalArgumentException(sb.toString(), exc);
    }

    public static boolean j(Type type) {
        if (type instanceof GenericArrayType) {
            return true;
        }
        return (type instanceof Class) && ((Class) type).isArray();
    }

    public static boolean k(Class<?> cls, Class<?> cls2) {
        return cls.isAssignableFrom(cls2) || cls2.isAssignableFrom(cls);
    }

    public static <T> Iterable<T> l(Object obj) {
        if (obj instanceof Iterable) {
            return (Iterable) obj;
        }
        Class<?> cls = obj.getClass();
        v.c(cls.isArray(), "not an array or Iterable: %s", cls);
        return !cls.getComponentType().isPrimitive() ? Arrays.asList((Object[]) obj) : new a(obj);
    }

    public static <T> T m(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw i(e, cls);
        } catch (InstantiationException e2) {
            throw i(e2, cls);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.GenericDeclaration] */
    public static Type n(List<Type> list, TypeVariable<?> typeVariable) {
        Type n;
        ?? genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            Class cls = (Class) genericDeclaration;
            int size = list.size();
            ParameterizedType parameterizedType = null;
            while (parameterizedType == null) {
                size--;
                if (size < 0) {
                    break;
                }
                parameterizedType = h(list.get(size), cls);
            }
            if (parameterizedType != null) {
                TypeVariable<?>[] typeParameters = genericDeclaration.getTypeParameters();
                int i = 0;
                while (i < typeParameters.length && !typeParameters[i].equals(typeVariable)) {
                    i++;
                }
                Type type = parameterizedType.getActualTypeArguments()[i];
                return (!(type instanceof TypeVariable) || (n = n(list, (TypeVariable) type)) == null) ? type : n;
            }
        }
        return null;
    }

    public static Object o(Collection<?> collection, Class<?> cls) {
        if (!cls.isPrimitive()) {
            return collection.toArray((Object[]) Array.newInstance(cls, collection.size()));
        }
        Object newInstance = Array.newInstance(cls, collection.size());
        Iterator<?> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Array.set(newInstance, i, it.next());
            i++;
        }
        return newInstance;
    }
}
