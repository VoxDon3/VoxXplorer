.class public Lcom/box/androidsdk/content/models/BoxSession;
.super Lcom/box/androidsdk/content/models/BoxObject;
.source "SourceFile"

# interfaces
.implements Lcom/box/androidsdk/content/auth/BoxAuthentication$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;,
        Lcom/box/androidsdk/content/models/BoxSession$BoxSessionRefreshRequest;
    }
.end annotation


# static fields
.field private static final transient e0:Ljava/util/concurrent/ThreadPoolExecutor;

.field private static final serialVersionUID:J = 0x70ba56f6f63fd99dL


# instance fields
.field private transient c0:Lcom/box/androidsdk/content/auth/BoxAuthentication$e;

.field private transient d0:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lax/E3/h<",
            "Lcom/box/androidsdk/content/models/BoxSession;",
            ">;>;"
        }
    .end annotation
.end field

.field protected mAccountEmail:Ljava/lang/String;

.field protected mAuthInfo:Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

.field protected mClientId:Ljava/lang/String;

.field protected mClientRedirectUrl:Ljava/lang/String;

.field protected mClientSecret:Ljava/lang/String;

.field protected mDeviceId:Ljava/lang/String;

.field protected mDeviceName:Ljava/lang/String;

.field protected mEnableBoxAppAuthentication:Z

.field protected mExpiresAt:Ljava/lang/Long;

.field private mLastAuthCreationTaskId:Ljava/lang/String;

.field protected mMDMData:Lcom/box/androidsdk/content/models/BoxMDMData;

.field protected mRefreshProvider:Lcom/box/androidsdk/content/auth/BoxAuthentication$g;

.field private mSuppressAuthErrorUIAfterLogin:Z

.field private mUserAgent:Ljava/lang/String;

.field private mUserId:Ljava/lang/String;

.field private transient q:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .registers 5

    .line 1
    const-wide/16 v0, 0xe10

    .line 2
    .line 3
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    const/16 v4, 0x14

    .line 7
    .line 8
    invoke-static {v3, v4, v0, v1, v2}, Lcom/box/androidsdk/content/utils/SdkUtils;->f(IIJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ThreadPoolExecutor;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lcom/box/androidsdk/content/models/BoxSession;->e0:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;Lcom/box/androidsdk/content/auth/BoxAuthentication$g;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lcom/box/androidsdk/content/auth/BoxAuthentication$g;",
            ":",
            "Ljava/io/Serializable;",
            ">(",
            "Landroid/content/Context;",
            "Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;",
            "TE;)V"
        }
    .end annotation

    .line 25
    invoke-direct {p0}, Lcom/box/androidsdk/content/models/BoxObject;-><init>()V

    .line 26
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "com.box.sdk.android/"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lax/E3/g;->j:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/box/androidsdk/content/models/BoxSession;->mUserAgent:Ljava/lang/String;

    .line 27
    sget-object p3, Lax/E3/g;->i:Landroid/content/Context;

    iput-object p3, p0, Lcom/box/androidsdk/content/models/BoxSession;->q:Landroid/content/Context;

    const/4 p3, 0x0

    .line 28
    iput-boolean p3, p0, Lcom/box/androidsdk/content/models/BoxSession;->mSuppressAuthErrorUIAfterLogin:Z

    .line 29
    sget-boolean p3, Lax/E3/g;->e:Z

    iput-boolean p3, p0, Lcom/box/androidsdk/content/models/BoxSession;->mEnableBoxAppAuthentication:Z

    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/box/androidsdk/content/models/BoxSession;->q:Landroid/content/Context;

    .line 31
    invoke-virtual {p0, p2}, Lcom/box/androidsdk/content/models/BoxSession;->N(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;)V

    .line 32
    invoke-virtual {p0}, Lcom/box/androidsdk/content/models/BoxSession;->T()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .registers 9

    .line 1
    sget-object v3, Lax/E3/g;->c:Ljava/lang/String;

    sget-object v4, Lax/E3/g;->d:Ljava/lang/String;

    sget-object v5, Lax/E3/g;->f:Ljava/lang/String;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/box/androidsdk/content/models/BoxSession;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    sget-object p1, Lax/E3/g;->g:Ljava/lang/String;

    invoke-static {p1}, Lcom/box/androidsdk/content/utils/SdkUtils;->l(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_19

    .line 3
    sget-object p1, Lax/E3/g;->g:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/box/androidsdk/content/models/BoxSession;->Q(Ljava/lang/String;)V

    .line 4
    :cond_19
    sget-object p1, Lax/E3/g;->h:Ljava/lang/String;

    invoke-static {p1}, Lcom/box/androidsdk/content/utils/SdkUtils;->l(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_26

    .line 5
    sget-object p1, Lax/E3/g;->h:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/box/androidsdk/content/models/BoxSession;->Q(Ljava/lang/String;)V

    :cond_26
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/box/androidsdk/content/auth/BoxAuthentication$g;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lcom/box/androidsdk/content/auth/BoxAuthentication$g;",
            ":",
            "Ljava/io/Serializable;",
            ">(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "TE;)V"
        }
    .end annotation

    .line 33
    invoke-static {p2}, Lcom/box/androidsdk/content/models/BoxSession;->p(Ljava/lang/String;)Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, Lcom/box/androidsdk/content/models/BoxSession;-><init>(Landroid/content/Context;Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;Lcom/box/androidsdk/content/auth/BoxAuthentication$g;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .registers 8

    .line 6
    invoke-direct {p0}, Lcom/box/androidsdk/content/models/BoxObject;-><init>()V

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "com.box.sdk.android/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lax/E3/g;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->mUserAgent:Ljava/lang/String;

    .line 8
    sget-object v0, Lax/E3/g;->i:Landroid/content/Context;

    iput-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->q:Landroid/content/Context;

    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->mSuppressAuthErrorUIAfterLogin:Z

    .line 10
    sget-boolean v0, Lax/E3/g;->e:Z

    iput-boolean v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->mEnableBoxAppAuthentication:Z

    .line 11
    iput-object p3, p0, Lcom/box/androidsdk/content/models/BoxSession;->mClientId:Ljava/lang/String;

    .line 12
    iput-object p4, p0, Lcom/box/androidsdk/content/models/BoxSession;->mClientSecret:Ljava/lang/String;

    .line 13
    iput-object p5, p0, Lcom/box/androidsdk/content/models/BoxSession;->mClientRedirectUrl:Ljava/lang/String;

    .line 14
    invoke-virtual {p0}, Lcom/box/androidsdk/content/models/BoxSession;->B()Lcom/box/androidsdk/content/auth/BoxAuthentication$g;

    iget-object p3, p0, Lcom/box/androidsdk/content/models/BoxSession;->mClientId:Ljava/lang/String;

    invoke-static {p3}, Lcom/box/androidsdk/content/utils/SdkUtils;->l(Ljava/lang/String;)Z

    move-result p3

    if-nez p3, :cond_6c

    iget-object p3, p0, Lcom/box/androidsdk/content/models/BoxSession;->mClientSecret:Ljava/lang/String;

    invoke-static {p3}, Lcom/box/androidsdk/content/utils/SdkUtils;->l(Ljava/lang/String;)Z

    move-result p3

    if-nez p3, :cond_6c

    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p3

    iput-object p3, p0, Lcom/box/androidsdk/content/models/BoxSession;->q:Landroid/content/Context;

    .line 16
    invoke-static {p2}, Lcom/box/androidsdk/content/utils/SdkUtils;->l(Ljava/lang/String;)Z

    move-result p3

    if-nez p3, :cond_54

    .line 17
    invoke-static {}, Lcom/box/androidsdk/content/auth/BoxAuthentication;->o()Lcom/box/androidsdk/content/auth/BoxAuthentication;

    move-result-object p3

    invoke-virtual {p3, p2, p1}, Lcom/box/androidsdk/content/auth/BoxAuthentication;->l(Ljava/lang/String;Landroid/content/Context;)Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    move-result-object p1

    iput-object p1, p0, Lcom/box/androidsdk/content/models/BoxSession;->mAuthInfo:Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 18
    iput-object p2, p0, Lcom/box/androidsdk/content/models/BoxSession;->mUserId:Ljava/lang/String;

    .line 19
    :cond_54
    iget-object p1, p0, Lcom/box/androidsdk/content/models/BoxSession;->mAuthInfo:Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    if-nez p1, :cond_61

    .line 20
    iput-object p2, p0, Lcom/box/androidsdk/content/models/BoxSession;->mUserId:Ljava/lang/String;

    .line 21
    new-instance p1, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    invoke-direct {p1}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;-><init>()V

    iput-object p1, p0, Lcom/box/androidsdk/content/models/BoxSession;->mAuthInfo:Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 22
    :cond_61
    iget-object p1, p0, Lcom/box/androidsdk/content/models/BoxSession;->mAuthInfo:Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    iget-object p2, p0, Lcom/box/androidsdk/content/models/BoxSession;->mClientId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;->P(Ljava/lang/String;)V

    .line 23
    invoke-virtual {p0}, Lcom/box/androidsdk/content/models/BoxSession;->T()V

    return-void

    .line 24
    :cond_6c
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Session must have a valid client id and client secret specified."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private K(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;)Z
    .registers 3

    .line 1
    if-eqz p1, :cond_22

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;->K()Lcom/box/androidsdk/content/models/BoxUser;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_22

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/box/androidsdk/content/models/BoxSession;->G()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_22

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/box/androidsdk/content/models/BoxSession;->G()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;->K()Lcom/box/androidsdk/content/models/BoxUser;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Lcom/box/androidsdk/content/models/BoxEntity;->G()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_22

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    return p1

    .line 35
    :cond_22
    const/4 p1, 0x0

    .line 36
    return p1
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private static W(Landroid/content/Context;I)V
    .registers 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, p1, v0}, Lcom/box/androidsdk/content/utils/SdkUtils;->t(Landroid/content/Context;II)V

    .line 3
    .line 4
    .line 5
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method static synthetic i(Lcom/box/androidsdk/content/models/BoxSession;)Z
    .registers 1

    .line 1
    iget-boolean p0, p0, Lcom/box/androidsdk/content/models/BoxSession;->mSuppressAuthErrorUIAfterLogin:Z

    .line 2
    .line 3
    return p0
    .line 4
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
    .line 22
.end method

.method static synthetic k(Landroid/content/Context;I)V
    .registers 2

    .line 1
    invoke-static {p0, p1}, Lcom/box/androidsdk/content/models/BoxSession;->W(Landroid/content/Context;I)V

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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private static p(Ljava/lang/String;)Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;
    .registers 2

    .line 1
    new-instance v0, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;->N(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-object v0
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
    .line 22
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lax/E3/g;->i:Landroid/content/Context;

    .line 5
    .line 6
    if-eqz p1, :cond_a

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/box/androidsdk/content/models/BoxSession;->M(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    :cond_a
    return-void
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
    .line 22
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

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
    .line 22
.end method


# virtual methods
.method public A()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->mClientRedirectUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
    .line 4
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

.method public B()Lcom/box/androidsdk/content/auth/BoxAuthentication$g;
    .registers 2

    .line 1
    invoke-static {}, Lcom/box/androidsdk/content/auth/BoxAuthentication;->o()Lcom/box/androidsdk/content/auth/BoxAuthentication;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/box/androidsdk/content/auth/BoxAuthentication;->q()Lcom/box/androidsdk/content/auth/BoxAuthentication$g;

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    return-object v0
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

.method public C()Ljava/lang/Long;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->mExpiresAt:Ljava/lang/Long;

    .line 2
    .line 3
    return-object v0
    .line 4
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

.method public D()Lcom/box/androidsdk/content/models/BoxUser;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->mAuthInfo:Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;->K()Lcom/box/androidsdk/content/models/BoxUser;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public E()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->mUserAgent:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
    .line 4
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

.method public G()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->mUserId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
    .line 4
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

.method public I()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->mEnableBoxAppAuthentication:Z

    .line 2
    .line 3
    return v0
    .line 4
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

.method public J()Lax/E3/h;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lax/E3/h<",
            "Lcom/box/androidsdk/content/models/BoxSession;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->d0:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_1f

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1f

    .line 10
    .line 11
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->d0:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lax/E3/h;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/concurrent/FutureTask;->isCancelled()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_1f

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/concurrent/FutureTask;->isDone()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1f

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_1f
    new-instance v0, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionRefreshRequest;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionRefreshRequest;-><init>(Lcom/box/androidsdk/content/models/BoxSession;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/box/androidsdk/content/requests/BoxRequest;->D()Lax/E3/h;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v1, Lcom/box/androidsdk/content/models/BoxSession$a;

    .line 42
    .line 43
    invoke-direct {v1, p0, v0}, Lcom/box/androidsdk/content/models/BoxSession$a;-><init>(Lcom/box/androidsdk/content/models/BoxSession;Lax/E3/h;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 47
    .line 48
    .line 49
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 50
    .line 51
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iput-object v1, p0, Lcom/box/androidsdk/content/models/BoxSession;->d0:Ljava/lang/ref/WeakReference;

    .line 55
    .line 56
    return-object v0
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public M(Landroid/content/Context;)V
    .registers 2

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/box/androidsdk/content/models/BoxSession;->q:Landroid/content/Context;

    .line 6
    .line 7
    return-void
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
    .line 22
.end method

.method protected N(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;)V
    .registers 3

    .line 1
    if-nez p1, :cond_f

    .line 2
    .line 3
    new-instance p1, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 4
    .line 5
    invoke-direct {p1}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/box/androidsdk/content/models/BoxSession;->mAuthInfo:Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->mClientId:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;->P(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    goto :goto_11

    .line 16
    :cond_f
    iput-object p1, p0, Lcom/box/androidsdk/content/models/BoxSession;->mAuthInfo:Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 17
    .line 18
    :goto_11
    iget-object p1, p0, Lcom/box/androidsdk/content/models/BoxSession;->mAuthInfo:Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;->K()Lcom/box/androidsdk/content/models/BoxUser;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_37

    .line 25
    .line 26
    iget-object p1, p0, Lcom/box/androidsdk/content/models/BoxSession;->mAuthInfo:Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;->K()Lcom/box/androidsdk/content/models/BoxUser;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Lcom/box/androidsdk/content/models/BoxEntity;->G()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Lcom/box/androidsdk/content/utils/SdkUtils;->k(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_37

    .line 41
    .line 42
    iget-object p1, p0, Lcom/box/androidsdk/content/models/BoxSession;->mAuthInfo:Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;->K()Lcom/box/androidsdk/content/models/BoxUser;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Lcom/box/androidsdk/content/models/BoxEntity;->G()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0, p1}, Lcom/box/androidsdk/content/models/BoxSession;->S(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_37
    const/4 p1, 0x0

    .line 57
    invoke-virtual {p0, p1}, Lcom/box/androidsdk/content/models/BoxSession;->S(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void
    .line 61
.end method

.method public O(Ljava/lang/String;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/box/androidsdk/content/models/BoxSession;->mAccountEmail:Ljava/lang/String;

    .line 2
    .line 3
    return-void
    .line 4
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
    .line 22
.end method

.method public P(Ljava/lang/String;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/box/androidsdk/content/models/BoxSession;->mDeviceId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
    .line 4
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
    .line 22
.end method

.method public Q(Ljava/lang/String;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/box/androidsdk/content/models/BoxSession;->mDeviceName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
    .line 4
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
    .line 22
.end method

.method public R(Lcom/box/androidsdk/content/auth/BoxAuthentication$e;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/box/androidsdk/content/models/BoxSession;->c0:Lcom/box/androidsdk/content/auth/BoxAuthentication$e;

    .line 2
    .line 3
    return-void
    .line 4
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
    .line 22
.end method

.method protected S(Ljava/lang/String;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/box/androidsdk/content/models/BoxSession;->mUserId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
    .line 4
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
    .line 22
.end method

.method protected T()V
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    iget-object v1, p0, Lcom/box/androidsdk/content/models/BoxSession;->q:Landroid/content/Context;

    .line 3
    .line 4
    if-eqz v1, :cond_2c

    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_2c

    .line 11
    .line 12
    sget-object v1, Lax/E3/g;->i:Landroid/content/Context;

    .line 13
    .line 14
    if-nez v1, :cond_13

    .line 15
    .line 16
    iget-object v1, p0, Lcom/box/androidsdk/content/models/BoxSession;->q:Landroid/content/Context;

    .line 17
    .line 18
    sput-object v1, Lax/E3/g;->i:Landroid/content/Context;

    .line 19
    .line 20
    :cond_13
    iget-object v1, p0, Lcom/box/androidsdk/content/models/BoxSession;->q:Landroid/content/Context;

    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v2, p0, Lcom/box/androidsdk/content/models/BoxSession;->q:Landroid/content/Context;

    .line 27
    .line 28
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v1, v2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 37
    .line 38
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I
    :try_end_27
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_27} :catch_2c

    .line 39
    .line 40
    and-int/lit8 v1, v1, 0x2

    .line 41
    .line 42
    if-eqz v1, :cond_2c

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    :catch_2c
    :cond_2c
    sput-boolean v0, Lax/E3/g;->b:Z

    .line 46
    .line 47
    invoke-static {}, Lcom/box/androidsdk/content/auth/BoxAuthentication;->o()Lcom/box/androidsdk/content/auth/BoxAuthentication;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0, p0}, Lcom/box/androidsdk/content/auth/BoxAuthentication;->g(Lcom/box/androidsdk/content/auth/BoxAuthentication$e;)V

    .line 52
    .line 53
    .line 54
    return-void
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method protected U()V
    .registers 2

    .line 1
    invoke-static {}, Lcom/box/androidsdk/content/auth/BoxAuthentication;->o()Lcom/box/androidsdk/content/auth/BoxAuthentication;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lcom/box/androidsdk/content/auth/BoxAuthentication;->y(Lcom/box/androidsdk/content/models/BoxSession;)V

    .line 6
    .line 7
    .line 8
    return-void
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

.method public V()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->mSuppressAuthErrorUIAfterLogin:Z

    .line 2
    .line 3
    return v0
    .line 4
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

.method public e(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;Ljava/lang/Exception;)V
    .registers 4

    .line 1
    invoke-direct {p0, p1}, Lcom/box/androidsdk/content/models/BoxSession;->K(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_10

    .line 6
    .line 7
    if-nez p1, :cond_f

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/box/androidsdk/content/models/BoxSession;->G()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_34

    .line 14
    .line 15
    goto :goto_10

    .line 16
    :cond_f
    return-void

    .line 17
    :cond_10
    :goto_10
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->c0:Lcom/box/androidsdk/content/auth/BoxAuthentication$e;

    .line 18
    .line 19
    if-eqz v0, :cond_17

    .line 20
    .line 21
    invoke-interface {v0, p1, p2}, Lcom/box/androidsdk/content/auth/BoxAuthentication$e;->e(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;Ljava/lang/Exception;)V

    .line 22
    .line 23
    .line 24
    :cond_17
    instance-of p1, p2, Lcom/box/androidsdk/content/BoxException;

    .line 25
    .line 26
    if-eqz p1, :cond_34

    .line 27
    .line 28
    check-cast p2, Lcom/box/androidsdk/content/BoxException;

    .line 29
    .line 30
    invoke-virtual {p2}, Lcom/box/androidsdk/content/BoxException;->c()Lcom/box/androidsdk/content/BoxException$ErrorType;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget-object p2, Lcom/box/androidsdk/content/models/BoxSession$b;->a:[I

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    aget p1, p2, p1

    .line 41
    .line 42
    const/4 p2, 0x1

    .line 43
    if-eq p1, p2, :cond_2d

    .line 44
    .line 45
    goto :goto_34

    .line 46
    :cond_2d
    iget-object p1, p0, Lcom/box/androidsdk/content/models/BoxSession;->q:Landroid/content/Context;

    .line 47
    .line 48
    sget p2, Lax/I3/d;->p:I

    .line 49
    .line 50
    invoke-static {p1, p2}, Lcom/box/androidsdk/content/models/BoxSession;->W(Landroid/content/Context;I)V

    .line 51
    .line 52
    .line 53
    :cond_34
    :goto_34
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method

.method public g(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lcom/box/androidsdk/content/models/BoxSession;->K(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_12

    .line 6
    .line 7
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->mAuthInfo:Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 8
    .line 9
    invoke-static {v0, p1}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;->E(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->c0:Lcom/box/androidsdk/content/auth/BoxAuthentication$e;

    .line 13
    .line 14
    if-eqz v0, :cond_12

    .line 15
    .line 16
    invoke-interface {v0, p1}, Lcom/box/androidsdk/content/auth/BoxAuthentication$e;->g(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;)V

    .line 17
    .line 18
    .line 19
    :cond_12
    return-void
    .line 20
    .line 21
    .line 22
.end method

.method public h(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lcom/box/androidsdk/content/models/BoxSession;->K(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_c

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/box/androidsdk/content/models/BoxSession;->G()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_29

    .line 12
    .line 13
    :cond_c
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->mAuthInfo:Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 14
    .line 15
    invoke-static {v0, p1}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;->E(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;->K()Lcom/box/androidsdk/content/models/BoxUser;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_22

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;->K()Lcom/box/androidsdk/content/models/BoxUser;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lcom/box/androidsdk/content/models/BoxEntity;->G()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p0, v0}, Lcom/box/androidsdk/content/models/BoxSession;->S(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_22
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->c0:Lcom/box/androidsdk/content/auth/BoxAuthentication$e;

    .line 36
    .line 37
    if-eqz v0, :cond_29

    .line 38
    .line 39
    invoke-interface {v0, p1}, Lcom/box/androidsdk/content/auth/BoxAuthentication$e;->h(Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;)V

    .line 40
    .line 41
    .line 42
    :cond_29
    return-void
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public l(Landroid/content/Context;)Lax/E3/h;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lax/E3/h<",
            "Lcom/box/androidsdk/content/models/BoxSession;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/box/androidsdk/content/models/BoxSession;->n(Landroid/content/Context;Lax/E3/h$b;)Lax/E3/h;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
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
    .line 22
.end method

.method public n(Landroid/content/Context;Lax/E3/h$b;)Lax/E3/h;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lax/E3/h$b<",
            "Lcom/box/androidsdk/content/models/BoxSession;",
            ">;)",
            "Lax/E3/h<",
            "Lcom/box/androidsdk/content/models/BoxSession;",
            ">;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_a

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iput-object p1, p0, Lcom/box/androidsdk/content/models/BoxSession;->q:Landroid/content/Context;

    .line 8
    .line 9
    sput-object p1, Lax/E3/g;->i:Landroid/content/Context;

    .line 10
    .line 11
    :cond_a
    iget-object p1, p0, Lcom/box/androidsdk/content/models/BoxSession;->mLastAuthCreationTaskId:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/box/androidsdk/content/utils/SdkUtils;->k(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_2f

    .line 18
    .line 19
    sget-object p1, Lcom/box/androidsdk/content/models/BoxSession;->e0:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 20
    .line 21
    instance-of v0, p1, Lax/H3/g;

    .line 22
    .line 23
    if-eqz v0, :cond_2f

    .line 24
    .line 25
    check-cast p1, Lax/H3/g;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->mLastAuthCreationTaskId:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lax/H3/g;->a(Ljava/lang/String;)Ljava/lang/Runnable;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    instance-of v0, p1, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest$b;

    .line 34
    .line 35
    if-eqz v0, :cond_2f

    .line 36
    .line 37
    check-cast p1, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest$b;

    .line 38
    .line 39
    if-eqz p2, :cond_2b

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Lax/E3/h;->a(Lax/E3/h$b;)Lax/E3/h;

    .line 42
    .line 43
    .line 44
    :cond_2b
    invoke-virtual {p1}, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest$b;->b()V

    .line 45
    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_2f
    new-instance p1, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;

    .line 49
    .line 50
    iget-boolean v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->mEnableBoxAppAuthentication:Z

    .line 51
    .line 52
    invoke-direct {p1, p0, v0}, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;-><init>(Lcom/box/androidsdk/content/models/BoxSession;Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/box/androidsdk/content/models/BoxSession$BoxSessionAuthCreationRequest;->D()Lax/E3/h;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-eqz p2, :cond_3f

    .line 60
    .line 61
    invoke-virtual {p1, p2}, Lax/E3/h;->a(Lax/E3/h$b;)Lax/E3/h;

    .line 62
    .line 63
    .line 64
    :cond_3f
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    iput-object p2, p0, Lcom/box/androidsdk/content/models/BoxSession;->mLastAuthCreationTaskId:Ljava/lang/String;

    .line 69
    .line 70
    sget-object p2, Lcom/box/androidsdk/content/models/BoxSession;->e0:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 71
    .line 72
    invoke-virtual {p2, p1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 73
    .line 74
    .line 75
    return-object p1
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method

.method public q()Landroid/content/Context;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->q:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
    .line 4
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

.method public r()Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->mAuthInfo:Lcom/box/androidsdk/content/auth/BoxAuthentication$BoxAuthenticationInfo;

    .line 2
    .line 3
    return-object v0
    .line 4
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

.method public s()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->mAccountEmail:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
    .line 4
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

.method public t()Ljava/io/File;
    .registers 4

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/box/androidsdk/content/models/BoxSession;->q()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, Lcom/box/androidsdk/content/models/BoxSession;->G()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
.end method

.method public u()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->mClientId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
    .line 4
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

.method public w()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->mClientSecret:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
    .line 4
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

.method public x()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->mDeviceId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
    .line 4
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

.method public y()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->mDeviceName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
    .line 4
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

.method public z()Lcom/box/androidsdk/content/models/BoxMDMData;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxSession;->mMDMData:Lcom/box/androidsdk/content/models/BoxMDMData;

    .line 2
    .line 3
    return-object v0
    .line 4
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
