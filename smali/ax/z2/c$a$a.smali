.class final Lax/z2/c$a$a;
.super Lax/Gb/m;
.source "SourceFile"

# interfaces
.implements Lax/Fb/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/z2/c$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/Gb/m;",
        "Lax/Fb/l<",
        "Lax/z2/c;",
        "Lax/z2/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final q:Lax/z2/c$a$a;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    new-instance v0, Lax/z2/c$a$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lax/z2/c$a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lax/z2/c$a$a;->q:Lax/z2/c$a$a;

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

.method constructor <init>()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lax/Gb/m;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
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


# virtual methods
.method public final a(Lax/z2/c;)Lax/z2/c;
    .registers 3

    .line 1
    const-string v0, "it"

    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, Lax/z2/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lax/z2/c$a$a;->a(Lax/z2/c;)Lax/z2/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
