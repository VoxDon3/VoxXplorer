/*
 * Decompiled with CFR 0.152.
 */
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
import android.view.Display;
import android.view.Surface;
import androidx.media3.exoplayer.M0;
import ax.P0.D;
import ax.P0.N;
import ax.P0.v;
import ax.S0.I;
import ax.S0.d0;
import ax.S0.u;
import ax.S0.x;
import ax.V0.i;
import ax.Y0.O;
import ax.Y0.V;
import ax.Y0.Y;
import ax.Y0.b;
import ax.f1.L;
import ax.f1.Q;
import ax.f1.a0;
import ax.f1.x;
import ax.f1.y;
import ax.i1.F;
import ax.o1.A;
import ax.o1.B;
import ax.o1.P;
import ax.o1.S;
import ax.o1.a;
import ax.o1.j;
import ax.o1.l;
import ax.o1.m;
import ax.o1.n;
import ax.o1.o;
import ax.o1.s;
import ax.o1.z;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;

public class k
extends L
implements A.b {
    private static final int[] D2 = new int[]{1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
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
    private final A P1;
    private final A.a Q1;
    private final a R1;
    private final long S1;
    private final B T1;
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
    private o e2;
    private I f2;
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
    private ax.P0.a0 s2;
    private ax.P0.a0 t2;
    private int u2;
    private boolean v2;
    private int w2;
    f x2;
    private z y2;
    private long z2;

    protected k(d d8) {
        super(2, d8.d, d8.c, d8.f, d8.j);
        Object object;
        this.K1 = object = d8.a.getApplicationContext();
        this.N1 = d8.i;
        this.Z1 = d8.k;
        this.M1 = new P.a(d8.g, d8.h);
        boolean bl = this.Z1 == null;
        this.L1 = bl;
        this.P1 = new A((Context)object, this, d8.e);
        this.Q1 = new A.a();
        this.O1 = k.j2();
        this.f2 = I.c;
        this.h2 = 1;
        this.i2 = 0;
        this.s2 = ax.P0.a0.e;
        this.w2 = 0;
        this.t2 = null;
        this.u2 = -1000;
        this.z2 = -9223372036854775807L;
        this.A2 = -9223372036854775807L;
        object = d8.l ? new a() : null;
        this.R1 = object;
        this.U1 = new PriorityQueue();
        if (d8.m != -9223372036854775807L) {
            this.S1 = -d8.m;
            this.T1 = new B(1.0f);
        } else {
            this.S1 = -9223372036854775807L;
            this.T1 = null;
        }
        this.V1 = d8.n;
        this.n2 = null;
    }

    private void A2() {
        if (this.P1.g() && this.d2 != null) {
            this.I2();
        }
    }

    private void B2() {
        int n8 = this.q2;
        if (n8 != 0) {
            this.M1.r(this.p2, n8);
            this.p2 = 0L;
            this.q2 = 0;
        }
    }

    private void C2(ax.P0.a0 a02) {
        if (!a02.equals(ax.P0.a0.e) && !a02.equals(this.t2)) {
            this.t2 = a02;
            this.M1.t(a02);
        }
    }

    private void D2() {
        Surface surface = this.d2;
        if (surface != null && this.g2) {
            this.M1.q(surface);
        }
    }

    private void E2() {
        ax.P0.a0 a02 = this.t2;
        if (a02 != null) {
            this.M1.t(a02);
        }
    }

    private void F2(MediaFormat mediaFormat) {
        if (this.Z1 != null && !d0.M0(this.K1)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
    }

    private void G2() {
        ax.f1.x x8;
        int n8;
        if (this.v2 && (n8 = Build.VERSION.SDK_INT) >= 23 && (x8 = this.E0()) != null) {
            this.x2 = new f(this, x8);
            if (n8 >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                x8.a(bundle);
            }
        }
    }

    private void H2(long l8, long l9, v v8) {
        z z8 = this.y2;
        if (z8 != null) {
            z8.g(l8, l9, v8, this.K0());
        }
    }

    private void I2() {
        this.M1.q(this.d2);
        this.g2 = true;
    }

    private void K2() {
        this.G1();
    }

    private void L2(ax.f1.x x8, int n8, long l8, v v8) {
        long l9 = this.Q1.g();
        long l10 = this.Q1.f();
        if (this.X2() && l9 == this.r2) {
            this.a3(x8, n8, l8);
        } else {
            this.H2(l8, l9, v8);
            this.O2(x8, n8, l8, l9);
        }
        this.g3(l10);
        this.r2 = l9;
    }

    private void M2() {
        o o8 = this.e2;
        if (o8 != null) {
            o8.release();
            this.e2 = null;
        }
    }

    private void N2(ax.f1.x x8, int n8, long l8, long l9) {
        this.O2(x8, n8, l8, l9);
    }

    private static void P2(ax.f1.x x8, byte[] byArray) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", byArray);
        x8.a(bundle);
    }

    private void Q2(Object object) throws androidx.media3.exoplayer.s {
        if (this.d2 != (object = object instanceof Surface ? (Surface)object : null)) {
            this.d2 = object;
            if (this.Z1 == null) {
                this.P1.o((Surface)object);
            }
            this.g2 = false;
            int n8 = this.getState();
            ax.f1.x x8 = this.E0();
            if (x8 != null && this.Z1 == null) {
                ax.f1.D d8 = ax.S0.a.e(this.G0());
                boolean bl = this.v2(d8);
                if (Build.VERSION.SDK_INT >= 23 && bl && !this.X1) {
                    this.R2(x8, this.u2(d8));
                } else {
                    this.w1();
                    this.e1();
                }
            }
            if (object != null) {
                this.E2();
            } else {
                this.t2 = null;
                object = this.Z1;
                if (object != null) {
                    object.u();
                }
            }
            if (n8 == 2) {
                object = this.Z1;
                if (object != null) {
                    object.x(true);
                } else {
                    this.P1.e(true);
                }
            }
            this.G2();
            return;
        }
        if (object != null) {
            this.E2();
            this.D2();
        }
    }

    private void R2(ax.f1.x x8, Surface surface) {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 23 && surface != null) {
            this.S2(x8, surface);
            return;
        }
        if (n8 >= 35) {
            this.i2(x8);
            return;
        }
        throw new IllegalStateException();
    }

    private static int b3(Context object, Q q8, v v8) throws a0.c {
        int n8;
        Object object2;
        boolean bl = D.s(v8.o);
        int n9 = 0;
        if (!bl) {
            return V.a(0);
        }
        bl = v8.s != null;
        Object object3 = object2 = k.q2((Context)object, q8, v8, bl, false);
        if (bl) {
            object3 = object2;
            if (object2.isEmpty()) {
                object3 = k.q2((Context)object, q8, v8, false, false);
            }
        }
        if (object3.isEmpty()) {
            return V.a(1);
        }
        if (!L.S1(v8)) {
            return V.a(2);
        }
        ax.f1.D d8 = object3.get(0);
        boolean bl2 = d8.q(v8);
        if (!bl2) {
            for (n8 = 1; n8 < object3.size(); ++n8) {
                object2 = (ax.f1.D)object3.get(n8);
                if (!((ax.f1.D)object2).q(v8)) continue;
                object3 = object2;
                n8 = 0;
                bl2 = true;
                break;
            }
        } else {
            n8 = 1;
            object3 = d8;
        }
        int n10 = bl2 ? 4 : 3;
        int n11 = ((ax.f1.D)object3).t(v8) ? 16 : 8;
        int n12 = ((ax.f1.D)object3).h ? 64 : 0;
        n8 = n8 != 0 ? 128 : 0;
        int n13 = n8;
        if (Build.VERSION.SDK_INT >= 26) {
            n13 = n8;
            if ("video/dolby-vision".equals(v8.o)) {
                n13 = n8;
                if (!c.a((Context)object)) {
                    n13 = 256;
                }
            }
        }
        n8 = n9;
        if (bl2) {
            object = k.q2((Context)object, q8, v8, bl, true);
            n8 = n9;
            if (!object.isEmpty()) {
                object = a0.o((List<ax.f1.D>)object, v8).get(0);
                n8 = n9;
                if (((ax.f1.D)object).q(v8)) {
                    n8 = n9;
                    if (((ax.f1.D)object).t(v8)) {
                        n8 = 32;
                    }
                }
            }
        }
        return V.d(n10, n11, n8, n12, n13);
    }

    private void c3() {
        ax.f1.x x8 = this.E0();
        if (x8 != null && Build.VERSION.SDK_INT >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.u2));
            x8.a(bundle);
        }
    }

    private void e3(long l8) {
        Long l9;
        int n8 = 0;
        while ((l9 = this.U1.peek()) != null && l9 < l8) {
            ++n8;
            this.U1.poll();
        }
        this.d3(n8, 0);
    }

    private void f3(F.b b8) {
        N n8 = this.S();
        if (n8.q()) {
            this.A2 = -9223372036854775807L;
            return;
        }
        this.A2 = n8.h(ax.S0.a.e(b8).a, new N.b()).k();
    }

    private void g2() {
        this.Z1.m(new S.a(this){
            final k b;
            {
                this.b = k8;
            }

            @Override
            public void a(ax.P0.a0 a02) {
            }

            @Override
            public void b() {
                M0.a a8 = this.b.S0();
                if (a8 != null) {
                    a8.b();
                }
            }

            @Override
            public void e() {
                if (this.b.d2 != null) {
                    this.b.I2();
                }
            }

            @Override
            public void f() {
                if (this.b.d2 != null) {
                    this.b.d3(0, 1);
                }
            }
        }, ax.v7.f.a());
        Object object = this.y2;
        if (object != null) {
            this.Z1.p((z)object);
        }
        if (this.d2 != null && !this.f2.equals(I.c)) {
            this.Z1.t(this.d2, this.f2);
        }
        this.Z1.s(this.i2);
        this.Z1.g(this.R0());
        object = this.c2;
        if (object != null) {
            this.Z1.w((List<Object>)object);
        }
    }

    private static boolean j2() {
        return "NVIDIA".equals(Build.MANUFACTURER);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static boolean l2() {
        var1 = 26;
        var2_1 = Build.VERSION.SDK_INT;
        if (var2_1 <= 28) {
            var3_2 = Build.DEVICE;
            var3_2.getClass();
            tmp = -1;
            switch (var3_2.hashCode()) {
                case 825323514: {
                    if (!var3_2.equals("machuca")) break;
                    tmp = 1;
                    break;
                }
                case 3415681: {
                    if (!var3_2.equals("once")) break;
                    tmp = 2;
                    break;
                }
                case -64886864: {
                    if (!var3_2.equals("magnolia")) break;
                    tmp = 3;
                    break;
                }
                case -760312546: {
                    if (!var3_2.equals("aquaman")) break;
                    tmp = 4;
                    break;
                }
                case -1012436106: {
                    if (!var3_2.equals("oneday")) break;
                    tmp = 5;
                    break;
                }
                case -1220066608: {
                    if (!var3_2.equals("dangalUHD")) break;
                    tmp = 6;
                    break;
                }
                case -1220081023: {
                    if (!var3_2.equals("dangalFHD")) break;
                    tmp = 7;
                    break;
                }
                case -1339091551: {
                    if (!var3_2.equals("dangal")) break;
                    tmp = 8;
                    break;
                }
            }
            switch (tmp) {
                default: {
                    var0_3 = -1;
                    break;
                }
                case 1: {
                    var0_3 = 7;
                    break;
                }
                case 2: {
                    var0_3 = 6;
                    break;
                }
                case 3: {
                    var0_3 = 5;
                    break;
                }
                case 4: {
                    var0_3 = 4;
                    break;
                }
                case 5: {
                    var0_3 = 3;
                    break;
                }
                case 6: {
                    var0_3 = 2;
                    break;
                }
                case 7: {
                    var0_3 = 1;
                    break;
                }
                case 8: {
                    var0_3 = 0;
                }
            }
            switch (var0_3) {
                default: {
                    break;
                }
                case 0: 
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: {
                    return true;
                }
            }
        }
        if (var2_1 <= 27 && "HWEML".equals(Build.DEVICE)) {
            return true;
        }
        var4_4 = Build.MODEL;
        var4_4.getClass();
        tmp = -1;
        switch (var4_4.hashCode()) {
            case 2119412532: {
                if (!var4_4.equals("AFTEUFF014")) break;
                tmp = 1;
                break;
            }
            case 1798172390: {
                if (!var4_4.equals("AFTSO001")) break;
                tmp = 2;
                break;
            }
            case 1785421876: {
                if (!var4_4.equals("AFTEU014")) break;
                tmp = 3;
                break;
            }
            case 1785421873: {
                if (!var4_4.equals("AFTEU011")) break;
                tmp = 4;
                break;
            }
            case 2006371: {
                if (!var4_4.equals("AFTR")) break;
                tmp = 5;
                break;
            }
            case 2006367: {
                if (!var4_4.equals("AFTN")) break;
                tmp = 6;
                break;
            }
            case 2006354: {
                if (!var4_4.equals("AFTA")) break;
                tmp = 7;
                break;
            }
            case -321033677: {
                if (!var4_4.equals("AFTKMST12")) break;
                tmp = 8;
                break;
            }
            case -349662828: {
                if (!var4_4.equals("AFTJMST12")) break;
                tmp = 9;
                break;
            }
        }
        switch (tmp) {
            default: {
                var0_3 = -1;
                break;
            }
            case 1: {
                var0_3 = 8;
                break;
            }
            case 2: {
                var0_3 = 7;
                break;
            }
            case 3: {
                var0_3 = 6;
                break;
            }
            case 4: {
                var0_3 = 5;
                break;
            }
            case 5: {
                var0_3 = 4;
                break;
            }
            case 6: {
                var0_3 = 3;
                break;
            }
            case 7: {
                var0_3 = 2;
                break;
            }
            case 8: {
                var0_3 = 1;
                break;
            }
            case 9: {
                var0_3 = 0;
            }
        }
        switch (var0_3) {
            default: {
                if (var2_1 > 26) return false;
                var3_2 = Build.DEVICE;
                var3_2.getClass();
                switch (var3_2.hashCode()) {
                    case 2048855701: {
                        if (!var3_2.equals("HWWAS-H")) break;
                        var0_3 = 139;
                        ** GOTO lbl715
                    }
                    case 2048319463: {
                        if (!var3_2.equals("HWVNS-H")) break;
                        var0_3 = 138;
                        ** GOTO lbl715
                    }
                    case 2047252157: {
                        if (!var3_2.equals("ELUGA_Prim")) break;
                        var0_3 = 137;
                        ** GOTO lbl715
                    }
                    case 2047190025: {
                        if (!var3_2.equals("ELUGA_Note")) break;
                        var0_3 = 136;
                        ** GOTO lbl715
                    }
                    case 2033393791: {
                        if (!var3_2.equals("ASUS_X00AD_2")) break;
                        var0_3 = 135;
                        ** GOTO lbl715
                    }
                    case 2030379515: {
                        if (!var3_2.equals("HWCAM-H")) break;
                        var0_3 = 134;
                        ** GOTO lbl715
                    }
                    case 2029784656: {
                        if (!var3_2.equals("HWBLN-H")) break;
                        var0_3 = 133;
                        ** GOTO lbl715
                    }
                    case 2019281702: {
                        if (!var3_2.equals("DM-01K")) break;
                        var0_3 = 132;
                        ** GOTO lbl715
                    }
                    case 2006372676: {
                        if (!var3_2.equals("BRAVIA_ATV3_4K")) break;
                        var0_3 = 131;
                        ** GOTO lbl715
                    }
                    case 1977196784: {
                        if (!var3_2.equals("Infinix-X572")) break;
                        var0_3 = 130;
                        ** GOTO lbl715
                    }
                    case 1906253259: {
                        if (!var3_2.equals("PB2-670M")) break;
                        var0_3 = 129;
                        ** GOTO lbl715
                    }
                    case 1865889110: {
                        if (!var3_2.equals("santoni")) break;
                        var0_3 = 128;
                        ** GOTO lbl715
                    }
                    case 1709443163: {
                        if (!var3_2.equals("iball8735_9806")) break;
                        var0_3 = 127;
                        ** GOTO lbl715
                    }
                    case 1691544261: {
                        if (!var3_2.equals("CPH1715")) break;
                        var0_3 = 126;
                        ** GOTO lbl715
                    }
                    case 1691543273: {
                        if (!var3_2.equals("CPH1609")) break;
                        var0_3 = 125;
                        ** GOTO lbl715
                    }
                    case 1522194893: {
                        if (!var3_2.equals("woods_f")) break;
                        var0_3 = 124;
                        ** GOTO lbl715
                    }
                    case 1349174697: {
                        if (!var3_2.equals("htc_e56ml_dtul")) break;
                        var0_3 = 123;
                        ** GOTO lbl715
                    }
                    case 1306947716: {
                        if (!var3_2.equals("EverStar_S")) break;
                        var0_3 = 122;
                        ** GOTO lbl715
                    }
                    case 1280332038: {
                        if (!var3_2.equals("hwALE-H")) break;
                        var0_3 = 121;
                        ** GOTO lbl715
                    }
                    case 1176899427: {
                        if (!var3_2.equals("itel_S41")) break;
                        var0_3 = 120;
                        ** GOTO lbl715
                    }
                    case 1150207623: {
                        if (!var3_2.equals("LS-5017")) break;
                        var0_3 = 119;
                        ** GOTO lbl715
                    }
                    case 1060579533: {
                        if (!var3_2.equals("panell_d")) break;
                        var0_3 = 118;
                        ** GOTO lbl715
                    }
                    case 958008161: {
                        if (!var3_2.equals("j2xlteins")) break;
                        var0_3 = 117;
                        ** GOTO lbl715
                    }
                    case 917340916: {
                        if (!var3_2.equals("A7000plus")) break;
                        var0_3 = 116;
                        ** GOTO lbl715
                    }
                    case 835649806: {
                        if (!var3_2.equals("manning")) break;
                        var0_3 = 115;
                        ** GOTO lbl715
                    }
                    case 794040393: {
                        if (!var3_2.equals("GIONEE_WBL7519")) break;
                        var0_3 = 114;
                        ** GOTO lbl715
                    }
                    case 794038622: {
                        if (!var3_2.equals("GIONEE_WBL7365")) break;
                        var0_3 = 113;
                        ** GOTO lbl715
                    }
                    case 793982701: {
                        if (!var3_2.equals("GIONEE_WBL5708")) break;
                        var0_3 = 112;
                        ** GOTO lbl715
                    }
                    case 507412548: {
                        if (!var3_2.equals("QM16XE_U")) break;
                        var0_3 = 111;
                        ** GOTO lbl715
                    }
                    case 407160593: {
                        if (!var3_2.equals("Pixi5-10_4G")) break;
                        var0_3 = 110;
                        ** GOTO lbl715
                    }
                    case 316246818: {
                        if (!var3_2.equals("TB3-850M")) break;
                        var0_3 = 109;
                        ** GOTO lbl715
                    }
                    case 316246811: {
                        if (!var3_2.equals("TB3-850F")) break;
                        var0_3 = 108;
                        ** GOTO lbl715
                    }
                    case 316215116: {
                        if (!var3_2.equals("TB3-730X")) break;
                        var0_3 = 107;
                        ** GOTO lbl715
                    }
                    case 316215098: {
                        if (!var3_2.equals("TB3-730F")) break;
                        var0_3 = 106;
                        ** GOTO lbl715
                    }
                    case 308517133: {
                        if (!var3_2.equals("A7020a48")) break;
                        var0_3 = 105;
                        ** GOTO lbl715
                    }
                    case 307593612: {
                        if (!var3_2.equals("A7010a48")) break;
                        var0_3 = 104;
                        ** GOTO lbl715
                    }
                    case 287431619: {
                        if (!var3_2.equals("griffin")) break;
                        var0_3 = 103;
                        ** GOTO lbl715
                    }
                    case 245388979: {
                        if (!var3_2.equals("marino_f")) break;
                        var0_3 = 102;
                        ** GOTO lbl715
                    }
                    case 182191441: {
                        if (!var3_2.equals("CPY83_I00")) break;
                        var0_3 = 101;
                        ** GOTO lbl715
                    }
                    case 165221241: {
                        if (!var3_2.equals("A2016a40")) break;
                        var0_3 = 100;
                        ** GOTO lbl715
                    }
                    case 102844228: {
                        if (!var3_2.equals("le_x6")) break;
                        var0_3 = 99;
                        ** GOTO lbl715
                    }
                    case 101370885: {
                        if (!var3_2.equals("l5460")) break;
                        var0_3 = 98;
                        ** GOTO lbl715
                    }
                    case 98715550: {
                        if (!var3_2.equals("i9031")) break;
                        var0_3 = 97;
                        ** GOTO lbl715
                    }
                    case 82882791: {
                        if (!var3_2.equals("X3_HK")) break;
                        var0_3 = 96;
                        ** GOTO lbl715
                    }
                    case 80963634: {
                        if (!var3_2.equals("V23GB")) break;
                        var0_3 = 95;
                        ** GOTO lbl715
                    }
                    case 76404911: {
                        if (!var3_2.equals("Q4310")) break;
                        var0_3 = 94;
                        ** GOTO lbl715
                    }
                    case 76404105: {
                        if (!var3_2.equals("Q4260")) break;
                        var0_3 = 93;
                        ** GOTO lbl715
                    }
                    case 76402249: {
                        if (!var3_2.equals("PRO7S")) break;
                        var0_3 = 92;
                        ** GOTO lbl715
                    }
                    case 66216390: {
                        if (!var3_2.equals("F3311")) break;
                        var0_3 = 91;
                        ** GOTO lbl715
                    }
                    case 66215433: {
                        if (!var3_2.equals("F3215")) break;
                        var0_3 = 90;
                        ** GOTO lbl715
                    }
                    case 66215431: {
                        if (!var3_2.equals("F3213")) break;
                        var0_3 = 89;
                        ** GOTO lbl715
                    }
                    case 66215429: {
                        if (!var3_2.equals("F3211")) break;
                        var0_3 = 88;
                        ** GOTO lbl715
                    }
                    case 66214473: {
                        if (!var3_2.equals("F3116")) break;
                        var0_3 = 87;
                        ** GOTO lbl715
                    }
                    case 66214470: {
                        if (!var3_2.equals("F3113")) break;
                        var0_3 = 86;
                        ** GOTO lbl715
                    }
                    case 66214468: {
                        if (!var3_2.equals("F3111")) break;
                        var0_3 = 85;
                        ** GOTO lbl715
                    }
                    case 65355429: {
                        if (!var3_2.equals("E5643")) break;
                        var0_3 = 84;
                        ** GOTO lbl715
                    }
                    case 61542055: {
                        if (!var3_2.equals("A1601")) break;
                        var0_3 = 83;
                        ** GOTO lbl715
                    }
                    case 55178625: {
                        if (!var3_2.equals("Aura_Note_2")) break;
                        var0_3 = 82;
                        ** GOTO lbl715
                    }
                    case 51350594: {
                        if (!var3_2.equals("602LV")) break;
                        var0_3 = 81;
                        ** GOTO lbl715
                    }
                    case 51349633: {
                        if (!var3_2.equals("601LV")) break;
                        var0_3 = 80;
                        ** GOTO lbl715
                    }
                    case 41325051: {
                        if (!var3_2.equals("MEIZU_M5")) break;
                        var0_3 = 79;
                        ** GOTO lbl715
                    }
                    case 3386211: {
                        if (!var3_2.equals("p212")) break;
                        var0_3 = 78;
                        ** GOTO lbl715
                    }
                    case 0x332327: {
                        if (!var3_2.equals("mido")) break;
                        var0_3 = 77;
                        ** GOTO lbl715
                    }
                    case 3284551: {
                        if (!var3_2.equals("kate")) break;
                        var0_3 = 76;
                        ** GOTO lbl715
                    }
                    case 3154429: {
                        if (!var3_2.equals("fugu")) break;
                        var0_3 = 75;
                        ** GOTO lbl715
                    }
                    case 2689555: {
                        if (!var3_2.equals("XE2X")) break;
                        var0_3 = 74;
                        ** GOTO lbl715
                    }
                    case 2464648: {
                        if (!var3_2.equals("Q427")) break;
                        var0_3 = 73;
                        ** GOTO lbl715
                    }
                    case 2463773: {
                        if (!var3_2.equals("Q350")) break;
                        var0_3 = 72;
                        ** GOTO lbl715
                    }
                    case 0x252F5F: {
                        if (!var3_2.equals("P681")) break;
                        var0_3 = 71;
                        ** GOTO lbl715
                    }
                    case 2133184: {
                        if (!var3_2.equals("F04J")) break;
                        var0_3 = 70;
                        ** GOTO lbl715
                    }
                    case 2133182: {
                        if (!var3_2.equals("F04H")) break;
                        var0_3 = 69;
                        ** GOTO lbl715
                    }
                    case 2133151: {
                        if (!var3_2.equals("F03H")) break;
                        var0_3 = 68;
                        ** GOTO lbl715
                    }
                    case 2133120: {
                        if (!var3_2.equals("F02H")) break;
                        var0_3 = 67;
                        ** GOTO lbl715
                    }
                    case 2133091: {
                        if (!var3_2.equals("F01J")) break;
                        var0_3 = 66;
                        ** GOTO lbl715
                    }
                    case 2133089: {
                        if (!var3_2.equals("F01H")) break;
                        var0_3 = 65;
                        ** GOTO lbl715
                    }
                    case 1514185: {
                        if (!var3_2.equals("1714")) break;
                        var0_3 = 64;
                        ** GOTO lbl715
                    }
                    case 1514184: {
                        if (!var3_2.equals("1713")) break;
                        var0_3 = 63;
                        ** GOTO lbl715
                    }
                    case 1513190: {
                        if (!var3_2.equals("1601")) break;
                        var0_3 = 62;
                        ** GOTO lbl715
                    }
                    case 101481: {
                        if (!var3_2.equals("flo")) break;
                        var0_3 = 61;
                        ** GOTO lbl715
                    }
                    case 99329: {
                        if (!var3_2.equals("deb")) break;
                        var0_3 = 60;
                        ** GOTO lbl715
                    }
                    case 98848: {
                        if (!var3_2.equals("cv3")) break;
                        var0_3 = 59;
                        ** GOTO lbl715
                    }
                    case 98846: {
                        if (!var3_2.equals("cv1")) break;
                        var0_3 = 58;
                        ** GOTO lbl715
                    }
                    case 88274: {
                        if (!var3_2.equals("Z80")) break;
                        var0_3 = 57;
                        ** GOTO lbl715
                    }
                    case 80618: {
                        if (!var3_2.equals("QX1")) break;
                        var0_3 = 56;
                        ** GOTO lbl715
                    }
                    case 79305: {
                        if (!var3_2.equals("PLE")) break;
                        var0_3 = 55;
                        ** GOTO lbl715
                    }
                    case 78669: {
                        if (!var3_2.equals("P85")) break;
                        var0_3 = 54;
                        ** GOTO lbl715
                    }
                    case 76779: {
                        if (!var3_2.equals("MX6")) break;
                        var0_3 = 53;
                        ** GOTO lbl715
                    }
                    case 75739: {
                        if (!var3_2.equals("M5c")) break;
                        var0_3 = 52;
                        ** GOTO lbl715
                    }
                    case 75537: {
                        if (!var3_2.equals("M04")) break;
                        var0_3 = 51;
                        ** GOTO lbl715
                    }
                    case 73405: {
                        if (!var3_2.equals("JGZ")) break;
                        var0_3 = 50;
                        ** GOTO lbl715
                    }
                    case 3483: {
                        if (!var3_2.equals("mh")) break;
                        var0_3 = 49;
                        ** GOTO lbl715
                    }
                    case 3091: {
                        if (!var3_2.equals("b5")) break;
                        var0_3 = 48;
                        ** GOTO lbl715
                    }
                    case 2719: {
                        if (!var3_2.equals("V5")) break;
                        var0_3 = 47;
                        ** GOTO lbl715
                    }
                    case 2715: {
                        if (!var3_2.equals("V1")) break;
                        var0_3 = 46;
                        ** GOTO lbl715
                    }
                    case 2564: {
                        if (!var3_2.equals("Q5")) break;
                        var0_3 = 45;
                        ** GOTO lbl715
                    }
                    case 2126: {
                        if (!var3_2.equals("C1")) break;
                        var0_3 = 44;
                        ** GOTO lbl715
                    }
                    case -56598463: {
                        if (!var3_2.equals("woods_fn")) break;
                        var0_3 = 43;
                        ** GOTO lbl715
                    }
                    case -173639913: {
                        if (!var3_2.equals("ELUGA_A3_Pro")) break;
                        var0_3 = 42;
                        ** GOTO lbl715
                    }
                    case -277133239: {
                        if (!var3_2.equals("Z12_PRO")) break;
                        var0_3 = 41;
                        ** GOTO lbl715
                    }
                    case -282781963: {
                        if (!var3_2.equals("BLACK-1X")) break;
                        var0_3 = 40;
                        ** GOTO lbl715
                    }
                    case -290434366: {
                        if (!var3_2.equals("taido_row")) break;
                        var0_3 = 39;
                        ** GOTO lbl715
                    }
                    case -430914369: {
                        if (!var3_2.equals("Pixi4-7_3G")) break;
                        var0_3 = 38;
                        ** GOTO lbl715
                    }
                    case -521118391: {
                        if (!var3_2.equals("GIONEE_GBL7360")) break;
                        var0_3 = 37;
                        ** GOTO lbl715
                    }
                    case -575125681: {
                        if (!var3_2.equals("GiONEE_CBL7513")) break;
                        var0_3 = 36;
                        ** GOTO lbl715
                    }
                    case -782144577: {
                        if (!var3_2.equals("OnePlus5T")) break;
                        var0_3 = 35;
                        ** GOTO lbl715
                    }
                    case -788334647: {
                        if (!var3_2.equals("whyred")) break;
                        var0_3 = 34;
                        ** GOTO lbl715
                    }
                    case -794946968: {
                        if (!var3_2.equals("watson")) break;
                        var0_3 = 33;
                        ** GOTO lbl715
                    }
                    case -797483286: {
                        if (!var3_2.equals("SVP-DTV15")) break;
                        var0_3 = 32;
                        ** GOTO lbl715
                    }
                    case -821392978: {
                        if (!var3_2.equals("A7000-a")) break;
                        var0_3 = 31;
                        ** GOTO lbl715
                    }
                    case -842500323: {
                        if (!var3_2.equals("nicklaus_f")) break;
                        var0_3 = 30;
                        ** GOTO lbl715
                    }
                    case -879245230: {
                        if (!var3_2.equals("tcl_eu")) break;
                        var0_3 = 29;
                        ** GOTO lbl715
                    }
                    case -958336948: {
                        if (!var3_2.equals("ELUGA_Ray_X")) break;
                        var0_3 = 28;
                        ** GOTO lbl715
                    }
                    case -965403638: {
                        if (!var3_2.equals("s905x018")) break;
                        var0_3 = 27;
                        ** GOTO lbl715
                    }
                    case -993250458: {
                        var0_3 = var1;
                        if (!var3_2.equals("A10-70L")) {
                            break;
                        }
                        ** GOTO lbl715
                    }
                    case -993250464: {
                        if (!var3_2.equals("A10-70F")) break;
                        var0_3 = 25;
                        ** GOTO lbl715
                    }
                    case -1052835013: {
                        if (!var3_2.equals("namath")) break;
                        var0_3 = 24;
                        ** GOTO lbl715
                    }
                    case -1139198265: {
                        if (!var3_2.equals("Slate_Pro")) break;
                        var0_3 = 23;
                        ** GOTO lbl715
                    }
                    case -1180384755: {
                        if (!var3_2.equals("iris60")) break;
                        var0_3 = 22;
                        ** GOTO lbl715
                    }
                    case -1217592143: {
                        if (!var3_2.equals("BRAVIA_ATV2")) break;
                        var0_3 = 21;
                        ** GOTO lbl715
                    }
                    case -1320080169: {
                        if (!var3_2.equals("GiONEE_GBL7319")) break;
                        var0_3 = 20;
                        ** GOTO lbl715
                    }
                    case -1481772729: {
                        if (!var3_2.equals("panell_dt")) break;
                        var0_3 = 19;
                        ** GOTO lbl715
                    }
                    case -1481772730: {
                        if (!var3_2.equals("panell_ds")) break;
                        var0_3 = 18;
                        ** GOTO lbl715
                    }
                    case -1481772737: {
                        if (!var3_2.equals("panell_dl")) break;
                        var0_3 = 17;
                        ** GOTO lbl715
                    }
                    case -1554255044: {
                        if (!var3_2.equals("vernee_M5")) break;
                        var0_3 = 16;
                        ** GOTO lbl715
                    }
                    case -1600724499: {
                        if (!var3_2.equals("pacificrim")) break;
                        var0_3 = 15;
                        ** GOTO lbl715
                    }
                    case -1615810839: {
                        if (!var3_2.equals("Phantom6")) break;
                        var0_3 = 14;
                        ** GOTO lbl715
                    }
                    case -1680025915: {
                        if (!var3_2.equals("ComioS1")) break;
                        var0_3 = 13;
                        ** GOTO lbl715
                    }
                    case -1696512866: {
                        if (!var3_2.equals("XT1663")) break;
                        var0_3 = 12;
                        ** GOTO lbl715
                    }
                    case -1885099851: {
                        if (!var3_2.equals("RAIJIN")) break;
                        var0_3 = 11;
                        ** GOTO lbl715
                    }
                    case -1931988508: {
                        if (!var3_2.equals("AquaPowerM")) break;
                        var0_3 = 10;
                        ** GOTO lbl715
                    }
                    case -1936688065: {
                        if (!var3_2.equals("PGN611")) break;
                        var0_3 = 9;
                        ** GOTO lbl715
                    }
                    case -1936688066: {
                        if (!var3_2.equals("PGN610")) break;
                        var0_3 = 8;
                        ** GOTO lbl715
                    }
                    case -1936688988: {
                        if (!var3_2.equals("PGN528")) break;
                        var0_3 = 7;
                        ** GOTO lbl715
                    }
                    case -1978990237: {
                        if (!var3_2.equals("NX573J")) break;
                        var0_3 = 6;
                        ** GOTO lbl715
                    }
                    case -1978993182: {
                        if (!var3_2.equals("NX541J")) break;
                        var0_3 = 5;
                        ** GOTO lbl715
                    }
                    case -2022874474: {
                        if (!var3_2.equals("CP8676_I02")) break;
                        var0_3 = 4;
                        ** GOTO lbl715
                    }
                    case -2097309513: {
                        if (!var3_2.equals("K50a40")) break;
                        var0_3 = 3;
                        ** GOTO lbl715
                    }
                    case -2144781160: {
                        if (!var3_2.equals("GIONEE_SWW1631")) break;
                        var0_3 = 2;
                        ** GOTO lbl715
                    }
                    case -2144781185: {
                        if (!var3_2.equals("GIONEE_SWW1627")) break;
                        var0_3 = 1;
                        ** GOTO lbl715
                    }
                    case -2144781245: {
                        if (var3_2.equals("GIONEE_SWW1609")) ** GOTO lbl714
                    }
                }
                var0_3 = -1;
                ** GOTO lbl715
lbl714:
                // 1 sources

                var0_3 = 0;
lbl715:
                // 141 sources

                switch (var0_3) {
                    default: {
                        var4_4.getClass();
                        if (var4_4.equals("JSN-L21") != false) return true;
                        return false;
                    }
                    case 0: 
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 8: 
                    case 9: 
                    case 10: 
                    case 11: 
                    case 12: 
                    case 13: 
                    case 14: 
                    case 15: 
                    case 16: 
                    case 17: 
                    case 18: 
                    case 19: 
                    case 20: 
                    case 21: 
                    case 22: 
                    case 23: 
                    case 24: 
                    case 25: 
                    case 26: 
                    case 27: 
                    case 28: 
                    case 29: 
                    case 30: 
                    case 31: 
                    case 32: 
                    case 33: 
                    case 34: 
                    case 35: 
                    case 36: 
                    case 37: 
                    case 38: 
                    case 39: 
                    case 40: 
                    case 41: 
                    case 42: 
                    case 43: 
                    case 44: 
                    case 45: 
                    case 46: 
                    case 47: 
                    case 48: 
                    case 49: 
                    case 50: 
                    case 51: 
                    case 52: 
                    case 53: 
                    case 54: 
                    case 55: 
                    case 56: 
                    case 57: 
                    case 58: 
                    case 59: 
                    case 60: 
                    case 61: 
                    case 62: 
                    case 63: 
                    case 64: 
                    case 65: 
                    case 66: 
                    case 67: 
                    case 68: 
                    case 69: 
                    case 70: 
                    case 71: 
                    case 72: 
                    case 73: 
                    case 74: 
                    case 75: 
                    case 76: 
                    case 77: 
                    case 78: 
                    case 79: 
                    case 80: 
                    case 81: 
                    case 82: 
                    case 83: 
                    case 84: 
                    case 85: 
                    case 86: 
                    case 87: 
                    case 88: 
                    case 89: 
                    case 90: 
                    case 91: 
                    case 92: 
                    case 93: 
                    case 94: 
                    case 95: 
                    case 96: 
                    case 97: 
                    case 98: 
                    case 99: 
                    case 100: 
                    case 101: 
                    case 102: 
                    case 103: 
                    case 104: 
                    case 105: 
                    case 106: 
                    case 107: 
                    case 108: 
                    case 109: 
                    case 110: 
                    case 111: 
                    case 112: 
                    case 113: 
                    case 114: 
                    case 115: 
                    case 116: 
                    case 117: 
                    case 118: 
                    case 119: 
                    case 120: 
                    case 121: 
                    case 122: 
                    case 123: 
                    case 124: 
                    case 125: 
                    case 126: 
                    case 127: 
                    case 128: 
                    case 129: 
                    case 130: 
                    case 131: 
                    case 132: 
                    case 133: 
                    case 134: 
                    case 135: 
                    case 136: 
                    case 137: 
                    case 138: 
                    case 139: 
                }
                return true;
            }
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int n2(ax.f1.D d8, v object) {
        String string;
        int n8;
        int n9;
        int n10;
        block25: {
            block26: {
                block27: {
                    String string2;
                    n10 = 1;
                    n9 = object.v;
                    n8 = object.w;
                    if (n9 == -1) return -1;
                    if (n8 == -1) {
                        return -1;
                    }
                    string = string2 = ax.S0.a.e(object.o);
                    if (!"video/dolby-vision".equals(string2)) break block25;
                    if ((object = a0.j(object)) == null) break block26;
                    int n11 = (Integer)object.first;
                    if (n11 == 512 || n11 == 1 || n11 == 2) break block27;
                    if (n11 != 1024) break block26;
                    string = "video/av01";
                    break block25;
                }
                string = "video/avc";
                break block25;
            }
            string = "video/hevc";
        }
        string.getClass();
        int n12 = -1;
        switch (string.hashCode()) {
            case 1599127257: {
                if (!string.equals("video/x-vnd.on2.vp9")) break;
                n12 = 1;
                break;
            }
            case 1599127256: {
                if (!string.equals("video/x-vnd.on2.vp8")) break;
                n12 = 2;
                break;
            }
            case 1331836730: {
                if (!string.equals("video/avc")) break;
                n12 = 3;
                break;
            }
            case 1187890754: {
                if (!string.equals("video/mp4v-es")) break;
                n12 = 4;
                break;
            }
            case -1662541442: {
                if (!string.equals("video/hevc")) break;
                n12 = 5;
                break;
            }
            case -1662735862: {
                if (!string.equals("video/av01")) break;
                n12 = 6;
                break;
            }
            case -1664118616: {
                if (!string.equals("video/3gpp")) break;
                n12 = 7;
                break;
            }
        }
        switch (n12) {
            default: {
                n10 = -1;
                break;
            }
            case 1: {
                n10 = 6;
                break;
            }
            case 2: {
                n10 = 5;
                break;
            }
            case 3: {
                n10 = 4;
                break;
            }
            case 4: {
                n10 = 3;
                break;
            }
            case 5: {
                n10 = 2;
                break;
            }
            case 7: {
                n10 = 0;
                break;
            }
            case 6: 
        }
        switch (n10) {
            default: {
                return -1;
            }
            case 6: {
                return k.s2(n9 * n8, 4);
            }
            case 4: {
                object = Build.MODEL;
                if ("BRAVIA 4K 2015".equals(object)) return -1;
                if (!"Amazon".equals(Build.MANUFACTURER)) return k.s2(d0.k(n9, 16) * d0.k(n8, 16) * 256, 2);
                if ("KFSOWI".equals(object)) return -1;
                if (!"AFTS".equals(object)) return k.s2(d0.k(n9, 16) * d0.k(n8, 16) * 256, 2);
                if (!d8.g) return k.s2(d0.k(n9, 16) * d0.k(n8, 16) * 256, 2);
                return -1;
            }
            case 2: {
                return Math.max(0x200000, k.s2(n9 * n8, 2));
            }
            case 0: 
            case 1: 
            case 3: 
            case 5: 
        }
        return k.s2(n9 * n8, 2);
    }

    private static Point o2(ax.f1.D d8, v v8) {
        int n8 = v8.w;
        int n9 = v8.v;
        int n10 = 0;
        boolean bl = n8 > n9;
        int n11 = bl ? n8 : n9;
        if (bl) {
            n8 = n9;
        }
        float f8 = (float)n8 / (float)n11;
        int[] nArray = D2;
        int n12 = nArray.length;
        for (n9 = n10; n9 < n12; ++n9) {
            n10 = nArray[n9];
            int n13 = (int)((float)n10 * f8);
            if (n10 <= n11 || n13 <= n8) break;
            int n14 = bl ? n13 : n10;
            if (!bl) {
                n10 = n13;
            }
            Point point = d8.c(n14, n10);
            float f9 = v8.z;
            if (point == null || !d8.w(point.x, point.y, f9)) continue;
            return point;
        }
        return null;
    }

    private static List<ax.f1.D> q2(Context object, Q q8, v v8, boolean bl, boolean bl2) throws a0.c {
        String string = v8.o;
        if (string == null) {
            return ax.r7.z.z();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(string) && !c.a((Context)object) && !(object = a0.h(q8, v8, bl, bl2)).isEmpty()) {
            return object;
        }
        return a0.n(q8, v8, bl, bl2);
    }

    protected static int r2(ax.f1.D d8, v v8) {
        if (v8.p != -1) {
            int n8 = v8.r.size();
            int n9 = 0;
            for (int i8 = 0; i8 < n8; ++i8) {
                n9 += v8.r.get(i8).length;
            }
            return v8.p + n9;
        }
        return k.n2(d8, v8);
    }

    private static int s2(int n8, int n9) {
        return n8 * 3 / (n9 * 2);
    }

    private Surface u2(ax.f1.D d8) {
        Object object = this.Z1;
        if (object != null) {
            return object.j();
        }
        object = this.d2;
        if (object != null) {
            return object;
        }
        if (this.Y2(d8)) {
            return null;
        }
        ax.S0.a.g(this.Z2(d8));
        object = this.e2;
        if (object != null && ((o)((Object)object)).q != d8.g) {
            this.M2();
        }
        if (this.e2 == null) {
            this.e2 = o.c(this.K1, d8.g);
        }
        return this.e2;
    }

    private boolean v2(ax.f1.D d8) {
        Surface surface;
        return this.Z1 != null || (surface = this.d2) != null && surface.isValid() || this.Y2(d8) || this.Z2(d8);
        {
        }
    }

    private boolean w2(i i8) {
        return i8.g0 < this.O();
    }

    private boolean x2(i i8) {
        if (!this.n() && !i8.w()) {
            if (this.A2 == -9223372036854775807L) {
                return true;
            }
            long l8 = i8.g0;
            long l9 = this.P0();
            return this.A2 - (l8 - l9) <= 100000L;
        }
        return true;
    }

    private void z2() {
        if (this.k2 > 0) {
            long l8 = this.K().b();
            long l9 = this.j2;
            this.M1.n(this.k2, l8 - l9);
            this.k2 = 0;
            this.j2 = l8;
        }
    }

    @Override
    public void B(int n8, Object object) throws androidx.media3.exoplayer.s {
        block14: {
            block21: {
                block15: {
                    block16: {
                        block17: {
                            block18: {
                                block19: {
                                    block20: {
                                        int n9 = 1;
                                        if (n8 == 1) break block14;
                                        if (n8 == 7) break block15;
                                        if (n8 == 10) break block16;
                                        if (n8 == 4) break block17;
                                        if (n8 == 5) break block18;
                                        if (n8 == 13) break block19;
                                        if (n8 == 14) break block20;
                                        switch (n8) {
                                            default: {
                                                super.B(n8, object);
                                                return;
                                            }
                                            case 18: {
                                                Y y8 = this.n2;
                                                n8 = y8 != null && y8.d ? 1 : 0;
                                                this.n2 = object = (Y)object;
                                                if (object == null || !((Y)object).d) {
                                                    n9 = 0;
                                                }
                                                if (n8 != n9) {
                                                    this.T1();
                                                    return;
                                                }
                                                break block21;
                                            }
                                            case 17: {
                                                Surface surface = this.d2;
                                                this.Q2(null);
                                                ((k)ax.S0.a.e(object)).B(1, surface);
                                                return;
                                            }
                                            case 16: {
                                                this.u2 = (Integer)ax.S0.a.e(object);
                                                this.c3();
                                                return;
                                            }
                                        }
                                    }
                                    if (((I)(object = (I)ax.S0.a.e(object))).b() != 0 && ((I)object).a() != 0) {
                                        this.f2 = object;
                                        S s8 = this.Z1;
                                        if (s8 != null) {
                                            s8.t(ax.S0.a.i(this.d2), (I)object);
                                            return;
                                        }
                                    }
                                    break block21;
                                }
                                this.T2((List)ax.S0.a.e(object));
                                return;
                            }
                            this.i2 = n8 = ((Integer)ax.S0.a.e(object)).intValue();
                            object = this.Z1;
                            if (object != null) {
                                object.s(n8);
                                return;
                            }
                            this.P1.l(n8);
                            return;
                        }
                        this.h2 = (Integer)ax.S0.a.e(object);
                        object = this.E0();
                        if (object != null) {
                            object.n(this.h2);
                            return;
                        }
                        break block21;
                    }
                    n8 = (Integer)ax.S0.a.e(object);
                    if (this.w2 != n8) {
                        this.w2 = n8;
                        if (this.v2) {
                            this.w1();
                            return;
                        }
                    }
                    break block21;
                }
                this.y2 = object = (z)ax.S0.a.e(object);
                S s9 = this.Z1;
                if (s9 != null) {
                    s9.p((z)object);
                }
            }
            return;
        }
        this.Q2(object);
    }

    @Override
    public boolean E(long l8, long l9) {
        return this.W2(l8, l9);
    }

    @Override
    protected int F0(i i8) {
        Y y8;
        if (Build.VERSION.SDK_INT >= 34 && (this.V1 || (y8 = this.n2) != null && y8.h || this.v2) && this.w2(i8) && !this.x2(i8)) {
            return 32;
        }
        return 0;
    }

    @Override
    protected boolean I0() {
        return this.v2 && Build.VERSION.SDK_INT < 23;
    }

    @Override
    protected float J0(float f8, v v8, v[] object) {
        float f9;
        int n8 = ((v[])object).length;
        float f10 = -1.0f;
        for (int i8 = 0; i8 < n8; ++i8) {
            float f11 = object[i8].z;
            f9 = f10;
            if (f11 != -1.0f) {
                f9 = Math.max(f10, f11);
            }
            f10 = f9;
        }
        f8 = f10 == -1.0f ? -1.0f : f10 * f8;
        if (this.n2 != null && (object = this.G0()) != null) {
            f9 = f10 = ((ax.f1.D)object).h(v8.v, v8.w);
            if (f8 != -1.0f) {
                f9 = Math.max(f8, f10);
            }
            return f9;
        }
        return f8;
    }

    protected void J2(long l8) throws androidx.media3.exoplayer.s {
        this.W1(l8);
        this.C2(this.s2);
        b b8 = this.B1;
        ++b8.e;
        this.A2();
        this.n1(l8);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected boolean K1(i object) {
        boolean bl;
        boolean bl2;
        block10: {
            block9: {
                int n8;
                Object object2;
                boolean bl3;
                block11: {
                    block8: {
                        long l8;
                        bl2 = this.x2((i)object);
                        bl3 = false;
                        if (bl2) {
                            return false;
                        }
                        bl = this.w2((i)object);
                        object2 = this.T1;
                        n8 = object2 != null && (l8 = ((B)object2).c(((i)object).g0)) != -9223372036854775807L && l8 < this.S1 ? 1 : 0;
                        if (!bl && n8 == 0) {
                            return false;
                        }
                        if (((ax.V0.a)object).r()) {
                            return false;
                        }
                        if (!((ax.V0.a)object).x()) break block8;
                        ((i)object).p();
                        break block9;
                    }
                    bl2 = bl3;
                    if (this.R1 == null) break block10;
                    bl2 = bl3;
                    if (!ax.S0.a.e(this.G0()).b.equals("video/av01")) break block10;
                    object2 = ((i)object).e0;
                    bl2 = bl3;
                    if (object2 == null) break block10;
                    bl2 = bl || this.C2 <= 0;
                    object2 = ((ByteBuffer)object2).asReadOnlyBuffer();
                    ((ByteBuffer)object2).flip();
                    n8 = this.R1.d((ByteBuffer)object2, bl2);
                    if (n8 != 0) break block11;
                    ((i)object).p();
                    break block9;
                }
                bl2 = bl3;
                if (n8 == ((Buffer)object2).limit()) break block10;
                bl2 = bl3;
                if (ax.S0.a.e(this.W1).c + n8 >= ((Buffer)object2).capacity()) break block10;
                bl2 = bl3;
                if (((i)object).E()) break block10;
                ax.S0.a.e(((i)object).e0).position(n8);
            }
            bl2 = true;
        }
        if (bl2) {
            if (bl) {
                object = this.B1;
                ++((b)object).d;
                return bl2;
            }
            this.U1.add(((i)object).g0);
            ++this.C2;
        }
        return bl2;
    }

    @Override
    protected List<ax.f1.D> L0(Q q8, v v8, boolean bl) throws a0.c {
        return a0.o(k.q2(this.K1, q8, v8, bl, this.v2), v8);
    }

    @Override
    protected final boolean L1() {
        v v8 = this.H0();
        Y y8 = this.n2;
        if (y8 == null) {
            return super.L1();
        }
        return !y8.f || this.o2 || this.v2 || v8 != null && v8.q > 0 || this.V0() || this.N0() != -9223372036854775807L;
        {
        }
    }

    @Override
    protected boolean M1(ax.f1.D d8) {
        return this.v2(d8);
    }

    @Override
    protected x.a O0(ax.f1.D d8, v v8, MediaCrypto mediaCrypto, float f8) {
        e e8;
        String string = d8.c;
        this.W1 = e8 = this.p2(d8, v8, this.Q());
        boolean bl = this.O1;
        int n8 = this.v2 ? this.w2 : 0;
        string = this.t2(v8, string, e8, f8, bl, n8);
        e8 = this.u2(d8);
        this.F2((MediaFormat)string);
        return x.a.b(d8, (MediaFormat)string, v8, (Surface)e8, mediaCrypto);
    }

    @Override
    protected final boolean O1() {
        ax.f1.D d8 = this.G0();
        if (this.Z1 != null && d8 != null && (d8.a.equals("c2.mtk.avc.decoder") || d8.a.equals("c2.mtk.hevc.decoder"))) {
            return true;
        }
        return super.O1();
    }

    protected void O2(ax.f1.x object, int n8, long l8, long l9) {
        ax.S0.N.a("releaseOutputBuffer");
        object.i(n8, l9);
        ax.S0.N.b();
        object = this.B1;
        ++((b)object).e;
        this.l2 = 0;
        if (this.Z1 == null) {
            this.C2(this.s2);
            this.A2();
        }
    }

    @Override
    protected int R1(Q q8, v v8) throws a0.c {
        return k.b3(this.K1, q8, v8);
    }

    protected void S2(ax.f1.x x8, Surface surface) {
        x8.p(surface);
    }

    @Override
    @TargetApi(value=29)
    protected void T0(i object) throws androidx.media3.exoplayer.s {
        ByteBuffer byteBuffer;
        if (this.Y1 && (byteBuffer = ax.S0.a.e(((i)object).h0)).remaining() >= 7) {
            byte by = byteBuffer.get();
            short s8 = byteBuffer.getShort();
            short s9 = byteBuffer.getShort();
            byte by2 = byteBuffer.get();
            byte by3 = byteBuffer.get();
            byteBuffer.position(0);
            if (by == -75 && s8 == 60 && s9 == 1 && by2 == 4 && (by3 == 0 || by3 == 1)) {
                object = new byte[byteBuffer.remaining()];
                byteBuffer.get((byte[])object);
                byteBuffer.position(0);
                k.P2(ax.S0.a.e(this.E0()), (byte[])object);
            }
        }
    }

    public void T2(List<Object> object) {
        if (object.equals(ax.P0.Y.a)) {
            object = this.Z1;
            if (object != null && object.b()) {
                this.Z1.h();
                return;
            }
        } else {
            this.c2 = object;
            S s8 = this.Z1;
            if (s8 != null) {
                s8.w((List<Object>)object);
            }
        }
    }

    @Override
    protected void U() {
        this.t2 = null;
        this.A2 = -9223372036854775807L;
        this.G2();
        this.g2 = false;
        this.x2 = null;
        this.o2 = true;
        try {
            super.U();
            return;
        }
        finally {
            this.M1.m(this.B1);
            this.M1.t(ax.P0.a0.e);
        }
    }

    protected boolean U2(long l8, long l9, boolean bl) {
        return l8 < -500000L && !bl;
    }

    @Override
    protected void V(boolean bl, boolean bl2) throws androidx.media3.exoplayer.s {
        super.V(bl, bl2);
        boolean bl3 = this.L().b;
        bl = !bl3 || this.w2 != 0;
        ax.S0.a.g(bl);
        if (this.v2 != bl3) {
            this.v2 = bl3;
            this.w1();
        }
        this.M1.o(this.B1);
        if (!this.a2) {
            if (this.c2 != null && this.Z1 == null) {
                s s8 = this.h2(this.K1, this.P1);
                s8.S(1);
                this.Z1 = s8.F(0);
            }
            this.a2 = true;
        }
        if (this.Z1 != null) {
            this.g2();
            this.b2 = bl2 ^ 1;
            this.y0();
            return;
        }
        this.P1.m(this.K());
        this.P1.j(bl2 ^ 1);
    }

    protected boolean V2(long l8, long l9, boolean bl) {
        return l8 < -30000L && !bl;
    }

    @Override
    protected void W() {
        super.W();
    }

    protected boolean W2(long l8, long l9) {
        return l8 < -30000L && l9 > 100000L;
    }

    @Override
    protected void X(long l8, boolean bl) throws androidx.media3.exoplayer.s {
        Object object = this.Z1;
        if (object != null && !bl) {
            object.v(true);
        }
        super.X(l8, bl);
        if (this.Z1 == null) {
            this.P1.k();
        }
        if ((object = this.T1) != null) {
            ((B)object).d();
        }
        if (bl) {
            object = this.Z1;
            if (object != null) {
                object.x(false);
            } else {
                this.P1.e(false);
            }
        }
        this.G2();
        this.l2 = 0;
    }

    protected boolean X2() {
        return true;
    }

    @Override
    protected void Y() {
        super.Y();
        S s8 = this.Z1;
        if (s8 != null && this.L1) {
            s8.d();
        }
    }

    protected boolean Y2(ax.f1.D d8) {
        return Build.VERSION.SDK_INT >= 35 && d8.k;
    }

    protected boolean Z2(ax.f1.D d8) {
        return Build.VERSION.SDK_INT >= 23 && !this.v2 && !this.f2(d8.a) && (!d8.g || o.b(this.K1));
    }

    @Override
    protected void a0() {
        try {
            super.a0();
            return;
        }
        finally {
            this.a2 = false;
            this.z2 = -9223372036854775807L;
            this.M2();
        }
    }

    protected void a3(ax.f1.x object, int n8, long l8) {
        ax.S0.N.a("skipVideoBuffer");
        object.m(n8, false);
        ax.S0.N.b();
        object = this.B1;
        ++((b)object).f;
    }

    @Override
    protected void b0() {
        super.b0();
        this.k2 = 0;
        this.j2 = this.K().b();
        this.p2 = 0L;
        this.q2 = 0;
        S s8 = this.Z1;
        if (s8 != null) {
            s8.n();
            return;
        }
        this.P1.h();
    }

    @Override
    public boolean c() {
        S s8;
        return super.c() && ((s8 = this.Z1) == null || s8.c());
    }

    @Override
    protected void c0() {
        this.z2();
        this.B2();
        Object object = this.Z1;
        if (object != null) {
            object.l();
        } else {
            this.P1.i();
        }
        object = this.T1;
        if (object != null) {
            ((B)object).d();
        }
        super.c0();
    }

    @Override
    protected void d0(v[] object, long l8, long l9, F.b b8) throws androidx.media3.exoplayer.s {
        super.d0((v[])object, l8, l9, b8);
        this.f3(b8);
        object = this.T1;
        if (object != null) {
            ((B)object).d();
        }
    }

    protected void d3(int n8, int n9) {
        b b8 = this.B1;
        b8.h += n8;
        b8.g += (n8 += n9);
        this.k2 += n8;
        this.l2 = n8 = this.l2 + n8;
        b8.i = Math.max(n8, b8.i);
        n8 = this.N1;
        if (n8 > 0 && this.k2 >= n8) {
            this.z2();
        }
    }

    protected void e2(S s8, int n8, v v8, int n9) {
        List<Object> list = this.c2;
        if (list == null) {
            list = ax.r7.z.z();
        }
        s8.r(n8, v8, this.Q0(), n9, list);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected boolean f2(String string) {
        if (string.startsWith("OMX.google")) {
            return false;
        }
        synchronized (k.class) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (E2) break block4;
                        F2 = k.l2();
                        E2 = true;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return F2;
            }
            throw throwable2;
        }
    }

    @Override
    public boolean g(long l8, long l9, long l10, boolean bl, boolean bl2) throws androidx.media3.exoplayer.s {
        long l11 = l9;
        if (this.Z1 != null) {
            l11 = l9;
            if (this.L1) {
                l11 = l9 - this.m2();
            }
        }
        return this.U2(l8, l10, bl) && this.y2(l11, bl2);
    }

    @Override
    protected boolean g1(v v8) throws androidx.media3.exoplayer.s {
        S s8 = this.Z1;
        if (s8 != null && !s8.b()) {
            try {
                boolean bl = this.Z1.z(v8);
                return bl;
            }
            catch (S.c c8) {
                throw this.I(c8, v8, 7000);
            }
        }
        return true;
    }

    protected void g3(long l8) {
        this.B1.a(l8);
        this.p2 += l8;
        ++this.q2;
    }

    @Override
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override
    protected void h1(Exception exception) {
        u.d("MediaCodecVideoRenderer", "Video codec error", exception);
        this.M1.s(exception);
    }

    protected s h2(Context context, A a8) {
        return new s.b(context, a8).h(true).g(this.K()).f();
    }

    @Override
    public void i(long l8, long l9) throws androidx.media3.exoplayer.s {
        S s8 = this.Z1;
        if (s8 != null) {
            try {
                s8.i(l8, l9);
            }
            catch (S.c c8) {
                throw this.I(c8, c8.q, 7001);
            }
        }
        super.i(l8, l9);
    }

    @Override
    protected void i1(String string, x.a a8, long l8, long l9) {
        this.M1.k(string, l8, l9);
        this.X1 = this.f2(string);
        this.Y1 = ax.S0.a.e(this.G0()).r();
        this.G2();
    }

    protected void i2(ax.f1.x x8) {
        x8.g();
    }

    @Override
    public boolean isReady() {
        boolean bl = super.isReady();
        S s8 = this.Z1;
        if (s8 != null) {
            return s8.y(bl);
        }
        if (bl && (this.E0() == null || this.v2)) {
            return true;
        }
        return this.P1.d(bl);
    }

    @Override
    protected void j1(String string) {
        this.M1.l(string);
    }

    @Override
    protected ax.Y0.c k1(O object) throws androidx.media3.exoplayer.s {
        ax.Y0.c c8 = super.k1((O)object);
        this.M1.p(ax.S0.a.e(((O)object).b), c8);
        object = this.T1;
        if (object != null) {
            ((B)object).d();
        }
        return c8;
    }

    protected void k2(ax.f1.x x8, int n8, long l8) {
        ax.S0.N.a("dropVideoBuffer");
        x8.m(n8, false);
        ax.S0.N.b();
        this.d3(0, 1);
    }

    @Override
    protected ax.Y0.c l0(ax.f1.D object, v v8, v v9) {
        int n8;
        e e8;
        int n9;
        ax.Y0.c c8;
        block5: {
            block4: {
                c8 = ((ax.f1.D)object).e(v8, v9);
                n9 = c8.e;
                e8 = ax.S0.a.e(this.W1);
                if (v9.v > e8.a) break block4;
                n8 = n9;
                if (v9.w <= e8.b) break block5;
            }
            n8 = n9 | 0x100;
        }
        n9 = n8;
        if (k.r2((ax.f1.D)object, v9) > e8.c) {
            n9 = n8 | 0x40;
        }
        object = ((ax.f1.D)object).a;
        n8 = n9 != 0 ? 0 : c8.d;
        return new ax.Y0.c((String)object, v8, v9, n8, n9);
    }

    @Override
    protected void l1(v v8, MediaFormat object) {
        float f8;
        int n8;
        int n9;
        block9: {
            float f9;
            int n10;
            int n11;
            block8: {
                ax.f1.x x8 = this.E0();
                if (x8 != null) {
                    x8.n(this.h2);
                }
                if (this.v2) {
                    n11 = v8.v;
                    n10 = v8.w;
                } else {
                    ax.S0.a.e(object);
                    n11 = object.containsKey("crop-right") && object.containsKey("crop-left") && object.containsKey("crop-bottom") && object.containsKey("crop-top") ? 1 : 0;
                    n10 = n11 != 0 ? object.getInteger("crop-right") - object.getInteger("crop-left") + 1 : object.getInteger("width");
                    n11 = n11 != 0 ? object.getInteger("crop-bottom") - object.getInteger("crop-top") + 1 : object.getInteger("height");
                    n9 = n11;
                    n11 = n10;
                    n10 = n9;
                }
                f9 = v8.B;
                int n12 = v8.A;
                if (n12 == 90) break block8;
                n8 = n10;
                f8 = f9;
                n9 = n11;
                if (n12 != 270) break block9;
            }
            f8 = 1.0f / f9;
            n9 = n10;
            n8 = n11;
        }
        this.s2 = new ax.P0.a0(n9, n8, f8);
        object = this.Z1;
        if (object != null && this.B2) {
            this.e2((S)object, 1, v8.b().F0(n9).h0(n8).u0(f8).P(), this.b2);
            this.b2 = 2;
        } else {
            this.P1.n(v8.z);
        }
        this.B2 = false;
    }

    protected long m2() {
        return -this.z2;
    }

    @Override
    protected void n1(long l8) {
        super.n1(l8);
        if (!this.v2) {
            --this.m2;
        }
    }

    @Override
    protected void o1() {
        super.o1();
        S s8 = this.Z1;
        if (s8 != null) {
            s8.q();
            if (this.z2 == -9223372036854775807L) {
                this.z2 = this.Q0();
            }
            this.Z1.o(this.m2());
        } else {
            this.P1.j(2);
        }
        this.B2 = true;
        this.G2();
    }

    @Override
    public void p() {
        S s8 = this.Z1;
        if (s8 != null) {
            int n8 = this.b2;
            if (n8 != 0 && n8 != 1) {
                s8.A();
                return;
            }
            this.b2 = 0;
            return;
        }
        this.P1.a();
    }

    @Override
    protected void p1(i i8) throws androidx.media3.exoplayer.s {
        ByteBuffer byteBuffer;
        if (this.R1 != null && ax.S0.a.e(this.G0()).b.equals("video/av01") && (byteBuffer = i8.e0) != null) {
            this.R1.b(byteBuffer);
        }
        this.C2 = 0;
        int n8 = this.F0(i8);
        int n9 = Build.VERSION.SDK_INT;
        if (!(n9 >= 34 && (n8 & 0x20) != 0 || this.v2)) {
            ++this.m2;
        }
        if (n9 < 23 && this.v2) {
            this.J2(i8.g0);
        }
    }

    protected e p2(ax.f1.D object, v v8, v[] object2) {
        int n8;
        int n9;
        int n10 = v8.v;
        int n11 = v8.w;
        int n12 = k.r2((ax.f1.D)object, v8);
        if (((v[])object2).length == 1) {
            int n13 = n12;
            if (n12 != -1) {
                int n14 = k.n2((ax.f1.D)object, v8);
                n13 = n12;
                if (n14 != -1) {
                    n13 = Math.min((int)((float)n12 * 1.5f), n14);
                }
            }
            return new e(n10, n11, n13);
        }
        int n15 = ((v[])object2).length;
        int n16 = 0;
        int n17 = n11;
        for (n9 = 0; n9 < n15; ++n9) {
            v v9;
            v v10 = v9 = object2[n9];
            if (v8.E != null) {
                v10 = v9;
                if (v9.E == null) {
                    v10 = v9.b().V(v8.E).P();
                }
            }
            int n18 = n10;
            int n19 = n17;
            n8 = n12;
            n11 = n16;
            if (((ax.f1.D)object).e((v)v8, (v)v10).d != 0) {
                n8 = v10.v;
                n11 = n8 != -1 && v10.w != -1 ? 0 : 1;
                n11 = n16 | n11;
                n18 = Math.max(n10, n8);
                n19 = Math.max(n17, v10.w);
                n8 = Math.max(n12, k.r2((ax.f1.D)object, v10));
            }
            n10 = n18;
            n17 = n19;
            n12 = n8;
            n16 = n11;
        }
        n8 = n10;
        n11 = n17;
        n9 = n12;
        if (n16 != 0) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Resolutions unknown. Codec max resolution: ");
            ((StringBuilder)object2).append(n10);
            ((StringBuilder)object2).append("x");
            ((StringBuilder)object2).append(n17);
            u.h("MediaCodecVideoRenderer", ((StringBuilder)object2).toString());
            object2 = k.o2((ax.f1.D)object, v8);
            n8 = n10;
            n11 = n17;
            n9 = n12;
            if (object2 != null) {
                n8 = Math.max(n10, ((Point)object2).x);
                n11 = Math.max(n17, ((Point)object2).y);
                n9 = Math.max(n12, k.n2((ax.f1.D)object, v8.b().F0(n8).h0(n11).P()));
                object = new StringBuilder();
                ((StringBuilder)object).append("Codec max resolution adjusted to: ");
                ((StringBuilder)object).append(n8);
                ((StringBuilder)object).append("x");
                ((StringBuilder)object).append(n11);
                u.h("MediaCodecVideoRenderer", ((StringBuilder)object).toString());
            }
        }
        return new e(n8, n11, n9);
    }

    @Override
    protected ax.f1.B r0(Throwable throwable, ax.f1.D d8) {
        return new j(throwable, d8, this.d2);
    }

    @Override
    protected boolean s1(long l8, long l9, ax.f1.x x8, ByteBuffer object, int n8, int n9, int n10, long l10, boolean bl, boolean bl2, v v8) throws androidx.media3.exoplayer.s {
        ax.S0.a.e(x8);
        long l11 = l10 - this.P0();
        this.e3(l10);
        object = this.Z1;
        if (object != null) {
            if (bl && !bl2) {
                this.a3(x8, n8, l11);
                return true;
            }
            return object.k(l10, new S.b(){
                final ax.f1.x a;
                final int b;
                final long c;
                final k d;
                {
                    this.d = k8;
                    this.a = x8;
                    this.b = n8;
                    this.c = l8;
                }

                @Override
                public void a(long l8) {
                    this.d.N2(this.a, this.b, this.c, l8);
                }

                @Override
                public void b() {
                    this.d.a3(this.a, this.b, this.c);
                }
            });
        }
        n9 = this.P1.c(l10, l8, l9, this.Q0(), bl, bl2, this.Q1);
        object = this.T1;
        if (object != null && n9 != 5 && n9 != 4) {
            ((B)object).b(l10, this.Q1.f());
        }
        if (n9 != 0) {
            if (n9 != 1) {
                if (n9 != 2) {
                    if (n9 != 3) {
                        if (n9 != 4 && n9 != 5) {
                            throw new IllegalStateException(String.valueOf(n9));
                        }
                        return false;
                    }
                    this.a3(x8, n8, l11);
                    this.g3(this.Q1.f());
                    return true;
                }
                this.k2(x8, n8, l11);
                this.g3(this.Q1.f());
                return true;
            }
            this.L2(ax.S0.a.i(x8), n8, l11, v8);
            return true;
        }
        l8 = this.K().nanoTime();
        this.H2(l11, l8, v8);
        this.N2(x8, n8, l11, l8);
        this.g3(this.Q1.f());
        return true;
    }

    @SuppressLint(value={"InlinedApi"})
    protected MediaFormat t2(v pair, String string, e e8, float f8, boolean bl, int n8) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", string);
        mediaFormat.setInteger("width", pair.v);
        mediaFormat.setInteger("height", pair.w);
        x.e(mediaFormat, pair.r);
        x.c(mediaFormat, "frame-rate", pair.z);
        x.d(mediaFormat, "rotation-degrees", pair.A);
        x.b(mediaFormat, pair.E);
        if ("video/dolby-vision".equals(pair.o) && (pair = a0.j((v)pair)) != null) {
            x.d(mediaFormat, "profile", (Integer)pair.first);
        }
        mediaFormat.setInteger("max-width", e8.a);
        mediaFormat.setInteger("max-height", e8.b);
        x.d(mediaFormat, "max-input-size", e8.c);
        int n9 = Build.VERSION.SDK_INT;
        if (n9 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f8 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f8);
            }
        }
        if (bl) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (n8 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", n8);
        }
        if (n9 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.u2));
        }
        return mediaFormat;
    }

    @Override
    public void x(float f8, float f9) throws androidx.media3.exoplayer.s {
        super.x(f8, f9);
        Object object = this.Z1;
        if (object != null) {
            object.g(f8);
        } else {
            this.P1.p(f8);
        }
        object = this.T1;
        if (object != null) {
            ((B)object).e(f8);
        }
    }

    @Override
    protected void x1() {
        S s8 = this.Z1;
        if (s8 != null) {
            s8.q();
        }
    }

    @Override
    public boolean y(long l8, long l9, boolean bl) {
        return this.V2(l8, l9, bl);
    }

    protected boolean y2(long l8, boolean bl) throws androidx.media3.exoplayer.s {
        Object object;
        int n8 = this.h0(l8);
        if (n8 == 0) {
            return false;
        }
        if (bl) {
            object = this.B1;
            ((b)object).d = n8 = ((b)object).d + n8;
            ((b)object).f += this.m2;
            ((b)object).d = n8 + this.U1.size();
        } else {
            object = this.B1;
            ++((b)object).j;
            this.d3(n8 + this.U1.size(), this.m2);
        }
        this.B0();
        object = this.Z1;
        if (object != null) {
            object.v(false);
        }
        return true;
    }

    @Override
    protected void z1() {
        super.z1();
        this.U1.clear();
        this.m2 = 0;
        this.C2 = 0;
        this.o2 = false;
        a a8 = this.R1;
        if (a8 != null) {
            a8.c();
        }
    }

    private static final class c {
        public static boolean a(Context object) {
            if ((object = (object = (DisplayManager)object.getSystemService("display")) != null ? object.getDisplay(0) : null) != null && l.a((Display)object)) {
                object = n.a(m.a((Display)object));
                int n8 = ((Context)object).length;
                for (int i8 = 0; i8 < n8; ++i8) {
                    if (object[i8] != true) continue;
                    return true;
                }
            }
            return false;
        }
    }

    public static final class d {
        private final Context a;
        private boolean b;
        private Q c;
        private x.b d;
        private long e;
        private boolean f;
        private Handler g;
        private P h;
        private int i;
        private float j;
        private S k;
        private boolean l;
        private long m;
        private boolean n;

        public d(Context context) {
            this.a = context;
            this.c = Q.a;
            this.d = y.a(context);
            this.j = 30.0f;
            this.m = -9223372036854775807L;
        }

        public k n() {
            ax.S0.a.g(this.b ^ true);
            Handler handler = this.g;
            boolean bl = handler == null && this.h == null || handler != null && this.h != null;
            ax.S0.a.g(bl);
            this.b = true;
            return new k(this);
        }

        public d o(boolean bl) {
            this.n = bl;
            return this;
        }

        public d p(long l8) {
            this.m = l8;
            return this;
        }

        public d q(boolean bl) {
            this.l = bl;
            return this;
        }

        public d r(long l8) {
            this.e = l8;
            return this;
        }

        public d s(x.b b8) {
            this.d = b8;
            return this;
        }

        public d t(boolean bl) {
            this.f = bl;
            return this;
        }

        public d u(Handler handler) {
            this.g = handler;
            return this;
        }

        public d v(P p8) {
            this.h = p8;
            return this;
        }

        public d w(int n8) {
            this.i = n8;
            return this;
        }

        public d x(Q q8) {
            this.c = q8;
            return this;
        }
    }

    protected static final class e {
        public final int a;
        public final int b;
        public final int c;

        public e(int n8, int n9, int n10) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
        }
    }

    private final class f
    implements x.d,
    Handler.Callback {
        final k c0;
        private final Handler q;

        public f(k k8, ax.f1.x x8) {
            this.c0 = k8;
            k8 = d0.B(this);
            this.q = k8;
            x8.k(this, (Handler)k8);
        }

        private void b(long l8) {
            k k8 = this.c0;
            if (this == k8.x2 && k8.E0() != null) {
                if (l8 == Long.MAX_VALUE) {
                    this.c0.K2();
                    return;
                }
                try {
                    this.c0.J2(l8);
                    return;
                }
                catch (androidx.media3.exoplayer.s s8) {
                    this.c0.H1(s8);
                }
            }
        }

        @Override
        public void a(ax.f1.x x8, long l8, long l9) {
            if (Build.VERSION.SDK_INT < 30) {
                x8 = Message.obtain((Handler)this.q, (int)0, (int)((int)(l8 >> 32)), (int)((int)l8));
                this.q.sendMessageAtFrontOfQueue((Message)x8);
                return;
            }
            this.b(l8);
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            this.b(d0.C1(message.arg1, message.arg2));
            return true;
        }
    }
}

