.class public Lax/u4/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Lax/t4/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/t4/b<",
            "Lax/u4/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:J

.field private c:J

.field private d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/u4/d$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/u4/d$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/u4/d;->e:Lax/t4/b;

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

.method public constructor <init>(Ljava/lang/String;J)V
    .registers 5

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, p3, v0}, Lax/u4/d;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;)V
    .registers 5

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_12

    .line 3
    iput-object p1, p0, Lax/u4/d;->a:Ljava/lang/String;

    .line 4
    iput-wide p2, p0, Lax/u4/d;->b:J

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lax/u4/d;->c:J

    .line 6
    iput-object p4, p0, Lax/u4/d;->d:Ljava/lang/String;

    return-void

    .line 7
    :cond_12
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "access token can\'t be null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/u4/d;->a:Ljava/lang/String;

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

.method public b()Ljava/lang/Long;
    .registers 7

    .line 1
    iget-wide v0, p0, Lax/u4/d;->c:J

    .line 2
    .line 3
    iget-wide v2, p0, Lax/u4/d;->b:J

    .line 4
    .line 5
    const-wide/16 v4, 0x3e8

    .line 6
    .line 7
    mul-long v2, v2, v4

    .line 8
    .line 9
    add-long/2addr v0, v2

    .line 10
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
