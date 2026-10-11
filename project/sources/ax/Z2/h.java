package ax.Z2;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import ax.X2.Q;
import ax.c3.C1832u;
import ax.u3.C3184b;
import com.voxdon.xplorer.viewer.ImageViewer;
import com.voxdon.xplorer.viewer.MusicPlayer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes.dex */
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

    public static final class a {
        public final ComponentName a;
        private final List<Intent> b = new ArrayList();
        private final List<ResolveInfo> c = new ArrayList();
        private CharSequence d;
        private boolean e;
        private boolean f;
        private boolean g;

        public a(ComponentName componentName, Intent intent, ResolveInfo resolveInfo, boolean z, boolean z2) {
            this.a = componentName;
            b(intent, resolveInfo);
            if (z) {
                this.f = z2;
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

        public Intent d(int i) {
            if (i >= 0) {
                return this.b.get(i);
            }
            return null;
        }

        public CharSequence e(PackageManager packageManager) {
            if (this.d == null && this.c.size() > 0) {
                this.d = this.c.get(0).loadLabel(packageManager);
            }
            return this.d;
        }

        public ResolveInfo f(int i) {
            if (i >= 0) {
                return this.c.get(i);
            }
            return null;
        }

        public boolean g() {
            return this.g;
        }

        public boolean h() {
            return this.e;
        }

        public void i(boolean z) {
            this.f = z;
        }

        public boolean j() {
            return this.f;
        }
    }

    class b implements Comparator<a> {
        Map<String, ?> c0;
        String d0;
        ComponentName e0;
        boolean q;

        b(Context context, Uri uri, String str, String str2) {
            this.q = C1832u.Z(uri);
            this.c0 = ax.t3.h.c(context);
            this.d0 = str2;
            this.e0 = ax.t3.h.e(context, str, str2, uri.getScheme());
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(a aVar, a aVar2) {
            boolean d;
            boolean equals;
            ResolveInfo f = aVar.f(0);
            ResolveInfo f2 = aVar2.f(0);
            ComponentName componentName = this.e0;
            if (componentName != null && (equals = componentName.equals(aVar.a)) != this.e0.equals(aVar2.a)) {
                return equals ? -1 : 1;
            }
            if (this.q && (d = d(f.match)) != d(f2.match)) {
                return d ? -1 : 1;
            }
            boolean b = b(aVar.a);
            if (b != b(aVar2.a)) {
                return b ? -1 : 1;
            }
            boolean c = c(f);
            if (c != c(f2)) {
                return c ? -1 : 1;
            }
            Object obj = this.c0.get(aVar.a.flattenToString());
            Object obj2 = this.c0.get(aVar2.a.flattenToString());
            int intValue = (obj2 instanceof Number ? ((Number) obj2).intValue() : 0) - (obj instanceof Number ? ((Number) obj).intValue() : 0);
            if (intValue != 0) {
                return intValue;
            }
            return 0;
        }

        final boolean b(ComponentName componentName) {
            return "com.voxdon.xplorer".equals(componentName.getPackageName());
        }

        final boolean c(ResolveInfo resolveInfo) {
            if (resolveInfo == null || resolveInfo.filter == null) {
                return false;
            }
            for (int i = 0; i < resolveInfo.filter.countDataTypes(); i++) {
                String dataType = resolveInfo.filter.getDataType(i);
                if (dataType != null && dataType.equals(this.d0)) {
                    return true;
                }
            }
            return false;
        }

        final boolean d(int i) {
            int i2 = i & 268369920;
            return i2 >= 3145728 && i2 <= 5242880;
        }
    }

    public h(Context context) {
        this.b = context.getApplicationContext();
        this.a = context.getPackageManager();
        this.c = ((ActivityManager) context.getSystemService("activity")).getLauncherLargeIconDensity();
    }

    static Drawable b(Resources resources, int i2, int i3) {
        if (resources == null) {
            return null;
        }
        try {
            return i3 == 0 ? resources.getDrawable(i2) : resources.getDrawableForDensity(i2, i3);
        } catch (Resources.NotFoundException unused) {
            return null;
        } catch (IndexOutOfBoundsException e) {
            ax.Ha.c.h().f().d("App Launcher Icon Load Error").l(e).h();
            return null;
        }
    }

    private List<ResolveInfo> d() {
        if (this.d == null) {
            ResolveInfo resolveActivity = this.a.resolveActivity(new Intent(this.b, (Class<?>) ImageViewer.class), 0);
            if (resolveActivity == null) {
                C3184b.f();
                return null;
            }
            this.d = Collections.singletonList(resolveActivity);
        }
        return this.d;
    }

    private List<ResolveInfo> e() {
        if (this.e == null) {
            ResolveInfo resolveActivity = this.a.resolveActivity(new Intent(this.b, (Class<?>) MusicPlayer.class), 0);
            if (resolveActivity == null) {
                C3184b.f();
                return null;
            }
            this.e = Collections.singletonList(resolveActivity);
        }
        return this.e;
    }

    public static boolean g(a aVar) {
        return !aVar.e && C1832u.P(aVar.d(0).getData());
    }

    private static void h(Context context) {
        h = new HashSet<>();
        HashSet<String> hashSet = new HashSet<>();
        i = hashSet;
        hashSet.add("com.google.android.apps.pdfviewer");
        i.add("com.google.android.apps.docs");
        HashSet<String> hashSet2 = new HashSet<>();
        j = hashSet2;
        hashSet2.add("com.foxdebug.acodefree");
        j.add("com.foxdebug.acode");
        HashSet<ComponentName> hashSet3 = new HashSet<>();
        k = hashSet3;
        hashSet3.add(new ComponentName(context.getPackageName(), "com.voxdon.xplorer.activity.LaunchActivity"));
    }

    public static boolean i(Context context, ComponentName componentName) {
        if (k == null) {
            h(context);
        }
        return k.contains(componentName);
    }

    public static boolean j(Context context, ComponentName componentName) {
        if (h == null) {
            h(context);
        }
        return h.contains(componentName.getPackageName());
    }

    public static boolean k(Context context, ComponentName componentName) {
        if (i == null) {
            h(context);
        }
        return i.contains(componentName.getPackageName());
    }

    public static boolean l(Context context, ComponentName componentName) {
        if (j == null) {
            h(context);
        }
        return j.contains(componentName.getPackageName());
    }

    private static boolean m(ResolveInfo resolveInfo, a aVar) {
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        return activityInfo.packageName.equals(aVar.a.getPackageName()) && activityInfo.name.equals(aVar.a.getClassName());
    }

    public static Drawable n(PackageManager packageManager, ResolveInfo resolveInfo, int i2) {
        ApplicationInfo applicationInfo;
        String str;
        ActivityInfo activityInfo;
        Drawable b2;
        try {
            str = resolveInfo.resolvePackageName;
        } catch (PackageManager.NameNotFoundException unused) {
            g.severe("Couldn't find resources for package");
        }
        if (str != null && resolveInfo.icon != 0 && (b2 = b(packageManager.getResourcesForApplication(str), resolveInfo.icon, i2)) != null) {
            return b2;
        }
        int iconResource = resolveInfo.getIconResource();
        if (iconResource != 0 && (activityInfo = resolveInfo.activityInfo) != null) {
            Drawable b3 = b(packageManager.getResourcesForApplication(activityInfo.packageName), iconResource, i2);
            if (b3 != null) {
                return b3;
            }
        }
        ActivityInfo activityInfo2 = resolveInfo.activityInfo;
        if (activityInfo2 == null || (applicationInfo = activityInfo2.applicationInfo) == null) {
            return null;
        }
        return applicationInfo.loadIcon(packageManager);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        r7 = r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.List<ax.Z2.h.a> r12, android.content.Intent r13, java.util.List<android.content.pm.ResolveInfo> r14) {
        /*
            r11 = this;
            int r0 = r14.size()
            int r1 = r12.size()
            r2 = 0
            r3 = 0
        La:
            if (r3 >= r0) goto L67
            java.lang.Object r4 = r14.get(r3)
            r8 = r4
            android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8
            r4 = 0
        L14:
            if (r4 >= r1) goto L2a
            java.lang.Object r5 = r12.get(r4)
            ax.Z2.h$a r5 = (ax.Z2.h.a) r5
            boolean r6 = m(r8, r5)
            if (r6 == 0) goto L27
            r5.b(r13, r8)
        L25:
            r7 = r13
            goto L63
        L27:
            int r4 = r4 + 1
            goto L14
        L2a:
            android.content.ComponentName r6 = new android.content.ComponentName
            android.content.pm.ActivityInfo r4 = r8.activityInfo
            java.lang.String r5 = r4.packageName
            java.lang.String r4 = r4.name
            r6.<init>(r5, r4)
            android.content.Context r4 = r11.b
            boolean r4 = i(r4, r6)
            if (r4 == 0) goto L3e
            goto L25
        L3e:
            android.net.Uri r4 = r13.getData()
            if (r4 == 0) goto L57
            android.net.Uri r4 = r13.getData()
            java.lang.String r4 = r4.getScheme()
            java.lang.String r5 = "http"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L57
            r4 = 1
            r9 = 1
            goto L58
        L57:
            r9 = 0
        L58:
            ax.Z2.h$a r5 = new ax.Z2.h$a
            boolean r10 = r11.f
            r7 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r12.add(r5)
        L63:
            int r3 = r3 + 1
            r13 = r7
            goto La
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Z2.h.a(java.util.List, android.content.Intent, java.util.List):void");
    }

    public Drawable c(ResolveInfo resolveInfo) {
        return n(this.a, resolveInfo, this.c);
    }

    public List<a> f(boolean z, boolean z2, List<Intent> list, boolean z3, boolean z4) {
        List<ResolveInfo> e;
        List<ResolveInfo> d;
        IntentFilter intentFilter;
        Iterator<String> categoriesIterator;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            Intent intent = list.get(i2);
            List<ResolveInfo> queryIntentActivities = this.a.queryIntentActivities(intent, (z ? 64 : 0) | (z2 ? 128 : 0) | (Q.z1() ? 131072 : 65536));
            for (int size2 = queryIntentActivities.size() - 1; size2 >= 0; size2--) {
                ResolveInfo resolveInfo = queryIntentActivities.get(size2);
                if (Q.z1() && (intentFilter = resolveInfo.filter) != null && (categoriesIterator = intentFilter.categoriesIterator()) != null) {
                    boolean z5 = false;
                    while (categoriesIterator.hasNext()) {
                        if ("android.intent.category.DEFAULT".equals(categoriesIterator.next())) {
                            z5 = true;
                        }
                    }
                    if (!z5) {
                        queryIntentActivities.remove(size2);
                    }
                }
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null && !activityInfo.exported) {
                    queryIntentActivities.remove(size2);
                }
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (z3 && (d = d()) != null) {
                a(arrayList, intent, d);
            }
            if (z4 && (e = e()) != null) {
                a(arrayList, intent, e);
            }
            a(arrayList, intent, queryIntentActivities);
        }
        return arrayList;
    }

    public void o(Context context, Uri uri, String str, String str2, List<a> list) {
        try {
            Collections.sort(list, new b(context, uri, str, str2));
        } catch (IllegalArgumentException e) {
            ax.Ha.c.h().d("IntentResolver Comparator").l(e).h();
        }
    }

    public void p(boolean z) {
        this.f = z;
    }
}
