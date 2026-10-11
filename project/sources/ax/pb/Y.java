package ax.pb;

import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes3.dex */
class Y extends AbstractC2818s {
    long C0;

    Y() {
    }

    @Override // ax.pb.AbstractC2818s
    int g(byte[] bArr, int i) {
        return 0;
    }

    @Override // ax.pb.AbstractC2818s
    int l(byte[] bArr, int i) {
        this.C0 = AbstractC2818s.i(bArr, i) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        return 8;
    }

    @Override // ax.pb.AbstractC2818s
    public String toString() {
        return new String("SmbComWriteResponse[" + super.toString() + ",count=" + this.C0 + "]");
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
