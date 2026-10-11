/*
 * Decompiled with CFR 0.152.
 */
package ax.s;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import ax.m.i;

public class c
extends ContextWrapper {
    private static Configuration f;
    private int a;
    private Resources.Theme b;
    private LayoutInflater c;
    private Configuration d;
    private Resources e;

    public c() {
        super(null);
    }

    public c(Context context, int n8) {
        super(context);
        this.a = n8;
    }

    public c(Context context, Resources.Theme theme) {
        super(context);
        this.b = theme;
    }

    private Resources b() {
        if (this.e == null) {
            Configuration configuration = this.d;
            this.e = !(configuration == null || Build.VERSION.SDK_INT >= 26 && ax.s.c.e(configuration)) ? this.createConfigurationContext(this.d).getResources() : super.getResources();
        }
        return this.e;
    }

    private void d() {
        boolean bl = this.b == null;
        if (bl) {
            this.b = this.getResources().newTheme();
            Resources.Theme theme = this.getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.f(this.b, this.a, bl);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f = configuration2;
        }
        return configuration.equals(f);
    }

    public void a(Configuration configuration) {
        if (this.e == null) {
            if (this.d == null) {
                this.d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.a;
    }

    protected void f(Resources.Theme theme, int n8, boolean bl) {
        theme.applyStyle(n8, true);
    }

    public AssetManager getAssets() {
        return this.getResources().getAssets();
    }

    public Resources getResources() {
        return this.b();
    }

    public Object getSystemService(String string) {
        if ("layout_inflater".equals(string)) {
            if (this.c == null) {
                this.c = LayoutInflater.from((Context)this.getBaseContext()).cloneInContext((Context)this);
            }
            return this.c;
        }
        return this.getBaseContext().getSystemService(string);
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = i.e;
        }
        this.d();
        return this.b;
    }

    public void setTheme(int n8) {
        if (this.a != n8) {
            this.a = n8;
            this.d();
        }
    }
}

