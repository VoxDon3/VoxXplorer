package ax.t8;

import ax.r8.C3001j;
import ax.r8.InterfaceC2996e;
import ax.r8.InterfaceC3011t;
import ax.w8.C3374a;
import ax.x8.C3475a;
import j$.util.concurrent.ConcurrentHashMap;
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

/* loaded from: classes3.dex */
public final class c {
    private final Map<Type, InterfaceC2996e<?>> a;
    private final boolean b;
    private final List<InterfaceC3011t> c;

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements ax.t8.h<T> {
        a() {
        }

        @Override // ax.t8.h
        public T a() {
            return (T) new TreeSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class b<T> implements ax.t8.h<T> {
        b() {
        }

        @Override // ax.t8.h
        public T a() {
            return (T) new LinkedHashSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: ax.t8.c$c, reason: collision with other inner class name */
    class C0461c<T> implements ax.t8.h<T> {
        C0461c() {
        }

        @Override // ax.t8.h
        public T a() {
            return (T) new ArrayDeque();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class d<T> implements ax.t8.h<T> {
        d() {
        }

        @Override // ax.t8.h
        public T a() {
            return (T) new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class e<T> implements ax.t8.h<T> {
        e() {
        }

        @Override // ax.t8.h
        public T a() {
            return (T) new ConcurrentSkipListMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class f<T> implements ax.t8.h<T> {
        f() {
        }

        @Override // ax.t8.h
        public T a() {
            return (T) new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class g<T> implements ax.t8.h<T> {
        g() {
        }

        @Override // ax.t8.h
        public T a() {
            return (T) new TreeMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class h<T> implements ax.t8.h<T> {
        h() {
        }

        @Override // ax.t8.h
        public T a() {
            return (T) new LinkedHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class i<T> implements ax.t8.h<T> {
        i() {
        }

        @Override // ax.t8.h
        public T a() {
            return (T) new ax.t8.g();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class j<T> implements ax.t8.h<T> {
        private final ax.t8.m a = ax.t8.m.d();
        final /* synthetic */ Class b;

        j(Class cls) {
            this.b = cls;
        }

        @Override // ax.t8.h
        public T a() {
            try {
                return (T) this.a.e(this.b);
            } catch (Exception e) {
                throw new RuntimeException("Unable to create instance of " + this.b + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class k<T> implements ax.t8.h<T> {
        final /* synthetic */ InterfaceC2996e a;
        final /* synthetic */ Type b;

        k(InterfaceC2996e interfaceC2996e, Type type) {
            this.a = interfaceC2996e;
            this.b = type;
        }

        @Override // ax.t8.h
        public T a() {
            return (T) this.a.a(this.b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class l<T> implements ax.t8.h<T> {
        final /* synthetic */ String a;

        l(String str) {
            this.a = str;
        }

        @Override // ax.t8.h
        public T a() {
            throw new C3001j(this.a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class m<T> implements ax.t8.h<T> {
        final /* synthetic */ InterfaceC2996e a;
        final /* synthetic */ Type b;

        m(InterfaceC2996e interfaceC2996e, Type type) {
            this.a = interfaceC2996e;
            this.b = type;
        }

        @Override // ax.t8.h
        public T a() {
            return (T) this.a.a(this.b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class n<T> implements ax.t8.h<T> {
        final /* synthetic */ String a;

        n(String str) {
            this.a = str;
        }

        @Override // ax.t8.h
        public T a() {
            throw new C3001j(this.a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class o<T> implements ax.t8.h<T> {
        final /* synthetic */ String a;

        o(String str) {
            this.a = str;
        }

        @Override // ax.t8.h
        public T a() {
            throw new C3001j(this.a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class p<T> implements ax.t8.h<T> {
        final /* synthetic */ Type a;

        p(Type type) {
            this.a = type;
        }

        @Override // ax.t8.h
        public T a() {
            Type type = this.a;
            if (!(type instanceof ParameterizedType)) {
                throw new C3001j("Invalid EnumSet type: " + this.a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) EnumSet.noneOf((Class) type2);
            }
            throw new C3001j("Invalid EnumSet type: " + this.a.toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class q<T> implements ax.t8.h<T> {
        final /* synthetic */ Type a;

        q(Type type) {
            this.a = type;
        }

        @Override // ax.t8.h
        public T a() {
            Type type = this.a;
            if (!(type instanceof ParameterizedType)) {
                throw new C3001j("Invalid EnumMap type: " + this.a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) new EnumMap((Class) type2);
            }
            throw new C3001j("Invalid EnumMap type: " + this.a.toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class r<T> implements ax.t8.h<T> {
        final /* synthetic */ String a;

        r(String str) {
            this.a = str;
        }

        @Override // ax.t8.h
        public T a() {
            throw new C3001j(this.a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class s<T> implements ax.t8.h<T> {
        final /* synthetic */ String a;

        s(String str) {
            this.a = str;
        }

        @Override // ax.t8.h
        public T a() {
            throw new C3001j(this.a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class t<T> implements ax.t8.h<T> {
        final /* synthetic */ Constructor a;

        t(Constructor constructor) {
            this.a = constructor;
        }

        @Override // ax.t8.h
        public T a() {
            try {
                return (T) this.a.newInstance(null);
            } catch (IllegalAccessException e) {
                throw C3374a.b(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Failed to invoke " + this.a + " with no args", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to invoke " + this.a + " with no args", e3.getTargetException());
            }
        }
    }

    public c(Map<Type, InterfaceC2996e<?>> map, boolean z, List<InterfaceC3011t> list) {
        this.a = map;
        this.b = z;
        this.c = list;
    }

    private static <T> ax.t8.h<T> b(Class<? super T> cls, InterfaceC3011t.a aVar) {
        String d2;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(null);
            InterfaceC3011t.a aVar2 = InterfaceC3011t.a.ALLOW;
            if (aVar == aVar2 || (ax.t8.k.a(declaredConstructor, null) && (aVar != InterfaceC3011t.a.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return (aVar != aVar2 || (d2 = C3374a.d(declaredConstructor)) == null) ? new t(declaredConstructor) : new s(d2);
            }
            return new r("Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static <T> ax.t8.h<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new a() : Set.class.isAssignableFrom(cls) ? new b() : Queue.class.isAssignableFrom(cls) ? new C0461c() : new d();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new e() : ConcurrentMap.class.isAssignableFrom(cls) ? new f() : SortedMap.class.isAssignableFrom(cls) ? new g() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C3475a.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) ? new i() : new h();
        }
        return null;
    }

    private static <T> ax.t8.h<T> d(Type type, Class<? super T> cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new p(type);
        }
        if (cls == EnumMap.class) {
            return new q(type);
        }
        return null;
    }

    private <T> ax.t8.h<T> e(Class<? super T> cls) {
        if (this.b) {
            return new j(cls);
        }
        return new l("Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    public <T> ax.t8.h<T> a(C3475a<T> c3475a) {
        Type d2 = c3475a.d();
        Class<? super T> c = c3475a.c();
        InterfaceC2996e<?> interfaceC2996e = this.a.get(d2);
        if (interfaceC2996e != null) {
            return new k(interfaceC2996e, d2);
        }
        InterfaceC2996e<?> interfaceC2996e2 = this.a.get(c);
        if (interfaceC2996e2 != null) {
            return new m(interfaceC2996e2, d2);
        }
        ax.t8.h<T> d3 = d(d2, c);
        if (d3 != null) {
            return d3;
        }
        InterfaceC3011t.a b2 = ax.t8.k.b(this.c, c);
        ax.t8.h<T> b3 = b(c, b2);
        if (b3 != null) {
            return b3;
        }
        ax.t8.h<T> c2 = c(d2, c);
        if (c2 != null) {
            return c2;
        }
        String c3 = ax.t8.m.c(c);
        if (c3 != null) {
            return new n(c3);
        }
        if (b2 == InterfaceC3011t.a.ALLOW) {
            return e(c);
        }
        return new o("Unable to create instance of " + c + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }

    public String toString() {
        return this.a.toString();
    }
}
