/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import ax.Q2.f;
import ax.U2.d;
import ax.X2.Q;
import ax.Z2.c;
import ax.c3.B;
import ax.c3.K;
import ax.c3.d0;
import ax.c3.u;
import ax.c3.v;
import ax.c3.z;
import ax.s3.a;
import ax.t3.h;
import ax.u3.b;
import ax.u3.i;
import com.voxdon.xplorer.file.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class A {
    private static final String[] a;
    private static final Set<String> b;
    private static final Map<z, List<String>> c;
    private static final Map<String, z> d;
    private static final Map<z, Integer> e;
    private static final Map<z, Integer> f;
    private static final ArrayList<z> g;
    private static final ArrayList<z> h;
    private static final ArrayList<String> i;
    private static final Map<z, f> j;
    private static final Map<f, z> k;
    private static final Map<String, Drawable> l;
    private static final Map<String, Integer> m;
    private static final Map<String, Integer> n;
    private static final Set<String> o;
    private static final Set<String> p;
    private static final Set<String> q;

    static {
        Object object = new String[]{"ssa", "ass", "srt", "vtt"};
        a = object;
        Object object2 = new HashSet<String>();
        b = object2;
        HashMap<z, List<String>> object32 = new HashMap<z, List<String>>();
        c = object32;
        d = new HashMap<String, z>();
        e = new HashMap<z, Integer>();
        f = new HashMap<z, Integer>();
        Map<z, Object> map = new ArrayList<Object>();
        g = map;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        h = arrayList;
        i = new ArrayList();
        j = new HashMap<z, f>();
        k = new HashMap<f, z>();
        l = new HashMap<String, Drawable>();
        m = new HashMap<String, Integer>();
        n = new HashMap<String, Integer>();
        Object object3 = new HashSet<String>();
        o = object3;
        Object object4 = new HashSet<String>();
        p = object4;
        q = new HashSet<String>();
        object2.addAll(Arrays.asList(object));
        object = z.c0;
        object32.put((z)((Object)object), Arrays.asList("aac", "flac", "m4a", "mp3", "mpga", "ogg", "oga", "wav", "m4p", "mka", "wma", "opus", "amr", "awb", "mp4a", "3ga", "mid", "midi", "xmf", "rtttl", "mxmf", "imy", "ota"));
        object2 = z.d0;
        object32.put((z)((Object)object2), Arrays.asList("dsd", "dsf", "aif", "aiff", "ac3"));
        Object object5 = z.e0;
        object32.put((z)((Object)object5), Arrays.asList("3gp", "3gpp", "3g2", "3gpp2", "mp4", "m4v", "mkv", "mk3d", "ts", "avi", "asf", "wmv", "ogv", "mov", "flv", "divx", "mpg", "mpeg", "vob", "mpeg4", "webm", "mts", "m2ts", "rm", "rmvb"));
        Object object6 = new ArrayList<String>(Arrays.asList("bmp", "wbmp", "ico", "gif", "jpeg", "jpg", "jpe", "jfif", "png", "svg", "webp"));
        Object object7 = new ArrayList<String>(Arrays.asList("tiff", "tif", "orf"));
        Object object8 = new ArrayList<String>(Arrays.asList("dng", "cr2", "nef", "nrw", "rw2", "raf", "pef", "srw", "orf", "arw"));
        Object object9 = new ArrayList<String>(Arrays.asList("dng", "cr2", "nef", "nrw", "rw2", "raf", "pef", "srw"));
        Object object10 = new ArrayList<String>(Arrays.asList("arw"));
        if (Q.W0()) {
            object6.add("heif");
            object6.add("heic");
        } else {
            object7.add("heif");
            object7.add("heic");
        }
        if (Q.x0()) {
            object6.add("avif");
        } else {
            object7.add("avif");
        }
        if (Q.v1()) {
            object6.addAll(object9);
        } else {
            object7.addAll(object9);
        }
        if (Q.w0()) {
            object6.addAll(object10);
        } else {
            object7.addAll(object10);
        }
        object10 = z.f0;
        object32.put((z)((Object)object10), (List<String>)object6);
        object9 = z.g0;
        object32.put((z)((Object)object9), (List<String>)object7);
        object3.addAll(object6);
        object4.addAll(object8);
        z z8 = z.o0;
        object32.put(z8, Arrays.asList("gslides", "odp", "show"));
        z z9 = z.p0;
        object32.put(z9, Arrays.asList("gsheet", "ods"));
        object4 = z.h0;
        object32.put((z)((Object)object4), Arrays.asList("htm", "html", "rtf", "rtx", "txt", "gdoc", "odt", "hwp", "hwpx", "djview", "djvu", "md", "fountain"));
        z z10 = z.q0;
        object32.put(z10, Arrays.asList("epub", "fb2", "mobi", "azw", "azw3"));
        object8 = z.i0;
        object32.put((z)((Object)object8), Arrays.asList("log", "conf", "cfg", "ini", "csv", "yaml", "xml", "prop", "css", "java", "c", "cs", "php", "py", "json", "lua", "js", "srt", "vtt", "ssa", "ass", "tja", "ovpn"));
        object6 = z.j0;
        object32.put((z)((Object)object6), Arrays.asList("sdocx"));
        z z11 = z.k0;
        object32.put(z11, Arrays.asList("dot", "doc", "docx", "dotx"));
        z z12 = z.l0;
        object32.put(z12, Arrays.asList("xls", "xlt", "xlm", "xlsx", "xlsm", "xltx", "xltm", "xla", "xlc", "xlw"));
        z z13 = z.m0;
        object32.put(z13, Arrays.asList("ppt", "pot", "pps", "pptx", "pptm", "potx", "potm", "ppsx", "ppsm", "sldx", "sldm"));
        object7 = z.n0;
        object32.put((z)((Object)object7), Arrays.asList("pdf"));
        if (Q.H1()) {
            object32.put(z.s0, Arrays.asList("apk+", "apks", "apkm", "xapk", "apk"));
        } else {
            object32.put(z.s0, Arrays.asList("apk"));
        }
        z z14 = z.t0;
        object32.put(z14, Arrays.asList("url"));
        object3 = z.r0;
        object32.put((z)((Object)object3), Arrays.asList("zip", "rar", "7z", "gz", "tgz", "bz2", "tar", "xz", "txz"));
        A.V((z)((Object)object));
        A.V(object2);
        A.V((z)((Object)object5));
        A.V(object10);
        A.V(object9);
        A.V(z8);
        A.V(z9);
        A.V(object4);
        A.V(object8);
        A.V(object6);
        A.V(object7);
        A.V(z10);
        A.V(z11);
        A.V(z12);
        A.V(z13);
        A.V(z.s0);
        A.V(z14);
        A.V(object3);
        ((ArrayList)((Object)map)).add(object10);
        ((ArrayList)((Object)map)).add(object);
        ((ArrayList)((Object)map)).add(object5);
        arrayList.add(object4);
        arrayList.add(object6);
        arrayList.add(object7);
        arrayList.add((Object)z10);
        arrayList.add((Object)z11);
        arrayList.add((Object)z12);
        arrayList.add((Object)z13);
        arrayList.add((Object)z8);
        arrayList.add((Object)z9);
        ArrayList arrayList2 = new ArrayList();
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            map = arrayList.get(i8);
            map = (z)((Object)map);
            arrayList2.addAll(c.get(map));
        }
        map = c;
        z z15 = z.v0;
        map.put(z15, arrayList2);
        object5 = e;
        z z16 = z.c0;
        object5.put(z16, 2131231292);
        map = f;
        map.put(z16, 2131231289);
        object = z.d0;
        object5.put(object, 2131231291);
        map.put((z)((Object)object), 2131231290);
        object2 = z.e0;
        object5.put(object2, 2131231306);
        map.put((z)((Object)object2), 2131231305);
        object = z.f0;
        object5.put(object, 2131231286);
        map.put((z)((Object)object), 2131231283);
        object10 = z.g0;
        object5.put(object10, 2131231285);
        map.put((z)((Object)object10), 2131231284);
        object10 = z.o0;
        object5.put(object10, 2131231302);
        map.put((z)((Object)object10), 2131231301);
        object10 = z.p0;
        object5.put(object10, 2131231304);
        map.put((z)((Object)object10), 2131231303);
        object10 = z.h0;
        object5.put(object10, 2131231268);
        map.put((z)((Object)object10), 2131231267);
        object10 = z.i0;
        object5.put(object10, 2131231298);
        map.put((z)((Object)object10), 2131231297);
        object10 = z.k0;
        object5.put(object10, 2131231308);
        map.put((z)((Object)object10), 2131231307);
        object10 = z.l0;
        object5.put(object10, 2131231272);
        map.put((z)((Object)object10), 2131231271);
        object10 = z.m0;
        object5.put(object10, 2131231300);
        map.put((z)((Object)object10), 2131231299);
        object10 = z.n0;
        object5.put(object10, 2131231296);
        map.put((z)((Object)object10), 2131231295);
        object10 = z.q0;
        object5.put(object10, 2131231270);
        map.put((z)((Object)object10), 2131231269);
        object10 = z.r0;
        object5.put(object10, 2131231266);
        map.put((z)((Object)object10), 2131231265);
        object9 = z.s0;
        object5.put(object9, 2131231264);
        map.put((z)((Object)object9), 2131231263);
        object9 = z.t0;
        object5.put(object9, 2131231288);
        map.put((z)((Object)object9), 2131231287);
        object9 = z.u0;
        object5.put(object9, 2131231357);
        map.put((z)((Object)object9), 2131231356);
        map = j;
        map.put(z16, (Integer)((Object)ax.Q2.f.A0));
        map.put((z)((Object)object2), (Object)ax.Q2.f.B0);
        map.put((z)((Object)object), (Object)ax.Q2.f.z0);
        map.put(z15, (Object)ax.Q2.f.C0);
        map.put((z)((Object)object10), (Object)ax.Q2.f.D0);
        for (z z17 : map.keySet()) {
            k.put(j.get((Object)z17), z17);
        }
        for (f f8 : ax.Q2.f.B()) {
            ax.u3.b.c(k.containsKey((Object)f8));
        }
        Map<String, Integer> map2 = m;
        map2.put("application/vnd.google-apps.document", 2131231274);
        Map<String, Integer> map3 = n;
        map3.put("application/vnd.google-apps.document", 2131231273);
        map2.put("application/vnd.google-apps.presentation", 2131231282);
        map3.put("application/vnd.google-apps.presentation", 2131231281);
        map2.put("application/vnd.google-apps.spreadsheet", 2131231280);
        map3.put("application/vnd.google-apps.spreadsheet", 2131231279);
        map2.put("application/vnd.google-apps.form", 2131231278);
        map3.put("application/vnd.google-apps.form", 2131231277);
        map2.put("application/vnd.google-apps.drawing", 2131231276);
        map3.put("application/vnd.google-apps.drawing", 2131231275);
        map2.put("application/vnd.google-apps.map", 2131231294);
        map3.put("application/vnd.google-apps.map", 2131231293);
        map2.put("application/vnd.google-apps.folder", 2131231320);
        map3.put("application/vnd.google-apps.folder", 2131231319);
        Set<String> set = q;
        set.addAll(Arrays.asList("zip", "jar"));
        set.addAll(Arrays.asList("xz", "gz", "tgz", "txz"));
        set.add("tar");
        set.add("7z");
    }

    public static boolean A(List<n> object) {
        if (object != null && object.size() != 0) {
            object = object.iterator();
            while (object.hasNext()) {
                if (A.z((n)object.next())) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean B(n n8, boolean bl) {
        if (n8.isDirectory()) {
            return false;
        }
        String string = n8.A();
        if (o.contains(string)) {
            return true;
        }
        if (bl && z.e0 == n8.G() && B.H(n8)) {
            if ("rm".equals(string)) {
                if (Q.f1()) {
                    return ax.u3.i.b("video/rm");
                }
                return false;
            }
            if ("rmvb".equals(string)) {
                if (Q.f1()) {
                    return ax.u3.i.b("video/rmvb");
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean C(n n8) {
        return A.x(n8.A());
    }

    public static boolean D(n n8) {
        return z.i0 == n8.G() || "txt".equals(n8.A());
        {
        }
    }

    public static boolean E(n n8) {
        return A.M(n8.s(), false);
    }

    public static boolean F(n n8) {
        return A.M(n8.s(), true);
    }

    public static boolean G(n n8) {
        return z.e0 == n8.G() || z.c0 == n8.G();
        {
        }
    }

    public static boolean H(z z8) {
        return z.v0 == z8;
    }

    public static boolean I(String string) {
        if (string == null) {
            return false;
        }
        return string.startsWith("image/");
    }

    public static boolean J(n object) {
        z z8 = ((n)object).G();
        return z.f0 == z8 || z.e0 == z8 || A.I((String)(object = object.s())) || A.U((String)object);
        {
        }
    }

    public static boolean K(n n8) {
        return n8.G() == z.s0;
    }

    public static boolean L(String object) {
        return g.contains(object = A.g(object));
    }

    public static boolean M(String string, boolean bl) {
        if (!("video/mp4".equals(string) || "video/3gpp".equals(string) || "video/webm".equals(string))) {
            if (bl) {
                return "video/x-matroska".equals(string);
            }
            return false;
        }
        return true;
    }

    public static boolean N(String string) {
        if (string == null) {
            return false;
        }
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 1872259501: {
                if (!string.equals("application/vnd.ms-wpl")) break;
                n8 = 5;
                break;
            }
            case 264230524: {
                if (!string.equals("audio/x-mpegurl")) break;
                n8 = 4;
                break;
            }
            case -432766831: {
                if (!string.equals("audio/mpegurl")) break;
                n8 = 3;
                break;
            }
            case -622808459: {
                if (!string.equals("application/vnd.apple.mpegurl")) break;
                n8 = 2;
                break;
            }
            case -979095690: {
                if (!string.equals("application/x-mpegurl")) break;
                n8 = 1;
                break;
            }
            case -1165508903: {
                if (!string.equals("audio/x-scpls")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return false;
            }
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
        }
        return true;
    }

    public static boolean O(String string) {
        if (string == null) {
            return false;
        }
        return p.contains(string);
    }

    public static boolean P(String string) {
        if (string == null) {
            return false;
        }
        return A.r(string) || A.U(string) || A.I(string) || A.v(string) || A.N(string);
        {
        }
    }

    public static boolean Q(n n8) {
        if (n8.G() != z.s0) {
            return false;
        }
        return ax.U2.d.U(n8.A());
    }

    public static boolean R(String string) {
        return b.contains(string);
    }

    public static boolean S(String string) {
        return "svg".equalsIgnoreCase(string);
    }

    public static boolean T(String string) {
        if (string == null) {
            return false;
        }
        return string.startsWith("text/");
    }

    public static boolean U(String string) {
        if (string == null) {
            return false;
        }
        return string.startsWith("video/");
    }

    private static void V(z z8) {
        for (String string : c.get((Object)z8)) {
            d.put(string, z8);
        }
    }

    public static boolean a(z z8) {
        return g.contains((Object)z8) || h.contains((Object)z8);
        {
        }
    }

    public static boolean b(String string) {
        return A.a(A.g(d0.f(string)));
    }

    public static ArrayList<n> c(List<n> object) {
        ArrayList<n> arrayList = new ArrayList<n>();
        object = object.iterator();
        while (object.hasNext()) {
            n n8 = (n)object.next();
            if (!A.C(n8)) continue;
            arrayList.add(n8);
        }
        return arrayList;
    }

    public static List<String> d(z z8) {
        Map<z, List<String>> map = c;
        if (map.containsKey((Object)z8)) {
            return map.get((Object)z8);
        }
        return i;
    }

    public static Drawable e(Context context, String string, boolean bl) {
        Map<String, Integer> map = bl ? n : m;
        if (map.containsKey(string)) {
            return ax.s3.a.c(context, map.get(string));
        }
        return null;
    }

    public static Drawable f(Context context, String map, boolean bl) {
        int n8;
        String string = d0.f((String)((Object)map));
        z z8 = A.g(string);
        map = bl ? f : e;
        z z9 = z.u0;
        if (z9 == z8) {
            if ((string = A.m(context, string)) != null) {
                return string;
            }
            n8 = map.get((Object)z8);
        } else if (map.containsKey((Object)z8)) {
            n8 = map.get((Object)z8);
        } else {
            z8 = A.m(context, string);
            if (z8 != null) {
                return z8;
            }
            n8 = map.get((Object)z9);
        }
        return ax.s3.a.c(context, n8);
    }

    @SuppressLint(value={"DefaultLocale"})
    public static z g(String string) {
        Map<String, z> map = d;
        if (map.containsKey(string = string != null ? string.toLowerCase() : null)) {
            return map.get(string);
        }
        return null;
    }

    public static z h(f f8) {
        return k.get((Object)f8);
    }

    public static z i(z z8) {
        if (h.contains((Object)z8)) {
            return z.v0;
        }
        return null;
    }

    public static List<z> j(z z8) {
        if (z.v0 == z8) {
            return h;
        }
        return null;
    }

    public static int k(String map, boolean bl) {
        z z8;
        map = bl ? f : e;
        if (map.containsKey((Object)(z8 = A.g(d0.f((String)((Object)map)))))) {
            return map.get((Object)z8);
        }
        if (bl) {
            return 2131231356;
        }
        return 2131231357;
    }

    public static f l(z z8) {
        z z9 = A.i(z8);
        if (z9 != null) {
            z8 = z9;
        }
        return j.get((Object)z8);
    }

    public static Drawable m(Context object, String object2) {
        boolean bl = TextUtils.isEmpty((CharSequence)object2);
        Iterator iterator = null;
        Object var7_7 = null;
        Object object3 = null;
        if (bl) {
            return null;
        }
        String string = v.f((String)object2);
        if (string == null) {
            return null;
        }
        Object object4 = l;
        if (object4.containsKey(string)) {
            return object4.get(string);
        }
        object2 = d0.T((String)object2);
        PackageManager packageManager = object.getPackageManager();
        Object object5 = new Intent("android.intent.action.VIEW");
        object4 = new StringBuilder();
        ((StringBuilder)object4).append(K.e.e());
        ((StringBuilder)object4).append("/nofile.");
        ((StringBuilder)object4).append((String)object2);
        object5.setDataAndType(u.r((Context)object, new File(((StringBuilder)object4).toString())), string);
        String string2 = ax.t3.h.d(string, (String)object2);
        object2 = ax.t3.h.g((Context)object, string2);
        if (object2 != null) {
            Iterator iterator2 = object2.iterator();
            object2 = null;
            while (true) {
                object4 = object2;
                if (iterator2.hasNext()) {
                    object4 = (c)iterator2.next();
                    if (!B.K(((c)object4).b) && !B.E(((c)object4).b)) continue;
                    object2 = ((c)object4).e;
                    continue;
                }
                break;
            }
        } else {
            object4 = null;
        }
        object2 = object4;
        if (object4 == null) {
            object2 = ax.t3.h.e((Context)object, string2, string, "file");
        }
        object4 = object2;
        if (object2 == null) {
            object4 = ax.t3.h.e((Context)object, string2, string, "content");
        }
        if ((object5 = packageManager.queryIntentActivities((Intent)object5, 65600)) != null) {
            object = object5.iterator();
            while (object.hasNext()) {
                object2 = (ResolveInfo)object.next();
                if (object2 == null || (object2 = ((ResolveInfo)object2).activityInfo) == null || !"com.voxdon.xplorer".equals(((ActivityInfo)object2).packageName)) continue;
                object.remove();
            }
        }
        object2 = var7_7;
        if (object5 != null) {
            object2 = var7_7;
            if (object5.size() > 0) {
                int n8;
                object2 = iterator;
                if (object4 != null) {
                    iterator = object5.iterator();
                    object = object3;
                    while (true) {
                        object2 = object3 = object;
                        if (!iterator.hasNext()) break;
                        object2 = (ResolveInfo)iterator.next();
                        object = object3;
                        if (((ResolveInfo)object2).activityInfo == null) continue;
                        object = object3;
                        if (!object4.getPackageName().equals(((ResolveInfo)object2).activityInfo.packageName)) continue;
                        object = object3;
                        if (!object4.getClassName().equals(((ResolveInfo)object2).activityInfo.name)) continue;
                        try {
                            object = object2.loadIcon(packageManager);
                        }
                        catch (NullPointerException | SecurityException runtimeException) {
                            object = object3;
                        }
                    }
                }
                object = object2;
                if (object2 == null) {
                    object4 = object5.iterator();
                    do {
                        object = object2;
                        if (!object4.hasNext()) break;
                        object3 = (ResolveInfo)object4.next();
                        object = object2;
                        if (((ResolveInfo)object3).filter != null) {
                            n8 = 0;
                            while (true) {
                                object = object2;
                                if (n8 >= ((ResolveInfo)object3).filter.countDataTypes()) break;
                                if (string.equals(((ResolveInfo)object3).filter.getDataType(n8))) {
                                    try {
                                        object = object3.loadIcon(packageManager);
                                    }
                                    catch (NullPointerException | SecurityException runtimeException) {
                                        object = object2;
                                    }
                                    break;
                                }
                                ++n8;
                            }
                        }
                        object2 = object;
                    } while (object == null);
                }
                object2 = object;
                if (object == null) {
                    object4 = object5.iterator();
                    block11: while (true) {
                        object2 = object;
                        if (!object4.hasNext()) break;
                        object2 = (ResolveInfo)object4.next();
                        object3 = ((ResolveInfo)object2).filter;
                        if (object3 != null && object3.countDataTypes() > 0) {
                            for (n8 = 0; n8 < ((ResolveInfo)object2).filter.countDataTypes(); ++n8) {
                                object3 = ((ResolveInfo)object2).filter.getDataType(n8);
                                if ("*".equals(object3) || "application".equals(object3)) continue block11;
                            }
                        }
                        try {
                            object2 = object2.loadIcon(packageManager);
                        }
                        catch (NullPointerException | SecurityException runtimeException) {
                            object2 = object;
                        }
                        object = object2;
                        if (object2 != null) break;
                    }
                }
            }
        }
        l.put(string, (Drawable)object2);
        return object2;
    }

    public static String n(String string) {
        string = string.toLowerCase();
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 117110: {
                if (!string.equals("vtt")) break;
                n8 = 3;
                break;
            }
            case 114177: {
                if (!string.equals("ssa")) break;
                n8 = 2;
                break;
            }
            case 114165: {
                if (!string.equals("srt")) break;
                n8 = 1;
                break;
            }
            case 96897: {
                if (!string.equals("ass")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return "";
            }
            case 3: {
                return "text/vtt";
            }
            case 1: {
                return "application/x-subrip";
            }
            case 0: 
            case 2: 
        }
        return "text/x-ssa";
    }

    public static String[] o() {
        return a;
    }

    public static boolean p(n object) {
        return "xz".equals(object = ((n)object).A()) || "gz".equals(object) || "tar".equals(object) || "tgz".equals(object) || "txz".equals(object) || "7z".equals(object);
        {
        }
    }

    public static boolean q(n n8) {
        return z.c0 == n8.G();
    }

    public static boolean r(String string) {
        if (string == null) {
            return false;
        }
        return string.startsWith("audio/");
    }

    public static boolean s(n n8) {
        return A.z(n8);
    }

    public static boolean t(List<n> list) {
        return A.A(list);
    }

    public static boolean u(n n8) {
        return h.contains((Object)n8.G());
    }

    public static boolean v(String string) {
        if (string == null) {
            return false;
        }
        return string.equals("application/x-android-drm-fl");
    }

    public static boolean w(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return false;
        }
        return o.contains(string.toLowerCase(Locale.ROOT));
    }

    public static boolean x(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return false;
        }
        z z8 = A.g(string = string.toLowerCase());
        if (z.c0 != z8) {
            return false;
        }
        if (!Q.f1()) {
            return true;
        }
        if ("opus".equals(string)) {
            return ax.u3.i.b("audio/opus") || Q.q1();
            {
            }
        }
        if ("wma".equals(string)) {
            return ax.u3.i.b("audio/x-ms-wma");
        }
        return true;
    }

    public static boolean y(String string, z z8) {
        return A.d(z8).contains(string.toLowerCase());
    }

    public static boolean z(n object) {
        object = ((n)object).A();
        return q.contains(object);
    }
}

