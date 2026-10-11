/*
 * Decompiled with CFR 0.152.
 */
package ax.f1;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import androidx.media3.exoplayer.M0;
import androidx.media3.exoplayer.h;
import androidx.media3.exoplayer.s;
import ax.P0.v;
import ax.S0.N;
import ax.S0.a;
import ax.S0.d0;
import ax.S0.u;
import ax.V0.i;
import ax.Y0.O;
import ax.Z0.G1;
import ax.Z0.H1;
import ax.Z0.I1;
import ax.a1.D0;
import ax.b1.F;
import ax.b1.m;
import ax.b1.n;
import ax.f1.B;
import ax.f1.D;
import ax.f1.K;
import ax.f1.M;
import ax.f1.Q;
import ax.f1.a0;
import ax.f1.n;
import ax.f1.x;
import ax.i1.F;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public abstract class L
extends h {
    private static final byte[] J1 = new byte[]{0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private final n A0;
    private s A1;
    private final MediaCodec.BufferInfo B0;
    protected ax.Y0.b B1;
    private final ArrayDeque<e> C0;
    private e C1;
    private final D0 D0;
    private long D1;
    private v E0;
    private boolean E1;
    private v F0;
    private boolean F1;
    private ax.b1.n G0;
    private boolean G1;
    private ax.b1.n H0;
    private long H1;
    private M0.a I0;
    private long I1;
    private MediaCrypto J0;
    private long K0;
    private float L0;
    private float M0;
    private x N0;
    private v O0;
    private MediaFormat P0;
    private boolean Q0;
    private float R0;
    private ArrayDeque<D> S0;
    private c T0;
    private D U0;
    private int V0;
    private boolean W0;
    private boolean X0;
    private boolean Y0;
    private boolean Z0;
    private boolean a1;
    private boolean b1;
    private long c1;
    private boolean d1;
    private long e1;
    private int f1;
    private int g1;
    private ByteBuffer h1;
    private boolean i1;
    private boolean j1;
    private boolean k1;
    private boolean l1;
    private boolean m1;
    private boolean n1;
    private int o1;
    private int p1;
    private int q1;
    private boolean r1;
    private boolean s1;
    private final x.b t0;
    private boolean t1;
    private final Q u0;
    private long u1;
    private final boolean v0;
    private long v1;
    private final float w0;
    private boolean w1;
    private final i x0;
    private boolean x1;
    private final i y0;
    private boolean y1;
    private final i z0;
    private boolean z1;

    public L(int n8, x.b object, Q q8, boolean bl, float f8) {
        super(n8);
        this.t0 = object;
        this.u0 = a.e(q8);
        this.v0 = bl;
        this.w0 = f8;
        this.x0 = i.F();
        this.y0 = new i(0);
        this.z0 = new i(2);
        this.A0 = object = new n();
        this.B0 = new MediaCodec.BufferInfo();
        this.L0 = 1.0f;
        this.M0 = 1.0f;
        this.K0 = -9223372036854775807L;
        this.C0 = new ArrayDeque();
        this.C1 = e.e;
        ((i)object).C(0);
        ((i)object).e0.order(ByteOrder.nativeOrder());
        this.D0 = new D0();
        this.R0 = -1.0f;
        this.V0 = 0;
        this.o1 = 0;
        this.f1 = -1;
        this.g1 = -1;
        this.e1 = -9223372036854775807L;
        this.u1 = -9223372036854775807L;
        this.v1 = -9223372036854775807L;
        this.D1 = -9223372036854775807L;
        this.c1 = -9223372036854775807L;
        this.p1 = 0;
        this.q1 = 0;
        this.B1 = new ax.Y0.b();
        this.H1 = -9223372036854775807L;
        this.I1 = -9223372036854775807L;
    }

    private void A0() {
        try {
            a.i(this.N0).flush();
            return;
        }
        finally {
            this.z1();
        }
    }

    private void B1() {
        this.u1 = -9223372036854775807L;
        this.v1 = -9223372036854775807L;
        this.D1 = -9223372036854775807L;
    }

    private boolean C0() {
        if (this.N0 == null) {
            return false;
        }
        if (this.O1()) {
            this.w1();
            return true;
        }
        if (this.L1()) {
            this.A0();
        } else {
            this.q1();
        }
        return false;
    }

    private void C1() {
        this.f1 = -1;
        this.y0.e0 = null;
    }

    private List<D> D0(boolean bl) throws a0.c {
        v v8 = a.e(this.E0);
        List<D> list = this.L0(this.u0, v8, bl);
        if (list.isEmpty() && bl) {
            list = this.L0(this.u0, v8, false);
            if (!list.isEmpty()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Drm session requires secure decoder for ");
                stringBuilder.append(v8.o);
                stringBuilder.append(", but no secure decoder available. Trying to proceed with ");
                stringBuilder.append(list);
                stringBuilder.append(".");
                u.h("MediaCodecRenderer", stringBuilder.toString());
            }
            return list;
        }
        return list;
    }

    private void D1() {
        this.g1 = -1;
        this.h1 = null;
    }

    private void E1(ax.b1.n n8) {
        m.a(this.G0, n8);
        this.G0 = n8;
    }

    private void F1(e e8) {
        this.C1 = e8;
        long l8 = e8.c;
        if (l8 != -9223372036854775807L) {
            this.E1 = true;
            this.m1(l8);
        }
    }

    private void I1(ax.b1.n n8) {
        m.a(this.H0, n8);
        this.H0 = n8;
    }

    private boolean J1(long l8) {
        return this.K0 == -9223372036854775807L || this.K().b() - l8 < this.K0;
        {
        }
    }

    protected static boolean S1(v v8) {
        int n8 = v8.P;
        return n8 == 0 || n8 == 2;
        {
        }
    }

    private boolean U0() {
        return this.g1 >= 0;
    }

    private boolean U1(v v8) throws s {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (this.N0 != null && this.q1 != 3 && this.getState() != 0) {
            float f8 = this.R0;
            float f9 = this.J0(this.M0, a.e(v8), this.Q());
            if (f8 == f9) {
                return true;
            }
            if (f9 == -1.0f) {
                this.u0();
                return false;
            }
            if (f8 == -1.0f && !(f9 > this.w0)) {
                return true;
            }
            v8 = new Bundle();
            v8.putFloat("operating-rate", f9);
            a.e(this.N0).a((Bundle)v8);
            this.R0 = f9;
        }
        return true;
    }

    private void V1() throws s {
        ax.V0.b b8 = a.e(this.H0).h();
        if (b8 instanceof F) {
            try {
                K.a(a.e(this.J0), ((F)b8).b);
            }
            catch (MediaCryptoException mediaCryptoException) {
                throw this.I(mediaCryptoException, this.E0, 6006);
            }
        }
        this.E1(this.H0);
        this.p1 = 0;
        this.q1 = 0;
    }

    private boolean W0() {
        if (!this.A0.M()) {
            return true;
        }
        long l8 = this.O();
        return this.c1(l8, this.A0.K()) == this.c1(l8, this.z0.g0);
    }

    private void X0(v object) {
        this.s0();
        object = ((v)object).o;
        if (!("audio/mp4a-latm".equals(object) || "audio/mpeg".equals(object) || "audio/opus".equals(object))) {
            this.A0.N(1);
        } else {
            this.A0.N(32);
        }
        this.k1 = true;
    }

    private void Y0(D object, MediaCrypto object2) throws Exception {
        long l8;
        long l9;
        float f8;
        String string;
        v v8;
        boolean bl;
        block8: {
            x x8;
            bl = false;
            this.U0 = object;
            v8 = a.e(this.E0);
            string = ((D)object).a;
            int n8 = Build.VERSION.SDK_INT;
            float f9 = -1.0f;
            f8 = n8 < 23 ? -1.0f : this.J0(this.M0, v8, this.Q());
            if (f8 <= this.w0) {
                f8 = f9;
            }
            l9 = this.K().b();
            object2 = this.O0((D)object, v8, (MediaCrypto)object2, f8);
            if (n8 >= 31) {
                b.a((x.a)object2, this.P());
            }
            Object object3 = new StringBuilder();
            ((StringBuilder)object3).append("createCodec:");
            ((StringBuilder)object3).append(string);
            N.a(((StringBuilder)object3).toString());
            this.N0 = x8 = this.t0.a((x.a)object2);
            object3 = new d(this);
            this.d1 = x8.h((x.c)object3);
            l8 = this.K().b();
            if (((D)object).q(v8)) break block8;
            u.h("MediaCodecRenderer", d0.G("Format exceeds selected codec's capabilities [%s, %s]", v.l(v8), string));
        }
        this.R0 = f8;
        this.O0 = v8;
        this.V0 = this.m0(string);
        this.W0 = L.q0(string);
        this.X0 = L.n0(string);
        this.Y0 = L.o0(string);
        boolean bl2 = L.p0((D)object) || this.I0();
        this.b1 = bl2;
        if (a.e(this.N0).e()) {
            this.n1 = true;
            this.o1 = 1;
            bl2 = bl;
            if (this.V0 != 0) {
                bl2 = true;
            }
            this.Z0 = bl2;
        }
        if (this.getState() == 2) {
            this.e1 = this.K().b() + 1000L;
        }
        object = this.B1;
        ++((ax.Y0.b)object).a;
        this.i1(string, (x.a)object2, l8, l8 - l9);
        return;
        finally {
            N.b();
        }
    }

    private boolean Z0() throws s {
        boolean bl = this.J0 == null;
        a.g(bl);
        ax.b1.n n8 = this.G0;
        Object object = n8.h();
        if (F.d && object instanceof F) {
            int n9 = n8.getState();
            if (n9 != 1) {
                if (n9 != 4) {
                    return false;
                }
            } else {
                object = a.e(n8.g());
                throw this.I((Throwable)object, this.E0, ((n.a)object).q);
            }
        }
        if (object == null) {
            return n8.g() != null;
        }
        if (object instanceof F) {
            object = (F)object;
            try {
                n8 = new MediaCrypto(((F)object).a, ((F)object).b);
                this.J0 = n8;
            }
            catch (MediaCryptoException mediaCryptoException) {
                throw this.I(mediaCryptoException, this.E0, 6006);
            }
        }
        return true;
    }

    private boolean c1(long l8, long l9) {
        v v8;
        return l9 < l8 && ((v8 = this.F0) == null || !j.Objects.equals((Object)v8.o, (Object)"audio/opus") || !ax.q1.L.g(l8, l9));
    }

    private static boolean d1(IllegalStateException stackTraceElementArray) {
        if (stackTraceElementArray instanceof MediaCodec.CodecException) {
            return true;
        }
        return (stackTraceElementArray = stackTraceElementArray.getStackTrace()).length > 0 && stackTraceElementArray[0].getClassName().equals("android.media.MediaCodec");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void f1(MediaCrypto mediaCrypto, boolean bl) throws c, s {
        ArrayDeque<Object> arrayDeque;
        Object object;
        v v8 = a.e(this.E0);
        if (this.S0 == null) {
            block11: {
                block10: {
                    try {
                        object = this.D0(bl);
                        arrayDeque = new ArrayDeque<Object>();
                        this.S0 = arrayDeque;
                        if (!this.v0) break block10;
                        arrayDeque.addAll((Collection<Object>)object);
                        break block11;
                    }
                    catch (a0.c c8) {
                        throw new c(v8, (Throwable)c8, bl, -49998);
                    }
                }
                if (!object.isEmpty()) {
                    this.S0.add(object.get(0));
                }
            }
            this.T0 = null;
        }
        if (this.S0.isEmpty()) throw new c(v8, null, bl, -49999);
        arrayDeque = a.e(this.S0);
        while (true) {
            if (this.N0 != null) {
                this.S0 = null;
                return;
            }
            D d8 = a.e((D)arrayDeque.peekFirst());
            if (!this.g1(v8)) {
                return;
            }
            if (!this.M1(d8)) {
                return;
            }
            try {
                this.Y0(d8, mediaCrypto);
                continue;
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to initialize decoder: ");
                stringBuilder.append(d8);
                u.i("MediaCodecRenderer", stringBuilder.toString(), exception);
                arrayDeque.removeFirst();
                object = new c(v8, (Throwable)exception, bl, d8);
                this.h1((Exception)object);
                this.T0 = this.T0 == null ? object : this.T0.c((c)object);
                if (arrayDeque.isEmpty()) throw this.T0;
                continue;
            }
            break;
        }
    }

    private void j0() throws s {
        O o8;
        block9: {
            a.g(this.w1 ^ true);
            o8 = this.M();
            this.z0.p();
            do {
                Object object;
                this.z0.p();
                int n8 = this.f0(o8, this.z0, 0);
                if (n8 == -5) break block9;
                if (n8 != -4) {
                    if (n8 == -3) {
                        if (this.n()) {
                            this.v1 = this.u1;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                if (this.z0.s()) {
                    this.w1 = true;
                    this.v1 = this.u1;
                    return;
                }
                this.u1 = Math.max(this.u1, this.z0.g0);
                if (this.n() || this.y0.w()) {
                    this.v1 = this.u1;
                }
                if (this.y1) {
                    object = a.e(this.E0);
                    this.F0 = object;
                    if (j.Objects.equals((Object)((v)object).o, (Object)"audio/opus") && !this.F0.r.isEmpty()) {
                        n8 = ax.q1.L.f(this.F0.r.get(0));
                        this.F0 = this.F0.b().d0(n8).P();
                    }
                    this.l1(this.F0, null);
                    this.y1 = false;
                }
                this.z0.D();
                object = this.F0;
                if (object == null || !j.Objects.equals((Object)((v)object).o, (Object)"audio/opus")) continue;
                if (this.z0.r()) {
                    object = this.z0;
                    ((i)object).c0 = this.F0;
                    this.T0((i)object);
                }
                if (!ax.q1.L.g(this.O(), this.z0.g0)) continue;
                this.D0.a(this.z0, this.F0.r);
            } while (this.W0() && this.A0.H(this.z0));
            this.l1 = true;
            return;
        }
        this.k1(o8);
    }

    private boolean k0(long l8, long l9) throws s {
        a.g(this.x1 ^ true);
        if (this.A0.M()) {
            n n8 = this.A0;
            if (this.s1(l8, l9, null, n8.e0, this.g1, 0, n8.L(), this.A0.J(), this.c1(this.O(), this.A0.K()), this.A0.s(), a.e(this.F0))) {
                this.n1(this.A0.K());
                this.A0.p();
            } else {
                return false;
            }
        }
        if (this.w1) {
            this.x1 = true;
            return false;
        }
        if (this.l1) {
            a.g(this.A0.H(this.z0));
            this.l1 = false;
        }
        if (this.m1) {
            if (this.A0.M()) {
                return true;
            }
            this.s0();
            this.m1 = false;
            this.e1();
            if (!this.k1) {
                return false;
            }
        }
        this.j0();
        if (this.A0.M()) {
            this.A0.D();
        }
        return this.A0.M() || this.w1 || this.m1;
        {
        }
    }

    private int m0(String string) {
        String string2;
        int n8 = Build.VERSION.SDK_INT;
        if (n8 <= 25 && "OMX.Exynos.avc.dec.secure".equals(string) && ((string2 = Build.MODEL).startsWith("SM-T585") || string2.startsWith("SM-A510") || string2.startsWith("SM-A520") || string2.startsWith("SM-J700"))) {
            return 2;
        }
        if (n8 < 24 && ("OMX.Nvidia.h264.decode".equals(string) || "OMX.Nvidia.h264.decode.secure".equals(string)) && ("flounder".equals(string = Build.DEVICE) || "flounder_lte".equals(string) || "grouper".equals(string) || "tilapia".equals(string))) {
            return 1;
        }
        return 0;
    }

    private static boolean n0(String string) {
        return Build.VERSION.SDK_INT <= 23 && "OMX.google.vorbis.decoder".equals(string);
    }

    private static boolean o0(String string) {
        return Build.VERSION.SDK_INT == 21 && "OMX.google.aac.decoder".equals(string);
    }

    private static boolean p0(D d8) {
        String string = d8.a;
        int n8 = Build.VERSION.SDK_INT;
        return n8 <= 25 && "OMX.rk.video_decoder.avc".equals(string) || n8 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(string) || "OMX.broadcom.video_decoder.tunnel.secure".equals(string) || "OMX.bcm.vdec.avc.tunnel".equals(string) || "OMX.bcm.vdec.avc.tunnel.secure".equals(string) || "OMX.bcm.vdec.hevc.tunnel".equals(string) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(string)) || "Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && d8.g;
    }

    private static boolean q0(String string) {
        return Build.VERSION.SDK_INT == 29 && "c2.android.aac.decoder".equals(string);
    }

    private void q1() {
        long l8;
        long l9;
        if (this.I1 != -9223372036854775807L && (l9 = this.O()) <= (l8 = this.I1) && this.D1 < l8) {
            this.G1 = true;
            this.I1 = -9223372036854775807L;
        }
    }

    @TargetApi(value=23)
    private void r1() throws s {
        int n8 = this.q1;
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    this.x1 = true;
                    this.x1();
                    return;
                }
                this.v1();
                return;
            }
            this.A0();
            this.V1();
            return;
        }
        this.A0();
    }

    private void s0() {
        this.k1 = false;
        this.y1();
    }

    private boolean t0() {
        if (this.r1) {
            this.p1 = 1;
            if (this.X0) {
                this.q1 = 3;
                return false;
            }
            this.q1 = 1;
        }
        return true;
    }

    private void t1() {
        this.t1 = true;
        MediaFormat mediaFormat = a.e(this.N0).f();
        if (this.V0 != 0 && mediaFormat.getInteger("width") == 32 && mediaFormat.getInteger("height") == 32) {
            this.a1 = true;
            return;
        }
        this.P0 = mediaFormat;
        this.Q0 = true;
    }

    private void u0() throws s {
        if (this.r1) {
            this.p1 = 1;
            this.q1 = 3;
            return;
        }
        this.v1();
    }

    private boolean u1(int n8) throws s {
        O o8 = this.M();
        this.x0.p();
        n8 = this.f0(o8, this.x0, n8 | 4);
        if (n8 == -5) {
            this.k1(o8);
            return true;
        }
        if (n8 == -4 && this.x0.s()) {
            this.w1 = true;
            this.r1();
        }
        return false;
    }

    @TargetApi(value=23)
    private boolean v0() throws s {
        if (this.r1) {
            this.p1 = 1;
            if (this.X0) {
                this.q1 = 3;
                return false;
            }
            this.q1 = 2;
        } else {
            this.V1();
        }
        return true;
    }

    private void v1() throws s {
        this.w1();
        this.e1();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean w0(long var1_1, long var3_2) throws s {
        block26: {
            var11_3 = a.e(this.N0);
            if (!this.U0()) {
                if (this.Y0 && this.s1) {
                    try {
                        var5_7 = var11_3.l(this.B0);
                    }
                    catch (IllegalStateException var11_4) {
                        this.r1();
                        if (this.x1) {
                            this.w1();
                        }
                        return false;
                    }
                } else {
                    var5_7 = var11_3.l(this.B0);
                }
                if (var5_7 < 0) {
                    if (var5_7 == -2) {
                        this.t1();
                        return true;
                    }
                    if (this.b1 && (this.w1 || this.p1 == 2)) {
                        this.r1();
                    }
                    if ((var1_1 = this.c1) != -9223372036854775807L && var1_1 + 100L < this.K().a()) {
                        this.r1();
                    }
                    return false;
                }
                if (this.a1) {
                    this.a1 = false;
                    var11_3.m(var5_7, false);
                    return true;
                }
                var12_8 /* !! */  = this.B0;
                if (var12_8 /* !! */ .size == 0 && (var12_8 /* !! */ .flags & 4) != 0) {
                    this.r1();
                    return false;
                }
                this.g1 = var5_7;
                var12_8 /* !! */  = var11_3.q(var5_7);
                this.h1 = var12_8 /* !! */ ;
                if (var12_8 /* !! */  != null) {
                    var12_8 /* !! */ .position(this.B0.offset);
                    var13_9 = this.h1;
                    var12_8 /* !! */  = this.B0;
                    var13_9.limit(var12_8 /* !! */ .offset + var12_8 /* !! */ .size);
                }
                this.W1(this.B0.presentationTimeUs);
            }
            var9_10 = this.B0.presentationTimeUs < this.O();
            this.i1 = var9_10;
            var7_11 = this.v1;
            var9_10 = var7_11 != -9223372036854775807L && var7_11 <= this.B0.presentationTimeUs;
            this.j1 = var9_10;
            if (this.G1) {
                var7_11 = this.H1;
                if (var7_11 != -9223372036854775807L && this.B0.presentationTimeUs <= var7_11) {
                    this.G1 = false;
                    this.H1 = -9223372036854775807L;
                } else {
                    this.H1 = this.B0.presentationTimeUs;
                    this.i1 = true;
                    this.j1 = false;
                }
            }
            if (this.Y0 && this.s1) {
                try {
                    var12_8 /* !! */  = this.h1;
                    var6_12 = this.g1;
                    var13_9 = this.B0;
                    var5_7 = var13_9.flags;
                    var7_11 = var13_9.presentationTimeUs;
                    var9_10 = this.i1;
                    var10_13 = this.j1;
                    var13_9 = a.e(this.F0);
                }
                catch (IllegalStateException var11_5) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        this.r1();
                        if (this.x1) {
                            this.w1();
                        }
                        return false;
                    }
                }
                var9_10 = this.s1(var1_1, var3_2, var11_3, (ByteBuffer)var12_8 /* !! */ , var6_12, var5_7, 1, var7_11, var9_10, var10_13, (v)var13_9);
                break block26;
            }
            var12_8 /* !! */  = this.h1;
            var5_7 = this.g1;
            var13_9 = this.B0;
            var9_10 = this.s1(var1_1, var3_2, var11_3, (ByteBuffer)var12_8 /* !! */ , var5_7, var13_9.flags, 1, var13_9.presentationTimeUs, this.i1, this.j1, a.e(this.F0));
        }
        if (var9_10) {
            this.n1(this.B0.presentationTimeUs);
            var5_7 = (this.B0.flags & 4) != 0 ? 1 : 0;
            if (var5_7 == 0 && this.s1 && this.j1) {
                this.c1 = this.K().a();
            }
            this.D1();
            if (var5_7 == 0) {
                return true;
            }
            this.r1();
        }
        return false;
        catch (IllegalStateException var11_6) {
            ** continue;
        }
    }

    private boolean x0(D d8, v v8, ax.b1.n n8, ax.b1.n n9) throws s {
        if (n8 == n9) {
            return false;
        }
        if (n9 != null && n8 != null) {
            ax.V0.b b8 = n9.h();
            if (b8 == null) {
                return true;
            }
            Object object = n8.h();
            if (object != null && b8.getClass().equals(object.getClass())) {
                if (!(b8 instanceof F)) {
                    return false;
                }
                if (!n9.b().equals(n8.b())) {
                    return true;
                }
                if (Build.VERSION.SDK_INT < 23) {
                    return true;
                }
                object = ax.P0.i.e;
                if (!((UUID)object).equals(n8.b()) && !((UUID)object).equals(n9.b())) {
                    return !d8.g && (n9.getState() == 2 || (n9.getState() == 3 || n9.getState() == 4) && n9.f(a.e(v8.o)));
                }
            }
        }
        return true;
    }

    private void y1() {
        this.B1();
        this.m1 = false;
        this.A0.p();
        this.z0.p();
        this.l1 = false;
        this.D0.d();
    }

    private boolean z0() throws s {
        int n8;
        if (this.N0 != null && (n8 = this.p1) != 2 && !this.w1) {
            int n9;
            Object object;
            Object object2;
            block30: {
                if (n8 == 0 && this.N1()) {
                    this.u0();
                }
                object2 = a.e(this.N0);
                if (this.f1 < 0) {
                    this.f1 = n8 = object2.j();
                    if (n8 < 0) {
                        return false;
                    }
                    this.y0.e0 = object2.o(n8);
                    this.y0.p();
                }
                if (this.p1 == 1) {
                    if (!this.b1) {
                        this.s1 = true;
                        object2.c(this.f1, 0, 0, 0L, 4);
                        this.C1();
                    }
                    this.p1 = 2;
                    return false;
                }
                if (this.Z0) {
                    this.Z0 = false;
                    ByteBuffer byteBuffer = a.e(this.y0.e0);
                    byte[] byArray = J1;
                    byteBuffer.put(byArray);
                    object2.c(this.f1, 0, byArray.length, 0L, 0);
                    this.C1();
                    this.r1 = true;
                    return true;
                }
                if (this.o1 == 1) {
                    for (n8 = 0; n8 < a.e(this.O0).r.size(); ++n8) {
                        object = this.O0.r.get(n8);
                        a.e(this.y0.e0).put((byte[])object);
                    }
                    this.o1 = 2;
                }
                n9 = a.e(this.y0.e0).position();
                object = this.M();
                try {
                    n8 = this.f0((O)object, this.y0, 0);
                    if (n8 != -3) break block30;
                }
                catch (i.a a8) {
                    this.h1(a8);
                    this.u1(0);
                    this.A0();
                    return true;
                }
                if (this.n()) {
                    this.v1 = this.u1;
                }
                return false;
            }
            if (n8 == -5) {
                if (this.o1 == 2) {
                    this.y0.p();
                    this.o1 = 1;
                }
                this.k1((O)object);
                return true;
            }
            if (this.y0.s()) {
                this.v1 = this.u1;
                if (this.o1 == 2) {
                    this.y0.p();
                    this.o1 = 1;
                }
                this.w1 = true;
                if (!this.r1) {
                    this.r1();
                    return false;
                }
                if (!this.b1) {
                    this.s1 = true;
                    object2.c(this.f1, 0, 0, 0L, 4);
                    this.C1();
                }
                return false;
            }
            if (!this.r1 && !this.y0.u()) {
                this.y0.p();
                if (this.o1 == 2) {
                    this.o1 = 1;
                }
                return true;
            }
            if (this.K1(this.y0)) {
                return true;
            }
            boolean bl = this.y0.E();
            if (bl) {
                this.y0.d0.b(n9);
            }
            long l8 = this.y0.g0;
            if (this.y1) {
                if (!this.C0.isEmpty()) {
                    this.C0.peekLast().d.a(l8, a.e(this.E0));
                } else {
                    this.C1.d.a(l8, a.e(this.E0));
                }
                this.y1 = false;
            }
            this.u1 = Math.max(this.u1, l8);
            if (this.n() || this.y0.w()) {
                this.v1 = this.u1;
            }
            this.y0.D();
            if (this.y0.r()) {
                this.T0(this.y0);
            }
            this.p1(this.y0);
            n8 = this.F0(this.y0);
            if (!(Build.VERSION.SDK_INT >= 34 && (n8 & 0x20) != 0 || this.L().b)) {
                this.I1 = Math.max(this.I1, this.y0.g0);
            }
            if (bl) {
                a.e(object2).b(this.f1, 0, this.y0.d0, l8, n8);
            } else {
                a.e(object2).c(this.f1, 0, a.e(this.y0.e0).limit(), l8, n8);
            }
            this.C1();
            this.r1 = true;
            this.o1 = 0;
            object2 = this.B1;
            ++((ax.Y0.b)object2).c;
            return true;
        }
        return false;
    }

    @Override
    public final int A() {
        return 8;
    }

    protected void A1() {
        this.z1();
        this.A1 = null;
        this.S0 = null;
        this.U0 = null;
        this.O0 = null;
        this.P0 = null;
        this.Q0 = false;
        this.t1 = false;
        this.R0 = -1.0f;
        this.V0 = 0;
        this.W0 = false;
        this.X0 = false;
        this.Y0 = false;
        this.b1 = false;
        this.d1 = false;
        this.n1 = false;
        this.o1 = 0;
    }

    @Override
    public void B(int n8, Object object) throws s {
        if (n8 == 11) {
            this.I0 = a.e((M0.a)object);
            return;
        }
        super.B(n8, object);
    }

    protected final boolean B0() throws s {
        boolean bl = this.C0();
        if (bl) {
            this.e1();
        }
        return bl;
    }

    protected final x E0() {
        return this.N0;
    }

    protected int F0(i i8) {
        return 0;
    }

    protected final D G0() {
        return this.U0;
    }

    protected final void G1() {
        this.z1 = true;
    }

    protected final v H0() {
        return this.O0;
    }

    protected final void H1(s s8) {
        this.A1 = s8;
    }

    protected boolean I0() {
        return false;
    }

    protected abstract float J0(float var1, v var2, v[] var3);

    protected final MediaFormat K0() {
        return this.P0;
    }

    protected boolean K1(i object) {
        if (this.P1((i)object)) {
            ((i)object).p();
            object = this.B1;
            ++((ax.Y0.b)object).d;
            return true;
        }
        return false;
    }

    protected abstract List<D> L0(Q var1, v var2, boolean var3) throws a0.c;

    protected boolean L1() {
        return true;
    }

    protected long M0(long l8, long l9, boolean bl) {
        return super.o(l8, l9);
    }

    protected boolean M1(D d8) {
        return true;
    }

    protected long N0() {
        return this.v1;
    }

    protected boolean N1() {
        return false;
    }

    protected abstract x.a O0(D var1, v var2, MediaCrypto var3, float var4);

    protected boolean O1() {
        int n8 = this.q1;
        if (!(n8 == 3 || this.W0 && !this.t1 || this.X0 && this.s1)) {
            if (n8 == 2) {
                n8 = Build.VERSION.SDK_INT;
                boolean bl = n8 >= 23;
                a.g(bl);
                if (n8 >= 23) {
                    try {
                        this.V1();
                    }
                    catch (s s8) {
                        u.i("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", s8);
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    protected final long P0() {
        return this.C1.c;
    }

    protected boolean P1(i i8) {
        return false;
    }

    protected final long Q0() {
        return this.C1.b;
    }

    protected boolean Q1(v v8) {
        return false;
    }

    protected float R0() {
        return this.L0;
    }

    protected abstract int R1(Q var1, v var2) throws a0.c;

    protected final M0.a S0() {
        return this.I0;
    }

    protected abstract void T0(i var1) throws s;

    protected final boolean T1() throws s {
        return this.U1(this.O0);
    }

    @Override
    protected void U() {
        this.E0 = null;
        this.F1(e.e);
        this.C0.clear();
        if (this.k1) {
            this.s0();
            return;
        }
        this.C0();
    }

    @Override
    protected void V(boolean bl, boolean bl2) throws s {
        this.B1 = new ax.Y0.b();
    }

    protected boolean V0() {
        return this.G1;
    }

    protected final void W1(long l8) throws s {
        block8: {
            block7: {
                block6: {
                    v v8;
                    v v9 = v8 = this.C1.d.j(l8);
                    if (v8 == null) {
                        v9 = v8;
                        if (this.E1) {
                            v9 = v8;
                            if (this.P0 != null) {
                                v9 = this.C1.d.i();
                            }
                        }
                    }
                    if (v9 == null) break block6;
                    this.F0 = v9;
                    break block7;
                }
                if (!this.Q0 || this.F0 == null) break block8;
            }
            this.l1(a.e(this.F0), this.P0);
            this.Q0 = false;
            this.E1 = false;
        }
    }

    @Override
    protected void X(long l8, boolean bl) throws s {
        this.w1 = false;
        this.x1 = false;
        this.z1 = false;
        if (this.k1) {
            this.y1();
        } else {
            this.B0();
        }
        if (this.C1.d.l() > 0) {
            this.y1 = true;
        }
        this.C1.d.c();
        this.C0.clear();
    }

    @Override
    protected void a0() {
        try {
            this.s0();
            this.w1();
            return;
        }
        finally {
            this.I1(null);
        }
    }

    protected final boolean a1() {
        return this.k1;
    }

    @Override
    public final int b(v v8) throws s {
        try {
            int n8 = this.R1(this.u0, v8);
            return n8;
        }
        catch (a0.c c8) {
            throw this.I(c8, v8, 4002);
        }
    }

    @Override
    protected void b0() {
    }

    protected final boolean b1(v v8) {
        return this.H0 == null && this.Q1(v8);
    }

    @Override
    public boolean c() {
        return this.x1;
    }

    @Override
    protected void c0() {
    }

    @Override
    protected void d0(v[] vArray, long l8, long l9, F.b b8) throws s {
        block8: {
            block7: {
                long l10;
                long l11;
                block6: {
                    if (this.C1.c != -9223372036854775807L) break block6;
                    this.F1(new e(-9223372036854775807L, l8, l9));
                    if (this.F1) {
                        this.o1();
                        return;
                    }
                    break block7;
                }
                if (!this.C0.isEmpty() || (l11 = this.u1) != -9223372036854775807L && ((l10 = this.D1) == -9223372036854775807L || l10 < l11)) break block8;
                this.F1(new e(-9223372036854775807L, l8, l9));
                if (this.C1.c != -9223372036854775807L) {
                    this.o1();
                }
            }
            return;
        }
        this.C0.add(new e(this.u1, l8, l9));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final void e1() throws s {
        if (this.N0 != null) return;
        if (this.k1) return;
        v v8 = this.E0;
        if (v8 == null) {
            return;
        }
        if (this.b1(v8)) {
            this.X0(v8);
            return;
        }
        this.E1(this.H0);
        if (this.G0 == null || this.Z0()) {
            try {
                ax.b1.n n8 = this.G0;
                boolean bl = n8 != null && (n8.getState() == 3 || this.G0.getState() == 4) && this.G0.f(a.i(v8.o));
                this.f1(this.J0, bl);
            }
            catch (c c8) {
                throw this.I(c8, v8, 4001);
            }
        }
        if ((v8 = this.J0) == null) return;
        if (this.N0 != null) return;
        v8.release();
        this.J0 = null;
    }

    protected boolean g1(v v8) throws s {
        return true;
    }

    protected abstract void h1(Exception var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void i(long l8, long l9) throws s {
        int n8;
        IllegalStateException illegalStateException2;
        boolean bl;
        boolean bl2;
        block18: {
            Object object;
            bl2 = this.z1;
            bl = false;
            if (bl2) {
                this.z1 = false;
                this.r1();
            }
            if ((object = this.A1) != null) {
                this.A1 = null;
                throw object;
            }
            try {
                if (this.x1) {
                    this.x1();
                    return;
                }
            }
            catch (IllegalStateException illegalStateException2) {
                break block18;
            }
            catch (MediaCodec.CryptoException cryptoException) {
                throw this.I(cryptoException, this.E0, d0.b0(cryptoException.getErrorCode()));
            }
            if (this.E0 == null && !this.u1(2)) {
                return;
            }
            this.e1();
            if (this.k1) {
                N.a("bypassRender");
                while (this.k0(l8, l9)) {
                }
                N.b();
            } else if (this.N0 != null) {
                long l10 = this.K().b();
                N.a("drainAndFeed");
                while (this.w0(l8, l9) && this.J1(l10)) {
                }
                while (this.z0() && this.J1(l10)) {
                }
                N.b();
            } else {
                object = this.B1;
                ((ax.Y0.b)object).d += this.h0(l8);
                this.u1(1);
            }
            this.B1.c();
            return;
        }
        if (!L.d1(illegalStateException2)) throw illegalStateException2;
        this.h1(illegalStateException2);
        bl2 = bl;
        if (illegalStateException2 instanceof MediaCodec.CodecException) {
            bl2 = bl;
            if (((MediaCodec.CodecException)illegalStateException2).isRecoverable()) {
                bl2 = true;
            }
        }
        if (bl2) {
            this.w1();
        }
        B b8 = this.r0(illegalStateException2, this.G0());
        if (b8.d0 == 1101) {
            n8 = 4006;
            throw this.J(b8, this.E0, bl2, n8);
        }
        n8 = 4003;
        throw this.J(b8, this.E0, bl2, n8);
    }

    protected abstract void i1(String var1, x.a var2, long var3, long var5);

    @Override
    public boolean isReady() {
        return this.E0 != null && (this.T() || this.U0() || this.e1 != -9223372036854775807L && this.K().b() < this.e1);
    }

    protected abstract void j1(String var1);

    /*
     * Enabled aggressive block sorting
     */
    protected ax.Y0.c k1(O object) throws s {
        ax.Y0.c c8;
        int n8;
        D d8;
        Object object2;
        Object object3;
        block17: {
            block18: {
                block13: {
                    block19: {
                        block21: {
                            int n9;
                            block14: {
                                boolean bl;
                                boolean bl2;
                                block20: {
                                    block15: {
                                        block16: {
                                            block12: {
                                                block11: {
                                                    bl2 = true;
                                                    this.y1 = true;
                                                    object3 = a.e(((O)object).b);
                                                    object2 = ((v)object3).o;
                                                    if (object2 == null) {
                                                        throw this.I(new IllegalArgumentException("Sample MIME type is null."), (v)object3, 4005);
                                                    }
                                                    if (j.Objects.equals((Object)object2, (Object)"video/av01")) break block11;
                                                    object2 = object3;
                                                    if (!j.Objects.equals((Object)((v)object3).o, (Object)"video/x-vnd.on2.vp9")) break block12;
                                                }
                                                object2 = object3;
                                                if (!((v)object3).r.isEmpty()) {
                                                    object2 = ((v)object3).b().k0(null).P();
                                                }
                                            }
                                            this.I1(((O)object).a);
                                            this.E0 = object2;
                                            if (this.k1) {
                                                this.m1 = true;
                                                return null;
                                            }
                                            object3 = this.N0;
                                            if (object3 == null) {
                                                this.S0 = null;
                                                this.e1();
                                                return null;
                                            }
                                            d8 = a.e(this.U0);
                                            object = a.e(this.O0);
                                            if (this.x0(d8, (v)object2, this.G0, this.H0)) {
                                                this.u0();
                                                return new ax.Y0.c(d8.a, (v)object, (v)object2, 0, 128);
                                            }
                                            n8 = this.H0 != this.G0 ? 1 : 0;
                                            bl = n8 == 0 || Build.VERSION.SDK_INT >= 23;
                                            a.g(bl);
                                            c8 = this.l0(d8, (v)object, (v)object2);
                                            int n10 = c8.d;
                                            if (n10 == 0) break block13;
                                            n9 = 16;
                                            if (n10 == 1) break block14;
                                            if (n10 == 2) break block15;
                                            if (n10 != 3) {
                                                throw new IllegalStateException();
                                            }
                                            if (this.U1((v)object2)) break block16;
                                            n8 = n9;
                                            break block17;
                                        }
                                        this.O0 = object2;
                                        if (n8 == 0 || this.v0()) break block18;
                                        break block19;
                                    }
                                    if (this.U1((v)object2)) break block20;
                                    n8 = n9;
                                    break block17;
                                }
                                this.n1 = true;
                                this.o1 = 1;
                                n9 = this.V0;
                                bl = bl2;
                                if (n9 != 2) {
                                    bl = n9 == 1 && ((v)object2).v == ((v)object).v && ((v)object2).w == ((v)object).w ? bl2 : false;
                                }
                                this.Z0 = bl;
                                this.O0 = object2;
                                if (n8 == 0 || this.v0()) break block18;
                                break block19;
                            }
                            if (this.U1((v)object2)) break block21;
                            n8 = n9;
                            break block17;
                        }
                        this.O0 = object2;
                        if (!(n8 != 0 ? !this.v0() : !this.t0())) break block18;
                    }
                    n8 = 2;
                    break block17;
                }
                this.u0();
            }
            n8 = 0;
        }
        if (c8.d != 0 && (this.N0 != object3 || this.q1 == 3)) {
            return new ax.Y0.c(d8.a, (v)object, (v)object2, 0, n8);
        }
        return c8;
    }

    protected abstract ax.Y0.c l0(D var1, v var2, v var3);

    protected abstract void l1(v var1, MediaFormat var2) throws s;

    protected void m1(long l8) {
    }

    protected void n1(long l8) {
        this.D1 = l8;
        while (!this.C0.isEmpty() && l8 >= this.C0.peek().a) {
            this.F1(a.e(this.C0.poll()));
            this.o1();
        }
    }

    @Override
    public final long o(long l8, long l9) {
        return this.M0(l8, l9, this.d1);
    }

    protected void o1() {
    }

    protected void p1(i i8) throws s {
    }

    protected B r0(Throwable throwable, D d8) {
        return new B(throwable, d8);
    }

    protected abstract boolean s1(long var1, long var3, x var5, ByteBuffer var6, int var7, int var8, int var9, long var10, boolean var12, boolean var13, v var14) throws s;

    protected void w1() {
        Throwable throwable4;
        block14: {
            Throwable throwable22;
            block13: {
                Object object;
                block10: {
                    Throwable throwable32;
                    block12: {
                        block11: {
                            block9: {
                                try {
                                    object = this.N0;
                                    if (object == null) break block9;
                                }
                                catch (Throwable throwable22) {
                                    break block10;
                                }
                                object.d();
                                object = this.B1;
                                ++((ax.Y0.b)object).b;
                                this.j1(a.e(this.U0).a);
                            }
                            this.N0 = null;
                            try {
                                object = this.J0;
                                if (object == null) break block11;
                            }
                            catch (Throwable throwable32) {
                                break block12;
                            }
                            object.release();
                        }
                        this.J0 = null;
                        this.E1(null);
                        this.A1();
                        return;
                    }
                    this.J0 = null;
                    this.E1(null);
                    this.A1();
                    throw throwable32;
                }
                this.N0 = null;
                try {
                    object = this.J0;
                    if (object == null) break block13;
                }
                catch (Throwable throwable4) {
                    break block14;
                }
                object.release();
            }
            this.J0 = null;
            this.E1(null);
            this.A1();
            throw throwable22;
        }
        this.J0 = null;
        this.E1(null);
        this.A1();
        throw throwable4;
    }

    @Override
    public void x(float f8, float f9) throws s {
        this.L0 = f8;
        this.M0 = f9;
        this.U1(this.O0);
    }

    protected abstract void x1() throws s;

    public void y0() {
        this.F1 = true;
    }

    protected void z1() {
        this.C1();
        this.D1();
        this.B1();
        this.e1 = -9223372036854775807L;
        this.s1 = false;
        this.c1 = -9223372036854775807L;
        this.r1 = false;
        this.Z0 = false;
        this.a1 = false;
        this.i1 = false;
        this.j1 = false;
        this.p1 = 0;
        this.q1 = 0;
        this.o1 = this.n1 ? 1 : 0;
        this.G1 = false;
        this.H1 = -9223372036854775807L;
        this.I1 = -9223372036854775807L;
    }

    private static final class b {
        public static void a(x.a a8, I1 i12) {
            if (!ax.Z0.H1.a((LogSessionId)(i12 = i12.a()), ax.Z0.G1.a())) {
                a8.b.setString("log-session-id", M.a((LogSessionId)i12));
            }
        }
    }

    public static class c
    extends Exception {
        public final boolean c0;
        public final D d0;
        public final String e0;
        public final c f0;
        public final String q;

        public c(v v8, Throwable throwable, boolean bl, int n8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Decoder init failed: [");
            stringBuilder.append(n8);
            stringBuilder.append("], ");
            stringBuilder.append(v8);
            this(stringBuilder.toString(), throwable, v8.o, bl, null, c.b(n8), null);
        }

        public c(v object, Throwable throwable, boolean bl, D d8) {
            CharSequence charSequence = new StringBuilder();
            charSequence.append("Decoder init failed: ");
            charSequence.append(d8.a);
            charSequence.append(", ");
            charSequence.append(object);
            charSequence = charSequence.toString();
            String string = ((v)object).o;
            object = throwable instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException)throwable).getDiagnosticInfo() : null;
            this((String)charSequence, throwable, string, bl, d8, (String)object, null);
        }

        private c(String string, Throwable throwable, String string2, boolean bl, D d8, String string3, c c8) {
            super(string, throwable);
            this.q = string2;
            this.c0 = bl;
            this.d0 = d8;
            this.e0 = string3;
            this.f0 = c8;
        }

        private static String b(int n8) {
            String string = n8 < 0 ? "neg_" : "";
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("androidx.media3.exoplayer.mediacodec");
            stringBuilder.append(".MediaCodecRenderer_");
            stringBuilder.append(string);
            stringBuilder.append(Math.abs(n8));
            return stringBuilder.toString();
        }

        private c c(c c8) {
            return new c(this.getMessage(), this.getCause(), this.q, this.c0, this.d0, this.e0, c8);
        }
    }

    private final class d
    implements x.c {
        final L a;

        private d(L l8) {
            this.a = l8;
        }

        @Override
        public void a() {
            if (this.a.I0 != null) {
                this.a.I0.b();
            }
        }

        @Override
        public void b() {
            if (this.a.I0 != null) {
                this.a.I0.b();
            }
        }
    }

    private static final class e {
        public static final e e = new e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);
        public final long a;
        public final long b;
        public final long c;
        public final ax.S0.L<v> d;

        public e(long l8, long l9, long l10) {
            this.a = l8;
            this.b = l9;
            this.c = l10;
            this.d = new ax.S0.L();
        }
    }
}

