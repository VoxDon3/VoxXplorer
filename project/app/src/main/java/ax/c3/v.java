/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import ax.Ha.b;
import ax.Ha.c;
import ax.c3.d0;
import com.alphainventor.filemanager.file.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class v {
    private static final Logger a = Logger.getLogger("FileManager.FileMimeType");
    private static HashMap<String, String> b = new HashMap();
    private static HashMap<String, String> c = new HashMap();

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
        v.a();
    }

    private static void a() {
        for (String string : b.keySet()) {
            c.put(b.get(string), string);
        }
    }

    public static String b(List<n> object) {
        Iterator<n> iterator = object.iterator();
        object = null;
        while (iterator.hasNext()) {
            CharSequence charSequence = iterator.next().s();
            if (TextUtils.isEmpty((CharSequence)charSequence)) {
                return "application/octet-stream";
            }
            if (object == null) {
                object = charSequence;
                continue;
            }
            if (((String)object).equals(charSequence)) continue;
            if (((String)(object = v.c((String)object))).equals(v.c((String)charSequence))) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)object);
                ((StringBuilder)charSequence).append("/*");
                object = ((StringBuilder)charSequence).toString();
                continue;
            }
            return "*/*";
        }
        if (object == null) {
            return "application/octet-stream";
        }
        return object;
    }

    private static String c(String string) {
        if (!string.contains("/")) {
            return string;
        }
        return string.substring(0, string.indexOf(47));
    }

    public static String d(String string) {
        if (string == null) {
            return null;
        }
        String string2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(string);
        if (string2 != null) {
            return string2;
        }
        if (string.startsWith("extension/")) {
            return string.substring(10);
        }
        return c.get(string);
    }

    public static String e(n object, String string) {
        if (object.isDirectory()) {
            return "application/x-directory";
        }
        if ((object = ((n)object).A()) != null && (object = v.f((String)object)) != null) {
            return object;
        }
        return string;
    }

    public static String f(String string) {
        String string2 = string.toLowerCase();
        Object object = b.get(string2);
        if (object != null) {
            return object;
        }
        try {
            string2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(string2);
            return string2;
        }
        catch (RuntimeException runtimeException) {
            object = ax.Ha.c.h().f().b("mime type error").l(runtimeException);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ext:");
            stringBuilder.append(string);
            ((b)object).g(stringBuilder.toString()).h();
            return null;
        }
    }

    public static String g(String string, String string2) {
        if ((string = v.f(string)) == null) {
            return string2;
        }
        return string;
    }

    public static String h(String string) {
        return v.f(d0.k(string));
    }

    public static boolean i(String string) {
        return "application/x-directory".equals(string);
    }

    public static boolean j(String string) {
        return TextUtils.isEmpty((CharSequence)string) || "application/octet-stream".equals(string);
        {
        }
    }
}

