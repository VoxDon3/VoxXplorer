package ax.S5;

import android.content.Context;

/* loaded from: classes3.dex */
public class e {
    private static final e b = new e();
    private d a = null;

    public static d a(Context context) {
        return b.b(context);
    }

    public final synchronized d b(Context context) {
        try {
            if (this.a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.a = new d(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a;
    }
}
