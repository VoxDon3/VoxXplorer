/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.F0;
import ax.pb.G0;
import ax.pb.b0;
import ax.pb.d0;
import ax.pb.e0;
import ax.pb.r;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

public class g0
extends b0 {
    InputStream E0;
    OutputStream F0;
    int G0;

    public g0(String string, int n8, r r8) throws MalformedURLException, UnknownHostException {
        super(string, r8);
        this.G0 = n8;
        this.r0 = 16;
    }

    public InputStream e0() throws IOException {
        if (this.E0 == null) {
            int n8 = this.G0;
            this.E0 = (n8 & 0x100) != 256 && (n8 & 0x200) != 512 ? new d0(this, this.G0 & 0xFFFF00FF | 0x20) : new F0(this);
        }
        return this.E0;
    }

    public OutputStream f0() throws IOException {
        if (this.F0 == null) {
            int n8 = this.G0;
            this.F0 = (n8 & 0x100) != 256 && (n8 & 0x200) != 512 ? new e0(this, false, this.G0 & 0xFFFF00FF | 0x20) : new G0(this);
        }
        return this.F0;
    }
}

