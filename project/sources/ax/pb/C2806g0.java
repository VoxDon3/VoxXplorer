package ax.pb;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

/* renamed from: ax.pb.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2806g0 extends C2796b0 {
    InputStream E0;
    OutputStream F0;
    int G0;

    public C2806g0(String str, int i, r rVar) throws MalformedURLException, UnknownHostException {
        super(str, rVar);
        this.G0 = i;
        this.r0 = 16;
    }

    public InputStream e0() throws IOException {
        if (this.E0 == null) {
            int i = this.G0;
            if ((i & 256) == 256 || (i & 512) == 512) {
                this.E0 = new F0(this);
            } else {
                this.E0 = new C2800d0(this, (this.G0 & (-65281)) | 32);
            }
        }
        return this.E0;
    }

    public OutputStream f0() throws IOException {
        if (this.F0 == null) {
            int i = this.G0;
            if ((i & 256) == 256 || (i & 512) == 512) {
                this.F0 = new G0(this);
            } else {
                this.F0 = new C2802e0(this, false, (this.G0 & (-65281)) | 32);
            }
        }
        return this.F0;
    }
}
