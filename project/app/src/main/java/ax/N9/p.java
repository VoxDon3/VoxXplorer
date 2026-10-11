/*
 * Decompiled with CFR 0.152.
 */
package ax.N9;

import ax.M9.f;
import ax.N9.U;
import ax.O9.i;
import ax.S9.c;
import java.util.List;

public class p
extends i
implements U {
    public p(String string, f f8, List<c> list) {
        super(string, f8, list);
    }

    @Override
    public U h(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.d());
        stringBuilder.append(":/");
        stringBuilder.append(string);
        stringBuilder.append(":");
        return new p(stringBuilder.toString(), this.i(), null);
    }
}

