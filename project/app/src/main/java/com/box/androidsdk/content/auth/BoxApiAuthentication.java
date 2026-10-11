/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.auth;

import ax.E3.a;
import com.box.androidsdk.content.BoxException;
import com.box.androidsdk.content.auth.BoxAuthentication;
import com.box.androidsdk.content.models.BoxMDMData;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.requests.BoxRequest;
import com.box.androidsdk.content.requests.BoxResponse;
import com.box.androidsdk.content.utils.SdkUtils;
import java.util.AbstractMap;
import java.util.Locale;

class BoxApiAuthentication
extends a {
    BoxApiAuthentication(BoxSession boxSession) {
        super(boxSession);
        this.b = "https://api.box.com";
    }

    @Override
    protected String b() {
        BoxSession boxSession = this.a;
        if (boxSession != null && boxSession.r() != null && this.a.r().I() != null) {
            return String.format("https://api.%s", this.a.r().I());
        }
        return super.b();
    }

    BoxCreateAuthRequest c(String string, String string2, String string3) {
        return new BoxCreateAuthRequest(this.a, this.d(), string, string2, string3);
    }

    protected String d() {
        return String.format(Locale.ENGLISH, "%s/oauth2/token", this.b());
    }

    BoxRefreshAuthRequest e(String string, String string2, String string3) {
        return new BoxRefreshAuthRequest(this.a, this.d(), string, string2, string3);
    }

    static class BoxCreateAuthRequest
    extends BoxRequest<BoxAuthentication.BoxAuthenticationInfo, BoxCreateAuthRequest> {
        private static final long serialVersionUID = 8123965031279971580L;

        public BoxCreateAuthRequest(BoxSession boxSession, String string, String string2, String string3, String string4) {
            super(BoxAuthentication.BoxAuthenticationInfo.class, string, boxSession);
            this.mRequestMethod = BoxRequest.Methods.c0;
            this.A(BoxRequest.ContentTypes.c0);
            ((AbstractMap)this.mBodyMap).put("grant_type", "authorization_code");
            ((AbstractMap)this.mBodyMap).put("code", string2);
            ((AbstractMap)this.mBodyMap).put("client_id", string3);
            ((AbstractMap)this.mBodyMap).put("client_secret", string4);
            if (boxSession.x() != null) {
                this.E(boxSession.x(), boxSession.y());
            }
            if (boxSession.z() != null) {
                this.F(boxSession.z());
            }
            if (boxSession.C() != null) {
                this.G(boxSession.C());
            }
        }

        public BoxCreateAuthRequest E(String string, String string2) {
            if (!SdkUtils.l(string)) {
                ((AbstractMap)this.mBodyMap).put("box_device_id", string);
            }
            if (!SdkUtils.l(string2)) {
                ((AbstractMap)this.mBodyMap).put("box_device_name", string2);
            }
            return this;
        }

        public BoxCreateAuthRequest F(BoxMDMData boxMDMData) {
            if (boxMDMData != null) {
                ((AbstractMap)this.mBodyMap).put("box_mdm_data", boxMDMData.A());
            }
            return this;
        }

        public BoxCreateAuthRequest G(long l8) {
            ((AbstractMap)this.mBodyMap).put("box_refresh_token_expires_at", Long.toString(l8));
            return this;
        }
    }

    static class BoxRefreshAuthRequest
    extends BoxRequest<BoxAuthentication.BoxAuthenticationInfo, BoxRefreshAuthRequest> {
        private static final long serialVersionUID = 8123965031279971570L;

        public BoxRefreshAuthRequest(BoxSession boxSession, String string, String string2, String string3, String string4) {
            super(BoxAuthentication.BoxAuthenticationInfo.class, string, boxSession);
            this.mContentType = BoxRequest.ContentTypes.c0;
            this.mRequestMethod = BoxRequest.Methods.c0;
            ((AbstractMap)this.mBodyMap).put("grant_type", "refresh_token");
            ((AbstractMap)this.mBodyMap).put("refresh_token", string2);
            ((AbstractMap)this.mBodyMap).put("client_id", string3);
            ((AbstractMap)this.mBodyMap).put("client_secret", string4);
            if (boxSession.x() != null) {
                this.E(boxSession.x(), boxSession.y());
            }
            if (boxSession.C() != null) {
                this.F(boxSession.C());
            }
        }

        public BoxRefreshAuthRequest E(String string, String string2) {
            if (!SdkUtils.l(string)) {
                ((AbstractMap)this.mBodyMap).put("box_device_id", string);
            }
            if (!SdkUtils.l(string2)) {
                ((AbstractMap)this.mBodyMap).put("box_device_name", string2);
            }
            return this;
        }

        public BoxRefreshAuthRequest F(long l8) {
            ((AbstractMap)this.mBodyMap).put("box_refresh_token_expires_at", Long.toString(l8));
            return this;
        }

        @Override
        protected void u(BoxResponse<BoxAuthentication.BoxAuthenticationInfo> boxResponse) throws BoxException {
            super.u(boxResponse);
            if (boxResponse.c()) {
                boxResponse.b().T(this.mSession.D());
            }
        }
    }
}

