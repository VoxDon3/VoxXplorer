/*
 * Decompiled with CFR 0.152.
 */
package ax.O9;

import ax.M9.d;
import ax.N9.l;
import ax.O9.v;
import ax.P9.b;
import ax.P9.k;
import ax.S9.c;
import com.microsoft.graph.extensions.UploadSession;
import java.util.List;

public class f
extends b
implements v {
    protected final l i = new l();

    public f(String string, ax.M9.f f8, List<c> list) {
        super(string, f8, list, UploadSession.class);
    }

    @Override
    public UploadSession e() throws d {
        return (UploadSession)this.r(k.c0, this.i);
    }
}

