/*
 * Decompiled with CFR 0.152.
 */
package ax.G7;

import android.content.Context;
import ax.G7.g;
import ax.J7.i;
import java.io.IOException;
import java.io.InputStream;

public class f {
    private final Context a;
    private b b;

    public f(Context context) {
        this.a = context;
        this.b = null;
    }

    private boolean c(String object) {
        block4: {
            if (this.a.getAssets() == null) {
                return false;
            }
            try {
                object = this.a.getAssets().open((String)object);
                if (object == null) break block4;
            }
            catch (IOException iOException) {
                return false;
            }
            ((InputStream)object).close();
        }
        return true;
    }

    private b f() {
        if (this.b == null) {
            this.b = new b(this);
        }
        return this.b;
    }

    public String d() {
        return this.f().a;
    }

    public String e() {
        return this.f().b;
    }

    private class b {
        private final String a;
        private final String b;
        final f c;

        private b(f object) {
            this.c = object;
            int n8 = i.p(((f)object).a, "com.google.firebase.crashlytics.unity_version", "string");
            if (n8 != 0) {
                this.a = "Unity";
                this.b = object = ((f)object).a.getResources().getString(n8);
                g g8 = g.f();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unity Editor version is: ");
                stringBuilder.append((String)object);
                g8.i(stringBuilder.toString());
                return;
            }
            if (((f)object).c("flutter_assets/NOTICES.Z")) {
                this.a = "Flutter";
                this.b = null;
                g.f().i("Development platform is: Flutter");
                return;
            }
            this.a = null;
            this.b = null;
        }
    }
}

