/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content;

import com.box.androidsdk.content.models.BoxError;
import com.box.androidsdk.content.requests.b;
import java.net.ConnectException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;

public class BoxException
extends Exception {
    private static final long serialVersionUID = 1L;
    private b boxHttpResponse;
    private String response;
    private final int responseCode;

    public BoxException(String string) {
        super(string);
        this.responseCode = 0;
        this.boxHttpResponse = null;
        this.response = null;
    }

    public BoxException(String string, int n8, String string2, Throwable throwable) {
        super(string, BoxException.f(throwable));
        this.responseCode = n8;
        this.response = string2;
    }

    public BoxException(String string, b b8) {
        super(string, null);
        this.boxHttpResponse = b8;
        this.responseCode = b8 != null ? b8.f() : 0;
        try {
            this.response = b8.g();
            return;
        }
        catch (Exception exception) {
            this.response = null;
            return;
        }
    }

    public BoxException(String string, Throwable throwable) {
        super(string, BoxException.f(throwable));
        this.responseCode = 0;
        this.response = null;
    }

    private static Throwable f(Throwable throwable) {
        Throwable throwable2 = throwable;
        if (throwable instanceof BoxException) {
            throwable2 = throwable.getCause();
        }
        return throwable2;
    }

    public BoxError b() {
        try {
            BoxError boxError = new BoxError();
            boxError.k(this.d());
            return boxError;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public ErrorType c() {
        if (!(this.getCause() instanceof UnknownHostException) && !(this.getCause() instanceof ConnectException)) {
            if (this instanceof CorruptedContentException) {
                return ErrorType.v0;
            }
            Object object = this.b();
            object = object != null ? ((BoxError)object).D() : null;
            return ErrorType.h((String)object, this.e());
        }
        return ErrorType.p0;
    }

    public String d() {
        return this.response;
    }

    public int e() {
        return this.responseCode;
    }

    public static class CorruptedContentException
    extends BoxException {
        private final String mExpectedSha1;
        private final String mReceivedSha1;

        public CorruptedContentException(String string, String string2, String string3) {
            super(string);
            this.mExpectedSha1 = string2;
            this.mReceivedSha1 = string3;
        }
    }

    public static class DownloadSSLException
    extends BoxException {
        public DownloadSSLException(String string, SSLException sSLException) {
            super(string, sSLException);
        }

        @Override
        public ErrorType c() {
            if (this.getCause() instanceof SSLException) {
                return ErrorType.p0;
            }
            return super.c();
        }
    }

    public static final class ErrorType
    extends Enum<ErrorType> {
        public static final /* enum */ ErrorType c0;
        public static final /* enum */ ErrorType d0;
        public static final /* enum */ ErrorType e0;
        public static final /* enum */ ErrorType f0;
        public static final /* enum */ ErrorType g0;
        public static final /* enum */ ErrorType h0;
        public static final /* enum */ ErrorType i0;
        public static final /* enum */ ErrorType j0;
        public static final /* enum */ ErrorType k0;
        public static final /* enum */ ErrorType l0;
        public static final /* enum */ ErrorType m0;
        public static final /* enum */ ErrorType n0;
        public static final /* enum */ ErrorType o0;
        public static final /* enum */ ErrorType p0;
        public static final /* enum */ ErrorType q;
        public static final /* enum */ ErrorType q0;
        public static final /* enum */ ErrorType r0;
        public static final /* enum */ ErrorType s0;
        public static final /* enum */ ErrorType t0;
        public static final /* enum */ ErrorType u0;
        public static final /* enum */ ErrorType v0;
        public static final /* enum */ ErrorType w0;
        private static final ErrorType[] x0;
        private final int mStatusCode;
        private final String mValue;

        static {
            q = new ErrorType("invalid_grant", 400);
            c0 = new ErrorType("invalid_grant", 400);
            d0 = new ErrorType("account_deactivated", 400);
            e0 = new ErrorType("access_denied", 403);
            f0 = new ErrorType("invalid_request", 400);
            g0 = new ErrorType("invalid_client", 400);
            h0 = new ErrorType("password_reset_required", 400);
            i0 = new ErrorType("terms_of_service_required", 400);
            j0 = new ErrorType("no_credit_card_trial_ended", 400);
            k0 = new ErrorType("temporarily_unavailable", 429);
            l0 = new ErrorType("service_blocked", 400);
            m0 = new ErrorType("service_blocked", 403);
            n0 = new ErrorType("unauthorized_device", 400);
            o0 = new ErrorType("grace_period_expired", 403);
            p0 = new ErrorType("bad_connection_network_error", 0);
            q0 = new ErrorType("access_from_location_blocked", 403);
            r0 = new ErrorType("error_access_from_ip_not_allowed", 403);
            s0 = new ErrorType("unauthorized", 401);
            t0 = new ErrorType("new_owner_not_collaborator", 400);
            u0 = new ErrorType("internal_server_error", 500);
            v0 = new ErrorType("file corrupted", 0);
            w0 = new ErrorType("", 0);
            x0 = ErrorType.d();
        }

        private ErrorType(String string2, int n9) {
            this.mValue = string2;
            this.mStatusCode = n9;
        }

        private static /* synthetic */ ErrorType[] d() {
            return new ErrorType[]{q, c0, d0, e0, f0, g0, h0, i0, j0, k0, l0, m0, n0, o0, p0, q0, r0, s0, t0, u0, v0, w0};
        }

        public static ErrorType h(String string, int n8) {
            if (n8 == 500) {
                return u0;
            }
            for (ErrorType errorType : ErrorType.values()) {
                if (errorType.mStatusCode != n8 || !errorType.mValue.equals(string)) continue;
                return errorType;
            }
            return w0;
        }

        public static ErrorType valueOf(String string) {
            return Enum.valueOf(ErrorType.class, string);
        }

        public static ErrorType[] values() {
            return (ErrorType[])x0.clone();
        }
    }

    public static class MaxAttemptsExceeded
    extends BoxException {
        private final int mTimesTried;

        public MaxAttemptsExceeded(String string, int n8) {
            this(string, n8, null);
        }

        public MaxAttemptsExceeded(String string, int n8, b b8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(n8);
            super(stringBuilder.toString(), b8);
            this.mTimesTried = n8;
        }
    }

    public static class RateLimitAttemptsExceeded
    extends MaxAttemptsExceeded {
        public RateLimitAttemptsExceeded(String string, int n8, b b8) {
            super(string, n8, b8);
        }
    }

    public static class RefreshFailure
    extends BoxException {
        private static final ErrorType[] q = new ErrorType[]{ErrorType.c0, ErrorType.q, ErrorType.e0, ErrorType.j0, ErrorType.l0, ErrorType.m0, ErrorType.g0, ErrorType.n0, ErrorType.o0, ErrorType.s0, ErrorType.d0};

        public RefreshFailure(BoxException boxException) {
            super(boxException.getMessage(), boxException.responseCode, boxException.d(), boxException);
        }

        public boolean g() {
            ErrorType errorType = this.c();
            ErrorType[] errorTypeArray = q;
            int n8 = errorTypeArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                if (errorType != errorTypeArray[i8]) continue;
                return true;
            }
            return false;
        }
    }
}

