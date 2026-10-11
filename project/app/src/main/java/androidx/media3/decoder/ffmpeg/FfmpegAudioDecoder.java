/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.decoder.ffmpeg;

import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import androidx.media3.decoder.ffmpeg.FfmpegLibrary;
import androidx.media3.decoder.ffmpeg.a;
import androidx.media3.decoder.ffmpeg.b;
import ax.P0.v;
import ax.S0.G;
import ax.S0.d0;
import ax.V0.i;
import ax.q7.n;
import java.nio.ByteBuffer;
import java.util.List;

final class FfmpegAudioDecoder
extends ax.W0.a {
    private static final byte[] w = new byte[]{102, 76, 97, 67};
    private final String o;
    private final byte[] p;
    private final int q;
    private int r;
    private long s;
    private boolean t;
    private volatile int u;
    private volatile int v;

    public FfmpegAudioDecoder(v v8, int n8, int n9, int n10, boolean bl) throws ax.W0.b {
        super(new i[n8], new SimpleDecoderOutputBuffer[n9]);
        if (FfmpegLibrary.d()) {
            long l8;
            String string;
            n.n(v8.o);
            this.o = string = n.n(FfmpegLibrary.a(v8.o));
            byte[] byArray = FfmpegAudioDecoder.I(v8.o, v8.r);
            this.p = byArray;
            n8 = bl ? 4 : 2;
            this.q = n8;
            n8 = bl ? 131070 : 65535;
            this.r = n8;
            n9 = b.G0();
            n8 = v8.G;
            if (n9 > 0 && (n8 < 0 || n9 < n8)) {
                n8 = n9;
            }
            this.s = l8 = this.ffmpegInitialize(string, byArray, bl, v8.H, n8);
            if (l8 != 0L) {
                this.x(n10);
                return;
            }
            throw new ax.W0.b("Initialization failed.");
        }
        throw new ax.W0.b("Failed to load decoder native libraries.");
    }

    public static /* synthetic */ void B(FfmpegAudioDecoder ffmpegAudioDecoder, androidx.media3.decoder.a a8) {
        ffmpegAudioDecoder.u(a8);
    }

    private static boolean C(byte[] byArray, byte[] byArray2) {
        if (byArray.length < byArray2.length) {
            return false;
        }
        for (int i8 = 0; i8 < byArray2.length; ++i8) {
            if (byArray[i8] == byArray2[i8]) continue;
            return false;
        }
        return true;
    }

    private static byte[] G(byte[] byArray) {
        byte[] byArray2 = w;
        int n8 = FfmpegAudioDecoder.C(byArray, byArray2) ? byArray2.length : 0;
        if (byArray.length - n8 == 34) {
            byArray2 = new byte[34];
            System.arraycopy(byArray, n8, byArray2, 0, 34);
            return byArray2;
        }
        int n9 = byArray.length;
        int n10 = n8 + 4;
        if (n9 >= n10) {
            byte by = byArray[n8];
            byte by2 = byArray[n8 + 1];
            byte by3 = byArray[n8 + 2];
            n9 = byArray[n8 + 3];
            if ((by & 0x7F) == 0 && ((by2 & 0xFF) << 16 | (by3 & 0xFF) << 8 | n9 & 0xFF) == 34 && byArray.length >= n8 + 38) {
                byArray2 = new byte[34];
                System.arraycopy(byArray, n10, byArray2, 0, 34);
                return byArray2;
            }
        }
        return null;
    }

    private static byte[] H(List<byte[]> object) {
        object = object.get(0);
        int n8 = ((Object)object).length + 12;
        ByteBuffer byteBuffer = ByteBuffer.allocate(n8);
        byteBuffer.putInt(n8);
        byteBuffer.putInt(1634492771);
        byteBuffer.putInt(0);
        byteBuffer.put((byte[])object, 0, ((Object)object).length);
        return byteBuffer.array();
    }

    private static byte[] I(String string, List<byte[]> list) {
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 1504891608: {
                if (!string.equals("audio/opus")) break;
                n8 = 4;
                break;
            }
            case 1504619009: {
                if (!string.equals("audio/flac")) break;
                n8 = 3;
                break;
            }
            case 1504470054: {
                if (!string.equals("audio/alac")) break;
                n8 = 2;
                break;
            }
            case -53558318: {
                if (!string.equals("audio/mp4a-latm")) break;
                n8 = 1;
                break;
            }
            case -1003765268: {
                if (!string.equals("audio/vorbis")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return null;
            }
            case 3: {
                return FfmpegAudioDecoder.J(list);
            }
            case 2: {
                return FfmpegAudioDecoder.H(list);
            }
            case 1: 
            case 4: {
                return list.get(0);
            }
            case 0: 
        }
        return FfmpegAudioDecoder.K(list);
    }

    private static byte[] J(List<byte[]> list) {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            byte[] byArray = FfmpegAudioDecoder.G(list.get(i8));
            if (byArray == null) continue;
            return byArray;
        }
        return null;
    }

    private static byte[] K(List<byte[]> object) {
        byte[] byArray = object.get(0);
        byte[] byArray2 = object.get(1);
        object = new byte[byArray.length + byArray2.length + 6];
        object[0] = (byte)(byArray.length >> 8);
        object[1] = (byte)(byArray.length & 0xFF);
        System.arraycopy(byArray, 0, object, 2, byArray.length);
        object[byArray.length + 2] = false;
        object[byArray.length + 3] = false;
        object[byArray.length + 4] = (byte)(byArray2.length >> 8);
        object[byArray.length + 5] = (byte)(byArray2.length & 0xFF);
        System.arraycopy(byArray2, 0, object, byArray.length + 6, byArray2.length);
        return object;
    }

    private native int ffmpegDecode(long var1, ByteBuffer var3, int var4, SimpleDecoderOutputBuffer var5, ByteBuffer var6, int var7);

    private native int ffmpegGetChannelCount(long var1);

    private native int ffmpegGetSampleRate(long var1);

    private native long ffmpegInitialize(String var1, byte[] var2, boolean var3, int var4, int var5);

    private native void ffmpegRelease(long var1);

    private native long ffmpegReset(long var1, byte[] var3);

    private ByteBuffer growOutputBuffer(SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, int n8) {
        this.r = n8;
        return simpleDecoderOutputBuffer.C(n8);
    }

    @Override
    public int A() {
        return this.v;
    }

    protected SimpleDecoderOutputBuffer D() {
        return new SimpleDecoderOutputBuffer(new a(this));
    }

    protected ax.W0.b E(Throwable throwable) {
        return new ax.W0.b("Unexpected decode error", throwable);
    }

    protected ax.W0.b F(i object, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, boolean bl) {
        if (bl) {
            long l8;
            this.s = l8 = this.ffmpegReset(this.s, this.p);
            if (l8 == 0L) {
                return new ax.W0.b("Error resetting (see logcat).");
            }
        }
        ByteBuffer byteBuffer = d0.i(((i)object).e0);
        int n8 = byteBuffer.limit();
        object = simpleDecoderOutputBuffer.D(((i)object).g0, this.r);
        if ((n8 = this.ffmpegDecode(this.s, byteBuffer, n8, simpleDecoderOutputBuffer, (ByteBuffer)object, this.r)) == -2) {
            return new ax.W0.b("Error decoding (see logcat).");
        }
        if (n8 == -1) {
            simpleDecoderOutputBuffer.e0 = true;
            return null;
        }
        if (n8 == 0) {
            simpleDecoderOutputBuffer.e0 = true;
            return null;
        }
        if (!this.t) {
            this.u = this.ffmpegGetChannelCount(this.s);
            this.v = this.ffmpegGetSampleRate(this.s);
            if (this.v == 0 && "alac".equals(this.o)) {
                n.n(this.p);
                object = new G(this.p);
                ((G)object).b0(this.p.length - 4);
                this.v = ((G)object).Q();
            }
            this.t = true;
        }
        object = n.n(simpleDecoderOutputBuffer.g0);
        ((ByteBuffer)object).position(0);
        ((ByteBuffer)object).limit(n8);
        return null;
    }

    @Override
    public void d() {
        super.d();
        this.ffmpegRelease(this.s);
        this.s = 0L;
    }

    @Override
    public String getName() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ffmpeg");
        stringBuilder.append(FfmpegLibrary.c());
        stringBuilder.append("-");
        stringBuilder.append(this.o);
        return stringBuilder.toString();
    }

    @Override
    protected i j() {
        return new i(2, FfmpegLibrary.b());
    }

    @Override
    public int y() {
        return this.u;
    }

    @Override
    public int z() {
        return this.q;
    }
}

