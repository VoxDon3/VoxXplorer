.class public Lax/U3/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/U3/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Data:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lax/M3/h;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lax/M3/h;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lax/N3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/N3/b<",
            "TData;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lax/M3/h;Lax/N3/b;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/M3/h;",
            "Lax/N3/b<",
            "TData;>;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {p0, p1, v0, p2}, Lax/U3/m$a;-><init>(Lax/M3/h;Ljava/util/List;Lax/N3/b;)V

    return-void
.end method

.method public constructor <init>(Lax/M3/h;Ljava/util/List;Lax/N3/b;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/M3/h;",
            "Ljava/util/List<",
            "Lax/M3/h;",
            ">;",
            "Lax/N3/b<",
            "TData;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lax/k4/h;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lax/M3/h;

    iput-object p1, p0, Lax/U3/m$a;->a:Lax/M3/h;

    .line 4
    invoke-static {p2}, Lax/k4/h;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lax/U3/m$a;->b:Ljava/util/List;

    .line 5
    invoke-static {p3}, Lax/k4/h;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lax/N3/b;

    iput-object p1, p0, Lax/U3/m$a;->c:Lax/N3/b;

    return-void
.end method
