/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import ax.B.h;

interface u {
    public d a();

    public static class androidx.recyclerview.widget.u$a
    implements u {
        long a = 0L;

        @Override
        public d a() {
            return new a(this);
        }

        long b() {
            long l8 = this.a;
            this.a = 1L + l8;
            return l8;
        }

        class a
        implements d {
            private final h<Long> a;
            final androidx.recyclerview.widget.u$a b;

            a(androidx.recyclerview.widget.u$a a8) {
                this.b = a8;
                this.a = new h();
            }

            @Override
            public long a(long l8) {
                Long l9;
                Long l10 = l9 = this.a.f(l8);
                if (l9 == null) {
                    l10 = this.b.b();
                    this.a.k(l8, l10);
                }
                return l10;
            }
        }
    }

    public static class b
    implements u {
        private final d a = new d(this){
            final b a;
            {
                this.a = b8;
            }

            @Override
            public long a(long l8) {
                return -1L;
            }
        };

        @Override
        public d a() {
            return this.a;
        }
    }

    public static class c
    implements u {
        private final d a = new d(this){
            final c a;
            {
                this.a = c8;
            }

            @Override
            public long a(long l8) {
                return l8;
            }
        };

        @Override
        public d a() {
            return this.a;
        }
    }

    public static interface d {
        public long a(long var1);
    }
}

