package ax.c3;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.voxdon.xplorer.file.AbstractC3595n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: ax.c3.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1833v {
    private static final Logger a = Logger.getLogger("FileManager.FileMimeType");
    private static HashMap<String, String> b = new HashMap<>();
    private static HashMap<String, String> c = new HashMap<>();

    static {
        b.put("mkv", "video/x-matroska");
        b.put("flv", "video/x-flv");
        b.put("m2ts", "video/MP2P");
        b.put("mts", "video/MP2P");
        b.put("webm", "video/webm");
        b.put("vob", "video/dvd");
        b.put("ogv", "video/ogg");
        b.put("opus", "audio/opus");
        b.put("m3u8", "audio/x-mpegurl");
        b.put("heic", "image/heic");
        b.put("heif", "image/heif");
        b.put("avif", "image/avif");
        b.put("jfif", "image/jpeg");
        b.put("dwg", "application/acad");
        b.put("dxf", "application/dxf");
        b.put("md", "text/markdown");
        b.put("fountain", "text/fountain");
        b.put("ini", "text/ini");
        b.put("json", "text/x-json");
        b.put("srt", "text/srt");
        b.put("csv", "text/csv");
        b.put("log", "text/x-log");
        b.put("gz", "application/x-gzip");
        b.put("xz", "application/x-xz");
        b.put("rmvb", "application/vnd.rn-realmedia-vbr");
        b.put("mht", "message/rfc822");
        b.put("mhtml", "message/rfc822");
        b.put("apk+", "application/x-splitapk");
        b.put("apks", "application/x-splitapk");
        b.put("apkm", "application/x-splitapk");
        b.put("xapk", "application/x-splitapk");
        b.put("url", "application/x-mswinurl");
        a();
    }

    private static void a() {
        for (String str : b.keySet()) {
            c.put(b.get(str), str);
        }
    }

    public static String b(List<AbstractC3595n> list) {
        Iterator<AbstractC3595n> it = list.iterator();
        String str = null;
        while (it.hasNext()) {
            String s = it.next().s();
            if (TextUtils.isEmpty(s)) {
                return "application/octet-stream";
            }
            if (str == null) {
                str = s;
            } else if (str.equals(s)) {
                continue;
            } else {
                String c2 = c(str);
                if (!c2.equals(c(s))) {
                    return "*/*";
                }
                str = c2 + "/*";
            }
        }
        return str == null ? "application/octet-stream" : str;
    }

    private static String c(String str) {
        return !str.contains("/") ? str : str.substring(0, str.indexOf(47));
    }

    public static String d(String str) {
        if (str == null) {
            return null;
        }
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        return extensionFromMimeType != null ? extensionFromMimeType : str.startsWith("extension/") ? str.substring(10) : c.get(str);
    }

    public static String e(AbstractC3595n abstractC3595n, String str) {
        String f;
        if (abstractC3595n.isDirectory()) {
            return "application/x-directory";
        }
        String A = abstractC3595n.A();
        return (A == null || (f = f(A)) == null) ? str : f;
    }

    public static String f(String str) {
        String lowerCase = str.toLowerCase();
        String str2 = b.get(lowerCase);
        if (str2 != null) {
            return str2;
        }
        try {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
        } catch (RuntimeException e) {
            ax.Ha.c.h().f().b("mime type error").l(e).g("ext:" + str).h();
            return null;
        }
    }

    public static String g(String str, String str2) {
        String f = f(str);
        return f == null ? str2 : f;
    }

    public static String h(String str) {
        return f(d0.k(str));
    }

    public static boolean i(String str) {
        return "application/x-directory".equals(str);
    }

    public static boolean j(String str) {
        return TextUtils.isEmpty(str) || "application/octet-stream".equals(str);
    }
}
