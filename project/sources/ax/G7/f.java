package ax.G7;

import android.content.Context;
import ax.J7.C0764i;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class f {
    private final Context a;
    private b b = null;

    private class b {
        private final String a;
        private final String b;

        private b() {
            int p = C0764i.p(f.this.a, "com.google.firebase.crashlytics.unity_version", "string");
            if (p == 0) {
                if (!f.this.c("flutter_assets/NOTICES.Z")) {
                    this.a = null;
                    this.b = null;
                    return;
                } else {
                    this.a = "Flutter";
                    this.b = null;
                    g.f().i("Development platform is: Flutter");
                    return;
                }
            }
            this.a = "Unity";
            String string = f.this.a.getResources().getString(p);
            this.b = string;
            g.f().i("Unity Editor version is: " + string);
        }
    }

    public f(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        if (this.a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.a.getAssets().open(str);
            if (open != null) {
                open.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.b == null) {
            this.b = new b();
        }
        return this.b;
    }

    public String d() {
        return f().a;
    }

    public String e() {
        return f().b;
    }
}
