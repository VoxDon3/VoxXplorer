package ax.c3;

import ax.b3.C1495j;
import ax.u3.C3184b;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class U extends AbstractC1818f {
    private InputStream a;
    private boolean b = false;
    private long c;

    public U(InputStream inputStream, long j) {
        this.a = inputStream;
        this.c = j;
    }

    @Override // ax.c3.G
    public boolean a() {
        return false;
    }

    @Override // ax.c3.G
    public InputStream c(long j) throws C1495j {
        if (this.b) {
            C3184b.g("createInputStream called twice");
        }
        if (j > 0) {
            ax.Ha.c.h().b("offset > 0").j().h();
        }
        this.b = true;
        return this.a;
    }

    @Override // ax.c3.G
    public long d() {
        return this.c;
    }

    @Override // ax.c3.AbstractC1818f
    public void e() {
        if (this.b) {
            return;
        }
        try {
            this.a.close();
        } catch (IOException unused) {
        }
    }
}
