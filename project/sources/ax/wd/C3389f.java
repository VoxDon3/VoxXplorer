package ax.wd;

/* renamed from: ax.wd.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3389f extends AbstractC3385b {
    private int d;
    private int e;
    private int f;
    private int g;
    private int[] h;
    private int i;

    public C3389f() {
        this.h = new int[16];
        a();
    }

    private int p(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    private int q(int i, int i2, int i3) {
        return (i & i3) | (i2 & (~i3));
    }

    private int r(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int s(int i, int i2, int i3) {
        return (i | (~i3)) ^ i2;
    }

    private void t(C3389f c3389f) {
        super.k(c3389f);
        this.d = c3389f.d;
        this.e = c3389f.e;
        this.f = c3389f.f;
        this.g = c3389f.g;
        int[] iArr = c3389f.h;
        System.arraycopy(iArr, 0, this.h, 0, iArr.length);
        this.i = c3389f.i;
    }

    private int u(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private void v(int i, byte[] bArr, int i2) {
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
        v(this.d, bArr, i);
        v(this.e, bArr, i + 4);
        v(this.f, bArr, i + 8);
        v(this.g, bArr, i + 12);
        a();
        return 16;
    }

    @Override // ax.vd.InterfaceC3312i
    public String f() {
        return "MD5";
    }

    @Override // ax.Nd.f
    public ax.Nd.f g() {
        return new C3389f(this);
    }

    @Override // ax.vd.InterfaceC3312i
    public int i() {
        return 16;
    }

    @Override // ax.Nd.f
    public void j(ax.Nd.f fVar) {
        t((C3389f) fVar);
    }

    @Override // ax.wd.AbstractC3385b
    protected void m() {
        int i = this.d;
        int i2 = this.e;
        int i3 = this.f;
        int i4 = this.g;
        int u = u(((i + p(i2, i3, i4)) + this.h[0]) - 680876936, 7) + i2;
        int u2 = u(((i4 + p(u, i2, i3)) + this.h[1]) - 389564586, 12) + u;
        int u3 = u(i3 + p(u2, u, i2) + this.h[2] + 606105819, 17) + u2;
        int u4 = u(((i2 + p(u3, u2, u)) + this.h[3]) - 1044525330, 22) + u3;
        int u5 = u(((u + p(u4, u3, u2)) + this.h[4]) - 176418897, 7) + u4;
        int u6 = u(u2 + p(u5, u4, u3) + this.h[5] + 1200080426, 12) + u5;
        int u7 = u(((u3 + p(u6, u5, u4)) + this.h[6]) - 1473231341, 17) + u6;
        int u8 = u(((u4 + p(u7, u6, u5)) + this.h[7]) - 45705983, 22) + u7;
        int u9 = u(u5 + p(u8, u7, u6) + this.h[8] + 1770035416, 7) + u8;
        int u10 = u(((u6 + p(u9, u8, u7)) + this.h[9]) - 1958414417, 12) + u9;
        int u11 = u(((u7 + p(u10, u9, u8)) + this.h[10]) - 42063, 17) + u10;
        int u12 = u(((u8 + p(u11, u10, u9)) + this.h[11]) - 1990404162, 22) + u11;
        int u13 = u(u9 + p(u12, u11, u10) + this.h[12] + 1804603682, 7) + u12;
        int u14 = u(((u10 + p(u13, u12, u11)) + this.h[13]) - 40341101, 12) + u13;
        int u15 = u(((u11 + p(u14, u13, u12)) + this.h[14]) - 1502002290, 17) + u14;
        int u16 = u(u12 + p(u15, u14, u13) + this.h[15] + 1236535329, 22) + u15;
        int u17 = u(((u13 + q(u16, u15, u14)) + this.h[1]) - 165796510, 5) + u16;
        int u18 = u(((u14 + q(u17, u16, u15)) + this.h[6]) - 1069501632, 9) + u17;
        int u19 = u(u15 + q(u18, u17, u16) + this.h[11] + 643717713, 14) + u18;
        int u20 = u(((u16 + q(u19, u18, u17)) + this.h[0]) - 373897302, 20) + u19;
        int u21 = u(((u17 + q(u20, u19, u18)) + this.h[5]) - 701558691, 5) + u20;
        int u22 = u(u18 + q(u21, u20, u19) + this.h[10] + 38016083, 9) + u21;
        int u23 = u(((u19 + q(u22, u21, u20)) + this.h[15]) - 660478335, 14) + u22;
        int u24 = u(((u20 + q(u23, u22, u21)) + this.h[4]) - 405537848, 20) + u23;
        int u25 = u(u21 + q(u24, u23, u22) + this.h[9] + 568446438, 5) + u24;
        int u26 = u(((u22 + q(u25, u24, u23)) + this.h[14]) - 1019803690, 9) + u25;
        int u27 = u(((u23 + q(u26, u25, u24)) + this.h[3]) - 187363961, 14) + u26;
        int u28 = u(u24 + q(u27, u26, u25) + this.h[8] + 1163531501, 20) + u27;
        int u29 = u(((u25 + q(u28, u27, u26)) + this.h[13]) - 1444681467, 5) + u28;
        int u30 = u(((u26 + q(u29, u28, u27)) + this.h[2]) - 51403784, 9) + u29;
        int u31 = u(u27 + q(u30, u29, u28) + this.h[7] + 1735328473, 14) + u30;
        int u32 = u(((u28 + q(u31, u30, u29)) + this.h[12]) - 1926607734, 20) + u31;
        int u33 = u(((u29 + r(u32, u31, u30)) + this.h[5]) - 378558, 4) + u32;
        int u34 = u(((u30 + r(u33, u32, u31)) + this.h[8]) - 2022574463, 11) + u33;
        int u35 = u(u31 + r(u34, u33, u32) + this.h[11] + 1839030562, 16) + u34;
        int u36 = u(((u32 + r(u35, u34, u33)) + this.h[14]) - 35309556, 23) + u35;
        int u37 = u(((u33 + r(u36, u35, u34)) + this.h[1]) - 1530992060, 4) + u36;
        int u38 = u(u34 + r(u37, u36, u35) + this.h[4] + 1272893353, 11) + u37;
        int u39 = u(((u35 + r(u38, u37, u36)) + this.h[7]) - 155497632, 16) + u38;
        int u40 = u(((u36 + r(u39, u38, u37)) + this.h[10]) - 1094730640, 23) + u39;
        int u41 = u(u37 + r(u40, u39, u38) + this.h[13] + 681279174, 4) + u40;
        int u42 = u(((u38 + r(u41, u40, u39)) + this.h[0]) - 358537222, 11) + u41;
        int u43 = u(((u39 + r(u42, u41, u40)) + this.h[3]) - 722521979, 16) + u42;
        int u44 = u(u40 + r(u43, u42, u41) + this.h[6] + 76029189, 23) + u43;
        int u45 = u(((u41 + r(u44, u43, u42)) + this.h[9]) - 640364487, 4) + u44;
        int u46 = u(((u42 + r(u45, u44, u43)) + this.h[12]) - 421815835, 11) + u45;
        int u47 = u(u43 + r(u46, u45, u44) + this.h[15] + 530742520, 16) + u46;
        int u48 = u(((u44 + r(u47, u46, u45)) + this.h[2]) - 995338651, 23) + u47;
        int u49 = u(((u45 + s(u48, u47, u46)) + this.h[0]) - 198630844, 6) + u48;
        int u50 = u(u46 + s(u49, u48, u47) + this.h[7] + 1126891415, 10) + u49;
        int u51 = u(((u47 + s(u50, u49, u48)) + this.h[14]) - 1416354905, 15) + u50;
        int u52 = u(((u48 + s(u51, u50, u49)) + this.h[5]) - 57434055, 21) + u51;
        int u53 = u(u49 + s(u52, u51, u50) + this.h[12] + 1700485571, 6) + u52;
        int u54 = u(((u50 + s(u53, u52, u51)) + this.h[3]) - 1894986606, 10) + u53;
        int u55 = u(((u51 + s(u54, u53, u52)) + this.h[10]) - 1051523, 15) + u54;
        int u56 = u(((u52 + s(u55, u54, u53)) + this.h[1]) - 2054922799, 21) + u55;
        int u57 = u(u53 + s(u56, u55, u54) + this.h[8] + 1873313359, 6) + u56;
        int u58 = u(((u54 + s(u57, u56, u55)) + this.h[15]) - 30611744, 10) + u57;
        int u59 = u(((u55 + s(u58, u57, u56)) + this.h[6]) - 1560198380, 15) + u58;
        int u60 = u(u56 + s(u59, u58, u57) + this.h[13] + 1309151649, 21) + u59;
        int u61 = u(((u57 + s(u60, u59, u58)) + this.h[4]) - 145523070, 6) + u60;
        int u62 = u(((u58 + s(u61, u60, u59)) + this.h[11]) - 1120210379, 10) + u61;
        int u63 = u(u59 + s(u62, u61, u60) + this.h[2] + 718787259, 15) + u62;
        int u64 = u(((u60 + s(u63, u62, u61)) + this.h[9]) - 343485551, 21) + u63;
        this.d += u61;
        this.e += u64;
        this.f += u63;
        this.g += u62;
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

    public C3389f(C3389f c3389f) {
        super(c3389f);
        this.h = new int[16];
        t(c3389f);
    }
}
