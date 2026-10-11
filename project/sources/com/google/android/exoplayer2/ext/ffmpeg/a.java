package com.google.android.exoplayer2.ext.ffmpeg;

import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import androidx.media3.decoder.a;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.S0.G;
import ax.S0.d0;
import ax.V0.i;
import ax.W0.b;
import java.nio.ByteBuffer;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public final class a extends ax.W0.a {
    private final String o;
    private final byte[] p;
    private final int q;
    private final int r;
    private long s;
    private boolean t;
    private volatile int u;
    private volatile int v;
    private int w;
    private boolean x;
    private FfmpegDecoder y;

    public a(boolean z, C0912v c0912v, int i, int i2, int i3, boolean z2, int i4) throws b {
        super(new i[i], new SimpleDecoderOutputBuffer[i2]);
        this.x = z;
        this.y = new FfmpegDecoder(z);
        if (!FfmpegLibrary.f()) {
            throw new b("Failed to load decoder native libraries.");
        }
        try {
            String str = c0912v.o;
            if (str == null) {
                throw new b("audio decoder sample mime type null.");
            }
            String c = FfmpegLibrary.c(str);
            this.o = c;
            if (c == null) {
                throw new b("audio decoder codecName null.");
            }
            byte[] G = G(c0912v.o, c0912v.r);
            this.p = G;
            this.q = z2 ? 4 : 2;
            this.r = z2 ? 131072 : 65536;
            long d = this.y.d(c, G, z2, c0912v.H, c0912v.G);
            this.s = d;
            if (d == 0) {
                throw new b("Initialization failed.");
            }
            this.w = i4;
            x(i3);
        } catch (Error unused) {
            throw new b("Initialization failed.");
        }
    }

    private static byte[] F(List<byte[]> list) {
        byte[] bArr = list.get(0);
        int length = bArr.length + 12;
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1634492771);
        allocate.putInt(0);
        allocate.put(bArr, 0, bArr.length);
        return allocate.array();
    }

    private static byte[] G(String str, List<byte[]> list) {
        str.getClass();
        switch (str) {
            case "audio/vorbis":
                return H(list);
            case "audio/mp4a-latm":
            case "audio/opus":
                return list.get(0);
            case "audio/alac":
                return F(list);
            default:
                return null;
        }
    }

    private static byte[] H(List<byte[]> list) {
        byte[] bArr = list.get(0);
        byte[] bArr2 = list.get(1);
        byte[] bArr3 = new byte[bArr.length + bArr2.length + 6];
        bArr3[0] = (byte) (bArr.length >> 8);
        bArr3[1] = (byte) (bArr.length & 255);
        System.arraycopy(bArr, 0, bArr3, 2, bArr.length);
        bArr3[bArr.length + 2] = 0;
        bArr3[bArr.length + 3] = 0;
        bArr3[bArr.length + 4] = (byte) (bArr2.length >> 8);
        bArr3[bArr.length + 5] = (byte) (bArr2.length & 255);
        System.arraycopy(bArr2, 0, bArr3, bArr.length + 6, bArr2.length);
        return bArr3;
    }

    @Override // ax.W0.a
    public int A() {
        return this.v;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.V0.j
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public SimpleDecoderOutputBuffer k() {
        return new SimpleDecoderOutputBuffer(new a.InterfaceC0027a() { // from class: ax.B5.a
            @Override // androidx.media3.decoder.a.InterfaceC0027a
            public final void a(androidx.media3.decoder.a aVar) {
                com.google.android.exoplayer2.ext.ffmpeg.a.this.u((SimpleDecoderOutputBuffer) aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.V0.j
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public b l(Throwable th) {
        return new b("Unexpected decode error", th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.V0.j
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public b m(i iVar, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, boolean z) {
        if (z) {
            try {
                long f = this.y.f(this.s, this.p);
                this.s = f;
                if (f == 0) {
                    return new b("Error resetting (see logcat).");
                }
            } catch (Error e) {
                return l(e);
            }
        }
        ByteBuffer byteBuffer = (ByteBuffer) d0.i(iVar.e0);
        if (byteBuffer == null) {
            return new b("Input data null.");
        }
        int limit = byteBuffer.limit();
        ByteBuffer D = simpleDecoderOutputBuffer.D(iVar.g0, this.r);
        int a = this.y.a(this.s, byteBuffer, limit, D, this.r, this.w);
        if (a == -2) {
            return new b("Error decoding (see logcat).");
        }
        if (a == -1) {
            simpleDecoderOutputBuffer.e0 = true;
            return null;
        }
        if (a == 0) {
            simpleDecoderOutputBuffer.e0 = true;
            return null;
        }
        if (!this.t) {
            this.u = this.y.b(this.s);
            this.v = this.y.c(this.s);
            if (this.v == 0 && "alac".equals(this.o)) {
                C0968a.e(this.p);
                G g = new G(this.p);
                g.b0(this.p.length - 4);
                this.v = g.Q();
            }
            this.t = true;
        }
        D.position(0);
        D.limit(a);
        return null;
    }

    @Override // ax.V0.j, ax.V0.g
    public void d() {
        super.d();
        try {
            this.y.e(this.s);
        } catch (Error unused) {
        }
        this.s = 0L;
    }

    @Override // ax.V0.g
    public String getName() {
        return "ffmpeg" + FfmpegLibrary.e() + "-" + this.o;
    }

    @Override // ax.V0.j
    protected i j() {
        return new i(2, FfmpegLibrary.d());
    }

    @Override // ax.W0.a
    public int y() {
        return this.u;
    }

    @Override // ax.W0.a
    public int z() {
        return this.q;
    }
}
