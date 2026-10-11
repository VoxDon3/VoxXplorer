/*
 * Decompiled with CFR 0.152.
 */
package ax.o1;

import java.util.Arrays;

final class i {
    private a a = new a();
    private a b = new a();
    private boolean c;
    private boolean d;
    private long e = -9223372036854775807L;
    private int f;

    public long a() {
        if (this.e()) {
            return this.a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (this.e()) {
            return (float)(1.0E9 / (double)this.a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f;
    }

    public long d() {
        if (this.e()) {
            return this.a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.a.e();
    }

    public void f(long l8) {
        this.a.f(l8);
        boolean bl = this.a.e();
        int n8 = 0;
        if (bl && !this.d) {
            this.c = false;
        } else if (this.e != -9223372036854775807L) {
            if (!this.c || this.b.d()) {
                this.b.g();
                this.b.f(this.e);
            }
            this.c = true;
            this.b.f(l8);
        }
        if (this.c && this.b.e()) {
            a a8 = this.a;
            this.a = this.b;
            this.b = a8;
            this.c = false;
            this.d = false;
        }
        this.e = l8;
        if (!this.a.e()) {
            n8 = this.f + 1;
        }
        this.f = n8;
    }

    public void g() {
        this.a.g();
        this.b.g();
        this.c = false;
        this.e = -9223372036854775807L;
        this.f = 0;
    }

    private static final class a {
        private long a;
        private long b;
        private long c;
        private long d;
        private long e;
        private long f;
        private final boolean[] g = new boolean[15];
        private int h;

        private static int c(long l8) {
            return (int)(l8 % 15L);
        }

        public long a() {
            long l8 = this.e;
            if (l8 == 0L) {
                return 0L;
            }
            return this.f / l8;
        }

        public long b() {
            return this.f;
        }

        public boolean d() {
            long l8 = this.d;
            if (l8 == 0L) {
                return false;
            }
            return this.g[ax.o1.i$a.c(l8 - 1L)];
        }

        public boolean e() {
            return this.d > 15L && this.h == 0;
        }

        public void f(long l8) {
            long l9 = this.d;
            if (l9 == 0L) {
                this.a = l8;
            } else if (l9 == 1L) {
                this.b = l9 = l8 - this.a;
                this.f = l9;
                this.e = 1L;
            } else {
                long l10 = l8 - this.c;
                int n8 = ax.o1.i$a.c(l9);
                if (Math.abs(l10 - this.b) <= 1000000L) {
                    ++this.e;
                    this.f += l10;
                    boolean[] blArray = this.g;
                    if (blArray[n8]) {
                        blArray[n8] = false;
                        --this.h;
                    }
                } else {
                    boolean[] blArray = this.g;
                    if (!blArray[n8]) {
                        blArray[n8] = true;
                        ++this.h;
                    }
                }
            }
            ++this.d;
            this.c = l8;
        }

        public void g() {
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.h = 0;
            Arrays.fill(this.g, false);
        }
    }
}

