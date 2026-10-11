.class public Lax/q1/N$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q1/N;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/q1/N;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:J

.field private final b:Lax/q1/N$a;


# direct methods
.method public constructor <init>(J)V
    .registers 5

    const-wide/16 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0, v1}, Lax/q1/N$b;-><init>(JJ)V

    return-void
.end method

.method public constructor <init>(JJ)V
    .registers 7

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lax/q1/N$b;->a:J

    .line 4
    new-instance p1, Lax/q1/N$a;

    const-wide/16 v0, 0x0

    cmp-long p2, p3, v0

    if-nez p2, :cond_10

    .line 5
    sget-object p2, Lax/q1/O;->c:Lax/q1/O;

    goto :goto_15

    :cond_10
    new-instance p2, Lax/q1/O;

    invoke-direct {p2, v0, v1, p3, p4}, Lax/q1/O;-><init>(JJ)V

    :goto_15
    invoke-direct {p1, p2}, Lax/q1/N$a;-><init>(Lax/q1/O;)V

    iput-object p1, p0, Lax/q1/N$b;->b:Lax/q1/N$a;

    return-void
.end method


# virtual methods
.method public i()Z
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
    .line 3
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

.method public l(J)Lax/q1/N$a;
    .registers 3

    .line 1
    iget-object p1, p0, Lax/q1/N$b;->b:Lax/q1/N$a;

    .line 2
    .line 3
    return-object p1
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

.method public n()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lax/q1/N$b;->a:J

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
