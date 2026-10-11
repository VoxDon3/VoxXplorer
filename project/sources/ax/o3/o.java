package ax.o3;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import com.voxdon.xplorer.R;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class o {
    private final String a;
    private final InetAddress b;
    private final int c;
    private String d;
    private String e;
    private int f;
    private Map<String, byte[]> g;

    private o(String str, InetAddress inetAddress, int i, Map<String, byte[]> map) {
        this.a = str;
        this.b = inetAddress;
        this.c = i;
        this.g = map;
        l();
    }

    public static String a(Context context, int i) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return String.format(Locale.US, "%s-%d-%s", (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? context.getResources().getBoolean(R.bool.is_tablet) ? "ta" : "ph" : "tv", Integer.valueOf(i), Build.MODEL);
    }

    public static o b(String str, InetAddress inetAddress, int i, Map<String, byte[]> map) {
        try {
            return new o(str, inetAddress, i, map);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static String c(Context context) {
        return Build.MODEL;
    }

    private void l() {
        if (this.a.startsWith("ta")) {
            this.f = 2;
        } else if (this.a.startsWith("tv")) {
            this.f = 4;
        } else if (this.a.startsWith("la")) {
            this.f = 3;
        } else {
            this.f = 1;
        }
        if (this.a.length() < 5) {
            throw new IllegalArgumentException("invalid service name : " + this.a);
        }
        String substring = this.a.substring(3);
        int indexOf = substring.indexOf(45);
        if (indexOf >= 0 && indexOf != substring.length()) {
            this.e = substring.substring(0, indexOf);
            this.d = substring.substring(indexOf + 1);
        } else {
            throw new IllegalArgumentException("invalid service name : " + this.a);
        }
    }

    boolean d(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            o oVar = (o) obj;
            if (this.c == oVar.c && d(this.a, oVar.a) && d(this.b, oVar.b)) {
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
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public int i() {
        return this.c;
    }

    public String j() {
        return this.a;
    }

    public boolean k(String str) {
        return d(this.a, str);
    }

    public boolean m() {
        byte[] bArr;
        Map<String, byte[]> map = this.g;
        if (map == null || (bArr = map.get("PROTOCOL")) == null) {
            return false;
        }
        try {
            return "FTPS".equals(new String(bArr, StandardCharsets.UTF_8));
        } catch (Exception unused) {
            return false;
        }
    }
}
