package ax.P4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Process;
import android.util.Base64;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class g {
    private static final String b = ax.S4.b.f(g.class);
    private final Map<String, ArrayList<a>> a;

    private static final class a {
        final String a;
        final String b;
        final boolean c;

        public a(String str, String str2, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = z;
        }
    }

    public g(Context context) {
        this.a = b(context.getResources().getXml(j.a));
    }

    private Map<String, ArrayList<a>> b(XmlResourceParser xmlResourceParser) {
        HashMap hashMap = new HashMap();
        try {
            int next = xmlResourceParser.next();
            while (next != 1) {
                if (next == 2) {
                    if (xmlResourceParser.getName().equals("signing_certificate")) {
                        String attributeValue = xmlResourceParser.getAttributeValue(null, "name");
                        String attributeValue2 = xmlResourceParser.getAttributeValue(null, "package");
                        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "release", false);
                        String replaceAll = xmlResourceParser.nextText().replaceAll("\\s|\\n", HttpUrl.FRAGMENT_ENCODE_SET);
                        a aVar = new a(attributeValue, attributeValue2, attributeBooleanValue);
                        ArrayList arrayList = (ArrayList) hashMap.get(replaceAll);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            hashMap.put(replaceAll, arrayList);
                        }
                        arrayList.add(aVar);
                    }
                }
                next = xmlResourceParser.next();
            }
        } catch (IOException e) {
            e = e;
            ax.S4.b.b(b, e, "Could not read allowed callers from XML.");
            return hashMap;
        } catch (XmlPullParserException e2) {
            e = e2;
            ax.S4.b.b(b, e, "Could not read allowed callers from XML.");
            return hashMap;
        }
        return hashMap;
    }

    public boolean a(Context context, String str, int i) {
        Signature[] signatureArr;
        SigningInfo signingInfo;
        SigningInfo signingInfo2;
        if (1000 == i || Process.myUid() == i) {
            return true;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            int i2 = Build.VERSION.SDK_INT;
            PackageInfo packageInfo = packageManager.getPackageInfo(str, i2 >= 28 ? 134217792 : 64);
            if (i2 >= 28) {
                signatureArr = packageInfo.signatures;
                if (signatureArr == null) {
                    signingInfo = packageInfo.signingInfo;
                    if (signingInfo == null) {
                        return false;
                    }
                    signingInfo2 = packageInfo.signingInfo;
                    signatureArr = signingInfo2.getSigningCertificateHistory();
                }
            } else {
                signatureArr = packageInfo.signatures;
            }
            if (signatureArr == null) {
                return false;
            }
            if (i2 < 28 && signatureArr.length != 1) {
                ax.S4.b.j(b, "Caller has more than one signature certificate!");
                return false;
            }
            String encodeToString = Base64.encodeToString(signatureArr[0].toByteArray(), 2);
            ArrayList<a> arrayList = this.a.get(encodeToString);
            if (arrayList == null) {
                String str2 = b;
                ax.S4.b.h(str2, "Signature for caller ", str, " is not valid: \n", encodeToString);
                if (this.a.isEmpty()) {
                    ax.S4.b.j(str2, "The list of valid certificates is empty. Either your file ", "res/xml/allowed_media_browser_callers.xml is empty or there was an error ", "while reading it. Check previous log messages.");
                }
                return false;
            }
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                a aVar = arrayList.get(i3);
                i3++;
                if (str.equals(aVar.b)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            ax.S4.b.i(b, e, "Package manager can't find package: ", str);
            return false;
        }
    }
}
