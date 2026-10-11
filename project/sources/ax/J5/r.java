package ax.J5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

@SuppressLint({"HandlerLeak"})
/* loaded from: classes3.dex */
final class r extends ax.Y5.k {
    private final Context b;
    final /* synthetic */ C0747h c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0747h c0747h, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.c = c0747h;
        this.b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        C0747h c0747h = this.c;
        int g = c0747h.g(this.b);
        if (c0747h.j(g)) {
            this.c.q(this.b, g);
        }
    }
}
