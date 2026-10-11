/*
 * Decompiled with CFR 0.152.
 */
package ax.b1;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import ax.P0.o;
import ax.Z0.I1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface E {
    public Map<String, String> a(byte[] var1);

    public d b();

    public ax.V0.b c(byte[] var1) throws MediaCryptoException;

    public void d();

    public byte[] e() throws MediaDrmException;

    public boolean f(byte[] var1, String var2);

    public void g(byte[] var1, byte[] var2);

    public void h(byte[] var1);

    public void i(byte[] var1, I1 var2);

    public byte[] j(byte[] var1, byte[] var2) throws NotProvisionedException, DeniedByServerException;

    public void k(b var1);

    public void l(byte[] var1) throws DeniedByServerException;

    public a m(byte[] var1, List<o.b> var2, int var3, HashMap<String, String> var4) throws NotProvisionedException;

    public int n();

    public static final class a {
        private final byte[] a;
        private final String b;
        private final int c;

        public a(byte[] byArray, String string, int n8) {
            this.a = byArray;
            this.b = string;
            this.c = n8;
        }

        public byte[] a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    public static interface b {
        public void a(E var1, byte[] var2, int var3, int var4, byte[] var5);
    }

    public static interface c {
        public E a(UUID var1);
    }

    public static final class d {
        private final byte[] a;
        private final String b;

        public d(byte[] byArray, String string) {
            this.a = byArray;
            this.b = string;
        }

        public byte[] a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }
}

