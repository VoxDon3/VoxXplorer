package ax.c3;

import android.os.ParcelFileDescriptor;
import ax.b3.C1495j;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.AbstractC3595n;

/* renamed from: ax.c3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1823k extends AbstractC3595n {
    protected String k0;
    protected String l0;

    public AbstractC1823k(AbstractC3594m abstractC3594m) {
        super(abstractC3594m);
    }

    public abstract ParcelFileDescriptor e0(boolean z) throws C1495j;

    public String f0() {
        if (this.k0 == null) {
            this.k0 = C1827o.a(this);
        }
        return this.k0;
    }

    public String g0() {
        if (this.l0 == null) {
            this.l0 = C1827o.b(this);
        }
        return this.l0;
    }

    public String h0() {
        if (this.k0 == null) {
            this.k0 = C1827o.c(this);
        }
        return this.k0;
    }

    public abstract boolean i0();

    public abstract boolean j0();

    public abstract boolean k0();
}
