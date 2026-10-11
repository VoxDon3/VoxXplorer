/*
 * Decompiled with CFR 0.152.
 */
package ax.M0;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;
import ax.M0.e;
import ax.M0.j;
import ax.M0.k;

public final class d {
    e a;

    public d(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String string = j.a(remoteUserInfo);
        if (string != null) {
            if (!TextUtils.isEmpty((CharSequence)string)) {
                this.a = new j(remoteUserInfo);
                return;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }

    public d(String string, int n8, int n9) {
        if (string != null) {
            if (!TextUtils.isEmpty((CharSequence)string)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.a = new j(string, n8, n9);
                    return;
                }
                this.a = new k(string, n8, n9);
                return;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof d)) {
            return false;
        }
        return this.a.equals(((d)object).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

