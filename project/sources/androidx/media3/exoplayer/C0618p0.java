package androidx.media3.exoplayer;

import ax.S0.C0968a;
import j$.util.Objects;

/* renamed from: androidx.media3.exoplayer.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0618p0 {
    public final long a;
    public final float b;
    public final long c;

    /* renamed from: androidx.media3.exoplayer.p0$b */
    public static final class b {
        private long a;
        private float b;
        private long c;

        public C0618p0 d() {
            return new C0618p0(this);
        }

        public b e(long j) {
            C0968a.a(j >= 0 || j == -9223372036854775807L);
            this.c = j;
            return this;
        }

        public b f(long j) {
            this.a = j;
            return this;
        }

        public b g(float f) {
            C0968a.a(f > 0.0f || f == -3.4028235E38f);
            this.b = f;
            return this;
        }

        public b() {
            this.a = -9223372036854775807L;
            this.b = -3.4028235E38f;
            this.c = -9223372036854775807L;
        }

        private b(C0618p0 c0618p0) {
            this.a = c0618p0.a;
            this.b = c0618p0.b;
            this.c = c0618p0.c;
        }
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0618p0)) {
            return false;
        }
        C0618p0 c0618p0 = (C0618p0) obj;
        return this.a == c0618p0.a && this.b == c0618p0.b && this.c == c0618p0.c;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }

    private C0618p0(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
    }
}
