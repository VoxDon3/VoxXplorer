/*
 * Decompiled with CFR 0.152.
 */
package ax.o3;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

public class o {
    private final String a;
    private final InetAddress b;
    private final int c;
    private String d;
    private String e;
    private int f;
    private Map<String, byte[]> g;

    private o(String string, InetAddress inetAddress, int n8, Map<String, byte[]> map) {
        this.a = string;
        this.b = inetAddress;
        this.c = n8;
        this.g = map;
        this.l();
    }

    public static String a(Context object, int n8) {
        UiModeManager uiModeManager = (UiModeManager)object.getSystemService("uimode");
        object = uiModeManager != null && uiModeManager.getCurrentModeType() == 4 ? "tv" : (object.getResources().getBoolean(2131034127) ? "ta" : "ph");
        return String.format(Locale.US, "%s-%d-%s", object, n8, Build.MODEL);
    }

    public static o b(String object, InetAddress inetAddress, int n8, Map<String, byte[]> map) {
        try {
            object = new o((String)object, inetAddress, n8, map);
            return object;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    public static String c(Context context) {
        return Build.MODEL;
    }

    private void l() {
        this.f = this.a.startsWith("ta") ? 2 : (this.a.startsWith("tv") ? 4 : (this.a.startsWith("la") ? 3 : 1));
        if (this.a.length() >= 5) {
            CharSequence charSequence = this.a.substring(3);
            int n8 = ((String)charSequence).indexOf(45);
            if (n8 >= 0 && n8 != ((String)charSequence).length()) {
                this.e = ((String)charSequence).substring(0, n8);
                this.d = ((String)charSequence).substring(n8 + 1);
                return;
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("invalid service name : ");
            ((StringBuilder)charSequence).append(this.a);
            throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("invalid service name : ");
        stringBuilder.append(this.a);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    boolean d(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2);
        {
        }
    }

    public String e() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (o)object;
            if (this.c == ((o)object).c && this.d(this.a, ((o)object).a) && this.d(this.b, ((o)object).b)) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f;
    }

    public InetAddress g() {
        return this.b;
    }

    public String h() {
        return this.e;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public int i() {
        return this.c;
    }

    public String j() {
        return this.a;
    }

    public boolean k(String string) {
        return this.d(this.a, string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean m() {
        Map<String, byte[]> map = this.g;
        if (map == null) return false;
        byte[] byArray = map.get("PROTOCOL");
        if (byArray == null) return false;
        try {
            map = new String(byArray, StandardCharsets.UTF_8);
            boolean bl = "FTPS".equals(map);
            if (!bl) return false;
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }
}

