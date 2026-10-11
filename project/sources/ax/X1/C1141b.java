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

/* renamed from: ax.X1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1141b implements ax.q1.r {
    public static final InterfaceC2863x d = new InterfaceC2863x() { // from class: ax.X1.a
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
            return C1141b.g();
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
    private final C1142c a = new C1142c("audio/ac3");
    private final ax.S0.G b = new ax.S0.G(2786);
    private boolean c;

    public static /* synthetic */ ax.q1.r[] g() {
        return new ax.q1.r[]{new C1141b()};
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

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
    
        r8.m();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if ((r4 - r3) < 8192) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        return false;
     */
    @Override // ax.q1.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(ax.q1.InterfaceC2858s r8) throws java.io.IOException {
        /*
            r7 = this;
            ax.S0.G r0 = new ax.S0.G
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.f()
            r8.p(r4, r2, r1)
            r0.b0(r2)
            int r4 = r0.P()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L5f
            r8.m()
            r8.j(r3)
            r4 = r3
        L23:
            r1 = 0
        L24:
            byte[] r5 = r0.f()
            r6 = 6
            r8.p(r5, r2, r6)
            r0.b0(r2)
            int r5 = r0.U()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L47
            r8.m()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L43
            return r2
        L43:
            r8.j(r4)
            goto L23
        L47:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L4d
            return r5
        L4d:
            byte[] r5 = r0.f()
            int r5 = ax.q1.C2842b.g(r5)
            r6 = -1
            if (r5 != r6) goto L59
            return r2
        L59:
            int r5 = r5 + (-6)
            r8.j(r5)
            goto L24
        L5f:
            r4 = 3
            r0.c0(r4)
            int r4 = r0.L()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.j(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.X1.C1141b.c(ax.q1.s):boolean");
    }

    @Override // ax.q1.r
    public /* synthetic */ ax.q1.r e() {
        return C2857q.b(this);
    }

    @Override // ax.q1.r
    public int f(InterfaceC2858s interfaceC2858s, ax.q1.M m) throws IOException {
        int c = interfaceC2858s.c(this.b.f(), 0, 2786);
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
