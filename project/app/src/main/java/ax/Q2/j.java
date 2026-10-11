/*
 * Decompiled with CFR 0.152.
 */
package ax.Q2;

import android.text.TextUtils;

public class j {
    private boolean a;
    private boolean b;
    private String c;
    private String d;
    private String e;
    private String f;

    private String c(String string) {
        if ("*/*".equals(string)) {
            return null;
        }
        if ("image/*".equals(string)) {
            return "image/";
        }
        if ("audio/*".equals(string)) {
            return "audio/";
        }
        if ("video/*".equals(string)) {
            return "video/";
        }
        if ("text/*".equals(string)) {
            return "text/";
        }
        TextUtils.isEmpty((CharSequence)string);
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

    public boolean h(String string) {
        String string2 = this.d;
        if (string2 == null) {
            return true;
        }
        if (string == null) {
            return false;
        }
        if (string.startsWith(string2)) {
            return true;
        }
        return "image/".equals(this.d) && string.startsWith("video/");
    }

    public void i(String string) {
        this.f = string;
    }

    public void j(String string) {
        this.c = string;
        this.d = this.c(string);
    }

    public void k(boolean bl) {
        this.b = bl;
    }

    public void l(String string) {
        this.e = string;
    }

    public void m(boolean bl) {
        this.a = bl;
    }
}

