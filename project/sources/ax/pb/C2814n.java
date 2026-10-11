package ax.pb;

import ax.qb.C2897e;
import okhttp3.internal.http2.Settings;

/* renamed from: ax.pb.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C2814n extends Q {
    private int Y0;
    private int Z0;

    C2814n() {
    }

    @Override // ax.pb.Q
    int E(byte[] bArr, int i, int i2) {
        this.q0 = false;
        this.X0 = new j0[this.W0];
        int i3 = i;
        for (int i4 = 0; i4 < this.W0; i4++) {
            InterfaceC2807h[] interfaceC2807hArr = this.X0;
            j0 j0Var = new j0();
            interfaceC2807hArr[i4] = j0Var;
            j0Var.a = o(bArr, i3, 13, false);
            j0Var.b = AbstractC2818s.i(bArr, i3 + 14);
            int j = AbstractC2818s.j(bArr, i3 + 16);
            i3 += 20;
            j0Var.c = o(bArr, ((j & Settings.DEFAULT_INITIAL_WINDOW_SIZE) - this.Y0) + i, 128, false);
            if (C2897e.c0 >= 4) {
                AbstractC2818s.A0.println(j0Var);
            }
        }
        return i3 - i;
    }

    @Override // ax.pb.Q
    int F(byte[] bArr, int i, int i2) {
        this.V0 = AbstractC2818s.i(bArr, i);
        this.Y0 = AbstractC2818s.i(bArr, i + 2);
        this.W0 = AbstractC2818s.i(bArr, i + 4);
        this.Z0 = AbstractC2818s.i(bArr, i + 6);
        return (i + 8) - i;
    }

    @Override // ax.pb.Q, ax.pb.AbstractC2818s
    public String toString() {
        return new String("NetShareEnumResponse[" + super.toString() + ",status=" + this.V0 + ",converter=" + this.Y0 + ",entriesReturned=" + this.W0 + ",totalAvailableEntries=" + this.Z0 + "]");
    }
}
