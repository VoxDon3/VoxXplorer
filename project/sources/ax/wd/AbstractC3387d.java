package ax.wd;

import ax.vd.InterfaceC3313j;

/* renamed from: ax.wd.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3387d implements InterfaceC3313j, ax.Nd.f {
    static final long[] o = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    private byte[] a;
    private int b;
    private long c;
    private long d;
    protected long e;
    protected long f;
    protected long g;
    protected long h;
    protected long i;
    protected long j;
    protected long k;
    protected long l;
    private long[] m;
    private int n;

    protected AbstractC3387d() {
        this.a = new byte[8];
        this.m = new long[80];
        this.b = 0;
        a();
    }

    private long k(long j, long j2, long j3) {
        return ((~j) & j3) ^ (j2 & j);
    }

    private long l(long j, long j2, long j3) {
        return ((j & j3) ^ (j & j2)) ^ (j2 & j3);
    }

    private long m(long j) {
        return (j >>> 7) ^ (((j << 63) | (j >>> 1)) ^ ((j << 56) | (j >>> 8)));
    }

    private long n(long j) {
        return (j >>> 6) ^ (((j << 45) | (j >>> 19)) ^ ((j << 3) | (j >>> 61)));
    }

    private long o(long j) {
        return ((j >>> 39) | (j << 25)) ^ (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34)));
    }

    private long p(long j) {
        return ((j >>> 41) | (j << 23)) ^ (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18)));
    }

    private void q() {
        long j = this.c;
        if (j > 2305843009213693951L) {
            this.d += j >>> 61;
            this.c = j & 2305843009213693951L;
        }
    }

    @Override // ax.vd.InterfaceC3312i
    public void a() {
        this.c = 0L;
        this.d = 0L;
        int i = 0;
        this.b = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.n = 0;
        while (true) {
            long[] jArr = this.m;
            if (i == jArr.length) {
                return;
            }
            jArr[i] = 0;
            i++;
        }
    }

    @Override // ax.vd.InterfaceC3312i
    public void b(byte[] bArr, int i, int i2) {
        while (this.b != 0 && i2 > 0) {
            d(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > this.a.length) {
            v(bArr, i);
            byte[] bArr2 = this.a;
            i += bArr2.length;
            i2 -= bArr2.length;
            this.c += bArr2.length;
        }
        while (i2 > 0) {
            d(bArr[i]);
            i++;
            i2--;
        }
    }

    @Override // ax.vd.InterfaceC3312i
    public void d(byte b) {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            v(bArr, 0);
            this.b = 0;
        }
        this.c++;
    }

    @Override // ax.vd.InterfaceC3313j
    public int h() {
        return 128;
    }

    protected void r(AbstractC3387d abstractC3387d) {
        byte[] bArr = abstractC3387d.a;
        System.arraycopy(bArr, 0, this.a, 0, bArr.length);
        this.b = abstractC3387d.b;
        this.c = abstractC3387d.c;
        this.d = abstractC3387d.d;
        this.e = abstractC3387d.e;
        this.f = abstractC3387d.f;
        this.g = abstractC3387d.g;
        this.h = abstractC3387d.h;
        this.i = abstractC3387d.i;
        this.j = abstractC3387d.j;
        this.k = abstractC3387d.k;
        this.l = abstractC3387d.l;
        long[] jArr = abstractC3387d.m;
        System.arraycopy(jArr, 0, this.m, 0, jArr.length);
        this.n = abstractC3387d.n;
    }

    public void s() {
        q();
        long j = this.c << 3;
        long j2 = this.d;
        byte b = Byte.MIN_VALUE;
        while (true) {
            d(b);
            if (this.b == 0) {
                u(j, j2);
                t();
                return;
            }
            b = 0;
        }
    }

    protected void t() {
        q();
        for (int i = 16; i <= 79; i++) {
            long[] jArr = this.m;
            long n = n(jArr[i - 2]);
            long[] jArr2 = this.m;
            jArr[i] = n + jArr2[i - 7] + m(jArr2[i - 15]) + this.m[i - 16];
        }
        long j = this.e;
        long j2 = this.f;
        long j3 = this.g;
        long j4 = this.h;
        long j5 = this.i;
        long j6 = j4;
        long j7 = this.j;
        int i2 = 0;
        int i3 = 0;
        long j8 = j3;
        long j9 = this.k;
        long j10 = this.l;
        long j11 = j;
        long j12 = j5;
        long j13 = j2;
        while (i2 < 10) {
            long j14 = j7;
            long j15 = j12;
            long j16 = j9;
            long p = p(j12) + k(j12, j14, j9);
            long[] jArr3 = o;
            int i4 = i3 + 1;
            long j17 = j10 + p + jArr3[i3] + this.m[i3];
            long j18 = j6 + j17;
            long j19 = j11;
            long j20 = j13;
            long j21 = j8;
            long o2 = j17 + o(j11) + l(j19, j20, j21);
            int i5 = i3 + 2;
            long p2 = j16 + p(j18) + k(j18, j15, j14) + jArr3[i4] + this.m[i4];
            long j22 = j21 + p2;
            long o3 = p2 + o(o2) + l(o2, j19, j20);
            int i6 = i3 + 3;
            long p3 = j14 + p(j22) + k(j22, j18, j15) + jArr3[i5] + this.m[i5];
            long j23 = j20 + p3;
            long o4 = p3 + o(o3) + l(o3, o2, j19);
            int i7 = i3 + 4;
            long p4 = j15 + p(j23) + k(j23, j22, j18) + jArr3[i6] + this.m[i6];
            long j24 = j19 + p4;
            long o5 = p4 + o(o4) + l(o4, o3, o2);
            int i8 = i3 + 5;
            long p5 = j18 + p(j24) + k(j24, j23, j22) + jArr3[i7] + this.m[i7];
            long j25 = o2 + p5;
            long o6 = p5 + o(o5) + l(o5, o4, o3);
            int i9 = i3 + 6;
            long p6 = j22 + p(j25) + k(j25, j24, j23) + jArr3[i8] + this.m[i8];
            long j26 = o3 + p6;
            long o7 = p6 + o(o6) + l(o6, o5, o4);
            int i10 = i3 + 7;
            long p7 = j23 + p(j26) + k(j26, j25, j24) + jArr3[i9] + this.m[i9];
            long j27 = o4 + p7;
            long o8 = p7 + o(o7) + l(o7, o6, o5);
            i3 += 8;
            long p8 = j24 + p(j27) + k(j27, j26, j25) + jArr3[i10] + this.m[i10];
            long j28 = o5 + p8;
            j11 = p8 + o(o8) + l(o8, o7, o6);
            i2++;
            j13 = o8;
            j12 = j28;
            j8 = o7;
            j10 = j25;
            j7 = j27;
            j9 = j26;
            j6 = o6;
        }
        this.e += j11;
        this.f += j13;
        this.g += j8;
        this.h += j6;
        this.i += j12;
        this.j += j7;
        this.k += j9;
        this.l += j10;
        this.n = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            this.m[i11] = 0;
        }
    }

    protected void u(long j, long j2) {
        if (this.n > 14) {
            t();
        }
        long[] jArr = this.m;
        jArr[14] = j2;
        jArr[15] = j;
    }

    protected void v(byte[] bArr, int i) {
        this.m[this.n] = ax.Nd.h.b(bArr, i);
        int i2 = this.n + 1;
        this.n = i2;
        if (i2 == 16) {
            t();
        }
    }

    protected AbstractC3387d(AbstractC3387d abstractC3387d) {
        this.a = new byte[8];
        this.m = new long[80];
        r(abstractC3387d);
    }
}
