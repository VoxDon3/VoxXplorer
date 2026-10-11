package j$.time.format;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class m {
    public static final j$.desugar.sun.nio.fs.m f = new j$.desugar.sun.nio.fs.m(1);
    public m a;
    public final m b;
    public final ArrayList c;
    public final boolean d;
    public int e;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put('G', j$.time.temporal.a.ERA);
        hashMap.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        hashMap.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.h hVar = j$.time.temporal.j.a;
        hashMap.put('Q', hVar);
        hashMap.put('q', hVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        hashMap.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        hashMap.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        hashMap.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        hashMap.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        hashMap.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        hashMap.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', j$.time.temporal.a.NANO_OF_DAY);
        hashMap.put('g', j$.time.temporal.l.a);
    }

    public m() {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = null;
        this.d = false;
    }

    public m(m mVar) {
        this.a = this;
        this.c = new ArrayList();
        this.e = -1;
        this.b = mVar;
        this.d = true;
    }

    public final void g(j$.time.temporal.q qVar, int i) {
        Objects.requireNonNull(qVar, "field");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
        }
        f(new h(qVar, i, i, s.NOT_NEGATIVE));
    }

    public final void h(j$.time.temporal.q qVar, int i, int i2, s sVar) {
        if (i == i2 && sVar == s.NOT_NEGATIVE) {
            g(qVar, i2);
            return;
        }
        Objects.requireNonNull(qVar, "field");
        Objects.requireNonNull(sVar, "signStyle");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
        }
        f(new h(qVar, i, i2, sVar));
    }

    public final void f(h hVar) {
        h a;
        m mVar = this.a;
        int i = mVar.e;
        if (i >= 0) {
            h hVar2 = (h) mVar.c.get(i);
            int i2 = hVar.b;
            int i3 = hVar.c;
            if (i2 == i3) {
                if (hVar.d == s.NOT_NEGATIVE) {
                    a = hVar2.b(i3);
                    b(hVar.a());
                    this.a.e = i;
                    this.a.c.set(i, a);
                    return;
                }
            }
            a = hVar2.a();
            this.a.e = b(hVar);
            this.a.c.set(i, a);
            return;
        }
        mVar.e = b(hVar);
    }

    public final void e(j$.time.temporal.a aVar, HashMap hashMap) {
        Objects.requireNonNull(aVar, "field");
        Objects.requireNonNull(hashMap, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
        t tVar = t.FULL;
        b(new l(aVar, tVar, new a(new j$.desugar.sun.nio.fs.g(Collections.singletonMap(tVar, linkedHashMap)))));
    }

    public final void c(char c) {
        b(new c(c));
    }

    public final void d(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            b(new c(str.charAt(0)));
        } else {
            b(new k(str));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d dVar = dateTimeFormatter.a;
        if (dVar.b) {
            dVar = new d(dVar.a, false);
        }
        b(dVar);
    }

    public final void j() {
        m mVar = this.a;
        mVar.e = -1;
        this.a = new m(mVar);
    }

    public final void i() {
        m mVar = this.a;
        if (mVar.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (mVar.c.size() > 0) {
            m mVar2 = this.a;
            d dVar = new d(mVar2.c, mVar2.d);
            this.a = this.a.b;
            b(dVar);
            return;
        }
        this.a = this.a.b;
    }

    public final int b(e eVar) {
        Objects.requireNonNull(eVar, "pp");
        m mVar = this.a;
        mVar.getClass();
        mVar.c.add(eVar);
        this.a.e = -1;
        return r2.c.size() - 1;
    }

    public final DateTimeFormatter k(r rVar, j$.time.chrono.t tVar) {
        return l(Locale.getDefault(), rVar, tVar);
    }

    public final DateTimeFormatter l(Locale locale, r rVar, j$.time.chrono.t tVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.a.b != null) {
            i();
        }
        d dVar = new d(this.c, false);
        q qVar = q.a;
        return new DateTimeFormatter(dVar, locale, rVar, tVar);
    }
}
