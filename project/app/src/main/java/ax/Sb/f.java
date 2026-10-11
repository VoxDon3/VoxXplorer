/*
 * Decompiled with CFR 0.152.
 */
package ax.Sb;

import ax.Gb.g;
import ax.Gb.l;

public final class f<T> {
    public static final b b = new b(null);
    private static final c c = new c();
    private final Object a;

    private /* synthetic */ f(Object object) {
        this.a = object;
    }

    public static final /* synthetic */ f b(Object object) {
        return new f(object);
    }

    public static <T> Object c(Object object) {
        return object;
    }

    public static boolean d(Object object, Object object2) {
        if (!(object2 instanceof f)) {
            return false;
        }
        return l.a(object, ((f)object2).k());
    }

    public static final Throwable e(Object object) {
        if ((object = object instanceof a ? (a)object : null) != null) {
            return ((a)object).a;
        }
        return null;
    }

    public static final T f(Object object) {
        if (!(object instanceof c)) {
            return object;
        }
        return null;
    }

    public static int g(Object object) {
        if (object == null) {
            return 0;
        }
        return object.hashCode();
    }

    public static final boolean h(Object object) {
        return object instanceof a;
    }

    public static final boolean i(Object object) {
        return object instanceof c ^ true;
    }

    public static String j(Object object) {
        if (object instanceof a) {
            return ((a)object).toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Value(");
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public boolean equals(Object object) {
        return f.d(this.a, object);
    }

    public int hashCode() {
        return f.g(this.a);
    }

    public final /* synthetic */ Object k() {
        return this.a;
    }

    public String toString() {
        return f.j(this.a);
    }

    public static final class a
    extends c {
        public final Throwable a;

        public a(Throwable throwable) {
            this.a = throwable;
        }

        public boolean equals(Object object) {
            return object instanceof a && l.a(this.a, ((a)object).a);
        }

        public int hashCode() {
            Throwable throwable = this.a;
            if (throwable != null) {
                return throwable.hashCode();
            }
            return 0;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Closed(");
            stringBuilder.append(this.a);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }

        public final <E> Object a(Throwable throwable) {
            return f.c(new a(throwable));
        }

        public final <E> Object b() {
            return f.c(c);
        }

        public final <E> Object c(E e8) {
            return f.c(e8);
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }
}

