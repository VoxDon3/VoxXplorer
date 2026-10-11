package ax.D5;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

/* loaded from: classes3.dex */
public class c extends UserRecoverableAuthException {
    private final int e0;

    c(int i, String str, Intent intent) {
        super(str, intent);
        this.e0 = i;
    }
}
