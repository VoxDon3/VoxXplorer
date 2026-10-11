/*
 * Decompiled with CFR 0.152.
 */
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
import ax.Z.d;
import ax.Z.f;
import ax.Z.i;
import ax.Z.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class e {
    private static final Comparator<byte[]> a = new ax.Z.c();

    public static /* synthetic */ int a(byte[] byArray, byte[] byArray2) {
        if (byArray.length != byArray2.length) {
            return byArray.length - byArray2.length;
        }
        for (int i8 = 0; i8 < byArray.length; ++i8) {
            byte by = byArray[i8];
            byte by2 = byArray2[i8];
            if (by == by2) continue;
            return by - by2;
        }
        return 0;
    }

    private static List<byte[]> b(Signature[] signatureArray) {
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
        int n8 = signatureArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            arrayList.add(signatureArray[i8].toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i8 = 0; i8 < list.size(); ++i8) {
            if (Arrays.equals(list.get(i8), list2.get(i8))) continue;
            return false;
        }
        return true;
    }

    private static List<List<byte[]>> d(i i8, Resources resources) {
        if (i8.b() != null) {
            return i8.b();
        }
        return ax.S.e.c(resources, i8.c());
    }

    static k.a e(Context context, i i8, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfo = e.f(context.getPackageManager(), i8, context.getResources());
        if (providerInfo == null) {
            return k.a.a(1, null);
        }
        return k.a.a(0, e.g(context, i8, providerInfo.authority, cancellationSignal));
    }

    static ProviderInfo f(PackageManager object, i object2, Resources object3) throws PackageManager.NameNotFoundException {
        String string = ((i)object2).e();
        ProviderInfo providerInfo = object.resolveContentProvider(string, 0);
        if (providerInfo != null) {
            if (providerInfo.packageName.equals(((i)object2).f())) {
                object = e.b(object.getPackageInfo((String)providerInfo.packageName, (int)64).signatures);
                Collections.sort(object, a);
                object2 = e.d((i)object2, object3);
                for (int i8 = 0; i8 < object2.size(); ++i8) {
                    object3 = new ArrayList((Collection)object2.get(i8));
                    Collections.sort(object3, a);
                    if (!e.c((List<byte[]>)object, (List<byte[]>)object3)) continue;
                    return providerInfo;
                }
                return null;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Found content provider ");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(", but package was not ");
            ((StringBuilder)object).append(((i)object2).f());
            throw new PackageManager.NameNotFoundException(((StringBuilder)object).toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("No package found for authority: ");
        ((StringBuilder)object).append(string);
        throw new PackageManager.NameNotFoundException(((StringBuilder)object).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static k.b[] g(Context object, i object2, String object3, CancellationSignal object4) {
        block18: {
            block20: {
                int n8;
                int n9;
                int n10;
                int n11;
                int n12;
                int n13;
                Object object5;
                Uri uri;
                Uri uri2;
                block17: {
                    ArrayList arrayList;
                    block16: {
                        arrayList = new ArrayList();
                        uri2 = new Uri.Builder().scheme("content").authority((String)object3).build();
                        uri = new Uri.Builder().scheme("content").authority((String)object3).appendPath("file").build();
                        object = d.a((Context)object, uri2);
                        Object var17_8 = null;
                        object3 = var17_8;
                        object5 = object;
                        try {
                            object2 = ((i)object2).g();
                            object3 = var17_8;
                            object5 = object;
                            object2 = object.a(uri2, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{object2}, null, (CancellationSignal)object4);
                            if (object2 == null) break block16;
                            object3 = object2;
                            object5 = object;
                            if (object2.getCount() <= 0) break block16;
                            object3 = object2;
                            object5 = object;
                            n13 = object2.getColumnIndex("result_code");
                            object3 = object2;
                            object5 = object;
                            object3 = object2;
                            object5 = object;
                            object4 = new ArrayList();
                            object3 = object2;
                            object5 = object;
                            n12 = object2.getColumnIndex("_id");
                            object3 = object2;
                            object5 = object;
                            n11 = object2.getColumnIndex("file_id");
                            object3 = object2;
                            object5 = object;
                            n10 = object2.getColumnIndex("font_ttc_index");
                            object3 = object2;
                            object5 = object;
                            n9 = object2.getColumnIndex("font_weight");
                            object3 = object2;
                            object5 = object;
                            n8 = object2.getColumnIndex("font_italic");
                            break block17;
                        }
                        catch (Throwable throwable) {
                            object2 = object3;
                            object3 = object5;
                            break block18;
                        }
                    }
                    object3 = arrayList;
                    break block20;
                }
                while (true) {
                    boolean bl;
                    int n14;
                    int n15;
                    int n16;
                    block22: {
                        block21: {
                            block19: {
                                object3 = object2;
                                object5 = object;
                                if (!object2.moveToNext()) break;
                                if (n13 != -1) {
                                    object3 = object2;
                                    object5 = object;
                                    n16 = object2.getInt(n13);
                                } else {
                                    n16 = 0;
                                }
                                if (n10 != -1) {
                                    object3 = object2;
                                    object5 = object;
                                    n15 = object2.getInt(n10);
                                } else {
                                    n15 = 0;
                                }
                                if (n11 == -1) {
                                    try {
                                        object3 = ContentUris.withAppendedId((Uri)uri2, (long)object2.getLong(n12));
                                        break block19;
                                    }
                                    catch (Throwable throwable) {
                                        object3 = object;
                                        object = throwable;
                                        break block18;
                                    }
                                }
                                object3 = ContentUris.withAppendedId((Uri)uri, (long)object2.getLong(n11));
                            }
                            n14 = n9 != -1 ? object2.getInt(n9) : 400;
                            if (n8 == -1) break block21;
                            int n17 = object2.getInt(n8);
                            bl = true;
                            if (n17 == 1) break block22;
                        }
                        bl = false;
                    }
                    ((ArrayList)object4).add(k.b.a((Uri)object3, n15, n14, bl, n16));
                }
                object3 = object4;
            }
            if (object2 != null) {
                object2.close();
            }
            object.close();
            return ((ArrayList)object3).toArray(new k.b[0]);
        }
        if (object2 != null) {
            object2.close();
        }
        object3.close();
        throw object;
    }

    private static interface a {
        public Cursor a(Uri var1, String[] var2, String var3, String[] var4, String var5, CancellationSignal var6);

        public void close();
    }

    private static class b
    implements a {
        private final ContentProviderClient a;

        b(Context context, Uri uri) {
            this.a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override
        public Cursor a(Uri uri, String[] stringArray, String string, String[] stringArray2, String string2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                uri = contentProviderClient.query(uri, stringArray, string, stringArray2, string2, cancellationSignal);
                return uri;
            }
            catch (RemoteException remoteException) {
                Log.w((String)"FontsProvider", (String)"Unable to query the content provider", (Throwable)remoteException);
                return null;
            }
        }

        @Override
        public void close() {
            ContentProviderClient contentProviderClient = this.a;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }
    }

    private static class c
    implements a {
        private final ContentProviderClient a;

        c(Context context, Uri uri) {
            this.a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override
        public Cursor a(Uri uri, String[] stringArray, String string, String[] stringArray2, String string2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                uri = contentProviderClient.query(uri, stringArray, string, stringArray2, string2, cancellationSignal);
                return uri;
            }
            catch (RemoteException remoteException) {
                Log.w((String)"FontsProvider", (String)"Unable to query the content provider", (Throwable)remoteException);
                return null;
            }
        }

        @Override
        public void close() {
            ContentProviderClient contentProviderClient = this.a;
            if (contentProviderClient != null) {
                f.a(contentProviderClient);
            }
        }
    }
}

