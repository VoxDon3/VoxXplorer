/*
 * Decompiled with CFR 0.152.
 */
package ax.b8;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

public class g {
    private static final byte a = Byte.parseByte("01110000", 2);
    private static final byte b = Byte.parseByte("00001111", 2);

    private static String b(byte[] byArray) {
        return new String(Base64.encode((byte[])byArray, (int)11), Charset.defaultCharset()).substring(0, 22);
    }

    private static byte[] c(UUID uUID, byte[] object) {
        object = ByteBuffer.wrap((byte[])object);
        ((ByteBuffer)object).putLong(uUID.getMostSignificantBits());
        ((ByteBuffer)object).putLong(uUID.getLeastSignificantBits());
        return ((ByteBuffer)object).array();
    }

    public String a() {
        byte by;
        byte[] byArray = g.c(UUID.randomUUID(), new byte[17]);
        byArray[16] = by = byArray[0];
        byArray[0] = (byte)(by & b | a);
        return g.b(byArray);
    }
}

