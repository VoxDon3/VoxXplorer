/*
 * Decompiled with CFR 0.152.
 */
package ax.R;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import ax.P.s;
import ax.R.c;
import ax.R.d;
import ax.R.e;
import ax.R.f;
import ax.R.g;
import ax.R.h;
import ax.R.i;
import ax.R.j;
import ax.R.k;
import ax.R.l;
import ax.R.m;
import ax.R.n;
import ax.R.o;
import ax.R.p;
import ax.R.q;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class r {
    Context a;
    String b;
    Intent[] c;
    ComponentName d;
    CharSequence e;
    CharSequence f;
    CharSequence g;
    IconCompat h;
    boolean i;
    s[] j;
    Set<String> k;
    ax.Q.d l;
    boolean m;
    int n;
    PersistableBundle o;
    boolean p = true;
    int q;

    r() {
    }

    private PersistableBundle b() {
        Object object;
        if (this.o == null) {
            this.o = new PersistableBundle();
        }
        if ((object = this.j) != null && ((s[])object).length > 0) {
            this.o.putInt("extraPersonCount", ((s[])object).length);
            int n8 = 0;
            while (n8 < this.j.length) {
                PersistableBundle persistableBundle = this.o;
                object = new StringBuilder();
                ((StringBuilder)object).append("extraPerson_");
                int n9 = n8 + 1;
                ((StringBuilder)object).append(n9);
                persistableBundle.putPersistableBundle(((StringBuilder)object).toString(), this.j[n8].j());
                n8 = n9;
            }
        }
        if ((object = this.l) != null) {
            this.o.putString("extraLocusId", ((ax.Q.d)object).a());
        }
        ax.R.h.a(this.o, "extraLongLived", this.m);
        return this.o;
    }

    Intent a(Intent intent) {
        Drawable drawable = this.c;
        intent.putExtra("android.intent.extra.shortcut.INTENT", (Parcelable)drawable[((Intent[])drawable).length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.e.toString());
        if (this.h != null) {
            boolean bl = this.i;
            Drawable drawable2 = null;
            Object var5_6 = null;
            if (bl) {
                PackageManager packageManager = this.a.getPackageManager();
                drawable2 = this.d;
                drawable = var5_6;
                if (drawable2 != null) {
                    try {
                        drawable = packageManager.getActivityIcon((ComponentName)drawable2);
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException) {
                        drawable = var5_6;
                    }
                }
                drawable2 = drawable;
                if (drawable == null) {
                    drawable2 = this.a.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.h.c(intent, drawable2, this.a);
        }
        return intent;
    }

    public boolean c(int n8) {
        return (n8 & this.q) != 0;
    }

    public ShortcutInfo d() {
        ax.R.i.a();
        ShortcutInfo.Builder builder = ax.R.o.a(ax.R.j.a(ax.R.b.a(this.a, this.b), this.e), this.c);
        Object object = this.h;
        if (object != null) {
            ax.R.p.a(builder, ((IconCompat)object).y(this.a));
        }
        if (!TextUtils.isEmpty((CharSequence)this.f)) {
            ax.R.q.a(builder, this.f);
        }
        if (!TextUtils.isEmpty((CharSequence)this.g)) {
            ax.R.c.a(builder, this.g);
        }
        if ((object = this.d) != null) {
            ax.R.d.a(builder, (ComponentName)object);
        }
        if ((object = this.k) != null) {
            ax.R.e.a(builder, (Set)object);
        }
        ax.R.f.a(builder, this.n);
        object = this.o;
        if (object != null) {
            ax.R.m.a(builder, (PersistableBundle)object);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            object = this.j;
            if (object != null && ((s[])object).length > 0) {
                int n8 = ((s[])object).length;
                object = new Person[n8];
                for (int i8 = 0; i8 < n8; ++i8) {
                    object[i8] = this.j[i8].h();
                }
                ax.R.g.a(builder, (Person[])object);
            }
            if ((object = this.l) != null) {
                ax.R.k.a(builder, ((ax.Q.d)object).c());
            }
            ax.R.l.a(builder, this.m);
        } else {
            ax.R.m.a(builder, this.b());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            ax.R.r$a.a(builder, this.q);
        }
        return ax.R.n.a(builder);
    }

    private static class a {
        static void a(ShortcutInfo.Builder builder, int n8) {
            builder.setExcludedFromSurfaces(n8);
        }
    }

    public static class b {
        private final r a;
        private boolean b;
        private Set<String> c;
        private Map<String, Map<String, List<String>>> d;
        private Uri e;

        public b(Context context, String string) {
            r r8;
            this.a = r8 = new r();
            r8.a = context;
            r8.b = string;
        }

        public r a() {
            if (!TextUtils.isEmpty((CharSequence)this.a.e)) {
                Object object = this.a;
                Object object2 = ((r)object).c;
                if (object2 != null && ((Intent[])object2).length != 0) {
                    if (this.b) {
                        if (((r)object).l == null) {
                            ((r)object).l = new ax.Q.d(((r)object).b);
                        }
                        this.a.m = true;
                    }
                    if (this.c != null) {
                        object2 = this.a;
                        if (((r)object2).k == null) {
                            ((r)object2).k = new HashSet<String>();
                        }
                        this.a.k.addAll(this.c);
                    }
                    if (this.d != null) {
                        object2 = this.a;
                        if (((r)object2).o == null) {
                            ((r)object2).o = new PersistableBundle();
                        }
                        for (String string : this.d.keySet()) {
                            object = this.d.get(string);
                            object2 = object.keySet();
                            this.a.o.putStringArray(string, object2.toArray(new String[0]));
                            for (String string2 : object.keySet()) {
                                object2 = (List)object.get(string2);
                                PersistableBundle persistableBundle = this.a.o;
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append(string);
                                stringBuilder.append("/");
                                stringBuilder.append(string2);
                                string2 = stringBuilder.toString();
                                object2 = object2 == null ? new String[]{} : object2.toArray(new String[0]);
                                persistableBundle.putStringArray(string2, (String[])object2);
                            }
                        }
                    }
                    if (this.e != null) {
                        object2 = this.a;
                        if (((r)object2).o == null) {
                            ((r)object2).o = new PersistableBundle();
                        }
                        this.a.o.putString("extraSliceUri", ax.X.b.a(this.e));
                    }
                    return this.a;
                }
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }

        public b b(IconCompat iconCompat) {
            this.a.h = iconCompat;
            return this;
        }

        public b c(Intent intent) {
            return this.d(new Intent[]{intent});
        }

        public b d(Intent[] intentArray) {
            this.a.c = intentArray;
            return this;
        }

        public b e(CharSequence charSequence) {
            this.a.e = charSequence;
            return this;
        }
    }
}

