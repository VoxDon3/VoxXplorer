/*
 * Decompiled with CFR 0.152.
 */
package ax.K1;

import ax.K1.b;
import ax.S0.G;
import ax.S0.u;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class p {
    public static byte[] a(UUID uUID, byte[] byArray) {
        return p.b(uUID, null, byArray);
    }

    public static byte[] b(UUID uUID2, UUID[] uUIDArray, byte[] byArray) {
        int n8;
        int n9 = byArray != null ? byArray.length : 0;
        n9 = n8 = n9 + 32;
        if (uUIDArray != null) {
            n9 = n8 + (uUIDArray.length * 16 + 4);
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(n9);
        byteBuffer.putInt(n9);
        byteBuffer.putInt(1886614376);
        n9 = uUIDArray != null ? 0x1000000 : 0;
        byteBuffer.putInt(n9);
        byteBuffer.putLong(uUID2.getMostSignificantBits());
        byteBuffer.putLong(uUID2.getLeastSignificantBits());
        if (uUIDArray != null) {
            byteBuffer.putInt(uUIDArray.length);
            for (UUID uUID2 : uUIDArray) {
                byteBuffer.putLong(uUID2.getMostSignificantBits());
                byteBuffer.putLong(uUID2.getLeastSignificantBits());
            }
        }
        if (byArray != null && byArray.length != 0) {
            byteBuffer.putInt(byArray.length);
            byteBuffer.put(byArray);
        } else {
            byteBuffer.putInt(0);
        }
        return byteBuffer.array();
    }

    public static boolean c(byte[] byArray) {
        return p.d(byArray) != null;
    }

    public static a d(byte[] object) {
        Object[] objectArray;
        int n8;
        G g8 = new G((byte[])object);
        if (g8.j() < 32) {
            return null;
        }
        g8.b0(0);
        int n9 = g8.a();
        int n10 = g8.v();
        if (n10 != n9) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Advertised atom size (");
            ((StringBuilder)object).append(n10);
            ((StringBuilder)object).append(") does not match buffer size: ");
            ((StringBuilder)object).append(n9);
            u.h("PsshAtomUtil", ((StringBuilder)object).toString());
            return null;
        }
        n10 = g8.v();
        if (n10 != 1886614376) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Atom type is not pssh: ");
            ((StringBuilder)object).append(n10);
            u.h("PsshAtomUtil", ((StringBuilder)object).toString());
            return null;
        }
        n9 = b.q(g8.v());
        if (n9 > 1) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Unsupported pssh version: ");
            ((StringBuilder)object).append(n9);
            u.h("PsshAtomUtil", ((StringBuilder)object).toString());
            return null;
        }
        UUID uUID = new UUID(g8.F(), g8.F());
        if (n9 == 1) {
            n8 = g8.Q();
            objectArray = new UUID[n8];
            n10 = 0;
            while (true) {
                object = objectArray;
                if (n10 < n8) {
                    objectArray[n10] = new UUID(g8.F(), g8.F());
                    ++n10;
                    continue;
                }
                break;
            }
        } else {
            object = null;
        }
        if ((n10 = g8.Q()) != (n8 = g8.a())) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Atom data size (");
            ((StringBuilder)object).append(n10);
            ((StringBuilder)object).append(") does not match the bytes left: ");
            ((StringBuilder)object).append(n8);
            u.h("PsshAtomUtil", ((StringBuilder)object).toString());
            return null;
        }
        objectArray = new byte[n10];
        g8.q((byte[])objectArray, 0, n10);
        return new a(uUID, n9, (byte[])objectArray, (UUID[])object);
    }

    public static byte[] e(byte[] object, UUID uUID) {
        if ((object = (Object)p.d(object)) == null) {
            return null;
        }
        if (!uUID.equals(object.a)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("UUID mismatch. Expected: ");
            stringBuilder.append(uUID);
            stringBuilder.append(", got: ");
            stringBuilder.append(object.a);
            stringBuilder.append(".");
            u.h("PsshAtomUtil", stringBuilder.toString());
            return null;
        }
        return object.c;
    }

    public static UUID f(byte[] object) {
        if ((object = (Object)p.d(object)) == null) {
            return null;
        }
        return object.a;
    }

    public static int g(byte[] object) {
        if ((object = (Object)p.d(object)) == null) {
            return -1;
        }
        return object.b;
    }

    public static final class a {
        public final UUID a;
        public final int b;
        public final byte[] c;
        public final UUID[] d;

        a(UUID uUID, int n8, byte[] byArray, UUID[] uUIDArray) {
            this.a = uUID;
            this.b = n8;
            this.c = byArray;
            this.d = uUIDArray;
        }
    }
}

