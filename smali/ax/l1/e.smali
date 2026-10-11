.class public final synthetic Lax/l1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/l1/n$j$a;


# instance fields
.field public final synthetic a:Lax/l1/n$e;


# direct methods
.method public synthetic constructor <init>(Lax/l1/n$e;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/l1/e;->a:Lax/l1/n$e;

    return-void
.end method


# virtual methods
.method public final a(ILax/P0/P;[I)Ljava/util/List;
    .registers 5

    .line 1
    iget-object v0, p0, Lax/l1/e;->a:Lax/l1/n$e;

    invoke-static {v0, p1, p2, p3}, Lax/l1/n;->t(Lax/l1/n$e;ILax/P0/P;[I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
