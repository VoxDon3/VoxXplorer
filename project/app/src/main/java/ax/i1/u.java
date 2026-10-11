/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import android.net.Uri;
import androidx.media3.exoplayer.p0;
import ax.P0.P;
import ax.P0.v;
import ax.V0.i;
import ax.Y0.O;
import ax.Y0.Z;
import ax.i1.C;
import ax.i1.e0;
import ax.i1.q0;
import ax.i1.t;
import ax.l1.D;
import ax.v7.c;
import ax.v7.e;
import ax.v7.f;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

final class u
implements C {
    private final t c0;
    private final q0 d0;
    private final byte[] e0;
    private final AtomicBoolean f0;
    private final AtomicReference<Throwable> g0;
    private final ArrayList<b> h0;
    private e<?> i0;
    private final Uri q;

    public u(Uri uri, String object, t t8) {
        this.q = uri;
        object = new v.b().y0((String)object).P();
        this.c0 = t8;
        this.d0 = new q0(new P(new v[]{object}));
        this.e0 = uri.toString().getBytes(StandardCharsets.UTF_8);
        this.f0 = new AtomicBoolean();
        this.g0 = new AtomicReference();
        this.h0 = new ArrayList();
    }

    @Override
    public boolean a(p0 p02) {
        return this.f0.get() ^ true;
    }

    @Override
    public long b() {
        if (this.f0.get()) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override
    public boolean c() {
        return this.f0.get() ^ true;
    }

    @Override
    public long d() {
        if (this.f0.get()) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override
    public void e(long l8) {
    }

    @Override
    public long g(D[] dArray, boolean[] blArray, e0[] e0Array, boolean[] blArray2, long l8) {
        for (int i8 = 0; i8 < dArray.length; ++i8) {
            e0 e02 = e0Array[i8];
            if (!(e02 == null || dArray[i8] != null && blArray[i8])) {
                this.h0.remove(e02);
                e0Array[i8] = null;
            }
            if (e0Array[i8] != null || dArray[i8] == null) continue;
            e02 = new b(this);
            this.h0.add((b)e02);
            e0Array[i8] = e02;
            blArray2[i8] = true;
        }
        return l8;
    }

    public void k() {
        e<?> e8 = this.i0;
        if (e8 != null) {
            e8.cancel(false);
        }
    }

    @Override
    public void l() {
    }

    @Override
    public long m(long l8) {
        for (int i8 = 0; i8 < this.h0.size(); ++i8) {
            this.h0.get(i8).d();
        }
        return l8;
    }

    @Override
    public void n(C.a object, long l8) {
        object.f(this);
        this.i0 = object = this.c0.a(new t.a(this.q));
        c.a(object, new ax.v7.b<Object>(this){
            final u a;
            {
                this.a = u8;
            }

            @Override
            public void a(Object object) {
                this.a.f0.set(true);
            }

            @Override
            public void b(Throwable throwable) {
                this.a.g0.set(throwable);
            }
        }, f.a());
    }

    @Override
    public long q(long l8, Z z8) {
        return l8;
    }

    @Override
    public long s() {
        return -9223372036854775807L;
    }

    @Override
    public q0 t() {
        return this.d0;
    }

    @Override
    public void v(long l8, boolean bl) {
    }

    private final class b
    implements e0 {
        private int a;
        final u b;

        public b(u u8) {
            this.b = u8;
            this.a = 0;
        }

        @Override
        public int a(O o8, i i8, int n8) {
            int n9 = this.a;
            if (n9 == 2) {
                i8.n(4);
                return -4;
            }
            if ((n8 & 2) == 0 && n9 != 0) {
                if (!this.b.f0.get()) {
                    return -3;
                }
                n9 = this.b.e0.length;
                i8.n(1);
                i8.g0 = 0L;
                if ((n8 & 4) == 0) {
                    i8.C(n9);
                    i8.e0.put(this.b.e0, 0, n9);
                }
                if ((n8 & 1) == 0) {
                    this.a = 2;
                }
                return -4;
            }
            o8.b = this.b.d0.c(0).b(0);
            this.a = 1;
            return -5;
        }

        @Override
        public void b() throws IOException {
            Throwable throwable = (Throwable)this.b.g0.get();
            if (throwable == null) {
                return;
            }
            throw new IOException(throwable);
        }

        @Override
        public int c(long l8) {
            return 0;
        }

        public void d() {
            if (this.a == 2) {
                this.a = 1;
            }
        }

        @Override
        public boolean isReady() {
            return this.b.f0.get();
        }
    }
}

