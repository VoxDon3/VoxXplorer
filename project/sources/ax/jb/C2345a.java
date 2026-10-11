package ax.jb;

import ax.qb.C2897e;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;
import okhttp3.HttpUrl;

/* renamed from: ax.jb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2345a {
    private static Properties a = new Properties();
    private static C2897e b = C2897e.a();
    public static String c;

    static {
        c = "Cp850";
        try {
            String property = System.getProperty("jcifs.properties");
            FileInputStream fileInputStream = (property == null || property.length() <= 1) ? null : new FileInputStream(property);
            i(fileInputStream);
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        } catch (IOException e) {
            if (C2897e.c0 > 0) {
                e.printStackTrace(b);
            }
        }
        int d = d("jcifs.util.loglevel", -1);
        if (d != -1) {
            C2897e.c(d);
        }
        try {
            HttpUrl.FRAGMENT_ENCODE_SET.getBytes(c);
        } catch (UnsupportedEncodingException unused) {
            if (C2897e.c0 >= 2) {
                b.println("WARNING: The default OEM encoding " + c + " does not appear to be supported by this JRE. The default encoding will be US-ASCII.");
            }
            c = "US-ASCII";
        }
        if (C2897e.c0 >= 4) {
            try {
                a.store(b, "JCIFS PROPERTIES");
            } catch (IOException unused2) {
            }
        }
    }

    public static boolean a(String str, boolean z) {
        String g = g(str);
        return g != null ? g.toLowerCase().equals("true") : z;
    }

    public static InetAddress b(String str, InetAddress inetAddress) {
        String property = a.getProperty(str);
        if (property != null) {
            try {
                return InetAddress.getByName(property);
            } catch (UnknownHostException e) {
                if (C2897e.c0 > 0) {
                    b.println(property);
                    e.printStackTrace(b);
                }
            }
        }
        return inetAddress;
    }

    public static InetAddress[] c(String str, String str2, InetAddress[] inetAddressArr) {
        String g = g(str);
        if (g != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(g, str2);
            int countTokens = stringTokenizer.countTokens();
            InetAddress[] inetAddressArr2 = new InetAddress[countTokens];
            for (int i = 0; i < countTokens; i++) {
                String nextToken = stringTokenizer.nextToken();
                try {
                    inetAddressArr2[i] = InetAddress.getByName(nextToken);
                } catch (UnknownHostException e) {
                    if (C2897e.c0 > 0) {
                        b.println(nextToken);
                        e.printStackTrace(b);
                    }
                }
            }
            return inetAddressArr2;
        }
        return inetAddressArr;
    }

    public static int d(String str, int i) {
        String property = a.getProperty(str);
        if (property != null) {
            try {
                return Integer.parseInt(property);
            } catch (NumberFormatException e) {
                if (C2897e.c0 > 0) {
                    e.printStackTrace(b);
                }
            }
        }
        return i;
    }

    public static InetAddress e() {
        String property = a.getProperty("jcifs.smb.client.laddr");
        if (property == null) {
            return null;
        }
        try {
            return InetAddress.getByName(property);
        } catch (UnknownHostException e) {
            if (C2897e.c0 <= 0) {
                return null;
            }
            b.println("Ignoring jcifs.smb.client.laddr address: " + property);
            e.printStackTrace(b);
            return null;
        }
    }

    public static long f(String str, long j) {
        String property = a.getProperty(str);
        if (property != null) {
            try {
                return Long.parseLong(property);
            } catch (NumberFormatException e) {
                if (C2897e.c0 > 0) {
                    e.printStackTrace(b);
                }
            }
        }
        return j;
    }

    public static String g(String str) {
        return a.getProperty(str);
    }

    public static String h(String str, String str2) {
        return a.getProperty(str, str2);
    }

    public static void i(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            a.load(inputStream);
        }
        try {
            a.putAll((Map) System.getProperties().clone());
        } catch (SecurityException unused) {
            if (C2897e.c0 > 1) {
                b.println("SecurityException: jcifs will ignore System properties");
            }
        }
    }

    public static Object j(String str, String str2) {
        return a.setProperty(str, str2);
    }
}
