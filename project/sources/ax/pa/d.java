package ax.pa;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class d extends f {
    private int c;

    public d(OutputStream outputStream) {
        super(outputStream);
        this.c = 131072;
    }

    public void f() throws IOException {
        c(0);
    }

    public void g() throws IOException {
        int i = this.c;
        this.c = i + 4;
        c(i);
    }

    public boolean h(Object obj) throws IOException {
        if (obj == null) {
            f();
            return false;
        }
        g();
        return true;
    }
}
