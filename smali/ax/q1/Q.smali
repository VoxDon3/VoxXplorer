.class public final Lax/q1/Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q1/N;


# instance fields
.field private final a:J

.field private final b:J


# direct methods
.method public constructor <init>(J)V
    .registers 5

    const-wide/16 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0, v1}, Lax/q1/Q;-><init>(JJ)V

    return-void
.end method

.method public constructor <init>(JJ)V
    .registers 5

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lax/q1/Q;->a:J

    .line 4
    iput-wide p3, p0, Lax/q1/Q;->b:J

    return-void
.end method


# virtual methods
.method public i()Z
    .registers 2

    .line 1
    const/4 v0, 0x1

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
    .registers 7

    .line 1
    new-instance v0, Lax/q1/N$a;

    .line 2
    .line 3
    new-instance v1, Lax/q1/O;

    .line 4
    .line 5
    iget-wide v2, p0, Lax/q1/Q;->b:J

    .line 6
    .line 7
    invoke-direct {v1, p1, p2, v2, v3}, Lax/q1/O;-><init>(JJ)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lax/q1/N$a;-><init>(Lax/q1/O;)V

    .line 11
    .line 12
    .line 13
    return-object v0
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
    iget-wide v0, p0, Lax/q1/Q;->a:J

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
