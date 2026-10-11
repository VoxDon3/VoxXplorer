.class public final Lax/Y0/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/Y0/S;


# instance fields
.field private c0:Z

.field private d0:J

.field private e0:J

.field private f0:Lax/P0/G;

.field private final q:Lax/S0/h;


# direct methods
.method public constructor <init>(Lax/S0/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/Y0/a0;->q:Lax/S0/h;

    .line 5
    .line 6
    sget-object p1, Lax/P0/G;->d:Lax/P0/G;

    .line 7
    .line 8
    iput-object p1, p0, Lax/Y0/a0;->f0:Lax/P0/G;

    .line 9
    .line 10
    return-void
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
.method public a(J)V
    .registers 3

    .line 1
    iput-wide p1, p0, Lax/Y0/a0;->d0:J

    .line 2
    .line 3
    iget-boolean p1, p0, Lax/Y0/a0;->c0:Z

    .line 4
    .line 5
    if-eqz p1, :cond_e

    .line 6
    .line 7
    iget-object p1, p0, Lax/Y0/a0;->q:Lax/S0/h;

    .line 8
    .line 9
    invoke-interface {p1}, Lax/S0/h;->b()J

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    iput-wide p1, p0, Lax/Y0/a0;->e0:J

    .line 14
    .line 15
    :cond_e
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public b()V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/Y0/a0;->c0:Z

    .line 2
    .line 3
    if-nez v0, :cond_f

    .line 4
    .line 5
    iget-object v0, p0, Lax/Y0/a0;->q:Lax/S0/h;

    .line 6
    .line 7
    invoke-interface {v0}, Lax/S0/h;->b()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iput-wide v0, p0, Lax/Y0/a0;->e0:J

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lax/Y0/a0;->c0:Z

    .line 15
    .line 16
    :cond_f
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public c()V
    .registers 3

    .line 1
    iget-boolean v0, p0, Lax/Y0/a0;->c0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_e

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/Y0/a0;->w()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-virtual {p0, v0, v1}, Lax/Y0/a0;->a(J)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, Lax/Y0/a0;->c0:Z

    .line 14
    .line 15
    :cond_e
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public e(Lax/P0/G;)V
    .registers 4

    .line 1
    iget-boolean v0, p0, Lax/Y0/a0;->c0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_b

    .line 4
    .line 5
    invoke-virtual {p0}, Lax/Y0/a0;->w()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-virtual {p0, v0, v1}, Lax/Y0/a0;->a(J)V

    .line 10
    .line 11
    .line 12
    :cond_b
    iput-object p1, p0, Lax/Y0/a0;->f0:Lax/P0/G;

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
    .line 22
.end method

.method public h()Lax/P0/G;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Y0/a0;->f0:Lax/P0/G;

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

.method public w()J
    .registers 8

    .line 1
    iget-wide v0, p0, Lax/Y0/a0;->d0:J

    .line 2
    .line 3
    iget-boolean v2, p0, Lax/Y0/a0;->c0:Z

    .line 4
    .line 5
    if-eqz v2, :cond_24

    .line 6
    .line 7
    iget-object v2, p0, Lax/Y0/a0;->q:Lax/S0/h;

    .line 8
    .line 9
    invoke-interface {v2}, Lax/S0/h;->b()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    iget-wide v4, p0, Lax/Y0/a0;->e0:J

    .line 14
    .line 15
    sub-long/2addr v2, v4

    .line 16
    iget-object v4, p0, Lax/Y0/a0;->f0:Lax/P0/G;

    .line 17
    .line 18
    iget v5, v4, Lax/P0/G;->a:F

    .line 19
    .line 20
    const/high16 v6, 0x3f800000    # 1.0f

    .line 21
    .line 22
    cmpl-float v5, v5, v6

    .line 23
    .line 24
    if-nez v5, :cond_1f

    .line 25
    .line 26
    invoke-static {v2, v3}, Lax/S0/d0;->a1(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    :goto_1d
    add-long/2addr v0, v2

    .line 31
    return-wide v0

    .line 32
    :cond_1f
    invoke-virtual {v4, v2, v3}, Lax/P0/G;->a(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    goto :goto_1d

    .line 37
    :cond_24
    return-wide v0
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method

.method public synthetic z()Z
    .registers 2

    .line 1
    invoke-static {p0}, Lax/Y0/Q;->a(Lax/Y0/S;)Z

    move-result v0

    return v0
.end method
