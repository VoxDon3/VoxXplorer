package ax.a1;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import ax.a1.F;

/* loaded from: classes.dex */
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

    private static final class a {
        private final AudioTrack a;
        private final AudioTimestamp b = new AudioTimestamp();
        private long c;
        private long d;
        private long e;
        private boolean f;
        private long g;

        public a(AudioTrack audioTrack) {
            this.a = audioTrack;
        }

        public void a() {
            this.f = true;
        }

        public long b() {
            return this.e;
        }

        public long c() {
            return this.b.nanoTime / 1000;
        }

        public boolean d() {
            boolean timestamp = this.a.getTimestamp(this.b);
            if (timestamp) {
                long j = this.b.framePosition;
                long j2 = this.d;
                if (j2 > j) {
                    if (this.f) {
                        this.g += j2;
                        this.f = false;
                    } else {
                        this.c++;
                    }
                }
                this.d = j;
                this.e = j + this.g + (this.c << 32);
            }
            return timestamp;
        }
    }

    public D(AudioTrack audioTrack, F.a aVar) {
        this.a = new a(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = aVar;
        j();
    }

    private void a(long j, float f, long j2) {
        long c = this.a.c();
        long b = b(j, f);
        if (Math.abs(c - j) > 5000000) {
            this.c.e(this.a.b(), c, j, j2);
            k(4);
        } else if (Math.abs(b - j2) > 5000000) {
            this.c.d(this.a.b(), c, j, j2);
            k(4);
        } else if (this.d == 4) {
            j();
        }
    }

    private long b(long j, float f) {
        return c(this.a.b(), this.a.c(), j, f);
    }

    private long c(long j, long j2, long j3, float f) {
        return ax.S0.d0.o1(j, this.b) + ax.S0.d0.h0(j3 - j2, f);
    }

    private boolean g(long j, float f) {
        long b = this.a.b();
        long j2 = this.h;
        if (b <= j2) {
            return false;
        }
        return Math.abs(b(j, f) - c(j2, this.i, j, f)) < 1000;
    }

    private void k(int i) {
        this.d = i;
        if (i == 0) {
            this.g = 0L;
            this.h = -1L;
            this.i = -9223372036854775807L;
            this.e = System.nanoTime() / 1000;
            this.f = 10000L;
            return;
        }
        if (i == 1) {
            this.f = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.f = 500000L;
        }
    }

    public void d() {
        this.a.a();
    }

    public long e(long j, float f) {
        return b(j, f);
    }

    public boolean f() {
        return this.d == 2;
    }

    public boolean h() {
        int i = this.d;
        return i == 0 || i == 1;
    }

    public void i(long j, float f, long j2) {
        if (j - this.g < this.f) {
            return;
        }
        this.g = j;
        boolean d = this.a.d();
        if (d) {
            a(j, f, j2);
        }
        int i = this.d;
        if (i == 0) {
            if (!d) {
                if (j - this.e > 500000) {
                    k(3);
                    return;
                }
                return;
            } else {
                if (this.a.c() >= this.e) {
                    this.h = this.a.b();
                    this.i = this.a.c();
                    k(1);
                    return;
                }
                return;
            }
        }
        if (i == 1) {
            if (!d) {
                j();
                return;
            }
            if (g(j, f)) {
                k(2);
                return;
            } else if (j - this.e > 2000000) {
                k(3);
                return;
            } else {
                this.h = this.a.b();
                this.i = this.a.c();
                return;
            }
        }
        if (i == 2) {
            if (d) {
                return;
            }
            j();
        } else if (i != 3) {
            if (i != 4) {
                throw new IllegalStateException();
            }
        } else if (d) {
            j();
        }
    }

    public void j() {
        k(0);
    }
}
