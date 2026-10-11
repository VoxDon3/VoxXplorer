package ax.pb;

import ax.qb.C2896d;
import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
public class j0 implements InterfaceC2807h {
    protected String a;
    protected int b;
    protected String c;

    public j0() {
    }

    @Override // ax.pb.InterfaceC2807h
    public int a() {
        int i = this.b & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        if (i != 1) {
            return i != 3 ? 8 : 16;
        }
        return 32;
    }

    @Override // ax.pb.InterfaceC2807h
    public int b() {
        return 17;
    }

    @Override // ax.pb.InterfaceC2807h
    public long c() {
        return 0L;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j0) {
            return this.a.equals(((j0) obj).a);
        }
        return false;
    }

    @Override // ax.pb.InterfaceC2807h
    public String getName() {
        return this.a;
    }

    @Override // ax.pb.InterfaceC2807h
    public long h() {
        return 0L;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // ax.pb.InterfaceC2807h
    public long length() {
        return 0L;
    }

    public String toString() {
        return new String("SmbShareInfo[netName=" + this.a + ",type=0x" + C2896d.c(this.b, 8) + ",remark=" + this.c + "]");
    }

    public j0(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }
}
