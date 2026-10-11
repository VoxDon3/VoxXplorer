/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

final class y
extends Writer
implements AutoCloseable {
    private StringBuilder c0 = new StringBuilder(128);
    private final String q;

    y(String string) {
        this.q = string;
    }

    private void a() {
        if (this.c0.length() > 0) {
            Log.d((String)this.q, (String)this.c0.toString());
            StringBuilder stringBuilder = this.c0;
            stringBuilder.delete(0, stringBuilder.length());
        }
    }

    @Override
    public void close() {
        this.a();
    }

    @Override
    public void flush() {
        this.a();
    }

    @Override
    public void write(char[] cArray, int n8, int n9) {
        for (int i8 = 0; i8 < n9; ++i8) {
            char c8 = cArray[n8 + i8];
            if (c8 == '\n') {
                this.a();
                continue;
            }
            this.c0.append(c8);
        }
    }
}

