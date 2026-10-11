package ax.Gb;

import ax.sb.C3081m;
import ax.sb.InterfaceC3071c;
import ax.tb.C3115F;
import ax.tb.C3139o;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class e implements ax.Mb.b<Object>, d {
    public static final a b = new a(null);
    private static final Map<Class<? extends InterfaceC3071c<?>>, Integer> c;
    private static final HashMap<String, String> d;
    private static final HashMap<String, String> e;
    private static final HashMap<String, String> f;
    private static final Map<String, String> g;
    private final Class<?> a;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final String a(Class<?> cls) {
            String str;
            l.f(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass()) {
                return null;
            }
            if (!cls.isLocalClass()) {
                if (!cls.isArray()) {
                    String str3 = (String) e.g.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) e.g.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                return str2 == null ? "Array" : str2;
            }
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                l.c(simpleName);
                String x0 = ax.Ob.h.x0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                if (x0 != null) {
                    return x0;
                }
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                l.c(simpleName);
                return ax.Ob.h.w0(simpleName, '$', null, 2, null);
            }
            l.c(simpleName);
            return ax.Ob.h.x0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 0;
        List l = C3139o.l(ax.Fb.a.class, ax.Fb.l.class, ax.Fb.p.class, ax.Fb.q.class, ax.Fb.r.class, ax.Fb.s.class, ax.Fb.t.class, ax.Fb.u.class, ax.Fb.v.class, ax.Fb.w.class, ax.Fb.b.class, ax.Fb.c.class, ax.Fb.d.class, ax.Fb.e.class, ax.Fb.f.class, ax.Fb.g.class, ax.Fb.h.class, ax.Fb.i.class, ax.Fb.j.class, ax.Fb.k.class, ax.Fb.m.class, ax.Fb.n.class, ax.Fb.o.class);
        ArrayList arrayList = new ArrayList(C3139o.s(l, 10));
        for (Object obj : l) {
            int i2 = i + 1;
            if (i < 0) {
                C3139o.r();
            }
            arrayList.add(ax.sb.q.a((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        c = C3115F.n(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        e = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        l.e(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            l.c(str);
            sb.append(ax.Ob.h.z0(str, '.', null, 2, null));
            sb.append("CompanionObject");
            C3081m a2 = ax.sb.q.a(sb.toString(), str + ".Companion");
            hashMap3.put(a2.c(), a2.d());
        }
        for (Map.Entry<Class<? extends InterfaceC3071c<?>>, Integer> entry : c.entrySet()) {
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C3115F.d(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            l.c(str2);
            linkedHashMap.put(key, ax.Ob.h.z0(str2, '.', null, 2, null));
        }
        g = linkedHashMap;
    }

    public e(Class<?> cls) {
        l.f(cls, "jClass");
        this.a = cls;
    }

    @Override // ax.Mb.b
    public String a() {
        return b.a(b());
    }

    @Override // ax.Gb.d
    public Class<?> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && l.a(ax.Eb.a.b(this), ax.Eb.a.b((ax.Mb.b) obj));
    }

    public int hashCode() {
        return ax.Eb.a.b(this).hashCode();
    }

    public String toString() {
        return b() + " (Kotlin reflection is not available)";
    }
}
