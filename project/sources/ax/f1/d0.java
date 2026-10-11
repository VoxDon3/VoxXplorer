package ax.f1;

import android.media.MediaCodec;
import android.os.Bundle;

/* loaded from: classes.dex */
class d0 implements InterfaceC2031z {
    private final MediaCodec a;

    public d0(MediaCodec mediaCodec) {
        this.a = mediaCodec;
    }

    @Override // ax.f1.InterfaceC2031z
    public void a(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // ax.f1.InterfaceC2031z
    public void b(int i, int i2, ax.V0.c cVar, long j, int i3) {
        this.a.queueSecureInputBuffer(i, i2, cVar.a(), j, i3);
    }

    @Override // ax.f1.InterfaceC2031z
    public void c(int i, int i2, int i3, long j, int i4) {
        this.a.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // ax.f1.InterfaceC2031z
    public void d() {
    }

    @Override // ax.f1.InterfaceC2031z
    public void flush() {
    }

    @Override // ax.f1.InterfaceC2031z
    public void shutdown() {
    }

    @Override // ax.f1.InterfaceC2031z
    public void start() {
    }
}
