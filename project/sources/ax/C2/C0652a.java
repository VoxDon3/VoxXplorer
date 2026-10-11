package ax.C2;

import android.content.Context;
import java.io.File;

/* renamed from: ax.C2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0652a {
    public static final C0652a a = new C0652a();

    private C0652a() {
    }

    public final File a(Context context) {
        ax.Gb.l.f(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        ax.Gb.l.e(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
