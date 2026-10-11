/*
 * Decompiled with CFR 0.152.
 */
package ax.e1;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.h;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.s;
import ax.P0.v;
import ax.S0.N;
import ax.V0.i;
import ax.Y0.O;
import ax.Y0.V;
import ax.e1.b;
import ax.e1.c;
import ax.e1.d;
import ax.i1.F;
import java.nio.Buffer;
import java.util.ArrayDeque;

public class e
extends h {
    private long A0;
    private int B0;
    private int C0;
    private v D0;
    private ax.e1.b E0;
    private i F0;
    private ImageOutput G0;
    private Bitmap H0;
    private boolean I0;
    private b J0;
    private b K0;
    private int L0;
    private boolean M0;
    private final b.a t0;
    private final i u0;
    private final ArrayDeque<a> v0;
    private boolean w0;
    private boolean x0;
    private a y0;
    private long z0;

    public e(b.a a8, ImageOutput imageOutput) {
        super(4);
        this.t0 = a8;
        this.G0 = e.m0(imageOutput);
        this.u0 = i.F();
        this.y0 = a.c;
        this.v0 = new ArrayDeque();
        this.A0 = -9223372036854775807L;
        this.z0 = -9223372036854775807L;
        this.B0 = 0;
        this.C0 = 1;
    }

    private boolean i0(v v8) {
        int n8 = this.t0.b(v8);
        return n8 == V.a(4) || n8 == V.a(3);
        {
        }
    }

    private Bitmap j0(int n8) {
        ax.S0.a.i(this.H0);
        int n9 = this.H0.getWidth() / ax.S0.a.i(this.D0).N;
        int n10 = this.H0.getHeight() / ax.S0.a.i(this.D0).O;
        int n11 = this.D0.N;
        int n12 = n8 / n11;
        return Bitmap.createBitmap((Bitmap)this.H0, (int)(n8 % n11 * n9), (int)(n12 * n10), (int)n9, (int)n10);
    }

    private boolean k0(long l8, long l9) throws c, s {
        Object object;
        if (this.H0 != null && this.J0 == null) {
            return false;
        }
        if (this.C0 == 0 && this.getState() != 2) {
            return false;
        }
        if (this.H0 == null) {
            ax.S0.a.i(this.E0);
            object = this.E0.a();
            if (object == null) {
                return false;
            }
            if (ax.S0.a.i(object).s()) {
                if (this.B0 == 3) {
                    this.u0();
                    ax.S0.a.i(this.D0);
                    this.q0();
                } else {
                    ((d)ax.S0.a.i(object)).B();
                    if (this.v0.isEmpty()) {
                        this.x0 = true;
                    }
                }
                return false;
            }
            ax.S0.a.j(((d)object).f0, "Non-EOS buffer came back from the decoder without bitmap.");
            this.H0 = ((d)object).f0;
            ((d)ax.S0.a.i(object)).B();
        }
        if (this.I0 && this.H0 != null && this.J0 != null) {
            ax.S0.a.i(this.D0);
            object = this.D0;
            int n8 = ((v)object).N;
            n8 = (n8 != 1 || ((v)object).O != 1) && n8 != -1 && ((v)object).O != -1 ? 1 : 0;
            if (!this.J0.d()) {
                b b8 = this.J0;
                object = n8 != 0 ? this.j0(b8.c()) : ax.S0.a.i(this.H0);
                b8.e((Bitmap)object);
            }
            if (!this.t0(l8, l9, ax.S0.a.i(this.J0.b()), this.J0.a())) {
                return false;
            }
            this.s0(ax.S0.a.i(this.J0).a());
            this.C0 = 3;
            if (n8 == 0 || ax.S0.a.i(this.J0).c() == ax.S0.a.i(this.D0).O * ax.S0.a.i(this.D0).N - 1) {
                this.H0 = null;
            }
            this.J0 = this.K0;
            this.K0 = null;
            return true;
        }
        return false;
    }

    private boolean l0(long l8) throws c {
        if (this.I0 && this.J0 != null) {
            return false;
        }
        Object object = this.M();
        Object object2 = this.E0;
        if (object2 != null && this.B0 != 3 && !this.w0) {
            if (this.F0 == null) {
                this.F0 = object2 = (i)object2.f();
                if (object2 == null) {
                    return false;
                }
            }
            if (this.B0 == 2) {
                ax.S0.a.i(this.F0);
                this.F0.A(4);
                ax.S0.a.i(this.E0).c(this.F0);
                this.F0 = null;
                this.B0 = 3;
                return false;
            }
            int n8 = this.f0((O)object, this.F0, 0);
            if (n8 != -5) {
                if (n8 != -4) {
                    if (n8 == -3) {
                        return false;
                    }
                    throw new IllegalStateException();
                }
                this.F0.D();
                object = this.F0.e0;
                n8 = object != null && ((Buffer)object).remaining() > 0 || ax.S0.a.i(this.F0).s() ? 1 : 0;
                if (n8 != 0) {
                    ax.S0.a.i(this.F0).c0 = this.D0;
                    ax.S0.a.i(this.E0).c(ax.S0.a.i(this.F0));
                    this.L0 = 0;
                }
                this.p0(l8, ax.S0.a.i(this.F0));
                if (ax.S0.a.i(this.F0).s()) {
                    this.w0 = true;
                    this.F0 = null;
                    return false;
                }
                this.A0 = Math.max(this.A0, ax.S0.a.i(this.F0).g0);
                if (n8 != 0) {
                    this.F0 = null;
                } else {
                    ax.S0.a.i(this.F0).p();
                }
                return this.I0 ^ true;
            }
            this.D0 = ax.S0.a.i(((O)object).b);
            this.M0 = true;
            this.B0 = 2;
            return true;
        }
        return false;
    }

    private static ImageOutput m0(ImageOutput imageOutput) {
        ImageOutput imageOutput2 = imageOutput;
        if (imageOutput == null) {
            imageOutput2 = ImageOutput.a;
        }
        return imageOutput2;
    }

    private boolean n0(b b8) {
        return ax.S0.a.i(this.D0).N == -1 || this.D0.O == -1 || b8.c() == ax.S0.a.i(this.D0).O * this.D0.N - 1;
        {
        }
    }

    private void o0(int n8) {
        this.C0 = Math.min(this.C0, n8);
    }

    private void p0(long l8, i object) {
        boolean bl = ((ax.V0.a)object).s();
        boolean bl2 = true;
        if (bl) {
            this.I0 = true;
            return;
        }
        this.K0 = object = new b(this.L0, ((i)object).g0);
        ++this.L0;
        if (!this.I0) {
            long l9 = ((b)object).a();
            boolean bl3 = l9 - 30000L <= l8 && l8 <= 30000L + l9;
            object = this.J0;
            boolean bl4 = object != null && ((b)object).a() <= l8 && l8 < l9;
            boolean bl5 = this.n0(ax.S0.a.i(this.K0));
            bl = bl2;
            if (!bl3) {
                bl = bl2;
                if (!bl4) {
                    bl = bl5 ? bl2 : false;
                }
            }
            this.I0 = bl;
            if (bl4 && !bl3) {
                return;
            }
        }
        this.J0 = this.K0;
        this.K0 = null;
    }

    private boolean q0() throws s {
        if (!this.r0()) {
            return false;
        }
        if (!this.M0) {
            return true;
        }
        if (this.i0(ax.S0.a.e(this.D0))) {
            ax.e1.b b8 = this.E0;
            if (b8 != null) {
                b8.d();
            }
            this.E0 = this.t0.a();
            this.M0 = false;
            return true;
        }
        throw this.I(new c("Provided decoder factory can't create decoder for format."), this.D0, 4005);
    }

    private void s0(long l8) {
        this.z0 = l8;
        while (!this.v0.isEmpty() && l8 >= this.v0.peek().a) {
            this.y0 = this.v0.removeFirst();
        }
    }

    private void u0() {
        this.F0 = null;
        this.B0 = 0;
        this.A0 = -9223372036854775807L;
        ax.e1.b b8 = this.E0;
        if (b8 != null) {
            b8.d();
            this.E0 = null;
        }
    }

    private void v0(ImageOutput imageOutput) {
        this.G0 = e.m0(imageOutput);
    }

    private boolean w0() {
        boolean bl = this.getState() == 2;
        int n8 = this.C0;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 == 3) {
                    return false;
                }
                throw new IllegalStateException();
            }
            return true;
        }
        return bl;
    }

    @Override
    public void B(int n8, Object object) throws s {
        if (n8 != 15) {
            super.B(n8, object);
            return;
        }
        object = object instanceof ImageOutput ? (ImageOutput)object : null;
        this.v0((ImageOutput)object);
    }

    @Override
    protected void U() {
        this.D0 = null;
        this.y0 = a.c;
        this.v0.clear();
        this.u0();
        this.G0.a();
    }

    @Override
    protected void V(boolean bl, boolean bl2) throws s {
        this.C0 = bl2 ? 1 : 0;
    }

    @Override
    protected void X(long l8, boolean bl) throws s {
        this.o0(1);
        this.x0 = false;
        this.w0 = false;
        this.H0 = null;
        this.J0 = null;
        this.K0 = null;
        this.I0 = false;
        this.F0 = null;
        ax.e1.b b8 = this.E0;
        if (b8 != null) {
            b8.flush();
        }
        this.v0.clear();
    }

    @Override
    protected void Y() {
        this.u0();
    }

    @Override
    protected void a0() {
        this.u0();
        this.o0(1);
    }

    @Override
    public int b(v v8) {
        return this.t0.b(v8);
    }

    @Override
    public boolean c() {
        return this.x0;
    }

    @Override
    protected void d0(v[] vArray, long l8, long l9, F.b b8) throws s {
        long l10;
        super.d0(vArray, l8, l9, b8);
        if (!(this.y0.b == -9223372036854775807L || this.v0.isEmpty() && ((l10 = this.A0) == -9223372036854775807L || (l8 = this.z0) != -9223372036854775807L && l8 >= l10))) {
            this.v0.add(new a(this.A0, l9));
            return;
        }
        this.y0 = new a(-9223372036854775807L, l9);
    }

    @Override
    public String getName() {
        return "ImageRenderer";
    }

    @Override
    public void i(long l8, long l9) throws s {
        block12: {
            block9: {
                block10: {
                    O o8;
                    block11: {
                        if (this.x0) break block9;
                        if (this.D0 != null) break block10;
                        o8 = this.M();
                        this.u0.p();
                        int n8 = this.f0(o8, this.u0, 2);
                        if (n8 == -5) break block11;
                        if (n8 == -4) {
                            ax.S0.a.g(this.u0.s());
                            this.w0 = true;
                            this.x0 = true;
                            return;
                        }
                        break block9;
                    }
                    this.D0 = ax.S0.a.i(o8.b);
                    this.M0 = true;
                }
                if (this.E0 != null || this.q0()) break block12;
            }
            return;
        }
        try {
            N.a("drainAndFeedDecoder");
            while (this.k0(l8, l9)) {
            }
            while (this.l0(l8)) {
            }
            N.b();
            return;
        }
        catch (c c8) {
            throw this.I(c8, null, 4003);
        }
    }

    @Override
    public boolean isReady() {
        int n8 = this.C0;
        return n8 == 3 || n8 == 0 && this.I0;
        {
        }
    }

    protected boolean r0() throws s {
        return true;
    }

    protected boolean t0(long l8, long l9, Bitmap bitmap, long l10) throws s {
        if (!this.w0() && l10 - l8 >= 30000L) {
            return false;
        }
        this.G0.onImageAvailable(l10 - this.y0.b, bitmap);
        return true;
    }

    private static final class a {
        public static final a c = new a(-9223372036854775807L, -9223372036854775807L);
        public final long a;
        public final long b;

        public a(long l8, long l9) {
            this.a = l8;
            this.b = l9;
        }
    }

    private static class b {
        private final int a;
        private final long b;
        private Bitmap c;

        public b(int n8, long l8) {
            this.a = n8;
            this.b = l8;
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
}

