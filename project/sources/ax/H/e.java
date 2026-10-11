package ax.H;

import ax.H.d;
import ax.I.n;
import ax.I.p;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class e {
    public static float K0 = 0.5f;
    int A0;
    boolean B0;
    boolean C0;
    public float[] D0;
    protected e[] E0;
    protected e[] F0;
    e G0;
    e H0;
    public int I0;
    public int J0;
    private boolean K;
    public d V;
    public d[] W;
    protected ArrayList<d> X;
    private boolean[] Y;
    public b[] Z;
    public e a0;
    int b0;
    public ax.I.c c;
    int c0;
    public ax.I.c d;
    public float d0;
    protected int e0;
    protected int f0;
    protected int g0;
    int h0;
    int i0;
    protected int j0;
    protected int k0;
    int l0;
    protected int m0;
    protected int n0;
    public String o;
    float o0;
    float p0;
    private Object q0;
    private int r0;
    private int s0;
    private boolean t0;
    private String u0;
    private String v0;
    boolean w0;
    boolean x0;
    boolean y0;
    int z0;
    public boolean a = false;
    public p[] b = new p[2];
    public ax.I.l e = null;
    public n f = null;
    public boolean[] g = {true, true};
    boolean h = false;
    private boolean i = true;
    private boolean j = false;
    private boolean k = true;
    private int l = -1;
    private int m = -1;
    public ax.G.a n = new ax.G.a(this);
    private boolean p = false;
    private boolean q = false;
    private boolean r = false;
    private boolean s = false;
    public int t = -1;
    public int u = -1;
    private int v = 0;
    public int w = 0;
    public int x = 0;
    public int[] y = new int[2];
    public int z = 0;
    public int A = 0;
    public float B = 1.0f;
    public int C = 0;
    public int D = 0;
    public float E = 1.0f;
    int F = -1;
    float G = 1.0f;
    private int[] H = {SubsamplingScaleImageView.TILE_SIZE_AUTO, SubsamplingScaleImageView.TILE_SIZE_AUTO};
    private float I = 0.0f;
    private boolean J = false;
    private boolean L = false;
    private int M = 0;
    private int N = 0;
    public d O = new d(this, d.b.LEFT);
    public d P = new d(this, d.b.TOP);
    public d Q = new d(this, d.b.RIGHT);
    public d R = new d(this, d.b.BOTTOM);
    public d S = new d(this, d.b.BASELINE);
    d T = new d(this, d.b.CENTER_X);
    d U = new d(this, d.b.CENTER_Y);

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[b.values().length];
            b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.b.CENTER);
        this.V = dVar;
        this.W = new d[]{this.O, this.Q, this.P, this.R, this.S, dVar};
        this.X = new ArrayList<>();
        this.Y = new boolean[2];
        b bVar = b.FIXED;
        this.Z = new b[]{bVar, bVar};
        this.a0 = null;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0.0f;
        this.e0 = -1;
        this.f0 = 0;
        this.g0 = 0;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        float f = K0;
        this.o0 = f;
        this.p0 = f;
        this.r0 = 0;
        this.s0 = 0;
        this.t0 = false;
        this.u0 = null;
        this.v0 = null;
        this.y0 = false;
        this.z0 = 0;
        this.A0 = 0;
        this.D0 = new float[]{-1.0f, -1.0f};
        this.E0 = new e[]{null, null};
        this.F0 = new e[]{null, null};
        this.G0 = null;
        this.H0 = null;
        this.I0 = -1;
        this.J0 = -1;
        d();
    }

    private void P(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        y0(sb, "      size", i, 0);
        y0(sb, "      min", i2, 0);
        y0(sb, "      max", i3, SubsamplingScaleImageView.TILE_SIZE_AUTO);
        y0(sb, "      matchMin", i5, 0);
        y0(sb, "      matchDef", i6, 0);
        x0(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    private void Q(StringBuilder sb, String str, d dVar) {
        if (dVar.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(dVar.f);
        sb.append("'");
        if (dVar.h != Integer.MIN_VALUE || dVar.g != 0) {
            sb.append(",");
            sb.append(dVar.g);
            if (dVar.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(dVar.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    private void d() {
        this.X.add(this.O);
        this.X.add(this.P);
        this.X.add(this.Q);
        this.X.add(this.R);
        this.X.add(this.T);
        this.X.add(this.U);
        this.X.add(this.V);
        this.X.add(this.S);
    }

    private boolean f0(int i) {
        d dVar;
        d dVar2;
        int i2 = i * 2;
        d[] dVarArr = this.W;
        d dVar3 = dVarArr[i2];
        d dVar4 = dVar3.f;
        return (dVar4 == null || dVar4.f == dVar3 || (dVar2 = (dVar = dVarArr[i2 + 1]).f) == null || dVar2.f != dVar) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:179:0x0465, code lost:
    
        if ((r7 instanceof ax.H.a) != false) goto L266;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0552 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x051f A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(ax.E.d r34, boolean r35, boolean r36, boolean r37, boolean r38, ax.E.i r39, ax.E.i r40, ax.H.e.b r41, boolean r42, ax.H.d r43, ax.H.d r44, int r45, int r46, int r47, int r48, float r49, boolean r50, boolean r51, boolean r52, boolean r53, boolean r54, int r55, int r56, int r57, int r58, float r59, boolean r60) {
        /*
            Method dump skipped, instructions count: 1427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.H.e.i(ax.E.d, boolean, boolean, boolean, boolean, ax.E.i, ax.E.i, ax.H.e$b, boolean, ax.H.d, ax.H.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private void x0(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    private void y0(StringBuilder sb, String str, int i, int i2) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    private void z0(StringBuilder sb, String str, float f, int i) {
        if (f == 0.0f) {
            return;
        }
        sb.append(str);
        sb.append(" :  [");
        sb.append(f);
        sb.append(",");
        sb.append(i);
        sb.append(HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append("],\n");
    }

    public b A() {
        return this.Z[0];
    }

    public void A0(int i) {
        this.l0 = i;
        this.J = i > 0;
    }

    public int B() {
        d dVar = this.O;
        int i = dVar != null ? dVar.g : 0;
        d dVar2 = this.Q;
        return dVar2 != null ? i + dVar2.g : i;
    }

    public void B0(Object obj) {
        this.q0 = obj;
    }

    public int C() {
        return this.M;
    }

    public void C0(String str) {
        this.u0 = str;
    }

    public int D() {
        return this.N;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0087 -> B:31:0x0088). Please report as a decompilation issue!!! */
    public void D0(String str) {
        float f;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.d0 = 0.0f;
            return;
        }
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i2 = -1;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            i2 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
            r3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(r3);
            if (substring2.length() > 0) {
                f = Float.parseFloat(substring2);
            }
            f = 0.0f;
        } else {
            String substring3 = str.substring(r3, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    f = i2 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f = 0.0f;
        }
        i = (f > i ? 1 : (f == i ? 0 : -1));
        if (i > 0) {
            this.d0 = f;
            this.e0 = i2;
        }
    }

    public int E(int i) {
        if (i == 0) {
            return W();
        }
        if (i == 1) {
            return x();
        }
        return 0;
    }

    public void E0(int i) {
        if (this.J) {
            int i2 = i - this.l0;
            int i3 = this.c0 + i2;
            this.g0 = i2;
            this.P.t(i2);
            this.R.t(i3);
            this.S.t(i);
            this.q = true;
        }
    }

    public int F() {
        return this.H[1];
    }

    public void F0(int i, int i2) {
        if (this.p) {
            return;
        }
        this.O.t(i);
        this.Q.t(i2);
        this.f0 = i;
        this.b0 = i2 - i;
        this.p = true;
    }

    public int G() {
        return this.H[0];
    }

    public void G0(int i) {
        this.O.t(i);
        this.f0 = i;
    }

    public int H() {
        return this.n0;
    }

    public void H0(int i) {
        this.P.t(i);
        this.g0 = i;
    }

    public int I() {
        return this.m0;
    }

    public void I0(int i, int i2) {
        if (this.q) {
            return;
        }
        this.P.t(i);
        this.R.t(i2);
        this.g0 = i;
        this.c0 = i2 - i;
        if (this.J) {
            this.S.t(i + this.l0);
        }
        this.q = true;
    }

    public e J(int i) {
        d dVar;
        d dVar2;
        if (i != 0) {
            if (i == 1 && (dVar2 = (dVar = this.R).f) != null && dVar2.f == dVar) {
                return dVar2.d;
            }
            return null;
        }
        d dVar3 = this.Q;
        d dVar4 = dVar3.f;
        if (dVar4 == null || dVar4.f != dVar3) {
            return null;
        }
        return dVar4.d;
    }

    public void J0(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.f0 = i;
        this.g0 = i2;
        if (this.s0 == 8) {
            this.b0 = 0;
            this.c0 = 0;
            return;
        }
        b[] bVarArr = this.Z;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i7 < (i6 = this.b0)) {
            i7 = i6;
        }
        if (bVarArr[1] == bVar2 && i8 < (i5 = this.c0)) {
            i8 = i5;
        }
        this.b0 = i7;
        this.c0 = i8;
        int i9 = this.n0;
        if (i8 < i9) {
            this.c0 = i9;
        }
        int i10 = this.m0;
        if (i7 < i10) {
            this.b0 = i10;
        }
        int i11 = this.A;
        if (i11 > 0 && bVar == b.MATCH_CONSTRAINT) {
            this.b0 = Math.min(this.b0, i11);
        }
        int i12 = this.D;
        if (i12 > 0 && this.Z[1] == b.MATCH_CONSTRAINT) {
            this.c0 = Math.min(this.c0, i12);
        }
        int i13 = this.b0;
        if (i7 != i13) {
            this.l = i13;
        }
        int i14 = this.c0;
        if (i8 != i14) {
            this.m = i14;
        }
    }

    public e K() {
        return this.a0;
    }

    public void K0(boolean z) {
        this.J = z;
    }

    public e L(int i) {
        d dVar;
        d dVar2;
        if (i != 0) {
            if (i == 1 && (dVar2 = (dVar = this.P).f) != null && dVar2.f == dVar) {
                return dVar2.d;
            }
            return null;
        }
        d dVar3 = this.O;
        d dVar4 = dVar3.f;
        if (dVar4 == null || dVar4.f != dVar3) {
            return null;
        }
        return dVar4.d;
    }

    public void L0(int i) {
        this.c0 = i;
        int i2 = this.n0;
        if (i < i2) {
            this.c0 = i2;
        }
    }

    public int M() {
        return X() + this.b0;
    }

    public void M0(float f) {
        this.o0 = f;
    }

    public p N(int i) {
        if (i == 0) {
            return this.e;
        }
        if (i == 1) {
            return this.f;
        }
        return null;
    }

    public void N0(int i) {
        this.z0 = i;
    }

    public void O(StringBuilder sb) {
        sb.append("  " + this.o + ":{\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    actualWidth:");
        sb2.append(this.b0);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.c0);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f0);
        sb.append("\n");
        sb.append("    actualTop:" + this.g0);
        sb.append("\n");
        Q(sb, "left", this.O);
        Q(sb, "top", this.P);
        Q(sb, "right", this.Q);
        Q(sb, "bottom", this.R);
        Q(sb, "baseline", this.S);
        Q(sb, "centerX", this.T);
        Q(sb, "centerY", this.U);
        P(sb, "    width", this.b0, this.m0, this.H[0], this.l, this.z, this.w, this.B, this.D0[0]);
        P(sb, "    height", this.c0, this.n0, this.H[1], this.m, this.C, this.x, this.E, this.D0[1]);
        z0(sb, "    dimensionRatio", this.d0, this.e0);
        x0(sb, "    horizontalBias", this.o0, K0);
        x0(sb, "    verticalBias", this.p0, K0);
        y0(sb, "    horizontalChainStyle", this.z0, 0);
        y0(sb, "    verticalChainStyle", this.A0, 0);
        sb.append("  }");
    }

    public void O0(int i, int i2) {
        this.f0 = i;
        int i3 = i2 - i;
        this.b0 = i3;
        int i4 = this.m0;
        if (i3 < i4) {
            this.b0 = i4;
        }
    }

    public void P0(b bVar) {
        this.Z[0] = bVar;
    }

    public void Q0(int i, int i2, int i3, float f) {
        this.w = i;
        this.z = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.A = i3;
        this.B = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.w = 2;
    }

    public float R() {
        return this.p0;
    }

    public void R0(float f) {
        this.D0[0] = f;
    }

    public int S() {
        return this.A0;
    }

    protected void S0(int i, boolean z) {
        this.Y[i] = z;
    }

    public b T() {
        return this.Z[1];
    }

    public void T0(boolean z) {
        this.K = z;
    }

    public int U() {
        int i = this.O != null ? this.P.g : 0;
        return this.Q != null ? i + this.R.g : i;
    }

    public void U0(boolean z) {
        this.L = z;
    }

    public int V() {
        return this.s0;
    }

    public void V0(int i, int i2) {
        this.M = i;
        this.N = i2;
        Y0(false);
    }

    public int W() {
        if (this.s0 == 8) {
            return 0;
        }
        return this.b0;
    }

    public void W0(int i) {
        this.H[1] = i;
    }

    public int X() {
        e eVar = this.a0;
        return (eVar == null || !(eVar instanceof f)) ? this.f0 : ((f) eVar).S0 + this.f0;
    }

    public void X0(int i) {
        this.H[0] = i;
    }

    public int Y() {
        e eVar = this.a0;
        return (eVar == null || !(eVar instanceof f)) ? this.g0 : ((f) eVar).T0 + this.g0;
    }

    public void Y0(boolean z) {
        this.i = z;
    }

    public boolean Z() {
        return this.J;
    }

    public void Z0(int i) {
        if (i < 0) {
            this.n0 = 0;
        } else {
            this.n0 = i;
        }
    }

    public boolean a0(int i) {
        if (i == 0) {
            return (this.O.f != null ? 1 : 0) + (this.Q.f != null ? 1 : 0) < 2;
        }
        return ((this.P.f != null ? 1 : 0) + (this.R.f != null ? 1 : 0)) + (this.S.f != null ? 1 : 0) < 2;
    }

    public void a1(int i) {
        if (i < 0) {
            this.m0 = 0;
        } else {
            this.m0 = i;
        }
    }

    public boolean b0() {
        int size = this.X.size();
        for (int i = 0; i < size; i++) {
            if (this.X.get(i).m()) {
                return true;
            }
        }
        return false;
    }

    public void b1(int i, int i2) {
        this.f0 = i;
        this.g0 = i2;
    }

    public boolean c0() {
        return (this.l == -1 && this.m == -1) ? false : true;
    }

    public void c1(e eVar) {
        this.a0 = eVar;
    }

    public boolean d0(int i, int i2) {
        d dVar;
        d dVar2;
        if (i == 0) {
            d dVar3 = this.O.f;
            return dVar3 != null && dVar3.n() && (dVar2 = this.Q.f) != null && dVar2.n() && (this.Q.f.e() - this.Q.f()) - (this.O.f.e() + this.O.f()) >= i2;
        }
        d dVar4 = this.P.f;
        if (dVar4 != null && dVar4.n() && (dVar = this.R.f) != null && dVar.n() && (this.R.f.e() - this.R.f()) - (this.P.f.e() + this.P.f()) >= i2) {
            return true;
        }
        return false;
    }

    public void d1(float f) {
        this.p0 = f;
    }

    public void e(f fVar, ax.E.d dVar, HashSet<e> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            k.a(fVar, dVar, this);
            hashSet.remove(this);
            g(dVar, fVar.T1(64));
        }
        if (i == 0) {
            HashSet<d> d = this.O.d();
            if (d != null) {
                Iterator<d> it = d.iterator();
                while (it.hasNext()) {
                    it.next().d.e(fVar, dVar, hashSet, i, true);
                }
            }
            HashSet<d> d2 = this.Q.d();
            if (d2 != null) {
                Iterator<d> it2 = d2.iterator();
                while (it2.hasNext()) {
                    it2.next().d.e(fVar, dVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<d> d3 = this.P.d();
        if (d3 != null) {
            Iterator<d> it3 = d3.iterator();
            while (it3.hasNext()) {
                it3.next().d.e(fVar, dVar, hashSet, i, true);
            }
        }
        HashSet<d> d4 = this.R.d();
        if (d4 != null) {
            Iterator<d> it4 = d4.iterator();
            while (it4.hasNext()) {
                it4.next().d.e(fVar, dVar, hashSet, i, true);
            }
        }
        HashSet<d> d5 = this.S.d();
        if (d5 != null) {
            Iterator<d> it5 = d5.iterator();
            while (it5.hasNext()) {
                it5.next().d.e(fVar, dVar, hashSet, i, true);
            }
        }
    }

    public void e0(d.b bVar, e eVar, d.b bVar2, int i, int i2) {
        o(bVar).b(eVar.o(bVar2), i, i2, true);
    }

    public void e1(int i) {
        this.A0 = i;
    }

    boolean f() {
        return (this instanceof l) || (this instanceof h);
    }

    public void f1(int i, int i2) {
        this.g0 = i;
        int i3 = i2 - i;
        this.c0 = i3;
        int i4 = this.n0;
        if (i3 < i4) {
            this.c0 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r13 != 3) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(ax.E.d r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 1418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.H.e.g(ax.E.d, boolean):void");
    }

    public boolean g0() {
        return this.r;
    }

    public void g1(b bVar) {
        this.Z[1] = bVar;
    }

    public boolean h() {
        return this.s0 != 8;
    }

    public boolean h0(int i) {
        return this.Y[i];
    }

    public void h1(int i, int i2, int i3, float f) {
        this.x = i;
        this.C = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.D = i3;
        this.E = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.x = 2;
    }

    public boolean i0() {
        d dVar = this.O;
        d dVar2 = dVar.f;
        if (dVar2 != null && dVar2.f == dVar) {
            return true;
        }
        d dVar3 = this.Q;
        d dVar4 = dVar3.f;
        return dVar4 != null && dVar4.f == dVar3;
    }

    public void i1(float f) {
        this.D0[1] = f;
    }

    public void j(d.b bVar, e eVar, d.b bVar2, int i) {
        d.b bVar3;
        d.b bVar4;
        boolean z;
        d.b bVar5 = d.b.CENTER;
        if (bVar == bVar5) {
            if (bVar2 != bVar5) {
                d.b bVar6 = d.b.LEFT;
                if (bVar2 == bVar6 || bVar2 == d.b.RIGHT) {
                    j(bVar6, eVar, bVar2, 0);
                    j(d.b.RIGHT, eVar, bVar2, 0);
                    o(bVar5).a(eVar.o(bVar2), 0);
                    return;
                }
                d.b bVar7 = d.b.TOP;
                if (bVar2 == bVar7 || bVar2 == d.b.BOTTOM) {
                    j(bVar7, eVar, bVar2, 0);
                    j(d.b.BOTTOM, eVar, bVar2, 0);
                    o(bVar5).a(eVar.o(bVar2), 0);
                    return;
                }
                return;
            }
            d.b bVar8 = d.b.LEFT;
            d o = o(bVar8);
            d.b bVar9 = d.b.RIGHT;
            d o2 = o(bVar9);
            d.b bVar10 = d.b.TOP;
            d o3 = o(bVar10);
            d.b bVar11 = d.b.BOTTOM;
            d o4 = o(bVar11);
            boolean z2 = true;
            if ((o == null || !o.o()) && (o2 == null || !o2.o())) {
                j(bVar8, eVar, bVar8, 0);
                j(bVar9, eVar, bVar9, 0);
                z = true;
            } else {
                z = false;
            }
            if ((o3 == null || !o3.o()) && (o4 == null || !o4.o())) {
                j(bVar10, eVar, bVar10, 0);
                j(bVar11, eVar, bVar11, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                o(bVar5).a(eVar.o(bVar5), 0);
                return;
            }
            if (z) {
                d.b bVar12 = d.b.CENTER_X;
                o(bVar12).a(eVar.o(bVar12), 0);
                return;
            } else {
                if (z2) {
                    d.b bVar13 = d.b.CENTER_Y;
                    o(bVar13).a(eVar.o(bVar13), 0);
                    return;
                }
                return;
            }
        }
        d.b bVar14 = d.b.CENTER_X;
        if (bVar == bVar14 && (bVar2 == (bVar4 = d.b.LEFT) || bVar2 == d.b.RIGHT)) {
            d o5 = o(bVar4);
            d o6 = eVar.o(bVar2);
            d o7 = o(d.b.RIGHT);
            o5.a(o6, 0);
            o7.a(o6, 0);
            o(bVar14).a(o6, 0);
            return;
        }
        d.b bVar15 = d.b.CENTER_Y;
        if (bVar == bVar15 && (bVar2 == (bVar3 = d.b.TOP) || bVar2 == d.b.BOTTOM)) {
            d o8 = eVar.o(bVar2);
            o(bVar3).a(o8, 0);
            o(d.b.BOTTOM).a(o8, 0);
            o(bVar15).a(o8, 0);
            return;
        }
        if (bVar == bVar14 && bVar2 == bVar14) {
            d.b bVar16 = d.b.LEFT;
            o(bVar16).a(eVar.o(bVar16), 0);
            d.b bVar17 = d.b.RIGHT;
            o(bVar17).a(eVar.o(bVar17), 0);
            o(bVar14).a(eVar.o(bVar2), 0);
            return;
        }
        if (bVar == bVar15 && bVar2 == bVar15) {
            d.b bVar18 = d.b.TOP;
            o(bVar18).a(eVar.o(bVar18), 0);
            d.b bVar19 = d.b.BOTTOM;
            o(bVar19).a(eVar.o(bVar19), 0);
            o(bVar15).a(eVar.o(bVar2), 0);
            return;
        }
        d o9 = o(bVar);
        d o10 = eVar.o(bVar2);
        if (o9.p(o10)) {
            d.b bVar20 = d.b.BASELINE;
            if (bVar == bVar20) {
                d o11 = o(d.b.TOP);
                d o12 = o(d.b.BOTTOM);
                if (o11 != null) {
                    o11.q();
                }
                if (o12 != null) {
                    o12.q();
                }
            } else if (bVar == d.b.TOP || bVar == d.b.BOTTOM) {
                d o13 = o(bVar20);
                if (o13 != null) {
                    o13.q();
                }
                d o14 = o(bVar5);
                if (o14.j() != o10) {
                    o14.q();
                }
                d g = o(bVar).g();
                d o15 = o(bVar15);
                if (o15.o()) {
                    g.q();
                    o15.q();
                }
            } else if (bVar == d.b.LEFT || bVar == d.b.RIGHT) {
                d o16 = o(bVar5);
                if (o16.j() != o10) {
                    o16.q();
                }
                d g2 = o(bVar).g();
                d o17 = o(bVar14);
                if (o17.o()) {
                    g2.q();
                    o17.q();
                }
            }
            o9.a(o10, i);
        }
    }

    public boolean j0() {
        return this.K;
    }

    public void j1(int i) {
        this.s0 = i;
    }

    public void k(d dVar, d dVar2, int i) {
        if (dVar.h() == this) {
            j(dVar.k(), dVar2.h(), dVar2.k(), i);
        }
    }

    public boolean k0() {
        d dVar = this.P;
        d dVar2 = dVar.f;
        if (dVar2 != null && dVar2.f == dVar) {
            return true;
        }
        d dVar3 = this.R;
        d dVar4 = dVar3.f;
        return dVar4 != null && dVar4.f == dVar3;
    }

    public void k1(int i) {
        this.b0 = i;
        int i2 = this.m0;
        if (i < i2) {
            this.b0 = i2;
        }
    }

    public void l(e eVar, float f, int i) {
        d.b bVar = d.b.CENTER;
        e0(bVar, eVar, bVar, i, 0);
        this.I = f;
    }

    public boolean l0() {
        return this.L;
    }

    public void l1(int i) {
        if (i < 0 || i > 3) {
            return;
        }
        this.v = i;
    }

    public void m(ax.E.d dVar) {
        dVar.q(this.O);
        dVar.q(this.P);
        dVar.q(this.Q);
        dVar.q(this.R);
        if (this.l0 > 0) {
            dVar.q(this.S);
        }
    }

    public boolean m0() {
        return this.i && this.s0 != 8;
    }

    public void m1(int i) {
        this.f0 = i;
    }

    public void n() {
        if (this.e == null) {
            this.e = new ax.I.l(this);
        }
        if (this.f == null) {
            this.f = new n(this);
        }
    }

    public boolean n0() {
        if (this.p) {
            return true;
        }
        return this.O.n() && this.Q.n();
    }

    public void n1(int i) {
        this.g0 = i;
    }

    public d o(d.b bVar) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return this.O;
            case 2:
                return this.P;
            case 3:
                return this.Q;
            case 4:
                return this.R;
            case 5:
                return this.S;
            case 6:
                return this.V;
            case 7:
                return this.T;
            case 8:
                return this.U;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public boolean o0() {
        if (this.q) {
            return true;
        }
        return this.P.n() && this.R.n();
    }

    public void o1(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.F == -1) {
            if (z3 && !z4) {
                this.F = 0;
            } else if (!z3 && z4) {
                this.F = 1;
                if (this.e0 == -1) {
                    this.G = 1.0f / this.G;
                }
            }
        }
        if (this.F == 0 && (!this.P.o() || !this.R.o())) {
            this.F = 1;
        } else if (this.F == 1 && (!this.O.o() || !this.Q.o())) {
            this.F = 0;
        }
        if (this.F == -1 && (!this.P.o() || !this.R.o() || !this.O.o() || !this.Q.o())) {
            if (this.P.o() && this.R.o()) {
                this.F = 0;
            } else if (this.O.o() && this.Q.o()) {
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
        if (this.F == -1) {
            int i = this.z;
            if (i > 0 && this.C == 0) {
                this.F = 0;
            } else {
                if (i != 0 || this.C <= 0) {
                    return;
                }
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
    }

    public int p() {
        return this.l0;
    }

    public boolean p0() {
        return this.s;
    }

    public void p1(boolean z, boolean z2) {
        int i;
        int i2;
        boolean k = z & this.e.k();
        boolean k2 = z2 & this.f.k();
        ax.I.l lVar = this.e;
        int i3 = lVar.h.g;
        n nVar = this.f;
        int i4 = nVar.h.g;
        int i5 = lVar.i.g;
        int i6 = nVar.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (k) {
            this.f0 = i3;
        }
        if (k2) {
            this.g0 = i4;
        }
        if (this.s0 == 8) {
            this.b0 = 0;
            this.c0 = 0;
            return;
        }
        if (k) {
            if (this.Z[0] == b.FIXED && i8 < (i2 = this.b0)) {
                i8 = i2;
            }
            this.b0 = i8;
            int i10 = this.m0;
            if (i8 < i10) {
                this.b0 = i10;
            }
        }
        if (k2) {
            if (this.Z[1] == b.FIXED && i9 < (i = this.c0)) {
                i9 = i;
            }
            this.c0 = i9;
            int i11 = this.n0;
            if (i9 < i11) {
                this.c0 = i11;
            }
        }
    }

    public float q(int i) {
        if (i == 0) {
            return this.o0;
        }
        if (i == 1) {
            return this.p0;
        }
        return -1.0f;
    }

    public void q0() {
        this.r = true;
    }

    public void q1(ax.E.d dVar, boolean z) {
        n nVar;
        ax.I.l lVar;
        int x = dVar.x(this.O);
        int x2 = dVar.x(this.P);
        int x3 = dVar.x(this.Q);
        int x4 = dVar.x(this.R);
        if (z && (lVar = this.e) != null) {
            ax.I.f fVar = lVar.h;
            if (fVar.j) {
                ax.I.f fVar2 = lVar.i;
                if (fVar2.j) {
                    x = fVar.g;
                    x3 = fVar2.g;
                }
            }
        }
        if (z && (nVar = this.f) != null) {
            ax.I.f fVar3 = nVar.h;
            if (fVar3.j) {
                ax.I.f fVar4 = nVar.i;
                if (fVar4.j) {
                    x2 = fVar3.g;
                    x4 = fVar4.g;
                }
            }
        }
        int i = x4 - x2;
        if (x3 - x < 0 || i < 0 || x == Integer.MIN_VALUE || x == Integer.MAX_VALUE || x2 == Integer.MIN_VALUE || x2 == Integer.MAX_VALUE || x3 == Integer.MIN_VALUE || x3 == Integer.MAX_VALUE || x4 == Integer.MIN_VALUE || x4 == Integer.MAX_VALUE) {
            x = 0;
            x4 = 0;
            x2 = 0;
            x3 = 0;
        }
        J0(x, x2, x3, x4);
    }

    public int r() {
        return Y() + this.c0;
    }

    public void r0() {
        this.s = true;
    }

    public Object s() {
        return this.q0;
    }

    public boolean s0() {
        b[] bVarArr = this.Z;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public String t() {
        return this.u0;
    }

    public void t0() {
        this.O.q();
        this.P.q();
        this.Q.q();
        this.R.q();
        this.S.q();
        this.T.q();
        this.U.q();
        this.V.q();
        this.a0 = null;
        this.I = 0.0f;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0.0f;
        this.e0 = -1;
        this.f0 = 0;
        this.g0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        float f = K0;
        this.o0 = f;
        this.p0 = f;
        b[] bVarArr = this.Z;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.q0 = null;
        this.r0 = 0;
        this.s0 = 0;
        this.v0 = null;
        this.w0 = false;
        this.x0 = false;
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = false;
        this.C0 = false;
        float[] fArr = this.D0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.t = -1;
        this.u = -1;
        int[] iArr = this.H;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.w = 0;
        this.x = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.D = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.z = 0;
        this.C = 0;
        this.h = false;
        this.F = -1;
        this.G = 1.0f;
        this.y0 = false;
        boolean[] zArr = this.g;
        zArr[0] = true;
        zArr[1] = true;
        this.L = false;
        boolean[] zArr2 = this.Y;
        zArr2[0] = false;
        zArr2[1] = false;
        this.i = true;
        int[] iArr2 = this.y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.l = -1;
        this.m = -1;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = this.v0;
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str2 != null) {
            str = "type: " + this.v0 + " ";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str);
        if (this.u0 != null) {
            str3 = "id: " + this.u0 + " ";
        }
        sb.append(str3);
        sb.append("(");
        sb.append(this.f0);
        sb.append(", ");
        sb.append(this.g0);
        sb.append(") - (");
        sb.append(this.b0);
        sb.append(" x ");
        sb.append(this.c0);
        sb.append(")");
        return sb.toString();
    }

    public b u(int i) {
        if (i == 0) {
            return A();
        }
        if (i == 1) {
            return T();
        }
        return null;
    }

    public void u0() {
        e K = K();
        if (K != null && (K instanceof f) && ((f) K()).L1()) {
            return;
        }
        int size = this.X.size();
        for (int i = 0; i < size; i++) {
            this.X.get(i).q();
        }
    }

    public float v() {
        return this.d0;
    }

    public void v0() {
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        int size = this.X.size();
        for (int i = 0; i < size; i++) {
            this.X.get(i).r();
        }
    }

    public int w() {
        return this.e0;
    }

    public void w0(ax.E.c cVar) {
        this.O.s(cVar);
        this.P.s(cVar);
        this.Q.s(cVar);
        this.R.s(cVar);
        this.S.s(cVar);
        this.V.s(cVar);
        this.T.s(cVar);
        this.U.s(cVar);
    }

    public int x() {
        if (this.s0 == 8) {
            return 0;
        }
        return this.c0;
    }

    public float y() {
        return this.o0;
    }

    public int z() {
        return this.z0;
    }
}
