package ax.d7;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

/* renamed from: ax.d7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1946d extends C1944b {
    public C1946d(UserRecoverableAuthException userRecoverableAuthException) {
        super(userRecoverableAuthException);
    }

    @Override // ax.d7.C1944b, java.lang.Throwable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public UserRecoverableAuthException getCause() {
        return (UserRecoverableAuthException) super.getCause();
    }

    public final Intent c() {
        return getCause().a();
    }
}
