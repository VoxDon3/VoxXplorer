package ax.g3;

import android.os.SystemClock;
import android.view.View;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class c implements View.OnClickListener {
    private final long a;
    private Map<View, Long> b;

    public c(long j) {
        this.a = j;
        this.b = new WeakHashMap();
    }

    public abstract void a(View view);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Long l = this.b.get(view);
        long uptimeMillis = SystemClock.uptimeMillis();
        if (l == null || uptimeMillis - l.longValue() > this.a) {
            a(view);
            this.b.put(view, Long.valueOf(uptimeMillis));
        }
    }

    public c() {
        this(200L);
    }
}
