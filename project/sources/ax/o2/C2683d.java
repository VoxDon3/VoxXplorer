package ax.o2;

import android.content.Context;
import ax.Gb.l;
import java.io.File;

/* renamed from: ax.o2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2683d {
    public static final C2683d a = new C2683d();

    private C2683d() {
    }

    public static final File a(Context context) {
        l.f(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        l.e(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
