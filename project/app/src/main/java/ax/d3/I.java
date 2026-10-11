/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.os.Bundle;
import ax.A0.l;
import ax.d3.J;
import java.util.function.Consumer;

public final class I
implements l {
    public final Consumer a;

    public /* synthetic */ I(Consumer consumer) {
        this.a = consumer;
    }

    @Override
    public final void a(String string, Bundle bundle) {
        J.a(this.a, string, bundle);
    }
}

