/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.TransactionTooLargeException;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ax.Q2.d;
import ax.Q2.f;
import ax.c3.B;
import ax.c3.K;
import ax.c3.d0;
import ax.c3.u;
import ax.u3.b;
import com.alphainventor.filemanager.file.i;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.y;
import com.alphainventor.filemanager.texteditor.TextEditorActivity;
import com.alphainventor.filemanager.viewer.ImageViewerActivity;
import com.alphainventor.filemanager.viewer.VideoPlayerActivity;
import com.alphainventor.filemanager.viewer.c;
import com.alphainventor.filemanager.viewer.e;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class w {
    public static boolean a(Context context, n object, String string, boolean bl) {
        String string2 = string;
        if (string == null) {
            string2 = object.s();
        }
        object = u.s(context, (n)object, bl);
        int n8 = ((ArrayList)object).size();
        for (int i8 = 0; i8 < n8; ++i8) {
            string = ((ArrayList)object).get(i8);
            string = u.n((Uri)string, string2, true, false);
            try {
                bl = w.l(context, (Intent)string);
                if (!bl) continue;
                return true;
            }
            catch (SecurityException securityException) {
                continue;
            }
        }
        return false;
    }

    public static boolean b(Uri uri, n n8) {
        if (uri != null && n8 != null) {
            Object object = d0.h(uri.getPath());
            CharSequence charSequence = n8.B();
            if (object != null && !((String)object).equals(charSequence)) {
                if (!n8.l()) {
                    object = ax.Ha.c.h().f().b("URI AND FILE INFO NOT MATCH").j();
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(n8.R().k());
                    ((StringBuilder)charSequence).append(":");
                    ((StringBuilder)charSequence).append(uri.getPath());
                    ((StringBuilder)charSequence).append(" != ");
                    ((StringBuilder)charSequence).append(n8.E());
                    ((ax.Ha.b)object).g(((StringBuilder)charSequence).toString()).h();
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static Intent c(Context context, K object, String string, List<n> list, int n8, boolean bl) {
        f f8 = ((K)object).d();
        int n9 = ((K)object).b();
        object = new StringBuilder();
        ((StringBuilder)object).append(f8.I());
        ((StringBuilder)object).append(n9);
        ((StringBuilder)object).append(string);
        object = ((StringBuilder)object).toString();
        c.b().c((String)object, list, n8);
        context = new Intent(context, ImageViewerActivity.class);
        context.putExtra("location", (Serializable)((Object)f8));
        context.putExtra("location_key", n9);
        context.putExtra(ImageViewerActivity.H, (String)object);
        return context;
    }

    public static Intent d(Context context, n n8, boolean bl) {
        ArrayList<n> arrayList = new ArrayList<n>();
        arrayList.add(n8);
        return w.c(context, n8.R(), n8.E(), arrayList, 0, bl);
    }

    public static Intent e(Context context, Uri uri) {
        context = w.k(context, uri, false, false);
        context.putExtra("finish_after_play", true);
        return context;
    }

    public static Intent f(Context context, i i8) {
        context = new Intent(context, TextEditorActivity.class);
        context.setAction("android.intent.action.VIEW");
        context.setDataAndType(Uri.parse((String)i8.Q()), "text/plain");
        return context;
    }

    public static Intent g(Context context, n n8, y y8) {
        context = new Intent(context, TextEditorActivity.class);
        context.setAction("android.intent.action.VIEW");
        context.setDataAndType(u.z(y8.N()), "text/plain");
        if (n8 != null) {
            context.putExtra("original_file_location_uri", n8.Q());
        }
        return context;
    }

    public static Intent h(Context context, String string) {
        context = new Intent(context, TextEditorActivity.class);
        context.setAction("android.intent.action.VIEW");
        context.setDataAndType(u.z(new File(string)), "text/plain");
        context.putExtra("read_only", true);
        return context;
    }

    public static Intent i(Context context, n n8, int n9, boolean bl) {
        if (B.H(n8)) {
            context = w.k(context, u.L(n8, false), true, bl);
            if (n9 >= 0) {
                context.putExtra("slide_interval", n9);
                context.putExtra("finish_after_play", true);
            }
            return context;
        }
        b.f();
        return null;
    }

    public static Intent j(Context context, Uri uri, ArrayList<e.a> arrayList, boolean bl, boolean bl2) {
        Intent intent = new Intent(context, VideoPlayerActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(uri);
        boolean bl3 = false;
        for (int i8 = 0; i8 < arrayList.size(); ++i8) {
            Uri uri2 = arrayList.get((int)i8).a;
            boolean bl4 = bl3;
            if (uri2 != null) {
                bl4 = bl3;
                if (uri2.equals((Object)uri)) {
                    bl4 = true;
                }
            }
            bl3 = bl4;
        }
        if (!bl3) {
            return w.k(context, uri, bl, bl2);
        }
        intent.putExtra("detect_subtitle", bl);
        e.b().d(arrayList);
        return intent;
    }

    private static Intent k(Context context, Uri uri, boolean bl, boolean bl2) {
        e.b().a();
        context = new Intent(context, VideoPlayerActivity.class);
        context.setAction("android.intent.action.VIEW");
        context.setData(uri);
        context.putExtra("detect_subtitle", bl);
        return context;
    }

    private static boolean l(Context context, Intent intent) {
        try {
            context = intent.resolveActivity(context.getPackageManager());
            return context != null;
        }
        catch (NullPointerException nullPointerException) {
            ax.Ha.c.h().f().b("RESOLVE ACTIVITY NULL").l(nullPointerException).h();
            return false;
        }
    }

    public static boolean m(Activity activity, Intent intent, int n8, boolean bl) {
        return w.o(activity, null, intent, n8, bl);
    }

    public static boolean n(Fragment fragment, Intent intent, int n8, boolean bl) {
        return w.o(fragment.f0(), fragment, intent, n8, bl);
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean o(Activity activity, Fragment fragment, Intent intent, int n8, boolean bl) {
        RuntimeException var1_6;
        block12: {
            RuntimeException runtimeException2222;
            Intent intent2;
            block11: {
                if (intent == null) return false;
                if (bl) {
                    try {
                        intent2 = Intent.createChooser((Intent)intent, (CharSequence)activity.getString(2131952282));
                        break block11;
                    }
                    catch (RuntimeException runtimeException2222) {
                    }
                    catch (NullPointerException nullPointerException) {
                        break block12;
                    }
                    catch (SecurityException securityException) {
                        break block12;
                    }
                }
                intent2 = intent;
            }
            if (n8 != 0) {
                if (fragment != null) {
                    u.r0(fragment, intent2, n8);
                    return true;
                }
                u.q0(activity, intent2, n8);
                return true;
            }
            if (fragment != null) {
                u.p0(fragment, intent2);
                return true;
            }
            u.o0((Context)activity, intent2);
            return true;
            catch (ActivityNotFoundException activityNotFoundException) {
                Toast.makeText((Context)activity, (int)2131952448, (int)1).show();
                return false;
            }
            if (runtimeException2222.getCause() instanceof TransactionTooLargeException) {
                Object object = intent.getData();
                object = object != null ? (object.getPath() != null ? d0.f(object.getPath()) : "nopath") : "nodata";
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("type:");
                stringBuilder.append((String)object);
                stringBuilder.append(",is mx:");
                stringBuilder.append(u.Y(intent));
                d.c("file open transaction large", new Exception(stringBuilder.toString()));
            } else {
                d.c("file open transaction large 2", runtimeException2222);
            }
            Toast.makeText((Context)activity, (int)2131951927, (int)1).show();
            return false;
        }
        var1_6.printStackTrace();
        Toast.makeText((Context)activity, (int)2131951927, (int)1).show();
        return false;
    }
}

