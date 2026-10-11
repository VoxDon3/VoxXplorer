/*
 * Decompiled with CFR 0.152.
 */
package ax.O9;

import ax.M9.d;
import ax.M9.f;
import ax.N9.i;
import ax.O9.t;
import ax.P9.b;
import ax.P9.k;
import com.microsoft.graph.extensions.DriveItem;
import java.util.List;

public class c
extends b
implements t {
    protected final i i = new i();

    public c(String string, f f8, List<ax.S9.c> list) {
        super(string, f8, list, DriveItem.class);
    }

    @Override
    public DriveItem e() throws d {
        return (DriveItem)this.r(k.c0, this.i);
    }
}

