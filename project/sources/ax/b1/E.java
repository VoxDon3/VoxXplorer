package ax.b1;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import ax.P0.C0906o;
import ax.Z0.I1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public interface E {

    public static final class a {
        private final byte[] a;
        private final String b;
        private final int c;

        public a(byte[] bArr, String str, int i) {
            this.a = bArr;
            this.b = str;
            this.c = i;
        }

        public byte[] a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    public interface b {
        void a(E e, byte[] bArr, int i, int i2, byte[] bArr2);
    }

    public interface c {
        E a(UUID uuid);
    }

    public static final class d {
        private final byte[] a;
        private final String b;

        public d(byte[] bArr, String str) {
            this.a = bArr;
            this.b = str;
        }

        public byte[] a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    Map<String, String> a(byte[] bArr);

    d b();

    ax.V0.b c(byte[] bArr) throws MediaCryptoException;

    void d();

    byte[] e() throws MediaDrmException;

    boolean f(byte[] bArr, String str);

    void g(byte[] bArr, byte[] bArr2);

    void h(byte[] bArr);

    void i(byte[] bArr, I1 i1);

    byte[] j(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    void k(b bVar);

    void l(byte[] bArr) throws DeniedByServerException;

    a m(byte[] bArr, List<C0906o.b> list, int i, HashMap<String, String> hashMap) throws NotProvisionedException;

    int n();
}
