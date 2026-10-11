.class final Landroidx/lifecycle/m$d;
.super Lax/Gb/m;
.source "SourceFile"

# interfaces
.implements Lax/Fb/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/m;->e(Lax/G0/v;)Lax/G0/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/Gb/m;",
        "Lax/Fb/l<",
        "Lax/I0/a;",
        "Lax/G0/r;",
        ">;"
    }
.end annotation


# static fields
.field public static final q:Landroidx/lifecycle/m$d;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Landroidx/lifecycle/m$d;

    invoke-direct {v0}, Landroidx/lifecycle/m$d;-><init>()V

    sput-object v0, Landroidx/lifecycle/m$d;->q:Landroidx/lifecycle/m$d;

    return-void
.end method

.method constructor <init>()V
    .registers 2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lax/Gb/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lax/I0/a;)Lax/G0/r;
    .registers 3

    .line 1
    const-string v0, "$this$initializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/Gb/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lax/G0/r;

    .line 7
    .line 8
    invoke-direct {p1}, Lax/G0/r;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object p1
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

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, Lax/I0/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/lifecycle/m$d;->a(Lax/I0/a;)Lax/G0/r;

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
