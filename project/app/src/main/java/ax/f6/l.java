/*
 * Decompiled with CFR 0.152.
 */
package ax.f6;

import ax.b6.I7;
import com.google.android.gms.measurement.internal.q2;
import com.google.android.gms.measurement.internal.s2;
import java.util.concurrent.Callable;

public final class l
implements Callable {
    private q2 a;
    private String b;

    public /* synthetic */ l(q2 q22, String string) {
        this.a = q22;
        this.b = string;
    }

    public final Object call() {
        return new I7("internal.appMetadata", new s2(this.a, this.b));
    }
}

