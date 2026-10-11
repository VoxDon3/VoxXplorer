package ax.wd;

/* renamed from: ax.wd.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3388e extends AbstractC3385b {
    private int d;
    private int e;
    private int f;
    private int g;
    private int[] h;
    private int i;

    public C3388e() {
        this.h = new int[16];
        a();
    }

    private int p(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    private int q(int i, int i2, int i3) {
        return (i & (i2 | i3)) | (i2 & i3);
    }

    private int r(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private void s(C3388e c3388e) {
        super.k(c3388e);
        this.d = c3388e.d;
        this.e = c3388e.e;
        this.f = c3388e.f;
        this.g = c3388e.g;
        int[] iArr = c3388e.h;
        System.arraycopy(iArr, 0, this.h, 0, iArr.length);
        this.i = c3388e.i;
    }

    private int t(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private void u(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    @Override // ax.wd.AbstractC3385b, ax.vd.InterfaceC3312i
    public void a() {
        super.a();
        this.d = 1732584193;
        this.e = -271733879;
        this.f = -1732584194;
        this.g = 271733878;
        this.i = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.h;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // ax.vd.InterfaceC3312i
    public int c(byte[] bArr, int i) {
        l();
        u(this.d, bArr, i);
        u(this.e, bArr, i + 4);
        u(this.f, bArr, i + 8);
        u(this.g, bArr, i + 12);
        a();
        return 16;
    }

    @Override // ax.vd.InterfaceC3312i
    public String f() {
        return "MD4";
    }

    @Override // ax.Nd.f
    public ax.Nd.f g() {
        return new C3388e(this);
    }

    @Override // ax.vd.InterfaceC3312i
    public int i() {
        return 16;
    }

    @Override // ax.Nd.f
    public void j(ax.Nd.f fVar) {
        s((C3388e) fVar);
    }

    @Override // ax.wd.AbstractC3385b
    protected void m() {
        int i = this.d;
        int i2 = this.e;
        int i3 = this.f;
        int i4 = this.g;
        int t = t(i + p(i2, i3, i4) + this.h[0], 3);
        int t2 = t(i4 + p(t, i2, i3) + this.h[1], 7);
        int t3 = t(i3 + p(t2, t, i2) + this.h[2], 11);
        int t4 = t(i2 + p(t3, t2, t) + this.h[3], 19);
        int t5 = t(t + p(t4, t3, t2) + this.h[4], 3);
        int t6 = t(t2 + p(t5, t4, t3) + this.h[5], 7);
        int t7 = t(t3 + p(t6, t5, t4) + this.h[6], 11);
        int t8 = t(t4 + p(t7, t6, t5) + this.h[7], 19);
        int t9 = t(t5 + p(t8, t7, t6) + this.h[8], 3);
        int t10 = t(t6 + p(t9, t8, t7) + this.h[9], 7);
        int t11 = t(t7 + p(t10, t9, t8) + this.h[10], 11);
        int t12 = t(t8 + p(t11, t10, t9) + this.h[11], 19);
        int t13 = t(t9 + p(t12, t11, t10) + this.h[12], 3);
        int t14 = t(t10 + p(t13, t12, t11) + this.h[13], 7);
        int t15 = t(t11 + p(t14, t13, t12) + this.h[14], 11);
        int t16 = t(t12 + p(t15, t14, t13) + this.h[15], 19);
        int t17 = t(t13 + q(t16, t15, t14) + this.h[0] + 1518500249, 3);
        int t18 = t(t14 + q(t17, t16, t15) + this.h[4] + 1518500249, 5);
        int t19 = t(t15 + q(t18, t17, t16) + this.h[8] + 1518500249, 9);
        int t20 = t(t16 + q(t19, t18, t17) + this.h[12] + 1518500249, 13);
        int t21 = t(t17 + q(t20, t19, t18) + this.h[1] + 1518500249, 3);
        int t22 = t(t18 + q(t21, t20, t19) + this.h[5] + 1518500249, 5);
        int t23 = t(t19 + q(t22, t21, t20) + this.h[9] + 1518500249, 9);
        int t24 = t(t20 + q(t23, t22, t21) + this.h[13] + 1518500249, 13);
        int t25 = t(t21 + q(t24, t23, t22) + this.h[2] + 1518500249, 3);
        int t26 = t(t22 + q(t25, t24, t23) + this.h[6] + 1518500249, 5);
        int t27 = t(t23 + q(t26, t25, t24) + this.h[10] + 1518500249, 9);
        int t28 = t(t24 + q(t27, t26, t25) + this.h[14] + 1518500249, 13);
        int t29 = t(t25 + q(t28, t27, t26) + this.h[3] + 1518500249, 3);
        int t30 = t(t26 + q(t29, t28, t27) + this.h[7] + 1518500249, 5);
        int t31 = t(t27 + q(t30, t29, t28) + this.h[11] + 1518500249, 9);
        int t32 = t(t28 + q(t31, t30, t29) + this.h[15] + 1518500249, 13);
        int t33 = t(t29 + r(t32, t31, t30) + this.h[0] + 1859775393, 3);
        int t34 = t(t30 + r(t33, t32, t31) + this.h[8] + 1859775393, 9);
        int t35 = t(t31 + r(t34, t33, t32) + this.h[4] + 1859775393, 11);
        int t36 = t(t32 + r(t35, t34, t33) + this.h[12] + 1859775393, 15);
        int t37 = t(t33 + r(t36, t35, t34) + this.h[2] + 1859775393, 3);
        int t38 = t(t34 + r(t37, t36, t35) + this.h[10] + 1859775393, 9);
        int t39 = t(t35 + r(t38, t37, t36) + this.h[6] + 1859775393, 11);
        int t40 = t(t36 + r(t39, t38, t37) + this.h[14] + 1859775393, 15);
        int t41 = t(t37 + r(t40, t39, t38) + this.h[1] + 1859775393, 3);
        int t42 = t(t38 + r(t41, t40, t39) + this.h[9] + 1859775393, 9);
        int t43 = t(t39 + r(t42, t41, t40) + this.h[5] + 1859775393, 11);
        int t44 = t(t40 + r(t43, t42, t41) + this.h[13] + 1859775393, 15);
        int t45 = t(t41 + r(t44, t43, t42) + this.h[3] + 1859775393, 3);
        int t46 = t(t42 + r(t45, t44, t43) + this.h[11] + 1859775393, 9);
        int t47 = t(t43 + r(t46, t45, t44) + this.h[7] + 1859775393, 11);
        int t48 = t(t44 + r(t47, t46, t45) + this.h[15] + 1859775393, 15);
        this.d += t45;
        this.e += t48;
        this.f += t47;
        this.g += t46;
        this.i = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.h;
            if (i5 == iArr.length) {
                return;
            }
            iArr[i5] = 0;
            i5++;
        }
    }

    @Override // ax.wd.AbstractC3385b
    protected void n(long j) {
        if (this.i > 14) {
            m();
        }
        int[] iArr = this.h;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // ax.wd.AbstractC3385b
    protected void o(byte[] bArr, int i) {
        int[] iArr = this.h;
        int i2 = this.i;
        int i3 = i2 + 1;
        this.i = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            m();
        }
    }

    public C3388e(C3388e c3388e) {
        super(c3388e);
        this.h = new int[16];
        s(c3388e);
    }
}
