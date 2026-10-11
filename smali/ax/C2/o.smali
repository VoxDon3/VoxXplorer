.class public Lax/C2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/B2/l;


# instance fields
.field private final c:Lax/G0/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/G0/l<",
            "Lax/B2/l$b;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lax/M2/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/M2/c<",
            "Lax/B2/l$b$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lax/G0/l;

    .line 5
    .line 6
    invoke-direct {v0}, Lax/G0/l;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/C2/o;->c:Lax/G0/l;

    .line 10
    .line 11
    invoke-static {}, Lax/M2/c;->t()Lax/M2/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lax/C2/o;->d:Lax/M2/c;

    .line 16
    .line 17
    sget-object v0, Lax/B2/l;->b:Lax/B2/l$b$b;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lax/C2/o;->a(Lax/B2/l$b;)V

    .line 20
    .line 21
    .line 22
    return-void
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
.end method


# virtual methods
.method public a(Lax/B2/l$b;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/C2/o;->c:Lax/G0/l;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/G0/l;->l(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lax/B2/l$b$c;

    .line 7
    .line 8
    if-eqz v0, :cond_11

    .line 9
    .line 10
    iget-object v0, p0, Lax/C2/o;->d:Lax/M2/c;

    .line 11
    .line 12
    check-cast p1, Lax/B2/l$b$c;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lax/M2/c;->p(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_11
    instance-of v0, p1, Lax/B2/l$b$a;

    .line 19
    .line 20
    if-eqz v0, :cond_20

    .line 21
    .line 22
    check-cast p1, Lax/B2/l$b$a;

    .line 23
    .line 24
    iget-object v0, p0, Lax/C2/o;->d:Lax/M2/c;

    .line 25
    .line 26
    invoke-virtual {p1}, Lax/B2/l$b$a;->a()Ljava/lang/Throwable;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {v0, p1}, Lax/M2/c;->q(Ljava/lang/Throwable;)Z

    .line 31
    .line 32
    .line 33
    :cond_20
    return-void
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
