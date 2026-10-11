.class public final Lax/s4/b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/s4/b$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/net/Proxy;

.field private b:J

.field private c:J

.field private d:Ljavax/net/ssl/SSLSocketFactory;


# direct methods
.method private constructor <init>()V
    .registers 8

    .line 2
    sget-object v1, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    sget-wide v2, Lax/s4/a;->a:J

    sget-wide v4, Lax/s4/a;->b:J

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lax/s4/b$b$a;-><init>(Ljava/net/Proxy;JJLjavax/net/ssl/SSLSocketFactory;)V

    return-void
.end method

.method synthetic constructor <init>(Lax/s4/b$a;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lax/s4/b$b$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Ljava/net/Proxy;JJLjavax/net/ssl/SSLSocketFactory;)V
    .registers 7

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lax/s4/b$b$a;->a:Ljava/net/Proxy;

    .line 5
    iput-wide p2, p0, Lax/s4/b$b$a;->b:J

    .line 6
    iput-wide p4, p0, Lax/s4/b$b$a;->c:J

    .line 7
    iput-object p6, p0, Lax/s4/b$b$a;->d:Ljavax/net/ssl/SSLSocketFactory;

    return-void
.end method


# virtual methods
.method public a()Lax/s4/b$b;
    .registers 9

    .line 1
    new-instance v0, Lax/s4/b$b;

    .line 2
    .line 3
    iget-object v1, p0, Lax/s4/b$b$a;->a:Ljava/net/Proxy;

    .line 4
    .line 5
    iget-wide v2, p0, Lax/s4/b$b$a;->b:J

    .line 6
    .line 7
    iget-wide v4, p0, Lax/s4/b$b$a;->c:J

    .line 8
    .line 9
    iget-object v6, p0, Lax/s4/b$b$a;->d:Ljavax/net/ssl/SSLSocketFactory;

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    invoke-direct/range {v0 .. v7}, Lax/s4/b$b;-><init>(Ljava/net/Proxy;JJLjavax/net/ssl/SSLSocketFactory;Lax/s4/b$a;)V

    .line 13
    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
