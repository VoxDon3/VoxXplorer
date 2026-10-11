package ax.a6;

import android.util.Log;

/* loaded from: classes3.dex */
public final class F0 extends Exception {
    private final int q;

    public F0(int i, String str) {
        super(str);
        this.q = i;
    }

    public final ax.Y6.e a() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new ax.Y6.e(this.q, super.getMessage());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage();
    }
}
