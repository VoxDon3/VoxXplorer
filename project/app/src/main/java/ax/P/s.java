/*
 * Decompiled with CFR 0.152.
 */
package ax.P;

import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;

public class s {
    CharSequence a;
    IconCompat b;
    String c;
    String d;
    boolean e;
    boolean f;

    s(c c8) {
        this.a = c8.a;
        this.b = c8.b;
        this.c = c8.c;
        this.d = c8.d;
        this.e = c8.e;
        this.f = c8.f;
    }

    public IconCompat a() {
        return this.b;
    }

    public String b() {
        return this.d;
    }

    public CharSequence c() {
        return this.a;
    }

    public String d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof s)) {
            return false;
        }
        s s8 = (s)object;
        String string = this.b();
        object = s8.b();
        if (string == null && object == null) {
            return j.Objects.equals((Object)j.Objects.toString((Object)this.c()), (Object)j.Objects.toString((Object)s8.c())) && j.Objects.equals((Object)this.d(), (Object)s8.d()) && ((Object)this.e()).equals(s8.e()) && ((Object)this.f()).equals(s8.f());
        }
        return j.Objects.equals((Object)string, (Object)object);
    }

    public boolean f() {
        return this.f;
    }

    public String g() {
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            return charSequence;
        }
        if (this.a != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("name:");
            ((StringBuilder)charSequence).append((Object)this.a);
            return ((StringBuilder)charSequence).toString();
        }
        return "";
    }

    public Person h() {
        return ax.P.s$b.b(this);
    }

    public int hashCode() {
        String string = this.b();
        if (string != null) {
            return string.hashCode();
        }
        return j.Objects.hash((Object[])new Object[]{this.c(), this.d(), this.e(), this.f()});
    }

    public Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.a);
        IconCompat iconCompat = this.b;
        iconCompat = iconCompat != null ? iconCompat.w() : null;
        bundle.putBundle("icon", (Bundle)iconCompat);
        bundle.putString("uri", this.c);
        bundle.putString("key", this.d);
        bundle.putBoolean("isBot", this.e);
        bundle.putBoolean("isImportant", this.f);
        return bundle;
    }

    public PersistableBundle j() {
        return ax.P.s$a.b(this);
    }

    static class a {
        static s a(PersistableBundle persistableBundle) {
            return new c().f(persistableBundle.getString("name")).g(persistableBundle.getString("uri")).e(persistableBundle.getString("key")).b(persistableBundle.getBoolean("isBot")).d(persistableBundle.getBoolean("isImportant")).a();
        }

        static PersistableBundle b(s s8) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = s8.a;
            charSequence = charSequence != null ? charSequence.toString() : null;
            persistableBundle.putString("name", (String)charSequence);
            persistableBundle.putString("uri", s8.c);
            persistableBundle.putString("key", s8.d);
            persistableBundle.putBoolean("isBot", s8.e);
            persistableBundle.putBoolean("isImportant", s8.f);
            return persistableBundle;
        }
    }

    static class b {
        static s a(Person person) {
            c c8 = new c().f(person.getName());
            IconCompat iconCompat = person.getIcon() != null ? IconCompat.e(person.getIcon()) : null;
            return c8.c(iconCompat).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        static Person b(s s8) {
            Person.Builder builder = new Person.Builder().setName(s8.c());
            Icon icon = s8.a() != null ? s8.a().x() : null;
            return builder.setIcon(icon).setUri(s8.d()).setKey(s8.b()).setBot(s8.e()).setImportant(s8.f()).build();
        }
    }

    public static class c {
        CharSequence a;
        IconCompat b;
        String c;
        String d;
        boolean e;
        boolean f;

        public s a() {
            return new s(this);
        }

        public c b(boolean bl) {
            this.e = bl;
            return this;
        }

        public c c(IconCompat iconCompat) {
            this.b = iconCompat;
            return this;
        }

        public c d(boolean bl) {
            this.f = bl;
            return this;
        }

        public c e(String string) {
            this.d = string;
            return this;
        }

        public c f(CharSequence charSequence) {
            this.a = charSequence;
            return this;
        }

        public c g(String string) {
            this.c = string;
            return this;
        }
    }
}

