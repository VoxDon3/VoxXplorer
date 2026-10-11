package ax.Aa;

import ax.oa.c;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes3.dex */
public class a extends IOException {
    private final c c0;
    private final int q;

    public a(int i) {
        this.q = i;
        this.c0 = c.h(i);
    }

    public static a c(ax.pa.c cVar) throws IOException {
        int i;
        try {
            i = cVar.f();
        } catch (EOFException unused) {
            i = -1;
        }
        return new a(i);
    }

    public c a() {
        return this.c0;
    }

    public int b() {
        return this.q;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return String.format("Fault: %s (0x%08X)", a(), Integer.valueOf(b()));
    }
}
