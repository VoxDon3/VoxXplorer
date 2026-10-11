package ax.Y5;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public class k extends Handler {
    private final Looper a;

    public k(Looper looper) {
        super(looper);
        this.a = Looper.getMainLooper();
    }

    public k(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.a = Looper.getMainLooper();
    }
}
