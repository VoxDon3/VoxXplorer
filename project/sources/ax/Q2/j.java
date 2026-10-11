package ax.Q2;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class j {
    private boolean a;
    private boolean b;
    private String c;
    private String d;
    private String e;
    private String f;

    private String c(String str) {
        if ("*/*".equals(str)) {
            return null;
        }
        if ("image/*".equals(str)) {
            return "image/";
        }
        if ("audio/*".equals(str)) {
            return "audio/";
        }
        if ("video/*".equals(str)) {
            return "video/";
        }
        if ("text/*".equals(str)) {
            return "text/";
        }
        TextUtils.isEmpty(str);
        return null;
    }

    public void a() {
        this.f = null;
        this.e = null;
        this.a = false;
        this.c = null;
        this.d = null;
        this.b = false;
    }

    public String b() {
        return this.f;
    }

    public boolean d() {
        return "android.intent.action.CREATE_SHORTCUT".equals(this.e);
    }

    public boolean e() {
        return this.b;
    }

    public boolean f() {
        return "android.intent.action.OPEN_DOCUMENT".equals(this.e);
    }

    public boolean g() {
        return this.a;
    }

    public boolean h(String str) {
        String str2 = this.d;
        if (str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        if (str.startsWith(str2)) {
            return true;
        }
        return "image/".equals(this.d) && str.startsWith("video/");
    }

    public void i(String str) {
        this.f = str;
    }

    public void j(String str) {
        this.c = str;
        this.d = c(str);
    }

    public void k(boolean z) {
        this.b = z;
    }

    public void l(String str) {
        this.e = str;
    }

    public void m(boolean z) {
        this.a = z;
    }
}
