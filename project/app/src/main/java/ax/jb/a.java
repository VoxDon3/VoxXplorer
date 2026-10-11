/*
 * Decompiled with CFR 0.152.
 */
package ax.jb;

import ax.qb.e;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;

public class a {
    private static Properties a;
    private static e b;
    public static String c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n8;
        Object object;
        block9: {
            a = new Properties();
            c = "Cp850";
            b = e.a();
            try {
                object = System.getProperty("jcifs.properties");
                FileInputStream fileInputStream = object != null && ((String)object).length() > 1 ? new FileInputStream((String)object) : null;
                ax.jb.a.i(fileInputStream);
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            }
            catch (IOException iOException) {
                if (e.c0 <= 0) break block9;
                iOException.printStackTrace(b);
            }
        }
        if ((n8 = ax.jb.a.d("jcifs.util.loglevel", -1)) != -1) {
            e.c(n8);
        }
        try {
            "".getBytes(c);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            if (e.c0 >= 2) {
                object = b;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("WARNING: The default OEM encoding ");
                stringBuilder.append(c);
                stringBuilder.append(" does not appear to be supported by this JRE. The default encoding will be US-ASCII.");
                ((PrintStream)object).println(stringBuilder.toString());
            }
            c = "US-ASCII";
        }
        if (e.c0 < 4) return;
        try {
            a.store(b, "JCIFS PROPERTIES");
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public static boolean a(String string, boolean bl) {
        if ((string = ax.jb.a.g(string)) != null) {
            return string.toLowerCase().equals("true");
        }
        return bl;
    }

    public static InetAddress b(String string, InetAddress inetAddress) {
        block3: {
            if ((string = a.getProperty(string)) != null) {
                try {
                    InetAddress inetAddress2 = InetAddress.getByName(string);
                    return inetAddress2;
                }
                catch (UnknownHostException unknownHostException) {
                    if (e.c0 <= 0) break block3;
                    b.println(string);
                    unknownHostException.printStackTrace(b);
                }
            }
        }
        return inetAddress;
    }

    public static InetAddress[] c(String string, String object, InetAddress[] inetAddressArray) {
        block5: {
            if ((string = ax.jb.a.g(string)) != null) {
                object = new StringTokenizer(string, (String)object);
                int n8 = ((StringTokenizer)object).countTokens();
                InetAddress[] inetAddressArray2 = new InetAddress[n8];
                for (int i8 = 0; i8 < n8; ++i8) {
                    string = ((StringTokenizer)object).nextToken();
                    try {
                        inetAddressArray2[i8] = InetAddress.getByName(string);
                        continue;
                    }
                    catch (UnknownHostException unknownHostException) {
                        if (e.c0 > 0) {
                            b.println(string);
                            unknownHostException.printStackTrace(b);
                        }
                        break block5;
                    }
                }
                return inetAddressArray2;
            }
        }
        return inetAddressArray;
    }

    public static int d(String string, int n8) {
        block3: {
            if ((string = a.getProperty(string)) != null) {
                try {
                    int n9 = Integer.parseInt(string);
                    return n9;
                }
                catch (NumberFormatException numberFormatException) {
                    if (e.c0 <= 0) break block3;
                    numberFormatException.printStackTrace(b);
                }
            }
        }
        return n8;
    }

    public static InetAddress e() {
        block3: {
            String string = a.getProperty("jcifs.smb.client.laddr");
            if (string != null) {
                try {
                    InetAddress inetAddress = InetAddress.getByName(string);
                    return inetAddress;
                }
                catch (UnknownHostException unknownHostException) {
                    if (e.c0 <= 0) break block3;
                    e e8 = b;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Ignoring jcifs.smb.client.laddr address: ");
                    stringBuilder.append(string);
                    e8.println(stringBuilder.toString());
                    unknownHostException.printStackTrace(b);
                }
            }
        }
        return null;
    }

    public static long f(String string, long l8) {
        block3: {
            if ((string = a.getProperty(string)) != null) {
                try {
                    long l9 = Long.parseLong(string);
                    return l9;
                }
                catch (NumberFormatException numberFormatException) {
                    if (e.c0 <= 0) break block3;
                    numberFormatException.printStackTrace(b);
                }
            }
        }
        return l8;
    }

    public static String g(String string) {
        return a.getProperty(string);
    }

    public static String h(String string, String string2) {
        return a.getProperty(string, string2);
    }

    public static void i(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            a.load(inputStream);
        }
        try {
            a.putAll((Map<?, ?>)((Map)System.getProperties().clone()));
            return;
        }
        catch (SecurityException securityException) {
            if (e.c0 > 1) {
                b.println("SecurityException: jcifs will ignore System properties");
            }
            return;
        }
    }

    public static Object j(String string, String string2) {
        return a.setProperty(string, string2);
    }
}

