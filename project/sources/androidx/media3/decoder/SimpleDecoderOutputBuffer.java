package androidx.media3.decoder;

import androidx.media3.decoder.a;
import ax.S0.C0968a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class SimpleDecoderOutputBuffer extends a {
    private final a.InterfaceC0027a<SimpleDecoderOutputBuffer> f0;
    public ByteBuffer g0;

    public SimpleDecoderOutputBuffer(a.InterfaceC0027a<SimpleDecoderOutputBuffer> interfaceC0027a) {
        this.f0 = interfaceC0027a;
    }

    @Override // androidx.media3.decoder.a
    public void B() {
        this.f0.a(this);
    }

    public ByteBuffer C(int i) {
        ByteBuffer byteBuffer = (ByteBuffer) C0968a.e(this.g0);
        C0968a.a(i >= byteBuffer.limit());
        ByteBuffer order = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        int position = byteBuffer.position();
        byteBuffer.position(0);
        order.put(byteBuffer);
        order.position(position);
        order.limit(i);
        this.g0 = order;
        return order;
    }

    public ByteBuffer D(long j, int i) {
        this.c0 = j;
        ByteBuffer byteBuffer = this.g0;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.g0 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        }
        this.g0.position(0);
        this.g0.limit(i);
        return this.g0;
    }

    @Override // androidx.media3.decoder.a, ax.V0.a
    public void p() {
        super.p();
        ByteBuffer byteBuffer = this.g0;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }
}
