package ax.Sb;

/* loaded from: classes3.dex */
public final class f<T> {
    public static final b b = new b(null);
    private static final c c = new c();
    private final Object a;

    public static final class a extends c {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && ax.Gb.l.a(this.a, ((a) obj).a);
        }

        public int hashCode() {
            Throwable th = this.a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // ax.Sb.f.c
        public String toString() {
            return "Closed(" + this.a + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(ax.Gb.g gVar) {
            this();
        }

        public final <E> Object a(Throwable th) {
            return f.c(new a(th));
        }

        public final <E> Object b() {
            return f.c(f.c);
        }

        public final <E> Object c(E e) {
            return f.c(e);
        }

        private b() {
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ f(Object obj) {
        this.a = obj;
    }

    public static final /* synthetic */ f b(Object obj) {
        return new f(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof f) && ax.Gb.l.a(obj, ((f) obj2).k());
    }

    public static final Throwable e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof a;
    }

    public static final boolean i(Object obj) {
        return !(obj instanceof c);
    }

    public static String j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public int hashCode() {
        return g(this.a);
    }

    public final /* synthetic */ Object k() {
        return this.a;
    }

    public String toString() {
        return j(this.a);
    }

    public static <T> Object c(Object obj) {
        return obj;
    }
}
