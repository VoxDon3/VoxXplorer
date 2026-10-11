package ax.pb;

import ax.qb.C2896d;
import ax.qb.C2897e;
import okhttp3.internal.http2.Settings;

/* renamed from: ax.pb.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C2812l extends Q {
    private int Y0;
    private int Z0;
    String a1;

    /* renamed from: ax.pb.l$a */
    class a implements InterfaceC2807h {
        String a;
        int b;
        int c;
        int d;
        String e;

        a() {
        }

        @Override // ax.pb.InterfaceC2807h
        public int a() {
            return (this.d & Integer.MIN_VALUE) != 0 ? 2 : 4;
        }

        @Override // ax.pb.InterfaceC2807h
        public int b() {
            return 17;
        }

        @Override // ax.pb.InterfaceC2807h
        public long c() {
            return 0L;
        }

        @Override // ax.pb.InterfaceC2807h
        public String getName() {
            return this.a;
        }

        @Override // ax.pb.InterfaceC2807h
        public long h() {
            return 0L;
        }

        @Override // ax.pb.InterfaceC2807h
        public long length() {
            return 0L;
        }

        public String toString() {
            return new String("ServerInfo1[name=" + this.a + ",versionMajor=" + this.b + ",versionMinor=" + this.c + ",type=0x" + C2896d.c(this.d, 8) + ",commentOrMasterBrowser=" + this.e + "]");
        }
    }

    C2812l() {
    }

    @Override // ax.pb.Q
    int E(byte[] bArr, int i, int i2) {
        int i3;
        this.X0 = new a[this.W0];
        int i4 = i;
        a aVar = null;
        int i5 = 0;
        while (true) {
            i3 = this.W0;
            if (i5 >= i3) {
                break;
            }
            InterfaceC2807h[] interfaceC2807hArr = this.X0;
            a aVar2 = new a();
            interfaceC2807hArr[i5] = aVar2;
            aVar2.a = o(bArr, i4, 16, false);
            aVar2.b = bArr[i4 + 16] & 255;
            aVar2.c = bArr[i4 + 17] & 255;
            aVar2.d = AbstractC2818s.j(bArr, i4 + 18);
            int j = AbstractC2818s.j(bArr, i4 + 22);
            i4 += 26;
            aVar2.e = o(bArr, ((j & Settings.DEFAULT_INITIAL_WINDOW_SIZE) - this.Y0) + i, 48, false);
            if (C2897e.c0 >= 4) {
                AbstractC2818s.A0.println(aVar2);
            }
            i5++;
            aVar = aVar2;
        }
        this.a1 = i3 != 0 ? aVar.a : null;
        return i4 - i;
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
        return new String("NetServerEnum2Response[" + super.toString() + ",status=" + this.V0 + ",converter=" + this.Y0 + ",entriesReturned=" + this.W0 + ",totalAvailableEntries=" + this.Z0 + ",lastName=" + this.a1 + "]");
    }
}
