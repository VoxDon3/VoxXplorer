package ax.L2;

import android.app.Application;

/* renamed from: ax.L2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0784a {
    public static final C0784a a = new C0784a();

    private C0784a() {
    }

    public final String a() {
        String processName = Application.getProcessName();
        ax.Gb.l.e(processName, "getProcessName()");
        return processName;
    }
}
