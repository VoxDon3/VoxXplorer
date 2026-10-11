package ax.kb;

import ax.pb.C2800d0;
import ax.pb.C2802e0;
import ax.pb.C2806g0;
import ax.pb.r;
import ax.qb.C2894b;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class h extends f {
    C2806g0 g;
    C2800d0 h = null;
    C2802e0 i = null;
    boolean j = true;

    public h(String str, r rVar) throws UnknownHostException, MalformedURLException, e {
        this.b = f.f(str);
        String str2 = "smb://" + this.b.b + "/IPC$/" + this.b.c.substring(6);
        String str3 = (String) this.b.a("server");
        String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str3 != null) {
            str4 = HttpUrl.FRAGMENT_ENCODE_SET + "&server=" + str3;
        }
        String str5 = (String) this.b.a("address");
        if (str3 != null) {
            str4 = str4 + "&address=" + str5;
        }
        if (str4.length() > 0) {
            str2 = str2 + "?" + str4.substring(1);
        }
        this.g = new C2806g0(str2, 27198979, rVar);
    }

    @Override // ax.kb.f
    public void b() throws IOException {
        this.e = 0;
        C2802e0 c2802e0 = this.i;
        if (c2802e0 != null) {
            c2802e0.close();
        }
    }

    @Override // ax.kb.f
    protected void c(byte[] bArr, boolean z) throws IOException {
        if (bArr.length < this.d) {
            throw new IllegalArgumentException("buffer too small");
        }
        int a = (!this.j || z) ? this.h.a(bArr, 0, bArr.length) : this.h.read(bArr, 0, 1024);
        if (bArr[0] != 5 && bArr[1] != 0) {
            throw new IOException("Unexpected DCERPC PDU header");
        }
        this.j = (bArr[3] & 2) == 2;
        short d = C2894b.d(bArr, 8);
        if (d <= this.d) {
            while (a < d) {
                a += this.h.a(bArr, a, d - a);
            }
        } else {
            throw new IOException("Unexpected fragment length: " + ((int) d));
        }
    }

    @Override // ax.kb.f
    protected void d(byte[] bArr, int i, int i2, boolean z) throws IOException {
        C2802e0 c2802e0 = this.i;
        if (c2802e0 != null && !c2802e0.isOpen()) {
            throw new IOException("DCERPC pipe is no longer open");
        }
        if (this.h == null) {
            this.h = (C2800d0) this.g.e0();
        }
        if (this.i == null) {
            this.i = (C2802e0) this.g.f0();
        }
        if (z) {
            this.i.e(bArr, i, i2, 1);
        } else {
            this.i.write(bArr, i, i2);
        }
    }
}
