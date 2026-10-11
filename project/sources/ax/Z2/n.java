package ax.Z2;

import android.content.Context;
import android.content.UriPermission;
import android.net.Uri;
import com.voxdon.xplorer.file.C3588g;
import com.voxdon.xplorer.file.C3605y;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class n {
    private static n b;
    private final List<Uri> a = new CopyOnWriteArrayList();

    n(Context context) {
        e(context);
    }

    public static n b(Context context) {
        if (b == null) {
            b = new n(context);
        }
        return b;
    }

    public void a(Uri uri) {
        this.a.add(uri);
    }

    public boolean c(Context context, C3605y c3605y) {
        try {
            Uri n = C3588g.n(c3605y.B0(), c3605y.M0());
            if (n != null) {
                if (C3588g.a(context, n)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public boolean d(Uri uri) {
        return this.a.contains(uri);
    }

    public void e(Context context) {
        List<UriPermission> persistedUriPermissions;
        try {
            persistedUriPermissions = context.getContentResolver().getPersistedUriPermissions();
        } catch (Exception unused) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused2) {
            }
            persistedUriPermissions = context.getContentResolver().getPersistedUriPermissions();
        }
        ArrayList arrayList = new ArrayList();
        for (UriPermission uriPermission : persistedUriPermissions) {
            if (uriPermission.isReadPermission() || uriPermission.isWritePermission()) {
                arrayList.add(uriPermission.getUri());
            }
        }
        if (this.a.size() > 0) {
            this.a.clear();
        }
        this.a.addAll(arrayList);
    }
}
