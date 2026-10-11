package ax.rd;

import ax.Wc.A;
import ax.Wc.AbstractC1126t;
import ax.Wc.B0;
import ax.Wc.C1113m;
import ax.Wc.C1118o0;
import ax.Wc.InterfaceC1099f;
import ax.Wc.L;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/* loaded from: classes3.dex */
public class n extends AbstractC1126t implements InterfaceC1099f {
    A q;

    public n(A a) {
        if (!(a instanceof L) && !(a instanceof C1113m)) {
            throw new IllegalArgumentException("unknown object passed to Time");
        }
        this.q = a;
    }

    public static n r(Object obj) {
        if (obj == null || (obj instanceof n)) {
            return (n) obj;
        }
        if (obj instanceof L) {
            return new n((L) obj);
        }
        if (obj instanceof C1113m) {
            return new n((C1113m) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    @Override // ax.Wc.AbstractC1126t, ax.Wc.InterfaceC1101g
    public A g() {
        return this.q;
    }

    public String s() {
        A a = this.q;
        return a instanceof L ? ((L) a).D() : ((C1113m) a).J();
    }

    public String toString() {
        return s();
    }

    public n(Date date) {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, "Z");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String str = simpleDateFormat.format(date) + "Z";
        int parseInt = Integer.parseInt(str.substring(0, 4));
        this.q = (parseInt < 1950 || parseInt > 2049) ? new C1118o0(str) : new B0(str.substring(2));
    }
}
