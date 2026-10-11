/*
 * Decompiled with CFR 0.152.
 */
package ax.Bc;

import ax.Bc.e;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

abstract class f {
    private final Class<?>[] a;

    protected f(Class<?> ... classArray) {
        this.a = classArray;
    }

    protected static int f(Object object, int n8) {
        if (object instanceof Number) {
            return ((Number)object).intValue();
        }
        return n8;
    }

    boolean a(Object object) {
        Class<?>[] classArray = this.a;
        int n8 = classArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!classArray[i8].isInstance(object)) continue;
            return true;
        }
        return false;
    }

    abstract InputStream b(String var1, InputStream var2, long var3, e var5, byte[] var6, int var7) throws IOException;

    OutputStream c(OutputStream outputStream, Object object) throws IOException {
        throw new UnsupportedOperationException("Method doesn't support writing");
    }

    byte[] d(Object object) throws IOException {
        return ax.Kc.f.a;
    }

    Object e(e e8, InputStream inputStream) throws IOException {
        return null;
    }
}

