/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import ax.a6.j0;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class z
implements Callable {
    public final j0 a;
    public final String b;
    public final JSONObject c;

    public /* synthetic */ z(j0 j02, String string, JSONObject jSONObject) {
        this.a = j02;
        this.b = string;
        this.c = jSONObject;
    }

    public final Object call() {
        return this.a.b(this.b, this.c);
    }
}

