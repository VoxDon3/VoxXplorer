/*
 * Decompiled with CFR 0.152.
 */
package ax.t8;

import ax.r8.e;
import ax.r8.j;
import ax.r8.t;
import ax.t8.g;
import ax.t8.h;
import ax.t8.k;
import ax.t8.m;
import ax.w8.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public final class c {
    private final Map<Type, e<?>> a;
    private final boolean b;
    private final List<t> c;

    public c(Map<Type, e<?>> map, boolean bl, List<t> list) {
        this.a = map;
        this.b = bl;
        this.c = list;
    }

    private static <T> h<T> b(Class<? super T> object, t.a object2) {
        t.a a8;
        Constructor<T> constructor;
        if (Modifier.isAbstract(((Class)object).getModifiers())) {
            return null;
        }
        try {
            constructor = ((Class)object).getDeclaredConstructor(null);
            a8 = t.a.q;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return null;
        }
        if (object2 != a8 && (!k.a(constructor, null) || object2 == t.a.e0 && !Modifier.isPublic(constructor.getModifiers()))) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Unable to invoke no-args constructor of ");
            ((StringBuilder)object2).append(object);
            ((StringBuilder)object2).append("; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
            return new h<T>(((StringBuilder)object2).toString()){
                final String a;
                {
                    this.a = string;
                }

                @Override
                public T a() {
                    throw new j(this.a);
                }
            };
        }
        if (object2 == a8 && (object = ax.w8.a.d(constructor)) != null) {
            return new h<T>((String)object){
                final String a;
                {
                    this.a = string;
                }

                @Override
                public T a() {
                    throw new j(this.a);
                }
            };
        }
        return new h<T>(constructor){
            final Constructor a;
            {
                this.a = constructor;
            }

            @Override
            public T a() {
                InstantiationException instantiationException2;
                block5: {
                    InvocationTargetException invocationTargetException2;
                    block4: {
                        Object t8;
                        try {
                            t8 = this.a.newInstance(null);
                        }
                        catch (IllegalAccessException illegalAccessException) {
                        }
                        catch (InvocationTargetException invocationTargetException2) {
                            break block4;
                        }
                        catch (InstantiationException instantiationException2) {
                            break block5;
                        }
                        return t8;
                        throw ax.w8.a.b(illegalAccessException);
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed to invoke ");
                    stringBuilder.append(this.a);
                    stringBuilder.append(" with no args");
                    throw new RuntimeException(stringBuilder.toString(), invocationTargetException2.getTargetException());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to invoke ");
                stringBuilder.append(this.a);
                stringBuilder.append(" with no args");
                throw new RuntimeException(stringBuilder.toString(), instantiationException2);
            }
        };
    }

    private static <T> h<T> c(Type type, Class<? super T> clazz) {
        if (Collection.class.isAssignableFrom(clazz)) {
            if (SortedSet.class.isAssignableFrom(clazz)) {
                return new h<T>(){

                    @Override
                    public T a() {
                        return new TreeSet();
                    }
                };
            }
            if (Set.class.isAssignableFrom(clazz)) {
                return new h<T>(){

                    @Override
                    public T a() {
                        return new LinkedHashSet();
                    }
                };
            }
            if (Queue.class.isAssignableFrom(clazz)) {
                return new h<T>(){

                    @Override
                    public T a() {
                        return new ArrayDeque();
                    }
                };
            }
            return new h<T>(){

                @Override
                public T a() {
                    return new ArrayList();
                }
            };
        }
        if (Map.class.isAssignableFrom(clazz)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(clazz)) {
                return new h<T>(){

                    @Override
                    public T a() {
                        return new ConcurrentSkipListMap();
                    }
                };
            }
            if (ConcurrentMap.class.isAssignableFrom(clazz)) {
                return new h<T>(){

                    @Override
                    public T a() {
                        return new j.ConcurrentHashMap();
                    }
                };
            }
            if (SortedMap.class.isAssignableFrom(clazz)) {
                return new h<T>(){

                    @Override
                    public T a() {
                        return new TreeMap();
                    }
                };
            }
            if (type instanceof ParameterizedType && !String.class.isAssignableFrom(ax.x8.a.b(((ParameterizedType)type).getActualTypeArguments()[0]).c())) {
                return new h<T>(){

                    @Override
                    public T a() {
                        return new LinkedHashMap();
                    }
                };
            }
            return new h<T>(){

                @Override
                public T a() {
                    return new g();
                }
            };
        }
        return null;
    }

    private static <T> h<T> d(Type type, Class<? super T> clazz) {
        if (EnumSet.class.isAssignableFrom(clazz)) {
            return new h<T>(type){
                final Type a;
                {
                    this.a = type;
                }

                @Override
                public T a() {
                    Object object = this.a;
                    if (object instanceof ParameterizedType) {
                        if ((object = ((ParameterizedType)object).getActualTypeArguments()[0]) instanceof Class) {
                            return EnumSet.noneOf((Class)object);
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Invalid EnumSet type: ");
                        ((StringBuilder)object).append(this.a.toString());
                        throw new j(((StringBuilder)object).toString());
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Invalid EnumSet type: ");
                    ((StringBuilder)object).append(this.a.toString());
                    throw new j(((StringBuilder)object).toString());
                }
            };
        }
        if (clazz == EnumMap.class) {
            return new h<T>(type){
                final Type a;
                {
                    this.a = type;
                }

                @Override
                public T a() {
                    Object object = this.a;
                    if (object instanceof ParameterizedType) {
                        if ((object = ((ParameterizedType)object).getActualTypeArguments()[0]) instanceof Class) {
                            return new EnumMap((Class)object);
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Invalid EnumMap type: ");
                        ((StringBuilder)object).append(this.a.toString());
                        throw new j(((StringBuilder)object).toString());
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Invalid EnumMap type: ");
                    ((StringBuilder)object).append(this.a.toString());
                    throw new j(((StringBuilder)object).toString());
                }
            };
        }
        return null;
    }

    private <T> h<T> e(Class<? super T> clazz) {
        if (this.b) {
            return new h<T>(this, clazz){
                private final m a;
                final Class b;
                final c c;
                {
                    this.c = c8;
                    this.b = clazz;
                    this.a = m.d();
                }

                @Override
                public T a() {
                    Object t8;
                    try {
                        t8 = this.a.e(this.b);
                    }
                    catch (Exception exception) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unable to create instance of ");
                        stringBuilder.append(this.b);
                        stringBuilder.append(". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.");
                        throw new RuntimeException(stringBuilder.toString(), exception);
                    }
                    return t8;
                }
            };
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to create instance of ");
        stringBuilder.append(clazz);
        stringBuilder.append("; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
        return new h<T>(this, stringBuilder.toString()){
            final String a;
            final c b;
            {
                this.b = c8;
                this.a = string;
            }

            @Override
            public T a() {
                throw new j(this.a);
            }
        };
    }

    public <T> h<T> a(ax.x8.a<T> object) {
        Object object2 = ((ax.x8.a)object).d();
        object = ((ax.x8.a)object).c();
        Object object3 = this.a.get(object2);
        if (object3 != null) {
            return new h<T>(this, (e)object3, (Type)object2){
                final e a;
                final Type b;
                final c c;
                {
                    this.c = c8;
                    this.a = e8;
                    this.b = type;
                }

                @Override
                public T a() {
                    return this.a.a(this.b);
                }
            };
        }
        object3 = this.a.get(object);
        if (object3 != null) {
            return new h<T>(this, (e)object3, (Type)object2){
                final e a;
                final Type b;
                final c c;
                {
                    this.c = c8;
                    this.a = e8;
                    this.b = type;
                }

                @Override
                public T a() {
                    return this.a.a(this.b);
                }
            };
        }
        object3 = ax.t8.c.d((Type)object2, object);
        if (object3 != null) {
            return object3;
        }
        object3 = k.b(this.c, object);
        h<T> h8 = ax.t8.c.b(object, (t.a)((Object)object3));
        if (h8 != null) {
            return h8;
        }
        if ((object2 = ax.t8.c.c((Type)object2, object)) != null) {
            return object2;
        }
        object2 = m.c(object);
        if (object2 != null) {
            return new h<T>(this, (String)object2){
                final String a;
                final c b;
                {
                    this.b = c8;
                    this.a = string;
                }

                @Override
                public T a() {
                    throw new j(this.a);
                }
            };
        }
        if (object3 == t.a.q) {
            return this.e((Class<? super T>)object);
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Unable to create instance of ");
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append("; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
        return new h<T>(this, ((StringBuilder)object2).toString()){
            final String a;
            final c b;
            {
                this.b = c8;
                this.a = string;
            }

            @Override
            public T a() {
                throw new j(this.a);
            }
        };
    }

    public String toString() {
        return this.a.toString();
    }
}

