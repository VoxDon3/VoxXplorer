package ax.X0;

import android.content.Context;
import ax.I9.y;

/* loaded from: classes.dex */
final class h extends ax.J9.g {
    private static final String[] d = {"wavetable", "GM2", "ringtone"};
    private static final Object e = new Object();
    private static h f;
    private final short[] c;

    private h(short[] sArr) {
        super("SonivoxVoiceDescription", i.c());
        this.c = sArr;
    }

    public static h d(Context context) throws c {
        h hVar;
        synchronized (e) {
            try {
                if (f == null) {
                    f = new h(i.h(context));
                }
                hVar = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // ax.J9.g
    public y a() {
        return new g(this.c);
    }
}
