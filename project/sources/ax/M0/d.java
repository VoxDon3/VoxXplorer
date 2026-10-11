package ax.M0;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class d {
    e a;

    public d(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.a = new j(str, i, i2);
        } else {
            this.a = new k(str, i, i2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return this.a.equals(((d) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public d(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String a = j.a(remoteUserInfo);
        if (a != null) {
            if (!TextUtils.isEmpty(a)) {
                this.a = new j(remoteUserInfo);
                return;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }
}
