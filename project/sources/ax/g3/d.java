package ax.g3;

import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public abstract class d implements AdapterView.OnItemClickListener {
    private final long a;
    private Long b;

    public d(long j) {
        this.a = j;
    }

    public abstract void a(AdapterView<?> adapterView, View view, int i, long j);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Long l = this.b;
        if (l == null || uptimeMillis - l.longValue() > this.a) {
            a(adapterView, view, i, j);
            this.b = Long.valueOf(uptimeMillis);
        }
    }

    public d() {
        this(200L);
    }
}
