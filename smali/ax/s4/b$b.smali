.class public final Lax/s4/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/s4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/s4/b$b$a;
    }
.end annotation


# static fields
.field public static final e:Lax/s4/b$b;


# instance fields
.field private final a:Ljava/net/Proxy;

.field private final b:J

.field private final c:J

.field private final d:Ljavax/net/ssl/SSLSocketFactory;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    invoke-static {}, Lax/s4/b$b;->a()Lax/s4/b$b$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lax/s4/b$b$a;->a()Lax/s4/b$b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lax/s4/b$b;->e:Lax/s4/b$b;

    .line 10
    .line 11
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
.end method

.method private constructor <init>(Ljava/net/Proxy;JJLjavax/net/ssl/SSLSocketFactory;)V
    .registers 7

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lax/s4/b$b;->a:Ljava/net/Proxy;

    .line 4
    iput-wide p2, p0, Lax/s4/b$b;->b:J

    .line 5
    iput-wide p4, p0, Lax/s4/b$b;->c:J

    .line 6
    iput-object p6, p0, Lax/s4/b$b;->d:Ljavax/net/ssl/SSLSocketFactory;

    return-void
.end method

.method synthetic constructor <init>(Ljava/net/Proxy;JJLjavax/net/ssl/SSLSocketFactory;Lax/s4/b$a;)V
    .registers 8

    .line 1
    invoke-direct/range {p0 .. p6}, Lax/s4/b$b;-><init>(Ljava/net/Proxy;JJLjavax/net/ssl/SSLSocketFactory;)V

    return-void
.end method

.method public static a()Lax/s4/b$b$a;
    .registers 2

    .line 1
    new-instance v0, Lax/s4/b$b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lax/s4/b$b$a;-><init>(Lax/s4/b$a;)V

    .line 5
    .line 6
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


# virtual methods
.method public b()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/s4/b$b;->b:J

    .line 2
    .line 3
    return-wide v0
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

.method public c()Ljava/net/Proxy;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/s4/b$b;->a:Ljava/net/Proxy;

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

.method public d()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/s4/b$b;->c:J

    .line 2
    .line 3
    return-wide v0
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

.method public e()Ljavax/net/ssl/SSLSocketFactory;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/s4/b$b;->d:Ljavax/net/ssl/SSLSocketFactory;

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
