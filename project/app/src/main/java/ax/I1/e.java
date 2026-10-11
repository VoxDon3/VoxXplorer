/*
 * Decompiled with CFR 0.152.
 */
package ax.I1;

import android.util.Pair;
import android.util.SparseArray;
import ax.I1.a;
import ax.I1.d;
import ax.I1.f;
import ax.I1.g;
import ax.N1.t;
import ax.P0.D;
import ax.P0.E;
import ax.P0.i;
import ax.P0.j;
import ax.P0.o;
import ax.P0.v;
import ax.S0.d0;
import ax.S0.u;
import ax.S0.v;
import ax.q1.G;
import ax.q1.M;
import ax.q1.N;
import ax.q1.U;
import ax.q1.V;
import ax.q1.h;
import ax.q1.q;
import ax.q1.r;
import ax.q1.s;
import ax.q1.t;
import ax.q1.x;
import ax.r7.z;
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

public class e
implements r {
    @Deprecated
    public static final x f0 = new d();
    private static final byte[] g0 = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] h0 = ax.S0.d0.x0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] i0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] j0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    private static final UUID k0 = new UUID(0x100000000001000L, -9223371306706625679L);
    private static final Map<String, Integer> l0;
    private long A;
    private boolean B;
    private long C = -1L;
    private long D = -1L;
    private long E = -9223372036854775807L;
    private v F;
    private v G;
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
    private t e0;
    private final t.a f;
    private final ax.S0.G g;
    private final ax.S0.G h;
    private final ax.S0.G i;
    private final ax.S0.G j;
    private final ax.S0.G k;
    private final ax.S0.G l;
    private final ax.S0.G m;
    private final ax.S0.G n;
    private final ax.S0.G o;
    private final ax.S0.G p;
    private ByteBuffer q;
    private long r;
    private long s = -1L;
    private long t = -9223372036854775807L;
    private long u = -9223372036854775807L;
    private long v = -9223372036854775807L;
    private boolean w;
    private c x;
    private boolean y;
    private int z;

    static {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        l0 = java.util.DesugarCollections.unmodifiableMap(hashMap);
    }

    e(ax.I1.c c8, int n8, t.a a8) {
        this.a = c8;
        c8.c(new b(this));
        this.f = a8;
        boolean bl = false;
        boolean bl2 = (n8 & 1) == 0;
        this.d = bl2;
        bl2 = bl;
        if ((n8 & 2) == 0) {
            bl2 = true;
        }
        this.e = bl2;
        this.b = new g();
        this.c = new SparseArray();
        this.i = new ax.S0.G(4);
        this.j = new ax.S0.G(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new ax.S0.G(4);
        this.g = new ax.S0.G(ax.T0.h.a);
        this.h = new ax.S0.G(4);
        this.l = new ax.S0.G();
        this.m = new ax.S0.G();
        this.n = new ax.S0.G(8);
        this.o = new ax.S0.G();
        this.p = new ax.S0.G();
        this.O = new int[1];
    }

    public e(t.a a8, int n8) {
        this(new a(), n8, a8);
    }

    private static boolean B(String string) {
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 1951062397: {
                if (!string.equals("A_OPUS")) break;
                n8 = 33;
                break;
            }
            case 1950789798: {
                if (!string.equals("A_FLAC")) break;
                n8 = 32;
                break;
            }
            case 1950749482: {
                if (!string.equals("A_EAC3")) break;
                n8 = 31;
                break;
            }
            case 1809237540: {
                if (!string.equals("V_MPEG2")) break;
                n8 = 30;
                break;
            }
            case 1422270023: {
                if (!string.equals("S_TEXT/UTF8")) break;
                n8 = 29;
                break;
            }
            case 1045209816: {
                if (!string.equals("S_TEXT/WEBVTT")) break;
                n8 = 28;
                break;
            }
            case 855502857: {
                if (!string.equals("V_MPEGH/ISO/HEVC")) break;
                n8 = 27;
                break;
            }
            case 738614379: {
                if (!string.equals("S_TEXT/SSA")) break;
                n8 = 26;
                break;
            }
            case 738597099: {
                if (!string.equals("S_TEXT/ASS")) break;
                n8 = 25;
                break;
            }
            case 725957860: {
                if (!string.equals("A_PCM/INT/LIT")) break;
                n8 = 24;
                break;
            }
            case 725948237: {
                if (!string.equals("A_PCM/INT/BIG")) break;
                n8 = 23;
                break;
            }
            case 635596514: {
                if (!string.equals("A_PCM/FLOAT/IEEE")) break;
                n8 = 22;
                break;
            }
            case 542569478: {
                if (!string.equals("A_DTS/EXPRESS")) break;
                n8 = 21;
                break;
            }
            case 444813526: {
                if (!string.equals("V_THEORA")) break;
                n8 = 20;
                break;
            }
            case 99146302: {
                if (!string.equals("S_HDMV/PGS")) break;
                n8 = 19;
                break;
            }
            case 82338134: {
                if (!string.equals("V_VP9")) break;
                n8 = 18;
                break;
            }
            case 82338133: {
                if (!string.equals("V_VP8")) break;
                n8 = 17;
                break;
            }
            case 82318131: {
                if (!string.equals("V_AV1")) break;
                n8 = 16;
                break;
            }
            case 62927045: {
                if (!string.equals("A_DTS")) break;
                n8 = 15;
                break;
            }
            case 62923603: {
                if (!string.equals("A_AC3")) break;
                n8 = 14;
                break;
            }
            case 62923557: {
                if (!string.equals("A_AAC")) break;
                n8 = 13;
                break;
            }
            case -356037306: {
                if (!string.equals("A_DTS/LOSSLESS")) break;
                n8 = 12;
                break;
            }
            case -425012669: {
                if (!string.equals("S_VOBSUB")) break;
                n8 = 11;
                break;
            }
            case -538363109: {
                if (!string.equals("V_MPEG4/ISO/AVC")) break;
                n8 = 10;
                break;
            }
            case -538363189: {
                if (!string.equals("V_MPEG4/ISO/ASP")) break;
                n8 = 9;
                break;
            }
            case -933872740: {
                if (!string.equals("S_DVBSUB")) break;
                n8 = 8;
                break;
            }
            case -1373388978: {
                if (!string.equals("V_MS/VFW/FOURCC")) break;
                n8 = 7;
                break;
            }
            case -1482641357: {
                if (!string.equals("A_MPEG/L3")) break;
                n8 = 6;
                break;
            }
            case -1482641358: {
                if (!string.equals("A_MPEG/L2")) break;
                n8 = 5;
                break;
            }
            case -1730367663: {
                if (!string.equals("A_VORBIS")) break;
                n8 = 4;
                break;
            }
            case -1784763192: {
                if (!string.equals("A_TRUEHD")) break;
                n8 = 3;
                break;
            }
            case -1985379776: {
                if (!string.equals("A_MS/ACM")) break;
                n8 = 2;
                break;
            }
            case -2095575984: {
                if (!string.equals("V_MPEG4/ISO/SP")) break;
                n8 = 1;
                break;
            }
            case -2095576542: {
                if (!string.equals("V_MPEG4/ISO/AP")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
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
        }
        return true;
    }

    private boolean D(M m8, long l8) {
        if (this.B) {
            this.D = l8;
            m8.a = this.C;
            this.B = false;
            return true;
        }
        if (this.y && (l8 = this.D) != -1L) {
            m8.a = l8;
            this.D = -1L;
            return true;
        }
        return false;
    }

    private void E(s s8, int n8) throws IOException {
        if (this.i.j() >= n8) {
            return;
        }
        if (this.i.b() < n8) {
            ax.S0.G g8 = this.i;
            g8.d(Math.max(g8.b() * 2, n8));
        }
        s8.readFully(this.i.f(), this.i.j(), n8 - this.i.j());
        this.i.a0(n8);
    }

    private void F() {
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = false;
        this.Z = false;
        this.a0 = false;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = false;
        this.l.X(0);
    }

    private long G(long l8) throws E {
        long l9 = this.t;
        if (l9 != -9223372036854775807L) {
            return ax.S0.d0.p1(l8, l9, 1000L);
        }
        throw ax.P0.E.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void H(String object, long l8, byte[] byArray) {
        object.getClass();
        int n8 = -1;
        switch (((String)object).hashCode()) {
            default: {
                break;
            }
            case 1422270023: {
                if (!((String)object).equals("S_TEXT/UTF8")) break;
                n8 = 3;
                break;
            }
            case 1045209816: {
                if (!((String)object).equals("S_TEXT/WEBVTT")) break;
                n8 = 2;
                break;
            }
            case 738614379: {
                if (!((String)object).equals("S_TEXT/SSA")) break;
                n8 = 1;
                break;
            }
            case 738597099: {
                if (!((String)object).equals("S_TEXT/ASS")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                throw new IllegalArgumentException();
            }
            case 3: {
                object = ax.I1.e.v(l8, "%02d:%02d:%02d,%03d", 1000L);
                n8 = 19;
                break;
            }
            case 2: {
                object = ax.I1.e.v(l8, "%02d:%02d:%02d.%03d", 1000L);
                n8 = 25;
                break;
            }
            case 0: 
            case 1: {
                object = ax.I1.e.v(l8, "%01d:%02d:%02d:%02d", 10000L);
                n8 = 21;
            }
        }
        System.arraycopy(object, 0, byArray, n8, ((Object)object).length);
    }

    private int K(s s8, c c8, int n8, boolean bl) throws IOException {
        if ("S_TEXT/UTF8".equals(c8.c)) {
            this.L(s8, g0, n8);
            return this.t();
        }
        if (!"S_TEXT/ASS".equals(c8.c) && !"S_TEXT/SSA".equals(c8.c)) {
            Object object;
            int n9;
            int n10;
            if ("S_TEXT/WEBVTT".equals(c8.c)) {
                this.L(s8, j0, n8);
                return this.t();
            }
            U u8 = c8.Z;
            boolean bl2 = this.Y;
            boolean bl3 = true;
            if (!bl2) {
                if (c8.i) {
                    this.R &= 0xBFFFFFFF;
                    bl2 = this.Z;
                    n10 = 128;
                    if (!bl2) {
                        s8.readFully(this.i.f(), 0, 1);
                        ++this.V;
                        if ((this.i.f()[0] & 0x80) != 128) {
                            this.c0 = this.i.f()[0];
                            this.Z = true;
                        } else {
                            throw ax.P0.E.a("Extension bit is set in signal byte", null);
                        }
                    }
                    if (((n9 = this.c0) & 1) == 1) {
                        n9 = (n9 & 2) == 2 ? 1 : 0;
                        this.R |= 0x40000000;
                        if (!this.d0) {
                            s8.readFully(this.n.f(), 0, 8);
                            this.V += 8;
                            this.d0 = true;
                            object = this.i.f();
                            if (n9 == 0) {
                                n10 = 0;
                            }
                            object[0] = (byte)(n10 | 8);
                            this.i.b0(0);
                            u8.b(this.i, 1, 1);
                            ++this.W;
                            this.n.b0(0);
                            u8.b(this.n, 8, 1);
                            this.W += 8;
                        }
                        if (n9 != 0) {
                            int n11;
                            if (!this.a0) {
                                s8.readFully(this.i.f(), 0, 1);
                                ++this.V;
                                this.i.b0(0);
                                this.b0 = this.i.M();
                                this.a0 = true;
                            }
                            n9 = this.b0 * 4;
                            this.i.X(n9);
                            s8.readFully(this.i.f(), 0, n9);
                            this.V += n9;
                            short s9 = (short)(this.b0 / 2 + 1);
                            int n12 = s9 * 6 + 2;
                            object = this.q;
                            if (object == null || object.capacity() < n12) {
                                this.q = ByteBuffer.allocate(n12);
                            }
                            this.q.position(0);
                            this.q.putShort(s9);
                            n10 = 0;
                            for (n9 = 0; n9 < (n11 = this.b0); ++n9) {
                                n11 = this.i.Q();
                                if (n9 % 2 == 0) {
                                    this.q.putShort((short)(n11 - n10));
                                } else {
                                    this.q.putInt(n11 - n10);
                                }
                                n10 = n11;
                            }
                            n9 = n8 - this.V - n10;
                            if (n11 % 2 == 1) {
                                this.q.putInt(n9);
                            } else {
                                this.q.putShort((short)n9);
                                this.q.putInt(0);
                            }
                            this.o.Z(this.q.array(), n12);
                            u8.b(this.o, n12, 1);
                            this.W += n12;
                        }
                    }
                } else {
                    object = c8.j;
                    if (object != null) {
                        this.l.Z((byte[])object, ((byte[])object).length);
                    }
                }
                if (c8.o(bl)) {
                    this.R |= 0x10000000;
                    this.p.X(0);
                    n9 = this.l.j() + n8 - this.V;
                    this.i.X(4);
                    this.i.f()[0] = (byte)(n9 >> 24 & 0xFF);
                    this.i.f()[1] = (byte)(n9 >> 16 & 0xFF);
                    this.i.f()[2] = (byte)(n9 >> 8 & 0xFF);
                    this.i.f()[3] = (byte)(n9 & 0xFF);
                    u8.b(this.i, 4, 2);
                    this.W += 4;
                }
                this.Y = true;
            }
            n8 += this.l.j();
            if (!"V_MPEG4/ISO/AVC".equals(c8.c) && !"V_MPEGH/ISO/HEVC".equals(c8.c)) {
                if (c8.V != null) {
                    bl = this.l.j() == 0 ? bl3 : false;
                    ax.S0.a.g(bl);
                    c8.V.d(s8);
                }
                while ((n9 = this.V) < n8) {
                    n9 = this.M(s8, u8, n8 - n9);
                    this.V += n9;
                    this.W += n9;
                }
            } else {
                object = this.h.f();
                object[0] = 0;
                object[1] = 0;
                object[2] = 0;
                n9 = c8.a0;
                while (this.V < n8) {
                    n10 = this.X;
                    if (n10 == 0) {
                        this.N(s8, (byte[])object, 4 - n9, n9);
                        this.V += n9;
                        this.h.b0(0);
                        this.X = this.h.Q();
                        this.g.b0(0);
                        u8.g(this.g, 4);
                        this.W += 4;
                        continue;
                    }
                    n10 = this.M(s8, u8, n10);
                    this.V += n10;
                    this.W += n10;
                    this.X -= n10;
                }
            }
            if ("A_VORBIS".equals(c8.c)) {
                this.j.b0(0);
                u8.g(this.j, 4);
                this.W += 4;
            }
            return this.t();
        }
        this.L(s8, i0, n8);
        return this.t();
    }

    private void L(s s8, byte[] byArray, int n8) throws IOException {
        int n9 = byArray.length + n8;
        if (this.m.b() < n9) {
            this.m.Y(Arrays.copyOf(byArray, n9 + n8));
        } else {
            System.arraycopy(byArray, 0, this.m.f(), 0, byArray.length);
        }
        s8.readFully(this.m.f(), byArray.length, n8);
        this.m.b0(0);
        this.m.a0(n9);
    }

    private int M(s s8, U u8, int n8) throws IOException {
        int n9 = this.l.a();
        if (n9 > 0) {
            n8 = Math.min(n8, n9);
            u8.g(this.l, n8);
            return n8;
        }
        return u8.a(s8, n8, false);
    }

    private void N(s s8, byte[] byArray, int n8, int n9) throws IOException {
        int n10 = Math.min(n9, this.l.a());
        s8.readFully(byArray, n8 + n10, n9 - n10);
        if (n10 > 0) {
            this.l.q(byArray, n8, n10);
        }
    }

    public static /* synthetic */ r[] g() {
        return new r[]{new e(t.a.a, 2)};
    }

    static /* synthetic */ byte[] h() {
        return h0;
    }

    static /* synthetic */ Map i() {
        return l0;
    }

    private void l(int n8) throws E {
        if (this.F != null && this.G != null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Element ");
        stringBuilder.append(n8);
        stringBuilder.append(" must be in a Cues");
        throw ax.P0.E.a(stringBuilder.toString(), null);
    }

    private void m(int n8) throws E {
        if (this.x != null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Element ");
        stringBuilder.append(n8);
        stringBuilder.append(" must be in a TrackEntry");
        throw ax.P0.E.a(stringBuilder.toString(), null);
    }

    private void n() {
        ax.S0.a.i(this.e0);
    }

    private N p(v object, v object2) {
        if (this.s != -1L && this.v != -9223372036854775807L && object != null && ((v)object).d() != 0 && object2 != null && ((v)object2).d() == ((v)object).d()) {
            int n8;
            int n9 = ((v)object).d();
            int[] nArray = new int[n9];
            long[] lArray = new long[n9];
            long[] lArray2 = new long[n9];
            long[] lArray3 = new long[n9];
            int n10 = 0;
            int n11 = 0;
            while (true) {
                n8 = n10;
                if (n11 >= n9) break;
                lArray3[n11] = ((v)object).c(n11);
                lArray[n11] = this.s + ((v)object2).c(n11);
                ++n11;
            }
            while (n8 < (n11 = n9 - 1)) {
                n11 = n8 + 1;
                nArray[n8] = (int)(lArray[n11] - lArray[n8]);
                lArray2[n8] = lArray3[n11] - lArray3[n8];
                n8 = n11;
            }
            for (n8 = n11; n8 > 0 && lArray3[n8] > this.v; --n8) {
            }
            nArray[n8] = (int)(this.s + this.r - lArray[n8]);
            lArray2[n8] = this.v - lArray3[n8];
            int[] nArray2 = nArray;
            long[] lArray4 = lArray;
            object2 = lArray2;
            object = lArray3;
            if (n8 < n11) {
                ax.S0.u.h("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
                nArray2 = Arrays.copyOf(nArray, ++n8);
                lArray4 = Arrays.copyOf(lArray, n8);
                object2 = Arrays.copyOf(lArray2, n8);
                object = Arrays.copyOf(lArray3, n8);
            }
            return new h(nArray2, lArray4, (long[])object2, (long[])object);
        }
        return new N.b(this.v);
    }

    private void q(c c8, long l8, int n8, int n9, int n10) {
        Object object = c8.V;
        if (object != null) {
            ((V)object).c(c8.Z, l8, n8, n9, n10, c8.k);
        } else {
            int n11;
            if ("S_TEXT/UTF8".equals(c8.c) || "S_TEXT/ASS".equals(c8.c) || "S_TEXT/SSA".equals(c8.c) || "S_TEXT/WEBVTT".equals(c8.c)) {
                if (this.N > 1) {
                    ax.S0.u.h("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long l9 = this.L;
                    if (l9 == -9223372036854775807L) {
                        ax.S0.u.h("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        ax.I1.e.H(c8.c, l9, this.m.f());
                        for (n11 = this.m.g(); n11 < this.m.j(); ++n11) {
                            if (this.m.f()[n11] != 0) continue;
                            this.m.a0(n11);
                            break;
                        }
                        U u8 = c8.Z;
                        object = this.m;
                        u8.g((ax.S0.G)object, ((ax.S0.G)object).j());
                        n9 += this.m.j();
                    }
                }
            }
            n11 = n9;
            if ((n8 & 0x10000000) != 0) {
                if (this.N > 1) {
                    this.p.X(0);
                    n11 = n9;
                } else {
                    n11 = this.p.j();
                    c8.Z.b(this.p, n11, 2);
                    n11 = n9 + n11;
                }
            }
            c8.Z.f(l8, n8, n11, n10, c8.k);
        }
        this.I = true;
    }

    private static int[] s(int[] nArray, int n8) {
        if (nArray == null) {
            return new int[n8];
        }
        if (nArray.length >= n8) {
            return nArray;
        }
        return new int[Math.max(nArray.length * 2, n8)];
    }

    private int t() {
        int n8 = this.W;
        this.F();
        return n8;
    }

    private static byte[] v(long l8, String string, long l9) {
        boolean bl = l8 != -9223372036854775807L;
        ax.S0.a.a(bl);
        int n8 = (int)(l8 / 3600000000L);
        int n9 = (int)((l8 -= (long)n8 * 3600000000L) / 60000000L);
        int n10 = (int)((l8 -= (long)n9 * 60000000L) / 1000000L);
        int n11 = (int)((l8 - (long)n10 * 1000000L) / l9);
        return ax.S0.d0.x0(String.format(Locale.US, string, n8, n9, n10, n11));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void A(int n8, long l8) throws E {
        if (n8 != 20529) {
            if (n8 != 20530) {
                boolean bl = false;
                boolean bl2 = false;
                switch (n8) {
                    default: {
                        switch (n8) {
                            default: {
                                return;
                            }
                            case 21949: {
                                this.w((int)n8).E = (int)l8;
                                return;
                            }
                            case 21948: {
                                this.w((int)n8).D = (int)l8;
                                return;
                            }
                            case 21947: {
                                this.m(n8);
                                this.x.z = true;
                                n8 = ax.P0.j.k((int)l8);
                                if (n8 == -1) return;
                                this.x.A = n8;
                                return;
                            }
                            case 21946: {
                                this.m(n8);
                                n8 = ax.P0.j.l((int)l8);
                                if (n8 == -1) return;
                                this.x.B = n8;
                                return;
                            }
                            case 21945: {
                                this.m(n8);
                                n8 = (int)l8;
                                if (n8 != 1) {
                                    if (n8 != 2) return;
                                    this.x.C = 1;
                                    return;
                                }
                                this.x.C = 2;
                                return;
                            }
                        }
                    }
                    case 2807729: {
                        this.t = l8;
                        return;
                    }
                    case 2352003: {
                        this.w((int)n8).f = (int)l8;
                        return;
                    }
                    case 30321: {
                        this.m(n8);
                        n8 = (int)l8;
                        if (n8 != 0) {
                            if (n8 != 1) {
                                if (n8 != 2) {
                                    if (n8 != 3) return;
                                    this.x.t = 3;
                                    return;
                                }
                                this.x.t = 2;
                                return;
                            }
                            this.x.t = 1;
                            return;
                        }
                        this.x.t = 0;
                        return;
                    }
                    case 30114: {
                        this.U = l8;
                        return;
                    }
                    case 25188: {
                        this.w((int)n8).R = (int)l8;
                        return;
                    }
                    case 22203: {
                        this.w((int)n8).U = l8;
                        return;
                    }
                    case 22186: {
                        this.w((int)n8).T = l8;
                        return;
                    }
                    case 21998: {
                        this.w((int)n8).g = (int)l8;
                        return;
                    }
                    case 21938: {
                        this.m(n8);
                        c c8 = this.x;
                        c8.z = true;
                        c8.p = (int)l8;
                        return;
                    }
                    case 21930: {
                        c c9 = this.w(n8);
                        bl = bl2;
                        if (l8 == 1L) {
                            bl = true;
                        }
                        c9.W = bl;
                        return;
                    }
                    case 21690: {
                        this.w((int)n8).r = (int)l8;
                        return;
                    }
                    case 21682: {
                        this.w((int)n8).s = (int)l8;
                        return;
                    }
                    case 21680: {
                        this.w((int)n8).q = (int)l8;
                        return;
                    }
                    case 21432: {
                        int n9 = (int)l8;
                        this.m(n8);
                        if (n9 != 0) {
                            if (n9 != 1) {
                                if (n9 != 3) {
                                    if (n9 != 15) return;
                                    this.x.y = 3;
                                    return;
                                }
                                this.x.y = 1;
                                return;
                            }
                            this.x.y = 2;
                            return;
                        }
                        this.x.y = 0;
                        return;
                    }
                    case 21420: {
                        this.A = l8 + this.s;
                        return;
                    }
                    case 18408: {
                        if (l8 == 1L) return;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("AESSettingsCipherMode ");
                        stringBuilder.append(l8);
                        stringBuilder.append(" not supported");
                        throw ax.P0.E.a(stringBuilder.toString(), null);
                    }
                    case 18401: {
                        if (l8 == 5L) return;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("ContentEncAlgo ");
                        stringBuilder.append(l8);
                        stringBuilder.append(" not supported");
                        throw ax.P0.E.a(stringBuilder.toString(), null);
                    }
                    case 17143: {
                        if (l8 == 1L) return;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("EBMLReadVersion ");
                        stringBuilder.append(l8);
                        stringBuilder.append(" not supported");
                        throw ax.P0.E.a(stringBuilder.toString(), null);
                    }
                    case 17029: {
                        if (l8 >= 1L && l8 <= 2L) return;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("DocTypeReadVersion ");
                        stringBuilder.append(l8);
                        stringBuilder.append(" not supported");
                        throw ax.P0.E.a(stringBuilder.toString(), null);
                    }
                    case 16980: {
                        if (l8 == 3L) return;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("ContentCompAlgo ");
                        stringBuilder.append(l8);
                        stringBuilder.append(" not supported");
                        throw ax.P0.E.a(stringBuilder.toString(), null);
                    }
                    case 16871: {
                        ax.I1.e$c.c(this.w(n8), (int)l8);
                        return;
                    }
                    case 251: {
                        this.T = true;
                        return;
                    }
                    case 241: {
                        if (this.H) return;
                        this.l(n8);
                        this.G.a(l8);
                        this.H = true;
                        return;
                    }
                    case 238: {
                        this.S = (int)l8;
                        return;
                    }
                    case 231: {
                        this.E = this.G(l8);
                        return;
                    }
                    case 215: {
                        this.w((int)n8).d = (int)l8;
                        return;
                    }
                    case 186: {
                        this.w((int)n8).o = (int)l8;
                        return;
                    }
                    case 179: {
                        this.l(n8);
                        this.F.a(this.G(l8));
                        return;
                    }
                    case 176: {
                        this.w((int)n8).n = (int)l8;
                        return;
                    }
                    case 159: {
                        this.w((int)n8).Q = (int)l8;
                        return;
                    }
                    case 155: {
                        this.L = this.G(l8);
                        return;
                    }
                    case 136: {
                        c c10 = this.w(n8);
                        if (l8 == 1L) {
                            bl = true;
                        }
                        c10.X = bl;
                        return;
                    }
                    case 131: {
                        this.w((int)n8).e = (int)l8;
                        return;
                    }
                }
            }
            if (l8 == 1L) return;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ContentEncodingScope ");
            stringBuilder.append(l8);
            stringBuilder.append(" not supported");
            throw ax.P0.E.a(stringBuilder.toString(), null);
        }
        if (l8 == 0L) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ContentEncodingOrder ");
        stringBuilder.append(l8);
        stringBuilder.append(" not supported");
        throw ax.P0.E.a(stringBuilder.toString(), null);
    }

    protected boolean C(int n8) {
        return n8 == 357149030 || n8 == 524531317 || n8 == 475249515 || n8 == 374648427;
        {
        }
    }

    protected void I(int n8, long l8, long l9) throws E {
        this.n();
        if (n8 != 160) {
            c c8;
            if (n8 != 174) {
                if (n8 != 187) {
                    if (n8 != 19899) {
                        if (n8 != 20533) {
                            if (n8 != 21968) {
                                if (n8 != 408125543) {
                                    if (n8 != 475249515) {
                                        if (n8 == 524531317 && !this.y) {
                                            if (this.d && this.C != -1L) {
                                                this.B = true;
                                                return;
                                            }
                                            this.e0.h(new N.b(this.v));
                                            this.y = true;
                                        }
                                        return;
                                    }
                                    this.F = new v();
                                    this.G = new v();
                                    return;
                                }
                                long l10 = this.s;
                                if (l10 != -1L && l10 != l8) {
                                    throw ax.P0.E.a("Multiple Segment elements not supported", null);
                                }
                                this.s = l8;
                                this.r = l9;
                                return;
                            }
                            this.w((int)n8).z = true;
                            return;
                        }
                        this.w((int)n8).i = true;
                        return;
                    }
                    this.z = -1;
                    this.A = -1L;
                    return;
                }
                this.H = false;
                return;
            }
            this.x = c8 = new c();
            c8.a = this.w;
            return;
        }
        this.T = false;
        this.U = 0L;
    }

    protected void J(int n8, String string) throws E {
        if (n8 != 134) {
            if (n8 != 17026) {
                if (n8 != 21358) {
                    if (n8 != 2274716) {
                        return;
                    }
                    ax.I1.e$c.d(this.w(n8), string);
                    return;
                }
                this.w((int)n8).b = string;
                return;
            }
            if (!"webm".equals(string) && !"matroska".equals(string)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("DocType ");
                stringBuilder.append(string);
                stringBuilder.append(" not supported");
                throw ax.P0.E.a(stringBuilder.toString(), null);
            }
            this.w = j.Objects.equals((Object)string, (Object)"webm");
            return;
        }
        this.w((int)n8).c = string;
    }

    @Override
    public final void a(t t8) {
        t t9 = t8;
        if (this.e) {
            t9 = new ax.N1.u(t8, this.f);
        }
        this.e0 = t9;
    }

    @Override
    public void b(long l8, long l9) {
        this.E = -9223372036854775807L;
        this.J = 0;
        this.a.a();
        this.b.e();
        this.F();
        for (int i8 = 0; i8 < this.c.size(); ++i8) {
            ((c)this.c.valueAt(i8)).n();
        }
    }

    @Override
    public final boolean c(s s8) throws IOException {
        return new f().b(s8);
    }

    @Override
    public final void d() {
    }

    @Override
    public /* synthetic */ r e() {
        return ax.q1.q.b(this);
    }

    @Override
    public final int f(s object, M m8) throws IOException {
        int n8 = 0;
        this.I = false;
        boolean bl = true;
        while (bl && !this.I) {
            boolean bl2;
            bl = bl2 = this.a.b((s)object);
            if (!bl2) continue;
            bl = bl2;
            if (!this.D(m8, object.getPosition())) continue;
            return 1;
        }
        if (!bl) {
            while (n8 < this.c.size()) {
                object = (c)this.c.valueAt(n8);
                ((c)object).f();
                ((c)object).j();
                ++n8;
            }
            return -1;
        }
        return 0;
    }

    public /* synthetic */ List k() {
        return ax.q1.q.a(this);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    protected void o(int var1_1, int var2_2, s var3_3) throws IOException {
        if (var1_1 != 161 && var1_1 != 163) {
            if (var1_1 != 165) {
                if (var1_1 != 16877) {
                    if (var1_1 != 16981) {
                        if (var1_1 != 18402) {
                            if (var1_1 != 21419) {
                                if (var1_1 != 25506) {
                                    if (var1_1 == 30322) {
                                        this.m(var1_1);
                                        var16_4 = this.x;
                                        var15_8 = new byte[var2_2];
                                        var16_4.x = var15_8;
                                        var3_3.readFully(var15_8, 0, var2_2);
                                        return;
                                    }
                                    var3_3 = new StringBuilder();
                                    var3_3.append("Unexpected id: ");
                                    var3_3.append(var1_1);
                                    throw ax.P0.E.a(var3_3.toString(), null);
                                }
                                this.m(var1_1);
                                var16_5 = this.x;
                                var15_9 = new byte[var2_2];
                                var16_5.l = var15_9;
                                var3_3.readFully(var15_9, 0, var2_2);
                                return;
                            }
                            Arrays.fill(this.k.f(), (byte)0);
                            var3_3.readFully(this.k.f(), 4 - var2_2, var2_2);
                            this.k.b0(0);
                            this.z = (int)this.k.O();
                            return;
                        }
                        var15_10 = new byte[var2_2];
                        var3_3.readFully(var15_10, 0, var2_2);
                        this.w((int)var1_1).k = new U.a(1, var15_10, 0, 0);
                        return;
                    }
                    this.m(var1_1);
                    var16_6 = this.x;
                    var15_11 = new byte[var2_2];
                    var16_6.j = var15_11;
                    var3_3.readFully(var15_11, 0, var2_2);
                    return;
                }
                this.y(this.w(var1_1), (s)var3_3, var2_2);
                return;
            }
            if (this.J == 2) {
                this.z((c)this.c.get(this.P), this.S, (s)var3_3, var2_2);
                return;
            }
        } else {
            if (this.J == 0) {
                this.P = (int)this.b.d((s)var3_3, false, true, 8);
                this.Q = this.b.b();
                this.L = -9223372036854775807L;
                this.J = 1;
                this.i.X(0);
            }
            if ((var15_12 = (c)this.c.get(this.P)) == null) {
                var3_3.n(var2_2 - this.Q);
                this.J = 0;
                return;
            }
            ax.I1.e$c.a(var15_12);
            if (this.J == 1) {
                this.E((s)var3_3, 3);
                var5_13 = (this.i.f()[2] & 6) >> 1;
                if (var5_13 == 0) {
                    this.N = 1;
                    this.O = var16_7 /* !! */  = ax.I1.e.s(this.O, 1);
                    var16_7 /* !! */ [0] = var2_2 - this.Q - 3;
                } else {
                    this.E((s)var3_3, 4);
                    this.N = var4_14 = (this.i.f()[3] & 255) + 1;
                    this.O = var16_7 /* !! */  = ax.I1.e.s(this.O, var4_14);
                    if (var5_13 == 2) {
                        var4_14 = this.Q;
                        var5_13 = this.N;
                        Arrays.fill(var16_7 /* !! */ , 0, var5_13, (var2_2 - var4_14 - 4) / var5_13);
                    } else if (var5_13 == 1) {
                        var5_13 = 0;
                        var4_14 = 4;
                        block0: for (var6_15 = 0; var6_15 < (var7_16 = this.N) - 1; ++var6_15) {
                            this.O[var6_15] = 0;
                            var7_16 = var4_14;
                            while (true) {
                                var4_14 = var7_16 + 1;
                                this.E((s)var3_3, var4_14);
                                var7_16 = this.i.f()[var7_16] & 255;
                                var16_7 /* !! */  = this.O;
                                var16_7 /* !! */ [var6_15] = var8_17 = var16_7 /* !! */ [var6_15] + var7_16;
                                if (var7_16 != 255) {
                                    var5_13 += var8_17;
                                    continue block0;
                                }
                                var7_16 = var4_14;
                            }
                        }
                        this.O[var7_16 - 1] = var2_2 - this.Q - var4_14 - var5_13;
                    } else {
                        if (var5_13 != 3) {
                            var3_3 = new StringBuilder();
                            var3_3.append("Unexpected lacing value: ");
                            var3_3.append(var5_13);
                            throw ax.P0.E.a(var3_3.toString(), null);
                        }
                        var4_14 = 0;
                        var6_15 = 0;
                        var5_13 = 4;
                        while (var4_14 < (var7_16 = this.N) - 1) {
                            this.O[var4_14] = 0;
                            var8_17 = var5_13 + 1;
                            this.E((s)var3_3, var8_17);
                            if (this.i.f()[var5_13] != 0) {
                                for (var7_16 = 0; var7_16 < 8; ++var7_16) {
                                    var10_19 = 1 << 7 - var7_16;
                                    if ((this.i.f()[var5_13] & var10_19) == 0) continue;
                                    var9_18 = var8_17 + var7_16;
                                    this.E((s)var3_3, var9_18);
                                    var16_7 /* !! */  = this.i.f();
                                    var8_17 = var5_13 + 1;
                                    var11_20 = var16_7 /* !! */ [var5_13] & 255 & ~var10_19;
                                    var5_13 = var8_17;
                                    while ((var8_17 = var5_13) < var9_18) {
                                        var16_7 /* !! */  = this.i.f();
                                        var5_13 = var8_17 + 1;
                                        var11_20 = var11_20 << 8 | (long)(var16_7 /* !! */ [var8_17] & 255);
                                    }
                                    var8_17 = var4_14;
                                    var13_21 = var11_20;
                                    var4_14 = var9_18;
                                    var5_13 = var8_17;
                                    if (var8_17 > 0) {
                                        var13_21 = var11_20 - ((1L << var7_16 * 7 + 6) - 1L);
                                        var5_13 = var8_17;
                                        var4_14 = var9_18;
                                    }
lbl131:
                                    // 4 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                var5_13 = var4_14;
                                var13_21 = 0L;
                                var4_14 = var8_17;
                                ** continue;
                                var7_16 = var4_14;
                                if (var13_21 >= -2147483648L && var13_21 <= 0x7FFFFFFFL) {
                                    var4_14 = (int)var13_21;
                                    var16_7 /* !! */  = this.O;
                                    if (var5_13 != 0) {
                                        var4_14 += var16_7 /* !! */ [var5_13 - 1];
                                    }
                                    var16_7 /* !! */ [var5_13] = var4_14;
                                    var6_15 += var4_14;
                                    var4_14 = var5_13 + 1;
                                    var5_13 = var7_16;
                                    continue;
                                }
                                throw ax.P0.E.a("EBML lacing sample size out of range.", null);
                            }
                            throw ax.P0.E.a("No valid varint length mask found", null);
                        }
                        this.O[var7_16 - 1] = var2_2 - this.Q - var5_13 - var6_15;
                    }
                }
                var4_14 = this.i.f()[0];
                var2_2 = this.i.f()[1];
                this.K = this.E + this.G(var4_14 << 8 | var2_2 & 255);
                var2_2 = var15_12.e != 2 && (var1_1 != 163 || (this.i.f()[2] & 128) != 128) ? 0 : 1;
                this.R = var2_2;
                this.J = 2;
                this.M = 0;
            }
            if (var1_1 == 163) {
                while ((var1_1 = this.M) < this.N) {
                    var1_1 = this.K((s)var3_3, var15_12, this.O[var1_1], false);
                    this.q(var15_12, this.K + (long)(this.M * var15_12.f / 1000), this.R, var1_1, 0);
                    ++this.M;
                }
                this.J = 0;
                return;
            }
            while ((var1_1 = this.M++) < this.N) {
                var16_7 /* !! */  = this.O;
                var16_7 /* !! */ [var1_1] = this.K((s)var3_3, var15_12, var16_7 /* !! */ [var1_1], true);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void r(int n8) throws E {
        int n9;
        this.n();
        if (n8 != 160) {
            if (n8 != 174) {
                long l8;
                if (n8 != 19899) {
                    if (n8 != 25152) {
                        if (n8 != 28032) {
                            long l9;
                            if (n8 != 357149030) {
                                if (n8 != 374648427) {
                                    if (n8 != 475249515) return;
                                    if (!this.y) {
                                        this.e0.h(this.p(this.F, this.G));
                                        this.y = true;
                                    }
                                    this.F = null;
                                    this.G = null;
                                    return;
                                }
                                if (this.c.size() == 0) throw ax.P0.E.a("No valid tracks were found", null);
                                this.e0.o();
                                return;
                            }
                            if (this.t == -9223372036854775807L) {
                                this.t = 1000000L;
                            }
                            if ((l9 = this.u) == -9223372036854775807L) return;
                            this.v = this.G(l9);
                            return;
                        }
                        this.m(n8);
                        c c8 = this.x;
                        if (!c8.i || c8.j == null) return;
                        throw ax.P0.E.a("Combining encryption and compression is not supported", null);
                    }
                    this.m(n8);
                    c c9 = this.x;
                    if (!c9.i) return;
                    if (c9.k == null) throw ax.P0.E.a("Encrypted Track found but ContentEncKeyID was not found", null);
                    c9.m = new o(new o.b(ax.P0.i.a, "video/webm", this.x.k.b));
                    return;
                }
                n8 = this.z;
                if (n8 == -1 || (l8 = this.A) == -1L) throw ax.P0.E.a("Mandatory element SeekID or SeekPosition not found", null);
                if (n8 != 475249515) return;
                this.C = l8;
                return;
            }
            c c10 = ax.S0.a.i(this.x);
            String string = c10.c;
            if (string == null) throw ax.P0.E.a("CodecId is missing in TrackEntry element", null);
            if (ax.I1.e.B(string)) {
                c10.i(this.e0, c10.d);
                this.c.put(c10.d, (Object)c10);
            }
            this.x = null;
            return;
        }
        if (this.J != 2) {
            return;
        }
        c c11 = (c)this.c.get(this.P);
        c11.f();
        if (this.U > 0L && "A_OPUS".equals(c11.c)) {
            this.p.Y(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.U).array());
        }
        n8 = 0;
        for (n9 = 0; n9 < this.N; ++n9) {
            n8 += this.O[n9];
        }
        for (n9 = 0; n9 < this.N; ++n9) {
            int n10;
            long l10 = this.K;
            long l11 = c11.f * n9 / 1000;
            int n11 = n10 = this.R;
            if (n9 == 0) {
                n11 = n10;
                if (!this.T) {
                    n11 = n10 | 1;
                }
            }
            n10 = this.O[n9];
            this.q(c11, l10 + l11, n11, n10, n8 -= n10);
        }
        this.J = 0;
    }

    protected void u(int n8, double d8) throws E {
        if (n8 != 181) {
            if (n8 != 17545) {
                switch (n8) {
                    default: {
                        switch (n8) {
                            default: {
                                return;
                            }
                            case 30325: {
                                this.w((int)n8).w = (float)d8;
                                return;
                            }
                            case 30324: {
                                this.w((int)n8).v = (float)d8;
                                return;
                            }
                            case 30323: 
                        }
                        this.w((int)n8).u = (float)d8;
                        return;
                    }
                    case 21978: {
                        this.w((int)n8).O = (float)d8;
                        return;
                    }
                    case 21977: {
                        this.w((int)n8).N = (float)d8;
                        return;
                    }
                    case 21976: {
                        this.w((int)n8).M = (float)d8;
                        return;
                    }
                    case 21975: {
                        this.w((int)n8).L = (float)d8;
                        return;
                    }
                    case 21974: {
                        this.w((int)n8).K = (float)d8;
                        return;
                    }
                    case 21973: {
                        this.w((int)n8).J = (float)d8;
                        return;
                    }
                    case 21972: {
                        this.w((int)n8).I = (float)d8;
                        return;
                    }
                    case 21971: {
                        this.w((int)n8).H = (float)d8;
                        return;
                    }
                    case 21970: {
                        this.w((int)n8).G = (float)d8;
                        return;
                    }
                    case 21969: 
                }
                this.w((int)n8).F = (float)d8;
                return;
            }
            this.u = (long)d8;
            return;
        }
        this.w((int)n8).S = (int)d8;
    }

    protected c w(int n8) throws E {
        this.m(n8);
        return this.x;
    }

    protected int x(int n8) {
        switch (n8) {
            default: {
                return 0;
            }
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
            case 30325: {
                return 5;
            }
            case 161: 
            case 163: 
            case 165: 
            case 16877: 
            case 16981: 
            case 18402: 
            case 21419: 
            case 25506: 
            case 30322: {
                return 4;
            }
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
            case 524531317: {
                return 1;
            }
            case 134: 
            case 17026: 
            case 21358: 
            case 2274716: {
                return 3;
            }
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
        }
        return 2;
    }

    protected void y(c c8, s s8, int n8) throws IOException {
        if (c8.h != 1685485123 && c8.h != 1685480259) {
            s8.n(n8);
            return;
        }
        byte[] byArray = new byte[n8];
        c8.P = byArray;
        s8.readFully(byArray, 0, n8);
    }

    protected void z(c c8, int n8, s s8, int n9) throws IOException {
        if (n8 == 4 && "V_VP9".equals(c8.c)) {
            this.p.X(n9);
            s8.readFully(this.p.f(), 0, n9);
            return;
        }
        s8.n(n9);
    }

    private final class b
    implements ax.I1.b {
        final e a;

        private b(e e8) {
            this.a = e8;
        }

        @Override
        public void a(int n8) throws E {
            this.a.r(n8);
        }

        @Override
        public int b(int n8) {
            return this.a.x(n8);
        }

        @Override
        public boolean c(int n8) {
            return this.a.C(n8);
        }

        @Override
        public void d(int n8, String string) throws E {
            this.a.J(n8, string);
        }

        @Override
        public void e(int n8, double d8) throws E {
            this.a.u(n8, d8);
        }

        @Override
        public void f(int n8, int n9, s s8) throws IOException {
            this.a.o(n8, n9, s8);
        }

        @Override
        public void g(int n8, long l8, long l9) throws E {
            this.a.I(n8, l8, l9);
        }

        @Override
        public void h(int n8, long l8) throws E {
            this.a.A(n8, l8);
        }
    }

    protected static final class c {
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
        public byte[] P;
        public int Q = 1;
        public int R = -1;
        public int S = 8000;
        public long T = 0L;
        public long U = 0L;
        public V V;
        public boolean W;
        public boolean X = true;
        private String Y = "eng";
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
        public o m;
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

        protected c() {
        }

        static /* synthetic */ int c(c c8, int n8) {
            c8.h = n8;
            return n8;
        }

        static /* synthetic */ String d(c c8, String string) {
            c8.Y = string;
            return string;
        }

        private void f() {
            ax.S0.a.e(this.Z);
        }

        private byte[] g(String string) throws E {
            Object object = this.l;
            if (object != null) {
                return object;
            }
            object = new StringBuilder();
            object.append("Missing CodecPrivate for codec ");
            object.append(string);
            throw ax.P0.E.a(object.toString(), null);
        }

        private byte[] h() {
            if (this.F != -1.0f && this.G != -1.0f && this.H != -1.0f && this.I != -1.0f && this.J != -1.0f && this.K != -1.0f && this.L != -1.0f && this.M != -1.0f && this.N != -1.0f && this.O != -1.0f) {
                byte[] byArray = new byte[25];
                ByteBuffer byteBuffer = ByteBuffer.wrap(byArray).order(ByteOrder.LITTLE_ENDIAN);
                byteBuffer.put((byte)0);
                byteBuffer.putShort((short)(this.F * 50000.0f + 0.5f));
                byteBuffer.putShort((short)(this.G * 50000.0f + 0.5f));
                byteBuffer.putShort((short)(this.H * 50000.0f + 0.5f));
                byteBuffer.putShort((short)(this.I * 50000.0f + 0.5f));
                byteBuffer.putShort((short)(this.J * 50000.0f + 0.5f));
                byteBuffer.putShort((short)(this.K * 50000.0f + 0.5f));
                byteBuffer.putShort((short)(this.L * 50000.0f + 0.5f));
                byteBuffer.putShort((short)(this.M * 50000.0f + 0.5f));
                byteBuffer.putShort((short)(this.N + 0.5f));
                byteBuffer.putShort((short)(this.O + 0.5f));
                byteBuffer.putShort((short)this.D);
                byteBuffer.putShort((short)this.E);
                return byArray;
            }
            return null;
        }

        /*
         * Unable to fully structure code
         */
        private static Pair<String, List<byte[]>> k(ax.S0.G var0) throws E {
            block11: {
                var0.c0(16);
                var2_2 = var0.C();
                if (var2_2 != 1482049860L) break block11;
                try {
                    return new Pair((Object)"video/divx", null);
                }
                catch (ArrayIndexOutOfBoundsException var0_1) {
                    throw ax.P0.E.a("Error parsing FourCC private data", null);
                }
            }
            if (var2_2 == 859189832L) {
                return new Pair((Object)"video/3gpp", null);
            }
            if (var2_2 == 826496599L) {
                var1_3 = var0.g() + 20;
                var0 = var0.f();
                ** while (var1_3 < ((Object)var0).length - 4)
lbl-1000:
                // 1 sources

                {
                    if (var0[var1_3] == false && var0[var1_3 + 1] == false && var0[var1_3 + 2] == true && var0[var1_3 + 3] == 15) {
                        return new Pair((Object)"video/wvc1", Collections.singletonList(Arrays.copyOfRange((byte[])var0, var1_3, ((Object)var0).length)));
                    }
                    ++var1_3;
                    continue;
                }
lbl22:
                // 2 sources

                throw ax.P0.E.a("Failed to find FourCC VC1 initialization data", null);
            }
            ax.S0.u.h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
            return new Pair((Object)"video/x-unknown", null);
        }

        private static boolean l(ax.S0.G g8) throws E {
            block4: {
                long l8;
                long l9;
                try {
                    int n8 = g8.E();
                    if (n8 == 1) {
                        return true;
                    }
                    if (n8 != 65534) break block4;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    throw ax.P0.E.a("Error parsing MS/ACM codec private", null);
                }
                g8.b0(24);
                if (g8.F() != k0.getMostSignificantBits() || (l9 = g8.F()) != (l8 = k0.getLeastSignificantBits())) break block4;
                return true;
            }
            return false;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        private static List<byte[]> m(byte[] object) throws E {
            byte[] byArray;
            Object object2;
            Object object3;
            if (object[0] != 2) throw ax.P0.E.a("Error parsing vorbis codec private", null);
            int n8 = 1;
            int n9 = 0;
            while (((object3 = object[n8]) & 0xFF) == 255) {
                n9 += 255;
                ++n8;
            }
            ++n8;
            object3 = n9 + (object3 & 0xFF);
            n9 = 0;
            while (((object2 = object[n8]) & 0xFF) == 255) {
                n9 += 255;
                ++n8;
            }
            if (object[++n8] != true) throw ax.P0.E.a("Error parsing vorbis codec private", null);
            try {
                byArray = new byte[object3];
                System.arraycopy(object, n8, byArray, 0, (int)object3);
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                throw ax.P0.E.a("Error parsing vorbis codec private", null);
            }
            if (object[n8 += object3] != 3) throw ax.P0.E.a("Error parsing vorbis codec private", null);
            if (object[n9 = n8 + (n9 + (object2 & 0xFF))] == 5) {
                byte[] byArray2 = new byte[((Object)object).length - n9];
                System.arraycopy(object, n9, byArray2, 0, ((Object)object).length - n9);
                object = new ArrayList(2);
                object.add(byArray);
                object.add(byArray2);
                return object;
            }
            throw ax.P0.E.a("Error parsing vorbis codec private", null);
        }

        private boolean o(boolean bl) {
            if ("A_OPUS".equals(this.c)) {
                return bl;
            }
            return this.g > 0;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         */
        public void i(t var1_1, int var2_2) throws E {
            block128: {
                block126: {
                    block127: {
                        block129: {
                            var11_3 = this.c;
                            var11_3.getClass();
                            var13_4 = "audio/raw";
                            var16_5 = null;
                            tmp = -1;
                            switch (var11_3.hashCode()) {
                                case 1951062397: {
                                    if (!var11_3.equals("A_OPUS")) break;
                                    tmp = 1;
                                    break;
                                }
                                case 1950789798: {
                                    if (!var11_3.equals("A_FLAC")) break;
                                    tmp = 2;
                                    break;
                                }
                                case 1950749482: {
                                    if (!var11_3.equals("A_EAC3")) break;
                                    tmp = 3;
                                    break;
                                }
                                case 1809237540: {
                                    if (!var11_3.equals("V_MPEG2")) break;
                                    tmp = 4;
                                    break;
                                }
                                case 1422270023: {
                                    if (!var11_3.equals("S_TEXT/UTF8")) break;
                                    tmp = 5;
                                    break;
                                }
                                case 1045209816: {
                                    if (!var11_3.equals("S_TEXT/WEBVTT")) break;
                                    tmp = 6;
                                    break;
                                }
                                case 855502857: {
                                    if (!var11_3.equals("V_MPEGH/ISO/HEVC")) break;
                                    tmp = 7;
                                    break;
                                }
                                case 738614379: {
                                    if (!var11_3.equals("S_TEXT/SSA")) break;
                                    tmp = 8;
                                    break;
                                }
                                case 738597099: {
                                    if (!var11_3.equals("S_TEXT/ASS")) break;
                                    tmp = 9;
                                    break;
                                }
                                case 725957860: {
                                    if (!var11_3.equals("A_PCM/INT/LIT")) break;
                                    tmp = 10;
                                    break;
                                }
                                case 725948237: {
                                    if (!var11_3.equals("A_PCM/INT/BIG")) break;
                                    tmp = 11;
                                    break;
                                }
                                case 635596514: {
                                    if (!var11_3.equals("A_PCM/FLOAT/IEEE")) break;
                                    tmp = 12;
                                    break;
                                }
                                case 542569478: {
                                    if (!var11_3.equals("A_DTS/EXPRESS")) break;
                                    tmp = 13;
                                    break;
                                }
                                case 444813526: {
                                    if (!var11_3.equals("V_THEORA")) break;
                                    tmp = 14;
                                    break;
                                }
                                case 99146302: {
                                    if (!var11_3.equals("S_HDMV/PGS")) break;
                                    tmp = 15;
                                    break;
                                }
                                case 82338134: {
                                    if (!var11_3.equals("V_VP9")) break;
                                    tmp = 16;
                                    break;
                                }
                                case 82338133: {
                                    if (!var11_3.equals("V_VP8")) break;
                                    tmp = 17;
                                    break;
                                }
                                case 82318131: {
                                    if (!var11_3.equals("V_AV1")) break;
                                    tmp = 18;
                                    break;
                                }
                                case 62927045: {
                                    if (!var11_3.equals("A_DTS")) break;
                                    tmp = 19;
                                    break;
                                }
                                case 62923603: {
                                    if (!var11_3.equals("A_AC3")) break;
                                    tmp = 20;
                                    break;
                                }
                                case 62923557: {
                                    if (!var11_3.equals("A_AAC")) break;
                                    tmp = 21;
                                    break;
                                }
                                case -356037306: {
                                    if (!var11_3.equals("A_DTS/LOSSLESS")) break;
                                    tmp = 22;
                                    break;
                                }
                                case -425012669: {
                                    if (!var11_3.equals("S_VOBSUB")) break;
                                    tmp = 23;
                                    break;
                                }
                                case -538363109: {
                                    if (!var11_3.equals("V_MPEG4/ISO/AVC")) break;
                                    tmp = 24;
                                    break;
                                }
                                case -538363189: {
                                    if (!var11_3.equals("V_MPEG4/ISO/ASP")) break;
                                    tmp = 25;
                                    break;
                                }
                                case -933872740: {
                                    if (!var11_3.equals("S_DVBSUB")) break;
                                    tmp = 26;
                                    break;
                                }
                                case -1373388978: {
                                    if (!var11_3.equals("V_MS/VFW/FOURCC")) break;
                                    tmp = 27;
                                    break;
                                }
                                case -1482641357: {
                                    if (!var11_3.equals("A_MPEG/L3")) break;
                                    tmp = 28;
                                    break;
                                }
                                case -1482641358: {
                                    if (!var11_3.equals("A_MPEG/L2")) break;
                                    tmp = 29;
                                    break;
                                }
                                case -1730367663: {
                                    if (!var11_3.equals("A_VORBIS")) break;
                                    tmp = 30;
                                    break;
                                }
                                case -1784763192: {
                                    if (!var11_3.equals("A_TRUEHD")) break;
                                    tmp = 31;
                                    break;
                                }
                                case -1985379776: {
                                    if (!var11_3.equals("A_MS/ACM")) break;
                                    tmp = 32;
                                    break;
                                }
                                case -2095575984: {
                                    if (!var11_3.equals("V_MPEG4/ISO/SP")) break;
                                    tmp = 33;
                                    break;
                                }
                                case -2095576542: {
                                    if (!var11_3.equals("V_MPEG4/ISO/AP")) break;
                                    tmp = 34;
                                    break;
                                }
                            }
                            switch (tmp) {
                                default: {
                                    var4_6 = -1;
                                    break;
                                }
                                case 1: {
                                    var4_6 = 33;
                                    break;
                                }
                                case 2: {
                                    var4_6 = 32;
                                    break;
                                }
                                case 3: {
                                    var4_6 = 31;
                                    break;
                                }
                                case 4: {
                                    var4_6 = 30;
                                    break;
                                }
                                case 5: {
                                    var4_6 = 29;
                                    break;
                                }
                                case 6: {
                                    var4_6 = 28;
                                    break;
                                }
                                case 7: {
                                    var4_6 = 27;
                                    break;
                                }
                                case 8: {
                                    var4_6 = 26;
                                    break;
                                }
                                case 9: {
                                    var4_6 = 25;
                                    break;
                                }
                                case 10: {
                                    var4_6 = 24;
                                    break;
                                }
                                case 11: {
                                    var4_6 = 23;
                                    break;
                                }
                                case 12: {
                                    var4_6 = 22;
                                    break;
                                }
                                case 13: {
                                    var4_6 = 21;
                                    break;
                                }
                                case 14: {
                                    var4_6 = 20;
                                    break;
                                }
                                case 15: {
                                    var4_6 = 19;
                                    break;
                                }
                                case 16: {
                                    var4_6 = 18;
                                    break;
                                }
                                case 17: {
                                    var4_6 = 17;
                                    break;
                                }
                                case 18: {
                                    var4_6 = 16;
                                    break;
                                }
                                case 19: {
                                    var4_6 = 15;
                                    break;
                                }
                                case 20: {
                                    var4_6 = 14;
                                    break;
                                }
                                case 21: {
                                    var4_6 = 13;
                                    break;
                                }
                                case 22: {
                                    var4_6 = 12;
                                    break;
                                }
                                case 23: {
                                    var4_6 = 11;
                                    break;
                                }
                                case 24: {
                                    var4_6 = 10;
                                    break;
                                }
                                case 25: {
                                    var4_6 = 9;
                                    break;
                                }
                                case 26: {
                                    var4_6 = 8;
                                    break;
                                }
                                case 27: {
                                    var4_6 = 7;
                                    break;
                                }
                                case 28: {
                                    var4_6 = 6;
                                    break;
                                }
                                case 29: {
                                    var4_6 = 5;
                                    break;
                                }
                                case 30: {
                                    var4_6 = 4;
                                    break;
                                }
                                case 31: {
                                    var4_6 = 3;
                                    break;
                                }
                                case 32: {
                                    var4_6 = 2;
                                    break;
                                }
                                case 33: {
                                    var4_6 = 1;
                                    break;
                                }
                                case 34: {
                                    var4_6 = 0;
                                }
                            }
                            switch (var4_6) {
                                default: {
                                    throw ax.P0.E.a("Unrecognized codec identifier.", null);
                                }
                                case 33: {
                                    var11_3 = new ArrayList<byte[]>(3);
                                    var11_3.add(this.g(this.c));
                                    var12_7 = ByteBuffer.allocate(8);
                                    var13_4 = ByteOrder.LITTLE_ENDIAN;
                                    var11_3.add((List<Object>)var12_7.order((ByteOrder)var13_4).putLong(this.T).array());
                                    var11_3.add(ByteBuffer.allocate(8).order((ByteOrder)var13_4).putLong(this.U).array());
                                    var13_4 = "audio/opus";
                                    var4_6 = 5760;
                                    var12_7 = null;
                                    break block126;
                                }
                                case 32: {
                                    var11_3 = Collections.singletonList(this.g(this.c));
                                    var13_4 = "audio/flac";
                                    ** GOTO lbl402
                                }
                                case 31: {
                                    var13_4 = "audio/eac3";
                                    ** GOTO lbl396
                                }
                                case 30: {
                                    var13_4 = "video/mpeg2";
                                    ** GOTO lbl396
                                }
                                case 29: {
                                    var11_3 = null;
                                    var12_7 = null;
                                    var13_4 = "application/x-subrip";
                                    break block127;
                                }
                                case 28: {
                                    var11_3 = null;
                                    var12_7 = null;
                                    var13_4 = "text/vtt";
                                    break block127;
                                }
                                case 27: {
                                    var12_7 = ax.q1.G.a(new ax.S0.G(this.g(this.c)));
                                    var11_3 = var12_7.a;
                                    this.a0 = var12_7.b;
                                    var12_7 = var12_7.p;
                                    var13_4 = "video/hevc";
                                    break block127;
                                }
                                case 25: 
                                case 26: {
                                    var11_3 = ax.r7.z.B(ax.I1.e.h(), this.g(this.c));
                                    var12_7 = null;
                                    var13_4 = "text/x-ssa";
                                    break block127;
                                }
                                case 24: {
                                    var4_6 = ax.S0.d0.j0(this.R);
                                    if (var4_6 != 0) ** GOTO lbl458
                                    var11_3 = new StringBuilder();
                                    var11_3.append("Unsupported little endian PCM bit depth: ");
                                    var11_3.append(this.R);
                                    var11_3.append(". Setting mimeType to ");
                                    var11_3.append("audio/x-unknown");
                                    ax.S0.u.h("MatroskaExtractor", var11_3.toString());
                                    ** GOTO lbl357
                                }
                                case 23: {
                                    var4_6 = this.R;
                                    if (var4_6 != 8) ** GOTO lbl320
                                    var11_3 = null;
                                    var12_7 = null;
                                    var5_9 = -1;
                                    var4_6 = 3;
                                    break block128;
lbl320:
                                    // 1 sources

                                    if (var4_6 != 16) ** GOTO lbl323
                                    var4_6 = 0x10000000;
                                    ** GOTO lbl458
lbl323:
                                    // 1 sources

                                    if (var4_6 != 24) ** GOTO lbl326
                                    var4_6 = 0x50000000;
                                    ** GOTO lbl458
lbl326:
                                    // 1 sources

                                    if (var4_6 != 32) ** GOTO lbl329
                                    var4_6 = 0x60000000;
                                    ** GOTO lbl458
lbl329:
                                    // 1 sources

                                    var11_3 = new StringBuilder();
                                    var11_3.append("Unsupported big endian PCM bit depth: ");
                                    var11_3.append(this.R);
                                    var11_3.append(". Setting mimeType to ");
                                    var11_3.append("audio/x-unknown");
                                    ax.S0.u.h("MatroskaExtractor", var11_3.toString());
                                    ** GOTO lbl357
                                }
                                case 22: {
                                    if (this.R != 32) ** GOTO lbl347
                                    var11_3 = null;
                                    var12_7 = null;
                                    var5_9 = -1;
                                    var4_6 = 4;
                                    break block128;
lbl347:
                                    // 1 sources

                                    var11_3 = new StringBuilder();
                                    var11_3.append("Unsupported floating point PCM bit depth: ");
                                    var11_3.append(this.R);
                                    var11_3.append(". Setting mimeType to ");
                                    var11_3.append("audio/x-unknown");
                                    ax.S0.u.h("MatroskaExtractor", var11_3.toString());
lbl357:
                                    // 3 sources

                                    var11_3 = null;
                                    var12_7 = null;
                                    var13_4 = "audio/x-unknown";
                                    break block127;
                                }
                                case 20: {
                                    var13_4 = "video/x-unknown";
                                    ** GOTO lbl396
                                }
                                case 19: {
                                    var13_4 = "application/pgs";
                                    ** GOTO lbl396
                                }
                                case 18: {
                                    var11_3 = this.l;
                                    var11_3 = var11_3 == null ? null : ax.r7.z.A(var11_3);
                                    var13_4 = "video/x-vnd.on2.vp9";
                                    ** GOTO lbl402
                                }
                                case 17: {
                                    var13_4 = "video/x-vnd.on2.vp8";
                                    ** GOTO lbl396
                                }
                                case 16: {
                                    var11_3 = this.l;
                                    var11_3 = var11_3 == null ? null : ax.r7.z.A(var11_3);
                                    var13_4 = "video/av01";
                                    ** GOTO lbl402
                                }
                                case 15: 
                                case 21: {
                                    var13_4 = "audio/vnd.dts";
                                    ** GOTO lbl396
                                }
                                case 14: {
                                    var13_4 = "audio/ac3";
                                    ** GOTO lbl396
                                }
                                case 13: {
                                    var11_3 = Collections.singletonList(this.g(this.c));
                                    var12_7 = ax.q1.a.e(this.l);
                                    this.S = var12_7.a;
                                    this.Q = var12_7.b;
                                    var12_7 = var12_7.c;
                                    var13_4 = "audio/mp4a-latm";
                                    break block127;
                                }
                                case 12: {
                                    var13_4 = "audio/vnd.dts.hd";
lbl396:
                                    // 8 sources

                                    var11_3 = null;
                                    var12_7 = null;
                                    break block127;
                                }
                                case 11: {
                                    var11_3 = ax.r7.z.A(this.g(this.c));
                                    var13_4 = "application/vobsub";
lbl402:
                                    // 4 sources

                                    var12_7 = null;
                                    break block127;
                                }
                                case 10: {
                                    var12_7 = ax.q1.d.b(new ax.S0.G(this.g(this.c)));
                                    var11_3 = var12_7.a;
                                    this.a0 = var12_7.b;
                                    var12_7 = var12_7.l;
                                    var13_4 = "video/avc";
                                    break block127;
                                }
                                case 8: {
                                    var11_3 = new byte[4];
                                    System.arraycopy(this.g(this.c), 0, var11_3, 0, 4);
                                    var11_3 = ax.r7.z.A(var11_3);
                                    var13_4 = "application/dvbsubs";
                                    break block129;
                                }
                                case 7: {
                                    var11_3 = ax.I1.e$c.k(new ax.S0.G(this.g(this.c)));
                                    var13_4 = (String)var11_3.first;
                                    var11_3 = (List)var11_3.second;
                                    break block129;
                                }
                                case 6: {
                                    var13_4 = "audio/mpeg";
                                    ** GOTO lbl427
                                }
                                case 5: {
                                    var13_4 = "audio/mpeg-L2";
lbl427:
                                    // 2 sources

                                    var11_3 = null;
                                    var12_7 = null;
                                    var4_6 = 4096;
                                    break block126;
                                }
                                case 4: {
                                    var11_3 = ax.I1.e$c.m(this.g(this.c));
                                    var13_4 = "audio/vorbis";
                                    var4_6 = 8192;
                                    var12_7 = null;
                                    break block126;
                                }
                                case 3: {
                                    this.V = new V();
                                    var13_4 = "audio/true-hd";
                                    var11_3 = null;
                                    var12_7 = null;
                                    break block127;
                                }
                                case 2: {
                                    if (!ax.I1.e$c.l(new ax.S0.G(this.g(this.c)))) ** GOTO lbl462
                                    var4_6 = ax.S0.d0.j0(this.R);
                                    if (var4_6 != 0) ** GOTO lbl458
                                    var11_3 = new StringBuilder();
                                    var11_3.append("Unsupported PCM bit depth: ");
                                    var11_3.append(this.R);
                                    var11_3.append(". Setting mimeType to ");
                                    var11_3.append("audio/x-unknown");
                                    ax.S0.u.h("MatroskaExtractor", var11_3.toString());
                                    ** GOTO lbl468
lbl458:
                                    // 5 sources

                                    var12_7 = null;
                                    var11_3 = null;
                                    var5_9 = -1;
                                    break block128;
lbl462:
                                    // 1 sources

                                    var11_3 = new StringBuilder();
                                    var11_3.append("Non-PCM MS/ACM is unsupported. Setting mimeType to ");
                                    var11_3.append("audio/x-unknown");
                                    ax.S0.u.h("MatroskaExtractor", var11_3.toString());
lbl468:
                                    // 2 sources

                                    var11_3 = null;
                                    var12_7 = null;
                                    var13_4 = "audio/x-unknown";
                                    break block127;
                                }
                                case 0: 
                                case 1: 
                                case 9: 
                            }
                            var11_3 = this.l;
                            var11_3 = var11_3 == null ? null : Collections.singletonList(var11_3);
                            var13_4 = "video/mp4v-es";
                        }
                        var12_7 = null;
                    }
                    var4_6 = -1;
                }
                var6_8 = -1;
                var5_9 = var4_6;
                var4_6 = var6_8;
            }
            var7_10 = 0;
            var15_11 = var12_7;
            var14_12 = var13_4;
            if (this.P != null) {
                var17_13 = ax.T0.a.a(new ax.S0.G(this.P));
                var15_11 = var12_7;
                var14_12 = var13_4;
                if (var17_13 != null) {
                    var15_11 = var17_13.c;
                    var14_12 = "video/dolby-vision";
                }
            }
            var10_14 = this.X;
            var6_8 = this.W != false ? 2 : 0;
            var13_4 = new v.b();
            if (ax.P0.D.o((String)var14_12)) {
                var13_4.T(this.Q).z0(this.S).s0(var4_6);
                var4_6 = 1;
            } else if (ax.P0.D.s((String)var14_12)) {
                if (this.s == 0) {
                    var4_6 = var8_15 = this.q;
                    if (var8_15 == -1) {
                        var4_6 = this.n;
                    }
                    this.q = var4_6;
                    var4_6 = var8_15 = this.r;
                    if (var8_15 == -1) {
                        var4_6 = this.o;
                    }
                    this.r = var4_6;
                }
                var8_15 = -1;
                var4_6 = this.q;
                var3_17 = var4_6 != -1 && (var9_16 = this.r) != -1 ? (float)(this.o * var4_6) / (float)(this.n * var9_16) : -1.0f;
                var12_7 = var16_5;
                if (this.z) {
                    var12_7 = this.h();
                    var12_7 = new j.b().d(this.A).c(this.C).e(this.B).f((byte[])var12_7).g(this.p).b(this.p).a();
                }
                var4_6 = var8_15;
                if (this.b != null) {
                    var4_6 = var8_15;
                    if (ax.I1.e.i().containsKey(this.b)) {
                        var4_6 = (Integer)ax.I1.e.i().get(this.b);
                    }
                }
                if (this.t == 0 && Float.compare(this.u, 0.0f) == 0 && Float.compare(this.v, 0.0f) == 0) {
                    if (Float.compare(this.w, 0.0f) == 0) {
                        var4_6 = var7_10;
                    } else if (Float.compare(this.w, 90.0f) == 0) {
                        var4_6 = 90;
                    } else if (Float.compare(this.w, -180.0f) != 0 && Float.compare(this.w, 180.0f) != 0) {
                        if (Float.compare(this.w, -90.0f) == 0) {
                            var4_6 = 270;
                        }
                    } else {
                        var4_6 = 180;
                    }
                }
                var13_4.F0(this.n).h0(this.o).u0(var3_17).x0(var4_6).v0(this.x).B0(this.y).V((j)var12_7);
                var4_6 = 2;
            } else {
                if (!("application/x-subrip".equals(var14_12) || "text/x-ssa".equals(var14_12) || "text/vtt".equals(var14_12) || "application/vobsub".equals(var14_12) || "application/pgs".equals(var14_12) || "application/dvbsubs".equals(var14_12))) {
                    throw ax.P0.E.a("Unexpected MIME type.", null);
                }
                var4_6 = 3;
            }
            if (this.b != null && !ax.I1.e.i().containsKey(this.b)) {
                var13_4.l0(this.b);
            }
            var13_4 = var13_4.i0(var2_2);
            var12_7 = this.a != false ? "video/webm" : "video/x-matroska";
            var11_3 = var13_4.W((String)var12_7).y0((String)var14_12).o0(var5_9).n0(this.Y).A0(var6_8 | var10_14).k0((List<byte[]>)var11_3).U((String)var15_11).c0(this.m).P();
            this.Z = var1_1 = var1_1.u(this.d, var4_6);
            var1_1.e((ax.P0.v)var11_3);
        }

        public void j() {
            V v8 = this.V;
            if (v8 != null) {
                v8.a(this.Z, this.k);
            }
        }

        public void n() {
            V v8 = this.V;
            if (v8 != null) {
                v8.b();
            }
        }
    }
}

