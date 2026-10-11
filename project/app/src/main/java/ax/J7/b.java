/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import ax.J7.u;
import ax.L7.F;
import java.io.File;

final class b
extends u {
    private final F a;
    private final String b;
    private final File c;

    b(F f8, String string, File file) {
        if (f8 != null) {
            this.a = f8;
            if (string != null) {
                this.b = string;
                if (file != null) {
                    this.c = file;
                    return;
                }
                throw new NullPointerException("Null reportFile");
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    @Override
    public F b() {
        return this.a;
    }

    @Override
    public File c() {
        return this.c;
    }

    @Override
    public String d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof u && this.a.equals(((u)(object = (u)object)).b()) && this.b.equals(((u)object).d()) && this.c.equals(((u)object).c());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CrashlyticsReportWithSessionId{report=");
        stringBuilder.append(this.a);
        stringBuilder.append(", sessionId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", reportFile=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

