package ax.O4;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes.dex */
public abstract class g implements Serializable {
    public static final g q = new b("true");
    public static final g c0 = new b("false");
    public static final g d0 = new b("null");

    g() {
    }

    private static String l(String str) {
        return str.endsWith(".0") ? str.substring(0, str.length() - 2) : str;
    }

    public static g s(Reader reader) throws IOException {
        return new e(reader).h();
    }

    public static g t(String str) {
        try {
            return new e(str).h();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static g u(float f) {
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            throw new IllegalArgumentException("Infinite and NaN values not permitted in JSON");
        }
        return new c(l(Float.toString(f)));
    }

    public static g w(int i) {
        return new c(Integer.toString(i, 10));
    }

    public static g x(long j) {
        return new c(Long.toString(j, 10));
    }

    public static g y(String str) {
        return str == null ? d0 : new f(str);
    }

    public void A(Writer writer) throws IOException {
        z(new h(writer));
    }

    public a e() {
        throw new UnsupportedOperationException("Not an array: " + toString());
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean g() {
        throw new UnsupportedOperationException("Not a boolean: " + toString());
    }

    public double h() {
        throw new UnsupportedOperationException("Not a number: " + toString());
    }

    public int hashCode() {
        return super.hashCode();
    }

    public d i() {
        throw new UnsupportedOperationException("Not an object: " + toString());
    }

    public String k() {
        throw new UnsupportedOperationException("Not a string: " + toString());
    }

    public boolean n() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean q() {
        return false;
    }

    public boolean r() {
        return false;
    }

    public String toString() {
        StringWriter stringWriter = new StringWriter();
        try {
            z(new h(stringWriter));
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected abstract void z(h hVar) throws IOException;
}
