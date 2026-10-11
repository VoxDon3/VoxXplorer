package ax.J5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import ax.M5.C0819n;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* renamed from: ax.J5.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0742c extends ax.N5.a {
    private final int c0;
    private final PendingIntent d0;
    private final String e0;
    final int q;
    public static final C0742c f0 = new C0742c(0);
    public static final Parcelable.Creator<C0742c> CREATOR = new s();

    C0742c(int i, int i2, PendingIntent pendingIntent, String str) {
        this.q = i;
        this.c0 = i2;
        this.d0 = pendingIntent;
        this.e0 = str;
    }

    static String D(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case SubsamplingScaleImageView.ORIENTATION_USE_EXIF /* -1 */:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i + ")";
                }
        }
    }

    public boolean B() {
        return (this.c0 == 0 || this.d0 == null) ? false : true;
    }

    public boolean C() {
        return this.c0 == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0742c)) {
            return false;
        }
        C0742c c0742c = (C0742c) obj;
        return this.c0 == c0742c.c0 && C0819n.b(this.d0, c0742c.d0) && C0819n.b(this.e0, c0742c.e0);
    }

    public int hashCode() {
        return C0819n.c(Integer.valueOf(this.c0), this.d0, this.e0);
    }

    public int k() {
        return this.c0;
    }

    public String toString() {
        C0819n.a d = C0819n.d(this);
        d.a("statusCode", D(this.c0));
        d.a("resolution", this.d0);
        d.a("message", this.e0);
        return d.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.q;
        int a = ax.N5.c.a(parcel);
        ax.N5.c.i(parcel, 1, i2);
        ax.N5.c.i(parcel, 2, k());
        ax.N5.c.m(parcel, 3, z(), i, false);
        ax.N5.c.n(parcel, 4, y(), false);
        ax.N5.c.b(parcel, a);
    }

    public String y() {
        return this.e0;
    }

    public PendingIntent z() {
        return this.d0;
    }

    public C0742c(int i) {
        this(i, null, null);
    }

    public C0742c(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public C0742c(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}
