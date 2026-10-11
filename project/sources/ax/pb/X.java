package ax.pb;

import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes3.dex */
class X extends AbstractC2795b {
    long F0;

    X() {
    }

    @Override // ax.pb.AbstractC2818s
    int g(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.AbstractC2818s
    int l(byte[] bArr, int i) {
        this.F0 = AbstractC2818s.i(bArr, i) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        return 8;
    }

    @Override // ax.pb.AbstractC2795b, ax.pb.AbstractC2818s
    public String toString() {
        return new String("SmbComWriteAndXResponse[" + super.toString() + ",count=" + this.F0 + "]");
    }

    @Override // ax.pb.AbstractC2818s
    int u(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.AbstractC2818s
    int z(byte[] bArr, int i) {
        return 0;
    }
}
