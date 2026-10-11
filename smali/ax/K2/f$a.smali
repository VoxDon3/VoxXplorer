.class Lax/K2/f$a;
.super Lax/k2/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/K2/f;-><init>(Lax/k2/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/k2/i<",
        "Lax/K2/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic d:Lax/K2/f;


# direct methods
.method constructor <init>(Lax/K2/f;Lax/k2/u;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/K2/f$a;->d:Lax/K2/f;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lax/k2/i;-><init>(Lax/k2/u;)V

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
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .registers 2

    .line 1
    const-string v0, "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)"

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

.method public bridge synthetic i(Lax/o2/k;Ljava/lang/Object;)V
    .registers 3

    .line 1
    check-cast p2, Lax/K2/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lax/K2/f$a;->k(Lax/o2/k;Lax/K2/d;)V

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
.end method

.method public k(Lax/o2/k;Lax/K2/d;)V
    .registers 7

    .line 1
    invoke-virtual {p2}, Lax/K2/d;->a()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_b

    .line 7
    .line 8
    invoke-interface {p1, v1}, Lax/o2/i;->t0(I)V

    .line 9
    .line 10
    .line 11
    goto :goto_12

    .line 12
    :cond_b
    invoke-virtual {p2}, Lax/K2/d;->a()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {p1, v1, v0}, Lax/o2/i;->D(ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :goto_12
    invoke-virtual {p2}, Lax/K2/d;->b()Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x2

    .line 24
    if-nez v0, :cond_1d

    .line 25
    .line 26
    invoke-interface {p1, v1}, Lax/o2/i;->t0(I)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1d
    invoke-virtual {p2}, Lax/K2/d;->b()Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    invoke-interface {p1, v1, v2, v3}, Lax/o2/i;->X(IJ)V

    .line 39
    .line 40
    .line 41
    return-void
.end method
