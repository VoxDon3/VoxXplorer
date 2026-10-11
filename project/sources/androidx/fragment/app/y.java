package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
final class y extends Writer implements AutoCloseable {
    private StringBuilder c0 = new StringBuilder(128);
    private final String q;

    y(String str) {
        this.q = str;
    }

    private void a() {
        if (this.c0.length() > 0) {
            Log.d(this.q, this.c0.toString());
            StringBuilder sb = this.c0;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                a();
            } else {
                this.c0.append(c);
            }
        }
    }
}
