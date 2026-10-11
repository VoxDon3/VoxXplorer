/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.L;
import ax.Dc.m;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;

public abstract class M {
    static final L a = M.a("UTF8");

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static L a(String string) {
        Charset charset;
        Charset charset2 = charset = Charset.defaultCharset();
        if (string == null) return new m(charset2, M.c(charset2.name()));
        try {
            charset2 = Charset.forName(string);
            return new m(charset2, M.c(charset2.name()));
        }
        catch (UnsupportedCharsetException unsupportedCharsetException) {
            charset2 = charset;
            return new m(charset2, M.c(charset2.name()));
        }
    }

    static ByteBuffer b(ByteBuffer byteBuffer, int n8) {
        byteBuffer.limit(byteBuffer.position());
        byteBuffer.rewind();
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(byteBuffer.capacity() + n8);
        byteBuffer2.put(byteBuffer);
        return byteBuffer2;
    }

    static boolean c(String iterator) {
        String string = iterator;
        if (iterator == null) {
            string = Charset.defaultCharset().name();
        }
        if (((Charset)((Object)(iterator = StandardCharsets.UTF_8))).name().equalsIgnoreCase(string)) {
            return true;
        }
        iterator = ((Charset)((Object)iterator)).aliases().iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().equalsIgnoreCase(string)) continue;
            return true;
        }
        return false;
    }
}

