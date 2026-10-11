package ax.Rb;

import android.os.Looper;
import ax.Qb.D0;
import ax.Vb.t;
import java.util.List;

/* loaded from: classes3.dex */
public final class a implements t {
    @Override // ax.Vb.t
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // ax.Vb.t
    public D0 b(List<? extends t> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new c(e.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // ax.Vb.t
    public int c() {
        return 1073741823;
    }
}
