/*
 * Decompiled with CFR 0.152.
 */
package ax.g3;

import android.os.SystemClock;
import android.view.View;
import java.util.Map;
import java.util.WeakHashMap;

public abstract class c
implements View.OnClickListener {
    private final long a;
    private Map<View, Long> b;

    public c() {
        this(200L);
    }

    public c(long l8) {
        this.a = l8;
        this.b = new WeakHashMap<View, Long>();
    }

    public abstract void a(View var1);

    public final void onClick(View view) {
        Long l8 = this.b.get(view);
        long l9 = SystemClock.uptimeMillis();
        if (l8 != null && l9 - l8 <= this.a) {
            return;
        }
        this.a(view);
        this.b.put(view, l9);
    }
}

