package ax.I1;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import ax.N1.t;
import ax.N1.u;
import ax.P0.C0900i;
import ax.P0.C0901j;
import ax.P0.C0906o;
import ax.P0.E;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.S0.C0988v;
import ax.S0.G;
import ax.S0.d0;
import ax.T0.h;
import ax.q1.C2848h;
import ax.q1.C2857q;
import ax.q1.C2862w;
import ax.q1.InterfaceC2858s;
import ax.q1.InterfaceC2859t;
import ax.q1.InterfaceC2863x;
import ax.q1.M;
import ax.q1.N;
import ax.q1.U;
import ax.q1.V;
import ax.q1.r;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class e implements r {

    @Deprecated
    public static final InterfaceC2863x f0 = new InterfaceC2863x() { // from class: ax.I1.d
        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x a(t.a aVar) {
            return C2862w.d(this, aVar);
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x b(int i) {
            return C2862w.b(this, i);
        }

        @Override // ax.q1.InterfaceC2863x
        public final r[] c() {
            return e.g();
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ InterfaceC2863x d(boolean z) {
            return C2862w.c(this, z);
        }

        @Override // ax.q1.InterfaceC2863x
        public /* synthetic */ r[] e(Uri uri, Map map) {
            return C2862w.a(this, uri, map);
        }
    };
    private static final byte[] g0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] h0 = d0.x0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] i0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] j0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    private static final UUID k0 = new UUID(72057594037932032L, -9223371306706625679L);
    private static final Map<String, Integer> l0;
    private long A;
    private boolean B;
    private long C;
    private long D;
    private long E;
    private C0988v F;
    private C0988v G;
    private boolean H;
    private boolean I;
    private int J;
    private long K;
    private long L;
    private int M;
    private int N;
    private int[] O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private boolean T;
    private long U;
    private int V;
    private int W;
    private int X;
    private boolean Y;
    private boolean Z;
    private final ax.I1.c a;
    private boolean a0;
    private final g b;
    private int b0;
    private final SparseArray<c> c;
    private byte c0;
    private final boolean d;
    private boolean d0;
    private final boolean e;
    private InterfaceC2859t e0;
    private final t.a f;
    private final G g;
    private final G h;
    private final G i;
    private final G j;
    private final G k;
    private final G l;
    private final G m;
    private final G n;
    private final G o;
    private final G p;
    private ByteBuffer q;
    private long r;
    private long s;
    private long t;
    private long u;
    private long v;
    private boolean w;
    private c x;
    private boolean y;
    private int z;

    private final class b implements ax.I1.b {
        private b() {
        }

        @Override // ax.I1.b
        public void a(int i) throws E {
            e.this.r(i);
        }

        @Override // ax.I1.b
        public int b(int i) {
            return e.this.x(i);
        }

        @Override // ax.I1.b
        public boolean c(int i) {
            return e.this.C(i);
        }

        @Override // ax.I1.b
        public void d(int i, String str) throws E {
            e.this.J(i, str);
        }

        @Override // ax.I1.b
        public void e(int i, double d) throws E {
            e.this.u(i, d);
        }

        @Override // ax.I1.b
        public void f(int i, int i2, InterfaceC2858s interfaceC2858s) throws IOException {
            e.this.o(i, i2, interfaceC2858s);
        }

        @Override // ax.I1.b
        public void g(int i, long j, long j2) throws E {
            e.this.I(i, j, j2);
        }

        @Override // ax.I1.b
        public void h(int i, long j) throws E {
            e.this.A(i, j);
        }
    }

    protected static final class c {
        public byte[] P;
        public V V;
        public boolean W;
        public U Z;
        public boolean a;
        public int a0;
        public String b;
        public String c;
        public int d;
        public int e;
        public int f;
        public int g;
        private int h;
        public boolean i;
        public byte[] j;
        public U.a k;
        public byte[] l;
        public C0906o m;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = 0;
        public int t = -1;
        public float u = 0.0f;
        public float v = 0.0f;
        public float w = 0.0f;
        public byte[] x = null;
        public int y = -1;
        public boolean z = false;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = 1000;
        public int E = 200;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public float N = -1.0f;
        public float O = -1.0f;
        public int Q = 1;
        public int R = -1;
        public int S = 8000;
        public long T = 0;
        public long U = 0;
        public boolean X = true;
        private String Y = "eng";

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            C0968a.e(this.Z);
        }

        private byte[] g(String str) throws E {
            byte[] bArr = this.l;
            if (bArr != null) {
                return bArr;
            }
            throw E.a("Missing CodecPrivate for codec " + str, null);
        }

        private byte[] h() {
            if (this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f || this.N == -1.0f || this.O == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((this.F * 50000.0f) + 0.5f));
            order.putShort((short) ((this.G * 50000.0f) + 0.5f));
            order.putShort((short) ((this.H * 50000.0f) + 0.5f));
            order.putShort((short) ((this.I * 50000.0f) + 0.5f));
            order.putShort((short) ((this.J * 50000.0f) + 0.5f));
            order.putShort((short) ((this.K * 50000.0f) + 0.5f));
            order.putShort((short) ((this.L * 50000.0f) + 0.5f));
            order.putShort((short) ((this.M * 50000.0f) + 0.5f));
            order.putShort((short) (this.N + 0.5f));
            order.putShort((short) (this.O + 0.5f));
            order.putShort((short) this.D);
            order.putShort((short) this.E);
            return bArr;
        }

        private static Pair<String, List<byte[]>> k(G g) throws E {
            try {
                g.c0(16);
                long C = g.C();
                if (C == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (C == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (C != 826496599) {
                    C0987u.h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] f = g.f();
                for (int g2 = g.g() + 20; g2 < f.length - 4; g2++) {
                    if (f[g2] == 0 && f[g2 + 1] == 0 && f[g2 + 2] == 1 && f[g2 + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(f, g2, f.length)));
                    }
                }
                throw E.a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw E.a("Error parsing FourCC private data", null);
            }
        }

        private static boolean l(G g) throws E {
            try {
                int E = g.E();
                if (E == 1) {
                    return true;
                }
                if (E == 65534) {
                    g.b0(24);
                    if (g.F() == e.k0.getMostSignificantBits()) {
                        if (g.F() == e.k0.getLeastSignificantBits()) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw E.a("Error parsing MS/ACM codec private", null);
            }
        }

        private static List<byte[]> m(byte[] bArr) throws E {
            int i;
            int i2;
            try {
                if (bArr[0] != 2) {
                    throw E.a("Error parsing vorbis codec private", null);
                }
                int i3 = 1;
                int i4 = 0;
                while (true) {
                    i = bArr[i3];
                    if ((i & 255) != 255) {
                        break;
                    }
                    i4 += 255;
                    i3++;
                }
                int i5 = i3 + 1;
                int i6 = i4 + (i & 255);
                int i7 = 0;
                while (true) {
                    i2 = bArr[i5];
                    if ((i2 & 255) != 255) {
                        break;
                    }
                    i7 += 255;
                    i5++;
                }
                int i8 = i5 + 1;
                int i9 = i7 + (i2 & 255);
                if (bArr[i8] != 1) {
                    throw E.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArr, i8, bArr2, 0, i6);
                int i10 = i8 + i6;
                if (bArr[i10] != 3) {
                    throw E.a("Error parsing vorbis codec private", null);
                }
                int i11 = i10 + i9;
                if (bArr[i11] != 5) {
                    throw E.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i11];
                System.arraycopy(bArr, i11, bArr3, 0, bArr.length - i11);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw E.a("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean o(boolean z) {
            return "A_OPUS".equals(this.c) ? z : this.g > 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0462  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x047b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x048a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x05c9  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x05e4  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x05e7  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x049c  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x047d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void i(ax.q1.InterfaceC2859t r19, int r20) throws ax.P0.E {
            /*
                Method dump skipped, instructions count: 1778
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.I1.e.c.i(ax.q1.t, int):void");
        }

        public void j() {
            V v = this.V;
            if (v != null) {
                v.a(this.Z, this.k);
            }
        }

        public void n() {
            V v = this.V;
            if (v != null) {
                v.b();
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", Integer.valueOf(SubsamplingScaleImageView.ORIENTATION_180));
        hashMap.put("htc_video_rotA-270", Integer.valueOf(SubsamplingScaleImageView.ORIENTATION_270));
        l0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public e(t.a aVar, int i) {
        this(new ax.I1.a(), i, aVar);
    }

    private static boolean B(String str) {
        str.getClass();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "S_TEXT/SSA":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    private boolean D(M m, long j) {
        if (this.B) {
            this.D = j;
            m.a = this.C;
            this.B = false;
            return true;
        }
        if (this.y) {
            long j2 = this.D;
            if (j2 != -1) {
                m.a = j2;
                this.D = -1L;
                return true;
            }
        }
        return false;
    }

    private void E(InterfaceC2858s interfaceC2858s, int i) throws IOException {
        if (this.i.j() >= i) {
            return;
        }
        if (this.i.b() < i) {
            G g = this.i;
            g.d(Math.max(g.b() * 2, i));
        }
        interfaceC2858s.readFully(this.i.f(), this.i.j(), i - this.i.j());
        this.i.a0(i);
    }

    private void F() {
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = false;
        this.Z = false;
        this.a0 = false;
        this.b0 = 0;
        this.c0 = (byte) 0;
        this.d0 = false;
        this.l.X(0);
    }

    private long G(long j) throws E {
        long j2 = this.t;
        if (j2 != -9223372036854775807L) {
            return d0.p1(j, j2, 1000L);
        }
        throw E.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void H(String str, long j, byte[] bArr) {
        byte[] v;
        int i;
        str.getClass();
        switch (str) {
            case "S_TEXT/ASS":
            case "S_TEXT/SSA":
                v = v(j, "%01d:%02d:%02d:%02d", 10000L);
                i = 21;
                break;
            case "S_TEXT/WEBVTT":
                v = v(j, "%02d:%02d:%02d.%03d", 1000L);
                i = 25;
                break;
            case "S_TEXT/UTF8":
                v = v(j, "%02d:%02d:%02d,%03d", 1000L);
                i = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(v, 0, bArr, i, v.length);
    }

    private int K(InterfaceC2858s interfaceC2858s, c cVar, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(cVar.c)) {
            L(interfaceC2858s, g0, i);
            return t();
        }
        if ("S_TEXT/ASS".equals(cVar.c) || "S_TEXT/SSA".equals(cVar.c)) {
            L(interfaceC2858s, i0, i);
            return t();
        }
        if ("S_TEXT/WEBVTT".equals(cVar.c)) {
            L(interfaceC2858s, j0, i);
            return t();
        }
        U u = cVar.Z;
        if (!this.Y) {
            if (cVar.i) {
                this.R &= -1073741825;
                if (!this.Z) {
                    interfaceC2858s.readFully(this.i.f(), 0, 1);
                    this.V++;
                    if ((this.i.f()[0] & 128) == 128) {
                        throw E.a("Extension bit is set in signal byte", null);
                    }
                    this.c0 = this.i.f()[0];
                    this.Z = true;
                }
                byte b2 = this.c0;
                if ((b2 & 1) == 1) {
                    boolean z2 = (b2 & 2) == 2;
                    this.R |= 1073741824;
                    if (!this.d0) {
                        interfaceC2858s.readFully(this.n.f(), 0, 8);
                        this.V += 8;
                        this.d0 = true;
                        this.i.f()[0] = (byte) ((z2 ? 128 : 0) | 8);
                        this.i.b0(0);
                        u.b(this.i, 1, 1);
                        this.W++;
                        this.n.b0(0);
                        u.b(this.n, 8, 1);
                        this.W += 8;
                    }
                    if (z2) {
                        if (!this.a0) {
                            interfaceC2858s.readFully(this.i.f(), 0, 1);
                            this.V++;
                            this.i.b0(0);
                            this.b0 = this.i.M();
                            this.a0 = true;
                        }
                        int i3 = this.b0 * 4;
                        this.i.X(i3);
                        interfaceC2858s.readFully(this.i.f(), 0, i3);
                        this.V += i3;
                        short s = (short) ((this.b0 / 2) + 1);
                        int i4 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.q;
                        if (byteBuffer == null || byteBuffer.capacity() < i4) {
                            this.q = ByteBuffer.allocate(i4);
                        }
                        this.q.position(0);
                        this.q.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i2 = this.b0;
                            if (i5 >= i2) {
                                break;
                            }
                            int Q = this.i.Q();
                            if (i5 % 2 == 0) {
                                this.q.putShort((short) (Q - i6));
                            } else {
                                this.q.putInt(Q - i6);
                            }
                            i5++;
                            i6 = Q;
                        }
                        int i7 = (i - this.V) - i6;
                        if (i2 % 2 == 1) {
                            this.q.putInt(i7);
                        } else {
                            this.q.putShort((short) i7);
                            this.q.putInt(0);
                        }
                        this.o.Z(this.q.array(), i4);
                        u.b(this.o, i4, 1);
                        this.W += i4;
                    }
                }
            } else {
                byte[] bArr = cVar.j;
                if (bArr != null) {
                    this.l.Z(bArr, bArr.length);
                }
            }
            if (cVar.o(z)) {
                this.R |= 268435456;
                this.p.X(0);
                int j = (this.l.j() + i) - this.V;
                this.i.X(4);
                this.i.f()[0] = (byte) ((j >> 24) & 255);
                this.i.f()[1] = (byte) ((j >> 16) & 255);
                this.i.f()[2] = (byte) ((j >> 8) & 255);
                this.i.f()[3] = (byte) (j & 255);
                u.b(this.i, 4, 2);
                this.W += 4;
            }
            this.Y = true;
        }
        int j2 = i + this.l.j();
        if (!"V_MPEG4/ISO/AVC".equals(cVar.c) && !"V_MPEGH/ISO/HEVC".equals(cVar.c)) {
            if (cVar.V != null) {
                C0968a.g(this.l.j() == 0);
                cVar.V.d(interfaceC2858s);
            }
            while (true) {
                int i8 = this.V;
                if (i8 >= j2) {
                    break;
                }
                int M = M(interfaceC2858s, u, j2 - i8);
                this.V += M;
                this.W += M;
            }
        } else {
            byte[] f = this.h.f();
            f[0] = 0;
            f[1] = 0;
            f[2] = 0;
            int i9 = cVar.a0;
            int i10 = 4 - i9;
            while (this.V < j2) {
                int i11 = this.X;
                if (i11 == 0) {
                    N(interfaceC2858s, f, i10, i9);
                    this.V += i9;
                    this.h.b0(0);
                    this.X = this.h.Q();
                    this.g.b0(0);
                    u.g(this.g, 4);
                    this.W += 4;
                } else {
                    int M2 = M(interfaceC2858s, u, i11);
                    this.V += M2;
                    this.W += M2;
                    this.X -= M2;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.c)) {
            this.j.b0(0);
            u.g(this.j, 4);
            this.W += 4;
        }
        return t();
    }

    private void L(InterfaceC2858s interfaceC2858s, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        if (this.m.b() < length) {
            this.m.Y(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, this.m.f(), 0, bArr.length);
        }
        interfaceC2858s.readFully(this.m.f(), bArr.length, i);
        this.m.b0(0);
        this.m.a0(length);
    }

    private int M(InterfaceC2858s interfaceC2858s, U u, int i) throws IOException {
        int a2 = this.l.a();
        if (a2 <= 0) {
            return u.a(interfaceC2858s, i, false);
        }
        int min = Math.min(i, a2);
        u.g(this.l, min);
        return min;
    }

    private void N(InterfaceC2858s interfaceC2858s, byte[] bArr, int i, int i2) throws IOException {
        int min = Math.min(i2, this.l.a());
        interfaceC2858s.readFully(bArr, i + min, i2 - min);
        if (min > 0) {
            this.l.q(bArr, i, min);
        }
    }

    public static /* synthetic */ r[] g() {
        return new r[]{new e(t.a.a, 2)};
    }

    private void l(int i) throws E {
        if (this.F == null || this.G == null) {
            throw E.a("Element " + i + " must be in a Cues", null);
        }
    }

    private void m(int i) throws E {
        if (this.x != null) {
            return;
        }
        throw E.a("Element " + i + " must be in a TrackEntry", null);
    }

    private void n() {
        C0968a.i(this.e0);
    }

    private N p(C0988v c0988v, C0988v c0988v2) {
        int i;
        if (this.s == -1 || this.v == -9223372036854775807L || c0988v == null || c0988v.d() == 0 || c0988v2 == null || c0988v2.d() != c0988v.d()) {
            return new N.b(this.v);
        }
        int d = c0988v.d();
        int[] iArr = new int[d];
        long[] jArr = new long[d];
        long[] jArr2 = new long[d];
        long[] jArr3 = new long[d];
        int i2 = 0;
        for (int i3 = 0; i3 < d; i3++) {
            jArr3[i3] = c0988v.c(i3);
            jArr[i3] = this.s + c0988v2.c(i3);
        }
        while (true) {
            i = d - 1;
            if (i2 >= i) {
                break;
            }
            int i4 = i2 + 1;
            iArr[i2] = (int) (jArr[i4] - jArr[i2]);
            jArr2[i2] = jArr3[i4] - jArr3[i2];
            i2 = i4;
        }
        int i5 = i;
        while (i5 > 0 && jArr3[i5] > this.v) {
            i5--;
        }
        iArr[i5] = (int) ((this.s + this.r) - jArr[i5]);
        jArr2[i5] = this.v - jArr3[i5];
        if (i5 < i) {
            C0987u.h("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
            int i6 = i5 + 1;
            iArr = Arrays.copyOf(iArr, i6);
            jArr = Arrays.copyOf(jArr, i6);
            jArr2 = Arrays.copyOf(jArr2, i6);
            jArr3 = Arrays.copyOf(jArr3, i6);
        }
        return new C2848h(iArr, jArr, jArr2, jArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q(ax.I1.e.c r18, long r19, int r21, int r22, int r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            ax.q1.V r2 = r1.V
            r9 = 1
            if (r2 == 0) goto L1c
            r3 = r2
            ax.q1.U r2 = r1.Z
            ax.q1.U$a r8 = r1.k
            r5 = r21
            r6 = r22
            r7 = r23
            r1 = r3
            r3 = r19
            r1.c(r2, r3, r5, r6, r7, r8)
            goto Ld2
        L1c:
            java.lang.String r2 = "S_TEXT/UTF8"
            java.lang.String r3 = r1.c
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L44
            java.lang.String r2 = "S_TEXT/ASS"
            java.lang.String r3 = r1.c
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L44
            java.lang.String r2 = "S_TEXT/SSA"
            java.lang.String r3 = r1.c
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L44
            java.lang.String r2 = "S_TEXT/WEBVTT"
            java.lang.String r3 = r1.c
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L60
        L44:
            int r2 = r0.N
            java.lang.String r3 = "MatroskaExtractor"
            if (r2 <= r9) goto L50
            java.lang.String r2 = "Skipping subtitle sample in laced block."
            ax.S0.C0987u.h(r3, r2)
            goto L60
        L50:
            long r4 = r0.L
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L63
            java.lang.String r2 = "Skipping subtitle sample with no duration."
            ax.S0.C0987u.h(r3, r2)
        L60:
            r2 = r22
            goto La2
        L63:
            java.lang.String r2 = r1.c
            ax.S0.G r3 = r0.m
            byte[] r3 = r3.f()
            H(r2, r4, r3)
            ax.S0.G r2 = r0.m
            int r2 = r2.g()
        L74:
            ax.S0.G r3 = r0.m
            int r3 = r3.j()
            if (r2 >= r3) goto L8f
            ax.S0.G r3 = r0.m
            byte[] r3 = r3.f()
            r3 = r3[r2]
            if (r3 != 0) goto L8c
            ax.S0.G r3 = r0.m
            r3.a0(r2)
            goto L8f
        L8c:
            int r2 = r2 + 1
            goto L74
        L8f:
            ax.q1.U r2 = r1.Z
            ax.S0.G r3 = r0.m
            int r4 = r3.j()
            r2.g(r3, r4)
            ax.S0.G r2 = r0.m
            int r2 = r2.j()
            int r2 = r22 + r2
        La2:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r21 & r3
            if (r3 == 0) goto Lc2
            int r3 = r0.N
            if (r3 <= r9) goto Lb3
            ax.S0.G r3 = r0.p
            r4 = 0
            r3.X(r4)
            goto Lc2
        Lb3:
            ax.S0.G r3 = r0.p
            int r3 = r3.j()
            ax.q1.U r4 = r1.Z
            ax.S0.G r5 = r0.p
            r6 = 2
            r4.b(r5, r3, r6)
            int r2 = r2 + r3
        Lc2:
            r14 = r2
            ax.q1.U r10 = r1.Z
            ax.q1.U$a r1 = r1.k
            r11 = r19
            r13 = r21
            r15 = r23
            r16 = r1
            r10.f(r11, r13, r14, r15, r16)
        Ld2:
            r0.I = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.I1.e.q(ax.I1.e$c, long, int, int, int):void");
    }

    private static int[] s(int[] iArr, int i) {
        return iArr == null ? new int[i] : iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    private int t() {
        int i = this.W;
        F();
        return i;
    }

    private static byte[] v(long j, String str, long j2) {
        C0968a.a(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        return d0.x0(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    protected void A(int i, long j) throws E {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw E.a("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw E.a("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i) {
            case 131:
                w(i).e = (int) j;
                return;
            case 136:
                w(i).X = j == 1;
                return;
            case 155:
                this.L = G(j);
                return;
            case 159:
                w(i).Q = (int) j;
                return;
            case 176:
                w(i).n = (int) j;
                return;
            case 179:
                l(i);
                this.F.a(G(j));
                return;
            case 186:
                w(i).o = (int) j;
                return;
            case 215:
                w(i).d = (int) j;
                return;
            case 231:
                this.E = G(j);
                return;
            case 238:
                this.S = (int) j;
                return;
            case 241:
                if (this.H) {
                    return;
                }
                l(i);
                this.G.a(j);
                this.H = true;
                return;
            case 251:
                this.T = true;
                return;
            case 16871:
                w(i).h = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw E.a("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw E.a("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw E.a("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw E.a("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw E.a("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                this.A = j + this.s;
                return;
            case 21432:
                int i2 = (int) j;
                m(i);
                if (i2 == 0) {
                    this.x.y = 0;
                    return;
                }
                if (i2 == 1) {
                    this.x.y = 2;
                    return;
                } else if (i2 == 3) {
                    this.x.y = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.x.y = 3;
                    return;
                }
            case 21680:
                w(i).q = (int) j;
                return;
            case 21682:
                w(i).s = (int) j;
                return;
            case 21690:
                w(i).r = (int) j;
                return;
            case 21930:
                w(i).W = j == 1;
                return;
            case 21938:
                m(i);
                c cVar = this.x;
                cVar.z = true;
                cVar.p = (int) j;
                return;
            case 21998:
                w(i).g = (int) j;
                return;
            case 22186:
                w(i).T = j;
                return;
            case 22203:
                w(i).U = j;
                return;
            case 25188:
                w(i).R = (int) j;
                return;
            case 30114:
                this.U = j;
                return;
            case 30321:
                m(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    this.x.t = 0;
                    return;
                }
                if (i3 == 1) {
                    this.x.t = 1;
                    return;
                } else if (i3 == 2) {
                    this.x.t = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.x.t = 3;
                    return;
                }
            case 2352003:
                w(i).f = (int) j;
                return;
            case 2807729:
                this.t = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        m(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            this.x.C = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.x.C = 1;
                            return;
                        }
                    case 21946:
                        m(i);
                        int l = C0901j.l((int) j);
                        if (l != -1) {
                            this.x.B = l;
                            return;
                        }
                        return;
                    case 21947:
                        m(i);
                        this.x.z = true;
                        int k = C0901j.k((int) j);
                        if (k != -1) {
                            this.x.A = k;
                            return;
                        }
                        return;
                    case 21948:
                        w(i).D = (int) j;
                        return;
                    case 21949:
                        w(i).E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    protected boolean C(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    protected void I(int i, long j, long j2) throws E {
        n();
        if (i == 160) {
            this.T = false;
            this.U = 0L;
            return;
        }
        if (i == 174) {
            c cVar = new c();
            this.x = cVar;
            cVar.a = this.w;
            return;
        }
        if (i == 187) {
            this.H = false;
            return;
        }
        if (i == 19899) {
            this.z = -1;
            this.A = -1L;
            return;
        }
        if (i == 20533) {
            w(i).i = true;
            return;
        }
        if (i == 21968) {
            w(i).z = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.s;
            if (j3 != -1 && j3 != j) {
                throw E.a("Multiple Segment elements not supported", null);
            }
            this.s = j;
            this.r = j2;
            return;
        }
        if (i == 475249515) {
            this.F = new C0988v();
            this.G = new C0988v();
        } else if (i == 524531317 && !this.y) {
            if (this.d && this.C != -1) {
                this.B = true;
            } else {
                this.e0.h(new N.b(this.v));
                this.y = true;
            }
        }
    }

    protected void J(int i, String str) throws E {
        if (i == 134) {
            w(i).c = str;
            return;
        }
        if (i != 17026) {
            if (i == 21358) {
                w(i).b = str;
                return;
            } else {
                if (i != 2274716) {
                    return;
                }
                w(i).Y = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.w = Objects.equals(str, "webm");
            return;
        }
        throw E.a("DocType " + str + " not supported", null);
    }

    @Override // ax.q1.r
    public final void a(InterfaceC2859t interfaceC2859t) {
        if (this.e) {
            interfaceC2859t = new u(interfaceC2859t, this.f);
        }
        this.e0 = interfaceC2859t;
    }

    @Override // ax.q1.r
    public void b(long j, long j2) {
        this.E = -9223372036854775807L;
        this.J = 0;
        this.a.a();
        this.b.e();
        F();
        for (int i = 0; i < this.c.size(); i++) {
            this.c.valueAt(i).n();
        }
    }

    @Override // ax.q1.r
    public final boolean c(InterfaceC2858s interfaceC2858s) throws IOException {
        return new f().b(interfaceC2858s);
    }

    @Override // ax.q1.r
    public /* synthetic */ r e() {
        return C2857q.b(this);
    }

    @Override // ax.q1.r
    public final int f(InterfaceC2858s interfaceC2858s, M m) throws IOException {
        this.I = false;
        boolean z = true;
        while (z && !this.I) {
            z = this.a.b(interfaceC2858s);
            if (z && D(m, interfaceC2858s.getPosition())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.c.size(); i++) {
            c valueAt = this.c.valueAt(i);
            valueAt.f();
            valueAt.j();
        }
        return -1;
    }

    @Override // ax.q1.r
    public /* synthetic */ List k() {
        return C2857q.a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x023f, code lost:
    
        throw ax.P0.E.a("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void o(int r24, int r25, ax.q1.InterfaceC2858s r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.I1.e.o(int, int, ax.q1.s):void");
    }

    protected void r(int i) throws E {
        n();
        if (i == 160) {
            if (this.J != 2) {
                return;
            }
            c cVar = this.c.get(this.P);
            cVar.f();
            if (this.U > 0 && "A_OPUS".equals(cVar.c)) {
                this.p.Y(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.U).array());
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.N; i3++) {
                i2 += this.O[i3];
            }
            int i4 = 0;
            while (i4 < this.N) {
                long j = this.K + ((cVar.f * i4) / 1000);
                int i5 = this.R;
                if (i4 == 0 && !this.T) {
                    i5 |= 1;
                }
                int i6 = this.O[i4];
                int i7 = i2 - i6;
                q(cVar, j, i5, i6, i7);
                i4++;
                i2 = i7;
            }
            this.J = 0;
            return;
        }
        if (i == 174) {
            c cVar2 = (c) C0968a.i(this.x);
            String str = cVar2.c;
            if (str == null) {
                throw E.a("CodecId is missing in TrackEntry element", null);
            }
            if (B(str)) {
                cVar2.i(this.e0, cVar2.d);
                this.c.put(cVar2.d, cVar2);
            }
            this.x = null;
            return;
        }
        if (i == 19899) {
            int i8 = this.z;
            if (i8 != -1) {
                long j2 = this.A;
                if (j2 != -1) {
                    if (i8 == 475249515) {
                        this.C = j2;
                        return;
                    }
                    return;
                }
            }
            throw E.a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i == 25152) {
            m(i);
            c cVar3 = this.x;
            if (cVar3.i) {
                if (cVar3.k == null) {
                    throw E.a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                cVar3.m = new C0906o(new C0906o.b(C0900i.a, "video/webm", this.x.k.b));
                return;
            }
            return;
        }
        if (i == 28032) {
            m(i);
            c cVar4 = this.x;
            if (cVar4.i && cVar4.j != null) {
                throw E.a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i == 357149030) {
            if (this.t == -9223372036854775807L) {
                this.t = 1000000L;
            }
            long j3 = this.u;
            if (j3 != -9223372036854775807L) {
                this.v = G(j3);
                return;
            }
            return;
        }
        if (i == 374648427) {
            if (this.c.size() == 0) {
                throw E.a("No valid tracks were found", null);
            }
            this.e0.o();
        } else {
            if (i != 475249515) {
                return;
            }
            if (!this.y) {
                this.e0.h(p(this.F, this.G));
                this.y = true;
            }
            this.F = null;
            this.G = null;
        }
    }

    protected void u(int i, double d) throws E {
        if (i == 181) {
            w(i).S = (int) d;
            return;
        }
        if (i == 17545) {
            this.u = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                w(i).F = (float) d;
                break;
            case 21970:
                w(i).G = (float) d;
                break;
            case 21971:
                w(i).H = (float) d;
                break;
            case 21972:
                w(i).I = (float) d;
                break;
            case 21973:
                w(i).J = (float) d;
                break;
            case 21974:
                w(i).K = (float) d;
                break;
            case 21975:
                w(i).L = (float) d;
                break;
            case 21976:
                w(i).M = (float) d;
                break;
            case 21977:
                w(i).N = (float) d;
                break;
            case 21978:
                w(i).O = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        w(i).u = (float) d;
                        break;
                    case 30324:
                        w(i).v = (float) d;
                        break;
                    case 30325:
                        w(i).w = (float) d;
                        break;
                }
        }
    }

    protected c w(int i) throws E {
        m(i);
        return this.x;
    }

    protected int x(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21938:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    protected void y(c cVar, InterfaceC2858s interfaceC2858s, int i) throws IOException {
        if (cVar.h != 1685485123 && cVar.h != 1685480259) {
            interfaceC2858s.n(i);
            return;
        }
        byte[] bArr = new byte[i];
        cVar.P = bArr;
        interfaceC2858s.readFully(bArr, 0, i);
    }

    protected void z(c cVar, int i, InterfaceC2858s interfaceC2858s, int i2) throws IOException {
        if (i != 4 || !"V_VP9".equals(cVar.c)) {
            interfaceC2858s.n(i2);
        } else {
            this.p.X(i2);
            interfaceC2858s.readFully(this.p.f(), 0, i2);
        }
    }

    e(ax.I1.c cVar, int i, t.a aVar) {
        this.s = -1L;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.C = -1L;
        this.D = -1L;
        this.E = -9223372036854775807L;
        this.a = cVar;
        cVar.c(new b());
        this.f = aVar;
        this.d = (i & 1) == 0;
        this.e = (i & 2) == 0;
        this.b = new g();
        this.c = new SparseArray<>();
        this.i = new G(4);
        this.j = new G(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new G(4);
        this.g = new G(h.a);
        this.h = new G(4);
        this.l = new G();
        this.m = new G();
        this.n = new G(8);
        this.o = new G();
        this.p = new G();
        this.O = new int[1];
    }

    @Override // ax.q1.r
    public final void d() {
    }
}
