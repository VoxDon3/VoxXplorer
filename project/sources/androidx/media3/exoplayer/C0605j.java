package androidx.media3.exoplayer;

import androidx.media3.exoplayer.InterfaceC0616o0;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.Z0.I1;
import ax.i1.InterfaceC2209F;
import ax.l1.InterfaceC2445D;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.media3.exoplayer.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0605j implements InterfaceC0616o0 {
    private final ax.m1.h a;
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

    /* renamed from: androidx.media3.exoplayer.j$b */
    private static class b {
        public boolean a;
        public int b;

        private b() {
        }
    }

    public C0605j() {
        this(new ax.m1.h(true, 65536), 50000, 50000, 1000, 2000, -1, false, 0, false);
    }

    private static void k(int i, int i2, String str, String str2) {
        C0968a.b(i >= i2, str + " cannot be less than " + str2);
    }

    private static int n(int i) {
        switch (i) {
            case -2:
                return 0;
            case SubsamplingScaleImageView.ORIENTATION_USE_EXIF /* -1 */:
                return 13107200;
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
                return 131072;
            case 4:
                return 26214400;
            case 5:
            case 6:
                return 131072;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void o(I1 i1) {
        if (this.j.remove(i1) != null) {
            q();
        }
    }

    private void p(I1 i1) {
        b bVar = (b) C0968a.e(this.j.get(i1));
        int i = this.f;
        if (i == -1) {
            i = 13107200;
        }
        bVar.b = i;
        bVar.a = false;
    }

    private void q() {
        if (this.j.isEmpty()) {
            this.a.g();
        } else {
            this.a.h(m());
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC0616o0
    public boolean a(InterfaceC0616o0.a aVar) {
        long n0 = ax.S0.d0.n0(aVar.e, aVar.f);
        long j = aVar.h ? this.e : this.d;
        long j2 = aVar.i;
        if (j2 != -9223372036854775807L) {
            j = Math.min(j2 / 2, j);
        }
        if (j <= 0 || n0 >= j) {
            return true;
        }
        return !this.g && this.a.f() >= m();
    }

    @Override // androidx.media3.exoplayer.InterfaceC0616o0
    public boolean b(InterfaceC0616o0.a aVar) {
        b bVar = (b) C0968a.e(this.j.get(aVar.a));
        boolean z = true;
        boolean z2 = this.a.f() >= m();
        long j = this.b;
        float f = aVar.f;
        if (f > 1.0f) {
            j = Math.min(ax.S0.d0.h0(j, f), this.c);
        }
        long max = Math.max(j, 500000L);
        long j2 = aVar.e;
        if (j2 < max) {
            if (!this.g && z2) {
                z = false;
            }
            bVar.a = z;
            if (!z && j2 < 500000) {
                C0987u.h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.c || z2) {
            bVar.a = false;
        }
        return bVar.a;
    }

    @Override // androidx.media3.exoplayer.InterfaceC0616o0
    public boolean c(I1 i1) {
        return this.i;
    }

    @Override // androidx.media3.exoplayer.InterfaceC0616o0
    public void d(InterfaceC0616o0.a aVar, ax.i1.q0 q0Var, InterfaceC2445D[] interfaceC2445DArr) {
        b bVar = (b) C0968a.e(this.j.get(aVar.a));
        int i = this.f;
        if (i == -1) {
            i = l(interfaceC2445DArr);
        }
        bVar.b = i;
        q();
    }

    @Override // androidx.media3.exoplayer.InterfaceC0616o0
    public boolean e(ax.P0.N n, InterfaceC2209F.b bVar, long j) {
        Iterator<b> it = this.j.values().iterator();
        while (it.hasNext()) {
            if (it.next().a) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.InterfaceC0616o0
    public void f(I1 i1) {
        o(i1);
        if (this.j.isEmpty()) {
            this.k = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC0616o0
    public void g(I1 i1) {
        o(i1);
    }

    @Override // androidx.media3.exoplayer.InterfaceC0616o0
    public ax.m1.b h() {
        return this.a;
    }

    @Override // androidx.media3.exoplayer.InterfaceC0616o0
    public void i(I1 i1) {
        long id = Thread.currentThread().getId();
        long j = this.k;
        C0968a.h(j == -1 || j == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.k = id;
        if (!this.j.containsKey(i1)) {
            this.j.put(i1, new b());
        }
        p(i1);
    }

    @Override // androidx.media3.exoplayer.InterfaceC0616o0
    public long j(I1 i1) {
        return this.h;
    }

    protected int l(InterfaceC2445D[] interfaceC2445DArr) {
        int i = 0;
        for (InterfaceC2445D interfaceC2445D : interfaceC2445DArr) {
            if (interfaceC2445D != null) {
                i += n(interfaceC2445D.b().c);
            }
        }
        return Math.max(13107200, i);
    }

    int m() {
        Iterator<b> it = this.j.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().b;
        }
        return i;
    }

    protected C0605j(ax.m1.h hVar, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        k(i3, 0, "bufferForPlaybackMs", "0");
        k(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        k(i, i3, "minBufferMs", "bufferForPlaybackMs");
        k(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        k(i2, i, "maxBufferMs", "minBufferMs");
        k(i6, 0, "backBufferDurationMs", "0");
        this.a = hVar;
        this.b = ax.S0.d0.a1(i);
        this.c = ax.S0.d0.a1(i2);
        this.d = ax.S0.d0.a1(i3);
        this.e = ax.S0.d0.a1(i4);
        this.f = i5;
        this.g = z;
        this.h = ax.S0.d0.a1(i6);
        this.i = z2;
        this.j = new HashMap<>();
        this.k = -1L;
    }
}
