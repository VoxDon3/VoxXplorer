/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ax.Ha.c;
import ax.S2.a;
import ax.X2.J;
import ax.X2.Q;
import ax.c3.B;
import ax.c3.K;
import ax.c3.N;
import ax.c3.d0;
import ax.c3.k;
import ax.c3.v;
import ax.c3.x;
import ax.t3.h;
import ax.u3.b;
import ax.u3.j;
import com.voxdon.xplorer.activity.FileProgressActivity;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.activity.ResultActivity;
import com.voxdon.xplorer.activity.SaveToActivity;
import com.voxdon.xplorer.activity.ShortcutActivity;
import com.voxdon.xplorer.file.i;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.o;
import com.voxdon.xplorer.file.y;
import com.voxdon.xplorer.musicplayer.FullScreenPlayerActivity;
import com.voxdon.xplorer.provider.MyFileProvider;
import com.voxdon.xplorer.service.HttpServerService;
import com.voxdon.xplorer.viewer.ImageViewer;
import com.voxdon.xplorer.viewer.MusicPlayer;
import com.voxdon.xplorer.viewer.VideoPlayerActivity;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class u {
    private static final Logger a = Logger.getLogger("FileManager.FileIntent");
    public static final Uri b = Uri.parse((String)"content://com.filemanager.BRING_TO_FRONT");
    private static Boolean c;

    public static Uri A(File file) {
        return u.w(file);
    }

    public static Uri B(Context context, File file) {
        if (!Q.N()) {
            return u.w(file);
        }
        return u.u(context, file);
    }

    public static Uri C(Context object, File file) {
        int n8 = com.voxdon.xplorer.service.b.f((Context)object).h();
        object = x.f(file);
        try {
            object = HttpServerService.l(n8, ((o)object).z(file.getPath()));
            return object;
        }
        catch (ax.b3.j j8) {
            return null;
        }
    }

    public static Intent D(Context context, boolean bl) {
        context = new Intent(context, MainActivity.class);
        context.setAction("android.intent.action.MAIN");
        context.addCategory("android.intent.category.LAUNCHER");
        if (bl) {
            context.addFlags(0x14000000);
            context.putExtra("com.filemanager.extra.HAS_PENDING_DIALOG", true);
            return context;
        }
        context.addFlags(0x10000000);
        return context;
    }

    public static Intent E(Context context, String string, Uri uri) {
        return u.F(context, string, uri, null);
    }

    public static Intent F(Context context, String string, Uri uri, String string2) {
        context = new Intent(context, MainActivity.class);
        context.addFlags(0x10000000);
        context.addFlags(0x20000000);
        context.addFlags(0x4000000);
        if (string != null) {
            context.setAction(string);
        }
        context.setDataAndType(uri, string2);
        return context;
    }

    public static Intent G(Context context) {
        context = new Intent(context, MainActivity.class);
        context.setAction("com.filemanager.SET_PERMISSION");
        return context;
    }

    public static Uri H(n n8, boolean bl) {
        return u.y(n8, false, bl);
    }

    public static Uri I(n n8) {
        return MyFileProvider.x(n8);
    }

    public static Intent J(Context context) {
        context = new Intent(context, ResultActivity.class);
        context.setAction("com.filemanager.BRING_TO_FRONT");
        context.addFlags(0x10000000);
        return context;
    }

    public static Intent K(Context context, K k8) {
        return u.E(context, "com.voxdon.xplorer.OPEN_ANALYSIS", B.V(k8, "/", null));
    }

    public static Uri L(n n8, boolean bl) {
        return u.y(n8, false, bl);
    }

    private static boolean M(Intent object) {
        Object object2 = object.getData();
        object = object.getExtras();
        if (object2 != null && "file".equals(object2.getScheme())) {
            return true;
        }
        if (object != null) {
            object2 = object.get("output");
            if (object2 instanceof Uri && "file".equals(object2.getScheme())) {
                return true;
            }
            if ((object = object.get("android.intent.extra.STREAM")) instanceof Uri) {
                if ("file".equals(((Uri)object).getScheme())) {
                    return true;
                }
            } else if (object instanceof ArrayList) {
                object2 = (ArrayList)object;
                int n8 = ((ArrayList)object2).size();
                for (int i8 = 0; i8 < n8; ++i8) {
                    object = ((ArrayList)object2).get(i8);
                    if (!"file".equals(((Uri)object).getScheme())) continue;
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean N(String string) {
        if (string == null) {
            return false;
        }
        if (string.startsWith("image/")) {
            return true;
        }
        if (string.startsWith("video/")) {
            return true;
        }
        if (string.startsWith("audio/")) {
            return true;
        }
        return Arrays.asList("text/x-vcard", "text/x-vcalendar", "text/calendar", "text/plain", "text/html", "text/xml", "application/zip", "application/vnd.ms-excel", "application/msword", "application/vnd.ms-powerpoint", "application/pdf", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/vnd.openxmlformats-officedocument.presentationml.presentation").contains(string);
    }

    public static boolean O(Uri uri) {
        return uri != null && "content".equals(uri.getScheme());
    }

    public static boolean P(Uri uri) {
        return uri != null && "file".equals(uri.getScheme());
    }

    public static boolean Q(Context context) {
        if (c == null) {
            c = ax.u3.B.L(context, "com.voxdon.plugin.fileuri");
        }
        return c;
    }

    public static boolean R(String string) {
        return "html".equals(string);
    }

    public static boolean S(Intent intent) {
        if (intent.getComponent() == null) {
            return false;
        }
        return "com.voxdon.xplorer".equals(intent.getComponent().getPackageName()) && ImageViewer.class.getName().equals(intent.getComponent().getClassName());
    }

    public static boolean T(Intent intent) {
        if (intent.getComponent() == null) {
            return false;
        }
        return "com.voxdon.xplorer".equals(intent.getComponent().getPackageName()) && MusicPlayer.class.getName().equals(intent.getComponent().getClassName());
    }

    public static boolean U(Intent intent) {
        if (intent.getComponent() == null) {
            return false;
        }
        return u.V(intent.getComponent());
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
        {
        }
    }

    public static boolean Z(Uri uri) {
        if (uri == null) {
            return false;
        }
        return B.L(uri.getScheme());
    }

    public static void a() {
        c = null;
    }

    public static boolean a0(Intent intent) {
        return u.Y(intent) || u.X(intent);
        {
        }
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

    public static void b0(Context context, Intent intent, String string) {
        Intent intent2 = new Intent(context, MainActivity.class);
        intent2.setFlags(0x27000000);
        intent2.setAction(intent.getAction());
        if (intent.getType() != null) {
            intent2.setType(intent.getType());
        }
        if (intent.getExtras() != null) {
            intent2.putExtras(intent.getExtras());
        }
        if (string != null) {
            intent2.putExtra("com.filemanager.plugin.extra.CALLING_PACKAGE", string);
        }
        context.startActivity(intent2);
    }

    private static Intent c(Context context, Intent object) {
        Object object2;
        Intent intent = new Intent((Intent)object);
        Object object3 = object.getData();
        Object object4 = object.getExtras();
        if (u.P((Uri)object3)) {
            object3 = u.u(context, new File(object3.getPath()));
            intent.setDataAndType((Uri)object3, object.getType());
            object = a;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("convert intent data :");
            ((StringBuilder)object2).append(object3);
            ((Logger)object).fine(((StringBuilder)object2).toString());
        }
        if (object4 != null) {
            object = object4.get("output");
            if (object instanceof Uri && "file".equals((object = (Uri)object).getScheme())) {
                object3 = u.u(context, new File(object.getPath()));
                intent.putExtra("output", (Parcelable)object3);
                object2 = a;
                object = new StringBuilder();
                ((StringBuilder)object).append("convert extra output :");
                ((StringBuilder)object).append(object3);
                ((Logger)object2).fine(((StringBuilder)object).toString());
            }
            if ((object = object4.get("android.intent.extra.STREAM")) instanceof Uri) {
                if ("file".equals((object = (Uri)object).getScheme())) {
                    object = u.u(context, new File(object.getPath()));
                    intent.putExtra("android.intent.extra.STREAM", (Parcelable)object);
                    object4 = a;
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append("convert extra stream :");
                    ((StringBuilder)object3).append(object);
                    ((Logger)object4).fine(((StringBuilder)object3).toString());
                    if (Q.D1()) {
                        intent.setClipData(ClipData.newUri((ContentResolver)context.getContentResolver(), (CharSequence)"", (Uri)object));
                        return intent;
                    }
                }
            } else if (object instanceof ArrayList) {
                int n8;
                object3 = (ArrayList)object;
                object4 = new ArrayList();
                object = new ArrayList();
                int n9 = ((ArrayList)object3).size();
                for (n8 = 0; n8 < n9; ++n8) {
                    object2 = ((ArrayList)object3).get(n8);
                    if ("file".equals((object2 = (Uri)object2).getScheme())) {
                        object2 = u.u(context, new File(object2.getPath()));
                        ((ArrayList)object4).add(object2);
                        ((ArrayList)object).add(object2);
                        continue;
                    }
                    ((ArrayList)object4).add(object2);
                }
                a.fine("convert extra stream : list uri");
                intent.putExtra("android.intent.extra.STREAM", (Serializable)object4);
                if (Q.D1()) {
                    context = ClipData.newUri((ContentResolver)context.getContentResolver(), (CharSequence)"", (Uri)((Uri)((ArrayList)object).get(0)));
                    n9 = ((ArrayList)object).size();
                    if (n9 > 1) {
                        for (n8 = 1; n8 < ((ArrayList)object).size(); ++n8) {
                            context.addItem(new ClipData.Item((Uri)((ArrayList)object).get(n8)));
                        }
                    }
                    intent.setClipData((ClipData)context);
                }
            }
        }
        return intent;
    }

    public static void c0(Context context) {
        context.startActivity(u.E(context, "com.voxdon.xplorer.SAVE_FILE", null));
    }

    public static Intent d(String string) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts((String)"package", (String)string, null));
        return intent;
    }

    public static void d0(Context context, Uri uri) {
        context.startActivity(u.E(context, "com.voxdon.xplorer.OPEN_FILE", uri));
    }

    public static Intent e(Context context, k k8, boolean bl) {
        Uri uri = u.q(context, k8);
        Intent intent = u.h(uri, k8.s(), true, bl, true);
        intent.setPackage("com.google.android.apps.photos");
        if (ax.u3.B.K(context, intent)) {
            return intent;
        }
        intent = u.f(uri, k8.s(), true, bl, true);
        if (ax.u3.B.K(context, intent)) {
            return intent;
        }
        if (uri != null && "media".equals(uri.getHost())) {
            intent = u.h(uri, k8.s(), true, bl, true);
            intent.setPackage("com.google.android.markup");
            if (ax.u3.B.K(context, intent)) {
                return intent;
            }
        }
        return u.h(uri, k8.s(), true, bl, true);
    }

    public static void e0(Context context) {
        context.startActivity(u.E(context, null, null));
    }

    public static Intent f(Uri uri, String string, boolean bl, boolean bl2, boolean bl3) {
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, string);
        if (bl) {
            intent.addFlags(0x10000000);
        }
        intent.addFlags(1);
        if (bl2) {
            intent.addFlags(2);
        }
        if (bl3 && Q.s0()) {
            intent.addFlags(64);
        }
        if (bl2) {
            intent.putExtra("output", (Parcelable)uri);
        }
        return intent;
    }

    public static void f0(Activity activity, String string, String string2) {
        Intent intent = new Intent((Context)activity, FullScreenPlayerActivity.class);
        intent.putExtra("extra_temp_file_path", string);
        intent.putExtra("extra_temp_file_type", string2);
        activity.startActivity(intent);
    }

    public static Uri g(k k8) {
        if (B.P(k8)) {
            if (Q.N()) {
                return u.v(k8);
            }
            return u.w(((y)k8).F0());
        }
        return u.v(k8);
    }

    public static void g0(Context context, k k8) {
        if (B.J(k8)) {
            u.i0(context, k8.s(), u.p((i)k8));
            return;
        }
        if (B.P(k8)) {
            u.h0(context, k8.s(), ((y)k8).F0());
            return;
        }
        ax.u3.b.f();
    }

    public static Intent h(Uri uri, String string, boolean bl, boolean bl2, boolean bl3) {
        Intent intent = new Intent("android.intent.action.EDIT");
        intent.setDataAndType(uri, string);
        if (bl) {
            intent.addFlags(0x10000000);
        }
        intent.addFlags(1);
        if (bl2) {
            intent.addFlags(2);
        }
        if (bl3 && Q.s0()) {
            intent.addFlags(64);
        }
        if (bl2) {
            intent.putExtra("output", (Parcelable)uri);
        }
        return intent;
    }

    public static void h0(Context context, String string, File file) {
        u.i0(context, string, u.A(file));
    }

    private static Intent i(Context context, Intent intent, CharSequence charSequence) {
        if (Q.N() && u.M(intent)) {
            if (h.i(context) && Q.c()) {
                context = u.b(Intent.createChooser((Intent)intent, (CharSequence)charSequence));
                a.fine("Safe Intent : File Uri Plugin");
                return context;
            }
            context = Intent.createChooser((Intent)u.c(context, intent), (CharSequence)charSequence);
            a.fine("Safe Intent : File Provider Uri");
            return context;
        }
        a.fine("Safe Intent : File Uri");
        return Intent.createChooser((Intent)intent, (CharSequence)charSequence);
    }

    private static void i0(Context context, String string, Uri uri) {
        String string2;
        block5: {
            block4: {
                if (string == null) break block4;
                string2 = string;
                if (string.trim().length() != 0) break block5;
            }
            string2 = "application/octet-stream";
        }
        string = new Intent("android.intent.action.ATTACH_DATA");
        string.setDataAndType(uri, string2);
        string.putExtra("mimeType", string2);
        string.addFlags(1);
        string = u.i(context, (Intent)string, context.getString(2131952576));
        try {
            u.o0(context, (Intent)string);
            return;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            Toast.makeText((Context)context, (int)2131952448, (int)1).show();
            return;
        }
    }

    public static Intent j(Context context, boolean bl, String string, List<n> object) {
        int n8;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n9 = 1;
        boolean bl2 = bl || Q.z() && object.size() > 1;
        Iterator<n> iterator = object.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            object = bl2 ? u.u(context, ((n)object).N()) : u.B(context, ((n)object).N());
            if (object == null) continue;
            arrayList.add(object);
            if (TextUtils.isEmpty((CharSequence)string) || !MyFileProvider.D((Uri)object)) continue;
            n8 = Q.s0() ? (bl ? 67 : 65) : (bl ? 3 : 1);
            try {
                context.grantUriPermission(string, (Uri)object, n8);
            }
            catch (Exception exception) {}
        }
        string = new Intent();
        string.addFlags(1);
        if (bl) {
            string.addFlags(2);
        }
        if (Q.s0()) {
            string.addFlags(64);
        }
        if (arrayList.size() == 1) {
            string.setData((Uri)arrayList.get(0));
        } else if (arrayList.size() > 1) {
            if (Q.l1()) {
                context = ClipData.newUri((ContentResolver)context.getContentResolver(), (CharSequence)"", (Uri)((Uri)arrayList.get(0)));
                if (arrayList.size() > 1) {
                    for (n8 = n9; n8 < arrayList.size(); ++n8) {
                        context.addItem(new ClipData.Item((Uri)arrayList.get(n8)));
                    }
                }
                string.setClipData((ClipData)context);
            } else {
                string.setData((Uri)arrayList.get(0));
            }
        }
        return string;
    }

    public static void j0(Context context, k k8) {
        if (B.J(k8)) {
            u.k0(context, k8.s(), u.p((i)k8));
            return;
        }
        u.m0(context, k8.s(), k8.N());
    }

    public static Intent k(Context context, K k8, String string) {
        context = new Intent(context, ShortcutActivity.class);
        context.setAction("com.voxdon.xplorer.OPEN_SHORTCUT");
        if (TextUtils.isEmpty((CharSequence)string)) {
            string = k8.e();
        }
        context.setData(Uri.parse((String)B.U(k8, string)));
        context.putExtra("IS_DIRECTORY", true);
        context.addFlags(0x10000000);
        return context;
    }

    public static void k0(Context context, String string, Uri uri) {
        u.l0(context, string, uri, null, null);
    }

    public static Intent l(Context context, n n8) {
        context = new Intent(context, ShortcutActivity.class);
        context.setAction("com.voxdon.xplorer.OPEN_SHORTCUT");
        context.setData(Uri.parse((String)n8.Q()));
        context.putExtra("IS_DIRECTORY", n8.isDirectory());
        context.addFlags(0x10000000);
        return context;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void l0(Context context, String string, Uri object, String string2, String string3) {
        Intent intent;
        block18: {
            String var2_9;
            ComponentName componentName;
            Intent intent2;
            block20: {
                block19: {
                    if (context == null) {
                        ax.u3.b.g("share local context null");
                        return;
                    }
                    intent2 = new Intent("android.intent.action.SEND");
                    intent2.addFlags(524288);
                    intent2.putExtra("android.intent.extra.STREAM", (Parcelable)object);
                    if (intent != null) {
                        intent2.putExtra("android.intent.extra.SUBJECT", (String)intent);
                    }
                    if (componentName != null) {
                        intent2.putExtra("android.intent.extra.TEXT", (String)componentName);
                    }
                    intent2.addFlags(1);
                    if (string == null) break block19;
                    String string4 = string;
                    if (string.trim().length() != 0) break block20;
                }
                String string5 = "application/octet-stream";
            }
            intent2.setType((String)var2_9);
            intent = u.i(context, intent2, context.getString(2131951902));
            if (Q.Z0() && !u.N((String)var2_9)) {
                try {
                    if (!j.c(context)) break block18;
                    Intent intent3 = new Intent(intent2);
                    if (!Q.N()) {
                        string = intent3;
                    } else {
                        string = intent3;
                        if (u.M(intent2)) {
                            string = u.c(context, intent3);
                        }
                    }
                    String string6 = j.a(context);
                    if (!j.b(context, (Intent)string, string6)) {
                        componentName = new ComponentName(string6, "com.android.bluetooth.opp.BluetoothOppLauncherActivity");
                        string.setComponent(componentName);
                        intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[])new Intent[]{string});
                    }
                }
                catch (SecurityException securityException) {}
            }
        }
        try {
            u.o0(context, intent);
            return;
        }
        catch (RuntimeException runtimeException) {
            Toast.makeText((Context)context, (int)2131951927, (int)1).show();
            return;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            Toast.makeText((Context)context, (int)2131952448, (int)1).show();
        }
    }

    public static Intent m(String string) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(ax.u3.B.q(string));
        return intent;
    }

    public static void m0(Context context, String string, File file) {
        u.k0(context, string, u.A(file));
    }

    public static Intent n(Uri uri, String string, boolean bl, boolean bl2) {
        Intent intent;
        Intent intent2 = intent = new Intent("android.intent.action.VIEW");
        if (J.d()) {
            intent2 = intent;
            if ("application/vnd.android.package-archive".equalsIgnoreCase(string)) {
                intent2 = intent;
                if (B.E(uri.getScheme())) {
                    intent2 = new Intent("android.intent.action.INSTALL_PACKAGE");
                }
            }
        }
        if (string != null) {
            intent2.setDataAndType(uri, string);
        } else {
            intent2.setData(uri);
        }
        if (bl) {
            intent2.addFlags(0x10000000);
        }
        if (MyFileProvider.D(uri)) {
            intent2.addFlags(1);
            intent2.addFlags(2);
        }
        if (bl2 && Q.s0()) {
            intent2.addFlags(64);
        }
        return intent2;
    }

    public static void n0(Context object, List<n> intent) {
        Intent intent2 = new Intent("android.intent.action.SEND_MULTIPLE");
        intent2.addFlags(524288);
        ArrayList<Uri> arrayList = new ArrayList<Uri>();
        Iterator<n> iterator = intent.iterator();
        while (iterator.hasNext()) {
            arrayList.add(u.A(((y)iterator.next()).F0()));
        }
        intent2.putExtra("android.intent.extra.STREAM", arrayList);
        intent2.addFlags(1);
        intent2.setType(v.b(intent));
        intent = u.i((Context)object, intent2, object.getString(2131951902));
        try {
            u.o0((Context)object, intent);
            return;
        }
        catch (RuntimeException runtimeException) {
            Toast.makeText((Context)object, (int)2131951927, (int)1).show();
            ax.Ha.b b8 = ax.Ha.c.h().d("MultipleShare TransactionTooLarge?").l(runtimeException);
            object = new StringBuilder();
            ((StringBuilder)object).append("FILE NUMBER:");
            ((StringBuilder)object).append(arrayList.size());
            b8.g(((StringBuilder)object).toString()).h();
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            Toast.makeText((Context)object, (int)2131952448, (int)1).show();
        }
    }

    public static String o(Context object, Intent object2) {
        if (object2.getData() == null) {
            return object2.getType();
        }
        object = object2.getType() != null && !"*/*".equals(object2.getType()) ? object2.getType() : object.getContentResolver().getType(object2.getData());
        if (v.j((String)object) && !TextUtils.isEmpty((CharSequence)(object2 = object2.getData().getPath())) && !TextUtils.isEmpty((CharSequence)(object2 = d0.f((String)object2))) && !v.j((String)(object2 = v.f((String)object2)))) {
            return object2;
        }
        return object;
    }

    public static void o0(Context context, Intent intent) {
        ax.S2.a.d();
        context.startActivity(intent);
    }

    public static Uri p(i i8) {
        return MyFileProvider.r(i8);
    }

    public static void p0(Fragment fragment, Intent intent) {
        ax.S2.a.d();
        fragment.F2(intent);
    }

    private static Uri q(Context context, k k8) {
        if (k8 instanceof y) {
            if ((context = N.b(context, k8.E())) != null) {
                return context;
            }
            if (!Q.N()) {
                return u.w(((y)k8).F0());
            }
        }
        return u.v(k8);
    }

    public static void q0(Activity activity, Intent intent, int n8) {
        ax.S2.a.d();
        activity.startActivityForResult(intent, n8);
    }

    public static Uri r(Context context, File file) {
        if (Q.N() && h.i(context)) {
            return u.w(file);
        }
        if (!Q.N()) {
            return u.w(file);
        }
        return u.u(context, file);
    }

    public static void r0(Fragment fragment, Intent intent, int n8) {
        ax.S2.a.d();
        fragment.startActivityForResult(intent, n8);
    }

    public static ArrayList<Uri> s(Context context, n n8, boolean bl) {
        ArrayList<Uri> arrayList = new ArrayList<Uri>();
        if (n8 instanceof i) {
            arrayList.add(u.p((i)n8));
            return arrayList;
        }
        if (bl && n8.b0()) {
            arrayList.add(u.I(n8));
            return arrayList;
        }
        arrayList.add(u.A(n8.N()));
        arrayList.add(u.u(context, n8.N()));
        return arrayList;
    }

    public static void s0(Activity activity, Uri uri, String string) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setComponent(new ComponentName((Context)activity, SaveToActivity.class));
        intent.setType(string);
        intent.putExtra("android.intent.extra.STREAM", (Parcelable)uri);
        activity.startActivity(intent);
    }

    public static Intent t(Context context) {
        context = new Intent(context, FileProgressActivity.class);
        context.addFlags(0x10000000);
        return context;
    }

    public static Uri u(Context context, File file) {
        return MyFileProvider.s(file);
    }

    public static Uri v(k k8) {
        if (k8 instanceof i) {
            return u.p((i)k8);
        }
        return MyFileProvider.s(k8.N());
    }

    public static Uri w(File file) {
        return Uri.fromFile((File)file);
    }

    public static Uri x(k k8) {
        return u.y(k8, false, false);
    }

    private static Uri y(n n8, boolean bl, boolean bl2) {
        if (B.J(n8)) {
            return MyFileProvider.r((i)n8);
        }
        if (B.P(n8)) {
            y y8 = (y)n8;
            if (y8.m0() && (bl || y8.k0())) {
                return MyFileProvider.v(y8);
            }
            if (y8.d1()) {
                return MyFileProvider.w(y8);
            }
            return Uri.fromFile((File)n8.N());
        }
        if (bl2 && n8.b0()) {
            return MyFileProvider.x(n8);
        }
        ax.u3.b.f();
        return null;
    }

    public static Uri z(File file) {
        return u.w(file);
    }
}

