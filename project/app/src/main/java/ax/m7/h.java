/*
 * Decompiled with CFR 0.152.
 */
package ax.m7;

import ax.m7.f;
import ax.m7.j;
import ax.m7.v;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;

final class h
extends AbstractMap<String, Object> {
    final f c0;
    final Object q;

    h(Object object, boolean bl) {
        this.q = object;
        this.c0 = f.f(object.getClass(), bl);
    }

    public c a() {
        return new c(this);
    }

    public Object b(String object, Object object2) {
        j j8 = this.c0.b((String)object);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("no field of key ");
        stringBuilder.append((String)object);
        v.e(j8, stringBuilder.toString());
        object = j8.g(this.q);
        j8.m(this.q, v.d(object2));
        return object;
    }

    @Override
    public boolean containsKey(Object object) {
        return this.get(object) != null;
    }

    @Override
    public Object get(Object object) {
        if (!(object instanceof String)) {
            return null;
        }
        if ((object = this.c0.b((String)object)) == null) {
            return null;
        }
        return ((j)object).g(this.q);
    }

    final class a
    implements Map.Entry<String, Object> {
        private final j c0;
        final h d0;
        private Object q;

        a(h h8, j j8, Object object) {
            this.d0 = h8;
            this.c0 = j8;
            this.q = v.d(object);
        }

        public String a() {
            String string;
            String string2 = string = this.c0.e();
            if (this.d0.c0.d()) {
                string2 = string.toLowerCase(Locale.US);
            }
            return string2;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof Map.Entry)) {
                return false;
            }
            object = (Map.Entry)object;
            return this.a().equals(object.getKey()) && this.getValue().equals(object.getValue());
        }

        @Override
        public Object getValue() {
            return this.q;
        }

        @Override
        public int hashCode() {
            return this.a().hashCode() ^ this.getValue().hashCode();
        }

        @Override
        public Object setValue(Object object) {
            Object object2 = this.q;
            this.q = v.d(object);
            this.c0.m(this.d0.q, object);
            return object2;
        }
    }

    final class b
    implements Iterator<Map.Entry<String, Object>> {
        private j c0;
        private Object d0;
        private boolean e0;
        private boolean f0;
        private j g0;
        final h h0;
        private int q;

        b(h h8) {
            this.h0 = h8;
            this.q = -1;
        }

        public Map.Entry<String, Object> b() {
            if (this.hasNext()) {
                j j8;
                this.g0 = j8 = this.c0;
                Object object = this.d0;
                this.f0 = false;
                this.e0 = false;
                this.c0 = null;
                this.d0 = null;
                return new a(this.h0, j8, object);
            }
            throw new NoSuchElementException();
        }

        @Override
        public boolean hasNext() {
            if (!this.f0) {
                this.f0 = true;
                this.d0 = null;
                while (this.d0 == null) {
                    int n8;
                    this.q = n8 = this.q + 1;
                    if (n8 >= this.h0.c0.d.size()) break;
                    Object object = this.h0.c0;
                    this.c0 = object = ((f)object).b(((f)object).d.get(this.q));
                    this.d0 = ((j)object).g(this.h0.q);
                }
            }
            return this.d0 != null;
        }

        @Override
        public void remove() {
            boolean bl = this.g0 != null && !this.e0;
            v.g(bl);
            this.e0 = true;
            this.g0.m(this.h0.q, null);
        }
    }

    final class c
    extends AbstractSet<Map.Entry<String, Object>> {
        final h q;

        c(h h8) {
            this.q = h8;
        }

        @Override
        public void clear() {
            for (String string : this.q.c0.d) {
                this.q.c0.b(string).m(this.q.q, null);
            }
        }

        public b e() {
            return new b(this.q);
        }

        @Override
        public boolean isEmpty() {
            for (String string : this.q.c0.d) {
                if (this.q.c0.b(string).g(this.q.q) == null) continue;
                return false;
            }
            return true;
        }

        @Override
        public int size() {
            Iterator<String> iterator = this.q.c0.d.iterator();
            int n8 = 0;
            while (iterator.hasNext()) {
                String string = iterator.next();
                if (this.q.c0.b(string).g(this.q.q) == null) continue;
                ++n8;
            }
            return n8;
        }
    }
}

