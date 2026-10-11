/*
 * Decompiled with CFR 0.152.
 */
package ax.Gb;

import ax.Fb.b;
import ax.Fb.f;
import ax.Fb.i;
import ax.Fb.j;
import ax.Fb.k;
import ax.Fb.n;
import ax.Fb.p;
import ax.Fb.r;
import ax.Fb.s;
import ax.Fb.t;
import ax.Fb.u;
import ax.Fb.v;
import ax.Fb.w;
import ax.Gb.d;
import ax.Gb.g;
import ax.Gb.l;
import ax.Ob.h;
import ax.sb.c;
import ax.sb.m;
import ax.sb.q;
import ax.tb.F;
import ax.tb.o;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public final class e
implements ax.Mb.b<Object>,
d {
    public static final a b = new a(null);
    private static final Map<Class<? extends c<?>>, Integer> c;
    private static final HashMap<String, String> d;
    private static final HashMap<String, String> e;
    private static final HashMap<String, String> f;
    private static final Map<String, String> g;
    private final Class<?> a;

    static {
        int n8 = 0;
        Object object3 = o.l(ax.Fb.a.class, ax.Fb.l.class, p.class, ax.Fb.q.class, r.class, s.class, t.class, u.class, v.class, w.class, b.class, ax.Fb.c.class, ax.Fb.d.class, ax.Fb.e.class, f.class, ax.Fb.g.class, ax.Fb.h.class, i.class, j.class, k.class, ax.Fb.m.class, n.class, ax.Fb.o.class);
        Object object4 = new ArrayList<m<Class, Integer>>(o.s(object3, 10));
        object3 = object3.iterator();
        while (object3.hasNext()) {
            Object object22 = object3.next();
            if (n8 < 0) {
                o.r();
            }
            object4.add(q.a((Class)object22, n8));
            ++n8;
        }
        c = F.n(object4);
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        d = hashMap;
        object3 = new HashMap<String, String>();
        ((HashMap)object3).put("java.lang.Boolean", "kotlin.Boolean");
        ((HashMap)object3).put("java.lang.Character", "kotlin.Char");
        ((HashMap)object3).put("java.lang.Byte", "kotlin.Byte");
        ((HashMap)object3).put("java.lang.Short", "kotlin.Short");
        ((HashMap)object3).put("java.lang.Integer", "kotlin.Int");
        ((HashMap)object3).put("java.lang.Float", "kotlin.Float");
        ((HashMap)object3).put("java.lang.Long", "kotlin.Long");
        ((HashMap)object3).put("java.lang.Double", "kotlin.Double");
        e = object3;
        object4 = new HashMap();
        ((HashMap)object4).put("java.lang.Object", "kotlin.Any");
        ((HashMap)object4).put("java.lang.String", "kotlin.String");
        ((HashMap)object4).put("java.lang.CharSequence", "kotlin.CharSequence");
        ((HashMap)object4).put("java.lang.Throwable", "kotlin.Throwable");
        ((HashMap)object4).put("java.lang.Cloneable", "kotlin.Cloneable");
        ((HashMap)object4).put("java.lang.Number", "kotlin.Number");
        ((HashMap)object4).put("java.lang.Comparable", "kotlin.Comparable");
        ((HashMap)object4).put("java.lang.Enum", "kotlin.Enum");
        ((HashMap)object4).put("java.lang.annotation.Annotation", "kotlin.Annotation");
        ((HashMap)object4).put("java.lang.Iterable", "kotlin.collections.Iterable");
        ((HashMap)object4).put("java.util.Iterator", "kotlin.collections.Iterator");
        ((HashMap)object4).put("java.util.Collection", "kotlin.collections.Collection");
        ((HashMap)object4).put("java.util.List", "kotlin.collections.List");
        ((HashMap)object4).put("java.util.Set", "kotlin.collections.Set");
        ((HashMap)object4).put("java.util.ListIterator", "kotlin.collections.ListIterator");
        ((HashMap)object4).put("java.util.Map", "kotlin.collections.Map");
        ((HashMap)object4).put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        ((HashMap)object4).put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        ((HashMap)object4).put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        ((HashMap)object4).putAll(hashMap);
        ((HashMap)object4).putAll(object3);
        object3 = hashMap.values();
        l.e(object3, "<get-values>(...)");
        for (String string : (Iterable)object3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kotlin.jvm.internal.");
            l.c(string);
            stringBuilder.append(h.z0(string, '.', null, 2, null));
            stringBuilder.append("CompanionObject");
            String string2 = stringBuilder.toString();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(string);
            stringBuilder2.append(".Companion");
            m<String, String> m8 = q.a(string2, stringBuilder2.toString());
            object4.put(m8.c(), m8.d());
        }
        for (Map.Entry entry : c.entrySet()) {
            Class clazz = (Class)entry.getKey();
            n8 = ((Number)entry.getValue()).intValue();
            String string = clazz.getName();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("kotlin.Function");
            stringBuilder.append(n8);
            ((HashMap)object4).put(string, stringBuilder.toString());
        }
        f = object4;
        object3 = new LinkedHashMap(F.d(object4.size()));
        for (Map.Entry entry : object4.entrySet()) {
            Object k8 = entry.getKey();
            String string = (String)entry.getValue();
            l.c(string);
            object3.put(k8, h.z0(string, '.', null, 2, null));
        }
        g = object3;
    }

    public e(Class<?> clazz) {
        l.f(clazz, "jClass");
        this.a = clazz;
    }

    @Override
    public String a() {
        return b.a(this.b());
    }

    @Override
    public Class<?> b() {
        return this.a;
    }

    public boolean equals(Object object) {
        return object instanceof e && l.a(ax.Eb.a.b(this), ax.Eb.a.b((ax.Mb.b)object));
    }

    public int hashCode() {
        return ax.Eb.a.b(this).hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b());
        stringBuilder.append(" (Kotlin reflection is not available)");
        return stringBuilder.toString();
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final String a(Class<?> object) {
            l.f(object, "jClass");
            boolean bl = ((Class)object).isAnonymousClass();
            String string = null;
            if (bl) {
                return null;
            }
            if (((Class)object).isLocalClass()) {
                Object object2;
                string = ((Class)object).getSimpleName();
                Method method = ((Class)object).getEnclosingMethod();
                if (method != null) {
                    l.c(string);
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append(method.getName());
                    ((StringBuilder)object2).append('$');
                    object2 = h.x0(string, ((StringBuilder)object2).toString(), null, 2, null);
                    if (object2 != null) {
                        return object2;
                    }
                }
                if ((object2 = ((Class)object).getEnclosingConstructor()) != null) {
                    l.c(string);
                    object = new StringBuilder();
                    ((StringBuilder)object).append(((Constructor)object2).getName());
                    ((StringBuilder)object).append('$');
                    return h.x0(string, ((StringBuilder)object).toString(), null, 2, null);
                }
                l.c(string);
                return h.w0(string, '$', null, 2, null);
            }
            if (((Class)object).isArray()) {
                Object object3 = ((Class)object).getComponentType();
                object = string;
                if (((Class)object3).isPrimitive()) {
                    object3 = (String)g.get(((Class)object3).getName());
                    object = string;
                    if (object3 != null) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append((String)object3);
                        ((StringBuilder)object).append("Array");
                        object = ((StringBuilder)object).toString();
                    }
                }
                if (object == null) {
                    return "Array";
                }
                return object;
            }
            string = (String)g.get(((Class)object).getName());
            if (string == null) {
                return ((Class)object).getSimpleName();
            }
            return string;
        }
    }
}

