/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.decoder;

import androidx.media3.decoder.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class SimpleDecoderOutputBuffer
extends a {
    private final a.a<SimpleDecoderOutputBuffer> f0;
    public ByteBuffer g0;

    public SimpleDecoderOutputBuffer(a.a<SimpleDecoderOutputBuffer> a8) {
        this.f0 = a8;
    }

    @Override
    public void B() {
        this.f0.a(this);
    }

    public ByteBuffer C(int n8) {
        ByteBuffer byteBuffer = ax.S0.a.e(this.g0);
        boolean bl = n8 >= byteBuffer.limit();
        ax.S0.a.a(bl);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(n8).order(ByteOrder.nativeOrder());
        int n9 = byteBuffer.position();
        byteBuffer.position(0);
        byteBuffer2.put(byteBuffer);
        byteBuffer2.position(n9);
        byteBuffer2.limit(n8);
        this.g0 = byteBuffer2;
        return byteBuffer2;
    }

    public ByteBuffer D(long l8, int n8) {
        this.c0 = l8;
        ByteBuffer byteBuffer = this.g0;
        if (byteBuffer == null || byteBuffer.capacity() < n8) {
            this.g0 = ByteBuffer.allocateDirect(n8).order(ByteOrder.nativeOrder());
        }
        this.g0.position(0);
        this.g0.limit(n8);
        return this.g0;
    }

    @Override
    public void p() {
        super.p();
        ByteBuffer byteBuffer = this.g0;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }
}

