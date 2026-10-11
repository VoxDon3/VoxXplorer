/*
 * Decompiled with CFR 0.152.
 */
package ax.O9;

import ax.M9.b;
import ax.N9.E0;
import ax.N9.b0;
import ax.N9.c1;
import ax.N9.e0;
import ax.N9.v;
import ax.O9.F;

public class o
extends b
implements F {
    private String f;

    @Override
    public E0 d() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.l());
        stringBuilder.append("/me");
        return new c1(stringBuilder.toString(), (e0)((Object)this), null);
    }

    @Override
    public b0 e(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.l());
        stringBuilder.append("/drives/");
        stringBuilder.append(string);
        return new v(stringBuilder.toString(), (e0)((Object)this), null);
    }

    public String l() {
        if (this.f == null) {
            this.f = "https://graph.microsoft.com/v1.0";
        }
        return this.f;
    }
}

