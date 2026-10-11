/*
 * Decompiled with CFR 0.152.
 */
package ax.B2;

import android.app.Notification;

public final class e {
    private final int a;
    private final int b;
    private final Notification c;

    public e(int n8, Notification notification, int n9) {
        this.a = n8;
        this.c = notification;
        this.b = n9;
    }

    public int a() {
        return this.b;
    }

    public Notification b() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && e.class == object.getClass()) {
            object = (e)object;
            if (this.a != ((e)object).a) {
                return false;
            }
            if (this.b != ((e)object).b) {
                return false;
            }
            return this.c.equals(((e)object).c);
        }
        return false;
    }

    public int hashCode() {
        return (this.a * 31 + this.b) * 31 + this.c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ForegroundInfo{");
        stringBuilder.append("mNotificationId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", mForegroundServiceType=");
        stringBuilder.append(this.b);
        stringBuilder.append(", mNotification=");
        stringBuilder.append(this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

