/*
 * Decompiled with CFR 0.152.
 */
package ax.O4;

import ax.O4.a;
import ax.O4.b;
import ax.O4.c;
import ax.O4.d;
import ax.O4.e;
import ax.O4.f;
import ax.O4.h;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.Writer;

public abstract class g
implements Serializable {
    public static final g c0;
    public static final g d0;
    public static final g q;

    static {
        q = new b("true");
        c0 = new b("false");
        d0 = new b("null");
    }

    g() {
    }

    private static String l(String string) {
        String string2 = string;
        if (string.endsWith(".0")) {
            string2 = string.substring(0, string.length() - 2);
        }
        return string2;
    }

    public static g s(Reader reader) throws IOException {
        return new e(reader).h();
    }

    public static g t(String object) {
        try {
            e e8 = new e((String)object);
            object = e8.h();
            return object;
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public static g u(float f8) {
        if (!Float.isInfinite(f8) && !Float.isNaN(f8)) {
            return new c(g.l(Float.toString(f8)));
        }
        throw new IllegalArgumentException("Infinite and NaN values not permitted in JSON");
    }

    public static g w(int n8) {
        return new c(Integer.toString(n8, 10));
    }

    public static g x(long l8) {
        return new c(Long.toString(l8, 10));
    }

    public static g y(String string) {
        if (string == null) {
            return d0;
        }
        return new f(string);
    }

    public void A(Writer writer) throws IOException {
        this.z(new h(writer));
    }

    public a e() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not an array: ");
        stringBuilder.append(this.toString());
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public boolean equals(Object object) {
        return super.equals(object);
    }

    public boolean g() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a boolean: ");
        stringBuilder.append(this.toString());
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public double h() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a number: ");
        stringBuilder.append(this.toString());
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public int hashCode() {
        return super.hashCode();
    }

    public d i() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not an object: ");
        stringBuilder.append(this.toString());
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public String k() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a string: ");
        stringBuilder.append(this.toString());
        throw new UnsupportedOperationException(stringBuilder.toString());
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
        h h8 = new h(stringWriter);
        try {
            this.z(h8);
            return stringWriter.toString();
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    protected abstract void z(h var1) throws IOException;
}

