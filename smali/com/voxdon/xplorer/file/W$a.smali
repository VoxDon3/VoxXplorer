.class public Lcom/voxdon/xplorer/file/W$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/file/W;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Z

.field public b:Ljava/security/cert/X509Certificate;


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public a(Landroid/content/Context;Lax/Z2/o;)V
    .registers 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p1}, Lcom/voxdon/xplorer/file/W;->J0(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Lcom/voxdon/xplorer/file/W;->m0(Lax/Z2/o;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p2, "/"

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :try_start_1a
    new-instance p2, Ljava/net/URL;

    .line 28
    .line 29
    invoke-direct {p2, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    check-cast p2, Ljavax/net/ssl/HttpsURLConnection;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/net/URLConnection;->connect()V

    .line 39
    .line 40
    .line 41
    iput-boolean v1, p0, Lcom/voxdon/xplorer/file/W$a;->a:Z

    .line 42
    .line 43
    invoke-virtual {p2}, Ljavax/net/ssl/HttpsURLConnection;->getServerCertificates()[Ljava/security/cert/Certificate;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    array-length v3, v2

    .line 48
    const/4 v4, 0x0

    .line 49
    :goto_30
    if-ge v4, v3, :cond_3f

    .line 50
    .line 51
    aget-object v5, v2, v4

    .line 52
    .line 53
    instance-of v6, v5, Ljava/security/cert/X509Certificate;

    .line 54
    .line 55
    if-eqz v6, :cond_3d

    .line 56
    .line 57
    check-cast v5, Ljava/security/cert/X509Certificate;

    .line 58
    .line 59
    iput-object v5, p0, Lcom/voxdon/xplorer/file/W$a;->b:Ljava/security/cert/X509Certificate;

    .line 60
    .line 61
    goto :goto_3f

    .line 62
    :cond_3d
    add-int/2addr v4, v1

    .line 63
    goto :goto_30

    .line 64
    :cond_3f
    :goto_3f
    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_42
    .catch Ljavax/net/ssl/SSLHandshakeException; {:try_start_1a .. :try_end_42} :catch_46
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_1a .. :try_end_42} :catch_46
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_42} :catch_43
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_42} :catch_85

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :catch_43
    :try_start_43
    iput-boolean v0, p0, Lcom/voxdon/xplorer/file/W$a;->a:Z

    .line 69
    .line 70
    goto :goto_85

    .line 71
    :catch_46
    iput-boolean v0, p0, Lcom/voxdon/xplorer/file/W$a;->a:Z

    .line 72
    .line 73
    new-instance p2, Lcom/voxdon/xplorer/file/W$a$a;

    .line 74
    .line 75
    invoke-direct {p2, p0}, Lcom/voxdon/xplorer/file/W$a$a;-><init>(Lcom/voxdon/xplorer/file/W$a;)V

    .line 76
    .line 77
    .line 78
    new-array v1, v1, [Ljavax/net/ssl/TrustManager;

    .line 79
    .line 80
    aput-object p2, v1, v0

    .line 81
    .line 82
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 83
    .line 84
    const/16 v0, 0x1c

    .line 85
    .line 86
    if-gt p2, v0, :cond_5e

    .line 87
    .line 88
    const-string p2, "TLSv1.2"

    .line 89
    .line 90
    invoke-static {p2}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    goto :goto_64

    .line 95
    :cond_5e
    const-string p2, "TLSv1.3"

    .line 96
    .line 97
    invoke-static {p2}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    :goto_64
    new-instance v0, Ljava/security/SecureRandom;

    .line 102
    .line 103
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 104
    .line 105
    .line 106
    const/4 v2, 0x0

    .line 107
    invoke-virtual {p2, v2, v1, v0}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 108
    .line 109
    .line 110
    new-instance v0, Ljava/net/URL;

    .line 111
    .line 112
    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    check-cast p1, Ljavax/net/ssl/HttpsURLConnection;

    .line 120
    .line 121
    invoke-virtual {p2}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    invoke-virtual {p1, p2}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_85
    .catch Ljava/lang/Exception; {:try_start_43 .. :try_end_85} :catch_85

    .line 132
    .line 133
    .line 134
    :catch_85
    :goto_85
    return-void
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method
