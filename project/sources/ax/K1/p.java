package ax.K1;

import ax.S0.C0987u;
import ax.S0.G;
import java.nio.ByteBuffer;
import java.util.UUID;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes.dex */
public final class p {

    public static final class a {
        public final UUID a;
        public final int b;
        public final byte[] c;
        public final UUID[] d;

        a(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
            this.a = uuid;
            this.b = i;
            this.c = bArr;
            this.d = uuidArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    public static a d(byte[] bArr) {
        UUID[] uuidArr;
        G g = new G(bArr);
        if (g.j() < 32) {
            return null;
        }
        g.b0(0);
        int a2 = g.a();
        int v = g.v();
        if (v != a2) {
            C0987u.h("PsshAtomUtil", "Advertised atom size (" + v + ") does not match buffer size: " + a2);
            return null;
        }
        int v2 = g.v();
        if (v2 != 1886614376) {
            C0987u.h("PsshAtomUtil", "Atom type is not pssh: " + v2);
            return null;
        }
        int q = b.q(g.v());
        if (q > 1) {
            C0987u.h("PsshAtomUtil", "Unsupported pssh version: " + q);
            return null;
        }
        UUID uuid = new UUID(g.F(), g.F());
        if (q == 1) {
            int Q = g.Q();
            uuidArr = new UUID[Q];
            for (int i = 0; i < Q; i++) {
                uuidArr[i] = new UUID(g.F(), g.F());
            }
        } else {
            uuidArr = null;
        }
        int Q2 = g.Q();
        int a3 = g.a();
        if (Q2 == a3) {
            byte[] bArr2 = new byte[Q2];
            g.q(bArr2, 0, Q2);
            return new a(uuid, q, bArr2, uuidArr);
        }
        C0987u.h("PsshAtomUtil", "Atom data size (" + Q2 + ") does not match the bytes left: " + a3);
        return null;
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a d = d(bArr);
        if (d == null) {
            return null;
        }
        if (uuid.equals(d.a)) {
            return d.c;
        }
        C0987u.h("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + d.a + ".");
        return null;
    }

    public static UUID f(byte[] bArr) {
        a d = d(bArr);
        if (d == null) {
            return null;
        }
        return d.a;
    }

    public static int g(byte[] bArr) {
        a d = d(bArr);
        if (d == null) {
            return -1;
        }
        return d.b;
    }
}
