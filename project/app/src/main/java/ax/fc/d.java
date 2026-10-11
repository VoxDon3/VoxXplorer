/*
 * Decompiled with CFR 0.152.
 */
package ax.fc;

import ax.cc.c;
import ax.kc.f;
import java.lang.reflect.Method;

public class d {
    private Throwable a;
    private String b;
    private Method c;
    private Object d;
    private c e;
    private Object f;

    public d() {
    }

    public d(Throwable throwable, String string) {
        this.a = throwable;
        this.b = string;
    }

    public d(Throwable throwable, String string, c c8) {
        this.a = throwable;
        this.b = string;
    }

    public d(Throwable throwable, String string, f f8) {
        this.a = throwable;
        this.b = string;
        this.c = f8.a().f();
    }

    public d(Throwable object, String string, Method method, Object object2, c c8) {
        this.a = object;
        this.b = string;
        this.c = method;
        this.d = object2;
        this.e = c8;
        object = c8 != null ? c8.a() : null;
        this.f = object;
    }

    public Throwable a() {
        return this.a;
    }

    public Object b() {
        return this.f;
    }

    public d c(Throwable throwable) {
        this.a = throwable;
        return this;
    }

    public d d(String string) {
        this.b = string;
        return this;
    }

    public d e(c c8) {
        this.e = c8;
        return this;
    }

    public d f(Object object) {
        this.f = object;
        return this;
    }

    public String toString() {
        String string = System.getProperty("line.separator");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PublicationError{");
        stringBuilder.append(string);
        stringBuilder.append("\tcause=");
        stringBuilder.append(this.a);
        stringBuilder.append(string);
        stringBuilder.append("\tmessage='");
        stringBuilder.append(this.b);
        stringBuilder.append('\'');
        stringBuilder.append(string);
        stringBuilder.append("\thandler=");
        stringBuilder.append(this.c);
        stringBuilder.append(string);
        stringBuilder.append("\tlistener=");
        stringBuilder.append(this.d);
        stringBuilder.append(string);
        stringBuilder.append("\tpublishedMessage=");
        stringBuilder.append(this.b());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

