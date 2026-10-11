package ax.m7;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentMap;
import okhttp3.HttpUrl;

/* renamed from: ax.m7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2531f {
    private static final ConcurrentMap<Class<?>, C2531f> e = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, C2531f> f = new ConcurrentHashMap();
    private final Class<?> a;
    private final boolean b;
    private final IdentityHashMap<String, C2535j> c = new IdentityHashMap<>();
    final List<String> d;

    /* renamed from: ax.m7.f$a */
    class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            if (u.a(str, str2)) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return str.compareTo(str2);
        }
    }

    private C2531f(Class<?> cls, boolean z) {
        this.a = cls;
        this.b = z;
        v.b((z && cls.isEnum()) ? false : true, "cannot ignore case on an enum: " + cls);
        TreeSet treeSet = new TreeSet(new a());
        for (Field field : cls.getDeclaredFields()) {
            C2535j k = C2535j.k(field);
            if (k != null) {
                String e2 = k.e();
                e2 = z ? e2.toLowerCase(Locale.US).intern() : e2;
                C2535j c2535j = this.c.get(e2);
                v.c(c2535j == null, "two fields have the same %sname <%s>: %s and %s", z ? "case-insensitive " : HttpUrl.FRAGMENT_ENCODE_SET, e2, field, c2535j == null ? null : c2535j.b());
                this.c.put(e2, k);
                treeSet.add(e2);
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            C2531f f2 = f(superclass, z);
            treeSet.addAll(f2.d);
            for (Map.Entry<String, C2535j> entry : f2.c.entrySet()) {
                String key = entry.getKey();
                if (!this.c.containsKey(key)) {
                    this.c.put(key, entry.getValue());
                }
            }
        }
        this.d = treeSet.isEmpty() ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(new ArrayList(treeSet));
    }

    public static C2531f e(Class<?> cls) {
        return f(cls, false);
    }

    public static C2531f f(Class<?> cls, boolean z) {
        if (cls == null) {
            return null;
        }
        ConcurrentMap<Class<?>, C2531f> concurrentMap = z ? f : e;
        C2531f c2531f = concurrentMap.get(cls);
        if (c2531f != null) {
            return c2531f;
        }
        C2531f c2531f2 = new C2531f(cls, z);
        C2531f putIfAbsent = concurrentMap.putIfAbsent(cls, c2531f2);
        return putIfAbsent == null ? c2531f2 : putIfAbsent;
    }

    public Field a(String str) {
        C2535j b = b(str);
        if (b == null) {
            return null;
        }
        return b.b();
    }

    public C2535j b(String str) {
        if (str != null) {
            if (this.b) {
                str = str.toLowerCase(Locale.US);
            }
            str = str.intern();
        }
        return this.c.get(str);
    }

    public Collection<C2535j> c() {
        return DesugarCollections.unmodifiableCollection(this.c.values());
    }

    public final boolean d() {
        return this.b;
    }
}
