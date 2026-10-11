package androidx.media3.decoder.ffmpeg;

import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import androidx.media3.decoder.a;
import ax.P0.C0912v;
import ax.S0.G;
import ax.S0.d0;
import ax.V0.i;
import ax.q7.n;
import java.nio.ByteBuffer;
import java.util.List;
import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
final class FfmpegAudioDecoder extends ax.W0.a {
    private static final byte[] w = {102, 76, 97, 67};
    private final String o;
    private final byte[] p;
    private final int q;
    private int r;
    private long s;
    private boolean t;
    private volatile int u;
    private volatile int v;

    public FfmpegAudioDecoder(C0912v c0912v, int i, int i2, int i3, boolean z) throws ax.W0.b {
        super(new i[i], new SimpleDecoderOutputBuffer[i2]);
        if (!FfmpegLibrary.d()) {
            throw new ax.W0.b("Failed to load decoder native libraries.");
        }
        n.n(c0912v.o);
        String str = (String) n.n(FfmpegLibrary.a(c0912v.o));
        this.o = str;
        byte[] I = I(c0912v.o, c0912v.r);
        this.p = I;
        this.q = z ? 4 : 2;
        this.r = z ? 131070 : Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        int G0 = b.G0();
        int i4 = c0912v.G;
        long ffmpegInitialize = ffmpegInitialize(str, I, z, c0912v.H, (G0 <= 0 || (i4 >= 0 && G0 >= i4)) ? i4 : G0);
        this.s = ffmpegInitialize;
        if (ffmpegInitialize == 0) {
            throw new ax.W0.b("Initialization failed.");
        }
        x(i3);
    }

    private static boolean C(byte[] bArr, byte[] bArr2) {
        if (bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    private static byte[] G(byte[] bArr) {
        byte[] bArr2 = w;
        int length = C(bArr, bArr2) ? bArr2.length : 0;
        if (bArr.length - length == 34) {
            byte[] bArr3 = new byte[34];
            System.arraycopy(bArr, length, bArr3, 0, 34);
            return bArr3;
        }
        int i = length + 4;
        if (bArr.length < i) {
            return null;
        }
        int i2 = bArr[length] & Byte.MAX_VALUE;
        int i3 = ((bArr[length + 1] & 255) << 16) | ((bArr[length + 2] & 255) << 8) | (bArr[length + 3] & 255);
        if (i2 != 0 || i3 != 34 || bArr.length < length + 38) {
            return null;
        }
        byte[] bArr4 = new byte[34];
        System.arraycopy(bArr, i, bArr4, 0, 34);
        return bArr4;
    }

    private static byte[] H(List<byte[]> list) {
        byte[] bArr = list.get(0);
        int length = bArr.length + 12;
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1634492771);
        allocate.putInt(0);
        allocate.put(bArr, 0, bArr.length);
        return allocate.array();
    }

    private static byte[] I(String str, List<byte[]> list) {
        str.getClass();
        switch (str) {
            case "audio/vorbis":
                return K(list);
            case "audio/mp4a-latm":
            case "audio/opus":
                return list.get(0);
            case "audio/alac":
                return H(list);
            case "audio/flac":
                return J(list);
            default:
                return null;
        }
    }

    private static byte[] J(List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] G = G(list.get(i));
            if (G != null) {
                return G;
            }
        }
        return null;
    }

    private static byte[] K(List<byte[]> list) {
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

    private native int ffmpegDecode(long j, ByteBuffer byteBuffer, int i, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, ByteBuffer byteBuffer2, int i2);

    private native int ffmpegGetChannelCount(long j);

    private native int ffmpegGetSampleRate(long j);

    private native long ffmpegInitialize(String str, byte[] bArr, boolean z, int i, int i2);

    private native void ffmpegRelease(long j);

    private native long ffmpegReset(long j, byte[] bArr);

    private ByteBuffer growOutputBuffer(SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, int i) {
        this.r = i;
        return simpleDecoderOutputBuffer.C(i);
    }

    @Override // ax.W0.a
    public int A() {
        return this.v;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.V0.j
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public SimpleDecoderOutputBuffer k() {
        return new SimpleDecoderOutputBuffer(new a.InterfaceC0027a() { // from class: androidx.media3.decoder.ffmpeg.a
            @Override // androidx.media3.decoder.a.InterfaceC0027a
            public final void a(androidx.media3.decoder.a aVar) {
                FfmpegAudioDecoder.this.u((SimpleDecoderOutputBuffer) aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.V0.j
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public ax.W0.b l(Throwable th) {
        return new ax.W0.b("Unexpected decode error", th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.V0.j
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public ax.W0.b m(i iVar, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, boolean z) {
        if (z) {
            long ffmpegReset = ffmpegReset(this.s, this.p);
            this.s = ffmpegReset;
            if (ffmpegReset == 0) {
                return new ax.W0.b("Error resetting (see logcat).");
            }
        }
        ByteBuffer byteBuffer = (ByteBuffer) d0.i(iVar.e0);
        int ffmpegDecode = ffmpegDecode(this.s, byteBuffer, byteBuffer.limit(), simpleDecoderOutputBuffer, simpleDecoderOutputBuffer.D(iVar.g0, this.r), this.r);
        if (ffmpegDecode == -2) {
            return new ax.W0.b("Error decoding (see logcat).");
        }
        if (ffmpegDecode == -1) {
            simpleDecoderOutputBuffer.e0 = true;
            return null;
        }
        if (ffmpegDecode == 0) {
            simpleDecoderOutputBuffer.e0 = true;
            return null;
        }
        if (!this.t) {
            this.u = ffmpegGetChannelCount(this.s);
            this.v = ffmpegGetSampleRate(this.s);
            if (this.v == 0 && "alac".equals(this.o)) {
                n.n(this.p);
                G g = new G(this.p);
                g.b0(this.p.length - 4);
                this.v = g.Q();
            }
            this.t = true;
        }
        ByteBuffer byteBuffer2 = (ByteBuffer) n.n(simpleDecoderOutputBuffer.g0);
        byteBuffer2.position(0);
        byteBuffer2.limit(ffmpegDecode);
        return null;
    }

    @Override // ax.V0.j, ax.V0.g
    public void d() {
        super.d();
        ffmpegRelease(this.s);
        this.s = 0L;
    }

    @Override // ax.V0.g
    public String getName() {
        return "ffmpeg" + FfmpegLibrary.c() + "-" + this.o;
    }

    @Override // ax.V0.j
    protected i j() {
        return new i(2, FfmpegLibrary.b());
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
