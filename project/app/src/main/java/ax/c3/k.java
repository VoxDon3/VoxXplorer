/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.os.ParcelFileDescriptor;
import ax.b3.j;
import ax.c3.o;
import com.alphainventor.filemanager.file.m;
import com.alphainventor.filemanager.file.n;

public abstract class k
extends n {
    protected String k0;
    protected String l0;

    public k(m m8) {
        super(m8);
    }

    public abstract ParcelFileDescriptor e0(boolean var1) throws j;

    public String f0() {
        if (this.k0 == null) {
            this.k0 = o.a(this);
        }
        return this.k0;
    }

    public String g0() {
        if (this.l0 == null) {
            this.l0 = o.b(this);
        }
        return this.l0;
    }

    public String h0() {
        if (this.k0 == null) {
            this.k0 = o.c(this);
        }
        return this.k0;
    }

    public abstract boolean i0();

    public abstract boolean j0();

    public abstract boolean k0();
}

