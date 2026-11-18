package ax.c3;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ax.b3.C1495j;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.C3192j;
import com.voxdon.xplorer.activity.FileProgressActivity;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.activity.ResultActivity;
import com.voxdon.xplorer.activity.SaveToActivity;
import com.voxdon.xplorer.activity.ShortcutActivity;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3590i;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.musicplayer.FullScreenPlayerActivity;
import com.voxdon.xplorer.provider.MyFileProvider;
import com.voxdon.xplorer.service.HttpServerService;
import com.voxdon.xplorer.viewer.ImageViewer;
import com.voxdon.xplorer.viewer.MusicPlayer;
import com.voxdon.xplorer.viewer.VideoPlayerActivity;
import com.voxdon.xplorer.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* renamed from: ax.c3.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1832u {
    private static final Logger a = Logger.getLogger("FileManager.FileIntent");
    public static final Uri b = Uri.parse("content://com.filemanager.BRING_TO_FRONT");
    private static Boolean c;

    public static Uri A(File file) {
        return w(file);
    }

    public static Uri B(Context context, File file) {
        return !ax.X2.Q.N() ? w(file) : u(context, file);
    }

    public static Uri C(Context context, File file) {
        try {
            return HttpServerService.l(com.voxdon.xplorer.service.b.f(context).h(), C1835x.f(file).z(file.getPath()));
        } catch (C1495j unused) {
            return null;
        }
    }

    public static Intent D(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        if (!z) {
            intent.addFlags(268435456);
            return intent;
        }
        intent.addFlags(335544320);
        intent.putExtra("com.filemanager.extra.HAS_PENDING_DIALOG", true);
        return intent;
    }

    public static Intent E(Context context, String str, Uri uri) {
        return F(context, str, uri, null);
    }

    public static Intent F(Context context, String str, Uri uri, String str2) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.addFlags(268435456);
        intent.addFlags(536870912);
        intent.addFlags(67108864);
        if (str != null) {
            intent.setAction(str);
        }
        intent.setDataAndType(uri, str2);
        return intent;
    }

    public static Intent G(Context context) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setAction("com.filemanager.SET_PERMISSION");
        return intent;
    }

    public static Uri H(AbstractC3595n abstractC3595n, boolean z) {
        return y(abstractC3595n, false, z);
    }

    public static Uri I(AbstractC3595n abstractC3595n) {
        return MyFileProvider.x(abstractC3595n);
    }

    public static Intent J(Context context) {
        Intent intent = new Intent(context, (Class<?>) ResultActivity.class);
        intent.setAction("com.filemanager.BRING_TO_FRONT");
        intent.addFlags(268435456);
        return intent;
    }

    public static Intent K(Context context, K k) {
        return E(context, "com.voxdon.xplorer.OPEN_ANALYSIS", C1809B.V(k, "/", null));
    }

    public static Uri L(AbstractC3595n abstractC3595n, boolean z) {
        return y(abstractC3595n, false, z);
    }

    private static boolean M(Intent intent) {
        Uri data = intent.getData();
        Bundle extras = intent.getExtras();
        if (data != null && "file".equals(data.getScheme())) {
            return true;
        }
        if (extras != null) {
            Object obj = extras.get("output");
            if ((obj instanceof Uri) && "file".equals(((Uri) obj).getScheme())) {
                return true;
            }
            Object obj2 = extras.get("android.intent.extra.STREAM");
            if (obj2 instanceof Uri) {
                if ("file".equals(((Uri) obj2).getScheme())) {
                    return true;
                }
            } else if (obj2 instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    if ("file".equals(((Uri) obj3).getScheme())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean N(String str) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("image/") || str.startsWith("video/") || str.startsWith("audio/")) {
            return true;
        }
        return Arrays.asList("text/x-vcard", "text/x-vcalendar", "text/calendar", "text/plain", "text/html", "text/xml", "application/zip", "application/vnd.ms-excel", "application/msword", "application/vnd.ms-powerpoint", "application/pdf", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/vnd.openxmlformats-officedocument.presentationml.presentation").contains(str);
    }

    public static boolean O(Uri uri) {
        return uri != null && "content".equals(uri.getScheme());
    }

    public static boolean P(Uri uri) {
        return uri != null && "file".equals(uri.getScheme());
    }

    public static boolean Q(Context context) {
        if (c == null) {
            c = Boolean.valueOf(C3180B.L(context, "com.voxdon.plugin.fileuri"));
        }
        return c.booleanValue();
    }

    public static boolean R(String str) {
        return "html".equals(str);
    }

    public static boolean S(Intent intent) {
        return intent.getComponent() != null && "com.voxdon.xplorer".equals(intent.getComponent().getPackageName()) && ImageViewer.class.getName().equals(intent.getComponent().getClassName());
    }

    public static boolean T(Intent intent) {
        return intent.getComponent() != null && "com.voxdon.xplorer".equals(intent.getComponent().getPackageName()) && MusicPlayer.class.getName().equals(intent.getComponent().getClassName());
    }

    public static boolean U(Intent intent) {
        if (intent.getComponent() == null) {
            return false;
        }
        return V(intent.getComponent());
    }

    public static boolean V(ComponentName componentName) {
        return "com.voxdon.xplorer".equals(componentName.getPackageName()) && VideoPlayerActivity.class.getName().equals(componentName.getClassName());
    }

    public static boolean W(Intent intent) {
        return intent != null && intent.getData() != null && "127.0.0.1".equals(intent.getData().getHost()) && "http".equals(intent.getData().getScheme());
    }

    public static boolean X(Intent intent) {
        if (intent.getComponent() == null) {
            return false;
        }
        return "net.gsantner.markor".equals(intent.getComponent().getPackageName());
    }

    public static boolean Y(Intent intent) {
        if (intent.getComponent() == null) {
            return false;
        }
        return "com.mxtech.videoplayer.ad".equals(intent.getComponent().getPackageName()) || "com.mxtech.videoplayer.pro".equals(intent.getComponent().getPackageName());
    }

    public static boolean Z(Uri uri) {
        if (uri == null) {
            return false;
        }
        return C1809B.L(uri.getScheme());
    }

    public static void a() {
        c = null;
    }

    public static boolean a0(Intent intent) {
        return Y(intent) || X(intent);
    }

    public static Intent b(Intent intent) {
        Intent intent2 = new Intent("com.filemanager.plugin.action.LAUNCH_FILE_URI");
        intent2.setPackage("com.voxdon.plugin.fileuri");
        if (intent.getData() != null) {
            intent2.putExtra("com.filemanager.plugin.extra.DATA", intent.getDataString());
        }
        if (intent.getType() != null) {
            intent2.putExtra("com.filemanager.plugin.extra.TYPE", intent.getType());
        }
        if (intent.getAction() != null) {
            intent2.putExtra("com.filemanager.plugin.extra.ACTION", intent.getAction());
        }
        if (intent.getComponent() != null) {
            intent2.putExtra("com.filemanager.plugin.extra.PACKAGE_NAME", intent.getComponent().getPackageName());
            intent2.putExtra("com.filemanager.plugin.extra.CLASS_NAME", intent.getComponent().getClassName());
        } else if (intent.getPackage() != null) {
            intent2.putExtra("com.filemanager.plugin.extra.PACKAGE_NAME", intent.getPackage());
        }
        if (intent.getFlags() != 0) {
            intent2.putExtra("com.filemanager.plugin.extra.FLAGS", intent.getFlags());
        }
        if (intent.getExtras() != null) {
            intent2.putExtra("com.filemanager.plugin.extra.EXTRAS", intent.getExtras());
        }
        return intent2;
    }

    public static void b0(Context context, Intent intent, String str) {
        Intent intent2 = new Intent(context, (Class<?>) MainActivity.class);
        intent2.setFlags(654311424);
        intent2.setAction(intent.getAction());
        if (intent.getType() != null) {
            intent2.setType(intent.getType());
        }
        if (intent.getExtras() != null) {
            intent2.putExtras(intent.getExtras());
        }
        if (str != null) {
            intent2.putExtra("com.filemanager.plugin.extra.CALLING_PACKAGE", str);
        }
        context.startActivity(intent2);
    }

    private static Intent c(Context context, Intent intent) {
        Intent intent2 = new Intent(intent);
        Uri data = intent.getData();
        Bundle extras = intent.getExtras();
        if (P(data)) {
            Uri u = u(context, new File(data.getPath()));
            intent2.setDataAndType(u, intent.getType());
            a.fine("convert intent data :" + u);
        }
        if (extras != null) {
            Object obj = extras.get("output");
            if (obj instanceof Uri) {
                Uri uri = (Uri) obj;
                if ("file".equals(uri.getScheme())) {
                    Uri u2 = u(context, new File(uri.getPath()));
                    intent2.putExtra("output", u2);
                    a.fine("convert extra output :" + u2);
                }
            }
            Object obj2 = extras.get("android.intent.extra.STREAM");
            if (obj2 instanceof Uri) {
                Uri uri2 = (Uri) obj2;
                if ("file".equals(uri2.getScheme())) {
                    Uri u3 = u(context, new File(uri2.getPath()));
                    intent2.putExtra("android.intent.extra.STREAM", u3);
                    a.fine("convert extra stream :" + u3);
                    if (ax.X2.Q.D1()) {
                        intent2.setClipData(ClipData.newUri(context.getContentResolver(), HttpUrl.FRAGMENT_ENCODE_SET, u3));
                        return intent2;
                    }
                }
            } else if (obj2 instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    Uri uri3 = (Uri) obj3;
                    if ("file".equals(uri3.getScheme())) {
                        Uri u4 = u(context, new File(uri3.getPath()));
                        arrayList2.add(u4);
                        arrayList3.add(u4);
                    } else {
                        arrayList2.add(uri3);
                    }
                }
                a.fine("convert extra stream : list uri");
                intent2.putExtra("android.intent.extra.STREAM", arrayList2);
                if (ax.X2.Q.D1()) {
                    ClipData newUri = ClipData.newUri(context.getContentResolver(), HttpUrl.FRAGMENT_ENCODE_SET, (Uri) arrayList3.get(0));
                    if (arrayList3.size() > 1) {
                        for (int i2 = 1; i2 < arrayList3.size(); i2++) {
                            newUri.addItem(new ClipData.Item((Uri) arrayList3.get(i2)));
                        }
                    }
                    intent2.setClipData(newUri);
                }
            }
        }
        return intent2;
    }

    public static void c0(Context context) {
        context.startActivity(E(context, "com.voxdon.xplorer.SAVE_FILE", null));
    }

    public static Intent d(String str) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", str, null));
        return intent;
    }

    public static void d0(Context context, Uri uri) {
        context.startActivity(E(context, "com.voxdon.xplorer.OPEN_FILE", uri));
    }

    public static Intent e(Context context, AbstractC1823k abstractC1823k, boolean z) {
        Uri q = q(context, abstractC1823k);
        Intent h = h(q, abstractC1823k.s(), true, z, true);
        h.setPackage("com.google.android.apps.photos");
        if (C3180B.K(context, h)) {
            return h;
        }
        Intent f = f(q, abstractC1823k.s(), true, z, true);
        if (C3180B.K(context, f)) {
            return f;
        }
        if (q != null && "media".equals(q.getHost())) {
            Intent h2 = h(q, abstractC1823k.s(), true, z, true);
            h2.setPackage("com.google.android.markup");
            if (C3180B.K(context, h2)) {
                return h2;
            }
        }
        return h(q, abstractC1823k.s(), true, z, true);
    }

    public static void e0(Context context) {
        context.startActivity(E(context, null, null));
    }

    public static Intent f(Uri uri, String str, boolean z, boolean z2, boolean z3) {
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, str);
        if (z) {
            intent.addFlags(268435456);
        }
        intent.addFlags(1);
        if (z2) {
            intent.addFlags(2);
        }
        if (z3 && ax.X2.Q.s0()) {
            intent.addFlags(64);
        }
        if (z2) {
            intent.putExtra("output", uri);
        }
        return intent;
    }

    public static void f0(Activity activity, String str, String str2) {
        Intent intent = new Intent(activity, (Class<?>) FullScreenPlayerActivity.class);
        intent.putExtra("extra_temp_file_path", str);
        intent.putExtra("extra_temp_file_type", str2);
        activity.startActivity(intent);
    }

    public static Uri g(AbstractC1823k abstractC1823k) {
        return C1809B.P(abstractC1823k) ? ax.X2.Q.N() ? v(abstractC1823k) : w(((C3605y) abstractC1823k).F0()) : v(abstractC1823k);
    }

    public static void g0(Context context, AbstractC1823k abstractC1823k) {
        if (C1809B.J(abstractC1823k)) {
            i0(context, abstractC1823k.s(), p((C3590i) abstractC1823k));
        } else if (C1809B.P(abstractC1823k)) {
            h0(context, abstractC1823k.s(), ((C3605y) abstractC1823k).F0());
        } else {
            C3184b.f();
        }
    }

    public static Intent h(Uri uri, String str, boolean z, boolean z2, boolean z3) {
        Intent intent = new Intent("android.intent.action.EDIT");
        intent.setDataAndType(uri, str);
        if (z) {
            intent.addFlags(268435456);
        }
        intent.addFlags(1);
        if (z2) {
            intent.addFlags(2);
        }
        if (z3 && ax.X2.Q.s0()) {
            intent.addFlags(64);
        }
        if (z2) {
            intent.putExtra("output", uri);
        }
        return intent;
    }

    public static void h0(Context context, String str, File file) {
        i0(context, str, A(file));
    }

    private static Intent i(Context context, Intent intent, CharSequence charSequence) {
        if (!ax.X2.Q.N() || !M(intent)) {
            a.fine("Safe Intent : File Uri");
            return Intent.createChooser(intent, charSequence);
        }
        if (ax.t3.h.i(context) && ax.X2.Q.c()) {
            Intent b2 = b(Intent.createChooser(intent, charSequence));
            a.fine("Safe Intent : File Uri Plugin");
            return b2;
        }
        Intent createChooser = Intent.createChooser(c(context, intent), charSequence);
        a.fine("Safe Intent : File Provider Uri");
        return createChooser;
    }

    private static void i0(Context context, String str, Uri uri) {
        if (str == null || str.trim().length() == 0) {
            str = "application/octet-stream";
        }
        Intent intent = new Intent("android.intent.action.ATTACH_DATA");
        intent.setDataAndType(uri, str);
        intent.putExtra("mimeType", str);
        intent.addFlags(1);
        try {
            o0(context, i(context, intent, context.getString(R.string.set_as)));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, R.string.no_application, 1).show();
        }
    }

    public static Intent j(Context context, boolean z, String str, List<AbstractC3595n> list) {
        ArrayList arrayList = new ArrayList();
        boolean z2 = z || (ax.X2.Q.z() && list.size() > 1);
        for (AbstractC3595n abstractC3595n : list) {
            Uri u = z2 ? u(context, abstractC3595n.N()) : B(context, abstractC3595n.N());
            if (u != null) {
                arrayList.add(u);
                if (!TextUtils.isEmpty(str) && MyFileProvider.D(u)) {
                    try {
                        context.grantUriPermission(str, u, ax.X2.Q.s0() ? z ? 67 : 65 : z ? 3 : 1);
                    } catch (Exception unused) {
                    }
                }
            }
        }
        Intent intent = new Intent();
        intent.addFlags(1);
        if (z) {
            intent.addFlags(2);
        }
        if (ax.X2.Q.s0()) {
            intent.addFlags(64);
        }
        if (arrayList.size() == 1) {
            intent.setData((Uri) arrayList.get(0));
        } else if (arrayList.size() > 1) {
            if (ax.X2.Q.l1()) {
                ClipData newUri = ClipData.newUri(context.getContentResolver(), HttpUrl.FRAGMENT_ENCODE_SET, (Uri) arrayList.get(0));
                if (arrayList.size() > 1) {
                    for (int i = 1; i < arrayList.size(); i++) {
                        newUri.addItem(new ClipData.Item((Uri) arrayList.get(i)));
                    }
                }
                intent.setClipData(newUri);
            } else {
                intent.setData((Uri) arrayList.get(0));
            }
        }
        return intent;
    }

    public static void j0(Context context, AbstractC1823k abstractC1823k) {
        if (C1809B.J(abstractC1823k)) {
            k0(context, abstractC1823k.s(), p((C3590i) abstractC1823k));
        } else {
            m0(context, abstractC1823k.s(), abstractC1823k.N());
        }
    }

    public static Intent k(Context context, K k, String str) {
        Intent intent = new Intent(context, (Class<?>) ShortcutActivity.class);
        intent.setAction("com.voxdon.xplorer.OPEN_SHORTCUT");
        if (TextUtils.isEmpty(str)) {
            str = k.e();
        }
        intent.setData(Uri.parse(C1809B.U(k, str)));
        intent.putExtra("IS_DIRECTORY", true);
        intent.addFlags(268435456);
        return intent;
    }

    public static void k0(Context context, String str, Uri uri) {
        l0(context, str, uri, null, null);
    }

    public static Intent l(Context context, AbstractC3595n abstractC3595n) {
        Intent intent = new Intent(context, (Class<?>) ShortcutActivity.class);
        intent.setAction("com.voxdon.xplorer.OPEN_SHORTCUT");
        intent.setData(Uri.parse(abstractC3595n.Q()));
        intent.putExtra("IS_DIRECTORY", abstractC3595n.isDirectory());
        intent.addFlags(268435456);
        return intent;
    }

    public static void l0(Context context, String str, Uri uri, String str2, String str3) {
        if (context == null) {
            C3184b.g("share local context null");
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(524288);
        intent.putExtra("android.intent.extra.STREAM", uri);
        if (str2 != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str2);
        }
        if (str3 != null) {
            intent.putExtra("android.intent.extra.TEXT", str3);
        }
        intent.addFlags(1);
        if (str == null || str.trim().length() == 0) {
            str = "application/octet-stream";
        }
        intent.setType(str);
        Intent i = i(context, intent, context.getString(R.string.dialog_title_share));
        if (ax.X2.Q.Z0() && !N(str)) {
            try {
                if (C3192j.c(context)) {
                    Intent intent2 = new Intent(intent);
                    if (ax.X2.Q.N() && M(intent)) {
                        intent2 = c(context, intent2);
                    }
                    String a2 = C3192j.a(context);
                    if (!C3192j.b(context, intent2, a2)) {
                        intent2.setComponent(new ComponentName(a2, "com.android.bluetooth.opp.BluetoothOppLauncherActivity"));
                        i.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent2});
                    }
                }
            } catch (SecurityException unused) {
            }
        }
        try {
            o0(context, i);
        } catch (ActivityNotFoundException unused2) {
            Toast.makeText(context, R.string.no_application, 1).show();
        } catch (RuntimeException unused3) {
            Toast.makeText(context, R.string.error, 1).show();
        }
    }

    public static Intent m(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(C3180B.q(str));
        return intent;
    }

    public static void m0(Context context, String str, File file) {
        k0(context, str, A(file));
    }

    public static Intent n(Uri uri, String str, boolean z, boolean z2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (ax.X2.J.d() && "application/vnd.android.package-archive".equalsIgnoreCase(str) && C1809B.E(uri.getScheme())) {
            intent = new Intent("android.intent.action.INSTALL_PACKAGE");
        }
        if (str != null) {
            intent.setDataAndType(uri, str);
        } else {
            intent.setData(uri);
        }
        if (z) {
            intent.addFlags(268435456);
        }
        if (MyFileProvider.D(uri)) {
            intent.addFlags(1);
            intent.addFlags(2);
        }
        if (z2 && ax.X2.Q.s0()) {
            intent.addFlags(64);
        }
        return intent;
    }

    public static void n0(Context context, List<AbstractC3595n> list) {
        Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
        intent.addFlags(524288);
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC3595n> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(A(((C3605y) it.next()).F0()));
        }
        intent.putExtra("android.intent.extra.STREAM", arrayList);
        intent.addFlags(1);
        intent.setType(C1833v.b(list));
        try {
            o0(context, i(context, intent, context.getString(R.string.dialog_title_share)));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, R.string.no_application, 1).show();
        } catch (RuntimeException e) {
            Toast.makeText(context, R.string.error, 1).show();
            ax.Ha.c.h().d("MultipleShare TransactionTooLarge?").l(e).g("FILE NUMBER:" + arrayList.size()).h();
        }
    }

    public static String o(Context context, Intent intent) {
        if (intent.getData() == null) {
            return intent.getType();
        }
        String type = (intent.getType() == null || "*/*".equals(intent.getType())) ? context.getContentResolver().getType(intent.getData()) : intent.getType();
        if (C1833v.j(type)) {
            String path = intent.getData().getPath();
            if (!TextUtils.isEmpty(path)) {
                String f = d0.f(path);
                if (!TextUtils.isEmpty(f)) {
                    String f2 = C1833v.f(f);
                    if (!C1833v.j(f2)) {
                        return f2;
                    }
                }
            }
        }
        return type;
    }

    public static void o0(Context context, Intent intent) {
        ax.S2.a.d();
        context.startActivity(intent);
    }

    public static Uri p(C3590i c3590i) {
        return MyFileProvider.r(c3590i);
    }

    public static void p0(Fragment fragment, Intent intent) {
        ax.S2.a.d();
        fragment.F2(intent);
    }

    private static Uri q(Context context, AbstractC1823k abstractC1823k) {
        if (abstractC1823k instanceof C3605y) {
            Uri b2 = N.b(context, abstractC1823k.E());
            if (b2 != null) {
                return b2;
            }
            if (!ax.X2.Q.N()) {
                return w(((C3605y) abstractC1823k).F0());
            }
        }
        return v(abstractC1823k);
    }

    public static void q0(Activity activity, Intent intent, int i) {
        ax.S2.a.d();
        activity.startActivityForResult(intent, i);
    }

    public static Uri r(Context context, File file) {
        return (ax.X2.Q.N() && ax.t3.h.i(context)) ? w(file) : !ax.X2.Q.N() ? w(file) : u(context, file);
    }

    public static void r0(Fragment fragment, Intent intent, int i) {
        ax.S2.a.d();
        fragment.startActivityForResult(intent, i);
    }

    public static ArrayList<Uri> s(Context context, AbstractC3595n abstractC3595n, boolean z) {
        ArrayList<Uri> arrayList = new ArrayList<>();
        if (abstractC3595n instanceof C3590i) {
            arrayList.add(p((C3590i) abstractC3595n));
            return arrayList;
        }
        if (z && abstractC3595n.b0()) {
            arrayList.add(I(abstractC3595n));
            return arrayList;
        }
        arrayList.add(A(abstractC3595n.N()));
        arrayList.add(u(context, abstractC3595n.N()));
        return arrayList;
    }

    public static void s0(Activity activity, Uri uri, String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setComponent(new ComponentName(activity, (Class<?>) SaveToActivity.class));
        intent.setType(str);
        intent.putExtra("android.intent.extra.STREAM", uri);
        activity.startActivity(intent);
    }

    public static Intent t(Context context) {
        Intent intent = new Intent(context, (Class<?>) FileProgressActivity.class);
        intent.addFlags(268435456);
        return intent;
    }

    public static Uri u(Context context, File file) {
        return MyFileProvider.s(file);
    }

    public static Uri v(AbstractC1823k abstractC1823k) {
        return abstractC1823k instanceof C3590i ? p((C3590i) abstractC1823k) : MyFileProvider.s(abstractC1823k.N());
    }

    public static Uri w(File file) {
        return Uri.fromFile(file);
    }

    public static Uri x(AbstractC1823k abstractC1823k) {
        return y(abstractC1823k, false, false);
    }

    private static Uri y(AbstractC3595n abstractC3595n, boolean z, boolean z2) {
        if (C1809B.J(abstractC3595n)) {
            return MyFileProvider.r((C3590i) abstractC3595n);
        }
        if (C1809B.P(abstractC3595n)) {
            C3605y c3605y = (C3605y) abstractC3595n;
            return (c3605y.m0() && (z || c3605y.k0())) ? MyFileProvider.v(c3605y) : c3605y.d1() ? MyFileProvider.w(c3605y) : Uri.fromFile(abstractC3595n.N());
        }
        if (z2 && abstractC3595n.b0()) {
            return MyFileProvider.x(abstractC3595n);
        }
        C3184b.f();
        return null;
    }

    public static Uri z(File file) {
        return w(file);
    }
}
