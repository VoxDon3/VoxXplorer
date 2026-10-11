/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import ax.S0.d0;
import ax.a1.F;

final class D {
    private final a a;
    private final int b;
    private final F.a c;
    private int d;
    private long e;
    private long f;
    private long g;
    private long h;
    private long i;

    public D(AudioTrack audioTrack, F.a a8) {
        this.a = new a(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = a8;
        this.j();
    }

    private void a(long l8, float f8, long l9) {
        long l10 = this.a.c();
        long l11 = this.b(l8, f8);
        if (Math.abs(l10 - l8) > 5000000L) {
            this.c.e(this.a.b(), l10, l8, l9);
            this.k(4);
            return;
        }
        if (Math.abs(l11 - l9) > 5000000L) {
            this.c.d(this.a.b(), l10, l8, l9);
            this.k(4);
            return;
        }
        if (this.d == 4) {
            this.j();
        }
    }

    private long b(long l8, float f8) {
        return this.c(this.a.b(), this.a.c(), l8, f8);
    }

    private long c(long l8, long l9, long l10, float f8) {
        return d0.o1(l8, this.b) + d0.h0(l10 - l9, f8);
    }

    private boolean g(long l8, float f8) {
        long l9;
        long l10 = this.a.b();
        if (l10 <= (l9 = this.h)) {
            return false;
        }
        l9 = this.c(l9, this.i, l8, f8);
        return Math.abs(this.b(l8, f8) - l9) < 1000L;
    }

    private void k(int n8) {
        this.d = n8;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2 && n8 != 3) {
                    if (n8 == 4) {
                        this.f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f = 10000000L;
                return;
            }
            this.f = 10000L;
            return;
        }
        this.g = 0L;
        this.h = -1L;
        this.i = -9223372036854775807L;
        this.e = System.nanoTime() / 1000L;
        this.f = 10000L;
    }

    public void d() {
        this.a.a();
    }

    public long e(long l8, float f8) {
        return this.b(l8, f8);
    }

    public boolean f() {
        return this.d == 2;
    }

    public boolean h() {
        int n8 = this.d;
        return n8 == 0 || n8 == 1;
        {
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void i(long l8, float f8, long l9) {
        int n8;
        if (l8 - this.g < this.f) return;
        this.g = l8;
        boolean bl = this.a.d();
        if (bl) {
            this.a(l8, f8, l9);
        }
        if ((n8 = this.d) != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 == 4) return;
                        throw new IllegalStateException();
                    }
                    if (!bl) return;
                    this.j();
                    return;
                }
                if (bl) return;
                this.j();
                return;
            }
            if (bl) {
                if (this.g(l8, f8)) {
                    this.k(2);
                    return;
                }
                if (l8 - this.e > 2000000L) {
                    this.k(3);
                    return;
                }
                this.h = this.a.b();
                this.i = this.a.c();
                return;
            }
            this.j();
            return;
        }
        if (bl) {
            if (this.a.c() < this.e) return;
            this.h = this.a.b();
            this.i = this.a.c();
            this.k(1);
            return;
        }
        if (l8 - this.e <= 500000L) return;
        this.k(3);
    }

    public void j() {
        this.k(0);
    }

    private static final class a {
        private final AudioTrack a;
        private final AudioTimestamp b;
        private long c;
        private long d;
        private long e;
        private boolean f;
        private long g;

        public a(AudioTrack audioTrack) {
            this.a = audioTrack;
            this.b = new AudioTimestamp();
        }

        public void a() {
            this.f = true;
        }

        public long b() {
            return this.e;
        }

        public long c() {
            return this.b.nanoTime / 1000L;
        }

        public boolean d() {
            boolean bl = this.a.getTimestamp(this.b);
            if (bl) {
                long l8 = this.d;
                long l9 = this.b.framePosition;
                if (l8 > l9) {
                    if (this.f) {
                        this.g += l8;
                        this.f = false;
                    } else {
                        ++this.c;
                    }
                }
                this.d = l9;
                this.e = l9 + this.g + (this.c << 32);
            }
            return bl;
        }
    }
}

