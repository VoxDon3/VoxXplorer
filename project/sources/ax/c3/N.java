package ax.c3;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.voxdon.xplorer.file.AbstractC3595n;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class N {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC1837z.values().length];
            a = iArr;
            try {
                iArr[EnumC1837z.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC1837z.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[EnumC1837z.AUDIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String a(Context context, Uri uri) {
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_id", "_data"}, null, null, null);
            if (query != null) {
                String string = query.moveToFirst() ? query.getString(1) : null;
                query.close();
                return string;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static Uri b(Context context, String str) {
        return c(context, str, false);
    }

    public static Uri c(Context context, String str, boolean z) {
        Uri contentUri;
        long j;
        EnumC1837z g = C1808A.g(d0.k(str));
        if (g == null) {
            if (!z) {
                return null;
            }
            g = EnumC1837z.OTHERS;
        }
        if (ax.X2.Q.Y1()) {
            ax.X2.Q.k(37, 36);
        }
        int i = a.a[g.ordinal()];
        if (i == 1) {
            contentUri = MediaStore.Video.Media.getContentUri("external");
        } else if (i == 2) {
            contentUri = MediaStore.Images.Media.getContentUri("external");
        } else if (i == 3) {
            contentUri = MediaStore.Audio.Media.getContentUri("external");
        } else {
            if (!z) {
                return null;
            }
            contentUri = MediaStore.Files.getContentUri("external");
        }
        Uri uri = contentUri;
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_id", "_data"}, "_data = ?", new String[]{str}, null);
            if (query != null) {
                j = query.moveToFirst() ? query.getLong(0) : -1L;
                query.close();
            } else {
                j = -1;
            }
            if (j == -1) {
                return null;
            }
            return ContentUris.withAppendedId(uri, j);
        } catch (Exception unused) {
            return null;
        }
    }

    public static List<String> d(Context context, AbstractC3595n abstractC3595n, String str, boolean z) {
        Throwable th;
        String str2;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            Cursor cursor = null;
            String str3 = null;
            Cursor cursor2 = null;
            try {
                String E = abstractC3595n.E();
                Uri c = n0.c("external");
                if (str.contains("*")) {
                    str2 = str.replace("*", "%");
                    if (!str2.startsWith("%")) {
                        str2 = "%" + str2;
                    }
                    if (!str2.endsWith("%")) {
                        str2 = str2 + "%";
                    }
                } else {
                    str2 = "%" + str + "%";
                }
                Cursor query = context.getContentResolver().query(c, new String[]{"_data", "date_added"}, "_display_name LIKE ?1 AND _data LIKE ?2", new String[]{str2, E + "/%"}, "_data asc");
                if (query != null) {
                    long j = 0;
                    while (query.moveToNext()) {
                        try {
                            try {
                                String string = query.getString(0);
                                if (string == null || !string.equals(E)) {
                                    if (!z && string != null) {
                                        try {
                                            String o = d0.o(E, string, true);
                                            if (o.length() > 1 && o.indexOf(47, 1) >= 0) {
                                                break;
                                            }
                                        } catch (Exception unused) {
                                        }
                                    }
                                    long j2 = query.getLong(1);
                                    if (str3 != null && str3.equalsIgnoreCase(string)) {
                                        if (j2 > j) {
                                            arrayList.remove(str3);
                                        }
                                    }
                                    arrayList.add(string);
                                    str3 = string;
                                    j = j2;
                                }
                            } catch (Throwable th2) {
                                cursor = query;
                                th = th2;
                                if (cursor == null) {
                                    throw th;
                                }
                                cursor.close();
                                throw th;
                            }
                        } catch (Exception unused2) {
                            cursor2 = query;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            return arrayList;
                        }
                    }
                }
                if (query != null) {
                    query.close();
                }
            } catch (Exception unused3) {
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return arrayList;
    }
}
