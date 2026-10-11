/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.U1;
import ax.b6.W1;
import ax.b6.W4;
import ax.b6.X1;
import ax.b6.Z1;
import ax.b6.c2;
import ax.b6.d5;
import ax.b6.f2;
import ax.b6.i2;
import ax.b6.j2;
import ax.b6.k2;
import ax.b6.k4;
import ax.b6.q3;
import ax.b6.r4;
import ax.b6.t4;
import java.util.List;

public final class e2
extends k4<e2, a>
implements W4 {
    private static final e2 zzc;
    private static volatile d5<e2> zzd;
    private String zzaa = "";
    private long zzab;
    private int zzac;
    private String zzad = "";
    private String zzae = "";
    private boolean zzaf;
    private t4<X1> zzag;
    private String zzah = "";
    private int zzai;
    private int zzaj;
    private int zzak;
    private String zzal = "";
    private long zzam;
    private long zzan;
    private String zzao = "";
    private String zzap = "";
    private int zzaq;
    private String zzar = "";
    private f2 zzas;
    private r4 zzat;
    private long zzau;
    private long zzav;
    private String zzaw = "";
    private String zzax = "";
    private int zzay;
    private boolean zzaz;
    private String zzba = "";
    private boolean zzbb;
    private c2 zzbc;
    private String zzbd = "";
    private t4<String> zzbe;
    private String zzbf = "";
    private long zzbg;
    private boolean zzbh;
    private String zzbi = "";
    private boolean zzbj;
    private String zzbk = "";
    private int zzbl;
    private String zzbm = "";
    private W1 zzbn;
    private int zzbo;
    private U1 zzbp;
    private int zze;
    private int zzf;
    private int zzg;
    private t4<Z1> zzh = k4.E();
    private t4<i2> zzi = k4.E();
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private int zzs;
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private long zzw;
    private long zzx;
    private String zzy = "";
    private boolean zzz;

    static {
        e2 e22;
        zzc = e22 = new e2();
        k4.w(e2.class, e22);
    }

    private e2() {
        this.zzag = k4.E();
        this.zzat = k4.C();
        this.zzbe = k4.E();
    }

    private final void A1(Iterable<? extends Integer> iterable) {
        r4 r42 = this.zzat;
        if (!r42.c()) {
            int n8 = r42.size();
            n8 = n8 == 0 ? 10 : (n8 <<= 1);
            this.zzat = r42.o(n8);
        }
        q3.g(iterable, this.zzat);
    }

    private final void B1(String string) {
        string.getClass();
        this.zze |= 0x40000;
        this.zzaa = string;
    }

    private final void C1(boolean bl) {
        this.zze |= 0x20000;
        this.zzz = bl;
    }

    private final void C2(String string) {
        string.getClass();
        this.zzf |= 0x80;
        this.zzax = string;
    }

    private final void C3(String string) {
        string.getClass();
        this.zze |= 0x10000;
        this.zzy = string;
    }

    private final void D1() {
        this.zze &= 0xFFFBFFFF;
        this.zzaa = e2.zzc.zzaa;
    }

    private final void E1() {
        this.zzag = k4.E();
    }

    private final void E2(int n8) {
        this.zze |= 0x100000;
        this.zzac = n8;
    }

    private final void F1() {
        this.zze &= 0xFFFFFEFF;
        this.zzq = e2.zzc.zzq;
    }

    private final void F2(long l8) {
        this.zze |= 0x10;
        this.zzm = l8;
    }

    private final void F3(String string) {
        string.getClass();
        this.zzf |= 0x2000;
        this.zzbd = string;
    }

    private final void G1() {
        this.zze &= Integer.MAX_VALUE;
        this.zzao = e2.zzc.zzao;
    }

    private final void H1() {
        this.zzh = k4.E();
    }

    private final void I1() {
        this.zze &= 0xFFDFFFFF;
        this.zzad = e2.zzc.zzad;
    }

    private final void I3(String string) {
        string.getClass();
        this.zze |= 0x200;
        this.zzr = string;
    }

    private final void J(int n8, Z1 z12) {
        z12.getClass();
        this.b2();
        this.zzh.set(n8, z12);
    }

    private final void J1() {
        this.zze &= 0xFFFDFFFF;
        this.zzz = false;
    }

    private final void K(int n8, i2 i22) {
        i22.getClass();
        this.c2();
        this.zzi.set(n8, i22);
    }

    private final void K1() {
        this.zze &= 0xFFFFFFDF;
        this.zzn = 0L;
    }

    private final void K2(String string) {
        string.getClass();
        this.zzf |= 0x80000;
        this.zzbk = string;
    }

    private final void L(long l8) {
        this.zzf |= 0x20;
        this.zzav = l8;
    }

    private final void L0(long l8) {
        this.zze |= 0x20000000;
        this.zzam = l8;
    }

    private final void L1() {
        this.zze &= 0xFFFFFFEF;
        this.zzm = 0L;
    }

    private final void M(U1 u12) {
        u12.getClass();
        this.zzbp = u12;
        this.zzf |= 0x1000000;
    }

    private final void M1() {
        this.zze &= 0xFFFEFFFF;
        this.zzy = e2.zzc.zzy;
    }

    private final void M2(int n8) {
        this.zzf |= 0x800000;
        this.zzbo = n8;
    }

    public static a M3() {
        return (a)zzc.z();
    }

    private final void N(W1 w12) {
        w12.getClass();
        this.zzbn = w12;
        this.zzf |= 0x400000;
    }

    private final void N1() {
        this.zzf &= 0xFFFFDFFF;
        this.zzbd = e2.zzc.zzbd;
    }

    private final void N2(long l8) {
        this.zze |= 4;
        this.zzk = l8;
    }

    private final void O(Z1 z12) {
        z12.getClass();
        this.b2();
        this.zzh.add(z12);
    }

    private final void O1() {
        this.zze &= 0xEFFFFFFF;
        this.zzal = e2.zzc.zzal;
    }

    private final void Q1(int n8) {
        this.b2();
        this.zzh.remove(n8);
    }

    private final void R1(long l8) {
        this.zzf |= 0x10;
        this.zzau = l8;
    }

    private final void S0(Iterable<? extends Z1> iterable) {
        this.b2();
        q3.g(iterable, this.zzh);
    }

    private final void S2(String string) {
        string.getClass();
        this.zze |= 0x100;
        this.zzq = string;
    }

    private final void T0(String string) {
        string.getClass();
        this.zze |= 0x1000;
        this.zzu = string;
    }

    private final void U0(boolean bl) {
        this.zzf |= 0x40000;
        this.zzbj = bl;
    }

    private final void U2(int n8) {
        this.zze |= 1;
        this.zzg = 1;
    }

    private final void V2(long l8) {
        this.zzf |= 0x8000;
        this.zzbg = l8;
    }

    private final void Y1(Iterable<String> iterable) {
        t4<String> t42 = this.zzbe;
        if (!t42.c()) {
            this.zzbe = k4.s(t42);
        }
        q3.g(iterable, this.zzbe);
    }

    private final void Z1(String string) {
        string.getClass();
        this.zze |= 0x800;
        this.zzt = string;
    }

    private final void Z2(String string) {
        string.getClass();
        this.zze |= Integer.MIN_VALUE;
        this.zzao = string;
    }

    private final void a2(boolean bl) {
        this.zze |= 0x800000;
        this.zzaf = bl;
    }

    private final void b2() {
        t4<Z1> t42 = this.zzh;
        if (!t42.c()) {
            this.zzh = k4.s(t42);
        }
    }

    private final void b3(int n8) {
        this.zzf |= 2;
        this.zzaq = n8;
    }

    private final void c2() {
        t4<i2> t42 = this.zzi;
        if (!t42.c()) {
            this.zzi = k4.s(t42);
        }
    }

    private final void c3(long l8) {
        this.zze |= 2;
        this.zzj = l8;
    }

    private final void d0(f2 f22) {
        f22.getClass();
        this.zzas = f22;
        this.zzf |= 8;
    }

    private final void e0(i2 i22) {
        i22.getClass();
        this.c2();
        this.zzi.add(i22);
    }

    private final void e2(int n8) {
        this.c2();
        this.zzi.remove(n8);
    }

    private final void f0(Iterable<? extends X1> iterable) {
        t4<X1> t42 = this.zzag;
        if (!t42.c()) {
            this.zzag = k4.s(t42);
        }
        q3.g(iterable, this.zzag);
    }

    private final void f2(long l8) {
        this.zze |= 8;
        this.zzl = l8;
    }

    private final void g0(String string) {
        string.getClass();
        this.zzf |= 4;
        this.zzar = string;
    }

    private final void g3(String string) {
        string.getClass();
        this.zzf |= 0x4000;
        this.zzbf = string;
    }

    private final void h0(boolean bl) {
        this.zzf |= 0x10000;
        this.zzbh = bl;
    }

    private final void i3(int n8) {
        this.zze |= 0x400;
        this.zzs = n8;
    }

    private final void j3(long l8) {
        this.zze |= 0x8000;
        this.zzx = l8;
    }

    private final void l2(Iterable<? extends i2> iterable) {
        this.c2();
        q3.g(iterable, this.zzi);
    }

    private final void m2(String string) {
        string.getClass();
        this.zze |= 0x2000;
        this.zzv = string;
    }

    private final void n3(String string) {
        string.getClass();
        this.zze |= 0x1000000;
        this.zzah = string;
    }

    private final void o2(int n8) {
        this.zzf |= 0x100000;
        this.zzbl = n8;
    }

    private final void p2(long l8) {
        this.zze |= 0x4000;
        this.zzw = l8;
    }

    private final void q3(String string) {
        string.getClass();
        this.zze |= 0x400000;
        this.zzae = string;
    }

    private final void t1(long l8) {
        this.zze |= 0x80000;
        this.zzab = l8;
    }

    private final void t3(String string) {
        string.getClass();
        this.zze |= 0x200000;
        this.zzad = string;
    }

    private final void u2(String string) {
        string.getClass();
        this.zzf |= 0x20000;
        this.zzbi = string;
    }

    private final void w2(int n8) {
        this.zze |= 0x2000000;
        this.zzai = n8;
    }

    private final void w3(String string) {
        string.getClass();
        this.zze |= 0x80;
        this.zzp = string;
    }

    private final void x2(long l8) {
        this.zze |= 0x20;
        this.zzn = l8;
    }

    private final void z3(String string) {
        string.getClass();
        this.zze |= 0x40;
        this.zzo = string;
    }

    public final List<i2> A0() {
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
        return (this.zzf & 0x1000000) != 0;
    }

    public final long G3() {
        return this.zzj;
    }

    public final boolean H0() {
        return (this.zze & 0x2000000) != 0;
    }

    public final Z1 I(int n8) {
        return (Z1)this.zzh.get(n8);
    }

    public final boolean I0() {
        return (this.zzf & 0x400000) != 0;
    }

    public final int J0() {
        return this.zzai;
    }

    public final long J3() {
        return this.zzx;
    }

    public final i2 K0(int n8) {
        return (i2)this.zzi.get(n8);
    }

    public final U1 K3() {
        U1 u12;
        U1 u13 = u12 = this.zzbp;
        if (u12 == null) {
            u13 = U1.d0();
        }
        return u13;
    }

    public final int L2() {
        return this.zzi.size();
    }

    public final W1 L3() {
        W1 w12;
        W1 w13 = w12 = this.zzbn;
        if (w12 == null) {
            w13 = W1.O();
        }
        return w13;
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
        return (this.zze & 0x100000) != 0;
    }

    public final boolean W0() {
        return (this.zze & 0x20000000) != 0;
    }

    public final boolean X0() {
        return (this.zzf & 0x20000) != 0;
    }

    public final boolean Y0() {
        return (this.zzf & 0x80) != 0;
    }

    public final boolean Z0() {
        return (this.zzf & 0x80000) != 0;
    }

    public final boolean a1() {
        return (this.zzf & 0x800000) != 0;
    }

    public final long a3() {
        return this.zzab;
    }

    public final boolean b1() {
        return (this.zze & 0x80000) != 0;
    }

    public final boolean c1() {
        return (this.zzf & 0x10) != 0;
    }

    public final boolean d1() {
        return (this.zze & 8) != 0;
    }

    public final int d2() {
        return this.zzh.size();
    }

    public final boolean e1() {
        return (this.zze & 0x4000) != 0;
    }

    public final boolean f1() {
        return (this.zzf & 0x40000) != 0;
    }

    public final boolean g1() {
        return (this.zze & 0x20000) != 0;
    }

    public final boolean h1() {
        return (this.zze & 0x20) != 0;
    }

    public final long h3() {
        return this.zzau;
    }

    public final String i0() {
        return this.zzaa;
    }

    public final boolean i1() {
        return (this.zze & 0x10) != 0;
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
        return (this.zze & 0x800000) != 0;
    }

    public final String m0() {
        return this.zzax;
    }

    public final boolean m1() {
        return (this.zzf & 0x2000) != 0;
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
        return (this.zzf & 0x8000) != 0;
    }

    public final long o3() {
        return this.zzl;
    }

    public final String p0() {
        return this.zzao;
    }

    public final boolean p1() {
        return (this.zze & 0x400) != 0;
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
        return (this.zze & 0x8000) != 0;
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object t(int n8, Object a8, Object d52) {
        switch (k2.a[n8 - 1]) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 7: {
                return null;
            }
            case 6: {
                return (byte)1;
            }
            case 5: {
                a8 = zzd;
                if (a8 != null) {
                    return a8;
                }
                synchronized (e2.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<e2>(zzc);
                            zzd = a8;
                        }
                        return a8;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return zzc;
            }
            case 3: {
                a8 = j2.h();
                return k4.u(zzc, "\u0001>\u0000\u0002\u0001O>\u0000\u0005\u0000\u0001\u1004\u0000\u0002\u001b\u0003\u001b\u0004\u1002\u0001\u0005\u1002\u0002\u0006\u1002\u0003\u0007\u1002\u0005\b\u1008\u0006\t\u1008\u0007\n\u1008\b\u000b\u1008\t\f\u1004\n\r\u1008\u000b\u000e\u1008\f\u0010\u1008\r\u0011\u1002\u000e\u0012\u1002\u000f\u0013\u1008\u0010\u0014\u1007\u0011\u0015\u1008\u0012\u0016\u1002\u0013\u0017\u1004\u0014\u0018\u1008\u0015\u0019\u1008\u0016\u001a\u1002\u0004\u001c\u1007\u0017\u001d\u001b\u001e\u1008\u0018\u001f\u1004\u0019 \u1004\u001a!\u1004\u001b\"\u1008\u001c#\u1002\u001d$\u1002\u001e%\u1008\u001f&\u1008 '\u1004!)\u1008\",\u1009#-\u001d.\u1002$/\u1002%2\u1008&4\u1008'5\u180c(7\u1007)9\u1008*:\u1007+;\u1009,?\u1008-@\u001aA\u1008.C\u1002/D\u10070G\u10081H\u10072I\u10083J\u10044K\u10085L\u10096M\u10047O\u10098", new Object[]{"zze", "zzf", "zzg", "zzh", Z1.class, "zzi", i2.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzm", "zzaf", "zzag", X1.class, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", "zzaw", "zzax", "zzay", a8, "zzaz", "zzba", "zzbb", "zzbc", "zzbd", "zzbe", "zzbf", "zzbg", "zzbh", "zzbi", "zzbj", "zzbk", "zzbl", "zzbm", "zzbn", "zzbo", "zzbp"});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new e2();
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

    public static final class a
    extends k4.b<e2, a>
    implements W4 {
        private a() {
            super(zzc);
        }

        /* synthetic */ a(k2 k22) {
            this();
        }

        public final a A0(int n8) {
            this.s();
            ((e2)this.c0).U2(1);
            return this;
        }

        public final a B(int n8, i2 i22) {
            this.s();
            ((e2)this.c0).K(n8, i22);
            return this;
        }

        public final a B0(long l8) {
            this.s();
            ((e2)this.c0).F2(l8);
            return this;
        }

        public final a C(long l8) {
            this.s();
            ((e2)this.c0).L(l8);
            return this;
        }

        public final a C0(String string) {
            this.s();
            ((e2)this.c0).K2(string);
            return this;
        }

        public final a D(U1 u12) {
            this.s();
            ((e2)this.c0).M(u12);
            return this;
        }

        public final a D0() {
            this.s();
            ((e2)this.c0).E1();
            return this;
        }

        public final a E(W1 w12) {
            this.s();
            ((e2)this.c0).N(w12);
            return this;
        }

        public final a E0(int n8) {
            this.s();
            ((e2)this.c0).b3(n8);
            return this;
        }

        public final a F(Z1.a a8) {
            this.s();
            ((e2)this.c0).O((Z1)((k4)a8.q()));
            return this;
        }

        public final a G(f2.b b8) {
            this.s();
            ((e2)this.c0).d0((f2)((k4)b8.q()));
            return this;
        }

        public final a G0(long l8) {
            this.s();
            ((e2)this.c0).N2(l8);
            return this;
        }

        public final a H(i2.a a8) {
            this.s();
            ((e2)this.c0).e0((i2)((k4)a8.q()));
            return this;
        }

        public final a H0(String string) {
            this.s();
            ((e2)this.c0).S2(string);
            return this;
        }

        public final a I(i2 i22) {
            this.s();
            ((e2)this.c0).e0(i22);
            return this;
        }

        public final a I0() {
            this.s();
            ((e2)this.c0).F1();
            return this;
        }

        public final a J(Iterable<? extends X1> iterable) {
            this.s();
            ((e2)this.c0).f0(iterable);
            return this;
        }

        public final a J0(int n8) {
            this.s();
            ((e2)this.c0).i3(n8);
            return this;
        }

        public final a K(String string) {
            this.s();
            ((e2)this.c0).g0(string);
            return this;
        }

        public final a K0(long l8) {
            this.s();
            ((e2)this.c0).V2(l8);
            return this;
        }

        public final a L(boolean bl) {
            this.s();
            ((e2)this.c0).h0(bl);
            return this;
        }

        public final a L0(String string) {
            this.s();
            ((e2)this.c0).Z2(null);
            return this;
        }

        public final List<Z1> M() {
            return java.util.DesugarCollections.unmodifiableList(((e2)this.c0).z0());
        }

        public final a M0() {
            this.s();
            ((e2)this.c0).G1();
            return this;
        }

        public final List<i2> N() {
            return java.util.DesugarCollections.unmodifiableList(((e2)this.c0).A0());
        }

        public final a N0(long l8) {
            this.s();
            ((e2)this.c0).c3(l8);
            return this;
        }

        public final boolean O() {
            return ((e2)this.c0).C0();
        }

        public final a O0(String string) {
            this.s();
            ((e2)this.c0).g3(string);
            return this;
        }

        public final boolean P() {
            return ((e2)this.c0).D0();
        }

        public final i2 P0(int n8) {
            return ((e2)this.c0).K0(n8);
        }

        public final boolean Q() {
            return ((e2)this.c0).G0();
        }

        public final a Q0() {
            this.s();
            ((e2)this.c0).H1();
            return this;
        }

        public final int R() {
            return ((e2)this.c0).J0();
        }

        public final a R0(long l8) {
            this.s();
            ((e2)this.c0).j3(l8);
            return this;
        }

        public final a S(int n8) {
            this.s();
            ((e2)this.c0).Q1(n8);
            return this;
        }

        public final a S0(String string) {
            this.s();
            ((e2)this.c0).n3(string);
            return this;
        }

        public final a T(long l8) {
            this.s();
            ((e2)this.c0).L0(l8);
            return this;
        }

        public final a T0() {
            this.s();
            ((e2)this.c0).I1();
            return this;
        }

        public final a U(Iterable<? extends Z1> iterable) {
            this.s();
            ((e2)this.c0).S0(iterable);
            return this;
        }

        public final a U0(String string) {
            this.s();
            ((e2)this.c0).q3(string);
            return this;
        }

        public final a V(String string) {
            this.s();
            ((e2)this.c0).T0(string);
            return this;
        }

        public final a V0() {
            this.s();
            ((e2)this.c0).J1();
            return this;
        }

        public final a W0(String string) {
            this.s();
            ((e2)this.c0).t3(string);
            return this;
        }

        public final a X(boolean bl) {
            this.s();
            ((e2)this.c0).U0(bl);
            return this;
        }

        public final a X0() {
            this.s();
            ((e2)this.c0).K1();
            return this;
        }

        public final int Y() {
            return ((e2)this.c0).d2();
        }

        public final a Y0(String string) {
            this.s();
            ((e2)this.c0).w3(string);
            return this;
        }

        public final a Z(int n8) {
            this.s();
            ((e2)this.c0).e2(n8);
            return this;
        }

        public final a Z0() {
            this.s();
            ((e2)this.c0).L1();
            return this;
        }

        public final a a0(long l8) {
            this.s();
            ((e2)this.c0).t1(l8);
            return this;
        }

        public final a a1(String string) {
            this.s();
            ((e2)this.c0).z3(string);
            return this;
        }

        public final a b0(Iterable<? extends Integer> iterable) {
            this.s();
            ((e2)this.c0).A1(iterable);
            return this;
        }

        public final a b1() {
            this.s();
            ((e2)this.c0).M1();
            return this;
        }

        public final a c0(String string) {
            this.s();
            ((e2)this.c0).B1(string);
            return this;
        }

        public final a c1(String string) {
            this.s();
            ((e2)this.c0).C3(string);
            return this;
        }

        public final a d0(boolean bl) {
            this.s();
            ((e2)this.c0).C1(bl);
            return this;
        }

        public final a d1() {
            this.s();
            ((e2)this.c0).N1();
            return this;
        }

        public final int e0() {
            return ((e2)this.c0).L2();
        }

        public final a e1(String string) {
            this.s();
            ((e2)this.c0).F3(string);
            return this;
        }

        public final a f0(int n8) {
            this.s();
            ((e2)this.c0).o2(n8);
            return this;
        }

        public final a f1() {
            this.s();
            ((e2)this.c0).O1();
            return this;
        }

        public final a g0(long l8) {
            this.s();
            ((e2)this.c0).R1(l8);
            return this;
        }

        public final a g1(String string) {
            this.s();
            ((e2)this.c0).I3(string);
            return this;
        }

        public final a h0(Iterable<String> iterable) {
            this.s();
            ((e2)this.c0).Y1(iterable);
            return this;
        }

        public final String h1() {
            return ((e2)this.c0).P3();
        }

        public final a i0(String string) {
            this.s();
            ((e2)this.c0).Z1(string);
            return this;
        }

        public final String i1() {
            return ((e2)this.c0).i0();
        }

        public final a j0(boolean bl) {
            this.s();
            ((e2)this.c0).a2(bl);
            return this;
        }

        public final String j1() {
            return ((e2)this.c0).l0();
        }

        public final long k0() {
            return ((e2)this.c0).o3();
        }

        public final String k1() {
            return ((e2)this.c0).n0();
        }

        public final a l0(int n8) {
            this.s();
            ((e2)this.c0).w2(n8);
            return this;
        }

        public final String l1() {
            return ((e2)this.c0).r0();
        }

        public final a m0(long l8) {
            this.s();
            ((e2)this.c0).f2(l8);
            return this;
        }

        public final String m1() {
            return ((e2)this.c0).t0();
        }

        public final a n0(Iterable<? extends i2> iterable) {
            this.s();
            ((e2)this.c0).l2(iterable);
            return this;
        }

        public final String n1() {
            return ((e2)this.c0).v0();
        }

        public final a p0(String string) {
            this.s();
            ((e2)this.c0).m2(string);
            return this;
        }

        public final long q0() {
            return ((e2)this.c0).A3();
        }

        public final a r0(int n8) {
            this.s();
            ((e2)this.c0).E2(n8);
            return this;
        }

        public final a s0(long l8) {
            this.s();
            ((e2)this.c0).p2(l8);
            return this;
        }

        public final a t0(String string) {
            this.s();
            ((e2)this.c0).u2(string);
            return this;
        }

        public final U1 v0() {
            return ((e2)this.c0).K3();
        }

        public final int w() {
            return ((e2)this.c0).n();
        }

        public final a w0(int n8) {
            this.s();
            ((e2)this.c0).M2(n8);
            return this;
        }

        public final Z1 x(int n8) {
            return ((e2)this.c0).I(n8);
        }

        public final a x0(long l8) {
            this.s();
            ((e2)this.c0).x2(l8);
            return this;
        }

        public final a y(int n8, Z1.a a8) {
            this.s();
            ((e2)this.c0).J(n8, (Z1)((k4)a8.q()));
            return this;
        }

        public final a y0(String string) {
            this.s();
            ((e2)this.c0).C2(string);
            return this;
        }

        public final a z(int n8, Z1 z12) {
            this.s();
            ((e2)this.c0).J(n8, z12);
            return this;
        }

        public final a z0() {
            this.s();
            ((e2)this.c0).D1();
            return this;
        }
    }
}

