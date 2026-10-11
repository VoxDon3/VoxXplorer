package ax.P3;

/* loaded from: classes.dex */
public abstract class h {
    public static final h a = new a();
    public static final h b = new b();
    public static final h c = new c();
    public static final h d = new d();
    public static final h e = new e();

    static class a extends h {
        a() {
        }

        @Override // ax.P3.h
        public boolean a() {
            return true;
        }

        @Override // ax.P3.h
        public boolean b() {
            return true;
        }

        @Override // ax.P3.h
        public boolean c(ax.M3.a aVar) {
            return aVar == ax.M3.a.REMOTE;
        }

        @Override // ax.P3.h
        public boolean d(boolean z, ax.M3.a aVar, ax.M3.c cVar) {
            return (aVar == ax.M3.a.RESOURCE_DISK_CACHE || aVar == ax.M3.a.MEMORY_CACHE) ? false : true;
        }
    }

    static class b extends h {
        b() {
        }

        @Override // ax.P3.h
        public boolean a() {
            return false;
        }

        @Override // ax.P3.h
        public boolean b() {
            return false;
        }

        @Override // ax.P3.h
        public boolean c(ax.M3.a aVar) {
            return false;
        }

        @Override // ax.P3.h
        public boolean d(boolean z, ax.M3.a aVar, ax.M3.c cVar) {
            return false;
        }
    }

    static class c extends h {
        c() {
        }

        @Override // ax.P3.h
        public boolean a() {
            return true;
        }

        @Override // ax.P3.h
        public boolean b() {
            return false;
        }

        @Override // ax.P3.h
        public boolean c(ax.M3.a aVar) {
            return (aVar == ax.M3.a.DATA_DISK_CACHE || aVar == ax.M3.a.MEMORY_CACHE) ? false : true;
        }

        @Override // ax.P3.h
        public boolean d(boolean z, ax.M3.a aVar, ax.M3.c cVar) {
            return false;
        }
    }

    static class d extends h {
        d() {
        }

        @Override // ax.P3.h
        public boolean a() {
            return false;
        }

        @Override // ax.P3.h
        public boolean b() {
            return true;
        }

        @Override // ax.P3.h
        public boolean c(ax.M3.a aVar) {
            return false;
        }

        @Override // ax.P3.h
        public boolean d(boolean z, ax.M3.a aVar, ax.M3.c cVar) {
            return (aVar == ax.M3.a.RESOURCE_DISK_CACHE || aVar == ax.M3.a.MEMORY_CACHE) ? false : true;
        }
    }

    static class e extends h {
        e() {
        }

        @Override // ax.P3.h
        public boolean a() {
            return true;
        }

        @Override // ax.P3.h
        public boolean b() {
            return true;
        }

        @Override // ax.P3.h
        public boolean c(ax.M3.a aVar) {
            return aVar == ax.M3.a.REMOTE;
        }

        @Override // ax.P3.h
        public boolean d(boolean z, ax.M3.a aVar, ax.M3.c cVar) {
            return ((z && aVar == ax.M3.a.DATA_DISK_CACHE) || aVar == ax.M3.a.LOCAL) && cVar == ax.M3.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(ax.M3.a aVar);

    public abstract boolean d(boolean z, ax.M3.a aVar, ax.M3.c cVar);
}
