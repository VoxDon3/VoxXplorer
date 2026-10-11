package ax.Y;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
final class q implements j {
    private final LocaleList a;

    q(Object obj) {
        this.a = p.a(obj);
    }

    @Override // ax.Y.j
    public String a() {
        String languageTags;
        languageTags = this.a.toLanguageTags();
        return languageTags;
    }

    @Override // ax.Y.j
    public Object b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean equals;
        equals = this.a.equals(((j) obj).b());
        return equals;
    }

    @Override // ax.Y.j
    public Locale get(int i) {
        Locale locale;
        locale = this.a.get(i);
        return locale;
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.a.hashCode();
        return hashCode;
    }

    @Override // ax.Y.j
    public boolean isEmpty() {
        boolean isEmpty;
        isEmpty = this.a.isEmpty();
        return isEmpty;
    }

    @Override // ax.Y.j
    public int size() {
        int size;
        size = this.a.size();
        return size;
    }

    public String toString() {
        String localeList;
        localeList = this.a.toString();
        return localeList;
    }
}
