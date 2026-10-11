.class public Lax/G4/A0;
.super Lax/p4/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/p4/o<",
        "Ljava/lang/Void;",
        "Lax/G4/y0;",
        "Lax/G4/z0;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lax/s4/a$c;Ljava/lang/String;)V
    .registers 5

    .line 1
    invoke-static {}, Lax/v4/d;->j()Lax/v4/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lax/G4/y0$b;->b:Lax/G4/y0$b;

    .line 6
    .line 7
    invoke-direct {p0, p1, v0, v1, p2}, Lax/p4/o;-><init>(Lax/s4/a$c;Lax/v4/c;Lax/v4/c;Ljava/lang/String;)V

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
.method protected bridge synthetic c(Lax/p4/p;)Lax/p4/f;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lax/G4/A0;->g(Lax/p4/p;)Lax/G4/z0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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

.method protected g(Lax/p4/p;)Lax/G4/z0;
    .registers 6

    .line 1
    new-instance v0, Lax/G4/z0;

    .line 2
    .line 3
    invoke-virtual {p1}, Lax/p4/p;->e()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p1}, Lax/p4/p;->f()Lax/p4/s;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {p1}, Lax/p4/p;->d()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lax/G4/y0;

    .line 16
    .line 17
    const-string v3, "2/files/upload_session/append_v2"

    .line 18
    .line 19
    invoke-direct {v0, v3, v1, v2, p1}, Lax/G4/z0;-><init>(Ljava/lang/String;Ljava/lang/String;Lax/p4/s;Lax/G4/y0;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method
