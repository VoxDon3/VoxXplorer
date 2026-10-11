/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import android.os.Bundle;
import ax.S0.d0;

public class F
extends Exception {
    private static final String e0 = ax.S0.d0.G0(0);
    private static final String f0 = ax.S0.d0.G0(1);
    private static final String g0 = ax.S0.d0.G0(2);
    private static final String h0 = ax.S0.d0.G0(3);
    private static final String i0 = ax.S0.d0.G0(4);
    private static final String j0 = ax.S0.d0.G0(5);
    public final long c0;
    public final Bundle d0;
    public final int q;

    protected F(String string, Throwable throwable, int n8, Bundle bundle, long l8) {
        super(string, throwable);
        this.q = n8;
        this.d0 = bundle;
        this.c0 = l8;
    }

    public static String b(int n8) {
        if (n8 != -100) {
            if (n8 != -6) {
                if (n8 != -4) {
                    if (n8 != -3) {
                        if (n8 != -2) {
                            if (n8 != 7000) {
                                if (n8 != 7001) {
                                    switch (n8) {
                                        default: {
                                            switch (n8) {
                                                default: {
                                                    switch (n8) {
                                                        default: {
                                                            switch (n8) {
                                                                default: {
                                                                    switch (n8) {
                                                                        default: {
                                                                            switch (n8) {
                                                                                default: {
                                                                                    switch (n8) {
                                                                                        default: {
                                                                                            if (n8 >= 1000000) {
                                                                                                return "custom error code";
                                                                                            }
                                                                                            return "invalid error code";
                                                                                        }
                                                                                        case 6008: {
                                                                                            return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                                                        }
                                                                                        case 6007: {
                                                                                            return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                                                        }
                                                                                        case 6006: {
                                                                                            return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                                                        }
                                                                                        case 6005: {
                                                                                            return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                                                        }
                                                                                        case 6004: {
                                                                                            return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                                                        }
                                                                                        case 6003: {
                                                                                            return "ERROR_CODE_DRM_CONTENT_ERROR";
                                                                                        }
                                                                                        case 6002: {
                                                                                            return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                                                        }
                                                                                        case 6001: {
                                                                                            return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                                                        }
                                                                                        case 6000: 
                                                                                    }
                                                                                    return "ERROR_CODE_DRM_UNSPECIFIED";
                                                                                }
                                                                                case 5004: {
                                                                                    return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED";
                                                                                }
                                                                                case 5003: {
                                                                                    return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED";
                                                                                }
                                                                                case 5002: {
                                                                                    return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
                                                                                }
                                                                                case 5001: 
                                                                            }
                                                                            return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
                                                                        }
                                                                        case 4006: {
                                                                            return "ERROR_CODE_DECODING_RESOURCES_RECLAIMED";
                                                                        }
                                                                        case 4005: {
                                                                            return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                                                        }
                                                                        case 4004: {
                                                                            return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                                                        }
                                                                        case 4003: {
                                                                            return "ERROR_CODE_DECODING_FAILED";
                                                                        }
                                                                        case 4002: {
                                                                            return "ERROR_CODE_DECODER_QUERY_FAILED";
                                                                        }
                                                                        case 4001: 
                                                                    }
                                                                    return "ERROR_CODE_DECODER_INIT_FAILED";
                                                                }
                                                                case 3004: {
                                                                    return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                                                }
                                                                case 3003: {
                                                                    return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                                                }
                                                                case 3002: {
                                                                    return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                                                }
                                                                case 3001: 
                                                            }
                                                            return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                                        }
                                                        case 2008: {
                                                            return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                                                        }
                                                        case 2007: {
                                                            return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                                                        }
                                                        case 2006: {
                                                            return "ERROR_CODE_IO_NO_PERMISSION";
                                                        }
                                                        case 2005: {
                                                            return "ERROR_CODE_IO_FILE_NOT_FOUND";
                                                        }
                                                        case 2004: {
                                                            return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                                                        }
                                                        case 2003: {
                                                            return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                                                        }
                                                        case 2002: {
                                                            return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                                                        }
                                                        case 2001: {
                                                            return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                                                        }
                                                        case 2000: 
                                                    }
                                                    return "ERROR_CODE_IO_UNSPECIFIED";
                                                }
                                                case 1004: {
                                                    return "ERROR_CODE_FAILED_RUNTIME_CHECK";
                                                }
                                                case 1003: {
                                                    return "ERROR_CODE_TIMEOUT";
                                                }
                                                case 1002: {
                                                    return "ERROR_CODE_BEHIND_LIVE_WINDOW";
                                                }
                                                case 1001: {
                                                    return "ERROR_CODE_REMOTE_ERROR";
                                                }
                                                case 1000: 
                                            }
                                            return "ERROR_CODE_UNSPECIFIED";
                                        }
                                        case -102: {
                                            return "ERROR_CODE_AUTHENTICATION_EXPIRED";
                                        }
                                        case -103: {
                                            return "ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED";
                                        }
                                        case -104: {
                                            return "ERROR_CODE_CONCURRENT_STREAM_LIMIT";
                                        }
                                        case -105: {
                                            return "ERROR_CODE_PARENTAL_CONTROL_RESTRICTED";
                                        }
                                        case -106: {
                                            return "ERROR_CODE_NOT_AVAILABLE_IN_REGION";
                                        }
                                        case -107: {
                                            return "ERROR_CODE_SKIP_LIMIT_REACHED";
                                        }
                                        case -108: {
                                            return "ERROR_CODE_SETUP_REQUIRED";
                                        }
                                        case -109: {
                                            return "ERROR_CODE_END_OF_PLAYLIST";
                                        }
                                        case -110: 
                                    }
                                    return "ERROR_CODE_CONTENT_ALREADY_PLAYING";
                                }
                                return "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
                            }
                            return "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
                        }
                        return "ERROR_CODE_INVALID_STATE";
                    }
                    return "ERROR_CODE_BAD_VALUE";
                }
                return "ERROR_CODE_PERMISSION_DENIED";
            }
            return "ERROR_CODE_NOT_SUPPORTED";
        }
        return "ERROR_CODE_DISCONNECTED";
    }

    public final String a() {
        return F.b(this.q);
    }
}

