package ax.Z;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import ax.Z.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
class e {
    private static final Comparator<byte[]> a = new Comparator() { // from class: ax.Z.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return e.a((byte[]) obj, (byte[]) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements a {
        private final ContentProviderClient a;

        b(Context context, Uri uri) {
            this.a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // ax.Z.e.a
        public Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e) {
                Log.w("FontsProvider", "Unable to query the content provider", e);
                return null;
            }
        }

        @Override // ax.Z.e.a
        public void close() {
            ContentProviderClient contentProviderClient = this.a;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c implements a {
        private final ContentProviderClient a;

        c(Context context, Uri uri) {
            this.a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // ax.Z.e.a
        public Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e) {
                Log.w("FontsProvider", "Unable to query the content provider", e);
                return null;
            }
        }

        @Override // ax.Z.e.a
        public void close() {
            ContentProviderClient contentProviderClient = this.a;
            if (contentProviderClient != null) {
                f.a(contentProviderClient);
            }
        }
    }

    public static /* synthetic */ int a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            byte b3 = bArr2[i];
            if (b2 != b3) {
                return b2 - b3;
            }
        }
        return 0;
    }

    private static List<byte[]> b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static List<List<byte[]>> d(i iVar, Resources resources) {
        return iVar.b() != null ? iVar.b() : ax.S.e.c(resources, iVar.c());
    }

    static k.a e(Context context, i iVar, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo f = f(context.getPackageManager(), iVar, context.getResources());
        return f == null ? k.a.a(1, null) : k.a.a(0, g(context, iVar, f.authority, cancellationSignal));
    }

    static ProviderInfo f(PackageManager packageManager, i iVar, Resources resources) throws PackageManager.NameNotFoundException {
        String e = iVar.e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + e);
        }
        if (!resolveContentProvider.packageName.equals(iVar.f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + e + ", but package was not " + iVar.f());
        }
        List<byte[]> b2 = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
        Collections.sort(b2, a);
        List<List<byte[]>> d = d(iVar, resources);
        for (int i = 0; i < d.size(); i++) {
            ArrayList arrayList = new ArrayList(d.get(i));
            Collections.sort(arrayList, a);
            if (c(b2, arrayList)) {
                return resolveContentProvider;
            }
        }
        return null;
    }

    static k.b[] g(Context context, i iVar, String str, CancellationSignal cancellationSignal) {
        a aVar;
        a aVar2;
        Uri withAppendedId;
        boolean z;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        a a2 = d.a(context, build);
        Cursor cursor = null;
        try {
            cursor = a2.a(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{iVar.g()}, null, cancellationSignal);
            if (cursor == null || cursor.getCount() <= 0) {
                aVar2 = a2;
            } else {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i2 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        aVar = a2;
                        try {
                            withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            aVar.close();
                            throw th;
                        }
                    } else {
                        aVar = a2;
                        withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    int i3 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                    if (columnIndex6 != -1) {
                        z = true;
                        if (cursor.getInt(columnIndex6) == 1) {
                            arrayList2.add(k.b.a(withAppendedId, i2, i3, z, i));
                            a2 = aVar;
                        }
                    }
                    z = false;
                    arrayList2.add(k.b.a(withAppendedId, i2, i3, z, i));
                    a2 = aVar;
                }
                aVar2 = a2;
                arrayList = arrayList2;
            }
            if (cursor != null) {
                cursor.close();
            }
            aVar2.close();
            return (k.b[]) arrayList.toArray(new k.b[0]);
        } catch (Throwable th2) {
            th = th2;
            aVar = a2;
        }
    }
}
