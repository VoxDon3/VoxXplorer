/*
 * Decompiled with CFR 0.152.
 */
package ax.rb;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public class d
extends IOException {
    private Throwable q;

    public d() {
    }

    public d(String string) {
        super(string);
    }

    public d(String string, Throwable throwable) {
        super(string);
        this.q = throwable;
    }

    public d(Throwable throwable) {
        this.q = throwable;
    }

    public Throwable a() {
        return this.q;
    }

    @Override
    public String toString() {
        if (this.q != null) {
            StringWriter stringWriter = new StringWriter();
            Appendable appendable = new PrintWriter(stringWriter);
            this.q.printStackTrace((PrintWriter)appendable);
            appendable = new StringBuilder();
            ((StringBuilder)appendable).append(super.toString());
            ((StringBuilder)appendable).append("\n");
            ((StringBuilder)appendable).append(stringWriter);
            return ((StringBuilder)appendable).toString();
        }
        return super.toString();
    }
}

