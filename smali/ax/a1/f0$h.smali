.class final Lax/a1/f0$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/a1/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "h"
.end annotation


# instance fields
.field public final a:Lax/P0/v;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:Lax/Q0/n;

.field public final j:Z

.field public final k:Z

.field public final l:Z


# direct methods
.method public constructor <init>(Lax/P0/v;IIIIIIILax/Q0/n;ZZZ)V
    .registers 13

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/a1/f0$h;->a:Lax/P0/v;

    .line 5
    .line 6
    iput p2, p0, Lax/a1/f0$h;->b:I

    .line 7
    .line 8
    iput p3, p0, Lax/a1/f0$h;->c:I

    .line 9
    .line 10
    iput p4, p0, Lax/a1/f0$h;->d:I

    .line 11
    .line 12
    iput p5, p0, Lax/a1/f0$h;->e:I

    .line 13
    .line 14
    iput p6, p0, Lax/a1/f0$h;->f:I

    .line 15
    .line 16
    iput p7, p0, Lax/a1/f0$h;->g:I

    .line 17
    .line 18
    iput p8, p0, Lax/a1/f0$h;->h:I

    .line 19
    .line 20
    iput-object p9, p0, Lax/a1/f0$h;->i:Lax/Q0/n;

    .line 21
    .line 22
    iput-boolean p10, p0, Lax/a1/f0$h;->j:Z

    .line 23
    .line 24
    iput-boolean p11, p0, Lax/a1/f0$h;->k:Z

    .line 25
    .line 26
    iput-boolean p12, p0, Lax/a1/f0$h;->l:Z

    .line 27
    .line 28
    return-void
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


# virtual methods
.method public a()Lax/a1/B$a;
    .registers 8

    .line 1
    new-instance v0, Lax/a1/B$a;

    .line 2
    .line 3
    iget v1, p0, Lax/a1/f0$h;->g:I

    .line 4
    .line 5
    iget v2, p0, Lax/a1/f0$h;->e:I

    .line 6
    .line 7
    iget v3, p0, Lax/a1/f0$h;->f:I

    .line 8
    .line 9
    iget-boolean v4, p0, Lax/a1/f0$h;->l:Z

    .line 10
    .line 11
    iget v5, p0, Lax/a1/f0$h;->c:I

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    if-ne v5, v6, :cond_11

    .line 15
    .line 16
    const/4 v5, 0x1

    .line 17
    goto :goto_13

    .line 18
    :cond_11
    const/4 v6, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    :goto_13
    iget v6, p0, Lax/a1/f0$h;->h:I

    .line 21
    .line 22
    invoke-direct/range {v0 .. v6}, Lax/a1/B$a;-><init>(IIIZZI)V

    .line 23
    .line 24
    .line 25
    return-object v0
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

.method public b(Lax/a1/f0$h;)Z
    .registers 4

    .line 1
    iget v0, p1, Lax/a1/f0$h;->c:I

    .line 2
    .line 3
    iget v1, p0, Lax/a1/f0$h;->c:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_2c

    .line 6
    .line 7
    iget v0, p1, Lax/a1/f0$h;->g:I

    .line 8
    .line 9
    iget v1, p0, Lax/a1/f0$h;->g:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_2c

    .line 12
    .line 13
    iget v0, p1, Lax/a1/f0$h;->e:I

    .line 14
    .line 15
    iget v1, p0, Lax/a1/f0$h;->e:I

    .line 16
    .line 17
    if-ne v0, v1, :cond_2c

    .line 18
    .line 19
    iget v0, p1, Lax/a1/f0$h;->f:I

    .line 20
    .line 21
    iget v1, p0, Lax/a1/f0$h;->f:I

    .line 22
    .line 23
    if-ne v0, v1, :cond_2c

    .line 24
    .line 25
    iget v0, p1, Lax/a1/f0$h;->d:I

    .line 26
    .line 27
    iget v1, p0, Lax/a1/f0$h;->d:I

    .line 28
    .line 29
    if-ne v0, v1, :cond_2c

    .line 30
    .line 31
    iget-boolean v0, p1, Lax/a1/f0$h;->j:Z

    .line 32
    .line 33
    iget-boolean v1, p0, Lax/a1/f0$h;->j:Z

    .line 34
    .line 35
    if-ne v0, v1, :cond_2c

    .line 36
    .line 37
    iget-boolean p1, p1, Lax/a1/f0$h;->k:Z

    .line 38
    .line 39
    iget-boolean v0, p0, Lax/a1/f0$h;->k:Z

    .line 40
    .line 41
    if-ne p1, v0, :cond_2c

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    return p1

    .line 45
    :cond_2c
    const/4 p1, 0x0

    .line 46
    return p1
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

.method public c(I)Lax/a1/f0$h;
    .registers 15

    .line 1
    new-instance v0, Lax/a1/f0$h;

    .line 2
    .line 3
    iget-object v1, p0, Lax/a1/f0$h;->a:Lax/P0/v;

    .line 4
    .line 5
    iget v2, p0, Lax/a1/f0$h;->b:I

    .line 6
    .line 7
    iget v3, p0, Lax/a1/f0$h;->c:I

    .line 8
    .line 9
    iget v4, p0, Lax/a1/f0$h;->d:I

    .line 10
    .line 11
    iget v5, p0, Lax/a1/f0$h;->e:I

    .line 12
    .line 13
    iget v6, p0, Lax/a1/f0$h;->f:I

    .line 14
    .line 15
    iget v7, p0, Lax/a1/f0$h;->g:I

    .line 16
    .line 17
    iget-object v9, p0, Lax/a1/f0$h;->i:Lax/Q0/n;

    .line 18
    .line 19
    iget-boolean v10, p0, Lax/a1/f0$h;->j:Z

    .line 20
    .line 21
    iget-boolean v11, p0, Lax/a1/f0$h;->k:Z

    .line 22
    .line 23
    iget-boolean v12, p0, Lax/a1/f0$h;->l:Z

    .line 24
    .line 25
    move v8, p1

    .line 26
    invoke-direct/range {v0 .. v12}, Lax/a1/f0$h;-><init>(Lax/P0/v;IIIIIIILax/Q0/n;ZZZ)V

    .line 27
    .line 28
    .line 29
    return-object v0
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

.method public d(J)J
    .registers 4

    .line 1
    iget v0, p0, Lax/a1/f0$h;->e:I

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, Lax/S0/d0;->o1(JI)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
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

.method public e(J)J
    .registers 4

    .line 1
    iget-object v0, p0, Lax/a1/f0$h;->a:Lax/P0/v;

    .line 2
    .line 3
    iget v0, v0, Lax/P0/v;->H:I

    .line 4
    .line 5
    invoke-static {p1, p2, v0}, Lax/S0/d0;->o1(JI)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    return-wide p1
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

.method public f()Z
    .registers 3

    .line 1
    iget v0, p0, Lax/a1/f0$h;->c:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    const/4 v0, 0x0

    .line 8
    return v0
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
