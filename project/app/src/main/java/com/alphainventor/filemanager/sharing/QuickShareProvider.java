/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.sharing;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import ax.Q2.b;
import ax.X2.Q;
import ax.c3.d0;
import ax.c3.k;
import ax.c3.u;
import com.alphainventor.filemanager.file.n;
import java.util.ArrayList;
import java.util.List;

public class QuickShareProvider
extends ContentProvider {
    public static final String[] c = new String[]{"file_uri", "file_dir", "file_mime_type"};
    private static QuickShareProvider d;
    private static Boolean e;
    private final List<n> a = new ArrayList<n>();
    private n b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean a(Context object) {
        block4: {
            if (object == null) {
                return false;
            }
            if (e != null) return e;
            if (!Q.u1()) {
                e = Boolean.FALSE;
                return e;
            }
            try {
                Intent intent = QuickShareProvider.b(1);
                object = object.getPackageManager().queryIntentActivities(intent, 65536);
                if (object.isEmpty() || (object = ((ResolveInfo)object.get((int)0)).activityInfo) == null || !"com.google.android.gms.nearby.sharing.send.SendActivity".equals(((ActivityInfo)object).name) && !"com.google.android.gms.nearby.sharing.main.MainActivity".equals(((ActivityInfo)object).name)) break block4;
            }
            catch (Exception exception) {
                break block4;
            }
            e = Boolean.TRUE;
        }
        if (e != null) return e;
        e = Boolean.FALSE;
        return e;
    }

    private static Intent b(int n8) {
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.nearby.SEND_FOLDER");
        intent.putExtra("com.google.android.gms.nearby.SEND_FOLDER_CONTENT_URI", "content://com.voxdon.xplorer.foldershare.provider");
        intent.putExtra("com.google.android.gms.nearby.FILE_COUNT", n8);
        intent.setPackage("com.google.android.gms");
        return intent;
    }

    public static QuickShareProvider c() {
        return d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void d(Context context, n n8, List<n> list) {
        List<n> list2 = this.a;
        synchronized (list2) {
            this.b = n8;
            this.a.clear();
            this.a.addAll(list);
        }
        n8 = QuickShareProvider.b(list.size());
        context.grantUriPermission("com.google.android.gms", Uri.parse((String)"content://com.voxdon.xplorer.foldershare.provider"), 1);
        context.startActivity((Intent)n8);
    }

    public int delete(Uri uri, String string, String[] stringArray) {
        return 0;
    }

    public String getType(Uri uri) {
        throw new UnsupportedOperationException("Operation not supported.");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        ax.Q2.b.k(this.getContext());
        d = this;
        return true;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public Cursor query(Uri object, String[] object2, String string, String[] object3, String charSequence) {
        block8: {
            object = this.getCallingPackage();
            if (object == null) return null;
            if (!((String)object).equals("com.google.android.gms")) return null;
            string = new MatrixCursor(c);
            object = this.a;
            // MONITORENTER : object
            if (this.b == null) break block8;
            object3 = this.a.iterator();
            while (object3.hasNext()) {
                Object object4;
                object2 = (n)object3.next();
                if (object2 instanceof k) {
                    object4 = (k)object2;
                    charSequence = u.v((k)object4);
                    this.getContext().grantUriPermission("com.google.android.gms", (Uri)charSequence, 1);
                }
                if (object2 == null) continue;
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("Invalid file info class:");
                ((StringBuilder)charSequence).append(object2.getClass().getName());
                ax.u3.b.g(((StringBuilder)charSequence).toString());
                continue;
                catch (Exception exception) {}
                object4 = ((n)object4).T();
                String string2 = this.b.E();
                if (d0.I(string2, (String)object4)) {
                    object4 = d0.n(string2, (String)object4);
                    string.addRow((Object[])new String[]{charSequence.toString(), object4, object2.s()});
                    continue;
                }
                if (!d0.G(string2, (String)object4)) continue;
                string.addRow((Object[])new String[]{charSequence.toString(), "", object2.s()});
            }
        }
        // MONITOREXIT : object
        return string;
    }

    public int update(Uri uri, ContentValues contentValues, String string, String[] stringArray) {
        return 0;
    }
}

