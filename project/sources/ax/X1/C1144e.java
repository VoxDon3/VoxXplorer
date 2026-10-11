package ax.X1;

import android.net.Uri;
import ax.N1.t;
import ax.X1.L;
import ax.q1.C2857q;
import ax.q1.C2862w;
import ax.q1.InterfaceC2858s;
import ax.q1.InterfaceC2859t;
import ax.q1.InterfaceC2863x;
import ax.q1.N;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http2.Http2;

/* renamed from: ax.X1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1144e implements ax.q1.r {
    public static final InterfaceC2863x d = new InterfaceC2863x() { // from class: ax.X1.d
        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x a(t.a aVar) {
            return C2862w.d(this, aVar);
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x b(int i) {
            return C2862w.b(this, i);
        }

        @Override // ax.q1.InterfaceC2863x
        public final ax.q1.r[] c() {
            return C1144e.g();
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x d(boolean z) {
            return C2862w.c(this, z);
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ ax.q1.r[] e(Uri uri, Map map) {
            return C2862w.a(this, uri, map);
        }
    };
    private final C1145f a = new C1145f("audio/ac4");
    private final ax.S0.G b = new ax.S0.G(Http2.INITIAL_MAX_FRAME_SIZE);
    private boolean c;

    public static /* synthetic */ ax.q1.r[] g() {
        return new ax.q1.r[]{new C1144e()};
    }

    @Override // ax.q1.r
    public void a(InterfaceC2859t interfaceC2859t) {
        this.a.d(interfaceC2859t, new L.d(0, 1));
        interfaceC2859t.o();
        interfaceC2859t.h(new N.b(-9223372036854775807L));
    }

    @Override // ax.q1.r
    public void b(long j, long j2) {
        this.c = false;
        this.a.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        r9.m();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if ((r4 - r3) < 8192) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        return false;
     */
    @Override // ax.q1.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(ax.q1.InterfaceC2858s r9) throws java.io.IOException {
        /*
            r8 = this;
            ax.S0.G r0 = new ax.S0.G
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.f()
            r9.p(r4, r2, r1)
            r0.b0(r2)
            int r4 = r0.P()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L65
            r9.m()
            r9.j(r3)
            r4 = r3
        L23:
            r1 = 0
        L24:
            byte[] r5 = r0.f()
            r6 = 7
            r9.p(r5, r2, r6)
            r0.b0(r2)
            int r5 = r0.U()
            r6 = 44096(0xac40, float:6.1792E-41)
            if (r5 == r6) goto L4d
            r6 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r6) goto L4d
            r9.m()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L49
            return r2
        L49:
            r9.j(r4)
            goto L23
        L4d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L53
            return r6
        L53:
            byte[] r6 = r0.f()
            int r5 = ax.q1.C2843c.h(r6, r5)
            r6 = -1
            if (r5 != r6) goto L5f
            return r2
        L5f:
            int r5 = r5 + (-7)
            r9.j(r5)
            goto L24
        L65:
            r4 = 3
            r0.c0(r4)
            int r4 = r0.L()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r9.j(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.X1.C1144e.c(ax.q1.s):boolean");
    }

    @Override // ax.q1.r
    public /* synthetic */ ax.q1.r e() {
        return C2857q.b(this);
    }

    @Override // ax.q1.r
    public int f(InterfaceC2858s interfaceC2858s, ax.q1.M m) throws IOException {
        int c = interfaceC2858s.c(this.b.f(), 0, Http2.INITIAL_MAX_FRAME_SIZE);
        if (c == -1) {
            return -1;
        }
        this.b.b0(0);
        this.b.a0(c);
        if (!this.c) {
            this.a.f(0L, 4);
            this.c = true;
        }
        this.a.c(this.b);
        return 0;
    }

    @Override // ax.q1.r
    public /* synthetic */ List k() {
        return C2857q.a(this);
    }

    @Override // ax.q1.r
    public void d() {
    }
}
