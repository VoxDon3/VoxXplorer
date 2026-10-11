package ax.c3;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.TransactionTooLargeException;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ax.u3.C3184b;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3590i;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.texteditor.TextEditorActivity;
import com.voxdon.xplorer.viewer.ImageViewerActivity;
import com.voxdon.xplorer.viewer.VideoPlayerActivity;
import com.voxdon.xplorer.viewer.e;
import com.voxdon.xplorer.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ax.c3.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1834w {
    public static boolean a(Context context, AbstractC3595n abstractC3595n, String str, boolean z) {
        if (str == null) {
            str = abstractC3595n.s();
        }
        ArrayList<Uri> s = C1832u.s(context, abstractC3595n, z);
        int size = s.size();
        int i = 0;
        while (i < size) {
            Uri uri = s.get(i);
            i++;
            if (l(context, C1832u.n(uri, str, true, false))) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(Uri uri, AbstractC3595n abstractC3595n) {
        if (uri == null || abstractC3595n == null) {
            return false;
        }
        String h = d0.h(uri.getPath());
        String B = abstractC3595n.B();
        if (h == null || h.equals(B)) {
            return true;
        }
        if (!abstractC3595n.l()) {
            ax.Ha.c.h().f().b("URI AND FILE INFO NOT MATCH").j().g(abstractC3595n.R().k() + ":" + uri.getPath() + " != " + abstractC3595n.E()).h();
        }
        return false;
    }

    public static Intent c(Context context, K k, String str, List<AbstractC3595n> list, int i, boolean z) {
        ax.Q2.f d = k.d();
        int b = k.b();
        String str2 = d.I() + b + str;
        com.voxdon.xplorer.viewer.c.b().c(str2, list, i);
        Intent intent = new Intent(context, (Class<?>) ImageViewerActivity.class);
        intent.putExtra("location", d);
        intent.putExtra("location_key", b);
        intent.putExtra(ImageViewerActivity.H, str2);
        return intent;
    }

    public static Intent d(Context context, AbstractC3595n abstractC3595n, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(abstractC3595n);
        return c(context, abstractC3595n.R(), abstractC3595n.E(), arrayList, 0, z);
    }

    public static Intent e(Context context, Uri uri) {
        Intent k = k(context, uri, false, false);
        k.putExtra("finish_after_play", true);
        return k;
    }

    public static Intent f(Context context, C3590i c3590i) {
        Intent intent = new Intent(context, (Class<?>) TextEditorActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(Uri.parse(c3590i.Q()), "text/plain");
        return intent;
    }

    public static Intent g(Context context, AbstractC3595n abstractC3595n, C3605y c3605y) {
        Intent intent = new Intent(context, (Class<?>) TextEditorActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(C1832u.z(c3605y.N()), "text/plain");
        if (abstractC3595n != null) {
            intent.putExtra("original_file_location_uri", abstractC3595n.Q());
        }
        return intent;
    }

    public static Intent h(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) TextEditorActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(C1832u.z(new File(str)), "text/plain");
        intent.putExtra("read_only", true);
        return intent;
    }

    public static Intent i(Context context, AbstractC3595n abstractC3595n, int i, boolean z) {
        if (!C1809B.H(abstractC3595n)) {
            C3184b.f();
            return null;
        }
        Intent k = k(context, C1832u.L(abstractC3595n, false), true, z);
        if (i >= 0) {
            k.putExtra("slide_interval", i);
            k.putExtra("finish_after_play", true);
        }
        return k;
    }

    public static Intent j(Context context, Uri uri, ArrayList<e.a> arrayList, boolean z, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) VideoPlayerActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(uri);
        boolean z3 = false;
        for (int i = 0; i < arrayList.size(); i++) {
            Uri uri2 = arrayList.get(i).a;
            if (uri2 != null && uri2.equals(uri)) {
                z3 = true;
            }
        }
        if (!z3) {
            return k(context, uri, z, z2);
        }
        intent.putExtra("detect_subtitle", z);
        com.voxdon.xplorer.viewer.e.b().d(arrayList);
        return intent;
    }

    private static Intent k(Context context, Uri uri, boolean z, boolean z2) {
        com.voxdon.xplorer.viewer.e.b().a();
        Intent intent = new Intent(context, (Class<?>) VideoPlayerActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(uri);
        intent.putExtra("detect_subtitle", z);
        return intent;
    }

    private static boolean l(Context context, Intent intent) {
        try {
            return intent.resolveActivity(context.getPackageManager()) != null;
        } catch (NullPointerException e) {
            ax.Ha.c.h().f().b("RESOLVE ACTIVITY NULL").l(e).h();
            return false;
        }
    }

    public static boolean m(Activity activity, Intent intent, int i, boolean z) {
        return o(activity, null, intent, i, z);
    }

    public static boolean n(Fragment fragment, Intent intent, int i, boolean z) {
        return o(fragment.f0(), fragment, intent, i, z);
    }

    private static boolean o(Activity activity, Fragment fragment, Intent intent, int i, boolean z) {
        Intent intent2;
        if (intent == null) {
            return false;
        }
        if (z) {
            try {
                intent2 = Intent.createChooser(intent, activity.getString(R.string.menu_open_with));
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(activity, R.string.no_application, 1).show();
                return false;
            } catch (NullPointerException e) {
                e = e;
                e.printStackTrace();
                Toast.makeText(activity, R.string.error, 1).show();
                return false;
            } catch (SecurityException e2) {
                e = e2;
                e.printStackTrace();
                Toast.makeText(activity, R.string.error, 1).show();
                return false;
            } catch (RuntimeException e3) {
                if (e3.getCause() instanceof TransactionTooLargeException) {
                    Uri data = intent.getData();
                    ax.Q2.d.c("file open transaction large", new Exception("type:" + (data != null ? data.getPath() != null ? d0.f(data.getPath()) : "nopath" : "nodata") + ",is mx:" + C1832u.Y(intent)));
                } else {
                    ax.Q2.d.c("file open transaction large 2", e3);
                }
                Toast.makeText(activity, R.string.error, 1).show();
                return false;
            }
        } else {
            intent2 = intent;
        }
        if (i != 0) {
            if (fragment != null) {
                C1832u.r0(fragment, intent2, i);
            } else {
                C1832u.q0(activity, intent2, i);
            }
        } else if (fragment != null) {
            C1832u.p0(fragment, intent2);
        } else {
            C1832u.o0(activity, intent2);
        }
        return true;
    }
}
