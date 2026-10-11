.class final Lax/a1/H$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/a1/B$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/a1/H;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lax/a1/H;


# direct methods
.method private constructor <init>(Lax/a1/H;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a1/H$c;->a:Lax/a1/H;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lax/a1/H;Lax/a1/H$a;)V
    .registers 3

    .line 2
    invoke-direct {p0, p1}, Lax/a1/H$c;-><init>(Lax/a1/H;)V

    return-void
.end method


# virtual methods
.method public a(J)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/a1/H$c;->a:Lax/a1/H;

    .line 2
    .line 3
    invoke-static {v0}, Lax/a1/H;->j0(Lax/a1/H;)Lax/a1/z$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1, p2}, Lax/a1/z$a;->x(J)V

    .line 8
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

.method public b(Lax/a1/B$a;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a1/H$c;->a:Lax/a1/H;

    .line 2
    .line 3
    invoke-static {v0}, Lax/a1/H;->j0(Lax/a1/H;)Lax/a1/z$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lax/a1/z$a;->r(Lax/a1/B$a;)V

    .line 8
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

.method public c(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a1/H$c;->a:Lax/a1/H;

    .line 2
    .line 3
    invoke-static {v0}, Lax/a1/H;->j0(Lax/a1/H;)Lax/a1/z$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lax/a1/z$a;->o(I)V

    .line 8
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

.method public d()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a1/H$c;->a:Lax/a1/H;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lax/a1/H;->i0(Lax/a1/H;Z)Z

    .line 5
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
.end method

.method public e(Z)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a1/H$c;->a:Lax/a1/H;

    .line 2
    .line 3
    invoke-static {v0}, Lax/a1/H;->j0(Lax/a1/H;)Lax/a1/z$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lax/a1/z$a;->y(Z)V

    .line 8
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

.method public f(Ljava/lang/Exception;)V
    .registers 4

    .line 1
    const-string v0, "DecoderAudioRenderer"

    .line 2
    .line 3
    const-string v1, "Audio sink error"

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lax/S0/u;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lax/a1/H$c;->a:Lax/a1/H;

    .line 9
    .line 10
    invoke-static {v0}, Lax/a1/H;->j0(Lax/a1/H;)Lax/a1/z$a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p1}, Lax/a1/z$a;->p(Ljava/lang/Exception;)V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public g(Lax/a1/B$a;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/a1/H$c;->a:Lax/a1/H;

    .line 2
    .line 3
    invoke-static {v0}, Lax/a1/H;->j0(Lax/a1/H;)Lax/a1/z$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lax/a1/z$a;->q(Lax/a1/B$a;)V

    .line 8
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

.method public synthetic h()V
    .registers 1

    .line 1
    invoke-static {p0}, Lax/a1/C;->b(Lax/a1/B$d;)V

    return-void
.end method

.method public i(IJJ)V
    .registers 13

    .line 1
    iget-object v0, p0, Lax/a1/H$c;->a:Lax/a1/H;

    .line 2
    .line 3
    invoke-static {v0}, Lax/a1/H;->j0(Lax/a1/H;)Lax/a1/z$a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move v2, p1

    .line 8
    move-wide v3, p2

    .line 9
    move-wide v5, p4

    .line 10
    invoke-virtual/range {v1 .. v6}, Lax/a1/z$a;->z(IJJ)V

    .line 11
    .line 12
    .line 13
    return-void
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
.end method

.method public j()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/a1/H$c;->a:Lax/a1/H;

    .line 2
    .line 3
    invoke-static {v0}, Lax/a1/H;->k0(Lax/a1/H;)V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public k()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/a1/H$c;->a:Lax/a1/H;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/a1/H;->v0()V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public synthetic l()V
    .registers 1

    .line 1
    invoke-static {p0}, Lax/a1/C;->a(Lax/a1/B$d;)V

    return-void
.end method
