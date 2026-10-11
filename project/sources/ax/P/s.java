package ax.P;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Objects;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class s {
    CharSequence a;
    IconCompat b;
    String c;
    String d;
    boolean e;
    boolean f;

    static class a {
        static s a(PersistableBundle persistableBundle) {
            return new c().f(persistableBundle.getString("name")).g(persistableBundle.getString("uri")).e(persistableBundle.getString("key")).b(persistableBundle.getBoolean("isBot")).d(persistableBundle.getBoolean("isImportant")).a();
        }

        static PersistableBundle b(s sVar) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = sVar.a;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString("uri", sVar.c);
            persistableBundle.putString("key", sVar.d);
            persistableBundle.putBoolean("isBot", sVar.e);
            persistableBundle.putBoolean("isImportant", sVar.f);
            return persistableBundle;
        }
    }

    static class b {
        static s a(Person person) {
            return new c().f(person.getName()).c(person.getIcon() != null ? IconCompat.e(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        static Person b(s sVar) {
            return new Person.Builder().setName(sVar.c()).setIcon(sVar.a() != null ? sVar.a().x() : null).setUri(sVar.d()).setKey(sVar.b()).setBot(sVar.e()).setImportant(sVar.f()).build();
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

        public c b(boolean z) {
            this.e = z;
            return this;
        }

        public c c(IconCompat iconCompat) {
            this.b = iconCompat;
            return this;
        }

        public c d(boolean z) {
            this.f = z;
            return this;
        }

        public c e(String str) {
            this.d = str;
            return this;
        }

        public c f(CharSequence charSequence) {
            this.a = charSequence;
            return this;
        }

        public c g(String str) {
            this.c = str;
            return this;
        }
    }

    s(c cVar) {
        this.a = cVar.a;
        this.b = cVar.b;
        this.c = cVar.c;
        this.d = cVar.d;
        this.e = cVar.e;
        this.f = cVar.f;
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

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        String b2 = b();
        String b3 = sVar.b();
        return (b2 == null && b3 == null) ? Objects.equals(Objects.toString(c()), Objects.toString(sVar.c())) && Objects.equals(d(), sVar.d()) && Boolean.valueOf(e()).equals(Boolean.valueOf(sVar.e())) && Boolean.valueOf(f()).equals(Boolean.valueOf(sVar.f())) : Objects.equals(b2, b3);
    }

    public boolean f() {
        return this.f;
    }

    public String g() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        if (this.a == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return "name:" + ((Object) this.a);
    }

    public Person h() {
        return b.b(this);
    }

    public int hashCode() {
        String b2 = b();
        return b2 != null ? b2.hashCode() : Objects.hash(c(), d(), Boolean.valueOf(e()), Boolean.valueOf(f()));
    }

    public Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.a);
        IconCompat iconCompat = this.b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.w() : null);
        bundle.putString("uri", this.c);
        bundle.putString("key", this.d);
        bundle.putBoolean("isBot", this.e);
        bundle.putBoolean("isImportant", this.f);
        return bundle;
    }

    public PersistableBundle j() {
        return a.b(this);
    }
}
