.class public Lax/a1/f0$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/Q0/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/a1/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation


# instance fields
.field private final a:[Lax/Q0/o;

.field private final b:Lax/a1/F0;

.field private final c:Lax/Q0/s;


# direct methods
.method public varargs constructor <init>([Lax/Q0/o;)V
    .registers 4

    .line 1
    new-instance v0, Lax/a1/F0;

    invoke-direct {v0}, Lax/a1/F0;-><init>()V

    new-instance v1, Lax/Q0/s;

    invoke-direct {v1}, Lax/Q0/s;-><init>()V

    invoke-direct {p0, p1, v0, v1}, Lax/a1/f0$i;-><init>([Lax/Q0/o;Lax/a1/F0;Lax/Q0/s;)V

    return-void
.end method

.method public constructor <init>([Lax/Q0/o;Lax/a1/F0;Lax/Q0/s;)V
    .registers 7

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    array-length v0, p1

    add-int/lit8 v0, v0, 0x2

    new-array v0, v0, [Lax/Q0/o;

    iput-object v0, p0, Lax/a1/f0$i;->a:[Lax/Q0/o;

    const/4 v1, 0x0

    .line 4
    array-length v2, p1

    invoke-static {p1, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5
    iput-object p2, p0, Lax/a1/f0$i;->b:Lax/a1/F0;

    .line 6
    iput-object p3, p0, Lax/a1/f0$i;->c:Lax/Q0/s;

    .line 7
    array-length v1, p1

    aput-object p2, v0, v1

    .line 8
    array-length p1, p1

    add-int/lit8 p1, p1, 0x1

    aput-object p3, v0, p1

    return-void
.end method


# virtual methods
.method public a(J)J
    .registers 4

    .line 1
    iget-object v0, p0, Lax/a1/f0$i;->c:Lax/Q0/s;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/Q0/s;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_e

    .line 8
    .line 9
    iget-object v0, p0, Lax/a1/f0$i;->c:Lax/Q0/s;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Lax/Q0/s;->i(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide p1

    .line 15
    :cond_e
    return-wide p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public b(Lax/P0/G;)Lax/P0/G;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/a1/f0$i;->c:Lax/Q0/s;

    .line 2
    .line 3
    iget v1, p1, Lax/P0/G;->a:F

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lax/Q0/s;->k(F)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lax/a1/f0$i;->c:Lax/Q0/s;

    .line 9
    .line 10
    iget v1, p1, Lax/P0/G;->b:F

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lax/Q0/s;->j(F)V

    .line 13
    .line 14
    .line 15
    return-object p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public c()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a1/f0$i;->b:Lax/a1/F0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/a1/F0;->v()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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

.method public d(Z)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a1/f0$i;->b:Lax/a1/F0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/a1/F0;->E(Z)V

    .line 4
    .line 5
    .line 6
    return p1
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

.method public e()[Lax/Q0/o;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/a1/f0$i;->a:[Lax/Q0/o;

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
