package ax.Z5;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public class e extends Handler {
    private final Looper a;

    public e(Looper looper) {
        super(looper);
        this.a = Looper.getMainLooper();
    }

    public e(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.a = Looper.getMainLooper();
    }
}
