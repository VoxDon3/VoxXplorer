package ax.c3;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import ax.s3.C3045a;
import ax.u3.C3184b;
import ax.u3.C3191i;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.R;
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
import okhttp3.HttpUrl;

/* renamed from: ax.c3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1808A {
    private static final String[] a;
    private static final Set<String> b;
    private static final Map<EnumC1837z, List<String>> c;
    private static final Map<String, EnumC1837z> d;
    private static final Map<EnumC1837z, Integer> e;
    private static final Map<EnumC1837z, Integer> f;
    private static final ArrayList<EnumC1837z> g;
    private static final ArrayList<EnumC1837z> h;
    private static final ArrayList<String> i;
    private static final Map<EnumC1837z, ax.Q2.f> j;
    private static final Map<ax.Q2.f, EnumC1837z> k;
    private static final Map<String, Drawable> l;
    private static final Map<String, Integer> m;
    private static final Map<String, Integer> n;
    private static final Set<String> o;
    private static final Set<String> p;
    private static final Set<String> q;

    static {
        EnumC1837z enumC1837z;
        EnumC1837z enumC1837z2;
        EnumC1837z enumC1837z3;
        EnumC1837z enumC1837z4;
        EnumC1837z enumC1837z5;
        String[] strArr = {"ssa", "ass", "srt", "vtt"};
        a = strArr;
        HashSet hashSet = new HashSet();
        b = hashSet;
        HashMap hashMap = new HashMap();
        c = hashMap;
        d = new HashMap();
        e = new HashMap();
        f = new HashMap();
        ArrayList<EnumC1837z> arrayList = new ArrayList<>();
        g = arrayList;
        ArrayList<EnumC1837z> arrayList2 = new ArrayList<>();
        h = arrayList2;
        i = new ArrayList<>();
        j = new HashMap();
        k = new HashMap();
        l = new HashMap();
        m = new HashMap();
        n = new HashMap();
        HashSet hashSet2 = new HashSet();
        o = hashSet2;
        HashSet hashSet3 = new HashSet();
        p = hashSet3;
        q = new HashSet();
        hashSet.addAll(Arrays.asList(strArr));
        EnumC1837z enumC1837z6 = EnumC1837z.AUDIO;
        hashMap.put(enumC1837z6, Arrays.asList("aac", "flac", "m4a", "mp3", "mpga", "ogg", "oga", "wav", "m4p", "mka", "wma", "opus", "amr", "awb", "mp4a", "3ga", "mid", "midi", "xmf", "rtttl", "mxmf", "imy", "ota"));
        EnumC1837z enumC1837z7 = EnumC1837z.AUDIO_EXTRA;
        hashMap.put(enumC1837z7, Arrays.asList("dsd", "dsf", "aif", "aiff", "ac3"));
        EnumC1837z enumC1837z8 = EnumC1837z.VIDEO;
        hashMap.put(enumC1837z8, Arrays.asList("3gp", "3gpp", "3g2", "3gpp2", "mp4", "m4v", "mkv", "mk3d", "ts", "avi", "asf", "wmv", "ogv", "mov", "flv", "divx", "mpg", "mpeg", "vob", "mpeg4", "webm", "mts", "m2ts", "rm", "rmvb"));
        ArrayList arrayList3 = new ArrayList(Arrays.asList("bmp", "wbmp", "ico", "gif", "jpeg", "jpg", "jpe", "jfif", "png", "svg", "webp"));
        ArrayList arrayList4 = new ArrayList(Arrays.asList("tiff", "tif", "orf"));
        ArrayList arrayList5 = new ArrayList(Arrays.asList("dng", "cr2", "nef", "nrw", "rw2", "raf", "pef", "srw", "orf", "arw"));
        ArrayList arrayList6 = new ArrayList(Arrays.asList("dng", "cr2", "nef", "nrw", "rw2", "raf", "pef", "srw"));
        ArrayList arrayList7 = new ArrayList(Arrays.asList("arw"));
        if (ax.X2.Q.W0()) {
            arrayList3.add("heif");
            arrayList3.add("heic");
        } else {
            arrayList4.add("heif");
            arrayList4.add("heic");
        }
        if (ax.X2.Q.x0()) {
            arrayList3.add("avif");
        } else {
            arrayList4.add("avif");
        }
        if (ax.X2.Q.v1()) {
            arrayList3.addAll(arrayList6);
        } else {
            arrayList4.addAll(arrayList6);
        }
        if (ax.X2.Q.w0()) {
            arrayList3.addAll(arrayList7);
        } else {
            arrayList4.addAll(arrayList7);
        }
        EnumC1837z enumC1837z9 = EnumC1837z.IMAGE;
        hashMap.put(enumC1837z9, arrayList3);
        EnumC1837z enumC1837z10 = EnumC1837z.IMAGE_EXTRA;
        hashMap.put(enumC1837z10, arrayList4);
        hashSet2.addAll(arrayList3);
        hashSet3.addAll(arrayList5);
        EnumC1837z enumC1837z11 = EnumC1837z.PRESENTATION;
        hashMap.put(enumC1837z11, Arrays.asList("gslides", "odp", "show"));
        EnumC1837z enumC1837z12 = EnumC1837z.SPREADSHEET;
        hashMap.put(enumC1837z12, Arrays.asList("gsheet", "ods"));
        EnumC1837z enumC1837z13 = EnumC1837z.TEXT;
        hashMap.put(enumC1837z13, Arrays.asList("htm", "html", "rtf", "rtx", "txt", "gdoc", "odt", "hwp", "hwpx", "djview", "djvu", "md", "fountain"));
        EnumC1837z enumC1837z14 = EnumC1837z.EBOOK;
        hashMap.put(enumC1837z14, Arrays.asList("epub", "fb2", "mobi", "azw", "azw3"));
        EnumC1837z enumC1837z15 = EnumC1837z.PLAIN_TEXT;
        hashMap.put(enumC1837z15, Arrays.asList("log", "conf", "cfg", "ini", "csv", "yaml", "xml", "prop", "css", "java", "c", "cs", "php", "py", "json", "lua", "js", "srt", "vtt", "ssa", "ass", "tja", "ovpn"));
        EnumC1837z enumC1837z16 = EnumC1837z.APP_TEXT;
        hashMap.put(enumC1837z16, Arrays.asList("sdocx"));
        EnumC1837z enumC1837z17 = EnumC1837z.WORD;
        hashMap.put(enumC1837z17, Arrays.asList("dot", "doc", "docx", "dotx"));
        EnumC1837z enumC1837z18 = EnumC1837z.EXCEL;
        hashMap.put(enumC1837z18, Arrays.asList("xls", "xlt", "xlm", "xlsx", "xlsm", "xltx", "xltm", "xla", "xlc", "xlw"));
        EnumC1837z enumC1837z19 = EnumC1837z.PPT;
        hashMap.put(enumC1837z19, Arrays.asList("ppt", "pot", "pps", "pptx", "pptm", "potx", "potm", "ppsx", "ppsm", "sldx", "sldm"));
        EnumC1837z enumC1837z20 = EnumC1837z.PDF;
        hashMap.put(enumC1837z20, Arrays.asList("pdf"));
        if (ax.X2.Q.H1()) {
            enumC1837z3 = enumC1837z12;
            enumC1837z2 = enumC1837z11;
            enumC1837z4 = enumC1837z19;
            enumC1837z = enumC1837z18;
            enumC1837z5 = enumC1837z17;
            hashMap.put(EnumC1837z.APK, Arrays.asList("apk+", "apks", "apkm", "xapk", "apk"));
        } else {
            enumC1837z = enumC1837z18;
            enumC1837z2 = enumC1837z11;
            enumC1837z3 = enumC1837z12;
            enumC1837z4 = enumC1837z19;
            enumC1837z5 = enumC1837z17;
            hashMap.put(EnumC1837z.APK, Arrays.asList("apk"));
        }
        EnumC1837z enumC1837z21 = EnumC1837z.LINK;
        hashMap.put(enumC1837z21, Arrays.asList("url"));
        EnumC1837z enumC1837z22 = EnumC1837z.ARCHIVE;
        hashMap.put(enumC1837z22, Arrays.asList("zip", "rar", "7z", "gz", "tgz", "bz2", "tar", "xz", "txz"));
        V(enumC1837z6);
        V(enumC1837z7);
        V(enumC1837z8);
        V(enumC1837z9);
        V(enumC1837z10);
        V(enumC1837z2);
        V(enumC1837z3);
        V(enumC1837z13);
        V(enumC1837z15);
        V(enumC1837z16);
        V(enumC1837z20);
        V(enumC1837z14);
        V(enumC1837z5);
        V(enumC1837z);
        V(enumC1837z4);
        V(EnumC1837z.APK);
        V(enumC1837z21);
        V(enumC1837z22);
        arrayList.add(enumC1837z9);
        arrayList.add(enumC1837z6);
        arrayList.add(enumC1837z8);
        arrayList2.add(enumC1837z13);
        arrayList2.add(enumC1837z16);
        arrayList2.add(enumC1837z20);
        arrayList2.add(enumC1837z14);
        arrayList2.add(enumC1837z5);
        arrayList2.add(enumC1837z);
        arrayList2.add(enumC1837z4);
        arrayList2.add(enumC1837z2);
        arrayList2.add(enumC1837z3);
        ArrayList arrayList8 = new ArrayList();
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            EnumC1837z enumC1837z23 = arrayList2.get(i2);
            i2++;
            arrayList8.addAll(c.get(enumC1837z23));
        }
        Map<EnumC1837z, List<String>> map = c;
        EnumC1837z enumC1837z24 = EnumC1837z.GROUP_DOCUMENT;
        map.put(enumC1837z24, arrayList8);
        Map<EnumC1837z, Integer> map2 = e;
        EnumC1837z enumC1837z25 = EnumC1837z.AUDIO;
        map2.put(enumC1837z25, Integer.valueOf(R.drawable.icon_file_music_s));
        Map<EnumC1837z, Integer> map3 = f;
        map3.put(enumC1837z25, Integer.valueOf(R.drawable.icon_file_music));
        EnumC1837z enumC1837z26 = EnumC1837z.AUDIO_EXTRA;
        map2.put(enumC1837z26, Integer.valueOf(R.drawable.icon_file_music_extra_s));
        map3.put(enumC1837z26, Integer.valueOf(R.drawable.icon_file_music_extra));
        EnumC1837z enumC1837z27 = EnumC1837z.VIDEO;
        map2.put(enumC1837z27, Integer.valueOf(R.drawable.icon_file_video_s));
        map3.put(enumC1837z27, Integer.valueOf(R.drawable.icon_file_video));
        EnumC1837z enumC1837z28 = EnumC1837z.IMAGE;
        map2.put(enumC1837z28, Integer.valueOf(R.drawable.icon_file_image_s));
        map3.put(enumC1837z28, Integer.valueOf(R.drawable.icon_file_image));
        EnumC1837z enumC1837z29 = EnumC1837z.IMAGE_EXTRA;
        map2.put(enumC1837z29, Integer.valueOf(R.drawable.icon_file_image_extra_s));
        map3.put(enumC1837z29, Integer.valueOf(R.drawable.icon_file_image_extra));
        EnumC1837z enumC1837z30 = EnumC1837z.PRESENTATION;
        map2.put(enumC1837z30, Integer.valueOf(R.drawable.icon_file_presentation_s));
        map3.put(enumC1837z30, Integer.valueOf(R.drawable.icon_file_presentation));
        EnumC1837z enumC1837z31 = EnumC1837z.SPREADSHEET;
        map2.put(enumC1837z31, Integer.valueOf(R.drawable.icon_file_sheet_s));
        map3.put(enumC1837z31, Integer.valueOf(R.drawable.icon_file_sheet));
        EnumC1837z enumC1837z32 = EnumC1837z.TEXT;
        map2.put(enumC1837z32, Integer.valueOf(R.drawable.icon_file_document_s));
        map3.put(enumC1837z32, Integer.valueOf(R.drawable.icon_file_document));
        EnumC1837z enumC1837z33 = EnumC1837z.PLAIN_TEXT;
        map2.put(enumC1837z33, Integer.valueOf(R.drawable.icon_file_plaintext_s));
        map3.put(enumC1837z33, Integer.valueOf(R.drawable.icon_file_plaintext));
        EnumC1837z enumC1837z34 = EnumC1837z.WORD;
        map2.put(enumC1837z34, Integer.valueOf(R.drawable.icon_file_word_s));
        map3.put(enumC1837z34, Integer.valueOf(R.drawable.icon_file_word));
        EnumC1837z enumC1837z35 = EnumC1837z.EXCEL;
        map2.put(enumC1837z35, Integer.valueOf(R.drawable.icon_file_excel_s));
        map3.put(enumC1837z35, Integer.valueOf(R.drawable.icon_file_excel));
        EnumC1837z enumC1837z36 = EnumC1837z.PPT;
        map2.put(enumC1837z36, Integer.valueOf(R.drawable.icon_file_powerpoint_s));
        map3.put(enumC1837z36, Integer.valueOf(R.drawable.icon_file_powerpoint));
        EnumC1837z enumC1837z37 = EnumC1837z.PDF;
        map2.put(enumC1837z37, Integer.valueOf(R.drawable.icon_file_pdf_s));
        map3.put(enumC1837z37, Integer.valueOf(R.drawable.icon_file_pdf));
        EnumC1837z enumC1837z38 = EnumC1837z.EBOOK;
        map2.put(enumC1837z38, Integer.valueOf(R.drawable.icon_file_ebook_s));
        map3.put(enumC1837z38, Integer.valueOf(R.drawable.icon_file_ebook));
        EnumC1837z enumC1837z39 = EnumC1837z.ARCHIVE;
        map2.put(enumC1837z39, Integer.valueOf(R.drawable.icon_file_archive_s));
        map3.put(enumC1837z39, Integer.valueOf(R.drawable.icon_file_archive));
        EnumC1837z enumC1837z40 = EnumC1837z.APK;
        map2.put(enumC1837z40, Integer.valueOf(R.drawable.icon_file_apk_s));
        map3.put(enumC1837z40, Integer.valueOf(R.drawable.icon_file_apk));
        EnumC1837z enumC1837z41 = EnumC1837z.LINK;
        map2.put(enumC1837z41, Integer.valueOf(R.drawable.icon_file_link_s));
        map3.put(enumC1837z41, Integer.valueOf(R.drawable.icon_file_link));
        EnumC1837z enumC1837z42 = EnumC1837z.OTHERS;
        map2.put(enumC1837z42, Integer.valueOf(R.drawable.icon_unknown_s));
        map3.put(enumC1837z42, Integer.valueOf(R.drawable.icon_unknown));
        Map<EnumC1837z, ax.Q2.f> map4 = j;
        map4.put(enumC1837z25, ax.Q2.f.A0);
        map4.put(enumC1837z27, ax.Q2.f.B0);
        map4.put(enumC1837z28, ax.Q2.f.z0);
        map4.put(enumC1837z24, ax.Q2.f.C0);
        map4.put(enumC1837z39, ax.Q2.f.D0);
        for (EnumC1837z enumC1837z43 : map4.keySet()) {
            k.put(j.get(enumC1837z43), enumC1837z43);
        }
        Iterator<ax.Q2.f> it = ax.Q2.f.B().iterator();
        while (it.hasNext()) {
            C3184b.c(k.containsKey(it.next()));
        }
        Map<String, Integer> map5 = m;
        map5.put("application/vnd.google-apps.document", Integer.valueOf(R.drawable.icon_file_gdoc_s));
        Map<String, Integer> map6 = n;
        map6.put("application/vnd.google-apps.document", Integer.valueOf(R.drawable.icon_file_gdoc));
        map5.put("application/vnd.google-apps.presentation", Integer.valueOf(R.drawable.icon_file_gslides_s));
        map6.put("application/vnd.google-apps.presentation", Integer.valueOf(R.drawable.icon_file_gslides));
        map5.put("application/vnd.google-apps.spreadsheet", Integer.valueOf(R.drawable.icon_file_gsheet_s));
        map6.put("application/vnd.google-apps.spreadsheet", Integer.valueOf(R.drawable.icon_file_gsheet));
        map5.put("application/vnd.google-apps.form", Integer.valueOf(R.drawable.icon_file_gform_s));
        map6.put("application/vnd.google-apps.form", Integer.valueOf(R.drawable.icon_file_gform));
        map5.put("application/vnd.google-apps.drawing", Integer.valueOf(R.drawable.icon_file_gdraw_s));
        map6.put("application/vnd.google-apps.drawing", Integer.valueOf(R.drawable.icon_file_gdraw));
        map5.put("application/vnd.google-apps.map", Integer.valueOf(R.drawable.icon_file_mymap_s));
        map6.put("application/vnd.google-apps.map", Integer.valueOf(R.drawable.icon_file_mymap));
        map5.put("application/vnd.google-apps.folder", Integer.valueOf(R.drawable.icon_folder_full_s));
        map6.put("application/vnd.google-apps.folder", Integer.valueOf(R.drawable.icon_folder_full));
        Set<String> set = q;
        set.addAll(Arrays.asList("zip", "jar"));
        set.addAll(Arrays.asList("xz", "gz", "tgz", "txz"));
        set.add("tar");
        set.add("7z");
    }

    public static boolean A(List<AbstractC3595n> list) {
        if (list == null || list.size() == 0) {
            return false;
        }
        Iterator<AbstractC3595n> it = list.iterator();
        while (it.hasNext()) {
            if (!z(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean B(AbstractC3595n abstractC3595n, boolean z) {
        if (abstractC3595n.isDirectory()) {
            return false;
        }
        String A = abstractC3595n.A();
        if (o.contains(A)) {
            return true;
        }
        if (!z || EnumC1837z.VIDEO != abstractC3595n.G() || !C1809B.H(abstractC3595n)) {
            return false;
        }
        if ("rm".equals(A)) {
            if (ax.X2.Q.f1()) {
                return C3191i.b("video/rm");
            }
            return false;
        }
        if (!"rmvb".equals(A)) {
            return true;
        }
        if (ax.X2.Q.f1()) {
            return C3191i.b("video/rmvb");
        }
        return false;
    }

    public static boolean C(AbstractC3595n abstractC3595n) {
        return x(abstractC3595n.A());
    }

    public static boolean D(AbstractC3595n abstractC3595n) {
        return EnumC1837z.PLAIN_TEXT == abstractC3595n.G() || "txt".equals(abstractC3595n.A());
    }

    public static boolean E(AbstractC3595n abstractC3595n) {
        return M(abstractC3595n.s(), false);
    }

    public static boolean F(AbstractC3595n abstractC3595n) {
        return M(abstractC3595n.s(), true);
    }

    public static boolean G(AbstractC3595n abstractC3595n) {
        return EnumC1837z.VIDEO == abstractC3595n.G() || EnumC1837z.AUDIO == abstractC3595n.G();
    }

    public static boolean H(EnumC1837z enumC1837z) {
        return EnumC1837z.GROUP_DOCUMENT == enumC1837z;
    }

    public static boolean I(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("image/");
    }

    public static boolean J(AbstractC3595n abstractC3595n) {
        EnumC1837z G = abstractC3595n.G();
        if (EnumC1837z.IMAGE != G && EnumC1837z.VIDEO != G) {
            String s = abstractC3595n.s();
            if (!I(s) && !U(s)) {
                return false;
            }
        }
        return true;
    }

    public static boolean K(AbstractC3595n abstractC3595n) {
        return abstractC3595n.G() == EnumC1837z.APK;
    }

    public static boolean L(String str) {
        return g.contains(g(str));
    }

    public static boolean M(String str, boolean z) {
        if ("video/mp4".equals(str) || "video/3gpp".equals(str) || "video/webm".equals(str)) {
            return true;
        }
        if (z) {
            return "video/x-matroska".equals(str);
        }
        return false;
    }

    public static boolean N(String str) {
        if (str == null) {
            return false;
        }
        switch (str) {
        }
        return false;
    }

    public static boolean O(String str) {
        if (str == null) {
            return false;
        }
        return p.contains(str);
    }

    public static boolean P(String str) {
        if (str == null) {
            return false;
        }
        return r(str) || U(str) || I(str) || v(str) || N(str);
    }

    public static boolean Q(AbstractC3595n abstractC3595n) {
        if (abstractC3595n.G() != EnumC1837z.APK) {
            return false;
        }
        return ax.U2.d.U(abstractC3595n.A());
    }

    public static boolean R(String str) {
        return b.contains(str);
    }

    public static boolean S(String str) {
        return "svg".equalsIgnoreCase(str);
    }

    public static boolean T(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("text/");
    }

    public static boolean U(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/");
    }

    private static void V(EnumC1837z enumC1837z) {
        Iterator<String> it = c.get(enumC1837z).iterator();
        while (it.hasNext()) {
            d.put(it.next(), enumC1837z);
        }
    }

    public static boolean a(EnumC1837z enumC1837z) {
        return g.contains(enumC1837z) || h.contains(enumC1837z);
    }

    public static boolean b(String str) {
        return a(g(d0.f(str)));
    }

    public static ArrayList<AbstractC3595n> c(List<AbstractC3595n> list) {
        ArrayList<AbstractC3595n> arrayList = new ArrayList<>();
        for (AbstractC3595n abstractC3595n : list) {
            if (C(abstractC3595n)) {
                arrayList.add(abstractC3595n);
            }
        }
        return arrayList;
    }

    public static List<String> d(EnumC1837z enumC1837z) {
        Map<EnumC1837z, List<String>> map = c;
        return map.containsKey(enumC1837z) ? map.get(enumC1837z) : i;
    }

    public static Drawable e(Context context, String str, boolean z) {
        Map<String, Integer> map = z ? n : m;
        if (map.containsKey(str)) {
            return C3045a.c(context, map.get(str).intValue());
        }
        return null;
    }

    public static Drawable f(Context context, String str, boolean z) {
        int intValue;
        String f2 = d0.f(str);
        EnumC1837z g2 = g(f2);
        Map<EnumC1837z, Integer> map = z ? f : e;
        EnumC1837z enumC1837z = EnumC1837z.OTHERS;
        if (enumC1837z == g2) {
            Drawable m2 = m(context, f2);
            if (m2 != null) {
                return m2;
            }
            intValue = map.get(g2).intValue();
        } else if (map.containsKey(g2)) {
            intValue = map.get(g2).intValue();
        } else {
            Drawable m3 = m(context, f2);
            if (m3 != null) {
                return m3;
            }
            intValue = map.get(enumC1837z).intValue();
        }
        return C3045a.c(context, intValue);
    }

    @SuppressLint({"DefaultLocale"})
    public static EnumC1837z g(String str) {
        String lowerCase = str != null ? str.toLowerCase() : null;
        Map<String, EnumC1837z> map = d;
        if (map.containsKey(lowerCase)) {
            return map.get(lowerCase);
        }
        return null;
    }

    public static EnumC1837z h(ax.Q2.f fVar) {
        return k.get(fVar);
    }

    public static EnumC1837z i(EnumC1837z enumC1837z) {
        if (h.contains(enumC1837z)) {
            return EnumC1837z.GROUP_DOCUMENT;
        }
        return null;
    }

    public static List<EnumC1837z> j(EnumC1837z enumC1837z) {
        if (EnumC1837z.GROUP_DOCUMENT == enumC1837z) {
            return h;
        }
        return null;
    }

    public static int k(String str, boolean z) {
        EnumC1837z g2 = g(d0.f(str));
        Map<EnumC1837z, Integer> map = z ? f : e;
        return map.containsKey(g2) ? map.get(g2).intValue() : z ? R.drawable.icon_unknown : R.drawable.icon_unknown_s;
    }

    public static ax.Q2.f l(EnumC1837z enumC1837z) {
        EnumC1837z i2 = i(enumC1837z);
        if (i2 != null) {
            enumC1837z = i2;
        }
        return j.get(enumC1837z);
    }

    public static Drawable m(Context context, String str) {
        String f2;
        ComponentName componentName;
        int i2;
        ActivityInfo activityInfo;
        Drawable drawable = null;
        if (TextUtils.isEmpty(str) || (f2 = C1833v.f(str)) == null) {
            return null;
        }
        Map<String, Drawable> map = l;
        if (map.containsKey(f2)) {
            return map.get(f2);
        }
        String T = d0.T(str);
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(C1832u.r(context, new File(K.e.e() + "/nofile." + T)), f2);
        String d2 = ax.t3.h.d(f2, T);
        List<ax.Z2.c> g2 = ax.t3.h.g(context, d2);
        if (g2 != null) {
            componentName = null;
            for (ax.Z2.c cVar : g2) {
                if (C1809B.K(cVar.b) || C1809B.E(cVar.b)) {
                    componentName = cVar.e;
                }
            }
        } else {
            componentName = null;
        }
        if (componentName == null) {
            componentName = ax.t3.h.e(context, d2, f2, "file");
        }
        if (componentName == null) {
            componentName = ax.t3.h.e(context, d2, f2, "content");
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65600);
        if (queryIntentActivities != null) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (it.hasNext()) {
                ResolveInfo next = it.next();
                if (next != null && (activityInfo = next.activityInfo) != null && "com.voxdon.xplorer".equals(activityInfo.packageName)) {
                    it.remove();
                }
            }
        }
        if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
            if (componentName != null) {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    if (resolveInfo.activityInfo != null && componentName.getPackageName().equals(resolveInfo.activityInfo.packageName) && componentName.getClassName().equals(resolveInfo.activityInfo.name)) {
                        try {
                            drawable = resolveInfo.loadIcon(packageManager);
                        } catch (NullPointerException | SecurityException unused) {
                        }
                    }
                }
            }
            if (drawable == null) {
                for (ResolveInfo resolveInfo2 : queryIntentActivities) {
                    if (resolveInfo2.filter != null) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= resolveInfo2.filter.countDataTypes()) {
                                break;
                            }
                            if (f2.equals(resolveInfo2.filter.getDataType(i3))) {
                                try {
                                    drawable = resolveInfo2.loadIcon(packageManager);
                                    break;
                                } catch (NullPointerException | SecurityException unused2) {
                                }
                            } else {
                                i3++;
                            }
                        }
                    }
                    if (drawable != null) {
                        break;
                    }
                }
            }
            if (drawable == null) {
                for (ResolveInfo resolveInfo3 : queryIntentActivities) {
                    IntentFilter intentFilter = resolveInfo3.filter;
                    if (intentFilter != null && intentFilter.countDataTypes() > 0) {
                        while (true) {
                            if (i2 < resolveInfo3.filter.countDataTypes()) {
                                String dataType = resolveInfo3.filter.getDataType(i2);
                                i2 = ("*".equals(dataType) || "application".equals(dataType)) ? 0 : i2 + 1;
                            }
                        }
                    }
                    try {
                        drawable = resolveInfo3.loadIcon(packageManager);
                    } catch (NullPointerException | SecurityException unused3) {
                    }
                    if (drawable != null) {
                        break;
                    }
                }
            }
        }
        l.put(f2, drawable);
        return drawable;
    }

    public static String n(String str) {
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "ass":
            case "ssa":
                return "text/x-ssa";
            case "srt":
                return "application/x-subrip";
            case "vtt":
                return "text/vtt";
            default:
                return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    public static String[] o() {
        return a;
    }

    public static boolean p(AbstractC3595n abstractC3595n) {
        String A = abstractC3595n.A();
        return "xz".equals(A) || "gz".equals(A) || "tar".equals(A) || "tgz".equals(A) || "txz".equals(A) || "7z".equals(A);
    }

    public static boolean q(AbstractC3595n abstractC3595n) {
        return EnumC1837z.AUDIO == abstractC3595n.G();
    }

    public static boolean r(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("audio/");
    }

    public static boolean s(AbstractC3595n abstractC3595n) {
        return z(abstractC3595n);
    }

    public static boolean t(List<AbstractC3595n> list) {
        return A(list);
    }

    public static boolean u(AbstractC3595n abstractC3595n) {
        return h.contains(abstractC3595n.G());
    }

    public static boolean v(String str) {
        if (str == null) {
            return false;
        }
        return str.equals("application/x-android-drm-fl");
    }

    public static boolean w(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return o.contains(str.toLowerCase(Locale.ROOT));
    }

    public static boolean x(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (EnumC1837z.AUDIO != g(lowerCase)) {
            return false;
        }
        if (!ax.X2.Q.f1()) {
            return true;
        }
        if ("opus".equals(lowerCase)) {
            return C3191i.b("audio/opus") || ax.X2.Q.q1();
        }
        if ("wma".equals(lowerCase)) {
            return C3191i.b("audio/x-ms-wma");
        }
        return true;
    }

    public static boolean y(String str, EnumC1837z enumC1837z) {
        return d(enumC1837z).contains(str.toLowerCase());
    }

    public static boolean z(AbstractC3595n abstractC3595n) {
        return q.contains(abstractC3595n.A());
    }
}
