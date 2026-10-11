/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.os.Bundle;
import ax.d3.j;
import java.util.function.Consumer;

public final class i
implements Consumer {
    public final j a;

    public /* synthetic */ i(j j8) {
        this.a = j8;
    }

    public final void accept(Object object) {
        j.Q4(this.a, (Bundle)object);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return j.Consumer._CC.$default$andThen((Consumer)this, (Consumer)consumer);
    }
}

