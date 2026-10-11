/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import android.app.ApplicationExitInfo;
import java.io.InputStream;

public final class I {
    public static /* bridge */ /* synthetic */ InputStream a(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getTraceInputStream();
    }
}

