/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import ax.Ha.c;
import ax.b3.j;
import ax.c3.f;
import ax.u3.b;
import java.io.IOException;
import java.io.InputStream;

public class U
extends f {
    private InputStream a;
    private boolean b;
    private long c;

    public U(InputStream inputStream, long l8) {
        this.a = inputStream;
        this.c = l8;
        this.b = false;
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public InputStream c(long l8) throws j {
        if (this.b) {
            ax.u3.b.g("createInputStream called twice");
        }
        if (l8 > 0L) {
            ax.Ha.c.h().b("offset > 0").j().h();
        }
        this.b = true;
        return this.a;
    }

    @Override
    public long d() {
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void e() {
        if (this.b) return;
        try {
            this.a.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }
}

