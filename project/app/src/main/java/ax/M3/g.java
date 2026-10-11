/*
 * Decompiled with CFR 0.152.
 */
package ax.M3;

import ax.M3.f;
import ax.Q3.b;
import ax.X3.l;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

public final class g {
    public static int a(List<f> object, InputStream object2, b b8) throws IOException {
        if (object2 == null) {
            return -1;
        }
        InputStream inputStream = object2;
        if (!((InputStream)object2).markSupported()) {
            inputStream = new l((InputStream)object2, b8);
        }
        inputStream.mark(0x500000);
        object = object.iterator();
        while (object.hasNext()) {
            block5: {
                int n8;
                object2 = (f)object.next();
                try {
                    n8 = object2.b(inputStream, b8);
                    if (n8 == -1) break block5;
                }
                catch (Throwable throwable) {
                    inputStream.reset();
                    throw throwable;
                }
                inputStream.reset();
                return n8;
            }
            inputStream.reset();
        }
        return -1;
    }

    public static f.a b(List<f> object, InputStream object2, b object3) throws IOException {
        if (object2 == null) {
            return f.a.j0;
        }
        InputStream inputStream = object2;
        if (!((InputStream)object2).markSupported()) {
            inputStream = new l((InputStream)object2, (b)object3);
        }
        inputStream.mark(0x500000);
        object = object.iterator();
        while (object.hasNext()) {
            block5: {
                object2 = (f)object.next();
                try {
                    object3 = object2.c(inputStream);
                    object2 = f.a.j0;
                    if (object3 == object2) break block5;
                }
                catch (Throwable throwable) {
                    inputStream.reset();
                    throw throwable;
                }
                inputStream.reset();
                return object3;
            }
            inputStream.reset();
        }
        return f.a.j0;
    }

    public static f.a c(List<f> object, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return f.a.j0;
        }
        Iterator<f> iterator = object.iterator();
        while (iterator.hasNext()) {
            object = iterator.next().a(byteBuffer);
            if (object == f.a.j0) continue;
            return object;
        }
        return f.a.j0;
    }
}

