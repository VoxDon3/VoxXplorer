/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import androidx.media3.exoplayer.o0;
import ax.P0.N;
import ax.S0.a;
import ax.S0.d0;
import ax.S0.u;
import ax.Z0.I1;
import ax.i1.F;
import ax.i1.q0;
import ax.l1.D;
import ax.m1.h;
import java.util.HashMap;
import java.util.Iterator;

public class j
implements o0 {
    private final h a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final int f;
    private final boolean g;
    private final long h;
    private final boolean i;
    private final HashMap<I1, b> j;
    private long k;

    public j() {
        this(new h(true, 65536), 50000, 50000, 1000, 2000, -1, false, 0, false);
    }

    protected j(h h8, int n8, int n9, int n10, int n11, int n12, boolean bl, int n13, boolean bl2) {
        androidx.media3.exoplayer.j.k(n10, 0, "bufferForPlaybackMs", "0");
        androidx.media3.exoplayer.j.k(n11, 0, "bufferForPlaybackAfterRebufferMs", "0");
        androidx.media3.exoplayer.j.k(n8, n10, "minBufferMs", "bufferForPlaybackMs");
        androidx.media3.exoplayer.j.k(n8, n11, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        androidx.media3.exoplayer.j.k(n9, n8, "maxBufferMs", "minBufferMs");
        androidx.media3.exoplayer.j.k(n13, 0, "backBufferDurationMs", "0");
        this.a = h8;
        this.b = d0.a1(n8);
        this.c = d0.a1(n9);
        this.d = d0.a1(n10);
        this.e = d0.a1(n11);
        this.f = n12;
        this.g = bl;
        this.h = d0.a1(n13);
        this.i = bl2;
        this.j = new HashMap();
        this.k = -1L;
    }

    private static void k(int n8, int n9, String string, String string2) {
        boolean bl = n8 >= n9;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" cannot be less than ");
        stringBuilder.append(string2);
        ax.S0.a.b(bl, stringBuilder.toString());
    }

    private static int n(int n8) {
        switch (n8) {
            default: {
                throw new IllegalArgumentException();
            }
            case 5: 
            case 6: {
                return 131072;
            }
            case 4: {
                return 0x1900000;
            }
            case 3: {
                return 131072;
            }
            case 2: {
                return 0x7D00000;
            }
            case 1: {
                return 0xC80000;
            }
            case 0: {
                return 144310272;
            }
            case -1: {
                return 0xC80000;
            }
            case -2: 
        }
        return 0;
    }

    private void o(I1 i12) {
        if (this.j.remove(i12) != null) {
            this.q();
        }
    }

    private void p(I1 object) {
        int n8;
        object = ax.S0.a.e(this.j.get(object));
        int n9 = n8 = this.f;
        if (n8 == -1) {
            n9 = 0xC80000;
        }
        ((b)object).b = n9;
        ((b)object).a = false;
    }

    private void q() {
        if (this.j.isEmpty()) {
            this.a.g();
            return;
        }
        this.a.h(this.m());
    }

    @Override
    public boolean a(o0.a a8) {
        long l8 = d0.n0(a8.e, a8.f);
        long l9 = a8.h ? this.e : this.d;
        long l10 = a8.i;
        long l11 = l9;
        if (l10 != -9223372036854775807L) {
            l11 = Math.min(l10 / 2L, l9);
        }
        return l11 <= 0L || l8 >= l11 || !this.g && this.a.f() >= this.m();
        {
        }
    }

    @Override
    public boolean b(o0.a a8) {
        b b8 = ax.S0.a.e(this.j.get(a8.a));
        int n8 = this.a.f();
        int n9 = this.m();
        boolean bl = true;
        n8 = n8 >= n9 ? 1 : 0;
        long l8 = this.b;
        float f8 = a8.f;
        long l9 = l8;
        if (f8 > 1.0f) {
            l9 = Math.min(d0.h0(l8, f8), this.c);
        }
        if ((l8 = a8.e) < (l9 = Math.max(l9, 500000L))) {
            boolean bl2 = bl;
            if (!this.g) {
                bl2 = n8 == 0 ? bl : false;
            }
            b8.a = bl2;
            if (!bl2 && l8 < 500000L) {
                u.h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (l8 >= this.c || n8 != 0) {
            b8.a = false;
        }
        return b8.a;
    }

    @Override
    public boolean c(I1 i12) {
        return this.i;
    }

    @Override
    public void d(o0.a object, q0 q02, D[] dArray) {
        int n8;
        object = ax.S0.a.e(this.j.get(((o0.a)object).a));
        int n9 = n8 = this.f;
        if (n8 == -1) {
            n9 = this.l(dArray);
        }
        ((b)object).b = n9;
        this.q();
    }

    @Override
    public boolean e(N object, F.b b8, long l8) {
        object = this.j.values().iterator();
        while (object.hasNext()) {
            if (!((b)object.next()).a) continue;
            return false;
        }
        return true;
    }

    @Override
    public void f(I1 i12) {
        this.o(i12);
        if (this.j.isEmpty()) {
            this.k = -1L;
        }
    }

    @Override
    public void g(I1 i12) {
        this.o(i12);
    }

    @Override
    public ax.m1.b h() {
        return this.a;
    }

    @Override
    public void i(I1 i12) {
        long l8 = Thread.currentThread().getId();
        long l9 = this.k;
        boolean bl = l9 == -1L || l9 == l8;
        ax.S0.a.h(bl, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.k = l8;
        if (!this.j.containsKey(i12)) {
            this.j.put(i12, new b());
        }
        this.p(i12);
    }

    @Override
    public long j(I1 i12) {
        return this.h;
    }

    protected int l(D[] dArray) {
        int n8 = dArray.length;
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            D d8 = dArray[i8];
            int n10 = n9;
            if (d8 != null) {
                n10 = n9 + androidx.media3.exoplayer.j.n(d8.b().c);
            }
            n9 = n10;
        }
        return Math.max(0xC80000, n9);
    }

    int m() {
        Iterator<b> iterator = this.j.values().iterator();
        int n8 = 0;
        while (iterator.hasNext()) {
            n8 += iterator.next().b;
        }
        return n8;
    }

    private static class b {
        public boolean a;
        public int b;

        private b() {
        }
    }
}

