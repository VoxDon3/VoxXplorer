/*
 * Decompiled with CFR 0.152.
 */
package ax.g3;

import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;

public abstract class d
implements AdapterView.OnItemClickListener {
    private final long a;
    private Long b;

    public d() {
        this(200L);
    }

    public d(long l8) {
        this.a = l8;
    }

    public abstract void a(AdapterView<?> var1, View var2, int var3, long var4);

    public void onItemClick(AdapterView<?> adapterView, View view, int n8, long l8) {
        long l9 = SystemClock.uptimeMillis();
        Long l10 = this.b;
        if (l10 != null && l9 - l10 <= this.a) {
            return;
        }
        this.a(adapterView, view, n8, l8);
        this.b = l9;
    }
}

