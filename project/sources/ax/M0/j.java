package ax.M0;

import android.media.session.MediaSessionManager;

/* loaded from: classes.dex */
final class j extends k {
    final MediaSessionManager.RemoteUserInfo d;

    j(String str, int i, int i2) {
        super(str, i, i2);
        this.d = f.a(str, i, i2);
    }

    static String a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String packageName;
        packageName = remoteUserInfo.getPackageName();
        return packageName;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    j(android.media.session.MediaSessionManager.RemoteUserInfo r4) {
        /*
            r3 = this;
            java.lang.String r0 = ax.M0.g.a(r4)
            int r1 = ax.M0.h.a(r4)
            int r2 = ax.M0.i.a(r4)
            r3.<init>(r0, r1, r2)
            r3.d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.M0.j.<init>(android.media.session.MediaSessionManager$RemoteUserInfo):void");
    }
}
