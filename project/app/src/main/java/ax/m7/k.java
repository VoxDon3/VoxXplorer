/*
 * Decompiled with CFR 0.152.
 */
package ax.m7;

import ax.m7.f;
import ax.m7.g;
import ax.m7.h;
import ax.m7.j;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class k
extends AbstractMap<String, Object>
implements Cloneable {
    Map<String, Object> c0 = ax.m7.a.c();
    final f d0;

    public k() {
        this(EnumSet.noneOf(c.class));
    }

    public k(EnumSet<c> enumSet) {
        this.d0 = f.f(this.getClass(), enumSet.contains((Object)c.q));
    }

    public k b() {
        try {
            k k8 = (k)super.clone();
            g.c(this, k8);
            k8.c0 = g.a(this.c0);
            return k8;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException(cloneNotSupportedException);
        }
    }

    public final f c() {
        return this.d0;
    }

    public final Object d(String object, Object object2) {
        Object object3 = this.d0.b((String)object);
        if (object3 != null) {
            object = ((j)object3).g(this);
            ((j)object3).m(this, object2);
            return object;
        }
        object3 = object;
        if (this.d0.d()) {
            object3 = ((String)object).toLowerCase(Locale.US);
        }
        return this.c0.put((String)object3, object2);
    }

    @Override
    public Set<Map.Entry<String, Object>> entrySet() {
        return new b(this);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object != null && object instanceof k && super.equals(object = (k)object) && j.Objects.equals((Object)this.d0, (Object)((k)object).d0);
    }

    public k f(String string, Object object) {
        Object object2 = this.d0.b(string);
        if (object2 != null) {
            ((j)object2).m(this, object);
            return this;
        }
        object2 = string;
        if (this.d0.d()) {
            object2 = string.toLowerCase(Locale.US);
        }
        this.c0.put((String)object2, object);
        return this;
    }

    @Override
    public final Object get(Object object) {
        if (!(object instanceof String)) {
            return null;
        }
        String string = (String)object;
        if ((object = this.d0.b(string)) != null) {
            return ((j)object).g(this);
        }
        object = string;
        if (this.d0.d()) {
            object = string.toLowerCase(Locale.US);
        }
        return this.c0.get(object);
    }

    @Override
    public int hashCode() {
        return j.Objects.hash((Object[])new Object[]{super.hashCode(), this.d0});
    }

    @Override
    public final void putAll(Map<? extends String, ?> object2) {
        for (Map.Entry entry : object2.entrySet()) {
            this.f((String)entry.getKey(), entry.getValue());
        }
    }

    @Override
    public final Object remove(Object object) {
        if (!(object instanceof String)) {
            return null;
        }
        String string = (String)object;
        if (this.d0.b(string) == null) {
            object = string;
            if (this.d0.d()) {
                object = string.toLowerCase(Locale.US);
            }
            return this.c0.remove(object);
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GenericData{classInfo=");
        stringBuilder.append(this.d0.d);
        stringBuilder.append(", ");
        stringBuilder.append(super.toString());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    final class a
    implements Iterator<Map.Entry<String, Object>> {
        private final Iterator<Map.Entry<String, Object>> c0;
        private final Iterator<Map.Entry<String, Object>> d0;
        final k e0;
        private boolean q;

        a(k k8, h.c c8) {
            this.e0 = k8;
            this.c0 = c8.e();
            this.d0 = k8.c0.entrySet().iterator();
        }

        public Map.Entry<String, Object> b() {
            if (!this.q) {
                if (this.c0.hasNext()) {
                    return this.c0.next();
                }
                this.q = true;
            }
            return this.d0.next();
        }

        @Override
        public boolean hasNext() {
            return this.c0.hasNext() || this.d0.hasNext();
            {
            }
        }

        @Override
        public void remove() {
            if (this.q) {
                this.d0.remove();
            }
            this.c0.remove();
        }
    }

    final class b
    extends AbstractSet<Map.Entry<String, Object>> {
        final k c0;
        private final h.c q;

        b(k k8) {
            this.c0 = k8;
            this.q = new h(k8, k8.d0.d()).a();
        }

        @Override
        public void clear() {
            this.c0.c0.clear();
            this.q.clear();
        }

        @Override
        public Iterator<Map.Entry<String, Object>> iterator() {
            return new a(this.c0, this.q);
        }

        @Override
        public int size() {
            return this.c0.c0.size() + this.q.size();
        }
    }

    public static final class c
    extends Enum<c> {
        private static final c[] c0;
        public static final /* enum */ c q;

        static {
            c c8;
            q = c8 = new c();
            c0 = new c[]{c8};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])c0.clone();
        }
    }
}

