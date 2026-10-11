package ax.rb;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: ax.rb.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3025d extends IOException {
    private Throwable q;

    public C3025d() {
    }

    public Throwable a() {
        return this.q;
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (this.q == null) {
            return super.toString();
        }
        StringWriter stringWriter = new StringWriter();
        this.q.printStackTrace(new PrintWriter(stringWriter));
        return super.toString() + "\n" + stringWriter;
    }

    public C3025d(String str) {
        super(str);
    }

    public C3025d(Throwable th) {
        this.q = th;
    }

    public C3025d(String str, Throwable th) {
        super(str);
        this.q = th;
    }
}
