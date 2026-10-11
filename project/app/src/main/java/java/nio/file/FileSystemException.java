/*
 * Decompiled with CFR 0.152.
 */
package java.nio.file;

import java.io.IOException;

public abstract class FileSystemException
extends IOException {
    private final String a;
    private final String b;

    public FileSystemException(String string) {
        super((String)null);
        this.a = string;
        this.b = null;
    }

    public FileSystemException(String string, String string2, String string3) {
        super(string3);
        this.a = string;
        this.b = string2;
    }

    public String getFile() {
        return this.a;
    }

    @Override
    public String getMessage() {
        if (this.a == null && this.b == null) {
            return this.getReason();
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (this.a != null) {
            stringBuilder.append(this.a);
        }
        if (this.b != null) {
            stringBuilder.append(" -> ");
            stringBuilder.append(this.b);
        }
        if (this.getReason() != null) {
            stringBuilder.append(": ");
            stringBuilder.append(this.getReason());
        }
        return stringBuilder.toString();
    }

    public String getOtherFile() {
        return this.b;
    }

    public String getReason() {
        return super.getMessage();
    }
}

