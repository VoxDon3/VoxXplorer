/*
 * Decompiled with CFR 0.152.
 */
package ax.P4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Process;
import android.util.Base64;
import ax.P4.e;
import ax.P4.f;
import ax.P4.j;
import ax.S4.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

public class g {
    private static final String b = ax.S4.b.f(g.class);
    private final Map<String, ArrayList<a>> a;

    public g(Context context) {
        this.a = this.b(context.getResources().getXml(j.a));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Map<String, ArrayList<a>> b(XmlResourceParser xmlResourceParser) {
        int n8;
        HashMap<String, ArrayList<a>> hashMap;
        block6: {
            Throwable var1_4;
            hashMap = new HashMap<String, ArrayList<a>>();
            try {
                n8 = xmlResourceParser.next();
                break block6;
            }
            catch (IOException iOException) {
            }
            catch (XmlPullParserException xmlPullParserException) {}
            ax.S4.b.b(b, (Throwable)var1_4, "Could not read allowed callers from XML.");
            return hashMap;
        }
        while (n8 != 1) {
            if (n8 == 2 && xmlResourceParser.getName().equals("signing_certificate")) {
                Object object = xmlResourceParser.getAttributeValue(null, "name");
                ArrayList<a> arrayList = xmlResourceParser.getAttributeValue(null, "package");
                boolean bl = xmlResourceParser.getAttributeBooleanValue(null, "release", false);
                String string = xmlResourceParser.nextText().replaceAll("\\s|\\n", "");
                a a8 = new a((String)object, (String)((Object)arrayList), bl);
                object = hashMap.get(string);
                arrayList = object;
                if (object == null) {
                    arrayList = new ArrayList<a>();
                    hashMap.put(string, arrayList);
                }
                arrayList.add(a8);
            }
            n8 = xmlResourceParser.next();
        }
        return hashMap;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a(Context object, String string, int n8) {
        Object e8;
        int n9;
        block9: {
            PackageInfo packageInfo;
            block7: {
                block8: {
                    if (1000 == n8) return true;
                    if (Process.myUid() == n8) {
                        return true;
                    }
                    object = object.getPackageManager();
                    try {
                        n9 = Build.VERSION.SDK_INT;
                        n8 = n9 >= 28 ? 0x8000040 : 64;
                        packageInfo = object.getPackageInfo(string, n8);
                        if (n9 < 28) break block7;
                        object = packageInfo.signatures;
                        if (object == null) break block8;
                        break block9;
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException) {
                        ax.S4.b.i(b, nameNotFoundException, "Package manager can't find package: ", string);
                        return false;
                    }
                }
                if (e.a(packageInfo) == null) return false;
                object = f.a(e.a(packageInfo));
                break block9;
            }
            object = packageInfo.signatures;
        }
        if (object == null) {
            return false;
        }
        if (n9 < 28 && ((Object)object).length != 1) {
            ax.S4.b.j(b, "Caller has more than one signature certificate!");
            return false;
        }
        String string2 = Base64.encodeToString((byte[])object[0].toByteArray(), (int)2);
        if ((object = this.a.get(string2)) == null) {
            object = b;
            ax.S4.b.h((String)object, "Signature for caller ", string, " is not valid: \n", string2);
            if (!this.a.isEmpty()) return false;
            ax.S4.b.j((String)object, "The list of valid certificates is empty. Either your file ", "res/xml/allowed_media_browser_callers.xml is empty or there was an error ", "while reading it. Check previous log messages.");
            return false;
        }
        n9 = ((ArrayList)object).size();
        n8 = 0;
        do {
            if (n8 >= n9) return false;
            e8 = ((ArrayList)object).get(n8);
            ++n8;
        } while (!string.equals(((a)e8).b));
        return true;
    }

    private static final class a {
        final String a;
        final String b;
        final boolean c;

        public a(String string, String string2, boolean bl) {
            this.a = string;
            this.b = string2;
            this.c = bl;
        }
    }
}

