package ax.m7;

import ax.m7.C2533h;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class k extends AbstractMap<String, Object> implements Cloneable {
    Map<String, Object> c0;
    final C2531f d0;

    final class a implements Iterator<Map.Entry<String, Object>> {
        private final Iterator<Map.Entry<String, Object>> c0;
        private final Iterator<Map.Entry<String, Object>> d0;
        private boolean q;

        a(C2533h.c cVar) {
            this.c0 = cVar.iterator();
            this.d0 = k.this.c0.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<String, Object> next() {
            if (!this.q) {
                if (this.c0.hasNext()) {
                    return this.c0.next();
                }
                this.q = true;
            }
            return this.d0.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c0.hasNext() || this.d0.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.q) {
                this.d0.remove();
            }
            this.c0.remove();
        }
    }

    final class b extends AbstractSet<Map.Entry<String, Object>> {
        private final C2533h.c q;

        b() {
            this.q = new C2533h(k.this, k.this.d0.d()).entrySet();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            k.this.c0.clear();
            this.q.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<String, Object>> iterator() {
            return k.this.new a(this.q);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return k.this.c0.size() + this.q.size();
        }
    }

    public enum c {
        IGNORE_CASE
    }

    public k() {
        this(EnumSet.noneOf(c.class));
    }

    @Override // java.util.AbstractMap
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k clone() {
        try {
            k kVar = (k) super.clone();
            C2532g.c(this, kVar);
            kVar.c0 = (Map) C2532g.a(this.c0);
            return kVar;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final C2531f c() {
        return this.d0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object put(String str, Object obj) {
        C2535j b2 = this.d0.b(str);
        if (b2 != null) {
            Object g = b2.g(this);
            b2.m(this, obj);
            return g;
        }
        if (this.d0.d()) {
            str = str.toLowerCase(Locale.US);
        }
        return this.c0.put(str, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<String, Object>> entrySet() {
        return new b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof k)) {
            k kVar = (k) obj;
            if (super.equals(kVar) && Objects.equals(this.d0, kVar.d0)) {
                return true;
            }
        }
        return false;
    }

    public k f(String str, Object obj) {
        C2535j b2 = this.d0.b(str);
        if (b2 != null) {
            b2.m(this, obj);
            return this;
        }
        if (this.d0.d()) {
            str = str.toLowerCase(Locale.US);
        }
        this.c0.put(str, obj);
        return this;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        C2535j b2 = this.d0.b(str);
        if (b2 != null) {
            return b2.g(this);
        }
        if (this.d0.d()) {
            str = str.toLowerCase(Locale.US);
        }
        return this.c0.get(str);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.d0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends String, ?> map) {
        for (Map.Entry<? extends String, ?> entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (this.d0.b(str) != null) {
            throw new UnsupportedOperationException();
        }
        if (this.d0.d()) {
            str = str.toLowerCase(Locale.US);
        }
        return this.c0.remove(str);
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return "GenericData{classInfo=" + this.d0.d + ", " + super.toString() + "}";
    }

    public k(EnumSet<c> enumSet) {
        this.c0 = C2526a.c();
        this.d0 = C2531f.f(getClass(), enumSet.contains(c.IGNORE_CASE));
    }
}
