/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.net.Uri;
import ax.Q2.d;
import ax.X2.v;
import ax.b3.a;
import ax.b3.j;
import ax.b3.t;
import ax.c3.G;
import ax.c3.Y;
import ax.c3.d0;
import ax.c3.k0;
import ax.g3.i;
import ax.u3.b;
import ax.u3.c;
import com.voxdon.xplorer.file.g;
import com.voxdon.xplorer.file.h;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.p;
import java.io.IOException;
import java.io.OutputStream;

public class L
extends h {
    public static Uri q0(Uri uri) {
        return Uri.parse((String)uri.toString().replace("/tree/", "/root/"));
    }

    public static Uri r0(Uri uri) {
        return Uri.parse((String)uri.toString().replace("/root/", "/tree/"));
    }

    @Override
    public boolean B(n n8) {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void D(n n8, G g8, String string, long l8, Long l9, p p8, boolean bl, c c8, i i8) throws j, a {
        super.D(n8, g8, string, l8, l9, p8, bl, c8, i8);
        try {
            Thread.sleep(80L);
            return;
        }
        catch (InterruptedException interruptedException) {
            return;
        }
    }

    @Override
    public void E(n n8, n n9, c c8, i i8) throws j {
        b.a(n9.n());
        if (n8.n()) {
            g.L(this, n8, n9, c8, i8);
            return;
        }
        throw new t();
    }

    @Override
    public OutputStream c(String string, boolean bl) throws IOException {
        return new Y(this, super.c(string, bl)){
            final L c0;
            {
                this.c0 = l8;
                super(outputStream);
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public void close() throws IOException {
                super.close();
                try {
                    Thread.sleep(80L);
                    return;
                }
                catch (InterruptedException interruptedException) {
                    return;
                }
            }
        };
    }

    @Override
    public k0 y() throws j {
        return null;
    }

    @Override
    public n z(String string) throws j {
        if ("/".equals(string)) {
            Object object = this.p0();
            if (object != null) {
                return this.m0(string, v.c((Uri)object, v.h((Uri)object)));
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("path:");
            ((StringBuilder)object).append(string);
            d.c("mtp root uri null", new Exception(((StringBuilder)object).toString()));
            throw new ax.b3.h("Storage is not connected");
        }
        String string2 = d0.h(string);
        Object object = this.z(d0.r(string));
        if (object.n() && (object = this.b0((n)object)) != null) {
            object = object.iterator();
            while (object.hasNext()) {
                n n8 = (n)object.next();
                if (!string2.equals(n8.B())) continue;
                return n8;
            }
        }
        return new com.voxdon.xplorer.file.i(this, string);
    }
}

