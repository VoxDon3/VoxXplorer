package androidx.recyclerview.widget;

/* loaded from: classes.dex */
interface u {

    public static class a implements u {
        long a = 0;

        /* renamed from: androidx.recyclerview.widget.u$a$a, reason: collision with other inner class name */
        class C0041a implements d {
            private final ax.B.h<Long> a = new ax.B.h<>();

            C0041a() {
            }

            @Override // androidx.recyclerview.widget.u.d
            public long a(long j) {
                Long f = this.a.f(j);
                if (f == null) {
                    f = Long.valueOf(a.this.b());
                    this.a.k(j, f);
                }
                return f.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.u
        public d a() {
            return new C0041a();
        }

        long b() {
            long j = this.a;
            this.a = 1 + j;
            return j;
        }
    }

    public static class b implements u {
        private final d a = new a();

        class a implements d {
            a() {
            }

            @Override // androidx.recyclerview.widget.u.d
            public long a(long j) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.u
        public d a() {
            return this.a;
        }
    }

    public static class c implements u {
        private final d a = new a();

        class a implements d {
            a() {
            }

            @Override // androidx.recyclerview.widget.u.d
            public long a(long j) {
                return j;
            }
        }

        @Override // androidx.recyclerview.widget.u
        public d a() {
            return this.a;
        }
    }

    public interface d {
        long a(long j);
    }

    d a();
}
