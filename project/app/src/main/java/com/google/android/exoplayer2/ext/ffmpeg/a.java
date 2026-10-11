/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.exoplayer2.ext.ffmpeg;

import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import ax.P0.v;
import ax.S0.G;
import ax.S0.d0;
import ax.V0.i;
import ax.W0.b;
import com.google.android.exoplayer2.ext.ffmpeg.FfmpegDecoder;
import com.google.android.exoplayer2.ext.ffmpeg.FfmpegLibrary;
import java.nio.ByteBuffer;
import java.util.List;

@Deprecated
public final class a
extends ax.W0.a {
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public a(boolean bl, v object, int n8, int n9, int n10, boolean bl2, int n11) throws b {
        super(new i[n8], new SimpleDecoderOutputBuffer[n9]);
        this.x = bl;
        this.y = new FfmpegDecoder(bl);
        if (!FfmpegLibrary.f()) {
            throw new b("Failed to load decoder native libraries.");
        }
        try {
            long l8;
            String string = ((v)object).o;
            if (string == null) {
                object = new b("audio decoder sample mime type null.");
                throw object;
            }
            this.o = string = FfmpegLibrary.c(string);
            if (string == null) {
                object = new b("audio decoder codecName null.");
                throw object;
            }
            byte[] byArray = a.G(((v)object).o, ((v)object).r);
            this.p = byArray;
            n8 = bl2 ? 4 : 2;
            this.q = n8;
            n8 = bl2 ? 131072 : 65536;
            this.r = n8;
            this.s = l8 = this.y.d(string, byArray, bl2, ((v)object).H, ((v)object).G);
            if (l8 != 0L) {
                this.w = n11;
                this.x(n10);
                return;
            }
            object = new b("Initialization failed.");
            throw object;
        }
        catch (Error error) {
            throw new b("Initialization failed.");
        }
    }

    public static /* synthetic */ void B(a a8, androidx.media3.decoder.a a9) {
        a8.u(a9);
    }

    private static byte[] F(List<byte[]> object) {
        byte[] byArray = object.get(0);
        int n8 = byArray.length + 12;
        object = ByteBuffer.allocate(n8);
        ((ByteBuffer)object).putInt(n8);
        ((ByteBuffer)object).putInt(1634492771);
        ((ByteBuffer)object).putInt(0);
        ((ByteBuffer)object).put(byArray, 0, byArray.length);
        return ((ByteBuffer)object).array();
    }

    private static byte[] G(String string, List<byte[]> list) {
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 1504891608: {
                if (!string.equals("audio/opus")) break;
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
            case 2: {
                return a.F(list);
            }
            case 1: 
            case 3: {
                return list.get(0);
            }
            case 0: 
        }
        return a.H(list);
    }

    private static byte[] H(List<byte[]> object) {
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

    @Override
    public int A() {
        return this.v;
    }

    protected SimpleDecoderOutputBuffer C() {
        return new SimpleDecoderOutputBuffer(new ax.B5.a(this));
    }

    protected b D(Throwable throwable) {
        return new b("Unexpected decode error", throwable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected b E(i object, SimpleDecoderOutputBuffer object2, boolean bl) {
        ByteBuffer byteBuffer;
        if (bl) {
            try {
                long l8;
                this.s = l8 = this.y.f(this.s, this.p);
                if (l8 == 0L) {
                    return new b("Error resetting (see logcat).");
                }
            }
            catch (Error error) {
                return this.D(error);
            }
        }
        if ((byteBuffer = d0.i(((i)object).e0)) == null) {
            return new b("Input data null.");
        }
        int n8 = byteBuffer.limit();
        object = ((SimpleDecoderOutputBuffer)object2).D(((i)object).g0, this.r);
        if ((n8 = this.y.a(this.s, byteBuffer, n8, (ByteBuffer)object, this.r, this.w)) == -2) {
            return new b("Error decoding (see logcat).");
        }
        if (n8 == -1) {
            ((androidx.media3.decoder.a)object2).e0 = true;
            return null;
        }
        if (n8 == 0) {
            ((androidx.media3.decoder.a)object2).e0 = true;
            return null;
        }
        if (!this.t) {
            this.u = this.y.b(this.s);
            this.v = this.y.c(this.s);
            if (this.v == 0 && "alac".equals(this.o)) {
                ax.S0.a.e(this.p);
                object2 = new G(this.p);
                ((G)object2).b0(this.p.length - 4);
                this.v = ((G)object2).Q();
            }
            this.t = true;
        }
        ((ByteBuffer)object).position(0);
        ((ByteBuffer)object).limit(n8);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void d() {
        super.d();
        try {
            this.y.e(this.s);
        }
        catch (Error error) {}
        this.s = 0L;
    }

    @Override
    public String getName() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ffmpeg");
        stringBuilder.append(FfmpegLibrary.e());
        stringBuilder.append("-");
        stringBuilder.append(this.o);
        return stringBuilder.toString();
    }

    @Override
    protected i j() {
        return new i(2, FfmpegLibrary.d());
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

