package ax.o1;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.media3.exoplayer.C0622s;
import androidx.media3.exoplayer.M0;
import ax.P0.C0912v;
import ax.P0.N;
import ax.P0.a0;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.S0.C0990x;
import ax.S0.d0;
import ax.Y0.C1176b;
import ax.Y0.C1177c;
import ax.Y0.V;
import ax.Y0.Y;
import ax.f1.C2004B;
import ax.f1.C2006D;
import ax.f1.C2030y;
import ax.f1.InterfaceC2029x;
import ax.f1.a0;
import ax.i1.InterfaceC2209F;
import ax.o1.C2656A;
import ax.o1.C2679s;
import ax.o1.P;
import ax.o1.S;
import ax.r7.AbstractC2991z;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: ax.o1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2672k extends ax.f1.L implements C2656A.b {
    private static final int[] D2 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean E2;
    private static boolean F2;
    private long A2;
    private boolean B2;
    private int C2;
    private final Context K1;
    private final boolean L1;
    private final P.a M1;
    private final int N1;
    private final boolean O1;
    private final C2656A P1;
    private final C2656A.a Q1;
    private final C2662a R1;
    private final long S1;
    private final C2657B T1;
    private final PriorityQueue<Long> U1;
    private final boolean V1;
    private e W1;
    private boolean X1;
    private boolean Y1;
    private S Z1;
    private boolean a2;
    private int b2;
    private List<Object> c2;
    private Surface d2;
    private C2676o e2;
    private ax.S0.I f2;
    private boolean g2;
    private int h2;
    private int i2;
    private long j2;
    private int k2;
    private int l2;
    private int m2;
    private Y n2;
    private boolean o2;
    private long p2;
    private int q2;
    private long r2;
    private a0 s2;
    private a0 t2;
    private int u2;
    private boolean v2;
    private int w2;
    f x2;
    private z y2;
    private long z2;

    /* renamed from: ax.o1.k$b */
    class b implements S.b {
        final /* synthetic */ InterfaceC2029x a;
        final /* synthetic */ int b;
        final /* synthetic */ long c;

        b(InterfaceC2029x interfaceC2029x, int i, long j) {
            this.a = interfaceC2029x;
            this.b = i;
            this.c = j;
        }

        @Override // ax.o1.S.b
        public void a(long j) {
            C2672k.this.N2(this.a, this.b, this.c, j);
        }

        @Override // ax.o1.S.b
        public void b() {
            C2672k.this.a3(this.a, this.b, this.c);
        }
    }

    /* renamed from: ax.o1.k$c */
    private static final class c {
        public static boolean a(Context context) {
            boolean isHdr;
            Display.HdrCapabilities hdrCapabilities;
            int[] supportedHdrTypes;
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null) {
                isHdr = display.isHdr();
                if (isHdr) {
                    hdrCapabilities = display.getHdrCapabilities();
                    supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
                    for (int i : supportedHdrTypes) {
                        if (i == 1) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: ax.o1.k$d */
    public static final class d {
        private final Context a;
        private boolean b;
        private InterfaceC2029x.b d;
        private long e;
        private boolean f;
        private Handler g;
        private P h;
        private int i;
        private S k;
        private boolean l;
        private boolean n;
        private ax.f1.Q c = ax.f1.Q.a;
        private float j = 30.0f;
        private long m = -9223372036854775807L;

        public d(Context context) {
            this.a = context;
            this.d = C2030y.a(context);
        }

        public C2672k n() {
            C0968a.g(!this.b);
            Handler handler = this.g;
            C0968a.g((handler == null && this.h == null) || !(handler == null || this.h == null));
            this.b = true;
            return new C2672k(this);
        }

        public d o(boolean z) {
            this.n = z;
            return this;
        }

        public d p(long j) {
            this.m = j;
            return this;
        }

        public d q(boolean z) {
            this.l = z;
            return this;
        }

        public d r(long j) {
            this.e = j;
            return this;
        }

        public d s(InterfaceC2029x.b bVar) {
            this.d = bVar;
            return this;
        }

        public d t(boolean z) {
            this.f = z;
            return this;
        }

        public d u(Handler handler) {
            this.g = handler;
            return this;
        }

        public d v(P p) {
            this.h = p;
            return this;
        }

        public d w(int i) {
            this.i = i;
            return this;
        }

        public d x(ax.f1.Q q) {
            this.c = q;
            return this;
        }
    }

    /* renamed from: ax.o1.k$e */
    protected static final class e {
        public final int a;
        public final int b;
        public final int c;

        public e(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    /* renamed from: ax.o1.k$f */
    private final class f implements InterfaceC2029x.d, Handler.Callback {
        private final Handler q;

        public f(InterfaceC2029x interfaceC2029x) {
            Handler B = d0.B(this);
            this.q = B;
            interfaceC2029x.k(this, B);
        }

        private void b(long j) {
            C2672k c2672k = C2672k.this;
            if (this != c2672k.x2 || c2672k.E0() == null) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                C2672k.this.K2();
                return;
            }
            try {
                C2672k.this.J2(j);
            } catch (C0622s e) {
                C2672k.this.H1(e);
            }
        }

        @Override // ax.f1.InterfaceC2029x.d
        public void a(InterfaceC2029x interfaceC2029x, long j, long j2) {
            if (Build.VERSION.SDK_INT >= 30) {
                b(j);
            } else {
                this.q.sendMessageAtFrontOfQueue(Message.obtain(this.q, 0, (int) (j >> 32), (int) j));
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(d0.C1(message.arg1, message.arg2));
            return true;
        }
    }

    protected C2672k(d dVar) {
        super(2, dVar.d, dVar.c, dVar.f, dVar.j);
        Context applicationContext = dVar.a.getApplicationContext();
        this.K1 = applicationContext;
        this.N1 = dVar.i;
        this.Z1 = dVar.k;
        this.M1 = new P.a(dVar.g, dVar.h);
        this.L1 = this.Z1 == null;
        this.P1 = new C2656A(applicationContext, this, dVar.e);
        this.Q1 = new C2656A.a();
        this.O1 = j2();
        this.f2 = ax.S0.I.c;
        this.h2 = 1;
        this.i2 = 0;
        this.s2 = a0.e;
        this.w2 = 0;
        this.t2 = null;
        this.u2 = -1000;
        this.z2 = -9223372036854775807L;
        this.A2 = -9223372036854775807L;
        this.R1 = dVar.l ? new C2662a() : null;
        this.U1 = new PriorityQueue<>();
        if (dVar.m != -9223372036854775807L) {
            this.S1 = -dVar.m;
            this.T1 = new C2657B(1.0f);
        } else {
            this.S1 = -9223372036854775807L;
            this.T1 = null;
        }
        this.V1 = dVar.n;
        this.n2 = null;
    }

    private void A2() {
        if (!this.P1.g() || this.d2 == null) {
            return;
        }
        I2();
    }

    private void B2() {
        int i = this.q2;
        if (i != 0) {
            this.M1.r(this.p2, i);
            this.p2 = 0L;
            this.q2 = 0;
        }
    }

    private void C2(a0 a0Var) {
        if (a0Var.equals(a0.e) || a0Var.equals(this.t2)) {
            return;
        }
        this.t2 = a0Var;
        this.M1.t(a0Var);
    }

    private void D2() {
        Surface surface = this.d2;
        if (surface == null || !this.g2) {
            return;
        }
        this.M1.q(surface);
    }

    private void E2() {
        a0 a0Var = this.t2;
        if (a0Var != null) {
            this.M1.t(a0Var);
        }
    }

    private void F2(MediaFormat mediaFormat) {
        if (this.Z1 == null || d0.M0(this.K1)) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    private void G2() {
        int i;
        InterfaceC2029x E0;
        if (!this.v2 || (i = Build.VERSION.SDK_INT) < 23 || (E0 = E0()) == null) {
            return;
        }
        this.x2 = new f(E0);
        if (i >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            E0.a(bundle);
        }
    }

    private void H2(long j, long j2, C0912v c0912v) {
        z zVar = this.y2;
        if (zVar != null) {
            zVar.g(j, j2, c0912v, K0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I2() {
        this.M1.q(this.d2);
        this.g2 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K2() {
        G1();
    }

    private void L2(InterfaceC2029x interfaceC2029x, int i, long j, C0912v c0912v) {
        C2672k c2672k;
        long g = this.Q1.g();
        long f2 = this.Q1.f();
        if (X2() && g == this.r2) {
            a3(interfaceC2029x, i, j);
            c2672k = this;
        } else {
            c2672k = this;
            c2672k.H2(j, g, c0912v);
            c2672k.O2(interfaceC2029x, i, j, g);
            g = g;
        }
        g3(f2);
        c2672k.r2 = g;
    }

    private void M2() {
        C2676o c2676o = this.e2;
        if (c2676o != null) {
            c2676o.release();
            this.e2 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N2(InterfaceC2029x interfaceC2029x, int i, long j, long j2) {
        O2(interfaceC2029x, i, j, j2);
    }

    private static void P2(InterfaceC2029x interfaceC2029x, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        interfaceC2029x.a(bundle);
    }

    private void Q2(Object obj) throws C0622s {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.d2 == surface) {
            if (surface != null) {
                E2();
                D2();
                return;
            }
            return;
        }
        this.d2 = surface;
        if (this.Z1 == null) {
            this.P1.o(surface);
        }
        this.g2 = false;
        int state = getState();
        InterfaceC2029x E0 = E0();
        if (E0 != null && this.Z1 == null) {
            C2006D c2006d = (C2006D) C0968a.e(G0());
            boolean v2 = v2(c2006d);
            if (Build.VERSION.SDK_INT < 23 || !v2 || this.X1) {
                w1();
                e1();
            } else {
                R2(E0, u2(c2006d));
            }
        }
        if (surface != null) {
            E2();
        } else {
            this.t2 = null;
            S s = this.Z1;
            if (s != null) {
                s.u();
            }
        }
        if (state == 2) {
            S s2 = this.Z1;
            if (s2 != null) {
                s2.x(true);
            } else {
                this.P1.e(true);
            }
        }
        G2();
    }

    private void R2(InterfaceC2029x interfaceC2029x, Surface surface) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && surface != null) {
            S2(interfaceC2029x, surface);
        } else {
            if (i < 35) {
                throw new IllegalStateException();
            }
            i2(interfaceC2029x);
        }
    }

    private static int b3(Context context, ax.f1.Q q, C0912v c0912v) throws a0.c {
        boolean z;
        int i = 0;
        if (!ax.P0.D.s(c0912v.o)) {
            return V.a(0);
        }
        boolean z2 = c0912v.s != null;
        List<C2006D> q2 = q2(context, q, c0912v, z2, false);
        if (z2 && q2.isEmpty()) {
            q2 = q2(context, q, c0912v, false, false);
        }
        if (q2.isEmpty()) {
            return V.a(1);
        }
        if (!ax.f1.L.S1(c0912v)) {
            return V.a(2);
        }
        C2006D c2006d = q2.get(0);
        boolean q3 = c2006d.q(c0912v);
        if (!q3) {
            for (int i2 = 1; i2 < q2.size(); i2++) {
                C2006D c2006d2 = q2.get(i2);
                if (c2006d2.q(c0912v)) {
                    c2006d = c2006d2;
                    z = false;
                    q3 = true;
                    break;
                }
            }
        }
        z = true;
        int i3 = q3 ? 4 : 3;
        int i4 = c2006d.t(c0912v) ? 16 : 8;
        int i5 = c2006d.h ? 64 : 0;
        int i6 = z ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(c0912v.o) && !c.a(context)) {
            i6 = 256;
        }
        if (q3) {
            List<C2006D> q22 = q2(context, q, c0912v, z2, true);
            if (!q22.isEmpty()) {
                C2006D c2006d3 = ax.f1.a0.o(q22, c0912v).get(0);
                if (c2006d3.q(c0912v) && c2006d3.t(c0912v)) {
                    i = 32;
                }
            }
        }
        return V.d(i3, i4, i, i5, i6);
    }

    private void c3() {
        InterfaceC2029x E0 = E0();
        if (E0 != null && Build.VERSION.SDK_INT >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.u2));
            E0.a(bundle);
        }
    }

    private void e3(long j) {
        int i = 0;
        while (true) {
            Long peek = this.U1.peek();
            if (peek == null || peek.longValue() >= j) {
                break;
            }
            i++;
            this.U1.poll();
        }
        d3(i, 0);
    }

    private void f3(InterfaceC2209F.b bVar) {
        ax.P0.N S = S();
        if (S.q()) {
            this.A2 = -9223372036854775807L;
        } else {
            this.A2 = S.h(((InterfaceC2209F.b) C0968a.e(bVar)).a, new N.b()).k();
        }
    }

    private void g2() {
        this.Z1.m(new a(), ax.v7.f.a());
        z zVar = this.y2;
        if (zVar != null) {
            this.Z1.p(zVar);
        }
        if (this.d2 != null && !this.f2.equals(ax.S0.I.c)) {
            this.Z1.t(this.d2, this.f2);
        }
        this.Z1.s(this.i2);
        this.Z1.g(R0());
        List<Object> list = this.c2;
        if (list != null) {
            this.Z1.w(list);
        }
    }

    private static boolean j2() {
        return "NVIDIA".equals(Build.MANUFACTURER);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x073f, code lost:
    
        if (r11.equals("A10-70L") == false) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean l2() {
        /*
            Method dump skipped, instructions count: 3184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.o1.C2672k.l2():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0087, code lost:
    
        if (r9.equals("video/av01") == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int n2(ax.f1.C2006D r11, ax.P0.C0912v r12) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.o1.C2672k.n2(ax.f1.D, ax.P0.v):int");
    }

    private static Point o2(C2006D c2006d, C0912v c0912v) {
        int i = c0912v.w;
        int i2 = c0912v.v;
        boolean z = i > i2;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        float f2 = i / i3;
        for (int i4 : D2) {
            int i5 = (int) (i4 * f2);
            if (i4 <= i3 || i5 <= i) {
                break;
            }
            int i6 = z ? i5 : i4;
            if (!z) {
                i4 = i5;
            }
            Point c2 = c2006d.c(i6, i4);
            float f3 = c0912v.z;
            if (c2 != null && c2006d.w(c2.x, c2.y, f3)) {
                return c2;
            }
        }
        return null;
    }

    private static List<C2006D> q2(Context context, ax.f1.Q q, C0912v c0912v, boolean z, boolean z2) throws a0.c {
        String str = c0912v.o;
        if (str == null) {
            return AbstractC2991z.z();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !c.a(context)) {
            List<C2006D> h = ax.f1.a0.h(q, c0912v, z, z2);
            if (!h.isEmpty()) {
                return h;
            }
        }
        return ax.f1.a0.n(q, c0912v, z, z2);
    }

    protected static int r2(C2006D c2006d, C0912v c0912v) {
        if (c0912v.p == -1) {
            return n2(c2006d, c0912v);
        }
        int size = c0912v.r.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += c0912v.r.get(i2).length;
        }
        return c0912v.p + i;
    }

    private static int s2(int i, int i2) {
        return (i * 3) / (i2 * 2);
    }

    private Surface u2(C2006D c2006d) {
        S s = this.Z1;
        if (s != null) {
            return s.j();
        }
        Surface surface = this.d2;
        if (surface != null) {
            return surface;
        }
        if (Y2(c2006d)) {
            return null;
        }
        C0968a.g(Z2(c2006d));
        C2676o c2676o = this.e2;
        if (c2676o != null && c2676o.q != c2006d.g) {
            M2();
        }
        if (this.e2 == null) {
            this.e2 = C2676o.c(this.K1, c2006d.g);
        }
        return this.e2;
    }

    private boolean v2(C2006D c2006d) {
        if (this.Z1 != null) {
            return true;
        }
        Surface surface = this.d2;
        return (surface != null && surface.isValid()) || Y2(c2006d) || Z2(c2006d);
    }

    private boolean w2(ax.V0.i iVar) {
        return iVar.g0 < O();
    }

    private boolean x2(ax.V0.i iVar) {
        if (n() || iVar.w() || this.A2 == -9223372036854775807L) {
            return true;
        }
        return this.A2 - (iVar.g0 - P0()) <= 100000;
    }

    private void z2() {
        if (this.k2 > 0) {
            long b2 = K().b();
            this.M1.n(this.k2, b2 - this.j2);
            this.k2 = 0;
            this.j2 = b2;
        }
    }

    @Override // ax.f1.L, androidx.media3.exoplayer.AbstractC0601h, androidx.media3.exoplayer.K0.b
    public void B(int i, Object obj) throws C0622s {
        if (i == 1) {
            Q2(obj);
            return;
        }
        if (i == 7) {
            z zVar = (z) C0968a.e(obj);
            this.y2 = zVar;
            S s = this.Z1;
            if (s != null) {
                s.p(zVar);
                return;
            }
            return;
        }
        if (i == 10) {
            int intValue = ((Integer) C0968a.e(obj)).intValue();
            if (this.w2 != intValue) {
                this.w2 = intValue;
                if (this.v2) {
                    w1();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            this.h2 = ((Integer) C0968a.e(obj)).intValue();
            InterfaceC2029x E0 = E0();
            if (E0 != null) {
                E0.n(this.h2);
                return;
            }
            return;
        }
        if (i == 5) {
            int intValue2 = ((Integer) C0968a.e(obj)).intValue();
            this.i2 = intValue2;
            S s2 = this.Z1;
            if (s2 != null) {
                s2.s(intValue2);
                return;
            } else {
                this.P1.l(intValue2);
                return;
            }
        }
        if (i == 13) {
            T2((List) C0968a.e(obj));
            return;
        }
        if (i == 14) {
            ax.S0.I i2 = (ax.S0.I) C0968a.e(obj);
            if (i2.b() == 0 || i2.a() == 0) {
                return;
            }
            this.f2 = i2;
            S s3 = this.Z1;
            if (s3 != null) {
                s3.t((Surface) C0968a.i(this.d2), i2);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                this.u2 = ((Integer) C0968a.e(obj)).intValue();
                c3();
                break;
            case 17:
                Surface surface = this.d2;
                Q2(null);
                ((C2672k) C0968a.e(obj)).B(1, surface);
                break;
            case 18:
                Y y = this.n2;
                boolean z = y != null && y.d;
                Y y2 = (Y) obj;
                this.n2 = y2;
                if (z != (y2 != null && y2.d)) {
                    T1();
                    break;
                }
                break;
            default:
                super.B(i, obj);
                break;
        }
    }

    @Override // ax.o1.C2656A.b
    public boolean E(long j, long j2) {
        return W2(j, j2);
    }

    @Override // ax.f1.L
    protected int F0(ax.V0.i iVar) {
        Y y;
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.V1 || (((y = this.n2) != null && y.h) || this.v2)) && w2(iVar) && !x2(iVar)) ? 32 : 0;
        }
        return 0;
    }

    @Override // ax.f1.L
    protected boolean I0() {
        return this.v2 && Build.VERSION.SDK_INT < 23;
    }

    @Override // ax.f1.L
    protected float J0(float f2, C0912v c0912v, C0912v[] c0912vArr) {
        C2006D G0;
        float f3 = -1.0f;
        for (C0912v c0912v2 : c0912vArr) {
            float f4 = c0912v2.z;
            if (f4 != -1.0f) {
                f3 = Math.max(f3, f4);
            }
        }
        float f5 = f3 == -1.0f ? -1.0f : f3 * f2;
        if (this.n2 == null || (G0 = G0()) == null) {
            return f5;
        }
        float h = G0.h(c0912v.v, c0912v.w);
        return f5 != -1.0f ? Math.max(f5, h) : h;
    }

    protected void J2(long j) throws C0622s {
        W1(j);
        C2(this.s2);
        this.B1.e++;
        A2();
        n1(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    @Override // ax.f1.L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean K1(ax.V0.i r9) {
        /*
            r8 = this;
            boolean r0 = r8.x2(r9)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r8.w2(r9)
            ax.o1.B r2 = r8.T1
            r3 = 1
            if (r2 == 0) goto L28
            long r4 = r9.g0
            long r4 = r2.c(r4)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L28
            long r6 = r8.S1
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L28
            r2 = 1
            goto L29
        L28:
            r2 = 0
        L29:
            if (r0 != 0) goto L2e
            if (r2 != 0) goto L2e
            return r1
        L2e:
            boolean r2 = r9.r()
            if (r2 == 0) goto L35
            return r1
        L35:
            boolean r2 = r9.x()
            if (r2 == 0) goto L40
            r9.p()
        L3e:
            r1 = 1
            goto La2
        L40:
            ax.o1.a r2 = r8.R1
            if (r2 == 0) goto La2
            ax.f1.D r2 = r8.G0()
            java.lang.Object r2 = ax.S0.C0968a.e(r2)
            ax.f1.D r2 = (ax.f1.C2006D) r2
            java.lang.String r2 = r2.b
            java.lang.String r4 = "video/av01"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto La2
            java.nio.ByteBuffer r2 = r9.e0
            if (r2 == 0) goto La2
            if (r0 != 0) goto L65
            int r4 = r8.C2
            if (r4 > 0) goto L63
            goto L65
        L63:
            r4 = 0
            goto L66
        L65:
            r4 = 1
        L66:
            java.nio.ByteBuffer r2 = r2.asReadOnlyBuffer()
            r2.flip()
            ax.o1.a r5 = r8.R1
            int r4 = r5.d(r2, r4)
            if (r4 != 0) goto L79
            r9.p()
            goto L3e
        L79:
            int r5 = r2.limit()
            if (r4 == r5) goto La2
            ax.o1.k$e r5 = r8.W1
            java.lang.Object r5 = ax.S0.C0968a.e(r5)
            ax.o1.k$e r5 = (ax.o1.C2672k.e) r5
            int r5 = r5.c
            int r5 = r5 + r4
            int r2 = r2.capacity()
            if (r5 >= r2) goto La2
            boolean r2 = r9.E()
            if (r2 != 0) goto La2
            java.nio.ByteBuffer r1 = r9.e0
            java.lang.Object r1 = ax.S0.C0968a.e(r1)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            r1.position(r4)
            goto L3e
        La2:
            if (r1 == 0) goto Lbe
            if (r0 == 0) goto Lae
            ax.Y0.b r9 = r8.B1
            int r0 = r9.d
            int r0 = r0 + r3
            r9.d = r0
            return r1
        Lae:
            java.util.PriorityQueue<java.lang.Long> r0 = r8.U1
            long r4 = r9.g0
            java.lang.Long r9 = java.lang.Long.valueOf(r4)
            r0.add(r9)
            int r9 = r8.C2
            int r9 = r9 + r3
            r8.C2 = r9
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.o1.C2672k.K1(ax.V0.i):boolean");
    }

    @Override // ax.f1.L
    protected List<C2006D> L0(ax.f1.Q q, C0912v c0912v, boolean z) throws a0.c {
        return ax.f1.a0.o(q2(this.K1, q, c0912v, z, this.v2), c0912v);
    }

    @Override // ax.f1.L
    protected final boolean L1() {
        C0912v H0 = H0();
        Y y = this.n2;
        if (y == null) {
            return super.L1();
        }
        if (!y.f || this.o2 || this.v2) {
            return true;
        }
        return (H0 != null && H0.q > 0) || V0() || N0() != -9223372036854775807L;
    }

    @Override // ax.f1.L
    protected boolean M1(C2006D c2006d) {
        return v2(c2006d);
    }

    @Override // ax.f1.L
    protected InterfaceC2029x.a O0(C2006D c2006d, C0912v c0912v, MediaCrypto mediaCrypto, float f2) {
        int i;
        C2672k c2672k;
        C0912v c0912v2;
        float f3;
        String str = c2006d.c;
        e p2 = p2(c2006d, c0912v, Q());
        this.W1 = p2;
        boolean z = this.O1;
        if (this.v2) {
            i = this.w2;
            c0912v2 = c0912v;
            f3 = f2;
            c2672k = this;
        } else {
            i = 0;
            c2672k = this;
            c0912v2 = c0912v;
            f3 = f2;
        }
        MediaFormat t2 = c2672k.t2(c0912v2, str, p2, f3, z, i);
        Surface u2 = u2(c2006d);
        F2(t2);
        return InterfaceC2029x.a.b(c2006d, t2, c0912v2, u2, mediaCrypto);
    }

    @Override // ax.f1.L
    protected final boolean O1() {
        C2006D G0 = G0();
        if (this.Z1 == null || G0 == null || !(G0.a.equals("c2.mtk.avc.decoder") || G0.a.equals("c2.mtk.hevc.decoder"))) {
            return super.O1();
        }
        return true;
    }

    protected void O2(InterfaceC2029x interfaceC2029x, int i, long j, long j2) {
        ax.S0.N.a("releaseOutputBuffer");
        interfaceC2029x.i(i, j2);
        ax.S0.N.b();
        this.B1.e++;
        this.l2 = 0;
        if (this.Z1 == null) {
            C2(this.s2);
            A2();
        }
    }

    @Override // ax.f1.L
    protected int R1(ax.f1.Q q, C0912v c0912v) throws a0.c {
        return b3(this.K1, q, c0912v);
    }

    protected void S2(InterfaceC2029x interfaceC2029x, Surface surface) {
        interfaceC2029x.p(surface);
    }

    @Override // ax.f1.L
    @TargetApi(29)
    protected void T0(ax.V0.i iVar) throws C0622s {
        if (this.Y1) {
            ByteBuffer byteBuffer = (ByteBuffer) C0968a.e(iVar.h0);
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s == 60 && s2 == 1 && b3 == 4) {
                    if (b4 == 0 || b4 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        P2((InterfaceC2029x) C0968a.e(E0()), bArr);
                    }
                }
            }
        }
    }

    public void T2(List<Object> list) {
        if (list.equals(ax.P0.Y.a)) {
            S s = this.Z1;
            if (s == null || !s.b()) {
                return;
            }
            this.Z1.h();
            return;
        }
        this.c2 = list;
        S s2 = this.Z1;
        if (s2 != null) {
            s2.w(list);
        }
    }

    @Override // ax.f1.L, androidx.media3.exoplayer.AbstractC0601h
    protected void U() {
        this.t2 = null;
        this.A2 = -9223372036854775807L;
        G2();
        this.g2 = false;
        this.x2 = null;
        this.o2 = true;
        try {
            super.U();
        } finally {
            this.M1.m(this.B1);
            this.M1.t(ax.P0.a0.e);
        }
    }

    protected boolean U2(long j, long j2, boolean z) {
        return j < -500000 && !z;
    }

    @Override // ax.f1.L, androidx.media3.exoplayer.AbstractC0601h
    protected void V(boolean z, boolean z2) throws C0622s {
        super.V(z, z2);
        boolean z3 = L().b;
        C0968a.g((z3 && this.w2 == 0) ? false : true);
        if (this.v2 != z3) {
            this.v2 = z3;
            w1();
        }
        this.M1.o(this.B1);
        if (!this.a2) {
            if (this.c2 != null && this.Z1 == null) {
                C2679s h2 = h2(this.K1, this.P1);
                h2.S(1);
                this.Z1 = h2.F(0);
            }
            this.a2 = true;
        }
        if (this.Z1 == null) {
            this.P1.m(K());
            this.P1.j(!z2 ? 1 : 0);
        } else {
            g2();
            this.b2 = !z2 ? 1 : 0;
            y0();
        }
    }

    protected boolean V2(long j, long j2, boolean z) {
        return j < -30000 && !z;
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void W() {
        super.W();
    }

    protected boolean W2(long j, long j2) {
        return j < -30000 && j2 > 100000;
    }

    @Override // ax.f1.L, androidx.media3.exoplayer.AbstractC0601h
    protected void X(long j, boolean z) throws C0622s {
        S s = this.Z1;
        if (s != null && !z) {
            s.v(true);
        }
        super.X(j, z);
        if (this.Z1 == null) {
            this.P1.k();
        }
        C2657B c2657b = this.T1;
        if (c2657b != null) {
            c2657b.d();
        }
        if (z) {
            S s2 = this.Z1;
            if (s2 != null) {
                s2.x(false);
            } else {
                this.P1.e(false);
            }
        }
        G2();
        this.l2 = 0;
    }

    protected boolean X2() {
        return true;
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void Y() {
        super.Y();
        S s = this.Z1;
        if (s == null || !this.L1) {
            return;
        }
        s.d();
    }

    protected boolean Y2(C2006D c2006d) {
        return Build.VERSION.SDK_INT >= 35 && c2006d.k;
    }

    protected boolean Z2(C2006D c2006d) {
        if (Build.VERSION.SDK_INT < 23 || this.v2 || f2(c2006d.a)) {
            return false;
        }
        return !c2006d.g || C2676o.b(this.K1);
    }

    @Override // ax.f1.L, androidx.media3.exoplayer.AbstractC0601h
    protected void a0() {
        try {
            super.a0();
        } finally {
            this.a2 = false;
            this.z2 = -9223372036854775807L;
            M2();
        }
    }

    protected void a3(InterfaceC2029x interfaceC2029x, int i, long j) {
        ax.S0.N.a("skipVideoBuffer");
        interfaceC2029x.m(i, false);
        ax.S0.N.b();
        this.B1.f++;
    }

    @Override // ax.f1.L, androidx.media3.exoplayer.AbstractC0601h
    protected void b0() {
        super.b0();
        this.k2 = 0;
        this.j2 = K().b();
        this.p2 = 0L;
        this.q2 = 0;
        S s = this.Z1;
        if (s != null) {
            s.n();
        } else {
            this.P1.h();
        }
    }

    @Override // ax.f1.L, androidx.media3.exoplayer.M0
    public boolean c() {
        if (!super.c()) {
            return false;
        }
        S s = this.Z1;
        return s == null || s.c();
    }

    @Override // ax.f1.L, androidx.media3.exoplayer.AbstractC0601h
    protected void c0() {
        z2();
        B2();
        S s = this.Z1;
        if (s != null) {
            s.l();
        } else {
            this.P1.i();
        }
        C2657B c2657b = this.T1;
        if (c2657b != null) {
            c2657b.d();
        }
        super.c0();
    }

    @Override // ax.f1.L, androidx.media3.exoplayer.AbstractC0601h
    protected void d0(C0912v[] c0912vArr, long j, long j2, InterfaceC2209F.b bVar) throws C0622s {
        super.d0(c0912vArr, j, j2, bVar);
        f3(bVar);
        C2657B c2657b = this.T1;
        if (c2657b != null) {
            c2657b.d();
        }
    }

    protected void d3(int i, int i2) {
        C1176b c1176b = this.B1;
        c1176b.h += i;
        int i3 = i + i2;
        c1176b.g += i3;
        this.k2 += i3;
        int i4 = this.l2 + i3;
        this.l2 = i4;
        c1176b.i = Math.max(i4, c1176b.i);
        int i5 = this.N1;
        if (i5 <= 0 || this.k2 < i5) {
            return;
        }
        z2();
    }

    protected void e2(S s, int i, C0912v c0912v, int i2) {
        List<Object> list = this.c2;
        if (list == null) {
            list = AbstractC2991z.z();
        }
        s.r(i, c0912v, Q0(), i2, list);
    }

    protected boolean f2(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C2672k.class) {
            try {
                if (!E2) {
                    F2 = l2();
                    E2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return F2;
    }

    @Override // ax.o1.C2656A.b
    public boolean g(long j, long j2, long j3, boolean z, boolean z2) throws C0622s {
        if (this.Z1 != null && this.L1) {
            j2 -= m2();
        }
        return U2(j, j3, z) && y2(j2, z2);
    }

    @Override // ax.f1.L
    protected boolean g1(C0912v c0912v) throws C0622s {
        S s = this.Z1;
        if (s == null || s.b()) {
            return true;
        }
        try {
            return this.Z1.z(c0912v);
        } catch (S.c e2) {
            throw I(e2, c0912v, 7000);
        }
    }

    protected void g3(long j) {
        this.B1.a(j);
        this.p2 += j;
        this.q2++;
    }

    @Override // androidx.media3.exoplayer.M0, androidx.media3.exoplayer.N0
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // ax.f1.L
    protected void h1(Exception exc) {
        C0987u.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.M1.s(exc);
    }

    protected C2679s h2(Context context, C2656A c2656a) {
        return new C2679s.b(context, c2656a).h(true).g(K()).f();
    }

    @Override // ax.f1.L, androidx.media3.exoplayer.M0
    public void i(long j, long j2) throws C0622s {
        S s = this.Z1;
        if (s != null) {
            try {
                s.i(j, j2);
            } catch (S.c e2) {
                throw I(e2, e2.q, 7001);
            }
        }
        super.i(j, j2);
    }

    @Override // ax.f1.L
    protected void i1(String str, InterfaceC2029x.a aVar, long j, long j2) {
        this.M1.k(str, j, j2);
        this.X1 = f2(str);
        this.Y1 = ((C2006D) C0968a.e(G0())).r();
        G2();
    }

    protected void i2(InterfaceC2029x interfaceC2029x) {
        interfaceC2029x.g();
    }

    @Override // ax.f1.L, androidx.media3.exoplayer.M0
    public boolean isReady() {
        boolean isReady = super.isReady();
        S s = this.Z1;
        if (s != null) {
            return s.y(isReady);
        }
        if (isReady && (E0() == null || this.v2)) {
            return true;
        }
        return this.P1.d(isReady);
    }

    @Override // ax.f1.L
    protected void j1(String str) {
        this.M1.l(str);
    }

    @Override // ax.f1.L
    protected C1177c k1(ax.Y0.O o) throws C0622s {
        C1177c k1 = super.k1(o);
        this.M1.p((C0912v) C0968a.e(o.b), k1);
        C2657B c2657b = this.T1;
        if (c2657b != null) {
            c2657b.d();
        }
        return k1;
    }

    protected void k2(InterfaceC2029x interfaceC2029x, int i, long j) {
        ax.S0.N.a("dropVideoBuffer");
        interfaceC2029x.m(i, false);
        ax.S0.N.b();
        d3(0, 1);
    }

    @Override // ax.f1.L
    protected C1177c l0(C2006D c2006d, C0912v c0912v, C0912v c0912v2) {
        C1177c e2 = c2006d.e(c0912v, c0912v2);
        int i = e2.e;
        e eVar = (e) C0968a.e(this.W1);
        if (c0912v2.v > eVar.a || c0912v2.w > eVar.b) {
            i |= 256;
        }
        if (r2(c2006d, c0912v2) > eVar.c) {
            i |= 64;
        }
        int i2 = i;
        return new C1177c(c2006d.a, c0912v, c0912v2, i2 != 0 ? 0 : e2.d, i2);
    }

    @Override // ax.f1.L
    protected void l1(C0912v c0912v, MediaFormat mediaFormat) {
        int integer;
        int i;
        InterfaceC2029x E0 = E0();
        if (E0 != null) {
            E0.n(this.h2);
        }
        if (this.v2) {
            i = c0912v.v;
            integer = c0912v.w;
        } else {
            C0968a.e(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f2 = c0912v.B;
        int i2 = c0912v.A;
        if (i2 == 90 || i2 == 270) {
            f2 = 1.0f / f2;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.s2 = new ax.P0.a0(i, integer, f2);
        S s = this.Z1;
        if (s == null || !this.B2) {
            this.P1.n(c0912v.z);
        } else {
            e2(s, 1, c0912v.b().F0(i).h0(integer).u0(f2).P(), this.b2);
            this.b2 = 2;
        }
        this.B2 = false;
    }

    protected long m2() {
        return -this.z2;
    }

    @Override // ax.f1.L
    protected void n1(long j) {
        super.n1(j);
        if (this.v2) {
            return;
        }
        this.m2--;
    }

    @Override // ax.f1.L
    protected void o1() {
        super.o1();
        S s = this.Z1;
        if (s != null) {
            s.q();
            if (this.z2 == -9223372036854775807L) {
                this.z2 = Q0();
            }
            this.Z1.o(m2());
        } else {
            this.P1.j(2);
        }
        this.B2 = true;
        G2();
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h, androidx.media3.exoplayer.M0
    public void p() {
        S s = this.Z1;
        if (s == null) {
            this.P1.a();
            return;
        }
        int i = this.b2;
        if (i == 0 || i == 1) {
            this.b2 = 0;
        } else {
            s.A();
        }
    }

    @Override // ax.f1.L
    protected void p1(ax.V0.i iVar) throws C0622s {
        ByteBuffer byteBuffer;
        if (this.R1 != null && ((C2006D) C0968a.e(G0())).b.equals("video/av01") && (byteBuffer = iVar.e0) != null) {
            this.R1.b(byteBuffer);
        }
        this.C2 = 0;
        int F0 = F0(iVar);
        int i = Build.VERSION.SDK_INT;
        if ((i < 34 || (F0 & 32) == 0) && !this.v2) {
            this.m2++;
        }
        if (i >= 23 || !this.v2) {
            return;
        }
        J2(iVar.g0);
    }

    protected e p2(C2006D c2006d, C0912v c0912v, C0912v[] c0912vArr) {
        int n2;
        int i = c0912v.v;
        int i2 = c0912v.w;
        int r2 = r2(c2006d, c0912v);
        if (c0912vArr.length == 1) {
            if (r2 != -1 && (n2 = n2(c2006d, c0912v)) != -1) {
                r2 = Math.min((int) (r2 * 1.5f), n2);
            }
            return new e(i, i2, r2);
        }
        int length = c0912vArr.length;
        boolean z = false;
        for (int i3 = 0; i3 < length; i3++) {
            C0912v c0912v2 = c0912vArr[i3];
            if (c0912v.E != null && c0912v2.E == null) {
                c0912v2 = c0912v2.b().V(c0912v.E).P();
            }
            if (c2006d.e(c0912v, c0912v2).d != 0) {
                int i4 = c0912v2.v;
                z |= i4 == -1 || c0912v2.w == -1;
                i = Math.max(i, i4);
                i2 = Math.max(i2, c0912v2.w);
                r2 = Math.max(r2, r2(c2006d, c0912v2));
            }
        }
        if (z) {
            C0987u.h("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i + "x" + i2);
            Point o2 = o2(c2006d, c0912v);
            if (o2 != null) {
                i = Math.max(i, o2.x);
                i2 = Math.max(i2, o2.y);
                r2 = Math.max(r2, n2(c2006d, c0912v.b().F0(i).h0(i2).P()));
                C0987u.h("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i + "x" + i2);
            }
        }
        return new e(i, i2, r2);
    }

    @Override // ax.f1.L
    protected C2004B r0(Throwable th, C2006D c2006d) {
        return new C2671j(th, c2006d, this.d2);
    }

    @Override // ax.f1.L
    protected boolean s1(long j, long j2, InterfaceC2029x interfaceC2029x, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C0912v c0912v) throws C0622s {
        C0968a.e(interfaceC2029x);
        long P0 = j3 - P0();
        e3(j3);
        S s = this.Z1;
        if (s != null) {
            if (!z || z2) {
                return s.k(j3, new b(interfaceC2029x, i, P0));
            }
            a3(interfaceC2029x, i, P0);
            return true;
        }
        int c2 = this.P1.c(j3, j, j2, Q0(), z, z2, this.Q1);
        C2657B c2657b = this.T1;
        if (c2657b != null && c2 != 5 && c2 != 4) {
            c2657b.b(j3, this.Q1.f());
        }
        if (c2 == 0) {
            long nanoTime = K().nanoTime();
            H2(P0, nanoTime, c0912v);
            N2(interfaceC2029x, i, P0, nanoTime);
            g3(this.Q1.f());
            return true;
        }
        if (c2 == 1) {
            L2((InterfaceC2029x) C0968a.i(interfaceC2029x), i, P0, c0912v);
            return true;
        }
        if (c2 == 2) {
            k2(interfaceC2029x, i, P0);
            g3(this.Q1.f());
            return true;
        }
        if (c2 == 3) {
            a3(interfaceC2029x, i, P0);
            g3(this.Q1.f());
            return true;
        }
        if (c2 == 4 || c2 == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(c2));
    }

    @SuppressLint({"InlinedApi"})
    protected MediaFormat t2(C0912v c0912v, String str, e eVar, float f2, boolean z, int i) {
        Pair<Integer, Integer> j;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", c0912v.v);
        mediaFormat.setInteger("height", c0912v.w);
        C0990x.e(mediaFormat, c0912v.r);
        C0990x.c(mediaFormat, "frame-rate", c0912v.z);
        C0990x.d(mediaFormat, "rotation-degrees", c0912v.A);
        C0990x.b(mediaFormat, c0912v.E);
        if ("video/dolby-vision".equals(c0912v.o) && (j = ax.f1.a0.j(c0912v)) != null) {
            C0990x.d(mediaFormat, "profile", ((Integer) j.first).intValue());
        }
        mediaFormat.setInteger("max-width", eVar.a);
        mediaFormat.setInteger("max-height", eVar.b);
        C0990x.d(mediaFormat, "max-input-size", eVar.c);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f2 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f2);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i);
        }
        if (i2 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.u2));
        }
        return mediaFormat;
    }

    @Override // ax.f1.L, androidx.media3.exoplayer.AbstractC0601h, androidx.media3.exoplayer.M0
    public void x(float f2, float f3) throws C0622s {
        super.x(f2, f3);
        S s = this.Z1;
        if (s != null) {
            s.g(f2);
        } else {
            this.P1.p(f2);
        }
        C2657B c2657b = this.T1;
        if (c2657b != null) {
            c2657b.e(f2);
        }
    }

    @Override // ax.f1.L
    protected void x1() {
        S s = this.Z1;
        if (s != null) {
            s.q();
        }
    }

    @Override // ax.o1.C2656A.b
    public boolean y(long j, long j2, boolean z) {
        return V2(j, j2, z);
    }

    protected boolean y2(long j, boolean z) throws C0622s {
        int h0 = h0(j);
        if (h0 == 0) {
            return false;
        }
        if (z) {
            C1176b c1176b = this.B1;
            int i = c1176b.d + h0;
            c1176b.d = i;
            c1176b.f += this.m2;
            c1176b.d = i + this.U1.size();
        } else {
            this.B1.j++;
            d3(h0 + this.U1.size(), this.m2);
        }
        B0();
        S s = this.Z1;
        if (s != null) {
            s.v(false);
        }
        return true;
    }

    @Override // ax.f1.L
    protected void z1() {
        super.z1();
        this.U1.clear();
        this.m2 = 0;
        this.C2 = 0;
        this.o2 = false;
        C2662a c2662a = this.R1;
        if (c2662a != null) {
            c2662a.c();
        }
    }

    /* renamed from: ax.o1.k$a */
    class a implements S.a {
        a() {
        }

        @Override // ax.o1.S.a
        public void b() {
            M0.a S0 = C2672k.this.S0();
            if (S0 != null) {
                S0.b();
            }
        }

        @Override // ax.o1.S.a
        public void e() {
            if (C2672k.this.d2 != null) {
                C2672k.this.I2();
            }
        }

        @Override // ax.o1.S.a
        public void f() {
            if (C2672k.this.d2 != null) {
                C2672k.this.d3(0, 1);
            }
        }

        @Override // ax.o1.S.a
        public void a(ax.P0.a0 a0Var) {
        }
    }
}
