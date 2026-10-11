package ax.e1;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.AbstractC0601h;
import androidx.media3.exoplayer.C0622s;
import androidx.media3.exoplayer.image.ImageOutput;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.N;
import ax.V0.i;
import ax.Y0.O;
import ax.Y0.V;
import ax.e1.InterfaceC1969b;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* renamed from: ax.e1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1972e extends AbstractC0601h {
    private long A0;
    private int B0;
    private int C0;
    private C0912v D0;
    private InterfaceC1969b E0;
    private i F0;
    private ImageOutput G0;
    private Bitmap H0;
    private boolean I0;
    private b J0;
    private b K0;
    private int L0;
    private boolean M0;
    private final InterfaceC1969b.a t0;
    private final i u0;
    private final ArrayDeque<a> v0;
    private boolean w0;
    private boolean x0;
    private a y0;
    private long z0;

    /* renamed from: ax.e1.e$a */
    private static final class a {
        public static final a c = new a(-9223372036854775807L, -9223372036854775807L);
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    /* renamed from: ax.e1.e$b */
    private static class b {
        private final int a;
        private final long b;
        private Bitmap c;

        public b(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public long a() {
            return this.b;
        }

        public Bitmap b() {
            return this.c;
        }

        public int c() {
            return this.a;
        }

        public boolean d() {
            return this.c != null;
        }

        public void e(Bitmap bitmap) {
            this.c = bitmap;
        }
    }

    public C1972e(InterfaceC1969b.a aVar, ImageOutput imageOutput) {
        super(4);
        this.t0 = aVar;
        this.G0 = m0(imageOutput);
        this.u0 = i.F();
        this.y0 = a.c;
        this.v0 = new ArrayDeque<>();
        this.A0 = -9223372036854775807L;
        this.z0 = -9223372036854775807L;
        this.B0 = 0;
        this.C0 = 1;
    }

    private boolean i0(C0912v c0912v) {
        int b2 = this.t0.b(c0912v);
        return b2 == V.a(4) || b2 == V.a(3);
    }

    private Bitmap j0(int i) {
        C0968a.i(this.H0);
        int width = this.H0.getWidth() / ((C0912v) C0968a.i(this.D0)).N;
        int height = this.H0.getHeight() / ((C0912v) C0968a.i(this.D0)).O;
        int i2 = this.D0.N;
        return Bitmap.createBitmap(this.H0, (i % i2) * width, (i / i2) * height, width, height);
    }

    private boolean k0(long j, long j2) throws C1970c, C0622s {
        if (this.H0 != null && this.J0 == null) {
            return false;
        }
        if (this.C0 == 0 && getState() != 2) {
            return false;
        }
        if (this.H0 == null) {
            C0968a.i(this.E0);
            AbstractC1971d a2 = this.E0.a();
            if (a2 == null) {
                return false;
            }
            if (((AbstractC1971d) C0968a.i(a2)).s()) {
                if (this.B0 == 3) {
                    u0();
                    C0968a.i(this.D0);
                    q0();
                } else {
                    ((AbstractC1971d) C0968a.i(a2)).B();
                    if (this.v0.isEmpty()) {
                        this.x0 = true;
                    }
                }
                return false;
            }
            C0968a.j(a2.f0, "Non-EOS buffer came back from the decoder without bitmap.");
            this.H0 = a2.f0;
            ((AbstractC1971d) C0968a.i(a2)).B();
        }
        if (!this.I0 || this.H0 == null || this.J0 == null) {
            return false;
        }
        C0968a.i(this.D0);
        C0912v c0912v = this.D0;
        int i = c0912v.N;
        boolean z = ((i == 1 && c0912v.O == 1) || i == -1 || c0912v.O == -1) ? false : true;
        if (!this.J0.d()) {
            b bVar = this.J0;
            bVar.e(z ? j0(bVar.c()) : (Bitmap) C0968a.i(this.H0));
        }
        if (!t0(j, j2, (Bitmap) C0968a.i(this.J0.b()), this.J0.a())) {
            return false;
        }
        s0(((b) C0968a.i(this.J0)).a());
        this.C0 = 3;
        if (!z || ((b) C0968a.i(this.J0)).c() == (((C0912v) C0968a.i(this.D0)).O * ((C0912v) C0968a.i(this.D0)).N) - 1) {
            this.H0 = null;
        }
        this.J0 = this.K0;
        this.K0 = null;
        return true;
    }

    private boolean l0(long j) throws C1970c {
        if (this.I0 && this.J0 != null) {
            return false;
        }
        O M = M();
        InterfaceC1969b interfaceC1969b = this.E0;
        if (interfaceC1969b == null || this.B0 == 3 || this.w0) {
            return false;
        }
        if (this.F0 == null) {
            i f = interfaceC1969b.f();
            this.F0 = f;
            if (f == null) {
                return false;
            }
        }
        if (this.B0 == 2) {
            C0968a.i(this.F0);
            this.F0.A(4);
            ((InterfaceC1969b) C0968a.i(this.E0)).c(this.F0);
            this.F0 = null;
            this.B0 = 3;
            return false;
        }
        int f0 = f0(M, this.F0, 0);
        if (f0 == -5) {
            this.D0 = (C0912v) C0968a.i(M.b);
            this.M0 = true;
            this.B0 = 2;
            return true;
        }
        if (f0 != -4) {
            if (f0 == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.F0.D();
        ByteBuffer byteBuffer = this.F0.e0;
        boolean z = (byteBuffer != null && byteBuffer.remaining() > 0) || ((i) C0968a.i(this.F0)).s();
        if (z) {
            ((i) C0968a.i(this.F0)).c0 = this.D0;
            ((InterfaceC1969b) C0968a.i(this.E0)).c((i) C0968a.i(this.F0));
            this.L0 = 0;
        }
        p0(j, (i) C0968a.i(this.F0));
        if (((i) C0968a.i(this.F0)).s()) {
            this.w0 = true;
            this.F0 = null;
            return false;
        }
        this.A0 = Math.max(this.A0, ((i) C0968a.i(this.F0)).g0);
        if (z) {
            this.F0 = null;
        } else {
            ((i) C0968a.i(this.F0)).p();
        }
        return !this.I0;
    }

    private static ImageOutput m0(ImageOutput imageOutput) {
        return imageOutput == null ? ImageOutput.a : imageOutput;
    }

    private boolean n0(b bVar) {
        return ((C0912v) C0968a.i(this.D0)).N == -1 || this.D0.O == -1 || bVar.c() == (((C0912v) C0968a.i(this.D0)).O * this.D0.N) - 1;
    }

    private void o0(int i) {
        this.C0 = Math.min(this.C0, i);
    }

    private void p0(long j, i iVar) {
        boolean z = true;
        if (iVar.s()) {
            this.I0 = true;
            return;
        }
        b bVar = new b(this.L0, iVar.g0);
        this.K0 = bVar;
        this.L0++;
        if (!this.I0) {
            long a2 = bVar.a();
            boolean z2 = a2 - 30000 <= j && j <= 30000 + a2;
            b bVar2 = this.J0;
            boolean z3 = bVar2 != null && bVar2.a() <= j && j < a2;
            boolean n0 = n0((b) C0968a.i(this.K0));
            if (!z2 && !z3 && !n0) {
                z = false;
            }
            this.I0 = z;
            if (z3 && !z2) {
                return;
            }
        }
        this.J0 = this.K0;
        this.K0 = null;
    }

    private boolean q0() throws C0622s {
        if (!r0()) {
            return false;
        }
        if (!this.M0) {
            return true;
        }
        if (!i0((C0912v) C0968a.e(this.D0))) {
            throw I(new C1970c("Provided decoder factory can't create decoder for format."), this.D0, 4005);
        }
        InterfaceC1969b interfaceC1969b = this.E0;
        if (interfaceC1969b != null) {
            interfaceC1969b.d();
        }
        this.E0 = this.t0.a();
        this.M0 = false;
        return true;
    }

    private void s0(long j) {
        this.z0 = j;
        while (!this.v0.isEmpty() && j >= this.v0.peek().a) {
            this.y0 = this.v0.removeFirst();
        }
    }

    private void u0() {
        this.F0 = null;
        this.B0 = 0;
        this.A0 = -9223372036854775807L;
        InterfaceC1969b interfaceC1969b = this.E0;
        if (interfaceC1969b != null) {
            interfaceC1969b.d();
            this.E0 = null;
        }
    }

    private void v0(ImageOutput imageOutput) {
        this.G0 = m0(imageOutput);
    }

    private boolean w0() {
        boolean z = getState() == 2;
        int i = this.C0;
        if (i == 0) {
            return z;
        }
        if (i == 1) {
            return true;
        }
        if (i == 3) {
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h, androidx.media3.exoplayer.K0.b
    public void B(int i, Object obj) throws C0622s {
        if (i != 15) {
            super.B(i, obj);
        } else {
            v0(obj instanceof ImageOutput ? (ImageOutput) obj : null);
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void U() {
        this.D0 = null;
        this.y0 = a.c;
        this.v0.clear();
        u0();
        this.G0.a();
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void V(boolean z, boolean z2) throws C0622s {
        this.C0 = z2 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void X(long j, boolean z) throws C0622s {
        o0(1);
        this.x0 = false;
        this.w0 = false;
        this.H0 = null;
        this.J0 = null;
        this.K0 = null;
        this.I0 = false;
        this.F0 = null;
        InterfaceC1969b interfaceC1969b = this.E0;
        if (interfaceC1969b != null) {
            interfaceC1969b.flush();
        }
        this.v0.clear();
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void Y() {
        u0();
    }

    @Override // androidx.media3.exoplayer.AbstractC0601h
    protected void a0() {
        u0();
        o0(1);
    }

    @Override // androidx.media3.exoplayer.N0
    public int b(C0912v c0912v) {
        return this.t0.b(c0912v);
    }

    @Override // androidx.media3.exoplayer.M0
    public boolean c() {
        return this.x0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // androidx.media3.exoplayer.AbstractC0601h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void d0(ax.P0.C0912v[] r5, long r6, long r8, ax.i1.InterfaceC2209F.b r10) throws androidx.media3.exoplayer.C0622s {
        /*
            r4 = this;
            super.d0(r5, r6, r8, r10)
            r5 = r4
            ax.e1.e$a r6 = r5.y0
            long r6 = r6.b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L37
            java.util.ArrayDeque<ax.e1.e$a> r6 = r5.v0
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L2a
            long r6 = r5.A0
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L37
            long r2 = r5.z0
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L2a
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 < 0) goto L2a
            goto L37
        L2a:
            java.util.ArrayDeque<ax.e1.e$a> r6 = r5.v0
            ax.e1.e$a r7 = new ax.e1.e$a
            long r0 = r5.A0
            r7.<init>(r0, r8)
            r6.add(r7)
            return
        L37:
            ax.e1.e$a r6 = new ax.e1.e$a
            r6.<init>(r0, r8)
            r5.y0 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.e1.C1972e.d0(ax.P0.v[], long, long, ax.i1.F$b):void");
    }

    @Override // androidx.media3.exoplayer.M0, androidx.media3.exoplayer.N0
    public String getName() {
        return "ImageRenderer";
    }

    @Override // androidx.media3.exoplayer.M0
    public void i(long j, long j2) throws C0622s {
        if (this.x0) {
            return;
        }
        if (this.D0 == null) {
            O M = M();
            this.u0.p();
            int f0 = f0(M, this.u0, 2);
            if (f0 != -5) {
                if (f0 == -4) {
                    C0968a.g(this.u0.s());
                    this.w0 = true;
                    this.x0 = true;
                    return;
                }
                return;
            }
            this.D0 = (C0912v) C0968a.i(M.b);
            this.M0 = true;
        }
        if (this.E0 != null || q0()) {
            try {
                N.a("drainAndFeedDecoder");
                while (k0(j, j2)) {
                }
                while (l0(j)) {
                }
                N.b();
            } catch (C1970c e) {
                throw I(e, null, 4003);
            }
        }
    }

    @Override // androidx.media3.exoplayer.M0
    public boolean isReady() {
        int i = this.C0;
        if (i != 3) {
            return i == 0 && this.I0;
        }
        return true;
    }

    protected boolean r0() throws C0622s {
        return true;
    }

    protected boolean t0(long j, long j2, Bitmap bitmap, long j3) throws C0622s {
        long j4 = j3 - j;
        if (!w0() && j4 >= 30000) {
            return false;
        }
        this.G0.onImageAvailable(j3 - this.y0.b, bitmap);
        return true;
    }
}
