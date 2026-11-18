package com.voxdon.xplorer.sharing;

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
import ax.c3.AbstractC1823k;
import ax.c3.C1832u;
import ax.c3.d0;
import ax.u3.C3184b;
import com.voxdon.xplorer.file.AbstractC3595n;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class QuickShareProvider extends ContentProvider {
    public static final String[] c = {"file_uri", "file_dir", "file_mime_type"};
    private static QuickShareProvider d;
    private static Boolean e;
    private final List<AbstractC3595n> a = new ArrayList();
    private AbstractC3595n b;

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        if (e == null) {
            if (Q.u1()) {
                try {
                    List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(b(1), 65536);
                    if (!queryIntentActivities.isEmpty()) {
                        ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
                        if (activityInfo != null) {
                            if (!"com.google.android.gms.nearby.sharing.send.SendActivity".equals(activityInfo.name)) {
                                if ("com.google.android.gms.nearby.sharing.main.MainActivity".equals(activityInfo.name)) {
                                }
                            }
                            e = Boolean.TRUE;
                        }
                    }
                } catch (Exception unused) {
                }
                if (e == null) {
                    e = Boolean.FALSE;
                }
            } else {
                e = Boolean.FALSE;
            }
        }
        return e.booleanValue();
    }

    private static Intent b(int i) {
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.nearby.SEND_FOLDER");
        intent.putExtra("com.google.android.gms.nearby.SEND_FOLDER_CONTENT_URI", "content://com.voxdon.xplorer.foldershare.provider");
        intent.putExtra("com.google.android.gms.nearby.FILE_COUNT", i);
        intent.setPackage("com.google.android.gms");
        return intent;
    }

    public static QuickShareProvider c() {
        return d;
    }

    public void d(Context context, AbstractC3595n abstractC3595n, List<AbstractC3595n> list) {
        synchronized (this.a) {
            this.b = abstractC3595n;
            this.a.clear();
            this.a.addAll(list);
        }
        Intent b = b(list.size());
        context.grantUriPermission("com.google.android.gms", Uri.parse("content://com.voxdon.xplorer.foldershare.provider"), 1);
        context.startActivity(b);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        throw new UnsupportedOperationException("Operation not supported.");
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        b.k(getContext());
        d = this;
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String callingPackage = getCallingPackage();
        if (callingPackage == null || !callingPackage.equals("com.google.android.gms")) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(c);
        synchronized (this.a) {
            if (this.b != null) {
                for (AbstractC3595n abstractC3595n : this.a) {
                    if (abstractC3595n instanceof AbstractC1823k) {
                        AbstractC1823k abstractC1823k = (AbstractC1823k) abstractC3595n;
                        Uri v = C1832u.v(abstractC1823k);
                        try {
                            getContext().grantUriPermission("com.google.android.gms", v, 1);
                        } catch (Exception unused) {
                        }
                        String T = abstractC1823k.T();
                        String E = this.b.E();
                        if (d0.I(E, T)) {
                            matrixCursor.addRow(new String[]{v.toString(), d0.n(E, T), abstractC3595n.s()});
                        } else if (d0.G(E, T)) {
                            matrixCursor.addRow(new String[]{v.toString(), HttpUrl.FRAGMENT_ENCODE_SET, abstractC3595n.s()});
                        }
                    } else if (abstractC3595n != null) {
                        C3184b.g("Invalid file info class:" + abstractC3595n.getClass().getName());
                    }
                }
            }
        }
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
