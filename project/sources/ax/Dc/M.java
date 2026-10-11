package ax.Dc;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class M {
    static final L a = a("UTF8");

    public static L a(String str) {
        Charset defaultCharset = Charset.defaultCharset();
        if (str != null) {
            try {
                defaultCharset = Charset.forName(str);
            } catch (UnsupportedCharsetException unused) {
            }
        }
        return new C0678m(defaultCharset, c(defaultCharset.name()));
    }

    static ByteBuffer b(ByteBuffer byteBuffer, int i) {
        byteBuffer.limit(byteBuffer.position());
        byteBuffer.rewind();
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity() + i);
        allocate.put(byteBuffer);
        return allocate;
    }

    static boolean c(String str) {
        if (str == null) {
            str = Charset.defaultCharset().name();
        }
        Charset charset = StandardCharsets.UTF_8;
        if (charset.name().equalsIgnoreCase(str)) {
            return true;
        }
        Iterator<String> it = charset.aliases().iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
