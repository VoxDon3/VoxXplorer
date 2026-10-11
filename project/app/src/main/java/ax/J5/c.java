/*
 * Decompiled with CFR 0.152.
 */
package ax.J5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import ax.J5.s;
import ax.M5.n;
import ax.N5.a;

public final class c
extends a {
    public static final Parcelable.Creator<c> CREATOR;
    public static final c f0;
    private final int c0;
    private final PendingIntent d0;
    private final String e0;
    final int q;

    static {
        f0 = new c(0);
        CREATOR = new s();
    }

    public c(int n8) {
        this(n8, null, null);
    }

    c(int n8, int n9, PendingIntent pendingIntent, String string) {
        this.q = n8;
        this.c0 = n9;
        this.d0 = pendingIntent;
        this.e0 = string;
    }

    public c(int n8, PendingIntent pendingIntent) {
        this(n8, pendingIntent, null);
    }

    public c(int n8, PendingIntent pendingIntent, String string) {
        this(1, n8, pendingIntent, string);
    }

    static String D(int n8) {
        if (n8 != 99) {
            if (n8 != 1500) {
                switch (n8) {
                    default: {
                        switch (n8) {
                            default: {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("UNKNOWN_ERROR_CODE(");
                                stringBuilder.append(n8);
                                stringBuilder.append(")");
                                return stringBuilder.toString();
                            }
                            case 24: {
                                return "API_DISABLED_FOR_CONNECTION";
                            }
                            case 23: {
                                return "API_DISABLED";
                            }
                            case 22: {
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            }
                            case 21: {
                                return "API_VERSION_UPDATE_REQUIRED";
                            }
                            case 20: {
                                return "RESTRICTED_PROFILE";
                            }
                            case 19: {
                                return "SERVICE_MISSING_PERMISSION";
                            }
                            case 18: {
                                return "SERVICE_UPDATING";
                            }
                            case 17: {
                                return "SIGN_IN_FAILED";
                            }
                            case 16: {
                                return "API_UNAVAILABLE";
                            }
                            case 15: {
                                return "INTERRUPTED";
                            }
                            case 14: {
                                return "TIMEOUT";
                            }
                            case 13: 
                        }
                        return "CANCELED";
                    }
                    case 11: {
                        return "LICENSE_CHECK_FAILED";
                    }
                    case 10: {
                        return "DEVELOPER_ERROR";
                    }
                    case 9: {
                        return "SERVICE_INVALID";
                    }
                    case 8: {
                        return "INTERNAL_ERROR";
                    }
                    case 7: {
                        return "NETWORK_ERROR";
                    }
                    case 6: {
                        return "RESOLUTION_REQUIRED";
                    }
                    case 5: {
                        return "INVALID_ACCOUNT";
                    }
                    case 4: {
                        return "SIGN_IN_REQUIRED";
                    }
                    case 3: {
                        return "SERVICE_DISABLED";
                    }
                    case 2: {
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    }
                    case 1: {
                        return "SERVICE_MISSING";
                    }
                    case 0: {
                        return "SUCCESS";
                    }
                    case -1: 
                }
                return "UNKNOWN";
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public boolean B() {
        return this.c0 != 0 && this.d0 != null;
    }

    public boolean C() {
        return this.c0 == 0;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof c)) {
            return false;
        }
        object = (c)object;
        return this.c0 == ((c)object).c0 && n.b(this.d0, ((c)object).d0) && n.b(this.e0, ((c)object).e0);
    }

    public int hashCode() {
        return n.c(this.c0, this.d0, this.e0);
    }

    public int k() {
        return this.c0;
    }

    public String toString() {
        n.a a8 = n.d(this);
        a8.a("statusCode", c.D(this.c0));
        a8.a("resolution", this.d0);
        a8.a("message", this.e0);
        return a8.toString();
    }

    public void writeToParcel(Parcel parcel, int n8) {
        int n9 = this.q;
        int n10 = ax.N5.c.a(parcel);
        ax.N5.c.i(parcel, 1, n9);
        ax.N5.c.i(parcel, 2, this.k());
        ax.N5.c.m(parcel, 3, (Parcelable)this.z(), n8, false);
        ax.N5.c.n(parcel, 4, this.y(), false);
        ax.N5.c.b(parcel, n10);
    }

    public String y() {
        return this.e0;
    }

    public PendingIntent z() {
        return this.d0;
    }
}

