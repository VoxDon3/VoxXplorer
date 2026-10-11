package ax.c3;

import android.net.Uri;
import ax.b3.C1486a;
import ax.b3.C1493h;
import ax.b3.C1495j;
import ax.u3.C3184b;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3588g;
import com.voxdon.xplorer.file.C3589h;
import com.voxdon.xplorer.file.C3590i;
import com.voxdon.xplorer.file.C3597p;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* loaded from: classes.dex */
public class L extends C3589h {

    class a extends Y {
        a(OutputStream outputStream) {
            super(outputStream);
        }

        @Override // ax.c3.Y, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            try {
                Thread.sleep(80L);
            } catch (InterruptedException unused) {
            }
        }
    }

    public static Uri q0(Uri uri) {
        return Uri.parse(uri.toString().replace("/tree/", "/root/"));
    }

    public static Uri r0(Uri uri) {
        return Uri.parse(uri.toString().replace("/root/", "/tree/"));
    }

    @Override // com.voxdon.xplorer.file.C3589h, com.voxdon.xplorer.file.InterfaceC3584c
    public boolean B(AbstractC3595n abstractC3595n) {
        return false;
    }

    @Override // com.voxdon.xplorer.file.C3589h, com.voxdon.xplorer.file.InterfaceC3584c
    public void D(AbstractC3595n abstractC3595n, G g, String str, long j, Long l, C3597p c3597p, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        super.D(abstractC3595n, g, str, j, l, c3597p, z, interfaceC3185c, iVar);
        try {
            Thread.sleep(80L);
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.voxdon.xplorer.file.C3589h, com.voxdon.xplorer.file.InterfaceC3584c
    public void E(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j {
        C3184b.a(abstractC3595n2.n());
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        C3588g.L(this, abstractC3595n, abstractC3595n2, interfaceC3185c, iVar);
    }

    @Override // com.voxdon.xplorer.file.C3589h, ax.c3.X
    public OutputStream c(String str, boolean z) throws IOException {
        return new a(super.c(str, z));
    }

    @Override // com.voxdon.xplorer.file.C3589h, com.voxdon.xplorer.file.AbstractC3594m
    public k0 y() throws C1495j {
        return null;
    }

    @Override // com.voxdon.xplorer.file.C3589h, com.voxdon.xplorer.file.InterfaceC3584c
    public AbstractC3595n z(String str) throws C1495j {
        List<AbstractC3595n> b0;
        if ("/".equals(str)) {
            Uri p0 = p0();
            if (p0 != null) {
                return m0(str, ax.X2.v.c(p0, ax.X2.v.h(p0)));
            }
            ax.Q2.d.c("mtp root uri null", new Exception("path:" + str));
            throw new C1493h("Storage is not connected");
        }
        String h = d0.h(str);
        AbstractC3595n z = z(d0.r(str));
        if (z.n() && (b0 = b0(z)) != null) {
            for (AbstractC3595n abstractC3595n : b0) {
                if (h.equals(abstractC3595n.B())) {
                    return abstractC3595n;
                }
            }
        }
        return new C3590i(this, str);
    }
}
