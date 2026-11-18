/*
 * Decompiled with CFR 0.152.
 */
package ax.Z2;

import android.content.Context;
import android.content.UriPermission;
import android.net.Uri;
import com.voxdon.xplorer.file.g;
import com.voxdon.xplorer.file.y;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class n {
    private static n b;
    private final List<Uri> a = new CopyOnWriteArrayList<Uri>();

    n(Context context) {
        this.e(context);
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean c(Context context, y y8) {
        block4: {
            try {
                String string = y8.M0();
                y8 = g.n(y8.B0(), string);
                if (y8 == null) break block4;
            }
            catch (Exception exception) {
                return false;
            }
            boolean bl = g.a(context, (Uri)y8);
            if (!bl) break block4;
            return true;
        }
        return false;
    }

    public boolean d(Uri uri) {
        return this.a.contains(uri);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void e(Context object) {
        ArrayList<Uri> arrayList;
        try {
            arrayList = object.getContentResolver().getPersistedUriPermissions();
            object = arrayList;
        }
        catch (Exception exception) {
            try {
                Thread.sleep(100L);
            }
            catch (InterruptedException interruptedException) {}
            object = object.getContentResolver().getPersistedUriPermissions();
        }
        arrayList = new ArrayList<Uri>();
        object = object.iterator();
        while (object.hasNext()) {
            UriPermission uriPermission = (UriPermission)object.next();
            if (!uriPermission.isReadPermission() && !uriPermission.isWritePermission()) continue;
            arrayList.add(uriPermission.getUri());
        }
        if (this.a.size() > 0) {
            this.a.clear();
        }
        this.a.addAll(arrayList);
    }
}

