package ax.Sd;

import java.util.Locale;

/* loaded from: classes3.dex */
public class k {
    public static boolean a(Locale locale, b bVar) {
        if (bVar == null) {
            return false;
        }
        String c = bVar.c();
        if (bVar instanceof o) {
            return true;
        }
        if (bVar instanceof d) {
            return "ko".equals(locale.getLanguage());
        }
        if (bVar instanceof c) {
            return "ja".equals(locale.getLanguage());
        }
        if (bVar instanceof m) {
            return "ja".equals(locale.getLanguage());
        }
        if (bVar instanceof a) {
            return "TW".equals(locale.getCountry());
        }
        if (bVar instanceof e) {
            return "TW".equals(locale.getCountry());
        }
        if (bVar instanceof g) {
            return "CN".equals(locale.getCountry());
        }
        if (bVar instanceof h) {
            return "he".equals(locale.getLanguage()) || "iw".equals(locale.getLanguage());
        }
        if (ax.Rd.b.q.equals(c) || ax.Rd.b.p.equals(c) || ax.Rd.b.o.equals(c) || ax.Rd.b.n.equals(c)) {
            return "ru".equals(locale.getLanguage());
        }
        if (ax.Rd.b.s.equals(c)) {
            return "el".equals(locale.getLanguage());
        }
        if (ax.Rd.b.z.equals(c)) {
            return "th".equals(locale.getLanguage());
        }
        return false;
    }

    public static float b(Locale locale, b bVar) {
        return bVar instanceof j ? a(locale, ((j) bVar).l()) : bVar instanceof l ? a(locale, ((l) bVar).l()) : false ? 1.25f : 1.0f;
    }
}
