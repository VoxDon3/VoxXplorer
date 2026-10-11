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
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
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
    ax.P.s[] j;
    Set<String> k;
    ax.Q.d l;
    boolean m;
    int n;
    PersistableBundle o;
    boolean p = true;
    int q;

    private static class a {
        static void a(ShortcutInfo.Builder builder, int i) {
            builder.setExcludedFromSurfaces(i);
        }
    }

    public static class b {
        private final r a;
        private boolean b;
        private Set<String> c;
        private Map<String, Map<String, List<String>>> d;
        private Uri e;

        public b(Context context, String str) {
            r rVar = new r();
            this.a = rVar;
            rVar.a = context;
            rVar.b = str;
        }

        public r a() {
            if (TextUtils.isEmpty(this.a.e)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            r rVar = this.a;
            Intent[] intentArr = rVar.c;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            if (this.b) {
                if (rVar.l == null) {
                    rVar.l = new ax.Q.d(rVar.b);
                }
                this.a.m = true;
            }
            if (this.c != null) {
                r rVar2 = this.a;
                if (rVar2.k == null) {
                    rVar2.k = new HashSet();
                }
                this.a.k.addAll(this.c);
            }
            if (this.d != null) {
                r rVar3 = this.a;
                if (rVar3.o == null) {
                    rVar3.o = new PersistableBundle();
                }
                for (String str : this.d.keySet()) {
                    Map<String, List<String>> map = this.d.get(str);
                    this.a.o.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                    for (String str2 : map.keySet()) {
                        List<String> list = map.get(str2);
                        this.a.o.putStringArray(str + "/" + str2, list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                    }
                }
            }
            if (this.e != null) {
                r rVar4 = this.a;
                if (rVar4.o == null) {
                    rVar4.o = new PersistableBundle();
                }
                this.a.o.putString("extraSliceUri", ax.X.b.a(this.e));
            }
            return this.a;
        }

        public b b(IconCompat iconCompat) {
            this.a.h = iconCompat;
            return this;
        }

        public b c(Intent intent) {
            return d(new Intent[]{intent});
        }

        public b d(Intent[] intentArr) {
            this.a.c = intentArr;
            return this;
        }

        public b e(CharSequence charSequence) {
            this.a.e = charSequence;
            return this;
        }
    }

    r() {
    }

    private PersistableBundle b() {
        if (this.o == null) {
            this.o = new PersistableBundle();
        }
        ax.P.s[] sVarArr = this.j;
        if (sVarArr != null && sVarArr.length > 0) {
            this.o.putInt("extraPersonCount", sVarArr.length);
            int i = 0;
            while (i < this.j.length) {
                PersistableBundle persistableBundle = this.o;
                StringBuilder sb = new StringBuilder();
                sb.append("extraPerson_");
                int i2 = i + 1;
                sb.append(i2);
                persistableBundle.putPersistableBundle(sb.toString(), this.j[i].j());
                i = i2;
            }
        }
        ax.Q.d dVar = this.l;
        if (dVar != null) {
            this.o.putString("extraLocusId", dVar.a());
        }
        this.o.putBoolean("extraLongLived", this.m);
        return this.o;
    }

    Intent a(Intent intent) {
        intent.putExtra("android.intent.extra.shortcut.INTENT", this.c[r0.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.e.toString());
        if (this.h != null) {
            Drawable drawable = null;
            if (this.i) {
                PackageManager packageManager = this.a.getPackageManager();
                ComponentName componentName = this.d;
                if (componentName != null) {
                    try {
                        drawable = packageManager.getActivityIcon(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                if (drawable == null) {
                    drawable = this.a.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.h.c(intent, drawable, this.a);
        }
        return intent;
    }

    public boolean c(int i) {
        return (i & this.q) != 0;
    }

    public ShortcutInfo d() {
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder intents;
        ShortcutInfo build;
        i.a();
        shortLabel = ax.R.b.a(this.a, this.b).setShortLabel(this.e);
        intents = shortLabel.setIntents(this.c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.y(this.a));
        }
        if (!TextUtils.isEmpty(this.f)) {
            intents.setLongLabel(this.f);
        }
        if (!TextUtils.isEmpty(this.g)) {
            intents.setDisabledMessage(this.g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.k;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.n);
        PersistableBundle persistableBundle = this.o;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ax.P.s[] sVarArr = this.j;
            if (sVarArr != null && sVarArr.length > 0) {
                int length = sVarArr.length;
                Person[] personArr = new Person[length];
                for (int i = 0; i < length; i++) {
                    personArr[i] = this.j[i].h();
                }
                intents.setPersons(personArr);
            }
            ax.Q.d dVar = this.l;
            if (dVar != null) {
                intents.setLocusId(dVar.c());
            }
            intents.setLongLived(this.m);
        } else {
            intents.setExtras(b());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.a(intents, this.q);
        }
        build = intents.build();
        return build;
    }
}
