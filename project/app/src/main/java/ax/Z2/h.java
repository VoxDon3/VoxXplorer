/*
 * Decompiled with CFR 0.152.
 */
package ax.Z2;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import ax.Ha.c;
import ax.X2.Q;
import ax.c3.u;
import com.voxdon.xplorer.viewer.ImageViewer;
import com.voxdon.xplorer.viewer.MusicPlayer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class h {
    private static final Logger g = Logger.getLogger("FileManager.IntentResolver");
    private static HashSet<String> h;
    private static HashSet<String> i;
    private static HashSet<String> j;
    private static HashSet<ComponentName> k;
    PackageManager a;
    Context b;
    int c;
    List<ResolveInfo> d;
    List<ResolveInfo> e;
    boolean f;

    public h(Context context) {
        this.b = context.getApplicationContext();
        this.a = context.getPackageManager();
        this.c = ((ActivityManager)context.getSystemService("activity")).getLauncherLargeIconDensity();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static Drawable b(Resources resources, int n8, int n9) {
        if (resources == null) {
            return null;
        }
        if (n9 != 0) return resources.getDrawableForDensity(n8, n9);
        try {
            return resources.getDrawable(n8);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        }
        catch (Resources.NotFoundException notFoundException) {
            return null;
        }
        ax.Ha.c.h().f().d("App Launcher Icon Load Error").l(indexOutOfBoundsException).h();
        return null;
    }

    private List<ResolveInfo> d() {
        if (this.d == null) {
            Intent intent = new Intent(this.b, ImageViewer.class);
            if ((intent = this.a.resolveActivity(intent, 0)) == null) {
                ax.u3.b.f();
                return null;
            }
            this.d = Collections.singletonList(intent);
        }
        return this.d;
    }

    private List<ResolveInfo> e() {
        if (this.e == null) {
            Intent intent = new Intent(this.b, MusicPlayer.class);
            if ((intent = this.a.resolveActivity(intent, 0)) == null) {
                ax.u3.b.f();
                return null;
            }
            this.e = Collections.singletonList(intent);
        }
        return this.e;
    }

    public static boolean g(a a8) {
        return !a8.e && u.P(a8.d(0).getData());
    }

    private static void h(Context context) {
        h = new HashSet();
        HashSet<String> hashSet = new HashSet<String>();
        i = hashSet;
        hashSet.add("com.google.android.apps.pdfviewer");
        i.add("com.google.android.apps.docs");
        hashSet = new HashSet();
        j = hashSet;
        hashSet.add("com.foxdebug.acodefree");
        j.add("com.foxdebug.acode");
        hashSet = new HashSet();
        k = hashSet;
        hashSet.add((String)new ComponentName(context.getPackageName(), "com.voxdon.xplorer.activity.LaunchActivity"));
    }

    public static boolean i(Context context, ComponentName componentName) {
        if (k == null) {
            ax.Z2.h.h(context);
        }
        return k.contains(componentName);
    }

    public static boolean j(Context context, ComponentName componentName) {
        if (h == null) {
            ax.Z2.h.h(context);
        }
        return h.contains(componentName.getPackageName());
    }

    public static boolean k(Context context, ComponentName componentName) {
        if (i == null) {
            ax.Z2.h.h(context);
        }
        return i.contains(componentName.getPackageName());
    }

    public static boolean l(Context context, ComponentName componentName) {
        if (j == null) {
            ax.Z2.h.h(context);
        }
        return j.contains(componentName.getPackageName());
    }

    private static boolean m(ResolveInfo resolveInfo, a a8) {
        resolveInfo = resolveInfo.activityInfo;
        return resolveInfo.packageName.equals(a8.a.getPackageName()) && resolveInfo.name.equals(a8.a.getClassName());
    }

    public static Drawable n(PackageManager packageManager, ResolveInfo resolveInfo, int n8) {
        block9: {
            String string;
            block8: {
                string = resolveInfo.resolvePackageName;
                if (string == null) break block8;
                if (resolveInfo.icon == 0 || (string = ax.Z2.h.b(packageManager.getResourcesForApplication(string), resolveInfo.icon, n8)) == null) break block8;
                return string;
            }
            int n9 = resolveInfo.getIconResource();
            if (n9 == 0) break block9;
            string = resolveInfo.activityInfo;
            if (string == null) break block9;
            try {
                string = ax.Z2.h.b(packageManager.getResourcesForApplication(((ActivityInfo)string).packageName), n9, n8);
                if (string != null) {
                    return string;
                }
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                g.severe("Couldn't find resources for package");
            }
        }
        if ((resolveInfo = resolveInfo.activityInfo) != null && (resolveInfo = resolveInfo.applicationInfo) != null) {
            return resolveInfo.loadIcon(packageManager);
        }
        return null;
    }

    public void a(List<a> list, Intent intent, List<ResolveInfo> list2) {
        int n8 = list2.size();
        int n9 = list.size();
        block0: for (int i8 = 0; i8 < n8; ++i8) {
            Object object;
            ResolveInfo resolveInfo = list2.get(i8);
            for (int i9 = 0; i9 < n9; ++i9) {
                object = list.get(i9);
                if (!ax.Z2.h.m(resolveInfo, (a)object)) continue;
                ((a)object).b(intent, resolveInfo);
                continue block0;
            }
            object = resolveInfo.activityInfo;
            object = new ComponentName(((ActivityInfo)object).packageName, ((ActivityInfo)object).name);
            if (ax.Z2.h.i(this.b, (ComponentName)object)) continue;
            boolean bl = intent.getData() != null && "http".equals(intent.getData().getScheme());
            list.add(new a((ComponentName)object, intent, resolveInfo, bl, this.f));
        }
    }

    public Drawable c(ResolveInfo resolveInfo) {
        return ax.Z2.h.n(this.a, resolveInfo, this.c);
    }

    public List<a> f(boolean bl, boolean bl2, List<Intent> list, boolean bl3, boolean bl4) {
        int n8 = list.size();
        Object object = null;
        for (int i8 = 0; i8 < n8; ++i8) {
            Object object2;
            Intent intent = list.get(i8);
            int n9 = bl ? 64 : 0;
            int n10 = bl2 ? 128 : 0;
            int n11 = Q.z1() ? 131072 : 65536;
            List list2 = this.a.queryIntentActivities(intent, n9 | n10 | n11);
            for (n9 = list2.size() - 1; n9 >= 0; --n9) {
                Object object3;
                object2 = (ResolveInfo)list2.get(n9);
                if (Q.z1() && (object3 = object2.filter) != null && (object3 = object3.categoriesIterator()) != null) {
                    n10 = 0;
                    while (object3.hasNext()) {
                        if (!"android.intent.category.DEFAULT".equals((String)object3.next())) continue;
                        n10 = 1;
                    }
                    if (n10 == 0) {
                        list2.remove(n9);
                        continue;
                    }
                }
                if ((object2 = object2.activityInfo) == null || object2.exported) continue;
                list2.remove(n9);
            }
            object2 = object;
            if (object == null) {
                object2 = new ArrayList();
            }
            if (bl3 && (object = this.d()) != null) {
                this.a((List<a>)object2, intent, (List<ResolveInfo>)object);
            }
            if (bl4 && (object = this.e()) != null) {
                this.a((List<a>)object2, intent, (List<ResolveInfo>)object);
            }
            this.a((List<a>)object2, intent, list2);
            object = object2;
        }
        return object;
    }

    public void o(Context object, Uri uri, String string, String string2, List<a> list) {
        object = new b(this, (Context)object, uri, string, string2);
        try {
            Collections.sort(list, object);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            ax.Ha.c.h().d("IntentResolver Comparator").l(illegalArgumentException).h();
            return;
        }
    }

    public void p(boolean bl) {
        this.f = bl;
    }

    public static final class a {
        public final ComponentName a;
        private final List<Intent> b = new ArrayList<Intent>();
        private final List<ResolveInfo> c = new ArrayList<ResolveInfo>();
        private CharSequence d;
        private boolean e;
        private boolean f;
        private boolean g;

        public a(ComponentName componentName, Intent intent, ResolveInfo resolveInfo, boolean bl, boolean bl2) {
            this.a = componentName;
            this.b(intent, resolveInfo);
            if (bl) {
                this.f = bl2;
                this.g = true;
            }
        }

        public void b(Intent intent, ResolveInfo resolveInfo) {
            this.b.add(intent);
            this.c.add(resolveInfo);
        }

        public int c() {
            return this.b.size();
        }

        public Intent d(int n8) {
            if (n8 >= 0) {
                return this.b.get(n8);
            }
            return null;
        }

        public CharSequence e(PackageManager packageManager) {
            if (this.d == null && this.c.size() > 0) {
                this.d = this.c.get(0).loadLabel(packageManager);
            }
            return this.d;
        }

        public ResolveInfo f(int n8) {
            if (n8 >= 0) {
                return this.c.get(n8);
            }
            return null;
        }

        public boolean g() {
            return this.g;
        }

        public boolean h() {
            return this.e;
        }

        public void i(boolean bl) {
            this.f = bl;
        }

        public boolean j() {
            return this.f;
        }
    }

    class b
    implements Comparator<a> {
        Map<String, ?> c0;
        String d0;
        ComponentName e0;
        final h f0;
        boolean q;

        b(h h8, Context context, Uri uri, String string, String string2) {
            this.f0 = h8;
            this.q = u.Z(uri);
            this.c0 = ax.t3.h.c(context);
            this.d0 = string2;
            this.e0 = ax.t3.h.e(context, string, string2, uri.getScheme());
        }

        public int a(a a8, a a9) {
            boolean bl;
            ResolveInfo resolveInfo = a8.f(0);
            ResolveInfo resolveInfo2 = a9.f(0);
            ComponentName componentName = this.e0;
            if (componentName != null && (bl = componentName.equals((Object)a8.a)) != this.e0.equals((Object)a9.a)) {
                if (bl) {
                    return -1;
                }
                return 1;
            }
            if (this.q && (bl = this.d(resolveInfo.match)) != this.d(resolveInfo2.match)) {
                if (bl) {
                    return -1;
                }
                return 1;
            }
            bl = this.b(a8.a);
            if (bl != this.b(a9.a)) {
                if (bl) {
                    return -1;
                }
                return 1;
            }
            bl = this.c(resolveInfo);
            if (bl != this.c(resolveInfo2)) {
                if (bl) {
                    return -1;
                }
                return 1;
            }
            a8 = this.c0.get(a8.a.flattenToString());
            a9 = this.c0.get(a9.a.flattenToString());
            int n8 = a8 instanceof Number ? ((Number)((Object)a8)).intValue() : 0;
            int n9 = a9 instanceof Number ? ((Number)((Object)a9)).intValue() : 0;
            n8 = n9 - n8;
            if (n8 != 0) {
                return n8;
            }
            return 0;
        }

        final boolean b(ComponentName componentName) {
            return "com.voxdon.xplorer".equals(componentName.getPackageName());
        }

        final boolean c(ResolveInfo resolveInfo) {
            if (resolveInfo == null) {
                return false;
            }
            if (resolveInfo.filter == null) {
                return false;
            }
            for (int i8 = 0; i8 < resolveInfo.filter.countDataTypes(); ++i8) {
                String string = resolveInfo.filter.getDataType(i8);
                if (string == null || !string.equals(this.d0)) continue;
                return true;
            }
            return false;
        }

        final boolean d(int n8) {
            return (n8 &= 0xFFF0000) >= 0x300000 && n8 <= 0x500000;
        }
    }
}

