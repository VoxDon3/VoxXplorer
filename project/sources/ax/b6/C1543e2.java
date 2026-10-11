package ax.b6;

import ax.b6.AbstractC1599k4;
import ax.b6.C1552f2;
import ax.b6.C1579i2;
import ax.b6.Z1;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.util.DesugarCollections;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* renamed from: ax.b6.e2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1543e2 extends AbstractC1599k4<C1543e2, a> implements W4 {
    private static final C1543e2 zzc;
    private static volatile InterfaceC1537d5<C1543e2> zzd;
    private long zzab;
    private int zzac;
    private boolean zzaf;
    private int zzai;
    private int zzaj;
    private int zzak;
    private long zzam;
    private long zzan;
    private int zzaq;
    private C1552f2 zzas;
    private long zzau;
    private long zzav;
    private int zzay;
    private boolean zzaz;
    private boolean zzbb;
    private C1525c2 zzbc;
    private long zzbg;
    private boolean zzbh;
    private boolean zzbj;
    private int zzbl;
    private W1 zzbn;
    private int zzbo;
    private U1 zzbp;
    private int zze;
    private int zzf;
    private int zzg;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzs;
    private long zzw;
    private long zzx;
    private boolean zzz;
    private InterfaceC1671t4<Z1> zzh = AbstractC1599k4.E();
    private InterfaceC1671t4<C1579i2> zzi = AbstractC1599k4.E();
    private String zzo = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzp = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzq = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzr = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzt = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzu = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzv = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzy = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzaa = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzad = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzae = HttpUrl.FRAGMENT_ENCODE_SET;
    private InterfaceC1671t4<X1> zzag = AbstractC1599k4.E();
    private String zzah = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzal = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzao = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzap = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzar = HttpUrl.FRAGMENT_ENCODE_SET;
    private InterfaceC1655r4 zzat = AbstractC1599k4.C();
    private String zzaw = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzax = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzba = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzbd = HttpUrl.FRAGMENT_ENCODE_SET;
    private InterfaceC1671t4<String> zzbe = AbstractC1599k4.E();
    private String zzbf = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzbi = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzbk = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzbm = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: ax.b6.e2$a */
    public static final class a extends AbstractC1599k4.b<C1543e2, a> implements W4 {
        private a() {
            super(C1543e2.zzc);
        }

        public final a A0(int i) {
            s();
            ((C1543e2) this.c0).U2(1);
            return this;
        }

        public final a B(int i, C1579i2 c1579i2) {
            s();
            ((C1543e2) this.c0).K(i, c1579i2);
            return this;
        }

        public final a B0(long j) {
            s();
            ((C1543e2) this.c0).F2(j);
            return this;
        }

        public final a C(long j) {
            s();
            ((C1543e2) this.c0).L(j);
            return this;
        }

        public final a C0(String str) {
            s();
            ((C1543e2) this.c0).K2(str);
            return this;
        }

        public final a D(U1 u1) {
            s();
            ((C1543e2) this.c0).M(u1);
            return this;
        }

        public final a D0() {
            s();
            ((C1543e2) this.c0).E1();
            return this;
        }

        public final a E(W1 w1) {
            s();
            ((C1543e2) this.c0).N(w1);
            return this;
        }

        public final a E0(int i) {
            s();
            ((C1543e2) this.c0).b3(i);
            return this;
        }

        public final a F(Z1.a aVar) {
            s();
            ((C1543e2) this.c0).O((Z1) ((AbstractC1599k4) aVar.q()));
            return this;
        }

        public final a G(C1552f2.b bVar) {
            s();
            ((C1543e2) this.c0).d0((C1552f2) ((AbstractC1599k4) bVar.q()));
            return this;
        }

        public final a G0(long j) {
            s();
            ((C1543e2) this.c0).N2(j);
            return this;
        }

        public final a H(C1579i2.a aVar) {
            s();
            ((C1543e2) this.c0).e0((C1579i2) ((AbstractC1599k4) aVar.q()));
            return this;
        }

        public final a H0(String str) {
            s();
            ((C1543e2) this.c0).S2(str);
            return this;
        }

        public final a I(C1579i2 c1579i2) {
            s();
            ((C1543e2) this.c0).e0(c1579i2);
            return this;
        }

        public final a I0() {
            s();
            ((C1543e2) this.c0).F1();
            return this;
        }

        public final a J(Iterable<? extends X1> iterable) {
            s();
            ((C1543e2) this.c0).f0(iterable);
            return this;
        }

        public final a J0(int i) {
            s();
            ((C1543e2) this.c0).i3(i);
            return this;
        }

        public final a K(String str) {
            s();
            ((C1543e2) this.c0).g0(str);
            return this;
        }

        public final a K0(long j) {
            s();
            ((C1543e2) this.c0).V2(j);
            return this;
        }

        public final a L(boolean z) {
            s();
            ((C1543e2) this.c0).h0(z);
            return this;
        }

        public final a L0(String str) {
            s();
            ((C1543e2) this.c0).Z2(null);
            return this;
        }

        public final List<Z1> M() {
            return DesugarCollections.unmodifiableList(((C1543e2) this.c0).z0());
        }

        public final a M0() {
            s();
            ((C1543e2) this.c0).G1();
            return this;
        }

        public final List<C1579i2> N() {
            return DesugarCollections.unmodifiableList(((C1543e2) this.c0).A0());
        }

        public final a N0(long j) {
            s();
            ((C1543e2) this.c0).c3(j);
            return this;
        }

        public final boolean O() {
            return ((C1543e2) this.c0).C0();
        }

        public final a O0(String str) {
            s();
            ((C1543e2) this.c0).g3(str);
            return this;
        }

        public final boolean P() {
            return ((C1543e2) this.c0).D0();
        }

        public final C1579i2 P0(int i) {
            return ((C1543e2) this.c0).K0(i);
        }

        public final boolean Q() {
            return ((C1543e2) this.c0).G0();
        }

        public final a Q0() {
            s();
            ((C1543e2) this.c0).H1();
            return this;
        }

        public final int R() {
            return ((C1543e2) this.c0).J0();
        }

        public final a R0(long j) {
            s();
            ((C1543e2) this.c0).j3(j);
            return this;
        }

        public final a S(int i) {
            s();
            ((C1543e2) this.c0).Q1(i);
            return this;
        }

        public final a S0(String str) {
            s();
            ((C1543e2) this.c0).n3(str);
            return this;
        }

        public final a T(long j) {
            s();
            ((C1543e2) this.c0).L0(j);
            return this;
        }

        public final a T0() {
            s();
            ((C1543e2) this.c0).I1();
            return this;
        }

        public final a U(Iterable<? extends Z1> iterable) {
            s();
            ((C1543e2) this.c0).S0(iterable);
            return this;
        }

        public final a U0(String str) {
            s();
            ((C1543e2) this.c0).q3(str);
            return this;
        }

        public final a V(String str) {
            s();
            ((C1543e2) this.c0).T0(str);
            return this;
        }

        public final a V0() {
            s();
            ((C1543e2) this.c0).J1();
            return this;
        }

        public final a W0(String str) {
            s();
            ((C1543e2) this.c0).t3(str);
            return this;
        }

        public final a X(boolean z) {
            s();
            ((C1543e2) this.c0).U0(z);
            return this;
        }

        public final a X0() {
            s();
            ((C1543e2) this.c0).K1();
            return this;
        }

        public final int Y() {
            return ((C1543e2) this.c0).d2();
        }

        public final a Y0(String str) {
            s();
            ((C1543e2) this.c0).w3(str);
            return this;
        }

        public final a Z(int i) {
            s();
            ((C1543e2) this.c0).e2(i);
            return this;
        }

        public final a Z0() {
            s();
            ((C1543e2) this.c0).L1();
            return this;
        }

        public final a a0(long j) {
            s();
            ((C1543e2) this.c0).t1(j);
            return this;
        }

        public final a a1(String str) {
            s();
            ((C1543e2) this.c0).z3(str);
            return this;
        }

        public final a b0(Iterable<? extends Integer> iterable) {
            s();
            ((C1543e2) this.c0).A1(iterable);
            return this;
        }

        public final a b1() {
            s();
            ((C1543e2) this.c0).M1();
            return this;
        }

        public final a c0(String str) {
            s();
            ((C1543e2) this.c0).B1(str);
            return this;
        }

        public final a c1(String str) {
            s();
            ((C1543e2) this.c0).C3(str);
            return this;
        }

        public final a d0(boolean z) {
            s();
            ((C1543e2) this.c0).C1(z);
            return this;
        }

        public final a d1() {
            s();
            ((C1543e2) this.c0).N1();
            return this;
        }

        public final int e0() {
            return ((C1543e2) this.c0).L2();
        }

        public final a e1(String str) {
            s();
            ((C1543e2) this.c0).F3(str);
            return this;
        }

        public final a f0(int i) {
            s();
            ((C1543e2) this.c0).o2(i);
            return this;
        }

        public final a f1() {
            s();
            ((C1543e2) this.c0).O1();
            return this;
        }

        public final a g0(long j) {
            s();
            ((C1543e2) this.c0).R1(j);
            return this;
        }

        public final a g1(String str) {
            s();
            ((C1543e2) this.c0).I3(str);
            return this;
        }

        public final a h0(Iterable<String> iterable) {
            s();
            ((C1543e2) this.c0).Y1(iterable);
            return this;
        }

        public final String h1() {
            return ((C1543e2) this.c0).P3();
        }

        public final a i0(String str) {
            s();
            ((C1543e2) this.c0).Z1(str);
            return this;
        }

        public final String i1() {
            return ((C1543e2) this.c0).i0();
        }

        public final a j0(boolean z) {
            s();
            ((C1543e2) this.c0).a2(z);
            return this;
        }

        public final String j1() {
            return ((C1543e2) this.c0).l0();
        }

        public final long k0() {
            return ((C1543e2) this.c0).o3();
        }

        public final String k1() {
            return ((C1543e2) this.c0).n0();
        }

        public final a l0(int i) {
            s();
            ((C1543e2) this.c0).w2(i);
            return this;
        }

        public final String l1() {
            return ((C1543e2) this.c0).r0();
        }

        public final a m0(long j) {
            s();
            ((C1543e2) this.c0).f2(j);
            return this;
        }

        public final String m1() {
            return ((C1543e2) this.c0).t0();
        }

        public final a n0(Iterable<? extends C1579i2> iterable) {
            s();
            ((C1543e2) this.c0).l2(iterable);
            return this;
        }

        public final String n1() {
            return ((C1543e2) this.c0).v0();
        }

        public final a p0(String str) {
            s();
            ((C1543e2) this.c0).m2(str);
            return this;
        }

        public final long q0() {
            return ((C1543e2) this.c0).A3();
        }

        public final a r0(int i) {
            s();
            ((C1543e2) this.c0).E2(i);
            return this;
        }

        public final a s0(long j) {
            s();
            ((C1543e2) this.c0).p2(j);
            return this;
        }

        public final a t0(String str) {
            s();
            ((C1543e2) this.c0).u2(str);
            return this;
        }

        public final U1 v0() {
            return ((C1543e2) this.c0).K3();
        }

        public final int w() {
            return ((C1543e2) this.c0).n();
        }

        public final a w0(int i) {
            s();
            ((C1543e2) this.c0).M2(i);
            return this;
        }

        public final Z1 x(int i) {
            return ((C1543e2) this.c0).I(i);
        }

        public final a x0(long j) {
            s();
            ((C1543e2) this.c0).x2(j);
            return this;
        }

        public final a y(int i, Z1.a aVar) {
            s();
            ((C1543e2) this.c0).J(i, (Z1) ((AbstractC1599k4) aVar.q()));
            return this;
        }

        public final a y0(String str) {
            s();
            ((C1543e2) this.c0).C2(str);
            return this;
        }

        public final a z(int i, Z1 z1) {
            s();
            ((C1543e2) this.c0).J(i, z1);
            return this;
        }

        public final a z0() {
            s();
            ((C1543e2) this.c0).D1();
            return this;
        }

        /* synthetic */ a(C1597k2 c1597k2) {
            this();
        }
    }

    static {
        C1543e2 c1543e2 = new C1543e2();
        zzc = c1543e2;
        AbstractC1599k4.w(C1543e2.class, c1543e2);
    }

    private C1543e2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A1(Iterable<? extends Integer> iterable) {
        InterfaceC1655r4 interfaceC1655r4 = this.zzat;
        if (!interfaceC1655r4.c()) {
            int size = interfaceC1655r4.size();
            this.zzat = interfaceC1655r4.d(size == 0 ? 10 : size << 1);
        }
        AbstractC1647q3.g(iterable, this.zzat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B1(String str) {
        str.getClass();
        this.zze |= 262144;
        this.zzaa = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C1(boolean z) {
        this.zze |= 131072;
        this.zzz = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C2(String str) {
        str.getClass();
        this.zzf |= 128;
        this.zzax = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C3(String str) {
        str.getClass();
        this.zze |= 65536;
        this.zzy = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D1() {
        this.zze &= -262145;
        this.zzaa = zzc.zzaa;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E1() {
        this.zzag = AbstractC1599k4.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E2(int i) {
        this.zze |= 1048576;
        this.zzac = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F1() {
        this.zze &= -257;
        this.zzq = zzc.zzq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F2(long j) {
        this.zze |= 16;
        this.zzm = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F3(String str) {
        str.getClass();
        this.zzf |= 8192;
        this.zzbd = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G1() {
        this.zze &= SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.zzao = zzc.zzao;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H1() {
        this.zzh = AbstractC1599k4.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I1() {
        this.zze &= -2097153;
        this.zzad = zzc.zzad;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I3(String str) {
        str.getClass();
        this.zze |= 512;
        this.zzr = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(int i, Z1 z1) {
        z1.getClass();
        b2();
        this.zzh.set(i, z1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J1() {
        this.zze &= -131073;
        this.zzz = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(int i, C1579i2 c1579i2) {
        c1579i2.getClass();
        c2();
        this.zzi.set(i, c1579i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K1() {
        this.zze &= -33;
        this.zzn = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K2(String str) {
        str.getClass();
        this.zzf |= 524288;
        this.zzbk = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(long j) {
        this.zzf |= 32;
        this.zzav = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L0(long j) {
        this.zze |= 536870912;
        this.zzam = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L1() {
        this.zze &= -17;
        this.zzm = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(U1 u1) {
        u1.getClass();
        this.zzbp = u1;
        this.zzf |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M1() {
        this.zze &= -65537;
        this.zzy = zzc.zzy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M2(int i) {
        this.zzf |= 8388608;
        this.zzbo = i;
    }

    public static a M3() {
        return zzc.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(W1 w1) {
        w1.getClass();
        this.zzbn = w1;
        this.zzf |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N1() {
        this.zzf &= -8193;
        this.zzbd = zzc.zzbd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N2(long j) {
        this.zze |= 4;
        this.zzk = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(Z1 z1) {
        z1.getClass();
        b2();
        this.zzh.add(z1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O1() {
        this.zze &= -268435457;
        this.zzal = zzc.zzal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q1(int i) {
        b2();
        this.zzh.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R1(long j) {
        this.zzf |= 16;
        this.zzau = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0(Iterable<? extends Z1> iterable) {
        b2();
        AbstractC1647q3.g(iterable, this.zzh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S2(String str) {
        str.getClass();
        this.zze |= 256;
        this.zzq = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T0(String str) {
        str.getClass();
        this.zze |= 4096;
        this.zzu = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U0(boolean z) {
        this.zzf |= 262144;
        this.zzbj = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U2(int i) {
        this.zze |= 1;
        this.zzg = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V2(long j) {
        this.zzf |= 32768;
        this.zzbg = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y1(Iterable<String> iterable) {
        InterfaceC1671t4<String> interfaceC1671t4 = this.zzbe;
        if (!interfaceC1671t4.c()) {
            this.zzbe = AbstractC1599k4.s(interfaceC1671t4);
        }
        AbstractC1647q3.g(iterable, this.zzbe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z1(String str) {
        str.getClass();
        this.zze |= 2048;
        this.zzt = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z2(String str) {
        str.getClass();
        this.zze |= Integer.MIN_VALUE;
        this.zzao = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2(boolean z) {
        this.zze |= 8388608;
        this.zzaf = z;
    }

    private final void b2() {
        InterfaceC1671t4<Z1> interfaceC1671t4 = this.zzh;
        if (interfaceC1671t4.c()) {
            return;
        }
        this.zzh = AbstractC1599k4.s(interfaceC1671t4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b3(int i) {
        this.zzf |= 2;
        this.zzaq = i;
    }

    private final void c2() {
        InterfaceC1671t4<C1579i2> interfaceC1671t4 = this.zzi;
        if (interfaceC1671t4.c()) {
            return;
        }
        this.zzi = AbstractC1599k4.s(interfaceC1671t4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c3(long j) {
        this.zze |= 2;
        this.zzj = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(C1552f2 c1552f2) {
        c1552f2.getClass();
        this.zzas = c1552f2;
        this.zzf |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0(C1579i2 c1579i2) {
        c1579i2.getClass();
        c2();
        this.zzi.add(c1579i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e2(int i) {
        c2();
        this.zzi.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(Iterable<? extends X1> iterable) {
        InterfaceC1671t4<X1> interfaceC1671t4 = this.zzag;
        if (!interfaceC1671t4.c()) {
            this.zzag = AbstractC1599k4.s(interfaceC1671t4);
        }
        AbstractC1647q3.g(iterable, this.zzag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f2(long j) {
        this.zze |= 8;
        this.zzl = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(String str) {
        str.getClass();
        this.zzf |= 4;
        this.zzar = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g3(String str) {
        str.getClass();
        this.zzf |= Http2.INITIAL_MAX_FRAME_SIZE;
        this.zzbf = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0(boolean z) {
        this.zzf |= 65536;
        this.zzbh = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i3(int i) {
        this.zze |= 1024;
        this.zzs = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j3(long j) {
        this.zze |= 32768;
        this.zzx = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l2(Iterable<? extends C1579i2> iterable) {
        c2();
        AbstractC1647q3.g(iterable, this.zzi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m2(String str) {
        str.getClass();
        this.zze |= 8192;
        this.zzv = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n3(String str) {
        str.getClass();
        this.zze |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        this.zzah = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o2(int i) {
        this.zzf |= 1048576;
        this.zzbl = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p2(long j) {
        this.zze |= Http2.INITIAL_MAX_FRAME_SIZE;
        this.zzw = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q3(String str) {
        str.getClass();
        this.zze |= 4194304;
        this.zzae = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t1(long j) {
        this.zze |= 524288;
        this.zzab = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t3(String str) {
        str.getClass();
        this.zze |= 2097152;
        this.zzad = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u2(String str) {
        str.getClass();
        this.zzf |= 131072;
        this.zzbi = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w2(int i) {
        this.zze |= 33554432;
        this.zzai = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w3(String str) {
        str.getClass();
        this.zze |= 128;
        this.zzp = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x2(long j) {
        this.zze |= 32;
        this.zzn = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z3(String str) {
        str.getClass();
        this.zze |= 64;
        this.zzo = str;
    }

    public final List<C1579i2> A0() {
        return this.zzi;
    }

    public final long A3() {
        return this.zzk;
    }

    public final boolean B0() {
        return this.zzbh;
    }

    public final boolean C0() {
        return this.zzbj;
    }

    public final boolean D0() {
        return this.zzz;
    }

    public final int D2() {
        return this.zzs;
    }

    public final long D3() {
        return this.zzbg;
    }

    public final boolean E0() {
        return this.zzaf;
    }

    public final boolean G0() {
        return (this.zzf & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0;
    }

    public final long G3() {
        return this.zzj;
    }

    public final boolean H0() {
        return (this.zze & 33554432) != 0;
    }

    public final Z1 I(int i) {
        return this.zzh.get(i);
    }

    public final boolean I0() {
        return (this.zzf & 4194304) != 0;
    }

    public final int J0() {
        return this.zzai;
    }

    public final long J3() {
        return this.zzx;
    }

    public final C1579i2 K0(int i) {
        return this.zzi.get(i);
    }

    public final U1 K3() {
        U1 u1 = this.zzbp;
        return u1 == null ? U1.d0() : u1;
    }

    public final int L2() {
        return this.zzi.size();
    }

    public final W1 L3() {
        W1 w1 = this.zzbn;
        return w1 == null ? W1.O() : w1;
    }

    public final String O3() {
        return this.zzar;
    }

    public final int P1() {
        return this.zzbo;
    }

    public final String P3() {
        return this.zzu;
    }

    public final long T2() {
        return this.zzam;
    }

    public final boolean V0() {
        return (this.zze & 1048576) != 0;
    }

    public final boolean W0() {
        return (this.zze & 536870912) != 0;
    }

    public final boolean X0() {
        return (this.zzf & 131072) != 0;
    }

    public final boolean Y0() {
        return (this.zzf & 128) != 0;
    }

    public final boolean Z0() {
        return (this.zzf & 524288) != 0;
    }

    public final boolean a1() {
        return (this.zzf & 8388608) != 0;
    }

    public final long a3() {
        return this.zzab;
    }

    public final boolean b1() {
        return (this.zze & 524288) != 0;
    }

    public final boolean c1() {
        return (this.zzf & 16) != 0;
    }

    public final boolean d1() {
        return (this.zze & 8) != 0;
    }

    public final int d2() {
        return this.zzh.size();
    }

    public final boolean e1() {
        return (this.zze & Http2.INITIAL_MAX_FRAME_SIZE) != 0;
    }

    public final boolean f1() {
        return (this.zzf & 262144) != 0;
    }

    public final boolean g1() {
        return (this.zze & 131072) != 0;
    }

    public final boolean h1() {
        return (this.zze & 32) != 0;
    }

    public final long h3() {
        return this.zzau;
    }

    public final String i0() {
        return this.zzaa;
    }

    public final boolean i1() {
        return (this.zze & 16) != 0;
    }

    public final String j0() {
        return this.zzt;
    }

    public final boolean j1() {
        return (this.zze & 1) != 0;
    }

    public final String k0() {
        return this.zzv;
    }

    public final boolean k1() {
        return (this.zzf & 2) != 0;
    }

    public final String l0() {
        return this.zzbi;
    }

    public final boolean l1() {
        return (this.zze & 8388608) != 0;
    }

    public final String m0() {
        return this.zzax;
    }

    public final boolean m1() {
        return (this.zzf & 8192) != 0;
    }

    public final int n() {
        return this.zzbl;
    }

    public final String n0() {
        return this.zzbk;
    }

    public final boolean n1() {
        return (this.zze & 4) != 0;
    }

    public final int n2() {
        return this.zzg;
    }

    public final String o0() {
        return this.zzq;
    }

    public final boolean o1() {
        return (this.zzf & 32768) != 0;
    }

    public final long o3() {
        return this.zzl;
    }

    public final String p0() {
        return this.zzao;
    }

    public final boolean p1() {
        return (this.zze & 1024) != 0;
    }

    public final String q0() {
        return this.zzah;
    }

    public final boolean q1() {
        return (this.zze & 2) != 0;
    }

    public final String r0() {
        return this.zzae;
    }

    public final boolean r1() {
        return (this.zze & 32768) != 0;
    }

    public final long r3() {
        return this.zzw;
    }

    public final String s0() {
        return this.zzad;
    }

    public final int s1() {
        return this.zzac;
    }

    @Override // ax.b6.AbstractC1599k4
    protected final Object t(int i, Object obj, Object obj2) {
        InterfaceC1537d5 interfaceC1537d5;
        C1597k2 c1597k2 = null;
        switch (C1597k2.a[i - 1]) {
            case 1:
                return new C1543e2();
            case 2:
                return new a(c1597k2);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001>\u0000\u0002\u0001O>\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8", new Object[]{"zze", "zzf", "zzg", "zzh", Z1.class, "zzi", C1579i2.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzm", "zzaf", "zzag", X1.class, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", "zzaw", "zzax", "zzay", EnumC1588j2.h(), "zzaz", "zzba", "zzbb", "zzbc", "zzbd", "zzbe", "zzbf", "zzbg", "zzbh", "zzbi", "zzbj", "zzbk", "zzbl", "zzbm", "zzbn", "zzbo", "zzbp"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<C1543e2> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (C1543e2.class) {
                    try {
                        interfaceC1537d5 = zzd;
                        if (interfaceC1537d5 == null) {
                            interfaceC1537d5 = new AbstractC1599k4.a(zzc);
                            zzd = interfaceC1537d5;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return interfaceC1537d5;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final String t0() {
        return this.zzp;
    }

    public final String u0() {
        return this.zzo;
    }

    public final long u3() {
        return this.zzn;
    }

    public final String v0() {
        return this.zzy;
    }

    public final int v2() {
        return this.zzaq;
    }

    public final String w0() {
        return this.zzbd;
    }

    public final String x0() {
        return this.zzr;
    }

    public final long x3() {
        return this.zzm;
    }

    public final List<X1> y0() {
        return this.zzag;
    }

    public final List<Z1> z0() {
        return this.zzh;
    }
}
