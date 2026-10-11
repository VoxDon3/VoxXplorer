/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.media3.exoplayer.M0;
import androidx.media3.exoplayer.s;
import ax.P0.D;
import ax.P0.G;
import ax.P0.g;
import ax.P0.v;
import ax.S0.a;
import ax.S0.d0;
import ax.S0.u;
import ax.S0.x;
import ax.V0.i;
import ax.Y0.O;
import ax.Y0.S;
import ax.Y0.V;
import ax.a1.B;
import ax.a1.h;
import ax.a1.l;
import ax.a1.z;
import ax.f1.L;
import ax.f1.Q;
import ax.f1.a0;
import ax.f1.t;
import ax.f1.x;
import ax.q1.X;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

public class C0
extends L
implements S {
    private final Context K1;
    private final z.a L1;
    private final B M1;
    private final t N1;
    private int O1;
    private boolean P1;
    private boolean Q1;
    private v R1;
    private v S1;
    private long T1;
    private boolean U1;
    private boolean V1;
    private boolean W1;
    private int X1;
    private boolean Y1;
    private long Z1;

    public C0(Context context, x.b b8, Q q8, boolean bl, Handler handler, z z8, B b9) {
        t t8 = Build.VERSION.SDK_INT >= 35 ? new t() : null;
        this(context, b8, q8, bl, handler, z8, b9, t8);
    }

    public C0(Context context, x.b b8, Q q8, boolean bl, Handler handler, z z8, B b9, t t8) {
        super(1, b8, q8, bl, 44100.0f);
        this.K1 = context.getApplicationContext();
        this.M1 = b9;
        this.N1 = t8;
        this.X1 = -1000;
        this.L1 = new z.a(handler, z8);
        this.Z1 = -9223372036854775807L;
        b9.x(new c(this));
    }

    static /* synthetic */ boolean X1(C0 c02, boolean bl) {
        c02.W1 = bl;
        return bl;
    }

    private static boolean d2(String string) {
        return Build.VERSION.SDK_INT < 24 && "OMX.SEC.aac.dec".equals(string) && "samsung".equals(Build.MANUFACTURER) && ((string = Build.DEVICE).startsWith("zeroflte") || string.startsWith("herolte") || string.startsWith("heroqlte"));
    }

    private static boolean e2(String string) {
        return string.equals("OMX.google.opus.decoder") || string.equals("c2.android.opus.decoder") || string.equals("OMX.google.vorbis.decoder") || string.equals("c2.android.vorbis.decoder");
        {
        }
    }

    private static boolean f2() {
        String string;
        return Build.VERSION.SDK_INT == 23 && ("ZTE B2017G".equals(string = Build.MODEL) || "AXON 7 mini".equals(string));
    }

    private int g2(v object) {
        object = this.M1.z((v)object);
        if (!((l)object).a) {
            return 0;
        }
        int n8 = ((l)object).b ? 1536 : 512;
        if (((l)object).c) {
            return n8 | 0x800;
        }
        return n8;
    }

    private int h2(ax.f1.D d8, v v8) {
        int n8;
        if ("OMX.google.raw.decoder".equals(d8.a) && (n8 = Build.VERSION.SDK_INT) < 24 && (n8 != 23 || !d0.S0(this.K1))) {
            return -1;
        }
        return v8.p;
    }

    private static List<ax.f1.D> j2(Q q8, v v8, boolean bl, B object) throws a0.c {
        if (v8.o == null) {
            return ax.r7.z.z();
        }
        if (object.b(v8) && (object = a0.q()) != null) {
            return ax.r7.z.A(object);
        }
        return a0.n(q8, v8, bl, false);
    }

    private void m2(int n8) {
        t t8;
        this.M1.o(n8);
        if (Build.VERSION.SDK_INT >= 35 && (t8 = this.N1) != null) {
            t8.e(n8);
        }
    }

    private void n2() {
        ax.f1.x x8 = this.E0();
        if (x8 != null && Build.VERSION.SDK_INT >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.X1));
            x8.a(bundle);
        }
    }

    private void o2() {
        long l8 = this.M1.s(this.c());
        if (l8 != Long.MIN_VALUE) {
            if (!this.U1) {
                l8 = Math.max(this.T1, l8);
            }
            this.T1 = l8;
            this.U1 = false;
        }
    }

    @Override
    public void B(int n8, Object object) throws s {
        if (n8 != 2) {
            if (n8 != 3) {
                if (n8 != 6) {
                    if (n8 != 12) {
                        if (n8 != 16) {
                            if (n8 != 9) {
                                if (n8 != 10) {
                                    super.B(n8, object);
                                    return;
                                }
                                this.m2((Integer)a.e(object));
                                return;
                            }
                            this.M1.E((Boolean)a.e(object));
                            return;
                        }
                        this.X1 = (Integer)a.e(object);
                        this.n2();
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 23) {
                        b.a(this.M1, object);
                    }
                    return;
                }
                object = (g)object;
                this.M1.C((g)a.e(object));
                return;
            }
            object = (ax.P0.c)object;
            this.M1.A((ax.P0.c)a.e(object));
            return;
        }
        this.M1.l(((Float)a.e(object)).floatValue());
    }

    @Override
    public S H() {
        return this;
    }

    @Override
    protected float J0(float f8, v v8, v[] vArray) {
        int n8 = vArray.length;
        int n9 = -1;
        for (int i8 = 0; i8 < n8; ++i8) {
            int n10 = vArray[i8].H;
            int n11 = n9;
            if (n10 != -1) {
                n11 = Math.max(n9, n10);
            }
            n9 = n11;
        }
        if (n9 == -1) {
            return -1.0f;
        }
        return (float)n9 * f8;
    }

    @Override
    protected List<ax.f1.D> L0(Q q8, v v8, boolean bl) throws a0.c {
        return a0.o(C0.j2(q8, v8, bl, this.M1), v8);
    }

    @Override
    protected long M0(long l8, long l9, boolean bl) {
        boolean bl2 = this.Z1 != -9223372036854775807L;
        if (!this.Y1) {
            if (!bl2 && !super.c()) {
                return 10000L;
            }
            return 1000000L;
        }
        long l10 = this.M1.p();
        if (bl2 && l10 != -9223372036854775807L) {
            float f8 = Math.min(l10, this.Z1 - l8);
            float f9 = this.h() != null ? this.h().a : 1.0f;
            return Math.max(10000L, (long)(f8 / f9 / 2.0f) - (d0.a1(this.K().b()) - l9));
        }
        return 10000L;
    }

    @Override
    protected x.a O0(ax.f1.D d8, v v8, MediaCrypto mediaCrypto, float f8) {
        this.O1 = this.i2(d8, v8, this.Q());
        this.P1 = C0.d2(d8.a);
        this.Q1 = C0.e2(d8.a);
        MediaFormat mediaFormat = this.k2(v8, d8.c, this.O1, f8);
        v v9 = "audio/raw".equals(d8.b) && !"audio/raw".equals(v8.o) ? v8 : null;
        this.S1 = v9;
        return x.a.a(d8, mediaFormat, v8, mediaCrypto, this.N1);
    }

    @Override
    protected boolean Q1(v v8) {
        int n8;
        if (this.L().a != 0 && ((n8 = this.g2(v8)) & 0x200) != 0 && (this.L().a == 2 || (n8 & 0x400) != 0 || v8.J == 0 && v8.K == 0)) {
            return true;
        }
        return this.M1.b(v8);
    }

    @Override
    protected int R1(Q object, v v8) throws a0.c {
        int n8;
        boolean bl = D.o(v8.o);
        int n9 = 0;
        if (!bl) {
            return V.a(0);
        }
        int n10 = v8.P;
        bl = true;
        n10 = n10 != 0 ? 1 : 0;
        boolean bl2 = L.S1(v8);
        int n11 = 8;
        int n12 = 4;
        if (bl2 && (n10 == 0 || a0.q() != null)) {
            n10 = n8 = this.g2(v8);
            if (this.M1.b(v8)) {
                return V.c(4, 8, 32, n8);
            }
        } else {
            n10 = 0;
        }
        if ("audio/raw".equals(v8.o) && !this.M1.b(v8)) {
            return V.a(1);
        }
        if (!this.M1.b(d0.l0(2, v8.G, v8.H))) {
            return V.a(1);
        }
        List<ax.f1.D> list = C0.j2((Q)object, v8, false, this.M1);
        if (list.isEmpty()) {
            return V.a(1);
        }
        if (!bl2) {
            return V.a(2);
        }
        ax.f1.D d8 = list.get(0);
        bl2 = d8.q(v8);
        if (!bl2) {
            for (n8 = 1; n8 < list.size(); ++n8) {
                object = list.get(n8);
                if (!((ax.f1.D)object).q(v8)) continue;
                n8 = 0;
                break;
            }
        } else {
            bl = bl2;
            n8 = 1;
            object = d8;
        }
        if (!bl) {
            n12 = 3;
        }
        int n13 = n11;
        if (bl) {
            n13 = n11;
            if (((ax.f1.D)object).t(v8)) {
                n13 = 16;
            }
        }
        n11 = ((ax.f1.D)object).h ? 64 : 0;
        if (n8 != 0) {
            n9 = 128;
        }
        return V.e(n12, n13, 32, n11, n9, n10);
    }

    @Override
    protected void T0(i i8) {
        Object object;
        if (Build.VERSION.SDK_INT >= 29 && (object = i8.c0) != null && j.Objects.equals((Object)((v)object).o, (Object)"audio/opus") && this.a1()) {
            object = a.e(i8.h0);
            int n8 = a.e(i8.c0).J;
            if (((Buffer)object).remaining() == 8) {
                int n9 = (int)(((ByteBuffer)object).order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000L / 1000000000L);
                this.M1.q(n8, n9);
            }
        }
    }

    @Override
    protected void U() {
        this.V1 = true;
        this.R1 = null;
        this.Z1 = -9223372036854775807L;
        try {
            this.M1.flush();
        }
        catch (Throwable throwable) {
            try {
                super.U();
                throw throwable;
            }
            finally {
                this.L1.u(this.B1);
            }
        }
        try {
            super.U();
            return;
        }
        finally {
            this.L1.u(this.B1);
        }
    }

    @Override
    protected void V(boolean bl, boolean bl2) throws s {
        super.V(bl, bl2);
        this.L1.v(this.B1);
        if (this.L().b) {
            this.M1.y();
        } else {
            this.M1.t();
        }
        this.M1.w(this.P());
        this.M1.B(this.K());
    }

    @Override
    protected void X(long l8, boolean bl) throws s {
        super.X(l8, bl);
        this.M1.flush();
        this.T1 = l8;
        this.Z1 = -9223372036854775807L;
        this.W1 = false;
        this.U1 = true;
    }

    @Override
    protected void Y() {
        t t8;
        this.M1.d();
        if (Build.VERSION.SDK_INT >= 35 && (t8 = this.N1) != null) {
            t8.c();
        }
    }

    @Override
    protected void a0() {
        this.W1 = false;
        this.Z1 = -9223372036854775807L;
        try {
            super.a0();
            return;
        }
        finally {
            if (this.V1) {
                this.V1 = false;
                this.M1.a();
            }
        }
    }

    @Override
    protected void b0() {
        super.b0();
        this.M1.m();
        this.Y1 = true;
    }

    @Override
    public boolean c() {
        return super.c() && this.M1.c();
    }

    @Override
    protected void c0() {
        this.o2();
        this.Y1 = false;
        this.M1.f();
        super.c0();
    }

    @Override
    public void e(G g8) {
        this.M1.e(g8);
    }

    @Override
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override
    public G h() {
        return this.M1.h();
    }

    @Override
    protected void h1(Exception exception) {
        u.d("MediaCodecAudioRenderer", "Audio codec error", exception);
        this.L1.n(exception);
    }

    @Override
    protected void i1(String string, x.a a8, long l8, long l9) {
        this.L1.s(string, l8, l9);
    }

    protected int i2(ax.f1.D d8, v v8, v[] vArray) {
        int n8 = this.h2(d8, v8);
        if (vArray.length == 1) {
            return n8;
        }
        for (v v9 : vArray) {
            int n9 = n8;
            if (d8.e((v)v8, (v)v9).d != 0) {
                n9 = Math.max(n8, this.h2(d8, v9));
            }
            n8 = n9;
        }
        return n8;
    }

    @Override
    public boolean isReady() {
        return this.M1.k() || super.isReady();
        {
        }
    }

    @Override
    protected void j1(String string) {
        this.L1.t(string);
    }

    @Override
    protected ax.Y0.c k1(O object) throws s {
        v v8;
        this.R1 = v8 = a.e(((O)object).b);
        object = super.k1((O)object);
        this.L1.w(v8, (ax.Y0.c)object);
        return object;
    }

    @SuppressLint(value={"InlinedApi"})
    protected MediaFormat k2(v v8, String pair, int n8, float f8) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", (String)pair);
        mediaFormat.setInteger("channel-count", v8.G);
        mediaFormat.setInteger("sample-rate", v8.H);
        x.e(mediaFormat, v8.r);
        x.d(mediaFormat, "max-input-size", n8);
        n8 = Build.VERSION.SDK_INT;
        if (n8 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f8 != -1.0f && !C0.f2()) {
                mediaFormat.setFloat("operating-rate", f8);
            }
        }
        if ("audio/ac4".equals(v8.o)) {
            pair = ax.S0.i.r(v8);
            if (pair != null) {
                x.d(mediaFormat, "profile", (Integer)pair.first);
                x.d(mediaFormat, "level", (Integer)pair.second);
            }
            if (n8 <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (n8 >= 24 && this.M1.n(d0.l0(4, v8.G, v8.H)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (n8 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (n8 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.X1));
        }
        return mediaFormat;
    }

    @Override
    protected ax.Y0.c l0(ax.f1.D object, v v8, v v9) {
        int n8;
        ax.Y0.c c8 = ((ax.f1.D)object).e(v8, v9);
        int n9 = n8 = c8.e;
        if (this.b1(v9)) {
            n9 = n8 | 0x8000;
        }
        n8 = n9;
        if (this.h2((ax.f1.D)object, v9) > this.O1) {
            n8 = n9 | 0x40;
        }
        object = ((ax.f1.D)object).a;
        n9 = n8 != 0 ? 0 : c8.d;
        return new ax.Y0.c((String)object, v8, v9, n9, n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected void l1(v v8, MediaFormat object) throws s {
        block11: {
            block12: {
                v v9 = this.S1;
                v v10 = null;
                int[] nArray = null;
                if (v9 != null) {
                    v8 = v9;
                    object = v10;
                } else if (this.E0() == null) {
                    object = v10;
                } else {
                    a.e(object);
                    int n8 = "audio/raw".equals(v8.o) ? v8.I : (Build.VERSION.SDK_INT >= 24 && object.containsKey("pcm-encoding") ? object.getInteger("pcm-encoding") : (object.containsKey("v-bits-per-sample") ? d0.j0(object.getInteger("v-bits-per-sample")) : 2));
                    v10 = new v.b().y0("audio/raw").s0(n8).d0(v8.J).e0(v8.K).r0(v8.l).Z(v8.m).j0(v8.a).l0(v8.b).m0(v8.c).n0(v8.d).A0(v8.e).w0(v8.f).T(object.getInteger("channel-count")).z0(object.getInteger("sample-rate")).P();
                    if (this.P1 && v10.G == 6 && (n8 = v8.G) < 6) {
                        nArray = new int[n8];
                        n8 = 0;
                        while (true) {
                            object = nArray;
                            if (n8 < v8.G) {
                                nArray[n8] = n8;
                                ++n8;
                                continue;
                            }
                            break;
                        }
                    } else {
                        object = nArray;
                        if (this.Q1) {
                            object = X.a(v10.G);
                        }
                    }
                    v8 = v10;
                }
                try {
                    if (Build.VERSION.SDK_INT < 29) break block11;
                    if (!this.a1() || this.L().a == 0) break block12;
                    this.M1.r(this.L().a);
                    break block11;
                }
                catch (B.b b8) {
                    throw this.I(b8, b8.q, 5001);
                }
            }
            this.M1.r(0);
        }
        this.M1.j(v8, 0, (int[])object);
    }

    protected void l2() {
        this.U1 = true;
    }

    @Override
    protected void m1(long l8) {
        this.M1.u(l8);
    }

    @Override
    protected void o1() {
        super.o1();
        this.M1.v();
    }

    @Override
    protected boolean s1(long l8, long l9, ax.f1.x object, ByteBuffer byteBuffer, int n8, int n9, int n10, long l10, boolean bl, boolean bl2, v v8) throws s {
        B.c c82;
        block8: {
            a.e(byteBuffer);
            this.Z1 = -9223372036854775807L;
            if (this.S1 != null && (n9 & 2) != 0) {
                a.e(object).m(n8, false);
                return true;
            }
            if (bl) {
                if (object != null) {
                    object.m(n8, false);
                }
                object = this.B1;
                ((ax.Y0.b)object).f += n10;
                this.M1.v();
                return true;
            }
            try {
                bl = this.M1.D(byteBuffer, l10, n10);
                if (bl) {
                    if (object != null) {
                        object.m(n8, false);
                    }
                    object = this.B1;
                    ((ax.Y0.b)object).e += n10;
                    return true;
                }
                this.Z1 = l10;
                return false;
            }
            catch (B.f f8) {
            }
            catch (B.c c82) {
                break block8;
            }
            bl = f8.c0;
            n8 = this.a1() && this.L().a != 0 ? 5003 : 5002;
            throw this.J(f8, v8, bl, n8);
        }
        object = this.R1;
        bl = c82.c0;
        n8 = this.a1() && this.L().a != 0 ? 5004 : 5001;
        throw this.J(c82, (v)object, bl, n8);
    }

    @Override
    public long w() {
        if (this.getState() == 2) {
            this.o2();
        }
        return this.T1;
    }

    @Override
    protected void x1() throws s {
        B.f f82;
        block3: {
            try {
                this.M1.i();
                if (this.N0() != -9223372036854775807L) {
                    this.Z1 = this.N0();
                    return;
                }
            }
            catch (B.f f82) {
                break block3;
            }
            return;
        }
        v v8 = f82.d0;
        boolean bl = f82.c0;
        int n8 = this.a1() ? 5003 : 5002;
        throw this.J(f82, v8, bl, n8);
    }

    @Override
    public boolean z() {
        boolean bl = this.W1;
        this.W1 = false;
        return bl;
    }

    private static final class b {
        public static void a(B b8, Object object) {
            b8.g(h.a(object));
        }
    }

    private final class c
    implements B.d {
        final C0 a;

        private c(C0 c02) {
            this.a = c02;
        }

        @Override
        public void a(long l8) {
            this.a.L1.x(l8);
        }

        @Override
        public void b(B.a a8) {
            this.a.L1.r(a8);
        }

        @Override
        public void c(int n8) {
            if (Build.VERSION.SDK_INT >= 35 && this.a.N1 != null) {
                this.a.N1.e(n8);
            }
            this.a.L1.o(n8);
        }

        @Override
        public void d() {
            C0.X1(this.a, true);
        }

        @Override
        public void e(boolean bl) {
            this.a.L1.y(bl);
        }

        @Override
        public void f(Exception exception) {
            u.d("MediaCodecAudioRenderer", "Audio sink error", exception);
            this.a.L1.p(exception);
        }

        @Override
        public void g(B.a a8) {
            this.a.L1.q(a8);
        }

        @Override
        public void h() {
            M0.a a8 = this.a.S0();
            if (a8 != null) {
                a8.a();
            }
        }

        @Override
        public void i(int n8, long l8, long l9) {
            this.a.L1.z(n8, l8, l9);
        }

        @Override
        public void j() {
            this.a.Z();
        }

        @Override
        public void k() {
            this.a.l2();
        }

        @Override
        public void l() {
            M0.a a8 = this.a.S0();
            if (a8 != null) {
                a8.b();
            }
        }
    }
}

